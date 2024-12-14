package com.chikuwa_latte.core.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.flywaydb.core.Flyway;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@MapperScan(basePackages = "com.chikuwa_latte.core.mapper.db_transaction", sqlSessionFactoryRef = "sqlSessionFactoryTransaction")
@EnableJpaRepositories(
        basePackages = "com.chikuwa_latte.core.repository.db_transaction", // Transactionリポジトリのパッケージ
        entityManagerFactoryRef = "entityManagerFactoryTransaction",
        transactionManagerRef = "transactionManagerTransaction"
)
public class TransactionDataSourceConfiguration {
    // データソースの設定
    // // primaryがないとspingがどちらのデータソースを標準で使用するか判定できない
    // @Primary
    @Bean(name = "dbTransactionDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db-transaction")
    public DataSource dbTransactionDataSource() {
        return DataSourceBuilder.create().build();
    }
    
    // SqlSessionFactoryの設定 データソースが分かれている場合、その数だけ設定が必要
    @Bean(name = "sqlSessionFactoryTransaction")
    public SqlSessionFactory sqlSessionFactoryTransaction(@Qualifier("dbTransactionDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        // 他の設定があればここで設定
        return sessionFactory.getObject();
    }

    // Flywayの設定 migrationが両方のデータソースで使えるようにする
    @Bean
    public Flyway flywayDbTransaction(@Qualifier("dbTransactionDataSource") DataSource dbTransactionDataSource) {
        Flyway flyway = Flyway.configure()
            .dataSource(dbTransactionDataSource)
            .baselineOnMigrate(true)
            .locations("classpath:db/migration/db_transaction")
            .table("transaction_flyway_schema_history")
            .load();

        flyway.repair();
        flyway.migrate();
        return flyway;
    }

    // Master用のEntityManagerFactory
    @Bean(name = "entityManagerFactoryTransaction")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryTransaction(
            @Qualifier("dbTransactionDataSource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("com.chikuwa_latte.core.entity.db_transaction"); // Transactionエンティティのパッケージ
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaProperties(hibernateProperties()); // Hibernate プロパティを設定
        return em;
    }

    // Transaction用のトランザクションマネージャー
    @Bean(name = "transactionManagerTransaction")
    public PlatformTransactionManager transactionManagerTransaction(@Qualifier("entityManagerFactoryTransaction") EntityManagerFactory entityManagerFactory) {
    return new JpaTransactionManager(entityManagerFactory);
    }

    // Hibernateのプロパティ設定
    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.show_sql", "true");
        return properties;
    }
}

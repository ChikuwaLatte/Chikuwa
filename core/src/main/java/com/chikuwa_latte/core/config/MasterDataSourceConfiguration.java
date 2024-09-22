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
@MapperScan(basePackages = "com.chikuwa_latte.core.mapper.db_master", sqlSessionFactoryRef = "sqlSessionFactoryMaster")
@EnableJpaRepositories(
        basePackages = "com.chikuwa_latte.core.repository.db_master", // Masterリポジトリのパッケージ
        entityManagerFactoryRef = "entityManagerFactoryMaster",
        transactionManagerRef = "transactionManagerMaster"
)
public class MasterDataSourceConfiguration {
    // データソースの設定
    // // primaryがないとspingがどちらのデータソースを標準で使用するか判定できない
    // @Primary
    @Bean(name = "dbMasterDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db-master")
    public DataSource dbMasterDataSource() {
        return DataSourceBuilder.create().build();
    }
    
    // SqlSessionFactoryの設定 データソースが分かれている場合、その数だけ設定が必要
    @Bean(name = "sqlSessionFactoryMaster")
    public SqlSessionFactory sqlSessionFactoryMaster(@Qualifier("dbMasterDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        // 他の設定があればここで設定
        return sessionFactory.getObject();
    }

    // Flywayの設定 migrationが両方のデータソースで使えるようにする
    @Bean
    public Flyway flywayDbMaster(@Qualifier("dbMasterDataSource") DataSource dbMasterDataSource) {
        return Flyway.configure()
                .dataSource(dbMasterDataSource)
                .baselineOnMigrate(true)
                .locations("classpath:db/migration/db_master")
                .load();
    }

    // Master用のEntityManagerFactory
    @Bean(name = "entityManagerFactoryMaster")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryMaster(
            @Qualifier("dbMasterDataSource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("com.chikuwa_latte.core.entity.db_master"); // Masterエンティティのパッケージ
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaProperties(hibernateProperties()); // Hibernate プロパティを設定
        return em;
    }

    // Master用のトランザクションマネージャー
    @Bean(name = "transactionManagerMaster")
    public PlatformTransactionManager transactionManagerMaster(@Qualifier("entityManagerFactoryMaster") EntityManagerFactory entityManagerFactory) {
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
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
@MapperScan(basePackages = "com.chikuwa_latte.core.mapper.db_user", sqlSessionFactoryRef = "sqlSessionFactoryUser")
@EnableJpaRepositories(
        basePackages = "com.chikuwa_latte.core.repository.user", // Userリポジトリのパッケージ
        entityManagerFactoryRef = "entityManagerFactoryUser",
        transactionManagerRef = "transactionManagerUser"
)
public class UserDataSourceConfiguration {
    @Bean(name = "dbUserDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.db-user")
    public DataSource dbUserDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sqlSessionFactoryUser")
    public SqlSessionFactory sqlSessionFactoryUser(@Qualifier("dbUserDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        // 他の設定があればここで設定
        return sessionFactory.getObject();
    }

    @Bean
    public Flyway flywayDbUser(@Qualifier("dbUserDataSource") DataSource dbUserDataSource) {
        return Flyway.configure()
                .dataSource(dbUserDataSource)
                .baselineOnMigrate(true)
                .locations("classpath:db/migration/db_user")
                .load();
    }

    @Bean(name = "entityManagerFactoryUser")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryUser(
            @Qualifier("dbUserDataSource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("com.chikuwa_latte.core.entity.db_user");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaProperties(hibernateProperties());
        return em;
    }

    @Bean(name = "transactionManagerUser")
    public PlatformTransactionManager transactionManagerUser(
            @Qualifier("entityManagerFactoryUser") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.show_sql", "true");
        return properties;
    }
}

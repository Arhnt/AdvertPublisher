package com.zamaruev.advert.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Configuration file for persistent layer.
 * Configure embedded HSQLDB.
 */
@EnableJpaRepositories("com.zamaruev.advert.core.dao")
public class HsqldbRepositoryConfig {

    @Value("${jdbc.url}")
    private String jdbcUrl = "jdbc:hsqldb:file:advert.hsqldb";

    @Value("${jdbc.driver}")
    private String jdbcDriver = "org.hsqldb.jdbcDriver";

    @Value("${jdbc.user}")
    private String jdbcUser = "sa";

    @Value("${jdbc.password}")
    private String jdbcPassword = "";

    /**
     * Starts in-memory HSQL database
     */
    @Bean
    public DataSource dataSource() {
        // EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        // return builder.setName("advert").setType(EmbeddedDatabaseType.HSQL).build();

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(jdbcDriver);
        ds.setUrl(jdbcUrl);
        ds.setUsername(jdbcUser);
        ds.setPassword(jdbcPassword);
        return ds;
    }

    /**
     * Sets up a LocalContainerEntityManagerFactoryBean to use Hibernate.
     * Activates picking up entities from the project's base package.
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabase(Database.HSQL);
        vendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.zamaruev.advert");
        factory.setDataSource(dataSource());

        return factory;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return txManager;
    }

}

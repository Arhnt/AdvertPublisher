package com.zamaruev.advert.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * This is a main Configuration for application.
 * It enables Spring Component scan and load properties.
 */
@Configuration
@ComponentScan("com.zamaruev.advert")
@Import(HsqldbRepositoryConfig.class)
@PropertySource("classpath:application.properties")
public class AdvertPublisherConfig {

    /**
     * Read properties and allow to use them in @Value(${})
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}

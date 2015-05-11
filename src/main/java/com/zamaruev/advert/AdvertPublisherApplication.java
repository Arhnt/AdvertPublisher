package com.zamaruev.advert;

import com.zamaruev.advert.ui.main.MainFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.swing.*;
import java.awt.*;

@Configuration
@ComponentScan
// @PropertySource(value = "cl:${APP_CONFIG}/oe-notifications/oe-notifications.properties")
public class AdvertPublisherApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AdvertPublisherApplication.class);
        EventQueue.invokeLater(() -> {
            JFrame mainframe = new MainFrame();
            mainframe.setVisible(true);
        });
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}

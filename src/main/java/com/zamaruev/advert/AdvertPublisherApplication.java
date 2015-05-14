package com.zamaruev.advert;

import com.zamaruev.advert.config.AdvertPublisherConfig;
import com.zamaruev.advert.ui.main.MainFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.awt.*;


public class AdvertPublisherApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AdvertPublisherConfig.class);
        EventQueue.invokeLater(() -> {
            JFrame mainframe = new MainFrame();
            mainframe.setVisible(true);
        });
    }

}

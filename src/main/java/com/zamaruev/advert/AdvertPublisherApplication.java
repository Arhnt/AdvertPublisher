package com.zamaruev.advert;

import com.zamaruev.advert.ui.MainFrame;

import java.awt.*;

public class AdvertPublisherApplication {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame ex = new MainFrame();
                ex.setVisible(true);
            }
        });
    }
}

package com.zamaruev.advert;

import com.zamaruev.advert.ui.main.MainFrame;

import javax.swing.*;
import java.awt.*;

public class AdvertPublisherApplication {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame mainframe = new MainFrame();
            mainframe.setVisible(true);
        });
    }
}

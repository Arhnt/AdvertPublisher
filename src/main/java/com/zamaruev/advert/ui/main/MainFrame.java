package com.zamaruev.advert.ui.main;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Advert Publisher");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTable tbl = new JTable(new AdvertsTableModel());
        JScrollPane sp = new JScrollPane(tbl);
        this.getContentPane().add(sp, "Center");
    }
}

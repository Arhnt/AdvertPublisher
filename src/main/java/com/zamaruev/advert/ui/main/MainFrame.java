package com.zamaruev.advert.ui.main;

import com.zamaruev.advert.ui.table.ItemTableModel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JMenuBar menu;

    public MainFrame() {
        setTitle("Advert Publisher Application");
        // TODO-VZ: Use Properties API to restore previous location and position
        setSize(600, 400);
        addMenuBar();
        // TODO-VZ: addToolbar();
        addTableView();
    }

    private void addMenuBar() {
        menu = new JMenuBar();

        // TODO-VZ: Use actions
        JMenu file = new JMenu("File");
        file.add("New");
        file.add("Save").setEnabled(false);
        file.add("Close").setEnabled(false);
        file.addSeparator();
        file.add("Exit").addActionListener(a -> System.exit(0));
        menu.add(file);

        JMenu settings = new JMenu("Settings");
        menu.add(settings);

        setJMenuBar(menu);
    }

    private void addTableView() {
        JTable tableView = new JTable(new ItemTableModel());
        tableView.setAutoCreateRowSorter(true);
        JScrollPane scroll = new JScrollPane(tableView);
        add(scroll, BorderLayout.CENTER);
    }
}

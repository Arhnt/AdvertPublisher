package com.zamaruev.advert.ui.main;

import com.zamaruev.advert.ui.table.AdItemTableModel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JMenuBar menu;

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        file.add("Exit").addActionListener(a -> System.exit(0));
        menu.add(file);

        JMenu actions = new JMenu("Actions");
        actions.add("New");
        actions.add("Edit").setEnabled(false);
        actions.add("Save").setEnabled(false);
        actions.add("Close").setEnabled(false);
        actions.add("Publish").setEnabled(false);
        menu.add(actions);

        JMenu settings = new JMenu("Settings");
        settings.add("System");
        settings.add("Interface");
        settings.add("Resources");
        menu.add(settings);

        setJMenuBar(menu);
    }

    private void addTableView() {
        JTable tableView = new JTable(new AdItemTableModel());
        tableView.setAutoCreateRowSorter(true);
        JScrollPane scroll = new JScrollPane(tableView);
        add(scroll, BorderLayout.CENTER);
    }
}

package com.zamaruev.advert.ui.main;

import javax.swing.table.AbstractTableModel;

/**
 * Adverts Table Grid
 */
public class AdvertsTableModel extends AbstractTableModel {
    protected static final int COLUMN_COUNT = 4;
    protected String[] columnNames = {"Title", "Size", "Price", "Add Date"};
    protected Object data[][] = new Object[][]{{"123", "M", 1500, "qwe"}};

    public String getColumnName(int column) {
        return columnNames[column];
    }

    public int getRowCount() {
        return data.length;
    }

    public int getColumnCount() {
        return COLUMN_COUNT;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
}

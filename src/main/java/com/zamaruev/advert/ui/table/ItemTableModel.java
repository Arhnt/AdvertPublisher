package com.zamaruev.advert.ui.table;

import javax.swing.table.AbstractTableModel;
import java.util.*;

/**
 * Item table view model with random values.
 * Created by vzamaruiev on 03.05.2015.
 */
public class ItemTableModel extends AbstractTableModel {

    private final static String[] COLUMNS = new String[]{"#", "Title", "Price", "Size", "Gender", "Color"};
    private final static String[] SIZES = new String[]{"S", "M", "L", "XL"};
    private final static String[] GENDERS = new String[]{"Male", "Female", "Unisex"};
    private final static String[] COLORS = new String[]{"White", "Blue", "Green"};
    private Random random = new Random();
    private List<Map<String, Object>> items = new ArrayList<>();

    public ItemTableModel() {
        int itemsCount = random.nextInt(100);
        for (int i = 0; i < itemsCount; i++) {
            items.add(newRandomItem(i));
        }
        Collections.shuffle(items);
    }

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return items.get(rowIndex).get(COLUMNS[columnIndex]);
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNS[column];
    }

    private Map<String, Object> newRandomItem(int i) {
        Map<String, Object> item = new HashMap<>();
        item.put(COLUMNS[0], i);
        item.put(COLUMNS[1], "Random Item #" + i);
        item.put(COLUMNS[2], random.nextInt(1000) + " грн.");
        item.put(COLUMNS[3], SIZES[random.nextInt(SIZES.length)]);
        item.put(COLUMNS[4], GENDERS[random.nextInt(GENDERS.length)]);
        item.put(COLUMNS[5], COLORS[random.nextInt(COLORS.length)]);
        return item;
    }
}

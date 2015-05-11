package com.zamaruev.advert.ui.table;

import com.zamaruev.advert.business.services.AdItemService;

import javax.swing.table.AbstractTableModel;
import java.util.*;

/**
 * Item table view model with random values.
 * Created by vzamaruiev on 03.05.2015.
 */
public class AdItemTableModel extends AbstractTableModel {

    private final static String[] COLUMNS = new String[]{"#", "Title", "Price", "Size", "Gender", "Color"};
    private Random random = new Random();
    private List<Map<String, Object>> items = new ArrayList<>();
    private AdItemService service = new AdItemService();

    public AdItemTableModel() {
        int itemsCount = random.nextInt(100);
        for (int i = 0; i < itemsCount; i++) {
            items.add(service.getRandomAdvert(i));
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

}

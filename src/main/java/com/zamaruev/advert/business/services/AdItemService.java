package com.zamaruev.advert.business.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class AdItemService {

    private final static String[] SIZES = new String[]{"S", "M", "L", "XL"};
    private final static String[] GENDERS = new String[]{"Male", "Female", "Unisex"};
    private final static String[] COLORS = new String[]{"White", "Blue", "Green"};
    private final static String[] COLUMNS = new String[]{"#", "Title", "Price", "Size", "Gender", "Color"};
    private Random random = new Random();

    public Map<String, Object> getRandomAdvert(int i) {
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

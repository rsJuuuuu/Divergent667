package com.rs.utils.game.itemUtils;

import com.google.gson.reflect.TypeToken;
import com.rs.utils.files.JSONParser;

import java.util.HashMap;

public final class ItemBonuses {

    private static HashMap<Integer, int[]> itemBonuses;

    public static void init() {
        loadItemBonuses();
    }

    public static int[] getItemBonuses(int itemId) {
        return itemBonuses.get(itemId);
    }

    public static HashMap<Integer, int[]> getItemBonusesMap() {
        return itemBonuses;
    }

    @SuppressWarnings("unchecked")
    private static void loadItemBonuses() {
        itemBonuses = (HashMap<Integer, int[]>) JSONParser.load("data/items/bonuses.json", new
                TypeToken<HashMap<Integer, int[]>>() {
        }.getType());

    }

    public static void saveItemBonuses() {
        JSONParser.save(itemBonuses, "data/items/bonuses.json", new TypeToken<HashMap<Integer, int[]>>() {
        }.getType());
    }

}

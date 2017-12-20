package com.rs.game.item;

import com.google.gson.reflect.TypeToken;
import com.rs.utils.files.JSONParser;

import java.util.HashSet;

public class ItemConstants {

    private static HashSet<Integer> untradeableIds = new HashSet<>();
    private static HashSet<String> untradeableNames = new HashSet<>();

    static {
        //noinspection unchecked
        HashSet<Object> untradeables = (HashSet<Object>) JSONParser.load("data/items/untradeables.json", new
                TypeToken<HashSet<Object>>() {
        }.getType());
        if (untradeables != null) for (Object object : untradeables)
            if (object instanceof Double)
                untradeableIds.add((int) Math.round((Double) object));//they come through from json as doubles so
                // that's why instance of double
            else untradeableNames.add((String) object);
    }

    public static int getDegradeItemWhenWear(int id) {
        return -1;
    }

    public static int getItemDefaultCharges(int id) {
        return -1;
    }

    public static int getItemDegrade(int id) {
        if (id == 11285) // DFS
            return 11283;
        return -1;
    }

    public static int getDegradeItemWhenCombating(int id) {
        return -1;
    }

    public static boolean itemDegradesWhileWearing(int id) {
        return false;
    }

    public static boolean itemDegradesWhileCombating(int id) {
        return false;
    }

    /**
     * Check if the given item may be traded
     *
     * @param item to be traded
     */
    public static boolean isTradeable(Item item) {
        if (item.getDefinitions().isDestroyItem() || item.getDefinitions().isLoaned()
            || ItemConstants.getItemDefaultCharges(item.getId()) != -1) return false;
        String itemName = item.getName().toLowerCase();
        for (String rareName : untradeableNames)
            if (itemName.contains(rareName.toLowerCase())) return false;
        //finally check if the id is in the untradeable ids list
        return !untradeableIds.contains(item.getId());
    }
}

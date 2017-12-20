package com.rs.game.player.content.shops;

import com.google.gson.reflect.TypeToken;
import com.rs.game.actionHandling.Handler;
import com.rs.game.player.Player;
import com.rs.utils.files.JSONParser;
import org.pmw.tinylog.Logger;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_3;
import static com.rs.game.actionHandling.HandlerManager.registerNpcShop;

public class ShopHandler implements Handler {

    private static CopyOnWriteArrayList<Shop> shops = new CopyOnWriteArrayList<>();

    private static final String SAVE_PATH = "data/items/shop.json";

    @SuppressWarnings("unchecked")
    public static void init() {
        shops = (CopyOnWriteArrayList) JSONParser.load(SAVE_PATH, new TypeToken<CopyOnWriteArrayList<Shop>>() {
        }.getType());
        if (shops == null) Logger.error(new FileNotFoundException("Shop file couldn't be found"));
        else for (Shop shop : shops)
            shop.setFields();
    }

    public static void saveShops() {
        JSONParser.save(shops, SAVE_PATH, new TypeToken<ArrayList<Shop>>() {
        }.getType());
    }

    @Override
    public void register() {
        registerNpcShop("Skillcape shop", 659);
        registerNpcShop("Melee shop", 705);
        registerNpcShop("Woodcutting Shop", 4906);
        registerNpcShop("Crafting shop", 585);
        registerNpcShop("Hunter shop", 5113);
        registerNpcShop("General store", 528, 520, 521, 522, 523, 529);
        registerNpcShop("Herblore shop", 587);
        registerNpcShop("Ranged shop", 550);
        registerNpcShop("Dungeoneering Rewards", 9711);
        registerNpcShop("Magic shop", 946, 4707);
        registerNpcShop("Pking shop", 564);
        registerNpcShop("Pure shop", 457);
        registerNpcShop("Summoning Starter Ingredients", 948, 445);
        registerNpcShop("Summoning Master Ingredients", 637);
        registerNpcShop("Fishing & Food", 576, 8864);
        registerNpcShop("Runecrafting shop", 13622);
    }

    /**
     * Open the shop by its name
     *
     * @param player the player opening the shop
     * @param name   name of the shop
     */
    public static boolean openShop(Player player, String name) {
        for (Shop shop : shops) {
            if (shop.getName().equalsIgnoreCase(name)) {
                shop.addPlayer(player);
                return true;
            }
        }
        return false;
    }

    public static CopyOnWriteArrayList<Shop> getShops() {
        return shops;
    }

    public static Shop getShop(int currentShop) {
        if (shops.size() < currentShop) return null;
        return shops.get(currentShop);
    }

    public static void restoreShops() {
        for (Shop shop : shops)
            shop.restoreItems();
    }
}

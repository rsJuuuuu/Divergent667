package com.rs.utils;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.utils.stringUtils.TextUtils;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;

/**
 * Created by Peng on 28.11.2016 16:11.
 */
public class IdSearch {

    public static ArrayList<String> searchForNpc(String keyword, boolean addEffects, int limit, @Nullable Player
            player) {
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < NPCDefinitions.getNPCDefinitionsSize(); i++) {
            NPCDefinitions definitions = NPCDefinitions.getNPCDefinitions(i);
            if (definitions == null || definitions.getName() == null) continue;
            if (definitions.getName().toLowerCase().contains(keyword.toLowerCase())) {
                if (items.size() == limit) {
                    if (player != null) items.add("<col=FF0000>Found over " + limit + " results for "
                                                  + TextUtils.formatPlayerNameForDisplay(keyword) + ". Only " + limit
                                                  + " listed.");
                    return items;
                }
                items.add(
                        (addEffects ? "<col=00FFFF>" : "") + definitions.getName() + (addEffects ? "</col>" : " " + "")
                        + "(Id: " + (addEffects ? "<col=00FF00>" : "") + i + ")" + (addEffects ? "</col>" : ""));
            }
        }
        return items;
    }

    public static void searchForNpc(Player player, String itemName) {
        int MAX_RESULTS = 250;
        ArrayList<String> results = searchForNpc(itemName, true, MAX_RESULTS, player);
        for (String message : results)
            player.getPackets().sendPanelBoxMessage(message);
        player.getPackets().sendPanelBoxMessage(
                "<col=FF0000>Found " + (results.size() > MAX_RESULTS ? MAX_RESULTS : results.size())
                + " results for the item " + TextUtils.formatPlayerNameForDisplay(itemName) + ".");
    }

    public static ArrayList<String> searchForItem(String keyword, boolean addEffects, int limit, @Nullable Player
            player) {
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < ItemDefinitions.getItemDefinitionsSize(); i++) {
            Item item = new Item(i);
            if (item.getDefinitions().isLoaned()) continue;
            if (item.getDefinitions().getName().toLowerCase().contains(keyword.toLowerCase())) {
                if (items.size() == limit) {
                    if (player != null) items.add("<col=FF0000>Found over " + limit + " results for "
                                                  + TextUtils.formatPlayerNameForDisplay(keyword) + ". Only " + limit
                                                  + " listed.");
                    return items;
                }
                String suffix = item.getDefinitions().isNoted() ? "(noted)" : "";
                items.add((addEffects ? "<col=00FFFF>" : "") + item.getName() + suffix + (addEffects ? "</col>" :
                                                                                                  " " + "") + "(Id: "
                          + (addEffects ? "<col=00FF00>" : "") + item.getId() + ")" + (addEffects ? "</col>" : ""));
            }
        }
        return items;
    }

    public static void searchForItem(Player player, String itemName) {
        int MAX_RESULTS = 250;
        ArrayList<String> results = searchForItem(itemName, true, MAX_RESULTS, player);
        for (String message : results)
            player.getPackets().sendPanelBoxMessage(message);
        player.getPackets().sendPanelBoxMessage(
                "<col=FF0000>Found " + (results.size() > MAX_RESULTS ? MAX_RESULTS : results.size())
                + " results for the item " + TextUtils.formatPlayerNameForDisplay(itemName) + ".");
    }

    private static ArrayList<String> searchForObject(String keyword, boolean addEffects, int limit, @Nullable Player
            player) {
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < ObjectDefinitions.getObjectDefinitionsSize(); i++) {
            ObjectDefinitions definitions = ObjectDefinitions.getObjectDefinitions(i);
            if (definitions == null || definitions.name == null) continue;
            if (definitions.name.toLowerCase().contains(keyword.toLowerCase())) {
                if (items.size() == limit) {
                    if (player != null) items.add("<col=FF0000>Found over " + limit + " results for "
                                                  + TextUtils.formatPlayerNameForDisplay(keyword) + ". Only " + limit
                                                  + " listed.");
                    return items;
                }
                items.add((addEffects ? "<col=00FFFF>" : "") + definitions.name + (addEffects ? "</col>" : " " + "")
                          + "(Id: " + (addEffects ? "<col=00FF00>" : "") + i + ")" + (addEffects ? "</col>" : ""));
            }
        }
        return items;
    }

    public static void searchForObject(Player player, String itemName) {
        int MAX_RESULTS = 250;
        ArrayList<String> results = searchForObject(itemName, true, MAX_RESULTS, player);
        for (String message : results)
            player.getPackets().sendPanelBoxMessage(message);
        player.getPackets().sendPanelBoxMessage(
                "<col=FF0000>Found " + (results.size() > MAX_RESULTS ? MAX_RESULTS : results.size())
                + " results for the item " + TextUtils.formatPlayerNameForDisplay(itemName) + ".");
    }
}

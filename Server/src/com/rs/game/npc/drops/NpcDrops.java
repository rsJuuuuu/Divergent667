package com.rs.game.npc.drops;

import com.google.gson.reflect.TypeToken;
import com.rs.game.item.Item;
import com.rs.game.npc.Drop;
import com.rs.game.player.Player;
import com.rs.game.world.World;
import com.rs.utils.files.JSONParser;
import com.rs.utils.files.SerializationUtils;
import com.rs.utils.stringUtils.TextUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Peng on 4.2.2017 19:55.
 */
public class NpcDrops {

    private static final String DROP_PATH = "data/npcs/drops.dat";

    private static HashSet<DropTable> dropTables = new HashSet<>();
    private static HashMap<Integer, DropTable> npcDrops = new HashMap<>();

    private static HashSet<String> rareDropNames = new HashSet<>();
    private static HashSet<Integer> rareDropIds = new HashSet<>();

    @SuppressWarnings("unchecked")
    public static void init() {
        loadTables();
        fillNpcDrops();
        HashSet<Object> rares = (HashSet<Object>) JSONParser.load("data/npcs/rareDrops.json", new
                TypeToken<HashSet<Object>>() {
                }.getType());
        if (rares != null) for (Object object : rares)
            if (object instanceof Double) rareDropIds.add((int) Math.round((Double) object));
            else rareDropNames.add((String) object);
    }

    @SuppressWarnings("unchecked")
    private static void loadTables() {
        dropTables = (HashSet<DropTable>) SerializationUtils.deserialize("data/npcs/drops.dat");
    }

    private static void fillNpcDrops() {
        npcDrops.clear();
        for (DropTable table : dropTables)
            for (int key : table.getKeys()) {
                if (npcDrops.containsKey(key)) {
                    //if (table.getKeys().size() == 1) removedTables.add(table.getName());
                    System.out.println("Two keys for npc in table! " + table.getName() + "Key : " + key);
                } else npcDrops.put(key, table);
            }
    }

    public static void saveNpcDrops() {
        SerializationUtils.serialize(DROP_PATH, dropTables);
    }

    public static void addDropTable(DropTable table) {
        dropTables.add(table);
        fillNpcDrops();
    }

    public static void renameDropTable(DropTable table, String name) {
        table.setName(name);
    }

    public static void deleteDropTable(DropTable table) {
        dropTables.remove(table);
        fillNpcDrops();
    }

    public static ArrayList<Drop> getDrops(int id) {
        if (npcDrops.get(id) != null) return npcDrops.get(id).getDrops();
        else return null;
    }

    public static HashMap<String, DropTable> getDropTables() {
        HashMap<String, DropTable> tables = new HashMap<>();
        for (DropTable table : dropTables)
            tables.put(table.getName(), table);
        return tables;
    }

    public static DropTable getDropTable(int key) {
        return npcDrops.get(key);
    }

    /**
     * Check if a drop is a rare drop and if it is broadcast it
     */
    public static void checkRareDrop(Player player, Item item) {
        String dropName = item.getName().toLowerCase();
        for (String rareName : rareDropNames) {
            if (dropName.contains(rareName.toLowerCase())) {
                World.sendDropMessage(TextUtils.formatPlayerNameForDisplay(player.getUsername()), TextUtils
                        .formatPlayerNameForDisplay(dropName));
                return;
            }
        }
        if (rareDropIds.contains(item.getId()))
            World.sendDropMessage(TextUtils.formatPlayerNameForDisplay(player.getUsername()), TextUtils
                    .formatPlayerNameForDisplay(dropName));
    }
}

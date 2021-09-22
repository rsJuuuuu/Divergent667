package com.rs.game.npc.data;

import com.google.gson.reflect.TypeToken;
import com.rs.utils.files.JSONParser;

import java.util.HashMap;

/**
 * Created by Peng on 11.2.2017 20:22.
 */
public class NpcDataLoader {

    private static final NpcCombatDefinitions DEFAULT_DEFINITION = new NpcCombatDefinitions(10, -1, -1, -1, 5, 1, 1,
            0, NpcCombatDefinitions.MELEE, -1, -1, NpcCombatDefinitions.PASSIVE);

    private static HashMap<Integer, NpcData> dataHashMap;

    public static void init() {
        loadNpcData();
    }

    @SuppressWarnings("unchecked")
    private static void loadNpcData() {
        dataHashMap = (HashMap<Integer, NpcData>) JSONParser.load("data/npcs/npcData.json", new
                TypeToken<HashMap<Integer, NpcData>>() {
        }.getType());
    }

    /**
     * Get bonuses for npc id
     */
    public static int[] getBonuses(int npcId) {
        if (!dataHashMap.containsKey(npcId)) return null;
        return dataHashMap.get(npcId).getBonuses();
    }

    public static NpcCombatDefinitions getNPCCombatDefinitions(int npcId) {
        if (!dataHashMap.containsKey(npcId)) return DEFAULT_DEFINITION;
        NpcCombatDefinitions def = dataHashMap.get(npcId).getDefinitions();
        if (def == null) return DEFAULT_DEFINITION;
        return def;
    }

    public static HashMap<Integer, NpcData> getDataMap() {
        return dataHashMap;
    }

    public static void save() {
        JSONParser.save(dataHashMap, "data/npcs/npcData.json", new TypeToken<HashMap<Integer, NpcData>>() {
        }.getType());
    }
}

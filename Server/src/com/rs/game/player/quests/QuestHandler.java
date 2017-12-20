package com.rs.game.player.quests;

import com.google.gson.reflect.TypeToken;
import com.rs.game.actionHandling.Handler;
import com.rs.game.player.Player;
import com.rs.game.world.WorldObject;
import com.rs.utils.Utils;
import com.rs.utils.files.JSONParser;
import org.pmw.tinylog.Logger;

import java.util.HashMap;
import java.util.Map;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_1;
import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerInterfaceAction;
import static com.rs.utils.Constants.CONFIG_BY_FILE;
import static com.rs.utils.Constants.NORMAL_CONFIG;

public class QuestHandler implements Handler {

    private static Map<Integer, Quest> quests = new HashMap<>();

    private static HashMap<Integer, QuestData> questDataMap;

    private QuestData getQuestData(int questId) {
        return questDataMap.get(questId);
    }

    public static boolean handleObject(Player player, WorldObject object) {
        for (Quest q : getQuests().values()) {
            return q.processObjectClick1(player, object);
        }
        return false;
    }

    public static boolean hasRequirements(Player player) {
        for (Quest q : getQuests().values()) {
            return q.hasRequirements(player);
        }
        return false;
    }

    private static Map<Integer, Quest> getQuests() {
        return quests;
    }

    public static void sendConfigs(Player player) {
        for (QuestData data : questDataMap.values()) {
            if (data.getProgressConfig() == -1) continue;
            if (quests.containsKey(data.getQuestId())) continue; //Don't send quest that can be completed
            switch (data.getConfigType()) {
                case CONFIG_BY_FILE:
                    player.getPackets().sendConfigByFile(data.getProgressConfig(), data.getCompletedConfig());
                    break;
                case NORMAL_CONFIG:
                    player.getPackets().sendConfig(data.getProgressConfig(), data.getCompletedConfig());
                    break;
            }
        }
    }

    static void sendQuestConfig(Player player, int questId, int value) {
        QuestData data = questDataMap.get(questId);
        if (data != null) {
            if (data.getConfigType() == CONFIG_BY_FILE)
                player.getPackets().sendConfigByFile(data.getProgressConfig(), value);
            else player.getPackets().sendConfig(data.getProgressConfig(), data.getCompletedConfig());
        }
    }

    public static void showQuestInterface(Player player) {
        player.getInterfaceManager().sendInterface(473);
        player.getPackets().sendHideIComponent(473, 33, true);
        player.getPackets().sendHideIComponent(473, 34, true);
        player.getPackets().sendHideIComponent(473, 35, true);
        player.getPackets().sendHideIComponent(473, 1, true);
        player.getPackets().sendHideIComponent(473, 9, true);
        player.getPackets().sendIComponentText(473, 31, "Quests");
        player.getPackets().sendIComponentText(473, 227, "Quests");
        player.getPackets().sendHideIComponent(473, 69, true);

        quests.get(33).sendQuestListInfo(player, 119);

        for (int i = 71; i < 77; i++) {
            player.getPackets().sendHideIComponent(473, i, true);
        }
    }

    @Override
    public void register() {
        //noinspection unchecked
        questDataMap = (HashMap<Integer, QuestData>) JSONParser.load("data/quests/questsMap.json", new
                TypeToken<HashMap<Integer, QuestData>>() {
        }.getType());
        try {
            Class[] classes = Utils.getClasses("com.rs.game.player.quests.impl");
            for (Class c : classes) {
                if (c.isAnonymousClass()) continue;
                Object o = c.newInstance();
                if (!(o instanceof Quest)) continue;
                Quest script = (Quest) o;
                int key = script.getQuestId();
                quests.put(key, script);
            }
        } catch (Throwable e) {
            Logger.error(e);
        }
        for (Quest quest : quests.values()) {
            quest.registerListeners();
        }
        registerInterfaceAction(CLICK_1, (player, componentId, slotId, slotId2, buttonId, interfaceId) -> {
            switch (componentId) {
                case 70:
                    player.sendMessage(quests.get(33).getClickInfo());
            }
            return RETURN;
        }, 473);
    }

    public static void sendQuestComplete(Player player, int questId) {
        Quest quest = quests.get(questId);
        quest.openCompleteInterface(player);
    }

    public static String getName(int questId) {
        if (questDataMap.containsKey(questId)) return questDataMap.get(questId).getName();
        else return "A quest";
    }

    public static boolean handleItemOnObject(Player player, int itemId, int id) {
        for (Quest quest : quests.values()) {
            if (quest.handleItemOnObject(player, itemId, id)) return true;
        }
        return false;
    }

    static Integer getCompleted(int questId) {
        return questDataMap.get(questId).getCompletedConfig();
    }

}

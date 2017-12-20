package com.rs.game.player.quests;

import com.rs.game.player.Player;

import java.util.HashMap;

/**
 * Created by Peng on 30.1.2017 15:51.
 */
public class QuestManager {

    private HashMap<Integer, Integer> questProgress = new HashMap<>();

    transient Player player;

    public void sendConfigs() {
        QuestHandler.sendConfigs(player);
        for(int questId : questProgress.keySet()){
            QuestHandler.sendQuestConfig(player, questId, questProgress.get(questId));
        }
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setStage(int questId, int progress) {
        if (questProgress.containsKey(questId)) {
            if (questProgress.get(questId) < progress) questProgress.put(questId, progress);
        } else questProgress.put(questId, progress);
    }

    public int getStage(int questId) {
        if (!questProgress.containsKey(questId)) return 0;
        return questProgress.get(questId);
    }

    public String getStageColor(int questId) {
        if(!questProgress.containsKey(questId))
            return "<col=ff0000>";
        if(questProgress.get(questId) < QuestHandler.getCompleted(questId))
            return "<col=ffff00>";
        return "<col=00ff00>";
    }
}

package com.rs.game.player.content.skills.combat;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.player.Player;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BossKillCounter implements Serializable {

    /**
     * BossKillCounter used for recording players boss kills or any npcs for
     * that matter
     *
     * @author Peng
     */

    transient private Player player;

    private static final long serialVersionUID = 5232496323313748054L;

    public BossKillCounter(Player player) {
        this.player = player;
    }

    private Map<Integer, Integer> kills = new HashMap<>();

    public int getKills(int npcId) {
        if (!kills.containsKey(npcId)) return 0;
        return kills.get(npcId);
    }

    public int getSize() {
        return kills.size();
    }

    public ArrayList<String> getNpcStrings() {
        ArrayList<String> lines = new ArrayList<>();
        NPCDefinitions defs;
        for (int npcId : kills.keySet()) {
            defs = NPCDefinitions.getNPCDefinitions(npcId);
            lines.add(defs.getName() + ": " + kills.get(npcId) + " kills");
        }
        return lines;
    }

    public void addKills(int npcId) {
        if (!kills.containsKey(npcId)) kills.put(npcId, 1);
        else kills.put(npcId, kills.get(npcId) + 1);
    }

    public void addKills(int npcId, int amount) {
        if (!kills.containsKey(npcId)) kills.put(npcId, amount);
        else kills.put(npcId, kills.get(npcId) + 1);
    }

    /**
     * Used for toggling boss tasks
     *
     * @param name name of the task
     * @return
     */
    public static boolean isBoss(String name) {
        return name.contains("graard") || name.contains("kree") || name.contains("zilyana") || name.contains("k'ril")
               || name.contains("king black") || name.contains("corporeal beast") || name.contains("queen black dragon")
               || name.contains("hati") || name.contains("glacor") || name.contains("nomad") || name.contains("avatar")
               || name.contains("tormented") || name.contains("party demon") || name.contains("blink")
               || name.contains("kalphite queen") || name.contains("thunderous") || name.contains("nex")
               || name.contains("freyr");
    }

    /*
     * Whether or not we should log the npc kills
     */
    public static boolean isLogNpc(int npcId) {
        switch (npcId) {
            case 13460:
            case 15454:
            case 8133:
            case 50:
            case 13450:
            case 6203:
            case 6247:
            case 6222:
            case 6260:
            case 11872:
            case 2745:
            case 15208:
            case 1160:
            case 2883:
            case 2882:
            case 2881:
            case 12878:
            case 8349:
            case 15581:
            case 8596:
            case 8528:
            case 14301:
            case 14951:
                return true;
            default:
                return false;
        }
    }

}

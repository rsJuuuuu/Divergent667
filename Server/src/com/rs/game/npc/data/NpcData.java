package com.rs.game.npc.data;

/**
 * Created by Peng on 11.2.2017 20:12.
 */
public class NpcData {

    private int[] bonuses;
    private NpcCombatDefinitions defs;

    public NpcData(int[] bonuses, NpcCombatDefinitions combatDefinitions) {
        this.bonuses = bonuses;
        this.defs = combatDefinitions;
    }

    public int[] getBonuses() {
        return bonuses;
    }

    public NpcCombatDefinitions getDefinitions() {
        return defs;
    }

    public void setBonuses(int[] bonuses) {
        this.bonuses = bonuses;
    }
}

package com.rs.game.gameUtils.effects.prayer;

import com.rs.game.gameUtils.effects.Effect;

import java.util.HashMap;

/**
 * Created by Peng on 3.1.2017 15:21.
 */
public class LeechedEffect extends Effect {

    private HashMap<Integer, Double> stats = new HashMap<>();

    @Override
    public double getCombatModifier(int skillId) {
        if (!stats.containsKey(skillId)) return 1.0;
        return 1.0 - stats.get(skillId);
    }

    public boolean drain(int skillId, boolean leech) {
        if (!stats.containsKey(skillId)) {
            stats.put(skillId, 0.1);
            return true;
        }
        double toDrain = getAvailableDrain(skillId, leech ? 0.25 : 0.20);
        if (toDrain == 0.0) return false;
        stats.put(skillId, stats.get(skillId) + toDrain);
        return true;
    }

    private double getAvailableDrain(int skillId, double maxDrain) {
        if (stats.get(skillId) < maxDrain) {
            if (maxDrain - 0.1 <= stats.get(skillId)) return maxDrain - stats.get(skillId);
            return 0.1;
        }
        return 0;
    }
}

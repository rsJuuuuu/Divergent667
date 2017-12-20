package com.rs.game.gameUtils.effects.combat;

import com.rs.game.gameUtils.effects.Effect;

/**
 * Created by Peng on 31.12.2016 0:06.
 */
public class CombatModifier extends Effect {

    private int skillId;
    private double boost;

    public CombatModifier(int skillId, double boost) {
        this.skillId = skillId;
        this.boost = boost;
    }

    @Override
    public double getCombatModifier(int skillId) {
        return skillId == this.skillId ? 1.0 + boost : 1.0;
    }
}

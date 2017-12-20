package com.rs.game.gameUtils.effects.prayer;

import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.combat.PlayerCombat;
import com.rs.game.world.Entity;

/**
 * Created by Peng on 3.1.2017 17:07.
 */
public class TurmoilEffect extends Effect {

    @Override
    public double getCombatModifier(Player player, int skillId) {
        Entity target = null;
        Player opponent = null;
        if (player.getActionManager().getAction() instanceof PlayerCombat)
            target = ((PlayerCombat) player.getActionManager().getAction()).getTarget();
        if (target != null && target instanceof Player) opponent = (Player) target;
        switch (skillId) {
            case Skills.ATTACK:
            case Skills.DEFENCE:
                return 1.15 + (target != null ? (
                        opponent != null ? opponent.getSkills().getLevelForXp(skillId) * 0.15
                                           / player.getSkills().getLevelForXp(skillId) : 0.15) : 0);
            case Skills.STRENGTH:
                return 1.23 + (target != null ? (
                        opponent != null ? opponent.getSkills().getLevelForXp(skillId) * 0.10
                                           / player.getSkills().getLevelForXp(skillId) : 0.10) : 0);
            default:
                return 1;
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.game.npc.combat.impl.minigame.lrc;

import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.World;
import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;

/**
 *
 * @author Owner
 */
public class LivingRockStrikerCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{8833};
    }

    @Override
    public int attack(final Npc npc, final Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        if (npc.withinDistance(target, 10)) { // range magical attack
            npc.setNextAnimation(new Animation(1296));
            for (Entity t : npc.getPossibleTargets()) {
                delayHit(
                        npc,
                        1,
                        t,
                        getRangeHit(
                        npc,
                        getRandomMaxHit(npc, 140,
                        NpcCombatDefinitions.RANGE, t)));
                World.sendProjectile(npc, t, 1197, 41, 16, 41, 35, 16, 0);
            }
        } else { // melee attack
            npc.setNextAnimation(new Animation(defs.getAttackEmote()));
            delayHit(
                    npc,
                    0,
                    target,
                    getMeleeHit(
                    npc,
                    getRandomMaxHit(npc, defs.getMaxHit(),
                    NpcCombatDefinitions.MELEE, target)));
        }
        return defs.getAttackDelay();
    }
}

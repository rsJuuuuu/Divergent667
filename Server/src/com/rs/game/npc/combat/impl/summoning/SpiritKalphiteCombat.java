package com.rs.game.npc.combat.impl.summoning;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;

public class SpiritKalphiteCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{6995, 6994};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        Follower follower = (Follower) npc;
        boolean usingSpecial = follower.hasSpecialOn();
        int damage;
        if (usingSpecial) {
            npc.setNextAnimation(new Animation(8519));
            npc.setNextGraphics(new Graphics(8519));
            damage = getRandomMaxHit(npc, 20, NpcCombatDefinitions.MELEE, target);
            delayHit(npc, 1, target, getMeleeHit(npc, damage));
        } else {
            npc.setNextAnimation(new Animation(8519));
            damage = getRandomMaxHit(npc, 50, NpcCombatDefinitions.MELEE, target);
            delayHit(npc, 1, target, getMeleeHit(npc, damage));
        }
        return defs.getAttackDelay();
    }
}

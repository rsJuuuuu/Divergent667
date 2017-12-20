package com.rs.game.npc.combat.impl.summoning;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;

public class ThornySnailCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{6807, 6806};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        Follower familiar = (Follower) npc;
        boolean usingSpecial = familiar.hasSpecialOn();
        if (usingSpecial) {// priority over regular attack
            npc.setNextAnimation(new Animation(8148));
            npc.setNextGraphics(new Graphics(1385));
            World.sendProjectile(npc, target, 1386, 34, 16, 30, 35, 16, 0);
            delayHit(npc, 1, target, getRangeHit(npc, getRandomMaxHit(npc, 80, NpcCombatDefinitions.RANGE, target)));
            npc.setNextGraphics(new Graphics(1387));
        } else {
            npc.setNextAnimation(new Animation(8143));
            delayHit(npc, 1, target, getRangeHit(npc, getRandomMaxHit(npc, 40, NpcCombatDefinitions.RANGE, target)));
        }
        return defs.getAttackDelay();
    }

}

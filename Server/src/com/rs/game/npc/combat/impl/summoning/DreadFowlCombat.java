package com.rs.game.npc.combat.impl.summoning;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;
import com.rs.utils.Utils;

public class DreadFowlCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{6825, 6824};
    }

    @Override
    public int attack(final Npc npc, final Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        Follower familiar = (Follower) npc;
        boolean usingSpecial = familiar.hasSpecialOn();
        if (usingSpecial) {// priority over regular attack
            npc.setNextAnimation(new Animation(7810));
            npc.setNextGraphics(new Graphics(1318));
            delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, 40, NpcCombatDefinitions.MAGIC, target)));
            World.sendProjectile(npc, target, 1376, 34, 16, 30, 35, 16, 0);
        } else {
            if (Utils.getRandom(10) == 0) {// 1/10 chance of random special
                // (weaker)
                npc.setNextAnimation(new Animation(7810));
                npc.setNextGraphics(new Graphics(1318));
                delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, 30, NpcCombatDefinitions.MAGIC, target)));
                World.sendProjectile(npc, target, 1376, 34, 16, 30, 35, 16, 0);
            } else {
                npc.setNextAnimation(new Animation(7810));
                delayHit(npc, 1, target, getMeleeHit(npc, getRandomMaxHit(npc, 30, NpcCombatDefinitions.MELEE,
						target)));
            }
        }
        return defs.getAttackDelay();
    }
}

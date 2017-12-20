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

public class SwampTitanCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{7330, 7329};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        Follower follower = (Follower) npc;
        boolean usingSpecial = follower.hasSpecialOn();
        int damage;
        if (usingSpecial) {// priority over regular attack
            npc.setNextAnimation(new Animation(8223));
            npc.setNextGraphics(new Graphics(1460));
            delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, 160, NpcCombatDefinitions.MAGIC, target)));
            for (Entity targets : npc.getPossibleTargets()) {
                World.sendProjectile(npc, targets, 1462, 34, 16, 30, 35, 16, 0);
                if (Utils.getRandom(3) == 0)// 1/3 chance of being poisioned
                    targets.getPoison().makePoisoned(58);
            }
        } else {
            damage = getRandomMaxHit(npc, 160, NpcCombatDefinitions.MELEE, target);
            npc.setNextAnimation(new Animation(8222));
            delayHit(npc, 1, target, getMeleeHit(npc, damage));
        }
        return defs.getAttackDelay();
    }

}

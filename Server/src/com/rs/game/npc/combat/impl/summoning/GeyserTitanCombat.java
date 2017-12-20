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

public class GeyserTitanCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{7340, 7339};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        int distanceX = target.getX() - npc.getX();
        int distanceY = target.getY() - npc.getY();
        boolean distant = false;
        int size = npc.getSize();
        Follower familiar = (Follower) npc;
        boolean usingSpecial = familiar.hasSpecialOn();
        int damage = 0;
        if (distanceX > size || distanceX < -1 || distanceY > size || distanceY < -1) distant = true;
        if (usingSpecial) {// priority over regular attack
            npc.setNextAnimation(new Animation(7883));
            npc.setNextGraphics(new Graphics(1373));
            if (distant) {// range hit
                if (Utils.getRandom(2) == 0)
                    delayHit(npc, 1, target, getRangeHit(npc, getRandomMaxHit(npc, 300, NpcCombatDefinitions.RANGE, target)));
                else
                    delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, 300, NpcCombatDefinitions.MAGIC,
							target)));
            } else {// melee hit
                delayHit(npc, 1, target, getMeleeHit(npc, getRandomMaxHit(npc, 300, NpcCombatDefinitions.MELEE,
						target)));
            }
            World.sendProjectile(npc, target, 1376, 34, 16, 30, 35, 16, 0);
        } else {
            if (distant) {// range
                damage = getRandomMaxHit(npc, 244, NpcCombatDefinitions.RANGE, target);
                npc.setNextAnimation(new Animation(7883));
                npc.setNextGraphics(new Graphics(1375));
                World.sendProjectile(npc, target, 1374, 34, 16, 30, 35, 16, 0);
                delayHit(npc, 2, target, getRangeHit(npc, damage));
            } else {// melee
                damage = getRandomMaxHit(npc, 244, NpcCombatDefinitions.MELEE, target);
                npc.setNextAnimation(new Animation(7879));
                delayHit(npc, 1, target, getMeleeHit(npc, damage));
            }
        }
        return defs.getAttackDelay();
    }
}

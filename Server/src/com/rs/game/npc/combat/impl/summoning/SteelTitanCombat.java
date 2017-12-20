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

public class SteelTitanCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{7344, 7343};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions definitions = npc.getCombatDefinitions();
        int distanceX = target.getX() - npc.getX();
        int distanceY = target.getY() - npc.getY();
        boolean distant = false;
        int size = npc.getSize();
        Follower follower = (Follower) npc;
        boolean usingSpecial = follower.hasSpecialOn();
        int damage = 0;
        if (distanceX > size || distanceX < -1 || distanceY > size || distanceY < -1) distant = true;
        if (usingSpecial) {// priority over regular attack
            npc.setNextAnimation(new Animation(8190));
            target.setNextGraphics(new Graphics(1449));
            if (distant) {// range hit
                delayHit(npc, 2, target, getRangeHit(npc, getRandomMaxHit(npc, 244, NpcCombatDefinitions.RANGE,
                        target)), getRangeHit(npc, getRandomMaxHit(npc, 244, NpcCombatDefinitions.RANGE, target)),
                        getRangeHit(npc, getRandomMaxHit(npc, 244, NpcCombatDefinitions.RANGE, target)), getRangeHit
                                (npc, getRandomMaxHit(npc, 244, NpcCombatDefinitions.RANGE, target)));
            } else {// melee hit
                delayHit(npc, 1, target, getMeleeHit(npc, getRandomMaxHit(npc, 244, NpcCombatDefinitions.MELEE,
                        target)), getMeleeHit(npc, getRandomMaxHit(npc, 244, NpcCombatDefinitions.MELEE, target)),
                        getMeleeHit(npc, getRandomMaxHit(npc, 244, NpcCombatDefinitions.MELEE, target)), getMeleeHit
                                (npc, getRandomMaxHit(npc, 244, NpcCombatDefinitions.MELEE, target)));
            }
        } else {
            if (distant) {
                int attackStage = Utils.getRandom(1);// 2
                switch (attackStage) {
                    case 0:// magic
                        damage = getRandomMaxHit(npc, 255, NpcCombatDefinitions.MAGIC, target);
                        npc.setNextAnimation(new Animation(7694));
                        World.sendProjectile(npc, target, 1451, 34, 16, 30, 35, 16, 0);
                        delayHit(npc, 2, target, getMagicHit(npc, damage));
                        break;
                    case 1:// range
                        damage = getRandomMaxHit(npc, 244, NpcCombatDefinitions.RANGE, target);
                        npc.setNextAnimation(new Animation(8190));
                        World.sendProjectile(npc, target, 1445, 34, 16, 30, 35, 16, 0);
                        delayHit(npc, 2, target, getRangeHit(npc, damage));
                        break;
                }
            } else {// melee
                damage = getRandomMaxHit(npc, 244, NpcCombatDefinitions.MELEE, target);
                npc.setNextAnimation(new Animation(8183));
                delayHit(npc, 1, target, getMeleeHit(npc, damage));
            }
        }
        return definitions.getAttackDelay();
    }
}

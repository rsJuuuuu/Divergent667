package com.rs.game.npc.combat.impl.slayer;

import com.rs.game.npc.Npc;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.utils.Utils;

public class JadinkoMaleCombat extends CombatScript {

    public Object[] getKeys() {
        return (new Object[]{Integer.valueOf(13822)});
    }

    public int attack(Npc jM, Entity target) {
        int attack = Utils.getRandom(3);
        int hit = Utils.getRandom(600);
        int distanceX = target.getX() - jM.getX();
        int distanceY = target.getY() - jM.getY();
        NpcCombatDefinitions defs = jM.getCombatDefinitions();
        int size = jM.getSize();
        if (distanceX < -1 || distanceY < -1) {
            jM.setNextAnimation(new Animation(3215));
            jM.setNextGraphics(new Graphics(2716));
            target.setNextGraphics(new Graphics(2726));
            delayHit(jM, 2, target, getMagicHit(jM, hit));
        } else {
            switch (attack) {
                case 2:
                case 3:
                case 0:
                    jM.setNextAnimation(new Animation(3214));
                    delayHit(jM, 2, target, getMeleeHit(jM, hit));
                    break;
                case 1:
                    jM.setNextAnimation(new Animation(3215));
                    jM.setNextGraphics(new Graphics(2716));
                    target.setNextGraphics(new Graphics(2726));
                    delayHit(jM, 2, target, getMagicHit(jM, hit));
                    break;
            }
        }
        return defs.getAttackDelay();
    }
}
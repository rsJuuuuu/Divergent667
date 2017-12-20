package com.rs.game.npc.combat.impl.minigame.fightcave;

import com.rs.game.npc.Npc;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;
import com.rs.game.npc.combat.CombatScript;
import com.rs.utils.Utils;

/**
 * @author Humid
 */
public class JadCombat extends CombatScript {

    public Object[] getKeys() {
        return new Object[]{2745};
    }

    //Range Emote-9276
    //Melee Emote-9277
    //Mage Emote-9300
    //Range Gfx-451
    public int attack(Npc npc, Entity target) {
        int jadAttack = Utils.getRandom(2);
        int jadHit = Utils.getRandom(500);
        NpcCombatDefinitions defs = npc.getCombatDefinitions();

        if (target.withinDistance(npc, 1)) {
            npc.setNextAnimation(new Animation(16204));
            delayHit(npc, 1, target, getMeleeHit(npc, jadHit));
        } else {
            switch (jadAttack) {
                case 1:
                    npc.setNextAnimation(new Animation(16195));
                    npc.setNextGraphics(new Graphics(2995));
                    delayHit(npc, 1, target, getMagicHit(npc, jadHit));
                    break;
                case 2:
                    npc.setNextAnimation(new Animation(16202));
                    npc.setNextGraphics(new Graphics(2994));
                    World.sendProjectile(npc, target, 1627, 41, 16, 41, 35, 16, 0);
                    delayHit(npc, 1, target, getRangeHit(npc, jadHit));
                    break;
            }
        }
        return defs.getAttackDelay();
    }

}
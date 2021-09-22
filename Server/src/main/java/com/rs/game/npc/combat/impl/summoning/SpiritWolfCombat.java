package com.rs.game.npc.combat.impl.summoning;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;

public class SpiritWolfCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{6829, 6828};
    }

    @Override
    public int attack(final Npc npc, final Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        Follower follower = (Follower) npc;
        boolean usingSpecial = follower.hasSpecialOn();
        if (usingSpecial) {// priority over regular attack
            follower.submitSpecial(follower.getOwner());
            npc.setNextAnimation(new Animation(8293));
            npc.setNextGraphics(new Graphics(1334));
            World.sendProjectile(npc, target, 1333, 34, 16, 30, 35, 16, 0);
            if (target instanceof Npc) {
                if (!(((Npc) target).getCombatDefinitions().getAttackStyle() == NpcCombatDefinitions.SPECIAL))
                    target.setAttackedByDelay(3000);// three seconds
                else follower.getOwner().getPackets().sendGameMessage("Your familiar cannot scare that monster.");
            } else if (target instanceof Player)
                follower.getOwner().getPackets().sendGameMessage("Your familiar cannot scare a player.");
        } else {
            npc.setNextAnimation(new Animation(6829));
            delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, 40, NpcCombatDefinitions.MAGIC, target)));
        }
        return defs.getAttackDelay();
    }

}

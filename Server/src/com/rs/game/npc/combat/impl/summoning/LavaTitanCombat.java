package com.rs.game.npc.combat.impl.summoning;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.utils.Utils;

public class LavaTitanCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{7342, 7341};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        Follower follower = (Follower) npc;
        boolean usingSpecial = follower.hasSpecialOn();
        int damage = 0;
        if (usingSpecial) {// priority over regular attack
            npc.setNextAnimation(new Animation(7883));
            npc.setNextGraphics(new Graphics(1491));
            delayHit(npc, 1, target, getMeleeHit(npc, getRandomMaxHit(npc, 140, NpcCombatDefinitions.MELEE, target)));
            if (damage <= 4 && target instanceof Player) {
                Player player = (Player) target;
                player.getCombatDefinitions().decreaseSpecial((
                        player.getCombatDefinitions().getSpecialAttackPercentage() / 10));
            }
        } else {
            damage = getRandomMaxHit(npc, 140, NpcCombatDefinitions.MELEE, target);
            npc.setNextAnimation(new Animation(7980));
            npc.setNextGraphics(new Graphics(1490));
            delayHit(npc, 1, target, getMeleeHit(npc, damage));
        }
        if (Utils.getRandom(10) == 0)// 1/10 chance of happening
            delayHit(npc, 1, target, getMeleeHit(npc, Utils.getRandom(50)));
        return defs.getAttackDelay();
    }
}

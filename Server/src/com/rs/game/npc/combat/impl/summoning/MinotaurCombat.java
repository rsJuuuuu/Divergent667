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

public class MinotaurCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{"Bronze Minotaur", "Iron Minotaur", "Steel Minotaur", "Mithril Minotaur",
                "Adamant " + "Minotaur", "Rune Minotaur"};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions definitions = npc.getCombatDefinitions();
        Follower follower = (Follower) npc;
        boolean usingSpecial = follower.hasSpecialOn();
        if (usingSpecial) {// priority over regular attack
            follower.submitSpecial(follower.getOwner());
            npc.setNextAnimation(new Animation(8026));
            npc.setNextGraphics(new Graphics(1334));
            World.sendProjectile(npc, target, 1333, 34, 16, 30, 35, 16, 0);
            int damage = 0;
            switch (npc.getName()) {
                case "Rune Minotaur":
                    damage = 190;
                    break;
                case "Adamant Minotaur":
                    damage = 160;
                    break;
                case "Mithril Minotaur":
                    damage = 120;
                    break;
                case "Steel Minotaur":
                    damage = 90;
                    break;
                case "Iron Minotaur":
                    damage = 60;
                    break;
                case "Bronze Minotaur":
                    damage = 40;
            }
            int maxHit = getRandomMaxHit(npc, damage, NpcCombatDefinitions.RANGE, target);
            if (maxHit > 0.7 * damage) {//30% chance of stunning
                target.setFreezeDelay(damage * 2 * 10);//seems reasonable and makes higher level minotaurs more usable
                if (target instanceof Player) ((Player) target).sendMessage("You have been stunned.");
            }
            delayHit(npc, 1, target, getRangeHit(npc, maxHit));
        } else {
            npc.setNextAnimation(new Animation(6829));
            delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, 40, NpcCombatDefinitions.MAGIC, target)));
        }
        return definitions.getAttackDelay();
    }
}

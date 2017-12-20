package com.rs.game.npc.combat.impl.minigame.fightcave;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;

public class TzKihCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{"tz-kih"};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        int damage;
        if (npc instanceof Follower) {
            Follower follower = (Follower) npc;
            boolean usingSpecial = follower.hasSpecialOn();
            if (usingSpecial) {
                for (Entity entity : npc.getPossibleTargets()) {
                    damage = getRandomMaxHit(npc, 70, NpcCombatDefinitions.MAGIC, target);
                    Player player = (Player) target;
                    if (player.getTemporaryAttributes().get("drainingPrayer") != null)
                        player.getPrayer().drainPrayer(damage);
                    else delayHit(npc, 1, entity, getMagicHit(npc, damage));
                }
            }
            return defs.getAttackDelay();
        }
        npc.setNextAnimation(new Animation(8257));
        damage = getRandomMaxHit(npc, 50, NpcCombatDefinitions.MAGIC, target);
        Player player = (Player) target;
        if (player.getTemporaryAttributes().get("drainingPrayer") != null) player.getPrayer().drainPrayer(damage);
        else delayHit(npc, 1, target, getMagicHit(npc, damage));
        return defs.getAttackDelay();
    }
}

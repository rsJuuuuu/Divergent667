package com.rs.game.npc.combat.impl.summoning;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;

public class AbyssalTitanCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{7350, 7349};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        int damage = 0;
        damage = getRandomMaxHit(npc, 140, NpcCombatDefinitions.MELEE, target);
        npc.setNextAnimation(new Animation(7980));
        npc.setNextGraphics(new Graphics(1490));

        if (target instanceof Player) {
            Player player = (Player) target;
            if (damage > 0 && player.getPrayer().getPrayerPoints() > 0) player.getPrayer().drainPrayer(damage / 2);
        }
        delayHit(npc, 1, target, getMeleeHit(npc, damage));
        return defs.getAttackDelay();
    }
}

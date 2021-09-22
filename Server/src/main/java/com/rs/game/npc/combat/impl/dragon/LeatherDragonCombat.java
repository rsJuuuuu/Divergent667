package com.rs.game.npc.combat.impl.dragon;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.utils.game.CombatUtils;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.utils.Utils;

public class LeatherDragonCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{"Green dragon", "Blue dragon", "Red dragon", "Black dragon", 742, 14548};
    }

    @Override
    public int attack(final Npc npc, final Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        int distanceX = target.getX() - npc.getX();
        int distanceY = target.getY() - npc.getY();
        int size = npc.getSize();
        if (distanceX > size || distanceX < -1 || distanceY > size || distanceY < -1) return 0;
        if (Utils.getRandom(3) != 0) {
            npc.setNextAnimation(new Animation(defs.getAttackEmote()));
            delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, defs.getMaxHit(), NpcCombatDefinitions
                    .MELEE, target)));
        } else {
            npc.setNextAnimation(new Animation(12259));
            npc.setNextGraphics(new Graphics(1, 0, 100));
            final Player player = target instanceof Player ? (Player) target : null;
            int damage = Utils.getRandom(CombatUtils.getDragonFireMaxHit(target, npc));
            if (player != null) CombatUtils.sendDragonFireMessage(player, damage, "dragon's breath");
            delayHit(npc, 1, target, getRegularHit(npc, damage));
        }
        return defs.getAttackDelay();
    }
}

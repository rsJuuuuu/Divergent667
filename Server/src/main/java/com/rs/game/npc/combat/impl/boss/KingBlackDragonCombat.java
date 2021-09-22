package com.rs.game.npc.combat.impl.boss;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.utils.game.CombatUtils;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.World;
import com.rs.utils.Utils;

public class KingBlackDragonCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{50};
    }

    @Override
    public int attack(final Npc npc, final Entity target) {
        final NpcCombatDefinitions definitions = npc.getCombatDefinitions();
        int attackStyle = Utils.getRandom(5);
        int size = npc.getSize();

        int maxDamage = CombatUtils.getDragonFireMaxHit(target, npc);
        if (maxDamage == 0) maxDamage = (attackStyle == 1 || attackStyle == 2) ? 0 : 164;
        int damage = Utils.getRandom(maxDamage);
        final Player player = target instanceof Player ? (Player) target : null;
        if (attackStyle == 0) {
            int distanceX = target.getX() - npc.getX();
            int distanceY = target.getY() - npc.getY();
            if (distanceX > size || distanceX < -1 || distanceY > size || distanceY < -1)
                attackStyle = Utils.getRandom(4) + 1;
            else {
                delayHit(npc, 0, target, getMeleeHit(npc, getRandomMaxHit(npc, definitions.getMaxHit(), NpcCombatDefinitions
                        .MELEE, target)));
                npc.setNextAnimation(new Animation(definitions.getAttackEmote()));
                return definitions.getAttackDelay();
            }
        }
        if (attackStyle == 1 || attackStyle == 2) {
            if (player != null) CombatUtils.sendDragonFireMessage(player, damage, "dragon's fiery breath");
            delayHit(npc, 2, target, getRegularHit(npc, damage));
            World.sendProjectile(npc, target, 393, 34, 16, 30, 35, 16, 0);
            npc.setNextAnimation(new Animation(81));
        } else if (attackStyle == 3) {
            if (player != null) CombatUtils.sendDragonFireMessage(player, damage, "dragon's poisonous breath");
            if (Utils.getRandom(2) == 0) target.getPoison().makePoisoned(80);
            delayHit(npc, 2, target, getRegularHit(npc, damage));
            World.sendProjectile(npc, target, 394, 34, 16, 30, 35, 16, 0);
            npc.setNextAnimation(new Animation(81));
        } else if (attackStyle == 4) {
            if (player != null) CombatUtils.sendDragonFireMessage(player, damage, "dragon's freezing breath");
            if (Utils.getRandom(2) == 0) target.addFreezeDelay(15000);
            delayHit(npc, 2, target, getRegularHit(npc, damage));
            World.sendProjectile(npc, target, 395, 34, 16, 30, 35, 16, 0);
            npc.setNextAnimation(new Animation(81));
        } else {
            if (player != null) CombatUtils.sendDragonFireMessage(player, damage, "dragon's shocking breath");
            if (Utils.getRandom(2) == 0) target.addFreezeDelay(15000);
            delayHit(npc, 2, target, getRegularHit(npc, damage));
            World.sendProjectile(npc, target, 396, 34, 16, 30, 35, 16, 0);
            npc.setNextAnimation(new Animation(81));
        }
        return definitions.getAttackDelay();
    }
}

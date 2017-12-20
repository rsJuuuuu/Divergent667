package com.rs.game.npc.combat.impl.dragon;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.utils.game.CombatUtils;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;
import com.rs.utils.Utils;

public class FrostDragonCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{"Frost dragon"};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions defs = npc.getCombatDefinitions();
        final Player player = target instanceof Player ? (Player) target : null;
        int damage;
        switch (Utils.getRandom(3)) {
            case 0: // Melee
                if (npc.withinDistance(target, 3)) {
                    damage = getRandomMaxHit(npc, defs.getMaxHit(), NpcCombatDefinitions.MELEE, target);
                    npc.setNextAnimation(new Animation(defs.getAttackEmote()));
                    delayHit(npc, 0, target, getMeleeHit(npc, damage));
                } else {
                    damage = Utils.getRandom(CombatUtils.getDragonFireMaxHit(target, npc));
                    if (player != null) CombatUtils.sendDragonFireMessage(player, damage, "dragon's breath");
                    npc.setNextAnimation(new Animation(13155));
                    World.sendProjectile(npc, target, 393, 28, 16, 35, 35, 16, 0);
                    delayHit(npc, 1, target, getRegularHit(npc, damage));
                }
                break;
            case 1: // Dragon breath
                if (npc.withinDistance(target, 3)) {
                    damage = Utils.getRandom(CombatUtils.getDragonFireMaxHit(target, npc));
                    if (player != null) CombatUtils.sendDragonFireMessage(player, damage, "dragon's breath");
                    npc.setNextAnimation(new Animation(13152));
                    npc.setNextGraphics(new Graphics(2465));
                    delayHit(npc, 1, target, getRegularHit(npc, damage));
                } else {
                    damage = Utils.getRandom(CombatUtils.getDragonFireMaxHit(target, npc));
                    if (player != null) CombatUtils.sendDragonFireMessage(player, damage, "dragon's breath");
                    npc.setNextAnimation(new Animation(13155));
                    World.sendProjectile(npc, target, 393, 28, 16, 35, 35, 16, 0);
                    delayHit(npc, 1, target, getRegularHit(npc, damage));
                }
                break;
            case 2: // Range
                damage = Utils.getRandom(250);
                npc.setNextAnimation(new Animation(13155));
                World.sendProjectile(npc, target, 2707, 28, 16, 35, 35, 16, 0);
                delayHit(npc, 1, target, getRangeHit(npc, damage));
                break;
            case 3: // Ice arrows range
                damage = Utils.getRandom(250);
                npc.setNextAnimation(new Animation(13155));
                World.sendProjectile(npc, target, 369, 28, 16, 35, 35, 16, 0);
                delayHit(npc, 1, target, getRangeHit(npc, damage));
                break;
            case 4: // Orb crap
                break;
        }
        return defs.getAttackDelay();
    }

}

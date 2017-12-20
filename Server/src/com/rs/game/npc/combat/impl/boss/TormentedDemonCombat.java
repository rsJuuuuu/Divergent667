package com.rs.game.npc.combat.impl.boss;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.impl.boss.TormentedDemon;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;
import com.rs.utils.Utils;

public class TormentedDemonCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
        return new Object[]{"Tormented demon"};
    }

    @Override
    public int attack(Npc npc, Entity target) {
        final NpcCombatDefinitions definitions = npc.getCombatDefinitions();

        TormentedDemon demon = (TormentedDemon) npc;
        int hit;
        int attackStyle = demon.getFixedAmount() == 0 ? Utils.getRandom(2) : demon.getFixedCombatType();
        if (demon.getFixedAmount() == 0) demon.setFixedCombatType(attackStyle);
        switch (attackStyle) {
            case 0:
                if (npc.withinDistance(target, 3)) {
                    hit = getRandomMaxHit(npc, 189, NpcCombatDefinitions.MELEE, target);
                    npc.setNextAnimation(new Animation(10922));
                    npc.setNextGraphics(new Graphics(1886));
                    delayHit(npc, 1, target, getMeleeHit(npc, hit));
                }
                return definitions.getAttackDelay();
            case 1:
                hit = getRandomMaxHit(npc, 270, NpcCombatDefinitions.MAGIC, target);
                npc.setNextAnimation(new Animation(10918));
                npc.setNextGraphics(new Graphics(1883, 0, 96 << 16));
                World.sendProjectile(npc, target, 1884, 34, 16, 30, 35, 16, 0);
                delayHit(npc, 1, target, getMagicHit(npc, hit));
                break;
            case 2:
                hit = getRandomMaxHit(npc, 270, NpcCombatDefinitions.RANGE, target);
                npc.setNextAnimation(new Animation(10919));
                npc.setNextGraphics(new Graphics(1888));
                World.sendProjectile(npc, target, 1887, 34, 16, 30, 35, 16, 0);
                delayHit(npc, 1, target, getRangeHit(npc, hit));
                break;
        }
        demon.setFixedAmount(demon.getFixedAmount() + 1);
        return definitions.getAttackDelay();
    }
}

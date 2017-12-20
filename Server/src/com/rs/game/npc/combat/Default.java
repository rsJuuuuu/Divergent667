package com.rs.game.npc.combat;

import com.rs.game.npc.Npc;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;
import com.rs.game.npc.data.NpcCombatDefinitions;

public class Default extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { "Default" };
	}

	@Override
	public int attack(Npc npc, Entity target) {
		NpcCombatDefinitions defs = npc.getCombatDefinitions();
		int attackStyle = defs.getAttackStyle();
		if (attackStyle == NpcCombatDefinitions.MELEE) {
			delayHit(
					npc,
					0,
					target,
					getMeleeHit(
							npc,
							getRandomMaxHit(npc, defs.getMaxHit(), attackStyle,
									target)));
		} else {
			int damage = getRandomMaxHit(npc, defs.getMaxHit(), attackStyle,
					target);
			delayHit(
					npc,
					2,
					target,
                    attackStyle == NpcCombatDefinitions.RANGE ? getRangeHit(
							npc, damage) : getMagicHit(npc, damage));
			if (defs.getAttackProjectile() != -1)
				World.sendProjectile(npc, target, defs.getAttackProjectile(),
						41, 16, 41, 35, 16, 0);
		}
		if (defs.getAttackGfx() != -1)
			npc.setNextGraphics(new Graphics(defs.getAttackGfx()));
		npc.setNextAnimation(new Animation(defs.getAttackEmote()));
		return defs.getAttackDelay();
	}
}

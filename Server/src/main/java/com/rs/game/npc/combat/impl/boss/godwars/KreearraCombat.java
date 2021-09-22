package com.rs.game.npc.combat.impl.boss.godwars;

import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.world.*;
import com.rs.utils.Utils;

public class KreearraCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 6222 };
	}

	@Override
	public int attack(Npc npc, Entity target) {
		final NpcCombatDefinitions defs = npc.getCombatDefinitions();
		if (!npc.isUnderCombat()) {
			npc.setNextAnimation(new Animation(6997));
			delayHit(
					npc,
					1,
					target,
					getMeleeHit(
							npc,
							getRandomMaxHit(npc, 260,
									NpcCombatDefinitions.MELEE, target)));
			return defs.getAttackDelay();
		}
		npc.setNextAnimation(new Animation(6976));
		for (Entity t : npc.getPossibleTargets()) {
			if (Utils.getRandom(2) == 0)
				sendMagicAttack(npc, t);
			else {
				delayHit(
						npc,
						1,
						t,
						getRangeHit(
								npc,
								getRandomMaxHit(npc, 720,
										NpcCombatDefinitions.RANGE, t)));
				World.sendProjectile(npc, t, 1197, 41, 16, 41, 35, 16, 0);
				WorldTile teleTile = t;
				for (int trycount = 0; trycount < 10; trycount++) {
					teleTile = new WorldTile(t, 2);
					if (World.canMoveNPC(t.getPlane(), teleTile.getX(),
							teleTile.getY(), t.getSize()))
						break;
				}
				t.setNextWorldTile(teleTile);
			}
		}
		return defs.getAttackDelay();
	}

	private void sendMagicAttack(Npc npc, Entity target) {
		npc.setNextAnimation(new Animation(6976));
		for (Entity t : npc.getPossibleTargets()) {
			delayHit(
					npc,
					1,
					t,
					getMagicHit(
							npc,
							getRandomMaxHit(npc, 210,
									NpcCombatDefinitions.MAGIC, t)));
			World.sendProjectile(npc, t, 1198, 41, 16, 41, 35, 16, 0);
			target.setNextGraphics(new Graphics(1196));
		}
	}
}

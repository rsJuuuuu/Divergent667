package com.rs.game.npc.combat.impl.boss.godwars;

import com.rs.game.npc.Npc;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.ForceTalk;
import com.rs.game.world.World;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.utils.Utils;

public class GeneralGraardorCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 6260 };
	}

	@Override
	public int attack(final Npc npc, final Entity target) {
		final NpcCombatDefinitions defs = npc.getCombatDefinitions();
		if (Utils.getRandom(4) == 0) {
			switch (Utils.getRandom(10)) {
			case 0:
				npc.setNextForceTalk(new ForceTalk("You dare enter here?"));
				npc.playSound(3219, 2);
				break;
			case 1:
				npc.setNextForceTalk(new ForceTalk("Brargh!"));
				npc.playSound(3209, 2);
				break;
			case 2:
				npc.setNextForceTalk(new ForceTalk("Break their bones!"));
				break;
			case 3:
				npc.setNextForceTalk(new ForceTalk("For the glory of Bandos!"));
				break;
			case 4:
				npc.setNextForceTalk(new ForceTalk("Split their skulls!"));
				npc.playSound(3229, 2);
				break;
			case 5:
				npc.setNextForceTalk(new ForceTalk(
						"We feast on the bones of our enemies tonight!"));
				npc.playSound(3206, 2);
				break;
			case 6:
				npc.setNextForceTalk(new ForceTalk("CHAAARGE!"));
				npc.playSound(3220, 2);
				break;
			case 7:
				npc.setNextForceTalk(new ForceTalk("Crush them underfoot!"));
				npc.playSound(3224, 2);
				break;
			case 8:
				npc.setNextForceTalk(new ForceTalk("GRAAAAAAAAAR!"));
				npc.playSound(3207, 2);
				break;
			case 9:
				npc.setNextForceTalk(new ForceTalk(
						"FOR THE GLORY OF THE BIG HIGH WAR GOD!"));
				break;
			}
		}
		if (Utils.getRandom(2) == 0) { // range magical attack
			npc.setNextAnimation(new Animation(7063));
			for (Entity t : npc.getPossibleTargets()) {
				delayHit(
						npc,
						1,
						t,
						getRangeHit(
								npc,
								getRandomMaxHit(npc, 355,
										NpcCombatDefinitions.RANGE, t)));
				World.sendProjectile(npc, t, 1200, 41, 16, 41, 35, 16, 0);
			}
		} else { // melee attack
			npc.setNextAnimation(new Animation(defs.getAttackEmote()));
			delayHit(
					npc,
					0,
					target,
					getMeleeHit(
							npc,
							getRandomMaxHit(npc, defs.getMaxHit(),
									NpcCombatDefinitions.MELEE, target)));
		}
		return defs.getAttackDelay();
	}
}

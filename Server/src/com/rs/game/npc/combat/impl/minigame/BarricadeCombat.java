package com.rs.game.npc.combat.impl.minigame;

import com.rs.game.world.Entity;
import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScript;

public class BarricadeCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { "Barricade" };
	}

	/*
	 * empty
	 */
	@Override
	public int attack(Npc npc, Entity target) {
		return 0;
	}

}

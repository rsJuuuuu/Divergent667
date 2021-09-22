package com.rs.game.npc.impl.boss.godwars.zaros;

import com.rs.game.world.Entity;
import com.rs.game.world.WorldTile;
import com.rs.game.minigames.ZarosGodwars;
import com.rs.game.npc.Npc;

@SuppressWarnings("serial")
public class NexMinion extends Npc {

	private boolean hasNoBarrier;

	public NexMinion(int id, WorldTile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setCantFollowUnderCombat(true);
		setCapDamage(0);
	}

	public void breakBarrier() {
		setCapDamage(-1);
		hasNoBarrier = true;
	}

	@Override
	public void processNPC() {
		if (isDead() || !hasNoBarrier)
			return;
		if (!getCombat().process())
			checkAggressiveness();
	}

	@Override
	public void sendDeath(Entity source) {
		super.sendDeath(source);
		ZarosGodwars.moveNextStage();
	}

}

package com.rs.game.npc.impl.slayer;

import com.rs.cores.CoresManager;
import com.rs.game.npc.Npc;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("serial")
public class Wyrm extends Npc {

	public Wyrm(int id, WorldTile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setLureDelay(0);
		setCapDamage(300);
		setCombatLevel(269);
		this.setName("Ice Strykewyrm");
		setRun(true);
	}

	@Override
	public double getMagePrayerMultiplier() {
		return 0.3;
	}

	@Override
	public ArrayList<Entity> getPossibleTargets() {
		ArrayList<Entity> possibleTarget = new ArrayList<>();
		for (int regionId : getMapRegionsIds()) {
			List<Integer> playerIndexes = World.getRegion(regionId)
					.getPlayerIndexes();
			if (playerIndexes != null) {
				for (int npcIndex : playerIndexes) {
					Player player = World.getPlayers().get(npcIndex);
					if (player == null
							|| player.isDead()
							|| player.hasFinished()
							|| !player.isRunning()
							|| !player.withinDistance(this, 64)
							|| ((!isAtMultiArea() || !player.isAtMultiArea())
									&& player.getAttackedBy() != this && player
									.getAttackedByDelay() > System
									.currentTimeMillis())
							|| !clippedProjectile(player, false))
						continue;
					possibleTarget.add(player);
				}
			}
		}
		return possibleTarget;
	}

	@Override
	public void sendDeath(Entity source) {
		final NpcCombatDefinitions defs = getCombatDefinitions();
		resetWalkSteps();
		getCombat().removeTarget();
		setNextAnimation(null);
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					handleDeath();
					setNextAnimation(new Animation(defs.getDeathEmote()));
				} else if (loop >= defs.getDeathDelay()) {
					reset();
					setLocation(getSpawnTile());
					finish();
					setSpawnTask();
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}

	@Override
	public void setSpawnTask() {
		if (!hasFinished()) {
			reset();
			setLocation(getSpawnTile());
			finish();
		}
		final Npc npc = this;
		CoresManager.slowExecutor.schedule(() -> {
            setFinished(false);
            World.addNPC(npc);
            npc.setLastRegionId(0);
            World.updateEntityRegion(npc);
            loadMapRegions();
            checkMultiArea();
        }, getCombatDefinitions().getSpawnDelay() * 600,
				TimeUnit.MILLISECONDS);
	}
}
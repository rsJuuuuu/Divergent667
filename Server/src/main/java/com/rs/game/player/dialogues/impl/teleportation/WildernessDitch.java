package com.rs.game.player.dialogues.impl.teleportation;

import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.world.Animation;
import com.rs.game.world.ForceMovement;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class WildernessDitch extends Dialogue {

	private WorldObject ditch;

	@Override
	public void start() {
		ditch = (WorldObject) parameters[0];
		player.getInterfaceManager().sendInterface(382);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (interfaceId == 382 && componentId == 19) {
			player.stopAll();
			player.addStopDelay(4);
			player.setNextAnimation(new Animation(6132));
			final WorldTile toTile = new WorldTile(player.getX(),
					ditch.getY() + 2, ditch.getPlane());
			player.setNextForceMovement(new ForceMovement(
					new WorldTile(player), 1, toTile, 2, 0));
			final ObjectDefinitions objectDef = ditch.getDefinitions();
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					player.setNextWorldTile(toTile);
					player.setNextFaceWorldTile(new WorldTile(ditch
							.getCoordFaceX(objectDef.getSizeX(),
									objectDef.getSizeY(), ditch.getRotation()),
							ditch.getCoordFaceY(objectDef.getSizeX(),
									objectDef.getSizeY(), ditch.getRotation()),
							ditch.getPlane()));
					player.getControllerManager().startController("Wilderness");
				}
			}, 2);
		} else
			player.closeInterfaces();
		end();
	}

	@Override
	public void finish() {

	}

}

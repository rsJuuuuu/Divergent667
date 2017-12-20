package com.rs.game.player.controllers.impl;

import com.rs.Settings;
import com.rs.game.world.Animation;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.controllers.Controller;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.stringUtils.TimeUtils;

public class JailController extends Controller {

	@Override
	public void start() {
		if (player.getJailed() > TimeUtils.getTime())
			player.sendRandomJail(player);
	}

	@Override
	public void process() {
		if (player.getJailed() <= TimeUtils.getTime()) {
			player.getControllerManager().getController().removeController();
			player.getPackets().sendGameMessage(
					"Your account has been unmuted.", true);
			player.setNextWorldTile(Settings.RESPAWN_PLAYER_LOCATION);
		}
	}

	public static void stopController(Player p) {
		p.getControllerManager().getController().removeController();
	}

	@Override
	public boolean sendDeath() {
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				player.stopAll();
				if (loop == 0) {
					player.setNextAnimation(new Animation(836));
				} else if (loop == 1) {
					player.getPackets().sendGameMessage(
							"Oh dear, you have died.");
				} else if (loop == 3) {
					player.setNextAnimation(new Animation(-1));
					player.reset();
					player.setCanPvp(false);
					player.sendRandomJail(player);
					player.resetStopDelay();
				}
				loop++;
			}
		}, 0, 1);
		return false;
	}

	@Override
	public boolean login() {

		return false;
	}

	@Override
	public boolean logout() {

		return false;
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		player.getPackets().sendGameMessage(
				"You are currently jailed for your delinquent acts.");
		return false;
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		player.getPackets().sendGameMessage(
				"You are currently jailed for your delinquent acts.");
		return false;
	}

	@Override
	public boolean processObjectClick1(WorldObject object) {
		player.getPackets().sendGameMessage(
				"You cannot do any activities while being jailed.");
		return false;
	}

}

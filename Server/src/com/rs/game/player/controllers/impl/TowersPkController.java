package com.rs.game.player.controllers.impl;

import com.rs.Settings;
import com.rs.game.item.Item;
import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.player.content.Pots;
import com.rs.game.player.controllers.Controller;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.*;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TimeUtils;

public class TowersPkController extends Controller {

	private static WorldTile[] RESPAWN_PLACES = {
			new WorldTile(10008, 10009, 0), new WorldTile(10064, 10009, 0),
			new WorldTile(10008, 10065, 0), new WorldTile(10064, 10065, 0) };

	private static WorldTile[] ENTRACE_PLACES = {
			new WorldTile(10015, 10054, 0), new WorldTile(10015, 9998, 0),
			new WorldTile(10071, 9998, 0), new WorldTile(10071, 10054, 0) };

	private static int[] WIN_MATCH_SOUND_EFFECTS = { 121, 122, 123, 124 };

	/*
	 * climbed tower musics: Waste Defaced Slain to Waste
	 */
	private static int[] CLIMBED_MUSICS = new int[] { 426, 543, 856 };

	@Override
	public void start() {
		Wilderness.checkBoosts(player);
	}

	@Override
	public boolean canAttack(Entity target) {
		return canHit(target);
	}

	@Override
	public boolean canHit(Entity target) {
		if (target instanceof Npc || player.getPlane() != 1)
			return true;
		Player p2 = (Player) target;
        return Math.abs(player.getSkills().getCombatLevel()
                - p2.getSkills().getCombatLevel()) <= 10;
    }

	@Override
	public boolean login() {
		if (player.getPlane() != 0)
			player.setCanPvp(true);
		return false;
	}

	private static void yellChilds(String text) {
		for (Npc n : World.getNPCs()) {
			if (n == null || n.getId() < 6334 || n.getId() > 6337)
				continue;
			n.setNextForceTalk(new ForceTalk(text));
		}
	}

	@Override
	public boolean processObjectClick1(final WorldObject object) {
		if (object.getId() == 31529 && object.getPlane() == 0) {
			climbTower(object);
			return false;
		} else if (object.getId() == 31530 && object.getPlane() == 1) {
			player.getDialogueManager().startDialogue("SimpleMessage",
					"You're not allowed to climb these stairs.");
		} else if (object.getId() == 31529 && object.getPlane() == 1) {
			player.useStairs(-1,
					new WorldTile(player.getX(), player.getY(), 2), 0, 1);
			return false;
		} else if (object.getId() == 31530 && object.getPlane() == 2) {
			player.useStairs(-1,
					new WorldTile(player.getX(), player.getY(), 1), 0, 1);
			return false;
		} else if (object.getId() == 31651) {
			leaveTower();
			return false;
		}
		return true;
	}

	public static void enter(final Player player) {
		player.setNextWorldTile(ENTRACE_PLACES[Utils
				.random(ENTRACE_PLACES.length)]);
		player.getControllerManager().startController("TowersPkController");
		player.getPackets().sendGameMessage(
				"You find yourself on a beach near a giant abandoned tower.");
		player.getPackets()
				.sendGameMessage(
						"<col=ff0000>WARNING! IF YOU CLIMB THE TOWER YOU WILL BE ON A PVP AREA!");
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.getCutscenesManager().play("TowersPkCutscene");
			}
		}, 1);
	}

	public void leaveTower() {
		player.setNextWorldTile(Settings.RESPAWN_PLAYER_LOCATION);
		player.getPackets().sendGameMessage(
				"You start swimming and find yourself at home.");
		removeController();
	}

	@Override
	public void magicTeleported(int type) {
		if (player.isCanPvp())
			player.setCanPvp(false);
		removeController();
	}

	public void climbTower(WorldObject object) {
		if (player.getFollower() != null) {
			player.getPackets().sendGameMessage(
					"You can't familiars into field.");
			return;
		}
		if (containsItem("pouch")) {
			player.getPackets().sendGameMessage(
					"You can't take pouches into field.");
			return;
		}
		if (containsItem("extreme", "overload", "super prayer",
				"recover special")) {
			player.getPackets().sendGameMessage(
					"You can't take extreme potions into field.");
			return;
		}
		if (containsItem("spirit shield")) {
			player.getPackets().sendGameMessage(
					"You can't take spirit shields into field.");
			return;
		}
		if (containsItem("torva", "virtus", "pernix")) {
			player.getPackets().sendGameMessage(
					"You can't take nex armors into field.");
			return;
		}
		if (containsItem("statius", "vesta", "morrigan", "zuriel")) {
			player.getPackets().sendGameMessage(
					"You can't take pvp armors into field.");
			return;
		}
		if (containsItem("chaotic", "primal", "celestial", "sagittarian",
				"promethium", "spiritbloom", "tyrannoleather", "gorgonite",
				"runic", "megaleather")
				|| containsItem(19669, 20820)) {
			player.getPackets()
					.sendGameMessage(
							"You can't take overpowered dungeoneering items into field.");
			return;
		}
		if (containsItem("swift gloves", "spellcaster gloves", "goliath gloves")) {
			player.getPackets().sendGameMessage(
					"You can't take overpowered gloves into field.");
			return;
		}
		if (containsItem("ragefire boots", "glaiven boots", "steadfast boots")) {
			player.getPackets().sendGameMessage(
					"You can't take overpowered boots into field.");
			return;
		}
		if (containsItem(20769, 20771)) {
			player.getPackets().sendGameMessage(
					"You can't take overpowered capes into field.");
			return;
		}
		if (containsItem("ganodermic", "polypore")) {
			player.getPackets().sendGameMessage(
					"You can't take overpowered magic gear into field.");
			return;
		}
		if (containsItem("vanguard", "trickster", "battle-mage")) {
			player.getPackets().sendGameMessage(
					"You can't take hybrid minigame armors into field.");
			return;
		}

		if (player.getOverloadDelay() > 0)
			Pots.resetOverLoadEffect(player);
		player.setNextWorldTile(new WorldTile(object.getX() + 2, object.getY(),
				1));
		player.getMusicsManager().playMusic(
				CLIMBED_MUSICS[Utils.random(CLIMBED_MUSICS.length)]);
		player.addStopDelay(2);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				player.setCanPvp(true);
			}
		});
	}

	public boolean containsItem(String... names) {
		for (Item item : player.getEquipment().getItems().getItems()) {
			if (item == null)
				continue;
			String itemName = item.getDefinitions().getName().toLowerCase();
			for (String name : names)
				if (itemName.contains(name))
					return true;
		}
		for (Item item : player.getInventory().getItems().getItems()) {
			if (item == null)
				continue;
			String itemName = item.getDefinitions().getName().toLowerCase();
			for (String name : names)
				if (itemName.contains(name))
					return true;
		}
		return false;
	}

	public boolean containsItem(int... ids) {
		for (Item item : player.getEquipment().getItems().getItems()) {
			if (item == null)
				continue;
			int itemId = item.getId();
			for (int id : ids)
				if (itemId == id)
					return true;
		}
		for (Item item : player.getInventory().getItems().getItems()) {
			if (item == null)
				continue;
			int itemId = item.getId();
			for (int id : ids)
				if (itemId == id)
					return true;
		}
		return false;
	}

	@Override
	public boolean logout() {
		return false; // so doesnt remove script
	}

	@Override
	public boolean sendDeath() {
		player.addStopDelay(7);
		player.stopAll();
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					player.setNextAnimation(new Animation(836));
				} else if (loop == 1) {
					player.getPackets().sendGameMessage(
							"Oh dear, you have died.");
				} else if (loop == 3) {
					Player killer = player.getMostDamageReceivedSourcePlayer();
					if (killer != null) {
						killer.increaseKillCount(player);
						killer.getPackets()
								.sendMusicEffect(
										WIN_MATCH_SOUND_EFFECTS[Utils
												.random(WIN_MATCH_SOUND_EFFECTS.length)]);
						yellChilds(killer.getDisplayName() + " killed "
								+ player.getDisplayName() + "!");
					}
					player.reset();
					player.setCanPvp(false);
					player.setNextWorldTile(new WorldTile(RESPAWN_PLACES[Utils
							.random(RESPAWN_PLACES.length)], 1));
					player.setNextAnimation(new Animation(-1));
				} else if (loop == 4) {
					player.getPackets().sendMusicEffect(90);
					stop();
				}
				loop++;
			}
		}, 0, 1);
		return false;
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		if (player.getTeleBlockDelay() > TimeUtils.getTime()) {
			player.getPackets().sendGameMessage(
					"A mysterious force prevents you from teleporting.");
			return false;
		}
		return true;
	}

	@Override
	public boolean processObjectTeleport(WorldTile toTile) {
		if (player.getTeleBlockDelay() > TimeUtils.getTime()) {
			player.getPackets().sendGameMessage(
					"A mysterious force prevents you from teleporting.");
			return false;
		}
		return true;
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		if (player.getTeleBlockDelay() > TimeUtils.getTime()) {
			player.getPackets().sendGameMessage(
					"A mysterious force prevents you from teleporting.");
			return false;
		}
		return true;
	}

}

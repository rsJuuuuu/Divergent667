package com.rs.game.player.controllers.impl;

import com.rs.game.world.Animation;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.controllers.Controller;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

import java.util.LinkedList;

/**
 * Controlls the fightpits minigames.
 * 
 * @author Dj Khaled :troll:
 * 
 */
public class PitsController extends Controller {

	private LinkedList<Player> playing = new LinkedList<>();

	private LinkedList<Player> lobby = new LinkedList<>();

	private WorldTile[] GAME_TELEPORTS = {
			new WorldTile(2384 + Utils.random(28), 5133 + Utils.random(3), 0),
			new WorldTile(2410 + Utils.random(3), 5140 + Utils.random(17), 0),
			new WorldTile(2392 + Utils.random(10), 5141 + Utils.random(25), 0),
			new WorldTile(2383 + Utils.random(2), 5141 + Utils.random(14), 0),
			new WorldTile(2392 + Utils.random(11), 5145 + Utils.random(19), 0) };

	private WorldTile[] ORB_TELEPORTS = { new WorldTile(2399, 5171, 0),
			new WorldTile(2398, 5150, 0), new WorldTile(2384, 5157, 0),
			new WorldTile(2409, 5158, 0), new WorldTile(2411, 5137, 0),
			new WorldTile(2388, 5138, 0) };

	private WorldTile LOBBY_TELEPORT = new WorldTile(2395 + Utils.random(8),
			5170 + Utils.random(3), 0);

	private int reward;
	private String champion;

	private boolean checkAll() {
		if (!player.isRunning())
			return false;
		if (lobby.contains(player)) {
			lobby.remove(player);
			return false;
		} else if (playing.contains(player)) {
			playing.remove(player);
			return false;
		}
		player.setInfiniteStopDelay();
		sendInterfaces();
		return true;
	}

	@Override
	public void start() {
		if (!checkAll()) {
        }
	}

	@Override
	public void sendInterfaces() {
		updatePlayerConfigs(player);
		player.getInterfaceManager()
				.sendTab(
						player.getInterfaceManager().hasResizableScreen() ? 11
								: 8, 373);
	}

	private void updatePlayerConfigs(Player player) {
		if (playing.size() >= 2) {
			player.getPackets().sendConfig(560, playing.size());
		} else {
			player.getPackets().sendIComponentText(373, 0,
					"Current Champion: JaLYt-Ket-" + champion);
			player.getPackets().sendConfig(560, -1);
		}
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		if (!isInFightPits(player))
			removeController();
		else
			player.getDialogueManager().startDialogue("SimpleMessage",
					"A magical force prevents you from moving...");
		return true;
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		if (!isInFightPits(player))
			removeController();
		else
			player.getDialogueManager().startDialogue("SimpleMessage",
					"A magical force prevents you from teleporting...");
		return true;
	}

	public void startFight(final Player player) {
		playing.add(player);// Maybe this
		lobby.remove(player);
        if (player.getTemporaryAttributes().get("viewingOrb") != null && (Boolean) player.getTemporaryAttributes()
                .get("viewingOrb")) {
            resetOrb();
		}
		player.reset();
		player.stopAll();
		player.getDialogueManager().startDialogue("SimpleNPCMessage", 2618,
				"Please wait for my signal before fighting.");
		for (Player players : playing) {
			players.setNextWorldTile(new WorldTile(GAME_TELEPORTS[Utils
					.getRandom(GAME_TELEPORTS.length)]));
		}
		WorldTasksManager.schedule(new WorldTask() {
			int count = 3;

			@Override
			public void run() {
				if (count == 0) {
					player.getDialogueManager().startDialogue(
							"SimpleNPCMessage", 2618, "You may begin.");
					player.setCanPvp(true);
					player.resetStopDelay();
					reward *= (playing.size() * 2.40);
					this.stop();
				}
				count--;
			}
		}, 0, 2);
	}

	private void sendOrb() {
		player.getAppearance().switchHidden();
		player.getPackets().sendBlackOut(5);
        player.getTemporaryAttributes().put("viewingOrb", true);
        player.setInfiniteStopDelay();
	}

	private void resetOrb() {
		player.getAppearance().switchHidden();
		player.getPackets().sendBlackOut(0);
        player.getTemporaryAttributes().put("viewingOrb", false);
        player.resetStopDelay();
	}

	@Override
	public boolean processButtonClick(int interfaceId, int componentId,
			int slotId, int packetId) {
		if (interfaceId == 374) {
			switch (componentId) {
			case 5:
				resetOrb();
				player.setNextWorldTile(new WorldTile(LOBBY_TELEPORT));
				break;
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				for (int i = 0; i < 4; i++) {
					if (i + 11 == componentId) {
						sendOrb();
						player.setNextWorldTile(ORB_TELEPORTS[i]);
					}
				}
				break;
			}
		}
		return true;
	}

	@Override
	public boolean processObjectClick1(WorldObject object) {
        return object.getId() == 6917;
    }

	private void remainingPlayersCheck(Player player) {
		if (player == null)
			return;
		if (playing.size() == 1) {
			playing.clear();
			lobby.add(player);
			player.setCanPvp(false);
			champion = player.getDisplayName();
			player.getInventory().addItem(new Item(6529, reward));
			player.setNextWorldTile(LOBBY_TELEPORT);
			player.getPackets().sendGameMessage(
					"Congratulations! You have received approximatly " + reward
							+ " tokkul.", true);
		}
	}

	@Override
	public boolean sendDeath() {
		player.addStopDelay(7);
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
					player.setNextWorldTile(LOBBY_TELEPORT);
					playing.remove(player);
					lobby.add(player);
					for (Player player : lobby)
						updatePlayerConfigs(player);
					for (Player player : playing)
						updatePlayerConfigs(player);
					remainingPlayersCheck(playing.get(0));
					stop();
				}
				loop++;
			}
		}, 0, 1);
		return false;
	}

	@Override
	public boolean login() {
		player.setNextWorldTile(new WorldTile(LOBBY_TELEPORT));
		return false; // so doesnt remove script
	}

	@Override
	public boolean logout() {
		if (lobby.contains(player)) {
			lobby.remove(player);
			return false;
		} else if (playing.contains(player)) {
			playing.remove(player);
			return false;
		}
		return false; // so doesnt remove script
	}

	public static boolean isInFightPits(Player player) {
		return player.getX() >= 2374 && player.getY() >= 5129
				&& player.getX() <= 2424 && player.getY() <= 5168;
	}
}

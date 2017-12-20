package com.rs.game.player.controllers.impl;

import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.WorldTile;
import com.rs.game.minigames.CastleWars;
import com.rs.game.minigames.War;
import com.rs.game.minigames.War.Rule;
import com.rs.game.player.Player;
import com.rs.game.player.actions.combat.PlayerCombat;
import com.rs.game.player.content.Foods.Food;
import com.rs.game.player.content.Pots.Pot;
import com.rs.game.player.controllers.Controller;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class ClanWarsController extends Controller {

	War war;

	@Override
	public void start() {
		war = (War) getArguments()[0];
		player.setCanPvp(true);
		if (player.getCurrentFriendChat().isChallenger()) {
			player.setNextWorldTile(new WorldTile(war.getBaseX() + war.getArena().getIncreaseInTeamAX(), war.getBaseY() + war.getArena().getIncreaseInTeamAY(), 0));
			war.getChallengerTeam().add(player);
		} else {
			player.setNextWorldTile(new WorldTile(war.getBaseX() + war.getArena().getIncreaseInTeamBX(), war.getBaseY() + war.getArena().getIncreaseInTeamBY(), 0));
			war.getOpponentTeam().add(player);
		}
		sendInterfaces();
	}

	@Override
	public void sendInterfaces() {
		updatePlayers(player);
		player.getInterfaceManager().sendTab(player.getInterfaceManager().hasResizableScreen() ? 10 : 19, 265);
	}

	@Override
	public boolean canEat(Food food) {
		if (war.isSet(Rule.BAN_EAT)) {
			player.getPackets().sendGameMessage(
					"You can't eat anything during this war.");
			return false;
		}
		return true;
	}

	@Override
	public boolean canPot(Pot pot) {
		if (war.isSet(Rule.BAN_DRINK)) {
			player.getPackets().sendGameMessage(
					"You can't drink anything during this war.");
			return false;
		}
		return true;
	}

	@Override
	public boolean keepCombating(Entity victim) {
		boolean isRanging = PlayerCombat.isRanging(player) != 0;
		if (!war.isCanCommence()) {
			player.getPackets().sendGameMessage("The war hasn't started yet.", true);
			return false;
		} else if (player.getCurrentFriendChat().getPlayers().contains(victim)) {
			player.getPackets().sendGameMessage("You can't attack your own team members.", true);
			return false;
		} else if (player.getCombatDefinitions().getSpellId() > 0 && war.isSet(Rule.NO_MAGIC)) {
			player.getPackets().sendGameMessage("You can't use magic attacks during this war.", true);
			return false;
		} else if (isRanging && war.isSet(Rule.BAN_RANGE)) {
			player.getPackets().sendGameMessage("You can't use range attacks during this war.", true);
			return false;
		} else if (!isRanging && war.isSet(Rule.BAN_MELEE) && player.getCombatDefinitions().getSpellId() <= 0) {
			player.getPackets().sendGameMessage("You can't use melee attacks during this war.", true);
			return false;
		}
		return true;
	}

	@Override
	public boolean processButtonClick(int interfaceId, int componentId,
			int slotId, int packetId) {
		switch (interfaceId) {
		case 271:
			if (war.isSet(Rule.BAN_PRAY)) {
				player.getPackets().sendGameMessage("You can't use prayers during this war.");
				return false;
			}
			return true;
		}
		return true;
	}

	@Override
	public boolean processMagicTeleport(WorldTile toTile) {
		player.getDialogueManager().startDialogue("SimpleDialouge", "You can't teleport from this battle. Use the portals you came from to leave.");
		return false;
	}

	@Override
	public void process() {
	}

	@Override
	public boolean processItemTeleport(WorldTile toTile) {
		player.getDialogueManager().startDialogue("SimpleDialouge", "You can't teleport from this battle. Use the portals you came from to leave.");
		return false;
	}

	@Override
	public boolean processObjectTeleport(WorldTile toTile) {
		return true;
	}

	@Override
	public boolean sendDeath() {
		player.addStopDelay(7);
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					player.setNextAnimation(new Animation(836));
				} else if (loop == 1) {
					player.getPackets().sendGameMessage("Oh dear, you have died.");
				} else if (loop == 3) {
					player.getEquipment().init();
					player.getInventory().init();
					player.reset();
					player.setCanPvp(false);
					teleportPlayer(player);
					player.setNextAnimation(new Animation(-1));
					if (player.getCurrentFriendChat().isChallenger()) {
						war.getChallengerTeam().remove(player);
						war.getOpponentTeamKills().add(player);
					} else {
						war.getOpponentTeam().remove(player);
						war.getChallengerTeamKills().add(player);
					}
					updatePlayers(player);
				} else if (loop == 4) {
					player.getPackets().sendMusicEffect(90);
					stop();
				}
				loop++;
			}
		}, 0, 1);
		return false;
	}
	//5 this 11 that
	//7 ths 13 that
	private void updatePlayers(Player player) {
		if (player.getCurrentFriendChat().isChallenger()) {
			for (Player players : war.getChallengerTeam()) {
				players.getPackets().sendIComponentText(265, 5, Integer.toString(war.getChallengerTeam().size()));
				players.getPackets().sendIComponentText(265, 11, Integer.toString(war.getOpponentTeam().size()));
				players.getPackets().sendIComponentText(265, 7, Integer.toString(war.getChallengerTeamKills().size()));
				players.getPackets().sendIComponentText(265, 13, Integer.toString(war.getOpponentTeamKills().size()));
			}
		} else {
			for (Player players : war.getOpponentTeam()) {
				players.getPackets().sendIComponentText(265, 5, Integer.toString(war.getOpponentTeam().size()));
				players.getPackets().sendIComponentText(265, 11, Integer.toString(war.getChallengerTeam().size()));
				players.getPackets().sendIComponentText(265, 7, Integer.toString(war.getOpponentTeamKills().size()));
				players.getPackets().sendIComponentText(265, 13, Integer.toString(war.getChallengerTeamKills().size()));
			}
		}
	}

	private void teleportPlayer(Player player) {
		if (player.getCurrentFriendChat().isChallenger())
			player.setNextWorldTile(new WorldTile(war.getBaseX() + war.getArena().getChallengerDeathLocX(), war.getBaseY() + war.getArena().getChallengerDeathLocY(), 0));
		else
			player.setNextWorldTile(new WorldTile(war.getBaseX() + war.getArena().getOpponentDeathLocX(), war.getBaseY() + war.getArena().getOpponentDeathLocY(), 0));
	}

	@Override
	public boolean login() {
		removeController();
		return false;
	}

	@Override
	public boolean logout() {
		player.setLocation(new WorldTile(CastleWars.LOBBY, 2));
		return true;
	}

}

package com.rs.game.minigames;

import com.rs.cores.CoresManager;
import com.rs.game.world.RegionBuilder;
import com.rs.game.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

/**
 * Handles everything related to war.
 * @author Own4g3
 *
 */
public class War extends TimerTask {

	/**
	 * Arena in which the teams are going to fight.
	 * @author Own4g3
	 *
	 */
	public enum Arena {
		CLAN_WARS_CLASSIC(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), 
		PLATEAU(1, 353, 736, 59, 13, 60, 53, 27, 22, 27, 44),
		FORSAKEN_QUARRY(2, 360, 688, 11, 11, 53, 54, 28, 32, 36, 32), 
		BLASTED_FOREST(3, 360, 704, 12, 8, 50, 55, 13, 29, 49, 35), 
		TURRETS(4, 336, 688, 43, 6, 20, 121, 42, 2, 21, 125);

		private final int config, fromRegionX, fromRegionY, challengerStartLocX, challengerStartLocY, opponentStartLocX, opponentStartLocY, challengerDeathLocX, challengerDeathLocY, opponentDeathLocX, opponentDeathLocY;

		Arena(int config, int fromRegionX, int fromRegionY, int challengerStartLocX, int challengerStartLocY, int opponentStartLocX, int opponentStartLocY, int challengerDeathLocX, int challengerDeathLocY, int opponentDeathLocX, int opponentDeathLocY) {
			this.config = config;
			this.fromRegionX = fromRegionX;
			this.fromRegionY = fromRegionY;
			this.challengerStartLocX = challengerStartLocX;
			this.challengerStartLocY = challengerStartLocY;
			this.opponentStartLocX = opponentStartLocX;
			this.opponentStartLocY = opponentStartLocY;
			this.challengerDeathLocX = challengerDeathLocX;
			this.challengerDeathLocY = challengerDeathLocY;
			this.opponentDeathLocX = opponentDeathLocX;
			this.opponentDeathLocY = opponentDeathLocY;
		}

		public int getFromRegionX() {
			return fromRegionX;
		}

		public int getFromRegionY() {
			return fromRegionY;
		}

		public int getIncreaseInTeamAX() {
			return challengerStartLocX;
		}

		public int getIncreaseInTeamAY() {
			return challengerStartLocY;
		}

		public int getIncreaseInTeamBX() {
			return opponentStartLocX;
		}

		public int getIncreaseInTeamBY() {
			return opponentStartLocY;
		}

		public int getOpponentDeathLocY() {
			return opponentDeathLocY;
		}

		public int getChallengerDeathLocY() {
			return challengerDeathLocY;
		}

		public int getChallengerDeathLocX() {
			return challengerDeathLocX;
		}

		public int getOpponentDeathLocX() {
			return opponentDeathLocX;
		}

		public int getConfig() {
			return config;
		}
	}

	/**
	 * War stages.
	 * @author Own4g3
	 *
	 */
	public enum Stage {
		SETUP, STARTED, FINISHED
	}

	/**
	 * War rules.
	 * @author Maxi
	 *
	 */
	public enum Rule {

		LOOSE_ITEMS(5283, 1, 116), 
		BAN_MELEE(5284, 1, 120), 
		BAN_RANGE(5285, 1, 128), 
		STANDARD_SPELLS_ONLY(5286, 1, 122),
		BINDS_ONLY(5286, 2, 122), 
		NO_MAGIC(5286, 3 , 122), 
		BAN_SUMMON(5287, 1 , 132), 
		BAN_EAT(5288, 1 , 134), 
		BAN_DRINK(5289, 1 , 136), 
		BAN_PRAY(5290, 1 , 130);

		private final int toggle;
		private final int configId;
		private final int value;

		Rule(int configId, int value, int toggle) {
			this.configId = configId;
			this.value = value;
			this.toggle = toggle;
		}

		public int getToggle() {
			return toggle;
		}

		public int getConfigId() {
			return configId;
		}

		public int getValue() {
			return value;
		}
	}

	/**
	 * Arena in which the teams are going to fight.
	 */
	private Arena arena = Arena.CLAN_WARS_CLASSIC;

	/**
	 * War stages.
	 */
	private Stage stage = Stage.SETUP;

	/**
	 * A list to store war rules.
	 */
	private List<Rule> rules = new ArrayList<>();

	/**
	 * Time limit.
	 */
	private int limit;

	/**
	 * Config for time.
	 */
	private int limitIndex;

	/**
	 * Config for goal(How many players to kill).
	 */
	private int goalIndex = 11;

	/**
	 * Coords in which the area is going to be created.
	 */
	private transient int[] mapBaseCoords;

	/**
	 * Time remaning to start the war.
	 */
	private int countdown;

	/**
	 * If can start the battle.
	 */
	private boolean canCommence;

	/**
	 * A list to store challenger's clan players
	 */
	private List<Player> challengerTeam = new ArrayList<>();

	/**
	 * A list to store opponent's clan players. 
	 */
	private List<Player> opponentTeam = new ArrayList<>();

	/**
	 * A list to store challenger's clan players
	 */
	private List<Player> challengerTeamKills = new ArrayList<>();

	/**
	 * A list to store opponent's clan players. 
	 */
	private List<Player> opponentTeamKills = new ArrayList<>();

	/**
	 * Time limit (In seconds)
	 */
	private int[] timeLimit = {
			5, 10, 30, 60, 90, 120, 150, 180, 240, 300, 360, 480, 1
	};

	/**
	 * Goals (How many to kill) 0 = knock out. 1 = most kills at end.
	 */
	private int[] victory = {
			0, 25, 50, 100, 200, 400, 750, 1000, 2500, 5000, 10000, 1
	};

	/**
	 * Toggles the rule.
	 * 
	 * @param rule The rule to be toggled.
	 */
	public void toggle(Player player, Player other, Rule rule) {
		if (rules.contains(rule)) {
			rules.remove(rule);
			sendConfigs(player, other, rule.getConfigId(), 0);
		} else {
			switch (rule) {
			case BINDS_ONLY:
				rules.remove(Rule.STANDARD_SPELLS_ONLY);
				break;
			case NO_MAGIC:
				rules.remove(Rule.BINDS_ONLY);
				break;
			}
			rules.add(rule);
			sendConfigs(player, other, rule.getConfigId(), rule.getValue());
		}
	}

	/**
	 * Handles interface click.
	 *  
	 * @param player The player.
	 * @param other The other player.
	 * @param button The button id.
	 * @param slotId The slot id.
	 */
	public void onClick(Player player, Player other, int button, int slotId) {
        player.getTemporaryAttributes().remove("warAccepted");
        int value = 0;
		for (int i = 22; i < 59; i += 3) {
			if (button == i) {
				sendConfigs(player, other, 5280, value);
				setGoalIndex(value);
				value = 0;
			}
			value++;
		}
		int value1 = 0;
		for (int i = 57; i < 96; i += 3) {
			if (button == i) {
				sendConfigs(player, other, 5281, value1);
				setLimitIndex(value);
				value1 = 0;
			}
			value1++;
		}
		switch (button) {
		case 20:
			sendConfigs(player, other, 5280, 0);
			setGoalIndex(0);
			return;
		case 56:
			sendConfigs(player, other, 5280, 15);
			setGoalIndex(11);
			return;
		case 100:
			sendConfigs(player, other, 5281, 16);
			setLimitIndex(11);
			return;
		case 122:
			if (!rules.contains(Rule.STANDARD_SPELLS_ONLY) && !rules.contains(Rule.BINDS_ONLY) && !rules.contains(Rule.NO_MAGIC)) {
				rules.add(Rule.STANDARD_SPELLS_ONLY);
				sendConfigs(player, other, Rule.STANDARD_SPELLS_ONLY.getConfigId(), Rule.STANDARD_SPELLS_ONLY.getValue());
			} else if (rules.contains(Rule.STANDARD_SPELLS_ONLY)) {
				toggle(player, other, Rule.BINDS_ONLY);
			} else {
				toggle(player, other, Rule.NO_MAGIC);
			}
			return;
		case 109:
			player.getPackets().sendGameMessage("This is not added.");
			return;
		case 141:
			if (slotId == 3)
				arena = Arena.CLAN_WARS_CLASSIC;
			else if (slotId == 7)
				arena = Arena.PLATEAU;
			else if (slotId == 11)
				arena = Arena.FORSAKEN_QUARRY;
			else if (slotId == 15)
				arena = Arena.BLASTED_FOREST;
			else if (slotId == 19)
				arena = Arena.TURRETS;
			return;
		case 143:
            player.getTemporaryAttributes().put("warAccepted", other);
            player.getPackets().sendConfigByFile(5293, 1);
			other.getPackets().sendGameMessage("Other player has accepted.", true);
            if (player == other.getTemporaryAttributes().get("warAccepted")) {
                player.getTemporaryAttributes().remove("warAccepted");
                other.getTemporaryAttributes().remove("warAccepted");
                commenceWar(player, other);
			}
			return;
		}
		for (Rule rule : Rule.values()) {
			if (button == rule.getToggle()) {
				toggle(player, other, rule);
				break;
			}
		}
	}

	private void sendConfigs(Player player, Player other, int config, int value) {
		player.getPackets().sendConfigByFile(config, value);
		other.getPackets().sendConfigByFile(config, value);
	}

	private void commenceWar(Player player, Player other) {
		stage = Stage.STARTED;
		createArea(player, other, arena.getFromRegionX(), arena.getFromRegionY(), 16, 16);
		countdown = 120;
		limit = timeLimit[getLimitIndex()];
		CoresManager.fastExecutor.scheduleAtFixedRate(this, 1000, 1000);
		for (Player players : player.getCurrentFriendChat().getPlayers()) {
			if (players != player) {
				players.getPackets().sendGameMessage("<col=ff0000>Your clan has been challenged to a clan war!", true);
				players.getPackets().sendGameMessage("<col=ff0000>Step through the purple portal in the Challenge Hall.", true);
				players.getPackets().sendGameMessage("<col=ff0000>Battle will commence in 2 minutes.", true);
			}
		}
		for (Player players : other.getCurrentFriendChat().getPlayers()) {
			if (players != other) {
				players.getPackets().sendGameMessage("<col=ff0000>Your clan has been challenged to a clan war!", true);
				players.getPackets().sendGameMessage("<col=ff0000>Step through the purple portal in the Challenge Hall.", true);
				players.getPackets().sendGameMessage("<col=ff0000>Battle will commence in 2 minutes.", true);
			}
		}
	}

	/**
	 * Creates the area.
	 * 
	 * @param fromRegionX From which region of x.
	 * @param fromRegionY From which region of y.
	 * @param widthRegions Width of the regions.
	 * @param heightRegions Height of the regions.
	 */
	public void createArea(final Player player, final Player other, final int fromRegionX, final int fromRegionY, final int widthRegions, final int heightRegions) {
		CoresManager.slowExecutor.execute(() -> {
            try {
                mapBaseCoords = RegionBuilder.findEmptyMap(widthRegions, heightRegions);
                RegionBuilder.copyAllPlanesMap(fromRegionX, fromRegionY, mapBaseCoords[0], mapBaseCoords[1], 16);
                startController(player);
                startController(other);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Error e) {
                e.printStackTrace();
            }

        });
	}

	/**
	 * Teleports the player to arena.
	 * 
	 * @param player The player to teleport.
	 */
	public void startController(Player player) {
		player.getControllerManager().startController("ClanWarsController", this);
	}

	@Override
	public void run() {
		if (!isCanCommence()) {
			countdown--;
			updateScreen();
			return;
		}
		if (countdown == 0) {
			for (Player players : challengerTeam)
				players.getPackets().sendGameMessage("The war has been started.");
			setCanCommence(true);
		}
		if (timeLimit[getLimitIndex()] != 0) {
			limit--;
			if (limit == 0) {
				endWar();
				cancel();
			}
		}
		if (victory[getGoalIndex()] != 0) {
			if (challengerTeamKills.size() == victory[getGoalIndex()] || opponentTeamKills.size() == victory[getGoalIndex()]) {
				cancel();
				endWar();
			}
		}
		if (challengerTeam.size() == 0 || opponentTeam.size() == 0) {
			cancel();
			endWar();
		}
	}

	private void updateScreen() {
		for (Player players : challengerTeam)
			players.getPackets().sendIComponentText(265, 16, "" +countdown + "s");
		for (Player players : opponentTeam)
			players.getPackets().sendIComponentText(265, 16, "" +countdown + "s");
	}

	private void endWar() {
		if (challengerTeam.size() < opponentTeam.size()) {
			for (Player players : opponentTeam) {
				players.getPackets().sendGameMessage("Your clan won.");
				players.getControllerManager().startController("ClanReqController");
			}
			for (Player players : challengerTeamKills) {
				players.getPackets().sendGameMessage("Your clan won.");
				players.getControllerManager().startController("ClanReqController");
			}
		} else {
			for (Player players : challengerTeam) {
				players.getPackets().sendGameMessage("Your clan won.");
				players.getControllerManager().startController("ClanReqController");
			}
			for (Player players : opponentTeamKills) {
				players.getPackets().sendGameMessage("Your clan won.");
				players.getControllerManager().startController("ClanReqController");
			}
		}
		challengerTeam.clear();
		opponentTeam.clear();
		challengerTeamKills.clear();
		opponentTeamKills.clear();
	}

	/**
	 * Gets the base X. X Coordinate of the area.
	 * @return
	 */
	public int getBaseX() {
		return mapBaseCoords[0] << 3;
	}

	/**
	 * Gets the base Y. Y Coordinate of the area.
	 * @return
	 */
	public int getBaseY() {
		return mapBaseCoords[1] << 3;
	}

	/**
	 * Sets the war stage.
	 * 
	 * @param stage The stage to set.
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}

	/**
	 * Gets the war stage.
	 * 
	 * @return stage
	 */
	public Stage getStage() {
		return stage;
	}

	/**
	 * Checks if that rule is set.
	 * 
	 * @param rule The rule to check.
	 * @return {@code True} If the rule is set, {@code false} if not.
	 */
	public boolean isSet(Rule rule) {
		return rules.contains(rules);
	}

	/**
	 * Gets the war arena.
	 * 
	 * @return arena
	 */
	public Arena getArena() {
		return arena;
	}

	/**
	 * Sets the war arena.
	 * 
	 * @param arena The arena in which teams are going to fight.
	 */
	public void setArena(Arena arena) {
		this.arena = arena;
	}

	public boolean isCanCommence() {
		return canCommence;
	}

	public void setCanCommence(boolean canCommence) {
		this.canCommence = canCommence;
	}

	public List<Player> getChallengerTeam() {
		return challengerTeam;
	}

	public List<Player> getOpponentTeam() {
		return opponentTeam;
	}

	public List<Player> getChallengerTeamKills() {
		return challengerTeamKills;
	}

	public List<Player> getOpponentTeamKills() {
		return opponentTeamKills;
	}

	public int getLimitIndex() {
		return limitIndex;
	}

	public void setLimitIndex(int limitConfig) {
		this.limitIndex = limitConfig;
	}

	public int getGoalIndex() {
		return goalIndex;
	}

	public void setGoalIndex(int goalConfig) {
		this.goalIndex = goalConfig;
	}

}

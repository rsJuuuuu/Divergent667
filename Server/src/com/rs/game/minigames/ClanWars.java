package com.rs.game.minigames;

import com.rs.game.world.RegionBuilder;
import com.rs.game.world.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.ArrayList;

public class ClanWars {

    private int kills, portalIndex;

    private long fightTime;

    private boolean[][] rules;

    private boolean allowedEnter, whiteTeam;

    private Player player, other;

    /**
     * Holds the team's members.
     */
    private ArrayList<Player> team;

    /**
     * Arranges and separates the teleports of each team via north, south, in
     * the following order Platue, Turrets, Quarry, Forest & Classic.
     */
    public static WorldTile[][] ARENA_TELEPORTS = {{new WorldTile(2883, 5941, 0), new WorldTile(2883, 5900, 0)}, {new WorldTile(2815, 5511, 0), new WorldTile(2891, 5515, 0)}, {new WorldTile(2993, 5558, 0), new WorldTile
			(2891, 5515, 0)}, {new WorldTile(2930, 5668, 0), new WorldTile(2892, 5641, 0)}, {new WorldTile(2883, 5941,
			0), new WorldTile(2883, 5900, 0)}};

    // x, x, y
    /**
     * Arranges the center coordinate of the arena, the corrdinates are arranged
     * in the following order. X, X, Y.
     */
    public static int[] ARENA_CENTER = {2882, 2911, 5663};

    /**
     * Arranges and separates the teleports of each team via north, south, in
     * the following order Platue, Turrets, Quarry, Forest, Classic.
     */
    public static WorldTile[][] DEATH_TELEPORTS = {{new WorldTile(2851, 5931, 0), new WorldTile(2851, 5909, 0)}, {new
			WorldTile(2815, 5511, 0), new WorldTile(2891, 5515, 0)}, // done
            {new WorldTile(2908, 5686, 0), new WorldTile(2915, 5537, 0)}, {new WorldTile(2929, 5667, 0), new
			WorldTile(2892, 5661, 0)}, {new WorldTile(2883, 5941, 0), new WorldTile(2883, 5900, 0)}};

    public static int[] KILLS_REQUIRED = {25, 50, 100, 200, 400, 750, 1000, 2000, 5000, 10000};
    // seconds
    public static double[] FIGHT_TIME = {0.05, 0.10, 0.30, 2.00, 2.30, 3.00, 4.00, 5.00, 6.00, 8.00, 8.00};

    public static WorldTile CLANWARS_LOBBY = new WorldTile(1, 1, 0);

    public ClanWars(Player player, Player other) {
        this.player = player;
        this.other = other;
        kills = 0;
        rules = new boolean[12][10];
        team = new ArrayList<>();
        rules[0][0] = true;
        ClanChallengeInterface.openInterface(player);
        ClanChallengeInterface.openInterface(other);
    }

    private void swapRule(Player target, int rule, int index) {
        boolean current = rules[rule][index];
        current = !current;
        if (player != target) other.getClanWars().swapRule(target, rule, index);
    }

    protected long calculateFightingTime() {
        for (int index = 60; index < 93; index += 3) {// time
            int calculatedHash = (60 - index) / 3;
            if (calculatedHash < 0) calculatedHash = 0;
            if (getRules(2, calculatedHash)) return (long) FIGHT_TIME[calculatedHash];
        }
        return 0;
    }

    public long getRequiredKills() {
        return KILLS_REQUIRED[getKillsHash()];
    }

    public int getKillsHash() {
        for (int i = 28; i < 52; i += 3) {// Victory
            int calculatedHash = (31 - i) / 3;
            if (calculatedHash < 0) calculatedHash = 0;
            if (getRules(0, calculatedHash)) return calculatedHash;
        }
        return 0;
    }

    public boolean getRules(int rule, int index) {
        return rules[rule][index];
    }

    public ArrayList<Player> getTeam() {
        return team;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void incrementKills(Player player, Player other) {
        this.kills++;
        ClanChallengeInterface.refreshClanInterface(player);
        if (!player.getClanWars().getRules(0, 0)) {
            if (player.getClanWars().getRules(0, 0) ?
                    other.getClanWars().getTeam().size() == 5 : other.getClanWars().getTeam().size() == 0)
                ClanChallengeInterface.sendWinningClan(player);
        } else if (player.getClanWars().getKills() == player.getClanWars().getRequiredKills())
            ClanChallengeInterface.sendWinningClan(player);

    }

    public void decrementKills() {
        this.kills--;
    }

    public long getFightTime() {
        return fightTime;
    }

    public void setFightTime(int fightTime) {
        this.fightTime = fightTime;
    }

    public void addFightTime(long fightTime) {
        this.fightTime = fightTime + TimeUtils.getTime();
    }

    public boolean isAllowedEnter() {
        return allowedEnter;
    }

    public void setAllowedEnter(boolean allowedEnter) {
        this.allowedEnter = allowedEnter;
    }

    public boolean isWhiteTeam() {
        return whiteTeam;
    }

    public void setWhiteTeam(boolean whiteTeam) {
        this.whiteTeam = whiteTeam;
    }

    public int getPortalIndex() {
        return portalIndex;
    }

    public void setPortalIndex(int portalIndex) {
        System.out.println(portalIndex);
        if (portalIndex < 0) portalIndex = 0;
        this.portalIndex = portalIndex;
    }

    public WorldTile getTeleportedArea() {
        return ARENA_TELEPORTS[portalIndex][whiteTeam ? 0 : 1];
    }

    public Player getOther() {
        return other;
    }

    public static class ClanChallengeInterface {

        /**
         * Opens the challenge interface.
         *
         * @param player - The player that is challenging
         */
        public static void openInterface(Player player) {
            if (player.getCurrentFriendChatOwner() == null) {
                player.getPackets().sendGameMessage("You need to be in a friend's chat to start a war.");
                return;
            } else if (player.getCurrentFriendChat().getRank(player.getUsername()) <= 2) {
                player.getPackets().sendGameMessage("You need to be a higher rank to start a war.");
                return;
            }
            player.getInterfaceManager().sendInterface(791);
            player.getPackets().sendUnlockIComponentOptionSlots(791, 141, 0, 63, 0);
        }

        /**
         * Start the battle based off regulated rules.
         *
         * @param player The white team's challenger.
         * @param other  The black team's challengee.
         */
        public static void beginBattle(final Player player, Player other) {
            player.getTemporaryAttributes().put("hasChallenged", true);
            if (other.getTemporaryAttributes().get("hasChallenged") == null) return;
            player.getCurrentFriendChat().sendMessage(player,
                    "The battle will begin in two minutes between " + player.getCurrentFriendChat().getChannelName()
                    + " and " + other.getCurrentFriendChat().getChannelName() + ".");
            other.getCurrentFriendChat().sendMessage(player,
                    "The battle will begin in two minutes between " + other.getCurrentFriendChat().getChannelName()
                    + " and " + player.getCurrentFriendChat().getChannelName() + ".");
            player.stopAll();
            for (Player teamPlayer : player.getCurrentFriendChat().getPlayers())
                teamPlayer.getClanWars().setAllowedEnter(true);
            WorldTasksManager.schedule(new WorldTask() {
                @Override
                public void run() {
                    if (!player.getClanWars().getRules(0, 0)) player.getClanWars().setAllowedEnter(false);
                    player.getClanWars().addFightTime(player.getClanWars().calculateFightingTime());
                    createDynamicArea(player);
                    enterPortal(player, player);
                }
            });
        }

        protected static void createDynamicArea(Player player) {
            RegionBuilder.createDynamicRegion(player.getClanWars().getTeleportedArea().getRegionId());
        }

        public static void enterPortal(final Player player, Player leader) {
            sendClanInterface(player);
            refreshClanInterface(player);
            for (Player team : leader.getClanWars().getTeam()) {
                if (team != null && !leader.getClanWars().getTeam().contains(player))
                    team.getClanWars().getTeam().add(player);
            }
            player.loadMapRegions();
            player.setNextWorldTile(leader.getClanWars().getTeleportedArea());
        }

        public static boolean processButtonClick(Player player, Player other, int interfaceId, int componentId, int
				slotId, int packetId) {
            if (interfaceId == 791) {
                for (int i = 25; i < 52; i += 3) {// Victory
                    if (componentId == i) player.getClanWars().swapRule(other, 0, (28 - i) / 3);
                }
                for (int i = 60; i < 93; i += 3) {
                    // time
                    if (componentId == i) player.getClanWars().swapRule(other, 2, (60 - i) / 3);
                }
                for (int i = 120; i < 136; i += 2) {
                    if (i != 122) {
                        // rulesThreeSwap();
                        continue;
                    }
                    if (componentId == i) player.getClanWars().swapRule(other, (i / 2) - 4, 0);
                }
                if (componentId == 141) {
                    for (int i = 3; i < 19; i += 4) {
                        if (i == slotId) player.getClanWars().setPortalIndex((i - 3) / 4);// need
                        // to
                        // save
                        // idx
                        // for
                        // death
                    }
                }
                if (componentId == 116)// items on death
                    player.getClanWars().swapRule(other, 3, 0);
                else if (componentId == 143)// accept
                    beginBattle(player, other);
                return true;
            }
            return false;
        }

        public static void sendWinningClan(Player leader) {
            for (Player player : leader.getClanWars().getTeam()) {
                player.getPackets().sendGameMessage("Your clan is victorious!");
            }
            Player other = leader.getClanWars().getOther();// used for loser
            // interface,
            for (Player player : other.getClanWars().getTeam()) {
                player.getPackets().sendGameMessage("Your clan has lost!");
            }
        }

        public static void sendClanInterface(Player player) {
            for (Player teamPlayer : player.getClanWars().getTeam()) {
                teamPlayer.getPackets().sendConfigByFile(5280, player.getClanWars().getKillsHash());
            }
        }

        public static void refreshClanInterface(Player player) {
			/*
			 * file: 5280, 3, 0 - Kills, index easy :p file: 5281, 7, 4 file:
			 * 5282, 8, 8 file: 5283, 9, 9 file: 5284, 10, 10 file: 5285, 11, 11
			 * file: 5286, 13, 12 file: 5287, 14, 14 file: 5288, 15, 15 file:
			 * 5289, 16, 16 file: 5290, 17, 17 file: 5291, 17, 0 file: 5292, 30,
			 * 26 file: 5293, 31, 31
			 */
        }

        public static void sendDrawInterface(Player leader) {
            for (Player player : leader.getClanWars().getTeam()) {
                player.getPackets().sendGameMessage("The war has ended in a draw!");
            }
            Player other = leader.getClanWars().getOther();// used for loser
            // interface,
            for (Player player : other.getClanWars().getTeam()) {
                player.getPackets().sendGameMessage("The war has ended in a draw!");
            }
        }
    }
}

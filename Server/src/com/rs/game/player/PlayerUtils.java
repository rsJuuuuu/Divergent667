package com.rs.game.player;

import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.utils.files.JSONParser;

import java.io.File;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Peng on 25.11.2016 15:24.
 */
public class PlayerUtils {

    private static final String PLAYER_PATH = "data/characters/";

    static {
        File playerPath = new File(PLAYER_PATH);
        if(!playerPath.exists()) {
            playerPath.mkdirs();
        }
    }

    public static HashSet<Player> getPlayersInArea(WorldTile centerTile, int radius) {
        HashSet<Player> inArea = new HashSet<>();
        List<Integer> playerIndexes = World.getRegion(centerTile.getRegionId()).getPlayerIndexes();
        if (playerIndexes == null) return inArea;
        for (int playerIndex : playerIndexes) {
            Player p2 = World.getPlayers().get(playerIndex);
            if (p2 == null || p2.isDead() || !p2.hasStarted() || p2.hasFinished() || !p2.withinDistance(centerTile, radius)) continue;
            inArea.add(p2);
        }
        return inArea;
    }

    /**
     * kick player
     */
    public boolean kickPlayer(String username) {
        Player other = findPlayer(username, false);
        if (other != null) {
            other.getSession().getChannel().close();
            World.removePlayer(other);
            return true;
        }
        return false;
    }

    /**
     * Attempt to get a player as object
     *
     * @param username     login name of this player
     * @param loadFromFile if they aren't in the world shall we load from disk?
     * @return player object
     */
    public static Player findPlayer(String username, boolean loadFromFile) {
        Player player;
        player = World.getPlayer(username);
        if (player == null && loadFromFile) //if the player wasn't logged in but we need them we will load from disk
            loadPlayer(username);
        return player;
    }

    /**
     * Is there a player file for this player?
     */
    public static boolean playerExists(String username) {
        return new File(PLAYER_PATH + username + ".json").exists();
    }

    /**
     * Load a player saved in json format
     *
     * @param username username of the player
     */
    public static Player loadPlayer(String username) {
        return (Player) JSONParser.load(PLAYER_PATH + username + ".json", Player.class);
    }

    /**
     * Save this player as json
     */
    public static void savePlayer(Player player) {
        JSONParser.save(player, PLAYER_PATH + player.getUsername() + ".json", Player.class);
    }
}

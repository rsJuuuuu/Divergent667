package com.rs.game.spawning;

import com.rs.game.npc.Npc;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.utils.Utils;
import com.rs.utils.files.DatabaseUtils;
import org.pmw.tinylog.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Peng on 15.10.2016.
 */
public class NpcSpawning {

    /**
     * Read all spawns and add them to the world
     */
    public static void init() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DatabaseUtils.openServerDatabase();
            if (connection == null) return;
            statement = connection.createStatement();
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS NPC_SPAWNS (ID_KEY INTEGER PRIMARY KEY AUTOINCREMENT, ID INT,"
                    + " X INT, Y INT, PLANE INT, DIRECTION INT, RANDOM_WALK BOOLEAN, CUSTOM_NAME TEXT)");
            ResultSet rs = statement.executeQuery("SELECT * FROM NPC_SPAWNS");
            int id, x, y, plane, direction;
            String customName;
            boolean randomWalk;
            Npc npc;
            while (rs.next()) {
                id = rs.getInt("id");
                x = rs.getInt("x");
                y = rs.getInt("y");
                plane = rs.getInt("plane");
                direction = rs.getInt("direction");
                customName = rs.getString("custom_name");
                randomWalk = rs.getBoolean("random_walk");
                npc = World.spawnNPC(id, new WorldTile(x, y, plane), randomWalk ? -1 : 0, true, false);
                npc.setDirection(Utils.getFaceDirection(Utils.DIRECTION_DELTA_X[direction], Utils
                        .DIRECTION_DELTA_Y[direction]));
                if (customName != null) npc.setName(customName);
            }
        } catch (SQLException e) {
            Logger.error(e);
        } finally {
            DatabaseUtils.closeDatabase(connection, statement);
        }
    }

    /**
     * Write a spawn to the database
     */
    public static void writeSpawn(int id, int x, int y, int plane, int direction, boolean randomWalk, String
            customName) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DatabaseUtils.openServerDatabase();
            if (connection == null) return;
            statement = connection.createStatement();
            statement.executeUpdate(
                    "INSERT INTO NPC_SPAWNS (ID,X,Y,PLANE,DIRECTION,RANDOM_WALK,CUSTOM_NAME) VALUES (" + id + "," + x
                    + ", " + y + "," + plane + ", " + direction + ", " + (randomWalk ? "1" : "0") + ", " + customName
                    + ")");
        } catch (SQLException e) {
            Logger.error(e);
        } finally {
            DatabaseUtils.closeDatabase(connection, statement);
        }
    }

    /**
     * Remove an added spawn from the database
     *
     * @param npc to remove
     */
    public static void removeSpawn(Npc npc) {
        WorldTile loc = npc.getSpawnTile();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DatabaseUtils.openServerDatabase();
            if (connection == null) return;
            statement = connection.createStatement();
            statement.executeUpdate(
                    "DELETE FROM NPC_SPAWNS WHERE ID = " + npc.getId() + " AND X = " + loc.getX() + " AND Y = "
                    + loc.getY() + " AND PLANE = " + loc.getPlane() + ";");
        } catch (SQLException e) {
            Logger.error(e);
        } finally {
            DatabaseUtils.closeDatabase(connection, statement);
        }
    }

}

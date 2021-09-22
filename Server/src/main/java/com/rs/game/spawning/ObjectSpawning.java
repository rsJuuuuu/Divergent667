package com.rs.game.spawning;

import com.rs.cache.Cache;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.utils.files.DatabaseUtils;
import org.pmw.tinylog.Logger;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Peng on 16.10.2016.
 */
public class ObjectSpawning {
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
                    "CREATE TABLE IF NOT EXISTS OBJECT_SPAWNS (ID_KEY INTEGER PRIMARY KEY " + "AUTOINCREMENT, ID "
                    + "INT, X INT, Y INT, PLANE INT, DIRECTION INT, TYPE INT, " + "CLIPPED BOOLEAN)");
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS OBJECT_REMOVED (ID_KEY INTEGER PRIMARY KEY " + "AUTOINCREMENT, ID "
                    + "INT, X INT, Y INT, PLANE INT, DIRECTION INT, TYPE INT, " + "CLIPPED BOOLEAN)");
            ResultSet rs = statement.executeQuery("SELECT * FROM OBJECT_SPAWNS");
            int id, x, y, plane, direction, type;
            boolean clipped;
            while (rs.next()) {
                id = rs.getInt("id");
                x = rs.getInt("x");
                y = rs.getInt("y");
                plane = rs.getInt("plane");
                direction = rs.getInt("direction");
                type = rs.getInt("type");
                clipped = rs.getBoolean("clipped");
                World.spawnObject(new WorldObject(id, type, direction, x, y, plane), clipped);
            }
            rs = statement.executeQuery("SELECT * FROM OBJECT_REMOVED");
            while (rs.next()) {
                id = rs.getInt("id");
                x = rs.getInt("x");
                y = rs.getInt("y");
                plane = rs.getInt("plane");
                direction = rs.getInt("direction");
                type = rs.getInt("type");
                clipped = rs.getBoolean("clipped");
                World.deleteObject(new WorldObject(id, type, direction, x, y, plane), clipped);
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
    public static void writeSpawn(int id, int x, int y, int plane, int direction, int type, boolean clipped) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DatabaseUtils.openServerDatabase();
            if (connection == null) return;
            statement = connection.createStatement();
            statement.executeUpdate(
                    "INSERT INTO OBJECT_SPAWNS (ID,X,Y,PLANE,DIRECTION,TYPE,CLIPPED) " + "VALUES" + " (" + id + "," + ""
                    + x + ", " + y + "," + plane + ", " + direction + ", " + type + ", " + (clipped ? "1" : "0") + ")");
        } catch (SQLException e) {
            Logger.error(e);
        } finally {
            DatabaseUtils.closeDatabase(connection, statement);
        }
    }

    /**
     * Write a spawn to the database
     */
    public static void writeRemove(int id, int x, int y, int plane, int direction, int type, boolean clipped) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DatabaseUtils.openServerDatabase();
            if (connection == null) return;
            statement = connection.createStatement();
            statement.executeUpdate(
                    "INSERT INTO OBJECT_REMOVED (ID,X,Y,PLANE,DIRECTION,TYPE,CLIPPED) " + "VALUES" + " (" + id + ","
                    + "" + x + ", " + y + "," + plane + ", " + direction + ", " + type + ", " + (clipped ? "1" : "0")
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
     * @param object to remove
     */
    public static void removeSpawn(WorldObject object) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DatabaseUtils.openServerDatabase();
            if (connection == null) return;
            statement = connection.createStatement();
            statement.executeUpdate(
                    "DELETE FROM OBJECT_SPAWNS WHERE ID = " + object.getId() + " AND X = " + object.getX() + " AND Y = "
                    + object.getY() + " AND PLANE = " + object.getPlane() + ";");
        } catch (SQLException e) {
            Logger.error(e);
        } finally {
            DatabaseUtils.closeDatabase(connection, statement);
        }
    }

    public static void main(String[] args) {
        try {
            Cache.init();
        } catch (IOException e) {
            e.printStackTrace();
        }
        init();
    }
}

package com.rs.utils.files;

import org.pmw.tinylog.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Peng on 15.10.2016.
 */
public class DatabaseUtils {

    public static Connection openServerDatabase() {
        return openDatabase("serverData.sqlite");
    }

    /**
     * Open a sqlLite db in the given location (from server path)
     *
     * @param path path to db
     * @return connection
     */
    private static Connection openDatabase(String path) {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:data/" + path);
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    /**
     * Close the connection and statement
     *
     * @param connection connection
     * @param statement  statement
     */
    public static void closeDatabase(Connection connection, Statement statement) {
        try {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            Logger.error(e);
        }
    }

}

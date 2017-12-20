package com.rs.tools.mapEditor;

import com.rs.cache.Cache;
import com.rs.game.world.WorldTile;
import com.rs.utils.files.DatabaseUtils;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import org.pmw.tinylog.Logger;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Peng on 16.10.2016.
 */
public class MapEditorController {

    private class ObjectSpawn {

        int id, x, y, plane, rotation, type;
        boolean clip;

        ObjectSpawn(int id, int x, int y, int plane, int rotation, int type, boolean clip) {
            this.x = x;
            this.y = y;
            this.plane = plane;
            this.rotation = rotation;
            this.type = type;
            this.clip = clip;
        }
    }

    private class NpcSpawn {
        int id, x, y, plane, rotation;
        boolean randomWalk;
        String customName;

        NpcSpawn(int id, int x, int y, int plane, int rotation, boolean randomWalk, String customName) {
            this.id = id;
            this.x = x;
            this.y = y;
            this.plane = plane;
            this.rotation = rotation;
            this.randomWalk = randomWalk;
            this.customName = customName;
        }
    }

    public Canvas mapCanvas;

    public AnchorPane mapPane;

    private Image mapImage;

    private HashMap<WorldTile, ArrayList<ObjectSpawn>> spawnedObjectMap = new HashMap<>();
    private HashMap<WorldTile, ArrayList<ObjectSpawn>> removedObjectMap = new HashMap<>();
    private HashMap<WorldTile, ArrayList<NpcSpawn>> npcSpawnsMap = new HashMap<>();

    private int viewRadius = 25;
    private double viewX = 3081;
    private double viewY = 3478;
    private int viewPlane = 0;

    private boolean needsRepaint = false;
    private boolean running = true;

    public MapEditorController() {
        try {
            Cache.init();
            mapImage = SwingFXUtils.toFXImage(ImageIO.read(new File("./data/map/map667_0.png")), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Runnable listener = () -> {
            while (running) {
                if (needsRepaint) doRepaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(listener).start();
    }

    public void doClose() {
        running = false;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * Init everything that uses javafx components
     */
    public void init() {
        loadObjects();
        mapCanvas.widthProperty().bind(mapPane.widthProperty());
        mapCanvas.heightProperty().bind(mapPane.heightProperty());
        mapPane.widthProperty().addListener((observable, oldValue, newValue) -> repaint());
        mapPane.heightProperty().addListener((observable, oldValue, newValue) -> repaint());
        repaint();
    }

    /**
     * Request a repaint for the canvas
     */
    private void repaint() {
        needsRepaint = true;
    }

    /**
     * Actually do the painting on the canvas
     */
    private void doRepaint() {
        needsRepaint = false;
        double tileSizeX = mapCanvas.getWidth() / viewRadius / 2;
        double tileSizeY = mapCanvas.getHeight() / viewRadius / 2;
        ArrayList<ObjectSpawn> objectSpawns;
        ArrayList<NpcSpawn> npcSpawns;
        WorldTile currentTile;
        GraphicsContext g = mapCanvas.getGraphicsContext2D();
        g.drawImage(mapImage,
                viewX - viewRadius,
                11264 - (viewY) - viewRadius,
                viewRadius * 2, viewRadius * 2, 0, 0, mapCanvas.getWidth(), mapCanvas.getHeight());

        for (int x = 0; x < viewRadius * 2; x++) {
            for (int y = 0; y < viewRadius * 2; y++) {
                currentTile = new WorldTile((int) viewX - viewRadius + x, (int) viewY - viewRadius + y, viewPlane);
                objectSpawns = spawnedObjectMap.get(currentTile);
                if (objectSpawns != null) {
                    g.setFill(Color.AZURE);
                    g.fillRect(x * tileSizeX, (viewRadius * 2 - y) * tileSizeY, tileSizeX, tileSizeY);
                    continue;
                }
                objectSpawns = removedObjectMap.get(currentTile);
                if (objectSpawns != null) {
                    g.setFill(Color.CRIMSON);
                    g.fillRect(x * tileSizeX, (viewRadius * 2 - y) * tileSizeY, tileSizeX, tileSizeY);
                    continue;
                }
                npcSpawns = npcSpawnsMap.get(currentTile);
                if (npcSpawns != null) {
                    g.setFill(Color.GREEN);
                    g.fillRect(x * tileSizeX, (viewRadius * 2 - y) * tileSizeY, tileSizeX, tileSizeY);
                }
            }
        }

    }

    /**
     * Load object spawns to memory
     */
    private void loadObjects() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DatabaseUtils.openServerDatabase();
            if (connection == null) return;
            statement = connection.createStatement();
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
                spawnedObjectMap.putIfAbsent(new WorldTile(x, y, plane), new ArrayList<>());
                spawnedObjectMap.get(new WorldTile(x, y, plane)).add(new ObjectSpawn(id, x, y, plane, direction,
                        type, clipped));
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
                removedObjectMap.putIfAbsent(new WorldTile(x, y, plane), new ArrayList<>());
                removedObjectMap.get(new WorldTile(x, y, plane)).add(new ObjectSpawn(id, x, y, plane, direction,
                        type, clipped));
            }
            rs = statement.executeQuery("SELECT * FROM NPC_SPAWNS");
            boolean randomWalk;
            String customName;
            while (rs.next()) {
                id = rs.getInt("id");
                x = rs.getInt("x");
                y = rs.getInt("y");
                plane = rs.getInt("plane");
                direction = rs.getInt("direction");
                randomWalk = rs.getBoolean("random_walk");
                customName = rs.getString("custom_name");
                npcSpawnsMap.putIfAbsent(new WorldTile(x, y, plane), new ArrayList<>());
                npcSpawnsMap.get(new WorldTile(x, y, plane)).add(new NpcSpawn(id, x, y, plane, direction, randomWalk,
                        customName));
            }
        } catch (SQLException e) {
            Logger.error(e);
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                Logger.error(e);
            }
        }
    }

    private double lastX = -1;
    private double lastY = -1;

    /**
     * Process dragging the spawnedObjectMap to move the view
     *
     * @param mouseEvent event invoked
     */
    public void mapDrag(MouseEvent mouseEvent) {
        double deltaX = mouseEvent.getX() - lastX;
        double deltaY = mouseEvent.getY() - lastY;
        if (lastX != -1 && lastY != -1) {
            if (Math.abs(deltaX) > 0.5) if (deltaX > 0) viewX -= Math.abs(deltaX);
            else viewX += Math.abs(deltaX);
            if (Math.abs(deltaY) > 0.5) if (deltaY > 0) viewY += Math.abs(deltaY);
            else viewY -= Math.abs(deltaY);
        }

        lastX = mouseEvent.getX();
        lastY = mouseEvent.getY();

        repaint();
    }

    /**
     * Reset the last drag coordinate values to prevent view jumping on drag start
     */
    public void dragStop() {
        lastX = -1;
        lastY = -1;
    }

    /**
     * Zoom the view
     *
     * @param scrollEvent event invoked
     */
    public void mapScroll(ScrollEvent scrollEvent) {
        viewRadius += scrollEvent.getDeltaY() / -20;
        repaint();
    }
}

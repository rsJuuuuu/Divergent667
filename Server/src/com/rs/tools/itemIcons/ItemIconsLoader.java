package com.rs.tools.itemIcons;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Peng on 6.1.2017 1:25.
 */
public class ItemIconsLoader {

    private static boolean runThread = true;

    private static ArrayList<LoadFormat> loadFormats = new ArrayList<>();

    private static final Image LOADING_IMAGE = new Image("http://i.imgur.com/5GytW.gif");
    private static final File ICON_PATH = new File(
            System.getProperty("user.home") + File.separator + ".itemIcons" + File.separator);

    private static CopyOnWriteArrayList<RequestManager> registeredManagers = new CopyOnWriteArrayList<>();

    private static HashMap<Integer, Background> backgroundImages = new HashMap<>();

    static {
        try {
            Cache.init();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!ICON_PATH.exists()) if (!ICON_PATH.mkdirs()) {
            System.err.println("Error locating icon path or creating directories");
            System.exit(0);
        }

        loadFormats.add(new LoadFormat("gif", "http://services.runescape.com/m=itemdb_rs/obj_big.gif?id=", ""));
        loadFormats.add(new LoadFormat("gif", "http://services.runescape.com/m=itemdb_rs/obj_sprite.gif?id=", ""));
        loadFormats.add(new LoadFormat("png", "http://www.runelocus.com/items/img/", ".png"));

        Thread loaderThread = new Thread(() -> {
            ConcurrentHashMap<Item, Region> currentMap;
            ArrayList<RequestManager> toRemove = new ArrayList<>();
            while (runThread) {
                for (RequestManager manager : registeredManagers) {
                    if (manager.isCloseRequested()) {
                        toRemove.add(manager);
                        continue;
                    }
                    currentMap = manager.getRequestMap();
                    if (currentMap.isEmpty() || !currentMap.keySet().iterator().hasNext()) continue;
                    Item item = currentMap.keySet().iterator().next();
                    int itemId = item.getId();
                    if (!currentMap.containsKey(item)) continue;
                    if (loadedBackground(itemId)) {
                        if (currentMap.get(item) == null) currentMap.remove(item);
                        else {
                            currentMap.get(item).setBackground(getBackground(itemId));
                        }
                    }
                    currentMap.remove(item);
                }
                if (!toRemove.isEmpty()) {
                    for (RequestManager manager : toRemove)
                        registeredManagers.remove(manager);
                    toRemove.clear();
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    runThread = false;
                    //it's fine we will just end
                }
            }

        });
        loaderThread.start();
    }

    public static RequestManager getRequestManager() {
        RequestManager manager = new RequestManager();
        registeredManagers.add(manager);
        return manager;
    }

    /**
     * Fetch a background object with the items icon
     *
     * @param itemId item id
     * @return the background
     */
    private static Background getBackground(int itemId) {
        ItemDefinitions definitions = ItemDefinitions.getItemDefinitions(itemId);
        if (definitions != null && definitions.isNoted()) itemId--;
        if (backgroundImages.containsKey(itemId)) return backgroundImages.get(itemId);
        return new Background(new BackgroundImage(LOADING_IMAGE, BackgroundRepeat.NO_REPEAT, BackgroundRepeat
                .NO_REPEAT, null, new BackgroundSize(100, 100, true, true, true, false)));
    }

    private static boolean loadedBackground(int itemId) {
        ItemDefinitions definitions = ItemDefinitions.getItemDefinitions(itemId);
        if (definitions == null) return false;
        if (definitions.isNoted()) itemId--;
        loadBackground(itemId, false);
        return backgroundImages.containsKey(itemId);
    }

    /**
     * Load item icons into memory
     *
     * @param itemId     item to be loaded
     * @param preLoading If we are just loading the icons because we have nothing better to do, let's not load them
     *                   to memory.
     */
    private static boolean loadBackground(int itemId, boolean preLoading) {
        ItemDefinitions definitions = ItemDefinitions.getItemDefinitions(itemId);
        if (definitions == null) return false;
        if (definitions.isNoted()) itemId--;
        if (backgroundImages.containsKey(itemId)) return false;

        File imageFile;
        Image image = null;
        try {
            for (LoadFormat format : loadFormats) {
                imageFile = format.getIconFile(itemId);
                if (imageFile.exists()) {
                    image = SwingFXUtils.toFXImage(ImageIO.read(imageFile), null);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        if (preLoading && image != null) return false;

        if (image == null) for (LoadFormat format : loadFormats) {
            image = new Image(format.getIconUrl(itemId));
            if (saveImage(itemId, image, format)) break;
        }

        if (preLoading) return true;

        BackgroundImage bgImage;
        bgImage = new BackgroundImage(image
                                      == null ? LOADING_IMAGE : image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat
                .NO_REPEAT, null, new BackgroundSize(100, 100, true, true, true, false));
        backgroundImages.put(itemId, new Background(bgImage));
        return true;
    }

    private static boolean saveImage(int itemId, Image image, LoadFormat format) {
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        if (bImage == null) return false;
        try {
            ImageIO.write(bImage, format.getFileType(), format.getIconFile(itemId));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static class RequestManager {
        private ConcurrentHashMap<Item, Region> requestMap = new ConcurrentHashMap<>();
        private boolean closeRequested = false;

        public void loadBackground(int itemId, Region region) {
            region.setBackground(getBackground(itemId));
            requestMap.put(new Item(itemId), region);
        }

        void flush() {
            requestMap.clear();
        }

        public void close() {
            closeRequested = true;
        }

        ConcurrentHashMap<Item, Region> getRequestMap() {
            return requestMap;
        }

        boolean isCloseRequested() {
            return closeRequested;
        }
    }

    private static class LoadFormat {
        String fileType, addressPrefix, addressSuffix;

        LoadFormat(String fileType, String addressPrefix, String addressSuffix) {
            this.fileType = fileType;
            this.addressPrefix = addressPrefix;
            this.addressSuffix = addressSuffix;
        }

        File getIconFile(int itemId) {
            return new File(ICON_PATH.getPath() + File.separator + itemId + "." + fileType);
        }

        String getIconUrl(int itemId) {
            return addressPrefix + itemId + addressSuffix;
        }

        String getFileType() {
            return fileType;
        }
    }
}

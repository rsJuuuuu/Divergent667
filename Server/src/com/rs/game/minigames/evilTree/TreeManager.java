package com.rs.game.minigames.evilTree;

import com.rs.cores.CoresManager;
import com.rs.game.item.Item;
import com.rs.game.actionHandling.Handler;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.concurrent.TimeUnit;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerObjectListener;

/**
 * Created by Peng on 27.11.2016 11:49.
 */
public class TreeManager implements Handler {

    /**
     * What shall the tree turn into
     */
    private static final int DEAD_TREE = 14839;
    static final int SAPLING_ID = 11391;
    static final int KINDLING_ID = 14666;
    static final int FIRE_ID = 14169;
    static final int EVIL_ROOT_ID = 11426;

    /**
     * How long shall it stay dead before re spawning elsewhere
     */
    private static final int FALLEN_TIME = 30;
    private static final int ALIVE_TIME = 30 * 60;

    private static final WorldTile[] EVIL_TREE_LOCATIONS = new WorldTile[]{};

    private static EvilTree currentTree;

    private static long lastTreeSpawned = -1;

    public static void init() {
        spawnNextTree();
        CoresManager.slowExecutor.scheduleAtFixedRate(() -> {
            if (currentTree.isDead()) {
                if (TimeUtils.timePassed(currentTree.getTimeOfDeath(), FALLEN_TIME * 1000)) spawnNextTree();
            } else if (TimeUtils.timePassed(lastTreeSpawned, (ALIVE_TIME) * 1000))//we should change location
                killTree();
            else if (!currentTree.isGrown()) currentTree.advanceGrowth(null);

        }, 10, 10, TimeUnit.SECONDS);
    }

    private static void spawnNextTree() {
        if (currentTree != null) World.removeSpawnedObject(currentTree, true);
        lastTreeSpawned = TimeUtils.getTime();
        currentTree = new EvilTree(EvilTreeDefinitions.values()[Utils.random(EvilTreeDefinitions.values().length)],
                getRandomTreeLocation());
        World.spawnObject(currentTree, true);
    }

    public static WorldTile getRandomTreeLocation() {
        return new WorldTile(3400 + Utils.random(30), 3000, 0);
    }

    static void killTree() {
        World.removeSpawnedObject(currentTree, true);
        currentTree.killRoots();
        currentTree.setId(DEAD_TREE + currentTree.getTreeDefinitions().ordinal());
        World.spawnObject(currentTree, true);
    }

    @Override
    public void register() {
        registerObjectListener(CLICK_1, (player, object, clickType) -> {
            for (EvilTreeDefinitions definition : EvilTreeDefinitions.values()) {
                if (definition.getId() <= object.getId() && object.getId() <= definition.getId() + 2)
                    player.getActionManager().setAction(new ChopEvilTree(object, definition));
            }

            if (object.getId() == EVIL_ROOT_ID)
                player.getActionManager().setAction(new ChopEvilTree(object, currentTree.getTreeDefinitions()));

            if (object.getId() >= SAPLING_ID && object.getId() <= SAPLING_ID + 4) currentTree.advanceGrowth(player);

            if (object.getId() == DEAD_TREE + currentTree.getTreeDefinitions().ordinal())
                currentTree.rewardPlayer(player);
            return RETURN;
        });
        registerObjectListener(CLICK_2, (player, object, clickType) -> {
            for (EvilTreeDefinitions definition : EvilTreeDefinitions.values()) {
                if (definition.getId() <= object.getId() && object.getId() <= definition.getId() + 2)
                    player.getActionManager().setAction(new LightEvilTree(object));
            }
            if (object.getId() >= SAPLING_ID && object.getId() <= SAPLING_ID + 4) {
                currentTree.sendGrowthMessage(player);
            }
            return RETURN;
        });
        registerObjectListener(CLICK_3, (player, object, clickType) -> {
            for (EvilTreeDefinitions definition : EvilTreeDefinitions.values()) {
                if (definition.getId() <= object.getId() && object.getId() <= definition.getId() + 2)
                    currentTree.sendGrowthMessage(player);
            }
            return RETURN;
        });
        init();
    }

    public enum EvilTreeDefinitions {

        NORMAL_EVIL_TREE("Evil tree", 11434, 1, 1, 1, 15.1, 20.0, 200.0, 2300, 185, new Item(1512, 12)),
        EVIL_OAK_TREE("Oak Evil Tree", 11437, 15, 7, 15, 32.4, 45.0, 300.0, 2500, 326, new Item(1522, 24)),
        EVIL_WILLOW_TREE("Willow Evil Tree", 11440, 30, 15, 30, 45.7, 66.0, 450.0, 2700, 1127, new Item(1520, 226)),
        EVIL_MAPLE_TREE("Maple Evil Tree", 11443, 45, 22, 45, 55.8, 121.5, 675.0, 2900, 1280, new Item(1518, 131)),
        EVIL_YEW_TREE("Yew Evil Tree", 11916, 60, 30, 60, 64.4, 172.5, 1012.5, 3100, 2334, new Item(1516, 17)),
        EVIL_MAGIC_TREE("Magic Evil Tree", 11919, 75, 37, 75, 70.9, 311.0, 1517.5, 3300, 4737, new Item(1514, 10)),
        EVIL_ELDER_TREE("Elder Evil Tree", 11922, 90, 42, 90, 77.8, 687.5, 2000.5, 3500, 8694, new Item(6334, 375),
                new Item(8836, 102), new Item(1516, 59), new Item(1514, 18));

        private String treeName;
        private int id, woodcuttingLevel, farmingLevel, firemakingLevel, coinsAmount, treeHealth;
        private double woodcuttingXp, farmingXp, firemakingXp;
        private Item[] logs;

        EvilTreeDefinitions(String treeName, int id, int woodcuttingLevel, int farmingLevel, int firemakingLevel,
                            double woodcuttingXp, double farmingXp, double firemakingXp, int treeHealth, int
                                    coinsAmount, Item... logs) {
            this.treeName = treeName;
            this.id = id;
            this.woodcuttingLevel = woodcuttingLevel;
            this.farmingLevel = farmingLevel;
            this.firemakingLevel = firemakingLevel;
            this.woodcuttingXp = woodcuttingXp;
            this.farmingXp = farmingXp;
            this.firemakingXp = firemakingXp;
            this.treeHealth = treeHealth;
            this.logs = logs;
            this.coinsAmount = coinsAmount;
        }

        public String getTreeName() {
            return treeName;
        }

        public int getId() {
            return id;
        }

        public int getWoodcuttingLevel() {
            return woodcuttingLevel;
        }

        public int getFarmingLevel() {
            return farmingLevel;
        }

        public int getFiremakingLevel() {
            return firemakingLevel;
        }

        public double getWoodcuttingXp() {
            return woodcuttingXp;
        }

        public double getFarmingXp() {
            return farmingXp;
        }

        public double getFiremakingXp() {
            return firemakingXp;
        }

        public int getTreeHealth() {
            return treeHealth;
        }

        public int getCoinsAmount() {
            return coinsAmount;
        }

        public Item[] getLogs() {
            return logs;
        }
    }
}

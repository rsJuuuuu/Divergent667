package com.rs;

import com.alex.store.Index;
import com.rs.cache.Cache;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.ItemEquipIds;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.actionHandling.HandlerManager;
import com.rs.game.minigames.bountyHunter.BountyHunterManager;
import com.rs.game.npc.FishingSpotsHandler;
import com.rs.game.npc.combat.CombatScriptsHandler;
import com.rs.game.npc.data.NpcDataLoader;
import com.rs.game.npc.drops.NpcDrops;
import com.rs.game.player.Player;
import com.rs.game.player.PlayerUtils;
import com.rs.game.player.content.shops.ShopHandler;
import com.rs.game.player.controllers.ControllerHandler;
import com.rs.game.player.cutscenes.CutSceneHandler;
import com.rs.game.player.dialogues.DialogueHandler;
import com.rs.game.player.info.FriendChatsManager;
import com.rs.game.player.quests.QuestHandler;
import com.rs.game.spawning.NpcSpawning;
import com.rs.game.spawning.ObjectSpawning;
import com.rs.game.world.Region;
import com.rs.game.world.RegionBuilder;
import com.rs.game.world.World;
import com.rs.net.ServerChannelHandler;
import com.rs.utils.MapAreas;
import com.rs.utils.game.itemUtils.ItemBonuses;
import com.rs.utils.game.itemUtils.ItemExamines;
import com.rs.utils.security.huffman.Huffman;
import org.pmw.tinylog.Logger;

import java.util.concurrent.TimeUnit;

public final class Launcher {

    public static void main(String[] args) throws Exception {
        if (args.length >= 1) {
            Settings.DEBUG = Boolean.parseBoolean(args[0]);
        }

        Logger.info("Launching server...");
        NpcDataLoader.init();
        Cache.init();
        ItemEquipIds.init();
        Huffman.init();
        MapAreas.init();
        NpcDrops.init();
        ObjectSpawning.init();
        NpcSpawning.init();
        ItemExamines.init();
        ItemBonuses.init();
        ShopHandler.init();
        FishingSpotsHandler.init();
        CombatScriptsHandler.init();
        DialogueHandler.init();
        ControllerHandler.init();
        CutSceneHandler.init();
        FriendChatsManager.init();
        CoresManager.init();
        World.init();
        RegionBuilder.init();
        BountyHunterManager.init();
        HandlerManager.registerHandlers();
        try {
            ServerChannelHandler.init();
        } catch (Throwable e) {
            Logger.error(e);
            System.exit(1);
            return;
        }

        Logger.info("Server loaded");
        addAccountsSavingTask();
        addCleanMemoryTask();
    }

    private static void addCleanMemoryTask() {
        CoresManager.slowExecutor.scheduleWithFixedDelay(() -> {
            try {
                cleanMemory(Runtime.getRuntime().freeMemory() < Settings.MIN_FREE_MEM_ALLOWED);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }, 0, 10, TimeUnit.MINUTES);
    }

    private static void addAccountsSavingTask() {
        CoresManager.slowExecutor.scheduleWithFixedDelay(() -> {
            try {
                saveFiles();
            } catch (Throwable e) {
                Logger.error(e);
            }

        }, 1, 30, TimeUnit.SECONDS);
    }

    private static void saveFiles() {
        for (Player player : World.getPlayers()) {
            if (player == null || !player.hasStarted() || player.hasFinished()) continue;
            PlayerUtils.savePlayer(player);
        }
    }

    private static void cleanMemory(boolean force) {
        if (force) {
            ItemDefinitions.clearItemsDefinitions();
            NPCDefinitions.clearNPCDefinitions();
            ObjectDefinitions.clearObjectDefinitions();
            World.getRegions().values().forEach(Region::removeMapFromMemory);
        }
        for (Index index : Cache.STORE.getIndexes())
            index.resetCachedFiles();
        CoresManager.fastExecutor.purge();
        System.gc();
    }

    private static void closeServices() {
        ServerChannelHandler.shutdown();
        CoresManager.shutdown();
    }

    public static void restart() {
        closeServices();
        System.gc();
        try {
            System.exit(2);
        } catch (Throwable e) {
            Logger.error(e);
        }

    }

    private Launcher() {

    }

}

package com.rs.game.actionHandling;

import com.rs.game.actionHandling.actions.*;
import com.rs.game.actionHandling.handlers.*;
import com.rs.game.player.content.shops.ShopHandler;
import com.rs.game.player.info.RanksManager;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.utils.files.FileUtils;
import org.pmw.tinylog.Logger;

import java.io.File;
import java.util.List;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;

/**
 * Created by Peng on 2.10.2016.
 */
public class HandlerManager {

    public static class HandlerConstants {

        /**
         * Constants to be used in identifying actions
         */
        public static final int CLICK_GLOBAL = 0;
        public static final int CLICK_1 = 1;
        public static final int CLICK_2 = 2;
        public static final int CLICK_3 = 3;
        public static final int CLICK_4 = 4;
        public static final int CLICK_5 = 5;
        public static final int CLICK_6 = 6;
        public static final int CLICK_7 = 7;
        public static final int CLICK_8 = 8;
        public static final int CLICK_9 = 9;
        public static final int CLICK_10 = 10;
        public static final int EXAMINE = -1;
        public static final int ATTACK = -2;
        public static final int INVALID_OPTION = -1337;
        public static final String GLOBAL_COMMAND = "GLOBAL_COMMAND";

        /**
         * Return types
         */
        public static final int DEFAULT = 0;
        public static final int HANDLED = 1;
        public static final int RETURN = 2;

        public static int optionForPacket(WorldPacketsDecoder.Packets packet) {
            switch (packet) {
                case NPC_CLICK_1:
                case OBJECT_1:
                case INTERFACE_BTN_1:
                    return CLICK_1;
                case INTERFACE_BTN_2:
                case OBJECT_2:
                case NPC_CLICK_2:
                    return CLICK_2;
                case OBJECT_3:
                case NPC_CLICK_3:
                case INTERFACE_BTN_3:
                    return CLICK_3;
                case NPC_CLICK_4:
                case INTERFACE_BTN_4:
                    return CLICK_4;
                case OBJECT_5:
                case INTERFACE_BTN_5:
                    return CLICK_5;
                case INTERFACE_BTN_6:
                    return CLICK_6;
                case INTERFACE_BTN_7:
                    return CLICK_7;
                case INTERFACE_BTN_8:
                    return CLICK_8;
                case INTERFACE_BTN_9:
                    return CLICK_9;
                case INTERFACE_BTN_10:
                    return CLICK_10;
                case OBJECT_EXAMINE:
                case NPC_EXAMINE:
                    return EXAMINE;
                case ATTACK_NPC:
                    return ATTACK;
            }
            return INVALID_OPTION;
        }
    }

    public static NPCHandler npcHandler = new NPCHandler();
    public static InterfaceHandler interfaceHandler = new InterfaceHandler();
    public static InventoryHandler inventoryHandler = new InventoryHandler();
    public static ObjectHandler objectHandler = new ObjectHandler();
    public static CommandHandler commandHandler = new CommandHandler();

    public static void reloadHandlers() {
        npcHandler.reset();
        interfaceHandler.reset();
        inventoryHandler.reset();
        objectHandler.reset();
        registerHandlers();
    }

    /**
     * Find all classes extending action listener and call the register command on them
     */
    public static void registerHandlers() {
        Logger.info("Loading action listeners...");
        npcHandler.init();
        inventoryHandler.init();
        interfaceHandler.init();
        objectHandler.init();
        commandHandler.init();
        String fileLoc = ClassLoader.getSystemClassLoader().getResource("./").getPath()+"/com/rs/game";
        String packageDir = "com.rs.game";
        List<Object> classes = FileUtils.getScriptObjects(new File(fileLoc), packageDir, Handler.class);
        for (Object obj : classes)
            ((Handler) obj).register();
        Logger.info("Npc handler: ");
        npcHandler.printScriptData();
        Logger.info("Interface handler: ");
        interfaceHandler.printScriptData();
        Logger.info("Invenotry handler: ");
        inventoryHandler.printScriptData();
        Logger.info("Object handler: ");
        objectHandler.printScriptData();
        Logger.info("Command handler: ");
        commandHandler.printScriptData();
        Logger.info(classes.size() + " action listeners loaded.");
    }

    /**
     * Register an action handler for an interface
     *
     * @param interfaceIds all interfaces to be handled by this action handler
     * @param action       the handler
     */
    public static void registerInterfaceAction(int clickType, InterfaceListener action, int... interfaceIds) {
        for (int interfaceId : interfaceIds)
            interfaceHandler.registerAction(clickType, interfaceId, action);
    }

    /**
     * Register an action handler for all interfaces
     *
     * @param action the handler
     */
    public static void registerInterfaceListener(InterfaceListener action) {
        registerInterfaceAction(CLICK_GLOBAL, action, -1);
    }

    /**
     * Register an action handler for all interfaces
     *
     * @param action the handler
     */
    public static void registerInterfaceListener(int clickType, InterfaceListener action) {
        registerInterfaceAction(clickType, action, -1);
    }

    /**
     * Register an action handler for an item in inventory
     */
    public static void registerInventoryAction(int clickType, InventoryListener action, int... itemIds) {
        for (int itemId : itemIds)
            inventoryHandler.registerAction(clickType, itemId, action);
    }

    public static void registerInventoryListener(InventoryListener action) {
        registerInventoryAction(CLICK_GLOBAL, action, -1);
    }

    public static void registerInventoryListener(int clickType, InventoryListener action) {
        registerInventoryAction(clickType, action, -1);
    }

    public static void registerObjectAction(int clickType, ObjectListener action, int... objectIds) {
        for (int objectId : objectIds)
            objectHandler.registerAction(clickType, objectId, action);
    }

    public static void registerObjectListener(ObjectListener action) {
        registerObjectListener(CLICK_GLOBAL, action);
    }

    public static void registerObjectListener(int clickType, ObjectListener action) {
        registerObjectAction(clickType, action, -1);
    }

    /**
     * Register a command
     *
     * @param rank     minimum rank required
     * @param action   action performed on process
     * @param commands aliases for this command
     */
    private static void registerCommand(RanksManager.Ranks rank, CommandListener action, String... commands) {
        for (String command : commands)
            commandHandler.registerAction(rank.ordinal(), command, action);
    }

    public static void registerCommandListener(RanksManager.Ranks rank, CommandListener action) {
        commandHandler.registerAction(rank.ordinal(), GLOBAL_COMMAND, action);
    }

    public static void registerNpcAction(int clickType, NpcListener action, int... npcIds) {
        for (int npcId : npcIds)
            npcHandler.registerAction(clickType, npcId, action);
    }

    public static void registerPlayerCommand(CommandListener listener, String... commands) {
        registerCommand(RanksManager.Ranks.NORMAL, listener, commands);
    }

    public static void registerDonatorCommand(CommandListener listener, String... commands) {
        registerCommand(RanksManager.Ranks.MEMBER, listener, commands);
    }

    public static void registerModCommand(CommandListener listener, String... commands) {
        registerCommand(RanksManager.Ranks.MOD, listener, commands);
    }

    public static void registerAdminCommand(CommandListener listener, String... commands) {
        registerCommand(RanksManager.Ranks.ADMIN, listener, commands);
    }

    public static void registerOwnerCommand(CommandListener listener, String... commands) {
        registerCommand(RanksManager.Ranks.OWNER, listener, commands);
    }

    public static void registerDeveloperCommand(CommandListener listener, String... commands) {
        registerCommand(RanksManager.Ranks.DEVELOPER, listener, commands);
    }

    /**
     * Register an action handler for an npc
     *
     * @param action the action
     * @param npcIds npcs to handle
     */
    public static void registerNpcAction(NpcListener action, int... npcIds) {
        registerNpcAction(CLICK_GLOBAL, action, npcIds);
    }

    public static void registerNpcListener(int clickType, NpcListener action) {
        registerNpcAction(clickType, action, -1);
    }

    /**
     * Register global npc handler that handles all npcs
     */
    public static void registerNpcListener(NpcListener action) {
        registerNpcListener(CLICK_GLOBAL, action);
    }

    /**
     * Link a dialogue to an npc
     *
     * @param npcId       npc id
     * @param dialogueKey name of the dialogue
     */
    public static void registerNpcDialogue(int npcId, final int clickId, String dialogueKey, Object... params) {
        registerNpcAction(clickId, (player, npc, clickType) -> {
            player.getDialogueManager().startDialogue(dialogueKey, params);
            return RETURN;
        }, npcId);
    }

    /**
     * Link an npc to a shop (with global click)
     */
    public static void registerNpcShop(String shopName, int... npcId) {
        registerNpcShop(CLICK_GLOBAL, shopName, npcId);
    }

    /**
     * Link an npc to a shop with given click
     */
    public static void registerNpcShop(int clickType, String shopName, int... npcId) {
        registerNpcAction(clickType, (player, npc, clickType1) -> {
            ShopHandler.openShop(player, shopName);
            return RETURN;
        }, npcId);
    }

    /**
     * Link a dialogue to an object
     */
    public static void registerObjectDialogue(int objectId, final int clickId, String dialogueKey, Object... params) {
        registerObjectAction(clickId, (player, npc, clickType) -> {
            player.getDialogueManager().startDialogue(dialogueKey, params);
            return RETURN;
        }, objectId);
    }
}

package com.rs.game.player;

import com.rs.game.actionHandling.HandlerManager;
import com.rs.game.actionHandling.actions.ActionListener;
import com.rs.game.gameUtils.events.PlayerEvent;
import com.rs.game.player.content.interfaces.ActionTab;
import com.rs.game.player.content.interfaces.Teleportation;
import com.rs.game.player.info.RanksManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import static com.rs.game.player.InterfaceManager.GameInterface.*;

public class InterfaceManager {

    public enum GameInterface {
        CHAT_OPTIONS(751, 68, 19),
        CHAT_BOX(752, 192, 73),
        PRIVATE_CHAT(754, 17, 72),
        HEALTH_ORB(748, 183, 177),
        PRAYER_ORB(749, 185, 178),
        ENERGY_ORG(750, 186, 179),
        SUMMONING_ORG(747, 188, 180),
        COMBAT_TAB(884, 204, 90),
        SKILLS_TAB(320, 206, 92),
        QUEST_TAB(190, 207, 93),
        TASKS_TAB(1056, 205, 91),
        FRIENDS_TAB(550, 213, 99),
        FRIENDS_CHAT_TAB(1109, 214, 100),
        CLAN_CHAT_TAB(1110, 215, 101),
        EMOTES_TAB(590, 217, 103),
        MUSIC_TAB(187, 218, 104),
        NOTES_TAB(34, 219, 105),
        LOGOUT_TAB(182, 222, 108),
        INVENTORY(679, 208, 94),
        INVENTORY_OVERRIDE(-1, 199, 87),
        SETTINGS(261, 216, 102),
        MAGIC_BOOK(-1, 211, 97),
        PRAYER_BOOK(271, 210, 96),
        EQUIPMENT_TAB(387, 209, 95),
        ACTION_TAB(930, 205, 91, ActionTab::sendTab),
        AREA_STATUS(745, 15, 15),
        /**
         * Pest control
         */
        PEST_LANDER(407, 19, 10);

        private int interfaceId, fixedTabId, resizableTabId;
        private PlayerEvent openAction;

        GameInterface(int interfaceId, int fixedTabId, int resizableTabId) {
            this.interfaceId = interfaceId;
            this.fixedTabId = fixedTabId;
            this.resizableTabId = resizableTabId;
        }

        GameInterface(int interfaceId, int fixedTabId, int resizableTabId, PlayerEvent openAction) {
            this.interfaceId = interfaceId;
            this.fixedTabId = fixedTabId;
            this.resizableTabId = resizableTabId;
            this.openAction = openAction;
        }
    }

    public static final int FIXED_WINDOW_ID = 548;
    public static final int RESIZABLE_WINDOW_ID = 746;
    private static final int CHAT_BOX_TAB = 13;
    private static final int FIXED_SCREEN_TAB_ID = 9;
    private static final int RESIZABLE_SCREEN_TAB_ID = 12;
    private static final int FIXED_INV_TAB_ID = 199;
    private static final int RESIZABLE_INV_TAB_ID = 87;

    private Player player;

    private final ConcurrentHashMap<Integer, int[]> openInterfaces = new ConcurrentHashMap<>();

    private CopyOnWriteArrayList<GameInterface> openInterfaceList = new CopyOnWriteArrayList<>();

    private boolean resizableScreen;
    private int windowsPane;

    InterfaceManager(Player player) {
        this.player = player;
    }

    public void sendTab(int tabId, int interfaceId) {
        player.getPackets().sendInterface(true, resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID, tabId,
                interfaceId);
    }

    public void sendChatBoxInterface(int interfaceId) {
        player.getPackets().sendInterface(true, 752, CHAT_BOX_TAB, interfaceId);
    }

    void closeChatBoxInterface() {
        player.getPackets().closeInterface(CHAT_BOX_TAB);
    }

    public void sendInterface(int interfaceId) {
        player.getPackets().sendInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID,
                resizableScreen ? RESIZABLE_SCREEN_TAB_ID : FIXED_SCREEN_TAB_ID, interfaceId);
    }

    public void sendInventoryInterface(int childId) {
        player.getPackets().sendInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID,
                resizableScreen ? RESIZABLE_INV_TAB_ID : FIXED_INV_TAB_ID, childId);
    }

    public final void sendInterfaces() {

        if (player.getDisplayMode() == 2 || player.getDisplayMode() == 3) {
            resizableScreen = true;
            player.getPackets().sendWindowsPane(746, 0);
        } else {
            resizableScreen = false;
            player.getPackets().sendWindowsPane(548, 0);
        }
        openInterfaces(CHAT_BOX, CHAT_OPTIONS, PRIVATE_CHAT, HEALTH_ORB, PRAYER_ORB, ENERGY_ORG, SUMMONING_ORG,
                COMBAT_TAB, SKILLS_TAB, FRIENDS_TAB, FRIENDS_CHAT_TAB, CLAN_CHAT_TAB, EMOTES_TAB, MUSIC_TAB,
                NOTES_TAB, LOGOUT_TAB, INVENTORY, EQUIPMENT_TAB, ACTION_TAB, SETTINGS, PRAYER_BOOK, AREA_STATUS);
        player.getPackets().sendInterface(true, 752, 9, 137);

        sendMagicBook();
        Teleportation.openTeleportationInterface(player);

        player.getCombatDefinitions().sendUnlockAttackStylesButtons();
        player.getMusicsManager().unlockMusicPlayer();
        player.getInventory().unlockInventoryOptions();
        player.getPrayer().unlockPrayerBookButtons();
        if (player.getFollower() != null && player.isRunning()) player.getFollower().unlock();
        player.getControllerManager().sendInterfaces();
    }

    /**
     * Send an interface over the tab that this interface is on
     */
    public void overrideInterface(GameInterface inter, int overrideId) {
        sendTab(resizableScreen ? inter.resizableTabId : inter.fixedTabId, overrideId);
    }

    /**
     * Close the tabs that the given interfaces are mapped to
     */
    public void closeInterfaces(GameInterface... interfaces) {
        for (GameInterface inter : interfaces)
            player.getPackets().closeInterface(resizableScreen ? inter.resizableTabId : inter.fixedTabId);
    }

    /**
     * Open an interface mapped in Interface enum
     */
    public void openInterfaces(GameInterface... interfaces) {
        for (GameInterface inter : interfaces) {
            if (inter.interfaceId > -1)
                sendTab(resizableScreen ? inter.resizableTabId : inter.fixedTabId, inter.interfaceId);
            if (inter.openAction != null) inter.openAction.process(player);
        }
    }

    /**
     * Print commands of given rank
     *
     * @param index starting row in interface
     * @return ending row
     */
    private static int printCommands(Player player, RanksManager.Ranks ranks, int index) {
        HashMap<String, ArrayList<ActionListener>> commandsMap = HandlerManager.commandHandler.getCommands(ranks);
        if (commandsMap == null) return index;
        index++;
        player.getPackets().sendIComponentText(275, index++,
                "<img=" + ranks.getCrown() + ">" + ranks.getTitlePrefix() + ranks.getTitle() + " Commands<img="
                + ranks.getCrown() + ">");
        Object[] commands = commandsMap.keySet().toArray();
        String command;
        ArrayList<ActionListener> listeners = new ArrayList<>();
        commandLoop:
        for (Object cmd : commands) {
            command = (String) cmd;
            for (ActionListener toAdd : commandsMap.get(command)) {
                if (listeners.contains(toAdd)) continue commandLoop;
            }
            if (!listeners.contains(commandsMap.get(command).get(0))) {
                player.getPackets().sendIComponentText(275, index, "<col=0000ff>::" + command);
                index++;
                listeners.addAll(commandsMap.get(command));
            }
        }
        return index;
    }

    /**
     * Display the commands interface with all commands grouped by rank
     */
    public static void displayCommandsInterface(Player player) {
        player.getInterfaceManager().sendInterface(275);
        for (int i = 0; i < 316; i++) {
            player.getPackets().sendIComponentText(275, i, " ");
        }
        player.getPackets().sendIComponentText(275, 2, "<col=ff0000>Divergent's Commands");
        player.getPackets().sendIComponentText(275, 14, "GoTo Website");
        player.getPackets().sendIComponentText(275, 16, "");
        int index = 19;
        for (RanksManager.Ranks rank : RanksManager.Ranks.values()) {
            if(!player.hasRights(rank)) continue;
            index = printCommands(player, rank, index);
        }
    }

    public void sendMagicBook() {
        sendTab(resizableScreen ? 97 : 211, player.getCombatDefinitions().getSpellBook());
    }

    public boolean addInterface(int windowId, int tabId, int childId) {
        if (openInterfaces.containsKey(tabId)) player.getPackets().closeInterface(tabId);
        openInterfaces.put(tabId, new int[]{childId, windowId});
        return openInterfaces.get(tabId)[0] == childId;
    }

    public boolean containsInterface(int tabId, int childId) {
        return childId == windowsPane || openInterfaces.containsKey(tabId) && openInterfaces.get(tabId)[0] == childId;
    }

    public int getTabWindow(int tabId) {
        if (!openInterfaces.containsKey(tabId)) return FIXED_WINDOW_ID;
        return openInterfaces.get(tabId)[1];
    }

    public boolean containsInterface(int childId) {
        if (childId == windowsPane) return true;
        for (int[] value : openInterfaces.values())
            if (value[0] == childId) return true;
        return false;
    }

    private boolean containsTab(int tabId) {
        return openInterfaces.containsKey(tabId);
    }

    public void removeAll() {
        openInterfaces.clear();
    }

    public boolean containsScreenInter() {
        return containsTab(resizableScreen ? RESIZABLE_SCREEN_TAB_ID : FIXED_SCREEN_TAB_ID);
    }

    public void closeScreenInterface() {
        player.getPackets().closeInterface(resizableScreen ? RESIZABLE_SCREEN_TAB_ID : FIXED_SCREEN_TAB_ID);
    }

    public boolean containsInventoryInter() {
        return containsTab(resizableScreen ? RESIZABLE_INV_TAB_ID : FIXED_INV_TAB_ID);
    }

    boolean containsChatBoxInter() {
        return containsTab(CHAT_BOX_TAB);
    }

    public boolean removeTab(int tabId) {
        return openInterfaces.remove(tabId) != null;
    }

    public boolean hasResizableScreen() {
        return resizableScreen;
    }

    public void setWindowsPane(int windowsPane) {
        this.windowsPane = windowsPane;
    }

    int openGameTab(int tabId) {
        player.getPackets().sendGlobalConfig(168, tabId);
        return 4;
    }
}
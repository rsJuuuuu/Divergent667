package com.rs.game.player.content.interfaces;

/**
 * Created by Peng on 31.7.2016.
 */

import com.rs.game.actionHandling.Handler;
import com.rs.game.player.Player;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.controllers.impl.Wilderness;
import com.rs.game.player.quests.QuestHandler;
import com.rs.game.world.WorldTile;

import java.util.ArrayList;
import java.util.HashMap;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_GLOBAL;
import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.HANDLED;
import static com.rs.game.actionHandling.HandlerManager.registerInterfaceAction;

/**
 * Used for teleporting to locations based on the location name
 */
public class Teleportation implements Handler {

    @Override
    public void register() {
        registerInterfaceAction(CLICK_GLOBAL, (player, componentId, slotId, slotId2, buttonId, interfaceId) -> {
            handleInterfaceClick(player, componentId);
            return HANDLED;
        }, 895);
    }

    private enum TeleportType {
        MISC("Misc"),
        BOSS("Boss"),
        SLAYER("Slayer"),
        PVP("PvP"),
        MONSTER("Monster"),
        SKILL("Skill"),
        MINIGAME("Minigame"),
        CITY("City");

        private String name;

        TeleportType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    /**
     * Location data
     */
    private enum Location {
        REVS("Revenants", new WorldTile(3071, 3653, 0), 14876, TeleportType.MONSTER, "revs", "revcave"),
        TRAIN("Rock Crabs", new WorldTile(2673, 3709, 0), 9703, TeleportType.MONSTER, "crabs"),
        YAKS("Yaks", new WorldTile(2326, 3801, 0), 10818, TeleportType.MONSTER, "yaks"),
        ANCIENTCAVERN("Ancient Cavern", new WorldTile(1738, 5312, 1), 11338, TeleportType.MONSTER),

        JAD("Jad", new WorldTile(2440, 5174, 0), 21512, TeleportType.MINIGAME),
        JADINKO("Jadinko", new WorldTile(3011, 9275, 0), 21369, TeleportType.MONSTER, "jadinkos"),
        FROSTDRAGON("Frost Dragons", new WorldTile(1312, 4505, 0), 18830, TeleportType.MONSTER, "frost dragons"),
        CORP("Corporeal Beast", new WorldTile(2970, 4384, 2), 13746, TeleportType.BOSS, "corp", "corpbeast",
                "corporeal"),
        KQ("Kalphite Queen", new WorldTile(3507, 9493, 0), 8266, TeleportType.BOSS, "kq", "kalphite", "kqeen"),
        EASTS("Easts Pk", new WorldTile(3360, 3658, 0), 1753, TeleportType.PVP, "easts"),
        MAGEBANK("Mage Bank", new WorldTile(2539, 4716, 0), 2415, TeleportType.PVP, "mage bank"),
        BUROTHORPE("Burthorpe", new WorldTile(2883, 3548, 0), 3853, TeleportType.CITY, "burth"),
        SHOPS("Shops", new WorldTile(3095, 3510, 0), 1931, TeleportType.MISC, "shop", "shoparea"),
        CLAN("Clan Wars", new WorldTile(2994, 9679, 0), 20709, TeleportType.MINIGAME, "cw", "clan", "cwars"),
        CASTLEWARS("Castle Wars", new WorldTile(2443, 3089, 0), 20709, TeleportType.MINIGAME, ""),
        TRAIN2("Hellhounds", new WorldTile(2870, 9852, 0), 8137, TeleportType.MONSTER, "train2"),
        COWS("Cows", new WorldTile(3258, 3263, 0), 10593, TeleportType.MONSTER, "train", "lowtrain"),
        HOME("Home", new WorldTile(3087, 3501, 0), 8013, TeleportType.MISC, "spawn"),
        FISH("Fishing", new WorldTile(2599, 3421, 0), 3703, TeleportType.SKILL, "fish"),
        THIEVING("Thieving", new WorldTile(2660, 3308, 0), 10692, TeleportType.SKILL, "thieve", "thief"),
        TAVERLY("Taverly", new WorldTile(2895, 3465, 0), 18810, TeleportType.CITY, "tav"),
        VARROCK("Varrock", new WorldTile(3212, 3423, 0), 18810, TeleportType.CITY, "varrock"),
        LUMBY("Lumbridge", new WorldTile(3220, 3219, 0), 18810, TeleportType.CITY, "lumby"),
        ALKHARID("Al Kharid", new WorldTile(3293, 3183, 0), 18810, TeleportType.CITY, "al kharid"),
        FALLY("Falador", new WorldTile(2965, 3379, 0), 18810, TeleportType.CITY, "fally"),
        CATHERBY("Catherby", new WorldTile(2804, 3433, 0), 18810, TeleportType.CITY, "catherby"),
        YANILLE("Yanille", new WorldTile(2605, 3097, 0), 18810, TeleportType.CITY, "yanille"),
        SEERSVILLAGE("Seers Village", new WorldTile(2725, 3485, 0), 18810, TeleportType.CITY, "seers village"),
        SLAYERTOWER("Slayer Tower", new WorldTile(3426, 3538, 0), 4170, TeleportType.SLAYER, "slay"),
        FREMSLAYERDUNGEON("Freminik Slayer Dungeon", new WorldTile(2806, 10002, 0), 8901, TeleportType.SLAYER),
        BRIMHAVENDUNGEON("Brimhaven Slayer Dungeon", new WorldTile(2712, 9564, 0), 8901, TeleportType.SLAYER),

        GLACOR("Glacor", new WorldTile(4185, 5734, 0), 21776, TeleportType.MONSTER, "glacors", "glacorcave",
                "glacorscave"),
        MINE("Mining", new WorldTile(3298, 3299, 0), 20786, TeleportType.SKILL, "mine", "rocks"),
        FARM("Farming", new WorldTile(2816, 3462, 0), 18682, TeleportType.SKILL, "farm", "patch"),
        HUNT("Hunter", new WorldTile(2593, 2927, 0), 10008, TeleportType.SKILL, "hunt"),
        RC("Runecrafting", new WorldTile(3040, 4843, 0), 6819, TeleportType.SKILL),
        AGILITY("Agility", new WorldTile(2470, 3436, 0), 6514, TeleportType.SKILL, "agil"),
        KBD("King black dragon", new WorldTile(2997, 3852, 0), 8265, TeleportType.BOSS, "kbd"),
        NEX("Nex", new WorldTile(2901, 5204, 0), 20139, TeleportType.BOSS, "zarosgwd"),
        GOD_WARS("Godwars Dungeon", new WorldTile(2881, 5310, 2), 11710, TeleportType.BOSS, "gwd", "godwars"),
        TORMENTED_DEMON("Tormented Demons", new WorldTile(2567, 5739, 0), 14472, TeleportType.BOSS, "tds", "td"),
        BARROWS("Barrows", new WorldTile(3565, 3315, 0), 4958, TeleportType.MINIGAME, "barrows brothers"),
        WARRIORSGUILD("Warriors Guild", new WorldTile(2880, 8851, 0), 8851, TeleportType.MINIGAME, ""),
        PESTCONTROL("Pest Control", new WorldTile(2657, 2650, 0), 11666, TeleportType.MINIGAME, ""),
        DAGANNOTHS("Dagannoths", new WorldTile(2899, 4450, 0), 8141, TeleportType.BOSS, "dks");

        String name;
        WorldTile loc;
        TeleportType type;
        String[] aliases;
        int iconItemId;

        /**
         * @param aliases for the ;;tp command
         */
        Location(String name, WorldTile location, int iconItemId, TeleportType teleportType, String... aliases) {
            this.name = name;
            this.aliases = aliases;
            this.iconItemId = iconItemId;
            loc = location;
            type = teleportType;
        }

        public TeleportType getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public String[] getAliases() {
            return aliases;
        }

        public WorldTile getTile() {
            return loc;
        }

        public int getIconItemId() {
            return iconItemId;
        }

        public boolean matches(String name) {
            if (this.name.equalsIgnoreCase(name)) return true;
            if (aliases == null) return false;
            for (String alias : aliases)
                if (alias.equalsIgnoreCase(name)) return true;
            return false;
        }
    }

    /**
     * Teleports the player
     */
    private static void handleTeleport(String name, Player player) {
        for (Location loc : Location.values()) {
            if (loc.matches(name)) {
                Magic.normalTeleport(player, loc.getTile());
                player.sendMessage("You teleport to " + loc.getName());
                return;
            }
        }
    }

    /**
     * Handle the command given after ;;tp
     */
    public static void handleCommand(String command, Player player) {
        switch (command.split(" ")[0]) {
            case "list":
                listTeleports(command.split(" "), player);
                break;
            case "alias":
            case "aliases":
                listAliases(command.split(" "), player);
                break;
            case "help":
            case "?":
            case "":
            case "commands":
                listCommands(player);
                break;
            default:
                handleTeleport(command, player);
        }

    }

    private static void listCommands(Player player) {
        String message = "";
        message += "Usage: ::tp [teleport],,Commands:,::tp list [category](optional) - lists possible teleports,"
                   + "::tp alias [teleport] - lists possible aliases for teleport," + "::tp help - this command,,"
                   + "Categories:,";
        for (TeleportType teleportType : TeleportType.values()) {
            message += teleportType.getName() + ",";
        }
        sendInterfaceMessage("Help", message, player);
    }

    private static void listAliases(String[] command, Player player) {
        if (command.length < 2) {
            player.sendMessage("Usage: tp alias [TeleportName].");
            return;
        }
        String title = "Aliases for " + command[1] + ":";
        String result = "";
        int aliasCount = 0;
        for (Location loc : Location.values()) {
            if (loc.matches(command[1])) {
                result += loc.getName() + ", ";
                for (String alias : loc.getAliases()) {
                    result += alias + ", ";
                    aliasCount++;
                }
                break;
            }
        }
        if (aliasCount == 0) result += "None ";
        sendInterfaceMessage(title, result.substring(0, result.length() - 2), player);
    }

    private static void listTeleports(String[] command, Player player) {
        String title = "Teleports:";
        String result = "";
        if (command.length < 2) {
            for (Location loc : Location.values()) {
                result += loc.getName() + ", ";
            }
        } else {
            String search = command[1];
            title = "Teleports in category: " + search;
            result = "";
            for (Location loc : Location.values()) {
                if (loc.getType().getName().equalsIgnoreCase(search)) result += loc.getName() + ", ";
            }
        }
        sendInterfaceMessage(title, result.substring(0, result.length() - 2), player);
    }

    private static void sendInterfaceMessage(String title, String message, Player player) {
        player.getInterfaceManager().sendInterface(275);
        int number = 0;
        for (int i = 0; i < 100; i++) {
            player.getPackets().sendIComponentText(275, i, "");
        }
        for (String string : message.split(",")) {
            number++;
            player.getPackets().sendIComponentText(275, (18 + number), string);
        }
        player.getPackets().sendIComponentText(275, 2, "Teleport command");
        player.getPackets().sendIComponentText(275, 16, " ");
        player.getPackets().sendIComponentText(275, 17, title);
    }

    /**
     * Handle a click on the teleport interface
     **/
    private static void handleInterfaceClick(Player player, int componentId) {
        if (componentId == 23) {
            QuestHandler.showQuestInterface(player);
            return;
        }
        Location location = indexMap.get(componentId);
        if (location == null) return;
        if (Magic.normalTeleport(player, location.getTile()))
            player.sendMessage("You teleport to " + location.getName());
    }

    private static final int START_INDEX = 26;

    /**
     * Opens the teleportation interface
     */
    public static void openTeleportationInterface(Player player) {
        indexMap.clear();
        player.getInterfaceManager().sendTab(player.getInterfaceManager().hasResizableScreen() ? 93 : 207, 895);
        player.getPackets().sendIComponentText(895, 23, "<col=5533ff><u=5533ff>Quests");
        player.getPackets().sendIComponentText(895, 24, "");
        player.getPackets().sendIComponentText(895, 25, "<col=5533ff><u=5533ff> Teleports                   ");
        player.getPackets().sendItemOnIComponent(895, 83, 9813, 1);
        player.getPackets().sendHideIComponent(895, 84, true);
        player.getPackets().sendHideIComponent(895, 85, true);
        int i = 0;
        for (TeleportType type : TeleportType.values()) {
            if (locations.get(type) == null) continue;
            player.getPackets().sendIComponentText(895,
                    START_INDEX + i++, " <col=5577cc><u=5577cc>-----" + type.getName() + "-----</col>");
            player.getPackets().sendHideIComponent(895, START_INDEX + 59 + i, true);
            for (Location loc : locations.get(type)) {
                indexMap.put(i + START_INDEX, loc);
                player.getPackets().sendIComponentText(895,
                        START_INDEX + i,
                        " " + loc.getName() + (Wilderness.isAtWild(loc.getTile()) ? " <col=ff2222>(W)</col>" : ""));
                player.getPackets().sendItemOnIComponent(895, START_INDEX + 60 + i, loc.getIconItemId(), 1);
                i++;
            }
        }
        while (i + START_INDEX < 83) {
            player.getPackets().sendHideIComponent(895, START_INDEX + i++, true);
            player.getPackets().sendHideIComponent(895, START_INDEX + 59 + i, true);
        }
        player.getPackets().sendIComponentText(895, 18, "Teleportation");
    }

    private static HashMap<TeleportType, ArrayList<Location>> locations = new HashMap<>();
    private static HashMap<Integer, Location> indexMap = new HashMap<>();

    static {
        for (Location loc : Location.values()) {
            locations.putIfAbsent(loc.getType(), new ArrayList<>());
            locations.get(loc.getType()).add(loc);
        }
    }

}

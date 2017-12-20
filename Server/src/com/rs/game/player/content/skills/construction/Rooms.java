package com.rs.game.player.content.skills.construction;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.world.WorldObject;

import static com.rs.game.player.content.skills.construction.Furniture.Builds.*;

public class Rooms {

    public enum Room {
        //Tele to 1884 5106, do coords, get rx and ry
        PARLOUR(232, 639, 1, 93, 1000, "Parlour", true, true, CURTAINS, FIREPLACE, RUG, PARLOUR_CHAIRS, BOOKCASE),
        GARDEN(232, 633, 1, 94, 1000, "Garden", false, false, BIG_PLANT_1, BIG_PLANT_2, SMALL_PLANT_1, SMALL_PLANT_2,
                BIG_TREE, TREE, CENTREPIECE),
        KITCHEN(234, 639, 5, 95, 5000, "Kitchen", true, true, CAT_BLANKET, BARRELS, KITCHEN_TABLE, KITCHEN_SHELVES,
                SHELVES_2, LARDER, SINK, STOVE),
        DINING_ROOM(236, 639, 10, 96, 5000, "Dining room", true, true, DINING_BENCH_1, DINING_BENCH_2, DINING_TABLE,
                CURTAINS, FIREPLACE, DECORATIONS, ROPE_BELL_PULL),
        WORKSHOP(232, 637, 15, 97, 10000, "Workshop", true, true, WORKBENCH, HERALDRY, REPAIR, TOOLS, CRAFTING),
        BEDROOM(238, 639, 20, 98, 10000, "Bedroom", true, true, RUG, CLOCKS, FIREPLACE, CURTAINS, WARDROBE, BED,
                DRESSERS),
        SKILL_HALL_1(233, 638, 25, 99, 15000, "Skill hall 1", true, true, RUG, STAIRCASE, BASIC_ARMOURS,
                DECORATIVE_ARMOUR, RUNE_CASE, MOUNTED_FISH, HEAD_TROPHY),
        SKILL_HALL_2(235, 638, 0, 0, 0, "Skill hall 2", true, true),
        GAMES_ROOM(237, 636, 30, 100, 25000, "Games room", true, true, GAME, GAME_CHEST, ELEMENTAL_BALANCE,
                ATTACK_STONE, RANGING_GAME),
        COMBAT_ROOM(235, 636, 32, 101, 25000, "Combat room", true, true, COMBAT_RING, WEAPONS_RACK, DECORATIONS),
        QUEST_HALL_1(237, 638, 35, 102, 25000, "Quest hall 1", true, true, RUG, BOOKCASE, GUILD_TROPHY, SWORD,
                PORTRAIT,LANDSCAPE, MAP, STAIRCASE),
        QUEST_HALL_2(239, 638, 0, 0, 0, "Quest hall 2", true, true),
        STUDY(236, 637, 40, 104, 50000, "Study", true, true, BOOKCASE, CHARTS, TELESCOPE, GLOBE, LECTERN,CRYSTAL_BALL, STUDY_STATUE),
        COSTUME_ROOM(238, 633, 42, 105, 50000, "Costume room", true, true),
        CHAPEL(234, 637, 45, 106, 50000, "Chapel", true, true, RUG, ALTAR, STATUES, MUSICAL, ICON, LAMP, WINDOW),
        PORTALROOM(233, 636, 50, 107, 100000, "Portal room", true, true),
        FANCYGARDEN(234, 633, 55, 108, 75000, "Formal garden", true, false),
        THRONEROOM(238, 637, 60, 109, 150000, "Throne room", true, true);

        private int chunkX;
        private int chunkY;
        private int level;
        private int componentId;
        private int cost;
        private String name;
        private boolean showRoof;
        private boolean hasDoors;

        private Furniture.Builds[] builds;

        Room(int chunkX, int chunkY, int level, int componentId, int cost, String name, boolean showRoof, boolean
                hasDoors, Furniture.Builds... builds) {
            this.chunkX = chunkX;
            this.chunkY = chunkY;
            this.level = level;
            this.componentId = componentId;
            this.cost = cost;
            this.name = name;
            this.showRoof = showRoof;
            this.hasDoors = hasDoors;
            this.builds = builds;
        }

        public boolean containsBuild(Furniture.Builds build) {
            for (Furniture.Builds furn : builds)
                if (build.equals(furn)) return true;
            return false;
        }

        public int getChunkX() {
            return chunkX;
        }

        public int getChunkY() {
            return chunkY;
        }

        public int getLevel() {
            return level;
        }

        public int getCost() {
            return cost;
        }

        public String getName() {
            return name;
        }

        public boolean isShowRoof() {
            return showRoof;
        }

        public boolean doesHaveDoors() {
            return hasDoors;
        }

        public static Room forId(int i) {
            for (Room room : Room.values())
                if (room.componentId == i) return room;
            return null;
        }

        public boolean hasBuilds() {
            return builds.length > 0;
        }
    }

    /**
     * Start creating a new room (activated by clicking remove on a door)
     *
     * @param player the player
     * @param door   the door world object
     */
    public static void openRoomCreationMenu(Player player, WorldObject door) {
        int doorRoomX = door.getChunkX() - player.getHouse().getBoundChunks()[0];
        int doorRoomY = door.getChunkY() - player.getHouse().getBoundChunks()[1];
        int roomX = player.getChunkX() - player.getHouse().getBoundChunks()[0];
        int roomY = player.getChunkY() - player.getHouse().getBoundChunks()[1];
        int xInChunk = door.getXInChunk();
        int yInChunk = door.getYInChunk();
        if (xInChunk == 0 || xInChunk == 7) {
            if (roomX > doorRoomX) {
                roomX--;
            } else if (roomX < doorRoomX) {
                roomX++;
            } else if (xInChunk > 4) roomX++;
            else roomX--;
        } else if (yInChunk == 0 || yInChunk == 7) {
            if (roomY > doorRoomY) {
                roomY--;
            } else if (roomY < doorRoomY) {
                roomY++;
            } else if (yInChunk > 4) roomY++;
            else roomY--;
        }
        openRoomCreationMenu(player, roomX, roomY, door.getPlane());
    }

    /**
     * Let the player select a room type to be created on the specified coordinates
     *
     * @param roomX x
     * @param roomY y
     * @param plane z
     */
    private static void openRoomCreationMenu(Player player, int roomX, int roomY, int plane) {
        RoomReference room = player.getHouse().getRoomFor(roomX, roomY, plane);
        if (room != null) {
            if (room.getPlane() == 1 && player.getHouse().getRoomFor(roomX, roomY, room.getPlane() + 1) != null) {
                player.getDialogueManager().startDialogue("SimpleMessage",
                        "You can't remove a room that is " + "supporting another room.");
                return;
            }
            player.getDialogueManager().startDialogue("RemoveRoom", room);
        } else {
            if (roomX == 0 || roomY == 0 || roomX == 7 || roomY == 7) {
                player.getDialogueManager().startDialogue("SimpleMessage", "You can't create a room here.");
                return;
            }

            player.getInterfaceManager().sendInterface(402);
            player.getTemporaryAttributes().put("CreationRoom", new int[]{roomX, roomY, plane});
            player.setCloseInterfacesEvent(() -> player.getTemporaryAttributes().remove("CreationRoom"));
        }
    }

    /**
     * Start previewing a room
     *
     * @param player the player
     * @param roomId the component id of the room
     */
    public static void createRoom(Player player, int roomId) {
        Room room = Room.forId(roomId);
        if (room == null || !room.hasBuilds()) {
            player.sendMessage("That room hasn't been added yet.");
            return;
        }
        int[] location = (int[]) player.getTemporaryAttributes().get("CreationRoom");
        player.closeInterfaces();
        if (location == null) return;
        if (!RequirementsManager.hasRequirement(player, Skills.CONSTRUCTION, room.level, "build this room")) return;
        if (player.getInventory().numberOf(995) < room.getCost()) {
            player.sendMessage("You don't have enough coins to build this room");
            return;
        }
        player.startDialogue("CreateRoom", new RoomReference(room, location[0], location[1], location[2], 0));
    }

    /**
     * Finally actually add the room to the house
     *
     * @param room the room
     */
    public static void createRoom(Player player, RoomReference room) {
        if (player.getInventory().numberOf(995) < room.getRoom().getCost()) {
            player.getPackets().sendGameMessage("You don't have enough coins to build this room.");
            return;
        }
        player.getInventory().deleteItem(new Item(995, room.getRoom().getCost()));
        player.getHouse().getRooms().add(room);
        player.getHouse().refresh();
    }

}

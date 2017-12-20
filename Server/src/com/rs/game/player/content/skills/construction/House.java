package com.rs.game.player.content.skills.construction;

import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.player.Player;
import com.rs.game.world.*;
import com.rs.utils.areas.Rectangle;

import java.io.Serializable;
import java.util.ArrayList;

import static com.rs.game.player.content.skills.construction.Furniture.FurnitureObj.EXIT_PORTAL;

public class House implements Serializable {

    private static final long serialVersionUID = -1508944088022371423L;

    private static final int BASIC_WOOD = 0, BASIC_STONE = 1, WHITEWASHED_STONE = 2, FREMENNIK_STYLE_WOOD = 3,
            TROPICAL_WOOD = 4, FANCY_STONE = 5, DARK_STONE = 6;

    private static final int[] LAND = {233, 632};

    private int[] boundChunks;
    private int ground, look;

    private boolean buildMode = true;

    transient private Player player;

    private ArrayList<RoomReference> rooms;

    private WorldTile enterTile;

    public House(Player player) {
        this.player = player;
        rooms = new ArrayList<>();
        rooms.add(new RoomReference(Rooms.Room.GARDEN, 3, 3, 0, 0));
        rooms.get(0).getObjects().add(new HouseObject(3, 3, 1, 10, 13405));
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void refresh() {
        RegionBuilder.destroyMap(boundChunks[0], boundChunks[1], 8, 8);
        player.setForceNextMapLoadRefresh(true);
        constructHouse();
        player.loadMapRegions();
    }

    public void setGround(int ground) {
        this.ground = ground;
    }

    public void setLook(int look) {
        this.look = look;
    }

    public void enterHouse() {
        enterTile = player.getLocation();
        System.out.println(enterTile.toString());
        boundChunks = RegionBuilder.findEmptyMap(8, 8);
        player.getControllerManager().startController("HouseController");
    }

    public void leaveHouse() {
        System.out.println(enterTile.toString());
        player.setNextWorldTile(enterTile);
        RegionBuilder.destroyMap(boundChunks[0], boundChunks[1], 8, 8);
    }

    public void teleportToHouse() {
        player.setNextWorldTile(new WorldTile(boundChunks[0] * 8 + 32 - 4, boundChunks[1] * 8 + 32 - 4, 0));
    }

    /**
     * Preview a room before building it
     *
     * @param reference the room being previewed
     * @param remove    shall we removed something before showing the room
     */
    public void previewRoom(RoomReference reference, boolean remove) {
        int boundX = boundChunks[0] * 8 + reference.getX() * 8;
        int boundY = boundChunks[1] * 8 + reference.getY() * 8;
        int realChunkX = reference.getRoom().getChunkX();
        int realChunkY = reference.getRoom().getChunkY();
        Region region = World.getRegion(RegionBuilder.getRegionHash(realChunkX / 8, realChunkY / 8));

        if (region.getSpawnedObjects() != null) region.getSpawnedObjects().clear();
        if (region.getRemovedObjects() != null) region.getRemovedObjects().clear();

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                WorldObject[] objects = region.getObjects(reference.getPlane(),
                        (realChunkX & 0x7) * 8 + x, (realChunkY & 0x7) * 8 + y);
                if (objects != null) {
                    for (WorldObject object : objects) {
                        if (object == null) {
                            continue;
                        }
                        ObjectDefinitions definitions = object.getDefinitions();
                        if (definitions == null) continue;
                        if (definitions.containsOption("Build") || remove) {
                            int[] coords = RegionBuilder.translate(x, y, reference.getRotation(), definitions.sizeX,
                                    definitions.sizeY, object.getRotation());
                            WorldObject objectR = new WorldObject(object.getId(), object.getType(),
                                    (reference.getRotation() + object.getRotation()) & 0x3,
                                    boundX + coords[0], boundY + coords[1], reference.getPlane());
                            if (remove) {
                                World.destroySpawnedObject(objectR, false);
                            } else {
                                World.destroySpawnedObject(object, false);
                                World.spawnObject(objectR, false);
                            }
                        }
                    }
                }
            }
        }
    }

    private static int[] WALL_IDS = new int[]{13098, 13090, 13004, 13111, -1, 13116, 52829};

    /**
     * Construct the POH and the grounds around it
     */
    public void constructHouse() {
        Object[][][][] data = new Object[4][8][8][];
        Region region = World.getRegion(new WorldTile(boundChunks[0] * 8, boundChunks[1] * 8, 0).getRegionId());

        if (region.getSpawnedObjects() != null) region.getSpawnedObjects().clear();
        if (region.getRemovedObjects() != null) region.getRemovedObjects().clear();

        for (RoomReference reference : rooms) {
            data[reference.getPlane()][reference.getX()][reference.getY()] = new Object[]{reference.getRoom()
                    .getChunkX(), reference.getRoom().getChunkY(), reference.getRotation(), reference.getRoom()
                    .isShowRoof()};
        }
        if (!buildMode) {
            for (int x = 1; x < 7; x++) {
                skipY:
                for (int y = 1; y < 7; y++) {
                    for (int plane = 2; plane >= 0; plane--) {
                        if (data[plane][x][y] != null) {
                            boolean hasRoof = (boolean) data[plane][x][y][3];
                            if (hasRoof) {
                                Boolean[] roomDirs = new Boolean[4];
                                RoomReference reference = getRoomFor(x - 1, y, plane);
                                roomDirs[RegionBuilder.WEST] = reference != null && reference.getRoom().isShowRoof();
                                reference = getRoomFor(x + 1, y, plane);
                                roomDirs[RegionBuilder.EAST] = reference != null && reference.getRoom().isShowRoof();
                                reference = getRoomFor(x, y - 1, plane);
                                roomDirs[RegionBuilder.SOUTH] = reference != null && reference.getRoom().isShowRoof();
                                reference = getRoomFor(x, y + 1, plane);
                                roomDirs[RegionBuilder.NORTH] = reference != null && reference.getRoom().isShowRoof();

                                Roof result = Roof.ROOF1;
                                byte roofRotation = 0;
                                Boolean[] tempDirs = new Boolean[4];
                                roof:
                                for (Roof roof : Roof.values()) {
                                    System.arraycopy(roomDirs, 0, tempDirs, 0, roomDirs.length);
                                    rotation:
                                    for (byte rotation = 0; rotation < 4; rotation++) {
                                        result = roof;
                                        roofRotation = (byte) (rotation + 1);
                                        rotateDirs(tempDirs);
                                        for (int i = 0; i < tempDirs.length; i++) {
                                            if (tempDirs[i] && !roof.containsDir(i)) {
                                                continue rotation;
                                            }
                                        }
                                        break roof;
                                    }
                                }
                                data[plane
                                     + 1][x][y] = new Object[]{result.getChunkX(), result.getChunkY(), roofRotation,
                                        true};

                            }
                            continue skipY;
                        }
                    }
                }
            }
        }

        for (int plane = 0; plane < data.length; plane++) {
            for (int x = 0; x < data[plane].length; x++) {
                for (int y = 0; y < data[plane][x].length; y++) {
                    if (data[plane][x][y] != null) RegionBuilder.copyChunk((int) data[plane][x][y][0] + (
                                    look >= 4 ? 8 : 0), (int) data[plane][x][y][1], (boolean) data[plane][x][y][3] ?
                                    look % 4 : ground % 4,
                            boundChunks[0] + x, boundChunks[1] + y, plane, (byte) data[plane][x][y][2]);
                    else if (plane == 0) RegionBuilder.copyChunk(LAND[0], LAND[1], ground,
                            boundChunks[0] + x, boundChunks[1] + y, plane, 0);
                }
            }
        }
        WorldObject[] objects;
        for (int plane = 0; plane < 4; plane++)
            for (int x = boundChunks[0] * 8; x < boundChunks[0] * 8 + 8 * 8; x++) {
                for (int y = boundChunks[1] * 8; y < boundChunks[1] * 8 + 8 * 8; y++) {
                    objects = World.getObjects(new WorldTile(x, y, plane));
                    if (objects == null) continue;
                    for (WorldObject o : objects) {
                        if (o == null) continue;
                        o = new WorldObject(o.getId(), o.getType(), o.getRotation(), x, y, o.getPlane());
                        RoomReference room = getRoomFor(o.getChunkX() - boundChunks[0] + (
                                        o.getRotation() == 0 ? -1 : o.getRotation() == 2 ? 1 : 0),
                                o.getChunkY() - boundChunks[1] + (
                                        o.getRotation() == 1 ? 1 : o.getRotation() == 3 ? -1 : 0), o.getPlane());
                        if (!buildMode && o.getDefinitions().containsOption("Build")) {
                            if (o.getDefinitions().name.equalsIgnoreCase("door hotspot")) {
                                if (room == null && getRoom(o).getRoom().doesHaveDoors()) {
                                    World.spawnObject(new WorldObject(WALL_IDS[look], o.getType(),
                                            o.getRotation() + getRoom(o).getRotation(), x, y, o.getPlane()), true);
                                } else {
                                    World.removeObject(o, true);
                                }
                            } else if (!objectExists(getRoom(o), o)) World.removeObject(o, true);
                        } else if (o.getDefinitions().name.equalsIgnoreCase("window")) {
                            if (room == null || !room.getRoom().isShowRoof())
                                o = new WorldObject(getWindowId(), o.getType(),
                                        o.getRotation() + getRoom(o).getRotation(), x, y, o.getPlane());
                            else o = new WorldObject(WALL_IDS[look], o.getType(),
                                    o.getRotation() + getRoom(o).getRotation(), x, y, o.getPlane());
                            World.spawnObject(o, true);
                        }
                    }
                }
            }

        for (RoomReference reference : rooms) {
            WorldObject object;
            for (HouseObject houseObject : reference.getObjects()) {
                object = new WorldObject(houseObject.getObjectId(), houseObject.getObjectType(),
                        reference.getRotation() + houseObject.getRotation(),
                        boundChunks[0] * 8 + +reference.getX() * 8 + houseObject.getX(),
                        boundChunks[1] * 8 + reference.getY() * 8 + houseObject.getY(), reference.getPlane());
                World.spawnObject(object, true);
            }
        }
    }

    private void rotateDirs(Boolean[] array) {
        boolean temp;
        for (int i = 0; i < array.length - 1; i++) {
            temp = array[(i == 0 ? array.length : i) - 1];
            array[(i == 0 ? array.length : i) - 1] = array[i];
            array[i] = temp;
        }
    }

    private int getWindowId() {
        switch (look) {
            case BASIC_WOOD:
                return 13099;
            case BASIC_STONE:
                return 13091;
            case WHITEWASHED_STONE:
                return 13005;
            case FREMENNIK_STYLE_WOOD:
                return 13112;
            case TROPICAL_WOOD:
                return 10816;
            case FANCY_STONE:
                return 13117;
            case DARK_STONE:
                return 52830;
            default:
                return 13116;
        }
    }

    private int getDoorId(WorldObject object) {
        int id;
        switch (look) {
            case BASIC_WOOD:
                id = 13100;
                break;
            case BASIC_STONE:
                id = 13094;
                break;
            case WHITEWASHED_STONE:
                id = 13006;
                break;
            case FREMENNIK_STYLE_WOOD:
                id = 13107;
                break;
            case TROPICAL_WOOD:
                id = 13015;
                break;
            case FANCY_STONE:
                id = 10817;
                break;
            case DARK_STONE:
            default:
                id = 1058;
                break;
        }
        if (object.getXInChunk() > 2 && object.getXInChunk() < 6) {
            return id + (object.getXInChunk() - 4);
        } else {
            return id + (4 - object.getYInChunk());
        }
    }

    /**
     * How many portals do we have built?
     */
    private int getPortalCount() {
        int portalCount = 0;
        for (RoomReference room : rooms)
            for (HouseObject object : room.getObjects())
                if (object.getObjectId() == EXIT_PORTAL.getId()) portalCount++;
        return portalCount;
    }

    private boolean objectExists(RoomReference room, WorldObject object) {
        if (room == null) return false;
        HouseObject temp = new HouseObject(object.getXInChunk(), object.getYInChunk(), object.getType(), object
                .getRotation(), object.getId());
        for (HouseObject obj : room.getObjects()) {
            if (temp.getX() == obj.getX() && temp.getY() == obj.getY()) return true;
        }
        return false;
    }

    int[] getBoundChunks() {
        return boundChunks;
    }

    ArrayList<RoomReference> getRooms() {
        return rooms;
    }

    /**
     * Get room for house coordinates
     *
     * @param x x
     * @param y y
     * @param z plane
     * @return RoomReference
     */
    RoomReference getRoomFor(int x, int y, int z) {
        for (RoomReference r : getRooms()) {
            if (r.getX() == x && r.getY() == y && r.getPlane() == z) {
                return r;
            }
        }
        return null;
    }

    RoomReference getRoom(WorldTile tile) {
        int roomX = tile.getChunkX() - boundChunks[0];
        int roomY = tile.getChunkY() - boundChunks[1];
        return getRoomFor(roomX, roomY, tile.getPlane());
    }

    public void setBuildMode(boolean mode) {
        buildMode = mode;
    }

    /**
     * Is the building mode active
     *
     * @param silent false sends a message to the player telling they should enable building mode
     * @return building mode
     */
    boolean isBuildMode(boolean silent) {
        if (!silent && !buildMode) {
            player.getDialogueManager().startDialogue("SimpleMessage", "You can only do that in building mode.");
        }
        return buildMode;
    }

    /**
     * Add an object to the current room
     */
    void addObject(RoomReference reference, HouseObject object) {
        reference.getObjects().add(object);
    }

    /**
     * Remove a room from the house
     */
    public void removeRoom(RoomReference room) {
        if (rooms.remove(room)) refresh();
        else player.sendMessage("There was an error removing the room. Contact staff.");
    }

    /**
     * Remove a specific object from the POH
     *
     * @param object the object to be remove
     */
    public void removeObject(WorldObject object) {
        if (!isBuildMode(false)) return;

        int roomX = object.getChunkX() - player.getHouse().getBoundChunks()[0];
        int roomY = object.getChunkY() - player.getHouse().getBoundChunks()[1];

        RoomReference room = getRoomFor(roomX, roomY, object.getPlane());

        ArrayList<Furniture.Builds> matchingBuilds = new ArrayList<>();

        for (Furniture.Builds builds : Furniture.Builds.values())
            if (builds.containsObject(object) && room.getRoom().containsBuild(builds)) matchingBuilds.add(builds);

        for (HouseObject houseObject : room.getObjects()) {
            if (object.getType() != houseObject.getObjectType()) continue;
            for (Furniture.Builds build : matchingBuilds) {
                if (build.getAreas() != null) {
                    player.setNextAnimation(new Animation(3685));
                    for (Rectangle rect : build.getAreas()) {
                        if (rect.contains(houseObject.getX(), houseObject.getY(), room.getPlane())) {
                            WorldObject[] atObjects = World.getObjects(new WorldTile(
                                    room.getRoom().getChunkX() * 8 + houseObject.getX(),
                                    room.getRoom().getChunkY() * 8 + houseObject.getY(), 0));
                            for (WorldObject worldObject : atObjects) {
                                if (worldObject.getType() == houseObject.getObjectType()
                                    && build.containsId(worldObject.getId())) {
                                    if (houseObject.getObjectId() == EXIT_PORTAL.getId() && getPortalCount() < 2) {
                                        player.startDialogue("SimpleMessage", "You can't remove your last exit portal"
                                                                              + ".");
                                        return;
                                    }
                                    room.getObjects().remove(houseObject);
                                    World.removeSpawnedObject(worldObject, false);
                                    worldObject = new WorldObject(worldObject.getId(), houseObject.getObjectType(),
                                            worldObject.getRotation() + room.getRotation(),
                                            (player.getHouse().getBoundChunks()[0] + room.getX()) * 8
                                            + houseObject.getX(),
                                            (player.getHouse().getBoundChunks()[1] + room.getY()) * 8
                                            + houseObject.getY(), room.getPlane());
                                    World.removeSpawnedObject(worldObject, false);
                                    World.spawnObject(worldObject, false);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                } else {
                    if (build.containsObject(object) || build.getId() == object.getId()) {
                        World.removeSpawnedObject(object, false);
                        room.getObjects().remove(houseObject);
                        object = new WorldObject(build.getId(), object.getType(), object.getRotation(), object.getX()
                                , object.getY(), object.getPlane());
                        World.removeSpawnedObject(object, false);
                        World.spawnObject(object, false);//false doesn't change clip data but its fine because it's
                        // already clipped by the placeholder
                        player.setNextAnimation(new Animation(3685));
                        return;
                    }
                }

            }
        }

    }

    public boolean atHouse() {
        int boundX = boundChunks[0] * 8;
        int boundY = boundChunks[1] * 8;
        return (new Rectangle(boundX, boundY, boundX + 64, boundY + 64).contains(player));
    }
}
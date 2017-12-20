package com.rs.game.world;

import com.rs.cache.Cache;
import com.rs.game.npc.Npc;
import com.rs.game.player.Player;

import java.util.List;

public final class RegionBuilder {

    public static final int NORTH = 0, EAST = 1, SOUTH = 2, WEST = 3;
    /*
    public static final int NORTH = 1;
	public static final int EAST = 4;
	public static final int SOUTH = 6;
	public static final int WEST = 3;*/

    /*
     * build here the maps you wont edit again
     */
    public static void init() {
        // a small test, copying 100x100 area from lumby up to varrock to coords
        // 4000-4100x 4000-4100y
        // int[] map = findEmptyMap(100,100);
        // 8,240, SOUTH_DOOR

        // copyAllPlanesMap(getRegion(3222), getRegion(3222), getRegion(4000),
        // getRegion(4000), 100);
        /*
         * int base = getRegion(4000); copy2RatioSquare(8,240, base,base, 0);
		 * base = getRegion(5000); copy2RatioSquare(8,240, base,base, 1);
		 */
        // copy2RatioSquare(14, 624, getRegion(5000),getRegion(5000), 2);

        // Towers Pk Area
        copyAllPlanesMap(376, 369, 1248, 1248, 7);
        copyAllPlanesMap(376, 369, 1248, 1255, 7);
        copyAllPlanesMap(376, 369, 1255, 1248, 7);
        copyAllPlanesMap(376, 369, 1255, 1255, 7);
    }

    // public static final void copyMap(int fromRegionX, int fromRegionY, int
    // toRegionX, int toRegionY, int widthRegions, int heightRegions, int[]
    // fromPlanes, int[] toPlanes, int rotation) {

    public static int getRegion(int c) {
        return c >> 3;
    }

    /*
     * do not use this out builder
     */
    public static void noclipCircle(int x, int y, int plane, int ratio) throws InterruptedException {
        for (int xn = x - ratio; xn < x + ratio; xn++) {
            for (int yn = y - ratio; yn < y + ratio; yn++) {
                if (Math.pow(2, x - xn) + Math.pow(2, y - yn) <= Math.pow(2, ratio)) {
                    int regionId = new WorldTile(xn, yn, 0).getRegionId();
                    Region region = World.getRegion(regionId);
                    int baseLocalX = xn - ((regionId >> 8) * 64);
                    int baseLocalY = yn - ((regionId & 0xff) * 64);
                    while (region.getLoadMapStage() != 2) { // blocks waiting
                        // for load of
                        // region to be come
                        // System.out.println("nocliping: "+xn+", "+yn);
                        Thread.sleep(1);
                    }
                    System.out.println("nocliping: " + xn + ", " + yn + ", " + baseLocalX + ", " + baseLocalY);
                    System.out.println(region.forceGetRegionMap().getMasks()[plane][baseLocalX][baseLocalY]);
                    region.forceGetRegionMap().setMask(plane, baseLocalX, baseLocalY, 0);
                    System.out.println(region.forceGetRegionMap().getMasks()[plane][baseLocalX][baseLocalY]);

                    region.forceGetRegionMapClipedOnly().setMask(plane, baseLocalX, baseLocalY, 0);
                }
            }
        }
    }

    private static boolean lastSearchPositive; // used to fast up the formula

    /*
     * returns the offset regionx and y notice that every region is 8x8 block.
     * so example x 2 y 3 is (16 x 24 area) the returned map is distanced from
     * other existing/generated maps so you wont see them if you close to them
     */
    public static int[] findEmptyMap(int widthRegions, int heightRegions) {
        boolean lastSearchPositive = RegionBuilder.lastSearchPositive = !RegionBuilder.lastSearchPositive;
        int regionsXDistance = ((widthRegions) / 8) + 1; // 1map distance at
        // least
        int regionsYDistance = ((heightRegions) / 8) + 1; // 1map distance at
        // least
        for (int regionIdC = 0; regionIdC < 23629; regionIdC++) {
            int regionId = lastSearchPositive ? 20000 - regionIdC : regionIdC;
            int regionX = (regionId >> 8) * 64;
            int regionY = (regionId & 0xff) * 64;
            if (regionX >> 3 < 336 || regionY >> 3 < 336) continue;
            boolean found = true;
            for (int thisRegionX = regionX - 64; thisRegionX < (regionX + (regionsXDistance * 64)); thisRegionX += 64) {
                for (int thisRegionY = regionY - 64; thisRegionY < (regionY + (regionsYDistance * 64)); thisRegionY
                        += 64) {
                    if (thisRegionX < 0 || thisRegionY < 0) continue;
                    if (!emptyRegion(thisRegionX, thisRegionY, !(thisRegionX < regionX || thisRegionY < regionY ||
                            thisRegionX > (regionX + ((regionsXDistance - 1) * 64))) || thisRegionY > (regionY + (
                                    (regionsYDistance - 1) * 64)))) {
                        found = false;
                        break;
                    }

                }
            }
            if (found) return new int[]{getRegion(regionX), getRegion(regionY)};
        }
        return null;
    }

    private static boolean emptyRegion(int regionX, int regionY, boolean checkValid) {
        if (regionX > 10000 || regionY > 16000) return !checkValid; // invalid map gfto
        int rx = getRegion(regionX) / 8;
        int ry = getRegion(regionY) / 8;
        if (Cache.STORE.getIndexes()[5].getArchiveId("m" + rx + "_" + ry) != -1)
            return false; // a real map already exists
        Region region = World.getRegions().get((rx << 8) + ry);
        return region == null || !(region instanceof DynamicRegion);
    }

    public static void cutRegion(int regionX, int regionY, int plane) {
        DynamicRegion toRegion = createDynamicRegion((((regionX / 8) << 8) + (regionY / 8)));
        int regionOffsetX = (regionX - ((regionX / 8) * 8));
        int regionOffsetY = (regionY - ((regionY / 8) * 8));
        toRegion.getRegionCoords()[plane][regionOffsetX][regionOffsetY][0] = 0;
        toRegion.getRegionCoords()[plane][regionOffsetX][regionOffsetY][1] = 0;
        toRegion.getRegionCoords()[plane][regionOffsetX][regionOffsetY][2] = 0;
        toRegion.getRegionCoords()[plane][regionOffsetX][regionOffsetY][3] = 0;
    }

    public static void destroyMap(int toRegionX, int toRegionY, int widthRegions, int heightRegions) {
        for (int xOffset = 0; xOffset < widthRegions; xOffset++) {
            for (int yOffset = 0; yOffset < heightRegions; yOffset++) {
                int toThisRegionX = toRegionX + xOffset;
                int toThisRegionY = toRegionY + yOffset;
                destroyDynamicRegion(((toThisRegionX / 8) << 8) + (toThisRegionY / 8));
            }
        }
    }

    public static void repeatMap(int toRegionX, int toRegionY, int widthRegions, int heightRegions, int rx, int ry,
                                 int plane, int rotation, int... toPlanes) {
        for (int xOffset = 0; xOffset < widthRegions; xOffset++) {
            for (int yOffset = 0; yOffset < heightRegions; yOffset++) {
                int toThisRegionX = toRegionX + xOffset;
                int toThisRegionY = toRegionY + yOffset;
                DynamicRegion toRegion = createDynamicRegion((((toThisRegionX / 8) << 8) + (toThisRegionY / 8)));
                int regionOffsetX = (toThisRegionX - ((toThisRegionX / 8) * 8));
                int regionOffsetY = (toThisRegionY - ((toThisRegionY / 8) * 8));
                for (int toPlane : toPlanes) {
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][0] = rx;
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][1] = ry;
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][2] = plane;
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][3] = rotation;
                    World.getRegion((((rx / 8) << 8) + (ry / 8)), true);
                }
            }
        }
    }

    public static void cutMap(int toRegionX, int toRegionY, int widthRegions, int heightRegions, int... toPlanes) {
        for (int xOffset = 0; xOffset < widthRegions; xOffset++) {
            for (int yOffset = 0; yOffset < heightRegions; yOffset++) {
                int toThisRegionX = toRegionX + xOffset;
                int toThisRegionY = toRegionY + yOffset;
                DynamicRegion toRegion = createDynamicRegion((((toThisRegionX / 8) << 8) + (toThisRegionY / 8)));
                int regionOffsetX = (toThisRegionX - ((toThisRegionX / 8) * 8));
                int regionOffsetY = (toThisRegionY - ((toThisRegionY / 8) * 8));
                for (int toPlane : toPlanes) {
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][0] = 0;
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][1] = 0;
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][2] = 0;
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][3] = 0;
                }
            }
        }
    }

    /*
     * copys a single 8x8 map tile and allows you to rotate it
     */
    public static void copyRegion(int fromRegionX, int fromRegionY, int fromPlane, int toRegionX, int toRegionY, int
            toPlane, int rotation) {
        DynamicRegion toRegion = createDynamicRegion((((toRegionX / 8) << 8) + (toRegionY / 8)));
        int regionOffsetX = (toRegionX - ((toRegionX / 8) * 8));
        int regionOffsetY = (toRegionY - ((toRegionY / 8) * 8));
        toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][0] = fromRegionX;
        toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][1] = fromRegionY;
        toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][2] = fromPlane;
        toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][3] = rotation;
        World.getRegion((((fromRegionY / 8) << 8) + (fromRegionX / 8)), true);
    }

    /*
     * copies a single 8x8 map tile and allows you to rotate it
     */
    public static void copyChunk(int fromChunkX, int fromChunkY, int fromPlane, int toChunkX, int toChunkY, int toPlane, int rotation) {
        DynamicRegion toRegion = createDynamicRegion((((toChunkX / 8) << 8) + (toChunkY / 8)));
        int regionOffsetX = (toChunkX - ((toChunkX / 8) * 8));
        int regionOffsetY = (toChunkY - ((toChunkY / 8) * 8));
        toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][0] = fromChunkX;
        toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][1] = fromChunkY;
        toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][2] = fromPlane;
        toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][3] = rotation;
        World.getRegion((((fromChunkY / 8) << 8) + (fromChunkX / 8)), true);
    }

    /*
     * copy a exactly square of map from a place to another
     */
    public static void copyAllPlanesMap(int fromRegionX, int fromRegionY, int toRegionX, int toRegionY, int ratio) {
        int[] planes = new int[4];
        for (int plane = 1; plane < 4; plane++)
            planes[plane] = plane;
        copyMap(fromRegionX, fromRegionY, toRegionX, toRegionY, ratio, ratio, planes, planes);
    }

    /*
     * copy a exactly square of map from a place to another
     */
    public static void copyAllPlanesMap(int fromRegionX, int fromRegionY, int toRegionX, int toRegionY, int
            widthRegions, int heightRegions) {
        int[] planes = new int[4];
        for (int plane = 1; plane < 4; plane++)
            planes[plane] = plane;
        copyMap(fromRegionX, fromRegionY, toRegionX, toRegionY, widthRegions, heightRegions, planes, planes);
    }

    /*
     * copy a square of map from a place to another
     */
    public static void copyMap(int fromRegionX, int fromRegionY, int toRegionX, int toRegionY, int ratio, int[]
            fromPlanes, int[] toPlanes) {
        copyMap(fromRegionX, fromRegionY, toRegionX, toRegionY, ratio, ratio, fromPlanes, toPlanes);
    }

    /*
     * copy a rectangle of map from a place to another
     */
    public static void copyMap(int fromRegionX, int fromRegionY, int toRegionX, int toRegionY, int widthRegions, int
            heightRegions, int[] fromPlanes, int[] toPlanes) {
        if (fromPlanes.length != toPlanes.length)
            throw new RuntimeException("PLANES LENGTH ISNT SAME OF THE NEW PLANES ORDER!");
        for (int xOffset = 0; xOffset < widthRegions; xOffset++) {
            for (int yOffset = 0; yOffset < heightRegions; yOffset++) {
                int fromThisRegionX = fromRegionX + xOffset;
                int fromThisRegionY = fromRegionY + yOffset;
                int toThisRegionX = toRegionX + xOffset;
                int toThisRegionY = toRegionY + yOffset;
                DynamicRegion toRegion = createDynamicRegion((((toThisRegionX / 8) << 8) + (toThisRegionY / 8)));
                int regionOffsetX = (toThisRegionX - ((toThisRegionX / 8) * 8));
                int regionOffsetY = (toThisRegionY - ((toThisRegionY / 8) * 8));
                for (int pIndex = 0; pIndex < fromPlanes.length; pIndex++) {
                    int toPlane = toPlanes[pIndex];
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][0] = fromThisRegionX;
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][1] = fromThisRegionY;
                    toRegion.getRegionCoords()[toPlane][regionOffsetX][regionOffsetY][2] = fromPlanes[pIndex];
                    World.getRegion((((fromThisRegionX / 8) << 8) + (fromThisRegionY / 8)), true);
                }
            }
        }
    }

    /*
     * temporary and used for dungeonnering only
     *
     * //rotation 0 // a b // c d //rotation 1 // c a // d b //rotation2 // d c
     * // b a //rotation3 // b d // a c
     */
    public static void copy2RatioSquare(int fromRegionX, int fromRegionY, int toRegionX, int toRegionY, int rotation) {
        if (rotation == 0) {
            copyRegion(fromRegionX, fromRegionY, 0, toRegionX, toRegionY, 0, rotation);
            copyRegion(fromRegionX + 1, fromRegionY, 0, toRegionX + 1, toRegionY, 0, rotation);
            copyRegion(fromRegionX, fromRegionY + 1, 0, toRegionX, toRegionY + 1, 0, rotation);
            copyRegion(fromRegionX + 1, fromRegionY + 1, 0, toRegionX + 1, toRegionY + 1, 0, rotation);
        } else if (rotation == 1) {
            copyRegion(fromRegionX, fromRegionY, 0, toRegionX, toRegionY + 1, 0, rotation);
            copyRegion(fromRegionX + 1, fromRegionY, 0, toRegionX, toRegionY, 0, rotation);
            copyRegion(fromRegionX, fromRegionY + 1, 0, toRegionX + 1, toRegionY + 1, 0, rotation);
            copyRegion(fromRegionX + 1, fromRegionY + 1, 0, toRegionX + 1, toRegionY, 0, rotation);
        } else if (rotation == 2) {
            copyRegion(fromRegionX, fromRegionY, 0, toRegionX + 1, toRegionY + 1, 0, rotation);
            copyRegion(fromRegionX + 1, fromRegionY, 0, toRegionX, toRegionY + 1, 0, rotation);
            copyRegion(fromRegionX, fromRegionY + 1, 0, toRegionX + 1, toRegionY, 0, rotation);
            copyRegion(fromRegionX + 1, fromRegionY + 1, 0, toRegionX, toRegionY, 0, rotation);
        } else if (rotation == 3) {
            copyRegion(fromRegionX, fromRegionY, 0, toRegionX + 1, toRegionY, 0, rotation);
            copyRegion(fromRegionX + 1, fromRegionY, 0, toRegionX + 1, toRegionY + 1, 0, rotation);
            copyRegion(fromRegionX, fromRegionY + 1, 0, toRegionX, toRegionY, 0, rotation);
            copyRegion(fromRegionX + 1, fromRegionY + 1, 0, toRegionX, toRegionY + 1, 0, rotation);
        }
    }

    /*
     * not recommended to use unless you want to make a more complex map
     */
    public static DynamicRegion createDynamicRegion(int regionId) {
        Region region = World.getRegions().get(regionId);
        if (region != null) {
            if (region instanceof DynamicRegion) // if its already dynamic lets
                // keep building it
                return (DynamicRegion) region;
        }
        DynamicRegion newRegion = new DynamicRegion(regionId);
        World.getRegions().put(regionId, newRegion);
        return newRegion;
    }

    /*
     * Safely destroys a dynamic region
     */
    public static void destroyDynamicRegion(int regionId) {
        Region region = World.getRegions().get(regionId);
        if (region != null) {
            List<Integer> playerIndexes = region.getPlayerIndexes();
            List<Integer> npcIndexes = region.getNPCsIndexes();
            if (npcIndexes != null) {
                for (int npcIndex : npcIndexes) {
                    Npc npc = World.getNPCs().get(npcIndex);
                    if (npc == null) continue;
                    if (npc.getSpawnTile().getRegionId() == regionId) World.removeNPC(npc);
                    else npc.setNextWorldTile(new WorldTile(npc.getSpawnTile()));
                }
            }
            World.getRegions().remove(regionId);
            if (playerIndexes != null) {
                for (int playerIndex : playerIndexes) {
                    Player player = World.getPlayers().get(playerIndex);
                    if (player == null || !player.hasStarted() || player.hasFinished()) continue;
                    player.setForceNextMapLoadRefresh(true);
                    player.loadMapRegions();
                }
            }
        }
    }

    public static int[] translate(int x, int y, int mapRotation, int sizeX, int sizeY, int objectRotation) {
        int[] coords = new int[2];
        if ((objectRotation & 0x1) == 1) {
            int prevSizeX = sizeX;
            sizeX = sizeY;
            sizeY = prevSizeX;
        }
        if (mapRotation == 0) {
            coords[0] = x;
            coords[1] = y;
        } else if (mapRotation == 1) {
            coords[0] = y;
            coords[1] = 7 - x - (sizeX - 1);
        } else if (mapRotation == 2) {
            coords[0] = 7 - x - (sizeX - 1);
            coords[1] = 7 - y - (sizeY - 1);
        } else if (mapRotation == 3) {
            coords[0] = 7 - y - (sizeY - 1);
            coords[1] = x;
        }
        return coords;
    }


    public static int getRegionHash(int chunkX, int chunkY) {
        return (chunkX << 8) + chunkY;
    }

    private RegionBuilder() {

    }
}

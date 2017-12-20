package com.rs.game.world;

import com.rs.Launcher;
import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.item.ItemConstants;
import com.rs.game.minigames.GodWarsBosses;
import com.rs.game.minigames.ZarosGodwars;
import com.rs.game.npc.Npc;
import com.rs.game.npc.impl.boss.DagannothKing;
import com.rs.game.npc.impl.boss.TormentedDemon;
import com.rs.game.npc.impl.boss.godwars.GodWarFaction;
import com.rs.game.npc.impl.boss.godwars.GodWarMinion;
import com.rs.game.npc.impl.boss.godwars.armadyl.KreeArra;
import com.rs.game.npc.impl.boss.godwars.bandos.GeneralGraardor;
import com.rs.game.npc.impl.boss.godwars.saradomin.CommanderZilyana;
import com.rs.game.npc.impl.boss.godwars.zamorak.KrilTsutsaroth;
import com.rs.game.npc.impl.boss.godwars.zaros.Nex;
import com.rs.game.npc.impl.boss.godwars.zaros.NexMinion;
import com.rs.game.npc.impl.boss.kalph.KalphiteQueen;
import com.rs.game.npc.impl.dragons.KingBlackDragon;
import com.rs.game.npc.impl.fightcave.TzTokJad;
import com.rs.game.npc.impl.others.Glacor;
import com.rs.game.npc.impl.others.HuntNpc;
import com.rs.game.npc.impl.others.Rev;
import com.rs.game.npc.impl.slayer.Jadinko;
import com.rs.game.npc.impl.slayer.Strykewyrm;
import com.rs.game.npc.impl.slayer.Wyrm;
import com.rs.game.player.OwnedObjectManager;
import com.rs.game.player.Player;
import com.rs.game.player.Prayer;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Hunter.HunterNPC;
import com.rs.game.player.content.shops.ShopHandler;
import com.rs.game.player.controllers.impl.ClanReqController;
import com.rs.game.player.controllers.impl.DuelController;
import com.rs.game.player.controllers.impl.GodWars;
import com.rs.game.player.controllers.impl.Wilderness;
import com.rs.game.player.info.RanksManager;
import com.rs.io.AntiFlood;
import com.rs.utils.Utils;
import com.rs.utils.areas.Area;
import com.rs.utils.areas.Rectangle;
import com.rs.utils.stringUtils.TextUtils;
import com.rs.utils.stringUtils.TimeUtils;
import org.pmw.tinylog.Logger;

import java.util.*;
import java.util.concurrent.TimeUnit;

public final class World {

    public static int exiting_delay;
    public static long exiting_start;

    private static final EntityList<Player> players = new EntityList<>(Settings.PLAYERS_LIMIT);
    private static final EntityList<Npc> npcList = new EntityList<>(Settings.NPCS_LIMIT);
    private static final Map<Integer, Region> regions = Collections.synchronizedMap(new HashMap<Integer, Region>());
    private static final ArrayList<Area> multiAreas = new ArrayList<>();

    /**
     * Init world tasks
     */
    public static void init() {
        addMultiAreas();
        addLogicPacketsTask();
        addRestoreRunEnergyTask();
        addRestoreHitPointsTask();
        addRestoreSkillsTask();
        addRestoreSpecialAttackTask();
        addRestoreShopItemsTask();
        addSummoningEffectTask();
        addOwnedObjectsTask();
        addNewsTask();
    }

    /**
     * Add areas that are multi combat
     */
    private static void addMultiAreas() {
        multiAreas.add(new Rectangle(3200, 3840, 3390, 3967));
        multiAreas.add(new Rectangle(2835, 5905, 2880, 5950));
        multiAreas.add(new Rectangle(2992, 3912, 3007, 3967));
        multiAreas.add(new Rectangle(3200, 3840, 3390, 3967));
        multiAreas.add(new Rectangle(2946, 3816, 2959, 3831));
        multiAreas.add(new Rectangle(3008, 3856, 3199, 3903));
        multiAreas.add(new Rectangle(3008, 3600, 3071, 3711));
        multiAreas.add(new Rectangle(3270, 3532, 3346, 3625));
        multiAreas.add(new Rectangle(2965, 3904, 3050, 3959));
        multiAreas.add(new Rectangle(2815, 5240, 2966, 5375));
        multiAreas.add(new Rectangle(2840, 5190, 2950, 5230));
        multiAreas.add(new Rectangle(3547, 9690, 3555, 9699));
        multiAreas.add(new Rectangle(2970, 4365, 3000, 4400));
        multiAreas.add(new Rectangle(3136, 3520, 3327, 3970));
        multiAreas.add(new Rectangle(2376, 5168, 2422, 5127));
        multiAreas.add(new Rectangle(2374, 5129, 2424, 5168));
        multiAreas.add(new Rectangle(2622, 5696, 2573, 5752));
        multiAreas.add(new Rectangle(2368, 3072, 2431, 3135));
        multiAreas.add(new Rectangle(3086, 5536, 3315, 5530));
        multiAreas.add(new Rectangle(3526, 5185, 3550, 5215));
        multiAreas.add(new Rectangle(2660, 3687, 2737, 3739));
        multiAreas.add(new Rectangle(2365, 9470, 2436, 9532));
        multiAreas.add(new Rectangle(3508, 9522, 3452, 9475));//Kalphite queen
        multiAreas.add(new Rectangle(2881, 4436, 2940, 4459));//Dagannoth lair
    }

    /**
     * Prefix the message with news effects and send it world wide
     *
     * @param message to be broadcast
     */
    public static void sendNewsMessage(String message) {
        sendWorldMessage("<col=006600><shad=000000><img=6>News:<col=ff0033> " + message + "</col>");
    }

    /**
     * Broadcast when someone receives rare drop
     */
    public static void sendDropMessage(String playerName, String itemName) {
        sendWorldMessage("<col=000099><shad=ffffff><img=6>News: </col></shad><col=ffffff> " + playerName
                         + " has received <col=000099><shad=ffffff>" + itemName
                         + "</col></shad><col=ffffff> as a rare drop!</col>");
    }

    /**
     * Sent on player login
     *
     * @param player the player logging in
     */
    public static void sendLoginMessage(Player player) {
        player.sendMessage("Welcome to " + Settings.SERVER_NAME + "!");
        sendWorldMessage(RanksManager.getInfo(player) + "</col></shad><col=ff0033> has logged in!</col>");
    }

    /**
     * Send a message to all players
     *
     * @param msg the message
     */
    public static void sendWorldMessage(String msg) {
        for (Player p : getPlayers()) {
            if (p == null) {
                continue;
            }
            p.sendMessage(msg);
        }
    }

    /**
     * Remove a previously spawned object from the world
     */
    public static void removeSpawnedObject(WorldObject object, boolean clip) {
        int regionId = object.getRegionId();
        Region region = getRegion(regionId);
        if (region.getSpawnedObjects() != null) region.getSpawnedObjects().remove(object);
        if (clip) {
            int baseLocalX = object.getX() - ((regionId >> 8) * 64);
            int baseLocalY = object.getY() - ((regionId & 0xff) * 64);
            getRegion(regionId).removeMapObject(object, baseLocalX, baseLocalY);
        }
        for (Player player : players)
            player.getPackets().sendDestroyObject(object);
    }

    private static void addLogicPacketsTask() {
        CoresManager.fastExecutor.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (Player player : World.getPlayers()) {
                    if (!player.hasStarted() || player.hasFinished()) continue;
                    player.processLogicPackets();
                }
            }

        }, 300, 300);
    }

    private static void addNewsTask() {
        CoresManager.slowExecutor.scheduleWithFixedDelay(new Runnable() {
            private int newsIndex = 0;

            @Override
            public void run() {
                if (newsIndex >= Settings.NEWS.length) newsIndex = 0;
                sendNewsMessage(Settings.NEWS[newsIndex]);
                newsIndex++;
            }
        }, 1, 5, TimeUnit.MINUTES);
    }

    private static void addOwnedObjectsTask() {
        CoresManager.slowExecutor.scheduleWithFixedDelay(() -> {
            try {
                OwnedObjectManager.processAll();
            } catch (Throwable e) {
                Logger.error(e);
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    private static void addRestoreShopItemsTask() {
        CoresManager.slowExecutor.scheduleWithFixedDelay(() -> {
            try {
                ShopHandler.restoreShops();
            } catch (Throwable e) {
                Logger.error(e);
            }
        }, 0, 30, TimeUnit.SECONDS);
    }

    private static void addSummoningEffectTask() {
        CoresManager.slowExecutor.scheduleWithFixedDelay(() -> {
            try {
                for (Player player : getPlayers()) {
                    if (player.getFollower() == null || player.isDead() || !player.hasFinished()) continue;
                    if (player.getFollower().getOriginalId() == 6814) {
                        player.heal(20);
                        player.setNextGraphics(new Graphics(1507));
                    }
                }
            } catch (Throwable e) {
                Logger.error(e);
            }
        }, 0, 15, TimeUnit.SECONDS);
    }

    private static void addRestoreSpecialAttackTask() {

        CoresManager.fastExecutor.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    for (Player player : getPlayers()) {
                        if (player == null || player.isDead() || !player.isRunning()) continue;
                        player.getCombatDefinitions().restoreSpecialAttack();
                    }
                } catch (Throwable e) {
                    Logger.error(e);
                }
            }
        }, 0, 30000);
    }

    private static boolean checkAgility;

    private static void addRestoreRunEnergyTask() {
        CoresManager.fastExecutor.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    for (Player player : getPlayers()) {
                        if (player == null || player.isDead() || !player.isRunning() || (checkAgility &&
                                                                                         player.getSkills().getLevel
                                                                                                 (Skills.AGILITY)
                                                                                         < 70)) continue;
                        player.restoreRunEnergy();
                    }
                    checkAgility = !checkAgility;
                } catch (Throwable e) {
                    Logger.error(e);
                }
            }
        }, 0, 1000);
    }

    private static void addRestoreHitPointsTask() {
        CoresManager.fastExecutor.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    for (Player player : getPlayers()) {
                        if (player == null || player.isDead() || !player.isRunning()) continue;
                        player.restoreHitPoints();
                    }
                    for (Npc npc : npcList) {
                        if (npc == null || npc.isDead() || npc.hasFinished()) continue;
                        npc.restoreHitPoints();
                    }
                } catch (Throwable e) {
                    Logger.error(e);
                }
            }
        }, 0, 6000);
    }

    private static void addRestoreSkillsTask() {
        CoresManager.fastExecutor.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    for (Player player : getPlayers()) {
                        if (player == null || !player.isRunning()) continue;
                        int amountTimes = player.getPrayer().usingPrayer(Prayer.PrayerSpell.RAPID_RESTORE) ? 2 : 1;
                        if (player.isResting()) amountTimes += 1;
                        boolean berserker = player.getPrayer().usingPrayer(Prayer.PrayerSpell.BERSERKER);
                        for (int skill = 0; skill < 25; skill++) {
                            if (skill == Skills.SUMMONING) continue;
                            for (int time = 0; time < amountTimes; time++) {
                                int currentLevel = player.getSkills().getLevel(skill);
                                int normalLevel = player.getSkills().getLevelForXp(skill);
                                if (currentLevel > normalLevel) {
                                    if (skill == Skills.ATTACK || skill == Skills.STRENGTH || skill == Skills.DEFENCE
                                        || skill == Skills.RANGE || skill == Skills.MAGIC) {
                                        if (berserker && Utils.getRandom(100) <= 15) continue;
                                    }
                                    player.getSkills().set(skill, currentLevel - 1);
                                } else if (currentLevel < normalLevel) player.getSkills().set(skill, currentLevel + 1);
                                else break;
                            }
                        }
                    }
                } catch (Throwable e) {
                    Logger.error(e);
                }
            }
        }, 0, 30000);

    }

    public static Map<Integer, Region> getRegions() {
        return regions;
    }

    public static Region getRegion(int id) {
        return getRegion(id, false);
    }

    public static Region getRegion(int id, boolean load) {
        Region region = regions.computeIfAbsent(id, k -> new Region(id));
        if (load) region.checkLoadMap();
        return region;
    }

    public static void addPlayer(Player player) {
        players.add(player);
        AntiFlood.add(player.getSession().getIP());
    }

    public static void removePlayer(Player player) {
        players.remove(player);
        AntiFlood.remove(player.getSession().getIP());
    }

    public static void addNPC(Npc npc) {
        npcList.add(npc);
    }

    public static void removeNPC(Npc npc) {
        npcList.remove(npc);
    }

    public static Npc spawnNPC(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean
            spawned) {
        Npc n;
        HunterNPC hunterNPCs = HunterNPC.forId(id);
        if (hunterNPCs != null) {
            if (id == hunterNPCs.getNpcId())
                return new HuntNpc(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        }

        int faction = GodWarFaction.getGWDFaction(id);
        if (faction != -1)
            return new GodWarFaction(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned, faction);
        else if (id == 13820 || id == 13821 || id == 13822)
            n = new Jadinko(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id >= 2881 && id <= 2883)
            n = new DagannothKing(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 1158 || id == 1160)
            n = new KalphiteQueen(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 2745) n = new

                TzTokJad(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 6261 || id == 6263 || id == 6265) n = GodWarsBosses.graardorMinions[(id - 6261) / 2] = new

                GodWarMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 6260) n = new

                GeneralGraardor(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 6222) n = new

                KreeArra(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 6223 || id == 6225 || id == 6227) n = GodWarsBosses.armadylMinions[(id - 6223) / 2] = new

                GodWarMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 6203) n = new

                KrilTsutsaroth(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 6204 || id == 6206 || id == 6208) n = GodWarsBosses.zamorakMinions[(id - 6204) / 2] = new

                GodWarMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 50 || id == 2642) n = new

                KingBlackDragon(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id >= 9462 && id <= 9467) n = new

                Strykewyrm(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
        else if (id == 6248 || id == 6250 || id == 6252) n = GodWarsBosses.commanderMinions[(id - 6248) / 2] = new

                GodWarMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 6247) n = new

                CommanderZilyana(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13447) n = ZarosGodwars.nex = new

                Nex(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13451) n = ZarosGodwars.fumus = new

                NexMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13452) n = ZarosGodwars.umbra = new

                NexMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13453) n = ZarosGodwars.cruor = new

                NexMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13454) n = ZarosGodwars.glacies = new

                NexMinion(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13465) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13466) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13467) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 9463) n = new

                Wyrm(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13468) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13469) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13470) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13471) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13472) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13473) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13474) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13475) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13476) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13477) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13478) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13479) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13480) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 13481) n = new

                Rev(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (NPCDefinitions.getNPCDefinitions(id) != null
                 && NPCDefinitions.getNPCDefinitions(id).name.equalsIgnoreCase("Tormented demon"))
            n = new TormentedDemon(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else if (id == 14301) n = new Glacor(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        else n = new

                    Npc(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        return n;
    }

    public static void spawnNPC(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
        spawnNPC(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, false);
    }

    /*
     * check if the entity region changed because moved or teled then we update
     * it
     */
    public static void updateEntityRegion(Entity entity) {
        if (entity.hasFinished()) {
            if (entity instanceof Player) getRegion(entity.getLastRegionId()).removePlayerIndex(entity.getIndex());
            else getRegion(entity.getLastRegionId()).removeNPCIndex(entity.getIndex());
            return;
        }
        int regionId = entity.getRegionId();
        if (entity.getLastRegionId() != regionId) { // map region entity at
            // changed
            if (entity instanceof Player) {
                if (entity.getLastRegionId() > 0)
                    getRegion(entity.getLastRegionId()).removePlayerIndex(entity.getIndex());
                Region region = getRegion(regionId);
                region.addPlayerIndex(entity.getIndex());
                Player player = (Player) entity;
                player.getControllerManager().moved();
                int musicId = region.getMusicId();
                if (musicId != -1) player.getMusicsManager().checkMusic(region.getMusicId());
                if (player.isRunning() && player.getControllerManager().getController() == null)
                    checkControllersAtMove(player);
            } else {
                if (entity.getLastRegionId() > 0) getRegion(entity.getLastRegionId()).removeNPCIndex(entity.getIndex());
                getRegion(regionId).addNPCIndex(entity.getIndex());
            }
            entity.checkMultiArea();
            entity.setLastRegionId(regionId);
        } else {
            if (entity instanceof Player) {
                Player player = (Player) entity;
                player.getControllerManager().moved();
                if (player.isRunning() && player.getControllerManager().getController() == null)
                    checkControllersAtMove(player);
            }
            entity.checkMultiArea();
        }
    }

    private static void checkControllersAtMove(Player player) {
        if (DuelController.isAtDuelArena(player)) player.getControllerManager().startController("DuelController");
        else if (ClanReqController.isAtClanArea(player))
            player.getControllerManager().startController("DuelController");
        else if (GodWars.atGodwars(player)) player.getControllerManager().startController("GodWars");
    }

    /*
     * checks clip
     */
    public static boolean canMoveNPC(int plane, int x, int y, int size) {
        for (int tileX = x; tileX < x + size; tileX++)
            for (int tileY = y; tileY < y + size; tileY++)
                if (getMask(plane, tileX, tileY) != 0) return false;
        return true;
    }

    private static int getMask(int plane, int x, int y) {
        WorldTile tile = new WorldTile(x, y, plane);
        int regionId = tile.getRegionId();
        Region region = getRegion(regionId);
        if (region == null) return -1;
        int baseLocalX = x - ((regionId >> 8) * 64);
        int baseLocalY = y - ((regionId & 0xff) * 64);
        return region.getMask(tile.getPlane(), baseLocalX, baseLocalY);
    }

    public static void setMask(int plane, int x, int y, int mask) {
        WorldTile tile = new WorldTile(x, y, plane);
        int regionId = tile.getRegionId();
        Region region = getRegion(regionId);
        if (region == null) return;
        int baseLocalX = x - ((regionId >> 8) * 64);
        int baseLocalY = y - ((regionId & 0xff) * 64);
        region.setMask(tile.getPlane(), baseLocalX, baseLocalY, mask);
    }

    public static int getRotation(int plane, int x, int y) {
        WorldTile tile = new WorldTile(x, y, plane);
        int regionId = tile.getRegionId();
        Region region = getRegion(regionId);
        if (region == null) return 0;
        int baseLocalX = x - ((regionId >> 8) * 64);
        int baseLocalY = y - ((regionId & 0xff) * 64);
        return region.getRotation(tile.getPlane(), baseLocalX, baseLocalY);
    }

    private static int getClippedOnlyMask(int plane, int x, int y) {
        WorldTile tile = new WorldTile(x, y, plane);
        int regionId = tile.getRegionId();
        Region region = getRegion(regionId);
        if (region == null) return -1;
        int baseLocalX = x - ((regionId >> 8) * 64);
        int baseLocalY = y - ((regionId & 0xff) * 64);
        return region.getMaskClipedOnly(tile.getPlane(), baseLocalX, baseLocalY);
    }

    static boolean checkProjectileStep(int plane, int x, int y, int dir, int size) {
        int xOffset = Utils.DIRECTION_DELTA_X[dir];
        int yOffset = Utils.DIRECTION_DELTA_Y[dir];

        if (size == 1) {
            int mask = getClippedOnlyMask(plane, x + Utils.DIRECTION_DELTA_X[dir], y + Utils.DIRECTION_DELTA_Y[dir]);
            if (xOffset == -1 && yOffset == 0) return (mask & 0x42240000) == 0;
            if (xOffset == 1 && yOffset == 0) return (mask & 0x60240000) == 0;
            if (xOffset == 0 && yOffset == -1) return (mask & 0x40a40000) == 0;
            if (xOffset == 0 && yOffset == 1) return (mask & 0x48240000) == 0;
            if (xOffset == -1 && yOffset == -1) {
                return (mask & 0x43a40000) == 0 && (getClippedOnlyMask(plane, x - 1, y) & 0x42240000) == 0
                       && (getClippedOnlyMask(plane, x, y - 1) & 0x40a40000) == 0;
            }
            if (xOffset == 1 && yOffset == -1) {
                return (mask & 0x60e40000) == 0 && (getClippedOnlyMask(plane, x + 1, y) & 0x60240000) == 0
                       && (getClippedOnlyMask(plane, x, y - 1) & 0x40a40000) == 0;
            }
            if (xOffset == -1 && yOffset == 1) {
                return (mask & 0x4e240000) == 0 && (getClippedOnlyMask(plane, x - 1, y) & 0x42240000) == 0
                       && (getClippedOnlyMask(plane, x, y + 1) & 0x48240000) == 0;
            }
            if (xOffset == 1 && yOffset == 1) {
                return (mask & 0x78240000) == 0 && (getClippedOnlyMask(plane, x + 1, y) & 0x60240000) == 0
                       && (getClippedOnlyMask(plane, x, y + 1) & 0x48240000) == 0;
            }
        } else if (size == 2) {
            if (xOffset == -1 && yOffset == 0) return (getClippedOnlyMask(plane, x - 1, y) & 0x43a40000) == 0
                                                      && (getClippedOnlyMask(plane, x - 1, y + 1) & 0x4e240000) == 0;
            if (xOffset == 1 && yOffset == 0) return (getClippedOnlyMask(plane, x + 2, y) & 0x60e40000) == 0
                                                     && (getClippedOnlyMask(plane, x + 2, y + 1) & 0x78240000) == 0;
            if (xOffset == 0 && yOffset == -1) return (getClippedOnlyMask(plane, x, y - 1) & 0x43a40000) == 0
                                                      && (getClippedOnlyMask(plane, x + 1, y - 1) & 0x60e40000) == 0;
            if (xOffset == 0 && yOffset == 1) return (getClippedOnlyMask(plane, x, y + 2) & 0x4e240000) == 0
                                                     && (getClippedOnlyMask(plane, x + 1, y + 2) & 0x78240000) == 0;
            if (xOffset == -1 && yOffset == -1) return (getClippedOnlyMask(plane, x - 1, y) & 0x4fa40000) == 0
                                                       && (getClippedOnlyMask(plane, x - 1, y - 1) & 0x43a40000) == 0
                                                       && (getClippedOnlyMask(plane, x, y - 1) & 0x63e40000) == 0;
            if (xOffset == 1 && yOffset == -1) return (getClippedOnlyMask(plane, x + 1, y - 1) & 0x63e40000) == 0
                                                      && (getClippedOnlyMask(plane, x + 2, y - 1) & 0x60e40000) == 0
                                                      && (getClippedOnlyMask(plane, x + 2, y) & 0x78e40000) == 0;
            if (xOffset == -1 && yOffset == 1) return (getClippedOnlyMask(plane, x - 1, y + 1) & 0x4fa40000) == 0
                                                      && (getClippedOnlyMask(plane, x - 1, y + 1) & 0x4e240000) == 0
                                                      && (getClippedOnlyMask(plane, x, y + 2) & 0x7e240000) == 0;
            if (xOffset == 1 && yOffset == 1) return (getClippedOnlyMask(plane, x + 1, y + 2) & 0x7e240000) == 0
                                                     && (getClippedOnlyMask(plane, x + 2, y + 2) & 0x78240000) == 0
                                                     && (getClippedOnlyMask(plane, x + 1, y + 1) & 0x78e40000) == 0;
        } else {
            if (xOffset == -1 && yOffset == 0) {
                if ((getClippedOnlyMask(plane, x - 1, y) & 0x43a40000) != 0
                    || (getClippedOnlyMask(plane, x - 1, -1 + (y + size)) & 0x4e240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
                    if ((getClippedOnlyMask(plane, x - 1, y + sizeOffset) & 0x4fa40000) != 0) return false;
            } else if (xOffset == 1 && yOffset == 0) {
                if ((getClippedOnlyMask(plane, x + size, y) & 0x60e40000) != 0
                    || (getClippedOnlyMask(plane, x + size, y - (-size + 1)) & 0x78240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
                    if ((getClippedOnlyMask(plane, x + size, y + sizeOffset) & 0x78e40000) != 0) return false;
            } else if (xOffset == 0 && yOffset == -1) {
                if ((getClippedOnlyMask(plane, x, y - 1) & 0x43a40000) != 0
                    || (getClippedOnlyMask(plane, x + size - 1, y - 1) & 0x60e40000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
                    if ((getClippedOnlyMask(plane, x + sizeOffset, y - 1) & 0x63e40000) != 0) return false;
            } else if (xOffset == 0 && yOffset == 1) {
                if ((getClippedOnlyMask(plane, x, y + size) & 0x4e240000) != 0
                    || (getClippedOnlyMask(plane, x + (size - 1), y + size) & 0x78240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
                    if ((getClippedOnlyMask(plane, x + sizeOffset, y + size) & 0x7e240000) != 0) return false;
            } else if (xOffset == -1 && yOffset == -1) {
                if ((getClippedOnlyMask(plane, x - 1, y - 1) & 0x43a40000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
                    if ((getClippedOnlyMask(plane, x - 1, y + (-1 + sizeOffset)) & 0x4fa40000) != 0
                        || (getClippedOnlyMask(plane, sizeOffset - 1 + x, y - 1) & 0x63e40000) != 0) return false;
            } else if (xOffset == 1 && yOffset == -1) {
                if ((getClippedOnlyMask(plane, x + size, y - 1) & 0x60e40000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
                    if ((getClippedOnlyMask(plane, x + size, sizeOffset + (-1 + y)) & 0x78e40000) != 0
                        || (getClippedOnlyMask(plane, x + sizeOffset, y - 1) & 0x63e40000) != 0) return false;
            } else if (xOffset == -1 && yOffset == 1) {
                if ((getClippedOnlyMask(plane, x - 1, y + size) & 0x4e240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
                    if ((getClippedOnlyMask(plane, x - 1, y + sizeOffset) & 0x4fa40000) != 0
                        || (getClippedOnlyMask(plane, -1 + (x + sizeOffset), y + size) & 0x7e240000) != 0) return false;
            } else if (xOffset == 1 && yOffset == 1) {
                if ((getClippedOnlyMask(plane, x + size, y + size) & 0x78240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
                    if ((getClippedOnlyMask(plane, x + sizeOffset, y + size) & 0x7e240000) != 0
                        || (getClippedOnlyMask(plane, x + size, y + sizeOffset) & 0x78e40000) != 0) return false;
            }
        }
        return true;
    }

    static boolean checkWalkStep(int plane, int x, int y, int dir, int size) {
        int xOffset = Utils.DIRECTION_DELTA_X[dir];
        int yOffset = Utils.DIRECTION_DELTA_Y[dir];
        int rotation = getRotation(plane, x + xOffset, y + yOffset);
        if (rotation != 0) {
            for (int rotate = 0; rotate < (4 - rotation); rotate++) {
                int fakeChunckX = xOffset;
                xOffset = yOffset;
                yOffset = 0 - fakeChunckX;
            }
        }

        if (size == 1) {
            int mask = getMask(plane, x + Utils.DIRECTION_DELTA_X[dir], y + Utils.DIRECTION_DELTA_Y[dir]);
            if (xOffset == -1 && yOffset == 0) return (mask & 0x42240000) == 0;
            if (xOffset == 1 && yOffset == 0) return (mask & 0x60240000) == 0;
            if (xOffset == 0 && yOffset == -1) return (mask & 0x40a40000) == 0;
            if (xOffset == 0 && yOffset == 1) return (mask & 0x48240000) == 0;
            if (xOffset == -1 && yOffset == -1) {
                return (mask & 0x43a40000) == 0 && (getMask(plane, x - 1, y) & 0x42240000) == 0
                       && (getMask(plane, x, y - 1) & 0x40a40000) == 0;
            }
            if (xOffset == 1 && yOffset == -1) {
                return (mask & 0x60e40000) == 0 && (getMask(plane, x + 1, y) & 0x60240000) == 0
                       && (getMask(plane, x, y - 1) & 0x40a40000) == 0;
            }
            if (xOffset == -1 && yOffset == 1) {
                return (mask & 0x4e240000) == 0 && (getMask(plane, x - 1, y) & 0x42240000) == 0
                       && (getMask(plane, x, y + 1) & 0x48240000) == 0;
            }
            if (xOffset == 1 && yOffset == 1) {
                return (mask & 0x78240000) == 0 && (getMask(plane, x + 1, y) & 0x60240000) == 0
                       && (getMask(plane, x, y + 1) & 0x48240000) == 0;
            }
        } else if (size == 2) {
            if (xOffset == -1 && yOffset == 0)
                return (getMask(plane, x - 1, y) & 0x43a40000) == 0 && (getMask(plane, x - 1, y + 1) & 0x4e240000) == 0;
            if (xOffset == 1 && yOffset == 0)
                return (getMask(plane, x + 2, y) & 0x60e40000) == 0 && (getMask(plane, x + 2, y + 1) & 0x78240000) == 0;
            if (xOffset == 0 && yOffset == -1)
                return (getMask(plane, x, y - 1) & 0x43a40000) == 0 && (getMask(plane, x + 1, y - 1) & 0x60e40000) == 0;
            if (xOffset == 0 && yOffset == 1)
                return (getMask(plane, x, y + 2) & 0x4e240000) == 0 && (getMask(plane, x + 1, y + 2) & 0x78240000) == 0;
            if (xOffset == -1 && yOffset == -1)
                return (getMask(plane, x - 1, y) & 0x4fa40000) == 0 && (getMask(plane, x - 1, y - 1) & 0x43a40000) == 0
                       && (getMask(plane, x, y - 1) & 0x63e40000) == 0;
            if (xOffset == 1 && yOffset == -1) return (getMask(plane, x + 1, y - 1) & 0x63e40000) == 0
                                                      && (getMask(plane, x + 2, y - 1) & 0x60e40000) == 0
                                                      && (getMask(plane, x + 2, y) & 0x78e40000) == 0;
            if (xOffset == -1 && yOffset == 1) return (getMask(plane, x - 1, y + 1) & 0x4fa40000) == 0
                                                      && (getMask(plane, x - 1, y + 1) & 0x4e240000) == 0
                                                      && (getMask(plane, x, y + 2) & 0x7e240000) == 0;
            if (xOffset == 1 && yOffset == 1) return (getMask(plane, x + 1, y + 2) & 0x7e240000) == 0
                                                     && (getMask(plane, x + 2, y + 2) & 0x78240000) == 0
                                                     && (getMask(plane, x + 1, y + 1) & 0x78e40000) == 0;
        } else {
            if (xOffset == -1 && yOffset == 0) {
                if ((getMask(plane, x - 1, y) & 0x43a40000) != 0
                    || (getMask(plane, x - 1, -1 + (y + size)) & 0x4e240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
                    if ((getMask(plane, x - 1, y + sizeOffset) & 0x4fa40000) != 0) return false;
            } else if (xOffset == 1 && yOffset == 0) {
                if ((getMask(plane, x + size, y) & 0x60e40000) != 0
                    || (getMask(plane, x + size, y - (-size + 1)) & 0x78240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
                    if ((getMask(plane, x + size, y + sizeOffset) & 0x78e40000) != 0) return false;
            } else if (xOffset == 0 && yOffset == -1) {
                if ((getMask(plane, x, y - 1) & 0x43a40000) != 0
                    || (getMask(plane, x + size - 1, y - 1) & 0x60e40000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
                    if ((getMask(plane, x + sizeOffset, y - 1) & 0x63e40000) != 0) return false;
            } else if (xOffset == 0 && yOffset == 1) {
                if ((getMask(plane, x, y + size) & 0x4e240000) != 0
                    || (getMask(plane, x + (size - 1), y + size) & 0x78240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size - 1; sizeOffset++)
                    if ((getMask(plane, x + sizeOffset, y + size) & 0x7e240000) != 0) return false;
            } else if (xOffset == -1 && yOffset == -1) {
                if ((getMask(plane, x - 1, y - 1) & 0x43a40000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
                    if ((getMask(plane, x - 1, y + (-1 + sizeOffset)) & 0x4fa40000) != 0
                        || (getMask(plane, sizeOffset - 1 + x, y - 1) & 0x63e40000) != 0) return false;
            } else if (xOffset == 1 && yOffset == -1) {
                if ((getMask(plane, x + size, y - 1) & 0x60e40000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
                    if ((getMask(plane, x + size, sizeOffset + (-1 + y)) & 0x78e40000) != 0
                        || (getMask(plane, x + sizeOffset, y - 1) & 0x63e40000) != 0) return false;
            } else if (xOffset == -1 && yOffset == 1) {
                if ((getMask(plane, x - 1, y + size) & 0x4e240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
                    if ((getMask(plane, x - 1, y + sizeOffset) & 0x4fa40000) != 0
                        || (getMask(plane, -1 + (x + sizeOffset), y + size) & 0x7e240000) != 0) return false;
            } else if (xOffset == 1 && yOffset == 1) {
                if ((getMask(plane, x + size, y + size) & 0x78240000) != 0) return false;
                for (int sizeOffset = 1; sizeOffset < size; sizeOffset++)
                    if ((getMask(plane, x + sizeOffset, y + size) & 0x7e240000) != 0
                        || (getMask(plane, x + size, y + sizeOffset) & 0x78e40000) != 0) return false;
            }
        }
        return true;
    }

    public static boolean containsPlayer(String username) {
        for (Player p2 : players) {
            if (p2 == null) continue;
            if (p2.getUsername().equals(username)) return true;
        }
        return false;
    }

    public static Player getPlayer(String username) {
        for (Player player : getPlayers()) {
            if (player == null) continue;
            if (player.getUsername().equals(username)) return player;
        }
        return null;
    }

    public static Player getPlayerByDisplayName(String username) {
        String formattedUsername = TextUtils.formatPlayerNameForProtocol(username);
        for (Player player : getPlayers()) {
            if (player == null) continue;
            if (player.getUsername().equals(formattedUsername) || player.getDisplayName().equals(username))
                return player;
        }
        return null;
    }

    public static EntityList<Player> getPlayers() {
        return players;
    }

    public static EntityList<Npc> getNPCs() {
        return npcList;
    }

    private World() {

    }

    public static void safeShutdown(final boolean restart, int delay) {
        if (exiting_start != 0) return;
        exiting_start = TimeUtils.getTime();
        exiting_delay = delay;
        for (Player player : World.getPlayers()) {
            if (player == null || !player.hasStarted() || player.hasFinished()) continue;
            player.getPackets().sendSystemUpdate(delay);
        }
        CoresManager.slowExecutor.schedule(() -> {
            try {
                for (Player player : World.getPlayers()) {
                    if (player == null || !player.hasStarted()) continue;
                    player.realFinish();
                }
                Launcher.restart();
            } catch (Throwable e) {
                Logger.error(e);
            }
        }, delay, TimeUnit.SECONDS);
    }

    /**
     * Spawn a temporary non clipped object
     *
     * @param time time to stay in milliseconds
     */
    public static void spawnTemporaryObject(final WorldObject object, long time) {
        spawnTemporaryObject(object, time, false);
    }

    /**
     * @param clip should the new object be clipped
     * @param time time to stay in milliseconds
     */
    public static void spawnTemporaryObject(final WorldObject object, long time, final boolean clip) {
        final int regionId = object.getRegionId();
        WorldObject realMapObject = getRegion(regionId).getRealObject(object);
        final WorldObject realObject = realMapObject
                                       == null ? null : new WorldObject(realMapObject.getId(), realMapObject.getType
                (), realMapObject.getRotation(), object.getX(), object.getY(), object.getPlane());
        spawnObject(object, clip);
        final int baseLocalX = object.getX() - ((regionId >> 8) * 64);
        final int baseLocalY = object.getY() - ((regionId & 0xff) * 64);
        if (realObject != null && clip) getRegion(regionId).removeMapObject(realObject, baseLocalX, baseLocalY);
        CoresManager.slowExecutor.schedule(() -> {
            try {
                getRegion(regionId).removeObject(object);
                if (clip) {
                    getRegion(regionId).removeMapObject(object, baseLocalX, baseLocalY);
                    if (realObject != null) {
                        int baseLocalX1 = object.getX() - ((regionId >> 8) * 64);
                        int baseLocalY1 = object.getY() - ((regionId & 0xff) * 64);
                        getRegion(regionId).addMapObject(realObject, baseLocalX1, baseLocalY1);
                    }
                }
                for (Player p2 : players) {
                    if (p2 == null || !p2.hasStarted() || p2.hasFinished() || !p2.getMapRegionsIds().contains(regionId))
                        continue;
                    if (realObject != null) p2.getPackets().sendSpawnedObject(realObject);
                    else p2.getPackets().sendDestroyObject(object);
                }
            } catch (Throwable e) {
                Logger.error(e);
            }
        }, time, TimeUnit.MILLISECONDS);
    }

    public static boolean isSpawnedObject(WorldObject object) {
        final int regionId = object.getRegionId();
        WorldObject spawnedObject = getRegion(regionId).getSpawnedObject(object, object.getId());
        return spawnedObject != null && object.getId() == spawnedObject.getId();
    }

    public static boolean removeTemporaryObject(final WorldObject object, long time, final boolean clip) {
        final int regionId = object.getRegionId();

        final WorldObject realObject = new WorldObject(object.getId(), object.getType(), object.getRotation(), object
                .getX(), object.getY(), object.getPlane());
        removeObject(object, clip);
        CoresManager.slowExecutor.schedule(() -> {
            try {
                getRegion(regionId).removeRemovedObject(object);
                if (clip) {
                    int baseLocalX = object.getX() - ((regionId >> 8) * 64);
                    int baseLocalY = object.getY() - ((regionId & 0xff) * 64);
                    getRegion(regionId).addMapObject(realObject, baseLocalX, baseLocalY);
                }
                for (Player p2 : players) {
                    if (p2 == null || !p2.hasStarted() || p2.hasFinished() || !p2.getMapRegionsIds().contains(regionId))
                        continue;
                    p2.getPackets().sendSpawnedObject(realObject);
                }
            } catch (Throwable e) {
                Logger.error(e);
            }
        }, time, TimeUnit.MILLISECONDS);

        return true;
    }

    public static ArrayList<WorldObject> removedObjects = new ArrayList<>();

    public static void deleteObject(WorldObject object, boolean clipped) {
        removedObjects.add(object);
        removeObject(object, clipped);
    }

    public static void removeObject(WorldObject object, boolean clip) {
        int regionId = object.getRegionId();
        getRegion(regionId).addRemovedObject(object);
        if (clip) {
            int baseLocalX = object.getX() - ((regionId >> 8) * 64);
            int baseLocalY = object.getY() - ((regionId & 0xff) * 64);
            getRegion(regionId).removeMapObject(object, baseLocalX, baseLocalY);
        }
        synchronized (players) {
            for (Player p2 : players) {
                if (p2 == null || !p2.hasStarted() || p2.hasFinished() || !p2.getMapRegionsIds().contains(regionId))
                    continue;
                p2.getPackets().sendDestroyObject(object);
            }
        }
    }

    public static WorldObject getObject(WorldTile tile) {
        int regionId = tile.getRegionId();
        int baseLocalX = tile.getX() - ((regionId >> 8) * 64);
        int baseLocalY = tile.getY() - ((regionId & 0xff) * 64);
        return getRegion(regionId).getObject(tile.getPlane(), baseLocalX, baseLocalY);
    }

    public static WorldObject[] getObjects(WorldTile tile) {
        int regionId = tile.getRegionId();
        int baseLocalX = tile.getX() - ((regionId >> 8) * 64);
        int baseLocalY = tile.getY() - ((regionId & 0xff) * 64);
        return getRegion(regionId).getObjects(tile.getPlane(), baseLocalX, baseLocalY);
    }

    public static WorldObject getObject(WorldTile tile, int type) {
        int regionId = tile.getRegionId();
        int baseLocalX = tile.getX() - ((regionId >> 8) * 64);
        int baseLocalY = tile.getY() - ((regionId & 0xff) * 64);
        return getRegion(regionId).getObject(tile.getPlane(), baseLocalX, baseLocalY, type);
    }

    public static void spawnObject(WorldObject object, boolean clip) {
        int regionId = object.getRegionId();
        getRegion(regionId).addObject(object);
        if (clip) {
            int baseLocalX = object.getX() - ((regionId >> 8) * 64);
            int baseLocalY = object.getY() - ((regionId & 0xff) * 64);
            getRegion(regionId).addMapObject(object, baseLocalX, baseLocalY);
        }
        synchronized (players) {
            for (Player p2 : players) {
                if (p2 == null || !p2.hasStarted() || p2.hasFinished() || !p2.getMapRegionsIds().contains(regionId))
                    continue;
                p2.getPackets().sendSpawnedObject(object);
            }
        }
    }

    public static void addGroundItem(final Item item, final WorldTile tile) {
        final FloorItem floorItem = new FloorItem(item, tile, null, false, false);
        final Region region = getRegion(tile.getRegionId());
        region.forceGetFloorItems().add(floorItem);
        int regionId = tile.getRegionId();
        for (Player player : players) {
            if (player == null || !player.hasStarted() || player.hasFinished() || player.getPlane() != tile.getPlane()
                || !player.getMapRegionsIds().contains(regionId)) continue;
            addGroundItem(item, tile, player, false, 3600, true);
        }
    }

    public static void addGroundItem(final Item item, final WorldTile tile, final Player owner/* null for default */,
                                     final boolean underGrave, long hiddenTime/* default 3minutes */, boolean
                                             invisible) {
        if (!item.getDefinitions().isStackable() && item.getAmount() > 1) {
            int amount = item.getAmount();
            item.setAmount(1);
            for (int i = 0; i < amount; i++)
                addGroundItem(item, tile, owner, underGrave, hiddenTime, invisible);
        }

        final FloorItem floorItem = new FloorItem(item, tile, owner, owner != null && underGrave, invisible);
        final Region region = getRegion(tile.getRegionId());
        region.forceGetFloorItems().add(floorItem);

        if (invisible && hiddenTime != -1) {
            if (owner != null) owner.getPackets().sendGroundItem(floorItem);
            CoresManager.slowExecutor.schedule(() -> {
                try {
                    if (!region.forceGetFloorItems().contains(floorItem)) return;
                    int regionId = tile.getRegionId();
                    if ((owner != null && underGrave) || ItemConstants.isTradeable(floorItem)) {
                        region.forceGetFloorItems().remove(floorItem);
                        if (owner.getMapRegionsIds().contains(regionId) || owner.getPlane() != tile.getPlane())
                            owner.getPackets().sendRemoveGroundItem(floorItem);
                        return;
                    }
                    floorItem.setInvisible(false);
                    for (Player player : players) {
                        if (player == null || player == owner || !player.hasStarted() || player.hasFinished()
                            || player.getPlane() != tile.getPlane() || !player.getMapRegionsIds().contains(regionId))
                            continue;
                        player.getPackets().sendGroundItem(floorItem);
                    }
                    removeGroundItem(floorItem, 180);
                } catch (Throwable e) {
                    Logger.error(e);
                }
            }, hiddenTime, TimeUnit.SECONDS);
            return;
        }
        int regionId = tile.getRegionId();
        for (Player player : players) {
            if (player == null || !player.hasStarted() || player.hasFinished() || player.getPlane() != tile.getPlane()
                || !player.getMapRegionsIds().contains(regionId)) continue;
            player.getPackets().sendGroundItem(floorItem);
        }
        removeGroundItem(floorItem, 180);
    }

    public static void updateGroundItem(Item item, final WorldTile tile, final Player owner) {
        final FloorItem floorItem = World.getRegion(tile.getRegionId()).getGroundItem(item.getId(), tile, owner);
        if (floorItem == null) {
            addGroundItem(item, tile, owner, false, 360, true);
            return;
        }
        floorItem.setAmount(floorItem.getAmount() + item.getAmount());
        owner.getPackets().sendRemoveGroundItem(floorItem);
        owner.getPackets().sendGroundItem(floorItem);

    }

    private static void removeGroundItem(final FloorItem floorItem, long publicTime) {
        CoresManager.slowExecutor.schedule(() -> {
            try {
                int regionId = floorItem.getTile().getRegionId();
                Region region = getRegion(regionId);
                if (!region.forceGetFloorItems().contains(floorItem)) return;
                region.forceGetFloorItems().remove(floorItem);
                for (Player player : World.getPlayers()) {
                    if (player == null || !player.hasStarted() || player.hasFinished()
                        || player.getPlane() != floorItem.getTile().getPlane()
                        || !player.getMapRegionsIds().contains(regionId)) continue;
                    player.getPackets().sendRemoveGroundItem(floorItem);
                }
            } catch (Throwable e) {
                Logger.error(e);
            }
        }, publicTime, TimeUnit.SECONDS);
    }

    public static boolean removeGroundItem(Player player, FloorItem floorItem) {
        return removeGroundItem(player, floorItem, true);
    }

    public static boolean removeGroundItem(Player player, FloorItem floorItem, boolean add) {
        int regionId = floorItem.getTile().getRegionId();
        Region region = getRegion(regionId);

        if (!region.forceGetFloorItems().contains(floorItem)) return false;

        int amount = floorItem.getAmount();

        if (floorItem.getDefinitions().isStackable()) {
            int inInventory = player.getInventory().getItems().getNumberOf(floorItem.getId());
            if (inInventory > 0) {
                if (inInventory + amount < 0) {
                    amount = Integer.MAX_VALUE - inInventory;
                }
            } else {
                if (player.getInventory().getFreeSlots() < 1) {
                    player.sendMessage("You don't have enough inventory space to pick this up.");
                    return false;
                }
            }
        } else {
            if (player.getInventory().getFreeSlots() < 1) {
                player.sendMessage("You don't have enough inventory space to pick this up.");
                return false;
            }
            if (floorItem.getAmount() > player.getInventory().getFreeSlots()) {
                amount = player.getInventory().getFreeSlots();
            }
        }

        if (amount <= 0) {
            if (floorItem.getDefinitions().isStackable()) {
                player.sendMessage("You are carrying too much of this item.");
            } else player.sendMessage("You don't have enough inventory space to pick this up.");
            return false;
        }

        if (add) player.getInventory().addItem(floorItem.getId(), amount);

        floorItem.setAmount(floorItem.getAmount() - amount);

        if (floorItem.getAmount() > 0) {
            return false;
        }

        region.forceGetFloorItems().remove(floorItem);

        if (floorItem.isInvisible() || floorItem.isGrave()) {
            player.getPackets().sendRemoveGroundItem(floorItem);
            return true;
        } else {
            for (Player p2 : World.getPlayers()) {
                if (p2 == null || !p2.hasStarted() || p2.hasFinished()
                    || p2.getPlane() != floorItem.getTile().getPlane() || !p2.getMapRegionsIds().contains(regionId))
                    continue;
                p2.getPackets().sendRemoveGroundItem(floorItem);
            }
            return true;
        }
    }

    public static void sendGraphics(Entity creator, Graphics graphics, WorldTile tile) {
        if (creator == null) {
            for (Player player : World.getPlayers()) {
                if (player == null || !player.hasStarted() || player.hasFinished() || !player.withinDistance(tile))
                    continue;
                player.getPackets().sendGraphics(graphics, tile);
            }
        } else {
            for (int regionId : creator.getMapRegionsIds()) {
                List<Integer> playersIndexes = getRegion(regionId).getPlayerIndexes();
                if (playersIndexes == null) continue;
                for (Integer playerIndex : playersIndexes) {
                    Player player = players.get(playerIndex);
                    if (player == null || !player.hasStarted() || player.hasFinished() || !player.withinDistance(tile))
                        continue;
                    player.getPackets().sendGraphics(graphics, tile);
                }
            }
        }
    }

    public static void sendProjectile(Entity shooter, WorldTile startTile, WorldTile receiver, int gfxId, int
            startHeight, int endHeight, int speed, int delay, int curve, int startDistanceOffset) {
        for (int regionId : shooter.getMapRegionsIds()) {
            List<Integer> playersIndexes = getRegion(regionId).getPlayerIndexes();
            if (playersIndexes == null) continue;
            for (Integer playerIndex : playersIndexes) {
                Player player = players.get(playerIndex);
                if (player == null || !player.hasStarted() || player.hasFinished() || (!player.withinDistance(shooter)
                                                                                       && !player.withinDistance
                        (receiver)))
                    continue;
                player.getPackets().sendProjectile(null, startTile, receiver, gfxId, startHeight, endHeight, speed,
                        delay, curve, startDistanceOffset, 1);
            }
        }
    }

    public static void sendProjectile(Entity shooter, WorldTile receiver, int gfxId, int startHeight, int endHeight,
                                      int speed, int delay, int curve, int startDistanceOffset) {
        for (int regionId : shooter.getMapRegionsIds()) {
            List<Integer> playersIndexes = getRegion(regionId).getPlayerIndexes();
            if (playersIndexes == null) continue;
            for (Integer playerIndex : playersIndexes) {
                Player player = players.get(playerIndex);
                if (player == null || !player.hasStarted() || player.hasFinished() || (!player.withinDistance(shooter)
                                                                                       && !player.withinDistance
                        (receiver)))
                    continue;
                player.getPackets().sendProjectile(null, shooter, receiver, gfxId, startHeight, endHeight, speed,
                        delay, curve, startDistanceOffset, shooter.getSize());
            }
        }
    }

    public static void sendProjectile(Entity shooter, Entity receiver, Projectile projectile) {
        World.sendProjectile(shooter, receiver, projectile.getGfxId(), projectile.getStartHeight(), projectile
                .getEndHeight(), projectile.getSpeed(), projectile.getDelay(), projectile.getCurve(), projectile
                .getStartDistanceOffset());
    }

    public static void sendProjectile(Entity shooter, Entity receiver, int gfxId, int startHeight, int endHeight, int
            speed, int delay, int curve, int startDistanceOffset) {
        for (int regionId : shooter.getMapRegionsIds()) {
            List<Integer> playersIndexes = getRegion(regionId).getPlayerIndexes();
            if (playersIndexes == null) continue;
            for (Integer playerIndex : playersIndexes) {
                Player player = players.get(playerIndex);
                if (player == null || !player.hasStarted() || player.hasFinished() || (!player.withinDistance(shooter)
                                                                                       && !player.withinDistance
                        (receiver)))
                    continue;
                int size = shooter.getSize();
                player.getPackets().sendProjectile(receiver, new WorldTile(shooter.getCoordFaceX(size), shooter
                        .getCoordFaceY(size), shooter.getPlane()), receiver, gfxId, startHeight, endHeight, speed,
                        delay, curve, startDistanceOffset, size);
            }
        }
    }

    /**
     * Check if a tile is in a multi combat area
     *
     * @param tile the WorldTile (Player/Entity/WorldTile)
     * @return if the spot is multi
     */
    public static boolean isMultiArea(WorldTile tile) {
        for (Area area : multiAreas) {
            if (area.contains(tile)) {
                if (tile instanceof Player) return true;
                return true;
            }
        }
        return KingBlackDragon.atKBD(tile) || TormentedDemon.atTD(tile);
    }

    public static boolean isPvpArea(WorldTile tile) {
        return Wilderness.isAtWild(tile);
    }

    public static void destroySpawnedObject(WorldObject object, boolean clip) {
        int regionId = object.getRegionId();
        int baseLocalX = object.getX() - ((regionId >> 8) * 64);
        int baseLocalY = object.getY() - ((regionId & 0xff) * 64);
        WorldObject realMapObject = getRegion(regionId).getRealObject(object);

        World.getRegion(regionId).removeObject(object);
        if (clip) World.getRegion(regionId).removeMapObject(object, baseLocalX, baseLocalY);
        for (Player p2 : World.getPlayers()) {
            if (p2 == null || !p2.hasStarted() || p2.hasFinished() || !p2.getMapRegionsIds().contains(regionId))
                continue;
            if (realMapObject != null) p2.getPackets().sendSpawnedObject(realMapObject);
            else p2.getPackets().sendDestroyObject(object);
        }
    }

    public static void spawnTempGroundObject(final WorldObject object, final int replaceId, long time) {
        final int regionId = object.getRegionId();
        WorldObject realMapObject = getRegion(regionId).getRealObject(object);
        final WorldObject realObject = realMapObject
                                       == null ? null : new WorldObject(realMapObject.getId(), realMapObject.getType
                (), realMapObject.getRotation(), object.getX(), object.getY(), object.getPlane());
        spawnObject(object, false);
        CoresManager.slowExecutor.schedule(() -> {
            try {
                getRegion(regionId).removeObject(object);
                addGroundItem(new Item(replaceId), object, null, false, 180, false);
                for (Player p2 : players) {
                    if (p2 == null || !p2.hasStarted() || p2.hasFinished() || p2.getPlane() != object.getPlane()
                        || !p2.getMapRegionsIds().contains(regionId)) continue;
                    if (realObject != null) p2.getPackets().sendSpawnedObject(realObject);
                    else p2.getPackets().sendDestroyObject(object);
                }
            } catch (Throwable e) {
                Logger.error(e);
            }
        }, time, TimeUnit.MILLISECONDS);
    }

    public static int getIdFromName(String playerName) {
        for (Player p : players) {
            if (p == null) {
                continue;
            }
            if (p.getUsername().equalsIgnoreCase(TextUtils.formatPlayerNameForProtocol(playerName))) {
                return p.getIndex();
            }
        }
        return 0;
    }

}

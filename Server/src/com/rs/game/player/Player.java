package com.rs.game.player;

import com.rs.Settings;
import com.rs.cores.CoresManager;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.item.ItemSet;
import com.rs.game.minigames.ClanWars;
import com.rs.game.minigames.War;
import com.rs.game.minigames.bountyHunter.BountyHunter;
import com.rs.game.npc.Npc;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.content.Pots;
import com.rs.game.player.content.Trade;
import com.rs.game.player.content.interfaces.serverPanel.ServerPanelManager;
import com.rs.game.player.content.skills.combat.BossKillCounter;
import com.rs.game.player.content.skills.construction.House;
import com.rs.game.player.content.skills.farming.Farming;
import com.rs.game.player.content.skills.slayer.CoopSlayer;
import com.rs.game.player.content.skills.slayer.SlayerTask;
import com.rs.game.player.content.skills.summoning.FollowerManager;
import com.rs.game.player.controllers.impl.DuelController;
import com.rs.game.player.controllers.impl.Kalaboss;
import com.rs.game.player.controllers.impl.Wilderness;
import com.rs.game.player.info.FriendChatsManager;
import com.rs.game.player.info.RanksManager;
import com.rs.game.player.info.SkillCapeCustomizer;
import com.rs.game.player.quests.QuestManager;
import com.rs.game.player.social.FriendsIgnores;
import com.rs.game.player.social.PublicChatMessage;
import com.rs.game.player.social.QuickChatMessage;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.*;
import com.rs.net.Session;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.net.encoders.WorldPacketsEncoder;
import com.rs.utils.Utils;
import com.rs.utils.game.itemUtils.PriceUtils;
import com.rs.utils.stringUtils.TextUtils;
import com.rs.utils.stringUtils.TimeUtils;
import org.pmw.tinylog.Logger;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

import static com.rs.game.player.InterfaceManager.GameInterface.INVENTORY_OVERRIDE;
import static com.rs.utils.Constants.BonusType.*;
import static com.rs.utils.Constants.*;

public class Player extends Entity {

    public static final int TELE_MOVE_TYPE = 127, WALK_MOVE_TYPE = 1, RUN_MOVE_TYPE = 2;
    private static final long serialVersionUID = 2011932556974180375L;

    /**
     * Admin variables
     */
    public boolean debug = false;
    public transient WorldObject examinedObject;
    public transient Npc examinedNpc;

    /**
     * Point variables
     */
    private int loyaltyPoints = 0;
    private int pkPoints = 0;
    private int serverPoints = 0;
    private int dungPoints = 0;
    private int slayerPoints = 0;
    private int wGuildTokens;
    private int pestPoints;
    private double donationAmount = 0.0;
    /**
     * Effects
     */
    private long poisonImmune;
    private long fireImmune;
    private int skullDelay;
    private int overloadDelay;
    private int renewalDelay;

    /**
     * Player variables
     */
    private String password;
    private String salt;
    private String displayName;
    private String lastIP;
    private long muted;
    private long jailed;
    private long banned;
    /**
     * Only relevant once when we add starter
     */
    private boolean receivedStarter = false;
    private boolean permBanned;
    private boolean filterGame;
    private boolean lockXp = false;
    private boolean allowChatEffects;
    private boolean mouseButtons;
    private boolean allowBossTasks;
    private int killCount;
    private int deathCount;
    private int privateChatSetup;
    private int skullId;
    private int chatType;
    private byte runEnergy;
    private int[] maxedCapeCustomized;
    private int[] completionistCapeCustomized;

    /**
     * Ranks
     */
    private RanksManager.Ranks playerRank = RanksManager.Ranks.NORMAL;
    private RanksManager.Ranks donorRank = RanksManager.Ranks.NORMAL;

    /**
     * Misc variables
     */
    private boolean updateMovementType;
    private int temporaryMovementType;
    private boolean forceNextMapLoadRefresh;
    /**
     * Content
     */
    private Appearance appearance;
    private Inventory inventory;
    private Equipment equipment;
    private Skills skills;
    private CombatDefinitions combatDefinitions;
    private Prayer prayer;
    private Bank bank;
    private ControllerManager controllerManager;
    private MusicsManager musicsManager;
    private EmotesManager emotesManager;
    private ChargesManager charges;
    private FriendsIgnores friendsIgnores;
    private FollowerManager followerManager;
    private Farming farming;
    private AuraManager auraManager;
    private BossKillCounter bossCounter;
    private QuestManager questManager;
    private BountyHunter bountyHunter;
    private SlayerTask task;
    private CoopSlayer coopSlayer;
    private ServerPanelManager serverPanelManager;
    private House house;
    /**
     * Game play variables
     */
    private int lastVeng;
    private boolean castedVeng;
    private int[] pouches;
    private HashMap<String, Long> recentKills = new HashMap<>();

    /**
     * Barrows
     */
    private boolean[] killedBarrowBrothers;
    private int hiddenBrother;
    private int barrowsKillCount;

    /**
     * Transient variables (variables that should not (and will not) be saved)
     */
    private transient String username;

    private transient long stopDelay;
    private transient long foodDelay;
    private transient long potDelay;
    private transient long boneDelay;
    private transient long lastPublicMessage;
    private transient long solDelay;
    private transient long packetsDecoderPing;

    private transient int displayMode;
    private transient int screenWidth;
    private transient int screenHeight;
    private transient int trapAmount;

    private transient boolean clientLoadedMapRegion;
    private transient boolean resting;
    private transient boolean forceWalk = false;
    private transient boolean lastRun = false;
    private transient boolean canPvp;
    // player stages
    private transient boolean started;
    private transient boolean running;
    private transient boolean finishing;
    private transient boolean disableEquip;

    private transient Trade trade;
    private transient ClanWars clanWars;
    private transient InterfaceManager interfaceManager;
    private transient DialogueManager dialogueManager;
    private transient HintIconsManager hintIconsManager;
    private transient LoyaltyManager loyaltyManager;
    private transient ActionManager actionManager;
    private transient CutscenesManager cutscenesManager;
    private transient DuelConfigurations duelConfigurations;
    private transient PriceCheckManager priceCheckManager;
    private transient FriendChatsManager currentFriendChat;

    private transient Session session;
    private transient Runnable closeInterfacesEvent;
    // used for packets logic
    private transient ConcurrentLinkedQueue<LogicPacket> logicPackets;
    // used for update
    private transient LocalPlayerUpdate localPlayerUpdate;
    private transient LocalNPCUpdate localNPCUpdate;
    private transient List<Integer> switchItemCache;

    private String currentFriendChatOwner;
    private int summoningLeftClickOption;
    private List<String> ownedObjectsManagerKeys;
    private boolean inClops;

    /**
     * Route finding
     */
    private transient RouteEvent routeEvent;

    public void setRouteEvent(RouteEvent routeEvent) {
        this.routeEvent = routeEvent;
    }

    public Player(String password, String salt) {
        super(Settings.START_PLAYER_LOCATION);

        this.password = password;
        this.salt = salt;

        setHealth(Settings.START_PLAYER_HITPOINTS);
        runEnergy = 100;
        allowChatEffects = true;
        mouseButtons = true;
        pouches = new int[4];

        recentKills = new HashMap<>();
        appearance = new Appearance();
        inventory = new Inventory();
        equipment = new Equipment();
        skills = new Skills();
        combatDefinitions = new CombatDefinitions();
        prayer = new Prayer();
        bank = new Bank();
        controllerManager = new ControllerManager();
        musicsManager = new MusicsManager();
        emotesManager = new EmotesManager();
        friendsIgnores = new FriendsIgnores();
        charges = new ChargesManager();
        auraManager = new AuraManager();
        farming = new Farming();
        bountyHunter = new BountyHunter();
        bossCounter = new BossKillCounter(this);
        coopSlayer = new CoopSlayer(this);
        questManager = new QuestManager();
        followerManager = new FollowerManager();
        serverPanelManager = new ServerPanelManager();

        killedBarrowBrothers = new boolean[6];
        SkillCapeCustomizer.resetSkillCapes(this);
        ownedObjectsManagerKeys = new LinkedList<>();
    }

    public void init(Session session, String name) {
        username = name;
        this.session = session;
        if (Settings.DEBUG) Logger.info("Initiated Player: " + name + ", pass: " + password);
    }

    public void init(Session session, String username, int displayMode, int screenWidth, int screenHeight) {

        if (auraManager == null) auraManager = new AuraManager();
        if (bossCounter == null) bossCounter = new BossKillCounter(this);
        if (bountyHunter == null) bountyHunter = new BountyHunter();
        if (questManager == null) questManager = new QuestManager();
        if (coopSlayer == null) coopSlayer = new CoopSlayer(this);
        if (followerManager == null) followerManager = new FollowerManager();
        //if (serverPanelManager == null)
        serverPanelManager = new ServerPanelManager();
        if (farming == null) farming = new Farming();
        if (house == null) house = new House(this);
        if (recentKills == null) recentKills = new HashMap<>();
        if (task != null) if (task.getName() == null) task = null;

        this.session = session;
        this.username = username;
        this.displayMode = displayMode;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        interfaceManager = new InterfaceManager(this);
        dialogueManager = new DialogueManager(this);
        hintIconsManager = new HintIconsManager(this);
        loyaltyManager = new LoyaltyManager(this);
        priceCheckManager = new PriceCheckManager(this);
        localPlayerUpdate = new LocalPlayerUpdate(this);
        localNPCUpdate = new LocalNPCUpdate(this);
        actionManager = new ActionManager(this);
        cutscenesManager = new CutscenesManager(this);

        appearance.setPlayer(this);
        inventory.setPlayer(this);
        equipment.setPlayer(this);
        skills.setPlayer(this);
        combatDefinitions.setPlayer(this);
        prayer.setPlayer(this);
        bank.setPlayer(this);
        controllerManager.setPlayer(this);
        questManager.setPlayer(this);
        musicsManager.setPlayer(this);
        emotesManager.setPlayer(this);
        friendsIgnores.setPlayer(this);
        auraManager.setPlayer(this);
        charges.setPlayer(this);
        bountyHunter.setPlayer(this);
        house.setPlayer(this);
        serverPanelManager.setPlayer(this);

        setDirection(Utils.getFaceDirection(0, -1));
        logicPackets = new ConcurrentLinkedQueue<>();
        switchItemCache = Collections.synchronizedList(new ArrayList<Integer>());
        initEntity();
        packetsDecoderPing = TimeUtils.getTime();

        World.addPlayer(this);
        World.updateEntityRegion(this);

        if (Settings.DEBUG) Logger.info("Player Logged in: " + username + ", pass: " + password);
        playerRank = Settings.DEFAULT_RANK;
        if (Settings.isOwner(this)) playerRank = RanksManager.Ranks.OWNER;
        if (Settings.isDeveloper(this)) playerRank = RanksManager.Ranks.DEVELOPER;
    }

    public void run() {
        if (World.exiting_start != 0) {
            int delayPassed = (int) ((TimeUtils.getTime() - World.exiting_start) / 1000);
            getPackets().sendSystemUpdate(World.exiting_delay - delayPassed);
        }
        questManager.sendConfigs();
        lastIP = getSession().getIP();
        interfaceManager.sendInterfaces();
        getPackets().sendRunEnergy();
        refreshAllowChatEffects();
        refreshMouseButtons();
        refreshPrivateChatSetup();
        sendRunButtonConfig();
        getEmotesManager().unlockAllEmotes();
        World.sendLoginMessage(this);
        sendDefaultPlayersOptions();
        checkMultiArea();
        inventory.init();
        equipment.init();
        skills.init();
        combatDefinitions.init();
        prayer.init();
        friendsIgnores.init();
        serverPanelManager.sendUnlockNotes();
        getLoyaltyManager().startTimer();
        refreshHitPoints();
        prayer.refreshPrayerPoints();
        getPoison().refresh();
        for (int i = 0; i < 150; i++) {
            getPackets().sendIComponentSettings(590, i, 0, 190, 2150);
        }
        getPackets().sendConfig(281, 1000); // unlock can't do this on tutorial
        getPackets().sendConfig(1160, -1); // unlock summoning orb
        getPackets().sendGameBarStages();
        farming.login(this);
        musicsManager.init();
        emotesManager.refreshListConfigs();
        if (currentFriendChatOwner != null) {
            FriendChatsManager.joinChat(currentFriendChatOwner, this);
            if (currentFriendChat == null) currentFriendChatOwner = null;
        }
        followerManager.login(this);
        if (!receivedStarter) {
            receivedStarter = true;
            sendMessage("You have received a free starter set!");
            ItemSet.addInvSet(this, "Starter");
        }
        running = true;
        updateMovementType = true;
        appearance.generateAppearanceData();
        controllerManager.login(); // checks what to do on login after welcome
        OwnedObjectManager.linkKeys(this);

    }

    public BountyHunter getBountyHunter() {
        return bountyHunter;
    }

    /**
     * Send a message to the players chat box
     *
     * @param msg the message
     */
    public void sendMessage(String msg) {
        getPackets().sendGameMessage(msg);
    }

    /**
     * Sends a message to the players chat box
     *
     * @param msg    the message
     * @param filter should it be filtered if game filter is filtering?
     */
    public void sendMessage(String msg, boolean filter) {
        getPackets().sendGameMessage(msg, filter);
    }

    /**
     * Get donor rank if no better rank available (for yell etc)
     */
    public RanksManager.Ranks getBestRank() {
        if (playerRank == RanksManager.Ranks.NORMAL) return donorRank;
        else return playerRank;
    }

    public RanksManager.Ranks getRank() {
        return playerRank;
    }

    public RanksManager.Ranks getDonorRank() {
        return donorRank;
    }

    /**
     * Is this player eligible for the privileges of given rank
     */
    public boolean hasRights(RanksManager.Ranks rank) {
        return rank.ordinal() >= getBestRank().ordinal();
    }

    /**
     * Is this player eligible for the privileges of given rank
     * Admin+ are donor mods are not.
     */
    public boolean hasDonorRights(RanksManager.Ranks rank) {
        return rank.ordinal() >= donorRank.ordinal() || hasRights(RanksManager.Ranks.ADMIN);
    }

    /**
     * Gives the player skull for 10 minutes
     */
    public void setWildernessSkull() {
        skullDelay = 1000;
        skullId = 0;
        appearance.generateAppearanceData();
    }

    boolean hasSkull() {
        return skullDelay > 0;
    }

    public int getWGuildTokens() {
        return wGuildTokens;
    }

    public void setWGuildTokens(int tokens) {
        wGuildTokens = tokens;
    }

    public boolean inClopsRoom() {
        return inClops;
    }

    public void setInClopsRoom(boolean in) {
        inClops = in;
    }

    /**
     * Refresh item spawns(dropped items etc.) in the area
     */
    private void refreshSpawnedItems() {
        for (int regionId : getMapRegionsIds()) {
            List<FloorItem> floorItems = World.getRegion(regionId).getFloorItems();
            if (floorItems == null) continue;
            for (FloorItem item : floorItems) {
                if ((item.isInvisible() || item.isGrave()) && this != item.getOwner()
                    || item.getTile().getPlane() != getPlane()) continue;
                getPackets().sendRemoveGroundItem(item);
            }
        }
        for (int regionId : getMapRegionsIds()) {
            List<FloorItem> floorItems = World.getRegion(regionId).getFloorItems();
            if (floorItems == null) continue;
            for (FloorItem item : floorItems) {
                if ((item.isInvisible() || item.isGrave()) && this != item.getOwner()
                    || item.getTile().getPlane() != getPlane()) continue;
                getPackets().sendGroundItem(item);
            }
        }
    }

    /**
     * Refresh the objects spawned and removed in the area
     */
    private void refreshSpawnedObjects() {
        for (int regionId : getMapRegionsIds()) {
            List<WorldObject> spawnedObjects = World.getRegion(regionId).getSpawnedObjects();
            if (spawnedObjects != null) spawnedObjects.stream().filter(object -> object.getPlane()
                                                                                 == getPlane()).forEach(object ->
                    getPackets().sendSpawnedObject(object));
            List<WorldObject> removedObjects = World.getRegion(regionId).getRemovedObjects();
            if (removedObjects != null) removedObjects.stream().filter(object -> object.getPlane()
                                                                                 == getPlane()).forEach(object ->
                    getPackets().sendDestroyObject(object));
        }
        for (WorldObject object : World.removedObjects) {
            getPackets().sendDestroyObject(object);
        }
    }

    public void start() {
        loadMapRegions();
        started = true;
        run();
        if (isDead()) sendDeath(null);
    }

    public void stopAll() {
        stopAll(true);
    }

    public void stopAll(boolean stopWalk) {
        stopAll(stopWalk, true);
    }

    public void stopAll(boolean stopWalk, boolean stopInterfaces) {
        if (getTrade() != null) return;
        if (stopInterfaces) closeInterfaces();
        if (stopWalk) {
            resetWalkSteps();
            routeEvent = null;
        }
        actionManager.forceStop();
        combatDefinitions.resetSpells(false);
    }

    public void closeInterfaces() {
        if (getTrade() != null) {
            return;
        }
        if (interfaceManager.containsScreenInter()) interfaceManager.closeScreenInterface();
        if (interfaceManager.containsInventoryInter()) interfaceManager.closeInterfaces(INVENTORY_OVERRIDE);
        dialogueManager.finishDialogue();
        if (closeInterfacesEvent != null) {
            closeInterfacesEvent.run();
            closeInterfacesEvent = null;
        }
    }

    public void resetClientLoadedMapRegion() {
        clientLoadedMapRegion = false;
    }

    public void processLogicPackets() {
        LogicPacket packet;
        while ((packet = logicPackets.poll()) != null) WorldPacketsDecoder.decodeLogicPacket(this, packet);
    }

    /**
     * Toggle between run and walk
     *
     * @param update shall we tell the client?
     */
    public void toggleRun(boolean update) {
        super.setRun(forceWalk ? lastRun = !lastRun : !getRun());
        updateMovementType = true;
        if (update) sendRunButtonConfig();
        if (forceWalk) setRunHidden(false);
    }

    /**
     * Force the player to walk
     *
     * @param walk walking/not forced
     */
    public void forceWalk(boolean walk) {
        forceWalk = walk;
        if (walk) lastRun = getRun();
        else setRunHidden(lastRun);
        setRunHidden(!walk && lastRun);
    }

    /**
     * Set run without changing the config (so it doesn't show to client that we are walking aside from the speed we
     * are moving at)
     **/
    private void setRunHidden(boolean run) {
        super.setRun(run);
        updateMovementType = true;
    }

    /**
     * Send the run orb config
     */
    private void sendRunButtonConfig() {
        getPackets().sendConfig(173, resting ? 3 : getRun() ? 1 : 0);
    }

    public void restoreRunEnergy() {
        if (getNextRunDirection() == -1 && runEnergy < 100) {
            runEnergy++;
            if (resting && runEnergy < 100) runEnergy++;
            getPackets().sendRunEnergy();
        }
    }

    public void restoreRunEnergy(int amount) {
        runEnergy += amount;
        if (runEnergy > 100) setRunEnergy(100);
        else getPackets().sendRunEnergy();
    }

    /**
     * May this player move trough an action? (no walking or running)
     */
    public boolean checkPlayerInvokedMovement(int movementType, WorldTile toTile) {
        if (hasStopDelay()) return false; //if we are stopped we can't move clearly.
        switch (movementType) {
            case MAGIC_TELEPORT:
                if (!controllerManager.processMagicTeleport(toTile)) return false;
                break;
            case ITEM_TELEPORT:
                if (!controllerManager.processItemTeleport(toTile)) return false;
                break;
            case OBJECT_TELEPORT:
                if (!controllerManager.processObjectTeleport(toTile)) return false;
                break;
        }
        return (controllerManager.checkMovement(movementType, toTile));
    }

    /**
     * Check if we need to do something after we have moved to a new tile (toTile)
     */
    public void moved(WorldTile toTile) {
        if (controllerManager.getController() == null)
            if (Kalaboss.isAtKalaboss(toTile)) controllerManager.startController("Kalaboss");
            else if (DuelController.isAtDuelArena(toTile)) controllerManager.startController("DuelController");
            else if (Wilderness.isAtWild(toTile)) controllerManager.startController("Wilderness");
    }

    private void sendDefaultPlayersOptions() {
        getPackets().sendPlayerOption("Follow", 2, false);
        getPackets().sendPlayerOption("Trade with", 3, false);
        //  getPackets().sendPlayerOption("Req Assist", 4, false);
    }

    public void logout() {
        if (!running) return;
        long currentTime = TimeUtils.getTime();
        if (getAttackedByDelay() + 10000 > currentTime) {
            getPackets().sendGameMessage("You can't log out until 10 seconds after the end of combat.");
            return;
        }
        if (getEmotesManager().getNextEmoteEnd() >= currentTime) {
            getPackets().sendGameMessage("You can't log out while performing an emote.");
            return;
        }
        if (stopDelay >= currentTime) {
            getPackets().sendGameMessage("You can't log out while performing an action.");
            return;
        }
        getPackets().sendLogout();
        running = false;
    }

    public void realFinish() {
        if (hasFinished()) return;
        if (getTrade() != null) getTrade().tradeFailed();
        cutscenesManager.logout();
        controllerManager.logout();
        running = false;
        friendsIgnores.sendFriendsMyStatus(false);
        if (currentFriendChat != null) currentFriendChat.leaveChat(this, true);
        followerManager.logout();
        setFinished(true);
        session.setDecoder(-1);
        PlayerUtils.savePlayer(this);
        World.updateEntityRegion(this);
        World.removePlayer(this);
        if (Settings.DEBUG) Logger.info("Finished Player: " + username + ", pass: " + password);
    }

    void refreshHitPoints() {
        getPackets().sendConfigByFile(7198, getHealth());
    }

    public String getUsername() {
        return username;
    }

    /*
     * do not use this, only used by pm
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the crown icon to be added before a message from this player
     **/
    public int getMessageIcon() {
        return playerRank == RanksManager.Ranks.NORMAL ? donorRank.getCrown() : playerRank.getCrown();
    }

    public WorldPacketsEncoder getPackets() {
        return session.getWorldPackets();
    }

    public boolean hasStarted() {
        return started;
    }

    public boolean isRunning() {
        return running;
    }

    public String getDisplayName() {
        return TextUtils.formatPlayerNameForDisplay(username);
    }

    public void setDisplayName(String displayName) {
        if (TextUtils.formatPlayerNameForDisplay(username).equals(displayName)) this.displayName = null;
        else this.displayName = displayName;
    }

    public boolean hasDisplayName() {
        return displayName != null;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    int getTemporaryMoveType() {
        return temporaryMovementType;
    }

    public void setTemporaryMoveType(int temporaryMovementType) {
        this.temporaryMovementType = temporaryMovementType;
    }

    public LocalPlayerUpdate getLocalPlayerUpdate() {
        return localPlayerUpdate;
    }

    public LocalNPCUpdate getLocalNPCUpdate() {
        return localNPCUpdate;
    }

    public int getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(int displayMode) {
        this.displayMode = displayMode;
    }

    public InterfaceManager getInterfaceManager() {
        return interfaceManager;
    }

    public long getPacketsDecoderPing() {
        return packetsDecoderPing;
    }

    public void setPacketsDecoderPing(long packetsDecoderPing) {
        this.packetsDecoderPing = packetsDecoderPing;
    }

    public Session getSession() {
        return session;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public boolean clientHasLoadedMapRegion() {
        return clientLoadedMapRegion;
    }

    private void setClientHasLoadedMapRegion() {
        clientLoadedMapRegion = true;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Skills getSkills() {
        return skills;
    }

    public byte getRunEnergy() {
        return runEnergy;
    }

    public void setRunEnergy(int runEnergy) {
        this.runEnergy = (byte) runEnergy;
        getPackets().sendRunEnergy();
    }

    public void drainRunEnergy() {
        setRunEnergy(runEnergy - 1);
    }

    public void drainRunEnergy(int amount) {
        setRunEnergy(runEnergy - amount);
        if (runEnergy < 0) runEnergy = 0;
    }

    public boolean isResting() {
        return resting;
    }

    public void setResting(boolean resting) {
        this.resting = resting;
        sendRunButtonConfig();
    }

    public ActionManager getActionManager() {
        return actionManager;
    }

    public DialogueManager getDialogueManager() {
        return dialogueManager;
    }

    private LoyaltyManager getLoyaltyManager() {
        return loyaltyManager;
    }

    public CombatDefinitions getCombatDefinitions() {
        return combatDefinitions;
    }

    private void sendSoulSplit(final Hit hit, final Entity user) {
        final Player target = this;
        if (hit.getDamage() > 0) World.sendProjectile(user, this, 2263, 11, 11, 20, 5, 0, 0);
        user.heal(hit.getDamage() / 5);
        prayer.drainPrayer(hit.getDamage() / 5);
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                setNextGraphics(new Graphics(2264));
                if (hit.getDamage() > 0) World.sendProjectile(target, user, 2263, 11, 11, 20, 5, 0, 0);
            }
        }, 1);
    }

    @Override
    public void handleIngoingHit(final Hit hit) {
        if (hit.getLook() != HitLook.MELEE_DAMAGE && hit.getLook() != HitLook.RANGE_DAMAGE
            && hit.getLook() != HitLook.MAGIC_DAMAGE) return;
        if (auraManager.usingPenance()) {
            int amount = (int) (hit.getDamage() * 0.2);
            if (amount > 0) prayer.restorePrayer(amount);
        }
        Entity source = hit.getSource();

        if (source == null) return;
        int shieldId = equipment.getShieldId();
        if (shieldId == 13742) { // elysian
            if (Utils.getRandom(100) <= 70) hit.setDamage((int) (hit.getDamage() * 0.75));
        } else if (shieldId == 13740) { // divine
            int drain = (int) (Math.ceil(hit.getDamage() * 0.3) / 2);
            if (prayer.getPrayerPoints() >= drain) {
                hit.setDamage((int) (hit.getDamage() * 0.70));
                prayer.drainPrayer(drain);
            }
        }
        if (solDelay > TimeUtils.getTime()) hit.setDamage((int) (hit.getDamage() * 0.5));

        if (hit.getDamage() >= 200) {
            if (hit.getLook() == HitLook.MELEE_DAMAGE) {
                int reducedDamage = hit.getDamage() * combatDefinitions.getBonuses()[ABSORB_MELEE_BONUS.getId()] / 100;
                if (reducedDamage > 0) {
                    hit.setDamage(hit.getDamage() - reducedDamage);
                    hit.setSoaking(new Hit(source, reducedDamage, HitLook.ABSORB_DAMAGE));
                }
            } else if (hit.getLook() == HitLook.RANGE_DAMAGE) {
                int reducedDamage = hit.getDamage() * combatDefinitions.getBonuses()[ABSORB_RANGE_BONUS.getId()] / 100;
                if (reducedDamage > 0) {
                    hit.setDamage(hit.getDamage() - reducedDamage);
                    hit.setSoaking(new Hit(source, reducedDamage, HitLook.ABSORB_DAMAGE));
                }
            } else if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
                int reducedDamage = hit.getDamage() * combatDefinitions.getBonuses()[ABSORB_MAGIC_BONUS.getId()] / 100;
                if (reducedDamage > 0) {
                    hit.setDamage(hit.getDamage() - reducedDamage);
                    hit.setSoaking(new Hit(source, reducedDamage, HitLook.ABSORB_DAMAGE));
                }
            }
        }
        if (castedVeng && hit.getDamage() >= 4) {
            castedVeng = false;
            setNextForceTalk(new ForceTalk("Taste vengeance!"));
            source.applyHit(new Hit(this, (int) (hit.getDamage() * 0.75), HitLook.REGULAR_DAMAGE));
        }
        if (!(source instanceof Player)) {
            Npc n = (Npc) source;
            if (n.getId() == 13448) sendSoulSplit(hit, n);
        }
    }

    @Override
    public void reset() {
        super.reset();
        refreshHitPoints();
        hintIconsManager.removeAll();
        skills.restoreSkills();
        combatDefinitions.resetSpecialAttack();
        prayer.reset();
        combatDefinitions.resetSpells(true);
        resting = false;
        skullDelay = 0;
        foodDelay = 0;
        potDelay = 0;
        poisonImmune = 0;
        fireImmune = 0;
        lastVeng = 0;
        castedVeng = false;
        setRunEnergy(100);
        appearance.generateAppearanceData();
    }

    @Override
    public void processReceivedHits() {
        if (stopDelay > TimeUtils.getTime()) return;
        super.processReceivedHits();
    }

    @Override
    public void removeHealth(Hit hit) {
        super.removeHealth(hit);
        refreshHitPoints();
    }

    @Override
    public void heal(int amount, int extra) {
        super.heal(amount, extra);
        refreshHitPoints();
    }

    @Override
    public void sendDeath(final Entity source) {
        if (getTemporaryAttributes().get("startedDuel") != Boolean.TRUE) applyDeathEffects(source);
        setNextAnimation(new Animation(-1));
        if (!controllerManager.sendDeath()) return;
        addStopDelay(7);
        stopAll();
        followerManager.sendDeath();
        final Player thisPlayer = this;
        WorldTasksManager.schedule(new WorldTask() {
            int loop;

            @Override
            public void run() {
                if (loop == 0) {
                    setNextAnimation(new Animation(836));
                } else if (loop == 1) {
                    getPackets().sendGameMessage("Oh dear, you have died.");
                } else if (loop == 3) {
                    Player killer = getMostDamageReceivedSourcePlayer();

                    if (killer != null) {
                        killer.removeDamage(thisPlayer);
                        killer.increaseKillCount(thisPlayer);
                        sendItemsOnDeath(killer);
                    }
                    equipment.init();
                    inventory.init();
                    reset();

                    setNextWorldTile(new WorldTile(Settings.RESPAWN_PLAYER_LOCATION));
                    setNextAnimation(new Animation(-1));
                } else if (loop == 4) {
                    getPackets().sendMusicEffect(90);
                    stop();
                }
                loop++;
            }
        }, 0, 1);
    }

    @Override
    public boolean restoreHitPoints() {
        boolean update = super.restoreHitPoints();
        if (update) {
            if (prayer.usingPrayer(Prayer.PrayerSpell.RAPID_HEAL)) super.restoreHitPoints();
            if (resting) super.restoreHitPoints();
            refreshHitPoints();
        }
        return update;
    }

    @Override
    public boolean needMasksUpdate() {
        return super.needMasksUpdate() || temporaryMovementType != 0 || updateMovementType;
    }

    @Override
    public void resetMasks() {
        super.resetMasks();
        temporaryMovementType = 0;
        updateMovementType = false;
        if (!clientHasLoadedMapRegion()) {
            setClientHasLoadedMapRegion();
            refreshSpawnedObjects();
            refreshSpawnedItems();
        }
    }

    @Override
    public void finish() {
        if (finishing || hasFinished()) return;
        finishing = true;
        long currentTime = TimeUtils.getTime();
        if (getAttackedByDelay() + 10000 > currentTime || getEmotesManager().getNextEmoteEnd() >= currentTime
            || stopDelay >= currentTime) {
            CoresManager.slowExecutor.schedule(() -> {
                try {
                    packetsDecoderPing = TimeUtils.getTime();
                    finishing = false;
                    finish();
                } catch (Throwable e) {
                    Logger.error(e);
                }
            }, 10, TimeUnit.SECONDS);
            return;
        }
        realFinish();
    }

    @Override
    public int getMaxHitPoints() {
        return skills.getLevel(Skills.HITPOINTS) * 10 + equipment.getEquipmentHpIncrease();
    }

    @Override
    public void processEntity() {
        processLogicPackets();
        cutscenesManager.process();
        super.processEntity();
        if (musicsManager.musicEnded()) musicsManager.replayMusic();
        if (hasSkull()) {
            skullDelay--;
            if (!hasSkull()) appearance.generateAppearanceData();
        }

        if (solDelay == 1) getPackets().sendGameMessage(
                "The power of the light fades. Your resistance to melee attacks return to " + "normal.");
        if (overloadDelay > 0) {
            if (overloadDelay == 1 || isDead()) {
                Pots.resetOverLoadEffect(this);
                return;
            } else if ((overloadDelay - 1) % 25 == 0) Pots.applyOverLoadEffect(this);
            overloadDelay--;
        }

        if (renewalDelay > 0) {
            if (renewalDelay % 8 == 0) Pots.applyRenewal(this);
            renewalDelay--;
        }

        if (lastVeng > 0) lastVeng--;

        farming.updateConfigs();
        charges.process();
        auraManager.process();
        if (routeEvent != null && routeEvent.processEvent(this)) routeEvent = null;
        actionManager.process();
        prayer.processPrayer();
        controllerManager.process();

    }

    @Override
    public void loadMapRegions() {
        boolean wasAtDynamicRegion = isAtDynamicRegion();
        super.loadMapRegions();
        clientLoadedMapRegion = false;
        if (!started) {
            if (isAtDynamicRegion()) {
                getPackets().sendMapRegion(!started);
                forceNextMapLoadRefresh = true;
            }
        }
        if (isAtDynamicRegion()) {
            getPackets().sendDynamicMapRegion(wasAtDynamicRegion);
            if (!wasAtDynamicRegion) localNPCUpdate.reset();
        } else {
            getPackets().sendMapRegion(!started);
            if (wasAtDynamicRegion) localNPCUpdate.reset();
        }
        forceNextMapLoadRefresh = false;
    }

    @Override
    public void setRun(boolean run) {
        if (run != getRun()) {
            super.setRun(run);
            updateMovementType = true;
            sendRunButtonConfig();
        }
    }

    @Override
    public int getSize() {
        return appearance.getSize();
    }

    @Override
    public double getMagePrayerMultiplier() {
        return 0.6;
    }

    @Override
    public double getRangePrayerMultiplier() {
        return 0.6;
    }

    @Override
    public double getMeleePrayerMultiplier() {
        return 0.6;
    }

    @Override
    public void checkMultiArea() {
        if (!started) return;
        boolean isAtMultiArea = isForceMultiArea() || World.isMultiArea(this);
        if (isAtMultiArea && !isAtMultiArea()) {
            setAtMultiArea(isAtMultiArea);
            getPackets().sendGlobalConfig(616, 1);
        } else if (!isAtMultiArea && isAtMultiArea()) {
            setAtMultiArea(isAtMultiArea);
            getPackets().sendGlobalConfig(616, 0);
        }
    }

    public void sendItemsOnDeath(Player killer) {
        if (hasRights(RanksManager.Ranks.ADMIN)) return;
        charges.die();
        auraManager.removeAura();
        CopyOnWriteArrayList<Item> containedItems = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 14; i++) {
            if (equipment.getItem(i) != null && equipment.getItem(i).getId() != -1
                && equipment.getItem(i).getAmount() != -1)
                containedItems.add(new Item(equipment.getItem(i).getId(), equipment.getItem(i).getAmount()));
        }
        for (int i = 0; i < 28; i++) {
            if (inventory.getItem(i) != null && inventory.getItem(i).getId() != -1
                && inventory.getItem(i).getAmount() != -1)
                containedItems.add(new Item(getInventory().getItem(i).getId(), getInventory().getItem(i).getAmount()));
        }
        if (containedItems.isEmpty()) return;
        int keptAmount = 3;
        if (hasSkull()) keptAmount = 0;
        if (prayer.usingPrayer(Prayer.PrayerSpell.PROTECT_ITEM, Prayer.PrayerSpell.PROTECT_ITEM_CURSE)) keptAmount++;

        CopyOnWriteArrayList<Item> keptItems = new CopyOnWriteArrayList<>();
        Item lastItem = new Item(1, 1);
        for (int i = 0; i < keptAmount; i++) {
            for (Item item : containedItems) {
                int price = PriceUtils.getPrice(item.getId());
                if (price >= PriceUtils.getPrice(lastItem.getId())) {
                    lastItem = item;
                }
            }
            keptItems.add(lastItem);
            containedItems.remove(lastItem);
            lastItem = new Item(1, 1);
        }
        inventory.reset();
        equipment.reset();
        for (Item item : keptItems) {
            getInventory().addItem(item);
        }
        for (Item item : containedItems) {
            World.addGroundItem(item, getLastWorldTile(), killer, true, 180, true);
        }
    }

    /**
     * Checks if a player can get pvp points etc from killing this player.
     * Proceeds to add the player to cooldown list if requested
     * Uses username as its unique instead of display name that might become conflicted
     */
    public boolean mayBenefitFromKilling(Player killed, boolean add) {
        if (username.equalsIgnoreCase(killed.getUsername())) return false;
        if (recentKills.containsKey(killed.getUsername())) {
            if (TimeUtils.timePassed(recentKills.get(killed.getUsername()), 180000)) {
                recentKills.remove(killed.getDisplayName());
            } else {
                if (!TimeUtils.timePassed(recentKills.get(killed.getUsername()), 600))//This is likely a second check
                    // from another source since nobody is getting killed in under one tick
                    return true;
                if (add) sendMessage("You have recently killed this player, so you got no perks");
                return false;
            }
        }
        if (add) recentKills.put(killed.getUsername(), TimeUtils.getTime());
        return true;
    }

    public void increaseKillCount(Player killed) {
        if (!mayBenefitFromKilling(killed, true)) return;
        killed.deathCount++;
        killCount++;
        getPackets().sendGameMessage(
                "<col=ff0000>You have slayed " + killed.getDisplayName() + ", you have now " + killCount
                + " kills. You receive 10 pk points.");
        pkPoints += 10;
    }

    public void sendRandomJail(Player p) {
        p.resetWalkSteps();
        switch (Utils.getRandom(6)) {
            case 0:
                p.setNextWorldTile(new WorldTile(3014, 3195, 0));
                break;
            case 1:
                p.setNextWorldTile(new WorldTile(3015, 3189, 0));
                break;
            case 2:
                p.setNextWorldTile(new WorldTile(3014, 3189, 0));
                break;
            case 3:
                p.setNextWorldTile(new WorldTile(3014, 3192, 0));
                break;
            case 4:
                p.setNextWorldTile(new WorldTile(3018, 3180, 0));
                break;
            case 5:
                p.setNextWorldTile(new WorldTile(3018, 3189, 0));
                break;
            case 6:
                p.setNextWorldTile(new WorldTile(3018, 3189, 0));
                break;
        }
    }

    /**
     * Send interface
     *
     * @param interfaceId the interfaces id
     */
    public void sendInterface(int interfaceId) {
        interfaceManager.sendInterface(interfaceId);
    }

    /**
     * Start dialogue
     *
     * @param key    dialogue name
     * @param params parameters for dialogue
     */
    public void startDialogue(String key, Object... params) {
        dialogueManager.startDialogue(key, params);
    }

    public boolean isCanPvp() {
        return canPvp;
    }

    public void setCanPvp(boolean canPvp) {
        this.canPvp = canPvp;
        appearance.generateAppearanceData();
        getPackets().sendPlayerOption(canPvp ? "Attack" : "null", 1, true);
        getPackets().sendPlayerUnderNPCPriority(canPvp);
    }

    public Prayer getPrayer() {
        return prayer;
    }

    public long getStopDelay() {
        return stopDelay;
    }

    public void setInfiniteStopDelay() {
        stopDelay = Long.MAX_VALUE;
    }

    public void resetStopDelay() {
        stopDelay = 0;
    }

    /**
     * Stop the player
     *
     * @param delay in game ticks
     */
    public void addStopDelay(int delay) {
        stopDelay = TimeUtils.getTime() + (delay * 600);
    }

    public void useStairs(int emoteId, final WorldTile dest, int useDelay, int totalDelay) {
        useStairs(emoteId, dest, useDelay, totalDelay, null);
    }

    public void useStairs(int emoteId, final WorldTile dest, int useDelay, int totalDelay, final String message) {
        stopAll();
        addStopDelay(totalDelay);
        if (emoteId != -1) setNextAnimation(new Animation(emoteId));
        if (useDelay == 0) setNextWorldTile(dest);
        else {
            WorldTasksManager.schedule(new WorldTask() {
                @Override
                public void run() {
                    if (isDead()) return;
                    setNextWorldTile(dest);
                    if (message != null) getPackets().sendGameMessage(message);
                }
            }, useDelay - 1);
        }
    }

    public Bank getBank() {
        return bank;
    }

    public ControllerManager getControllerManager() {
        return controllerManager;
    }

    public void switchMouseButtons() {
        mouseButtons = !mouseButtons;
        refreshMouseButtons();
    }

    public void switchAllowChatEffects() {
        allowChatEffects = !allowChatEffects;
        refreshAllowChatEffects();
    }

    private void refreshAllowChatEffects() {
        getPackets().sendConfig(171, allowChatEffects ? 0 : 1);
    }

    private void refreshMouseButtons() {
        getPackets().sendConfig(170, mouseButtons ? 0 : 1);
    }

    private void refreshPrivateChatSetup() {
        getPackets().sendConfig(287, privateChatSetup);
    }

    public int getPrivateChatSetup() {
        return privateChatSetup;
    }

    public void setPrivateChatSetup(int privateChatSetup) {
        this.privateChatSetup = privateChatSetup;
    }

    public boolean isForceNextMapLoadRefresh() {
        return forceNextMapLoadRefresh;
    }

    public void setForceNextMapLoadRefresh(boolean forceNextMapLoadRefresh) {
        this.forceNextMapLoadRefresh = forceNextMapLoadRefresh;
    }

    public FriendsIgnores getFriendsIgnores() {
        return friendsIgnores;
    }

    public void addPotDelay(long time) {
        potDelay = time + TimeUtils.getTime();
    }

    public long getPotDelay() {
        return potDelay;
    }

    public void addFoodDelay(long time) {
        foodDelay = time + TimeUtils.getTime();
    }

    public long getFoodDelay() {
        return foodDelay;
    }

    public long getBoneDelay() {
        return boneDelay;
    }

    public void addBoneDelay(long time) {
        boneDelay = time + TimeUtils.getTime();
    }

    public void addPoisonImmune(long time) {
        if (poisonImmune - TimeUtils.getTime() < time) poisonImmune = time + TimeUtils.getTime();
        getPoison().reset();
    }

    public long getPoisonImmune() {
        return poisonImmune;
    }

    public void addFireImmune(long time) {
        fireImmune = time + TimeUtils.getTime();
    }

    public long getFireImmune() {
        return fireImmune;
    }

    public MusicsManager getMusicsManager() {
        return musicsManager;
    }

    public HintIconsManager getHintIconsManager() {
        return hintIconsManager;
    }

    public int getLastVeng() {
        return lastVeng;
    }

    public void setLastVeng(int lastVeng) {
        this.lastVeng = lastVeng;
    }

    public void setCastVeng() {
        castedVeng = true;
    }

    public boolean hasVengCast() {
        return castedVeng;
    }

    public int getKillCount() {
        return killCount;
    }

    public int getBarrowsKillCount() {
        return barrowsKillCount;
    }

    public int setBarrowsKillCount(int barrowsKillCount) {
        return this.barrowsKillCount = barrowsKillCount;
    }

    public int getDeathCount() {
        return deathCount;
    }

    public void setCloseInterfacesEvent(Runnable closeInterfacesEvent) {
        this.closeInterfacesEvent = closeInterfacesEvent;
    }

    public long getMuted() {
        return muted;
    }

    public boolean isMuted() {
        if (muted > TimeUtils.getTime()) {
            sendMessage(
                    "You are temporarily muted. Time remaining: " + TimeUtils.formatTime(muted - TimeUtils.getTime()));
            return true;
        }
        return false;
    }

    public void setMuted(long muted) {
        this.muted = muted;
    }

    public long getJailed() {
        return jailed;
    }

    public void setJailed(long jailed) {
        this.jailed = jailed;
    }

    public boolean isPermBanned() {
        return permBanned;
    }

    public void setPermBanned(boolean permBanned) {
        this.permBanned = permBanned;
    }

    public long getBanned() {
        return banned;
    }

    public void setBanned(long banned) {
        this.banned = banned;
    }

    public ChargesManager getCharges() {
        return charges;
    }

    public boolean[] getKilledBarrowBrothers() {
        return killedBarrowBrothers;
    }

    public int getHiddenBrother() {
        return hiddenBrother;
    }

    public void setHiddenBrother(int hiddenBrother) {
        this.hiddenBrother = hiddenBrother;
    }

    public int[] getPouches() {
        return pouches;
    }

    public int getDungPoints() {
        return dungPoints;
    }

    public void setXpLocked(boolean lock) {
        lockXp = lock;
    }

    public EmotesManager getEmotesManager() {
        return emotesManager;
    }

    public PriceCheckManager getPriceCheckManager() {
        return priceCheckManager;
    }

    public DuelConfigurations getDuelConfigurations() {
        return duelConfigurations;
    }

    public DuelConfigurations setDuelConfigurations(DuelConfigurations duelConfigurations) {
        return this.duelConfigurations = duelConfigurations;
    }

    boolean isDueling() {
        return duelConfigurations != null;
    }

    public int getPestPoints() {
        return pestPoints;
    }

    boolean isUpdateMovementType() {
        return updateMovementType;
    }

    public long getLastPublicMessage() {
        return lastPublicMessage;
    }

    public void setLastPublicMessage(long lastPublicMessage) {
        this.lastPublicMessage = lastPublicMessage;
    }

    public CutscenesManager getCutscenesManager() {
        return cutscenesManager;
    }

    public void kickPlayerFromFriendsChannel(String name) {
        if (currentFriendChat == null) return;
        currentFriendChat.kickPlayerFromChat(this, name);
    }

    public void sendFriendsChannelMessage(String message) {
        if (currentFriendChat == null) return;
        currentFriendChat.sendMessage(this, message);
    }

    public void sendFriendsChannelQuickMessage(QuickChatMessage message) {
        if (currentFriendChat == null) return;
        currentFriendChat.sendQuickMessage(this, message);
    }

    public void sendPublicChatMessage(PublicChatMessage message) {
        for (int regionId : getMapRegionsIds()) {
            List<Integer> playersIndexes = World.getRegion(regionId).getPlayerIndexes();
            if (playersIndexes == null) continue;
            for (Integer playerIndex : playersIndexes) {
                Player p = World.getPlayers().get(playerIndex);
                if (p == null || !p.hasStarted() || p.hasFinished()
                    || p.getLocalPlayerUpdate().getLocalPlayers()[getIndex()] == null) continue;
                p.getPackets().sendPublicMessage(this, message);
            }
        }
    }

    public int[] getCompletionistCapeCustomized() {
        return completionistCapeCustomized;
    }

    public void setCompletionistCapeCustomized(int[] skillcapeCustomized) {
        this.completionistCapeCustomized = skillcapeCustomized;
    }

    public int[] getMaxedCapeCustomized() {
        return maxedCapeCustomized;
    }

    public void setMaxedCapeCustomized(int[] maxedCapeCustomized) {
        this.maxedCapeCustomized = maxedCapeCustomized;
    }

    public boolean withinDistance(Player tile) {
        if (cutscenesManager.hasCutscene()) return getMapRegionsIds().contains(tile.getRegionId());
        else {
            return tile.getPlane() == getPlane() && Math.abs(tile.getX() - getX()) <= 14
                   && Math.abs(tile.getY() - getY()) <= 14;
        }
    }

    int getSkullId() {
        return skullId;
    }

    public boolean isFilterGame() {
        return filterGame;
    }

    public void addLogicPacketToQueue(LogicPacket packet) {
        for (LogicPacket p : logicPackets) {
            if (p.getId() == packet.getId()) {
                logicPackets.remove(p);
                break;
            }
        }
        logicPackets.add(packet);
    }

    public String getSalt() {
        return salt;
    }

    public int getOverloadDelay() {
        return overloadDelay;
    }

    public void setOverloadDelay(int overloadDelay) {
        this.overloadDelay = overloadDelay;
    }

    /**
     * Set renewal delay (time till renewal ends and when to add effects
     *
     * @param delay the delay to set
     */
    public void setRenewalDelay(int delay) {
        renewalDelay = delay;
    }

    public Trade getTrade() {
        return trade;
    }

    public Trade setTrade(Trade trade) {
        return this.trade = trade;
    }

    public long getTeleBlockDelay() {
        Long teleblock = (Long) getTemporaryAttributes().get("TeleBlocked");
        if (teleblock == null) return 0;
        return teleblock;
    }

    public void setTeleBlockDelay(long teleDelay) {
        getTemporaryAttributes().put("TeleBlocked", teleDelay + TimeUtils.getTime());
    }

    public long getPrayerDelay() {
        Long teleblock = (Long) getTemporaryAttributes().get("PrayerBlocked");
        if (teleblock == null) return 0;
        return teleblock;
    }

    public void setPrayerDelay(long teleDelay) {
        getTemporaryAttributes().put("PrayerBlocked", teleDelay + TimeUtils.getTime());
        prayer.closeAllPrayers();
    }

    public FollowerManager getFollowerManager() {
        return followerManager;
    }

    public FriendChatsManager getCurrentFriendChat() {
        return currentFriendChat;
    }

    public void setCurrentFriendChat(FriendChatsManager currentFriendChat) {
        this.currentFriendChat = currentFriendChat;
    }

    public String getCurrentFriendChatOwner() {
        return currentFriendChatOwner;
    }

    public void setCurrentFriendChatOwner(String currentFriendChatOwner) {
        this.currentFriendChatOwner = currentFriendChatOwner;
    }

    public int getSummoningLeftClickOption() {
        return summoningLeftClickOption;
    }

    public void setSummoningLeftClickOption(int summoningLeftClickOption) {
        this.summoningLeftClickOption = summoningLeftClickOption;
    }

    public int getTrapAmount() {
        return trapAmount;
    }

    public void setTrapAmount(int trapAmount) {
        this.trapAmount = trapAmount;
    }

    public long getSolDelay() {
        return solDelay;
    }

    public void setSolDelay(long delay) {
        this.solDelay = delay;
    }

    public void addSolDelay(long delay) {
        solDelay = delay + TimeUtils.getTime();
    }

    public List<Integer> getSwitchItemCache() {
        return switchItemCache;
    }

    public AuraManager getAuraManager() {
        return auraManager;
    }

    public int getMovementType() {
        if (getTemporaryMoveType() != -1) return getTemporaryMoveType();
        return isRunning() ? RUN_MOVE_TYPE : WALK_MOVE_TYPE;
    }

    List<String> getOwnedObjectManagerKeys() {
        if (ownedObjectsManagerKeys == null) // temporary
            ownedObjectsManagerKeys = new LinkedList<>();
        return ownedObjectsManagerKeys;
    }

    public ClanWars getClanWars() {
        return clanWars;
    }

    public ClanWars setClanWars(ClanWars clanWars) {
        return this.clanWars = clanWars;
    }

    /**
     * Cure the player off everything
     */
    public void cureAll() {
        heal(getMaxHitPoints() - getHealth());
        getPoison().reset();
        getSkills().restoreSkills();
        getPrayer().reset();
        sendMessage("You have been fully healed.");
    }

    public void setDisableEquip(boolean equip) {
        disableEquip = equip;
    }

    public boolean isEquipDisabled() {
        return disableEquip;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public War getOwnedWar() {
        return (getCurrentFriendChatOwner() != null && getCurrentFriendChatOwner().equalsIgnoreCase(getUsername())
                && getCurrentFriendChat().getWar() != null) ? getCurrentFriendChat().getWar() : null;
    }

    public long getFireImmuneLeft() {
        if (getFireImmune() > TimeUtils.getTime()) {
            return getFireImmune() - TimeUtils.getTime();
        } else return 0;
    }

    public long getPoisonImmuneLeft() {
        if (poisonImmune > TimeUtils.getTime()) {
            return poisonImmune - TimeUtils.getTime();
        } else return 0;
    }

    public double getDonationAmount() {
        return donationAmount;
    }

    public House getHouse() {
        return house;
    }

    public BossKillCounter getBossCounter() {
        return bossCounter;
    }

    public CoopSlayer getCoopSlayer() {
        return coopSlayer;
    }

    public SlayerTask getTask() {
        return task;
    }

    public Farming getFarming() {
        return farming;
    }

    public void setTask(SlayerTask task) {
        this.task = task;
    }

    public boolean isAllowBossTasks() {
        return allowBossTasks;
    }

    public void toggleBossTasks() {
        allowBossTasks = !allowBossTasks;
    }

    public boolean isLockXp() {
        return lockXp;
    }

    public void addDungPoints(int i) {
        dungPoints += i;
    }

    public int getServerPoints() {
        return serverPoints;
    }

    public void addServerPoints(int i) {
        serverPoints += i;
    }

    public void addSlayerPoints(int i) {
        slayerPoints += i;
    }

    void addLoyaltyPoints(int i) {
        loyaltyPoints += i;
    }

    public int getSlayerPoints() {
        return slayerPoints;
    }

    public void setSlayerPoints(int slayerPoints) {
        this.slayerPoints = slayerPoints;
    }

    private long lastGWDAltar;

    public void useGwdAltar() {
        lastGWDAltar = TimeUtils.getTime();
        Prayer.useAltar(this);
    }

    public boolean canGwdAltar() {
        return TimeUtils.getTime() - lastGWDAltar > 10 * 60 * 1000;
    }

    public void setChatType(int chatType) {
        this.chatType = chatType;
    }

    public int getChatType() {
        return chatType;
    }

    /**
     * @return Is this player stopped
     */
    public boolean hasStopDelay() {
        return stopDelay > TimeUtils.getTime();
    }

    /**
     * Set the rank of this player
     */
    public void setRank(RanksManager.Ranks rank) {
        this.playerRank = rank;
    }

    public void addPkPoints(int amount) {
        pkPoints += amount;
    }

    public Follower getFollower() {
        return followerManager.getFollower();
    }

    public ServerPanelManager getServerPanelManager() {
        return serverPanelManager;
    }

    public QuestManager getQuestManager() {
        return questManager;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Player) return ((Player) obj).getUsername().equalsIgnoreCase(username);
        return super.equals(obj);
    }
}
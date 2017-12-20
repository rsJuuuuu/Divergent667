package com.rs;

import com.rs.game.player.Player;
import com.rs.game.player.info.RanksManager;
import com.rs.game.world.WorldTile;

import java.math.BigInteger;

public final class Settings {

    /**
     * Server Settings
     */
    public static final String SERVER_NAME = "Divergent";
    public static final String CACHE_PATH = "data/cache/";
    public static final String DATA_PATH = "data/";

    public static final int PORT_ID = 43594;
    public static final int RECEIVE_DATA_LIMIT = 7500;
    public static final int PACKET_SIZE_LIMIT = 7500;
    public static final int CLIENT_BUILD = 667;
    public static final int CUSTOM_CLIENT_BUILD = 1;
    public static final int PLAYERS_LIMIT = 2000;
    public static final int MAX_LOGINS_FROM_SAME_IP = 5;
    public static final int NPCS_LIMIT = Short.MAX_VALUE;
    public static final int LOCAL_NPCS_LIMIT = 1000;

    public static final boolean DISABLE_RSA = false;

    static final int MIN_FREE_MEM_ALLOWED = 30000000; // 30mb

    public static boolean DEBUG = true;

    /**
     * Edit these to change owners or developers
     */
    private static final String[] OWNERS = {"Owner"};
    private static final String[] DEVELOPERS = {"Dev"};

    public static final RanksManager.Ranks DEFAULT_RANK = RanksManager.Ranks.ADMIN;

    public static boolean isOwner(Player player) {
        for (String name : OWNERS)
            if (name.equalsIgnoreCase(player.getUsername())) return true;
        return false;
    }

    public static boolean isDeveloper(Player player) {
        for (String name : DEVELOPERS)
            if (name.equalsIgnoreCase(player.getUsername())) return true;
        return false;
    }

    public static final String[] NEWS = {"Please use ::commands or ::cmd to see the commands!",
            "Divergent is open source! Feel free to contribute at github", "If you find a bug, please report it at github."};

    /**
     * Server points
     */
    public static final int COMBAT_SERVER_POINTS = 200;
    public static final int SLAYER_SERVER_POINTS = 1000;

    /**
     * World settings
     */
    public static final int START_PLAYER_HITPOINTS = 100;
    public static final int WORLD_CYCLE_TIME = 600;
    public static final int SKILLING_XP_RATE = 20;
    public static final int COMBAT_XP_RATE = 35;
    public static final int MINIMUN_TRADE_TOTAL = 250;
    public static final int AIR_GUITAR_MUSICS_COUNT = 50;

    public static final double MAXIMUM_EXP = 200000000;
    public static final double STORE_SELL_MODIFIER = 0.3; //30% price for stores

    public static final long MAX_DECODER_PING_DELAY = 30000; // 30seconds

    /**
     * Spawn locations
     */
    public static final WorldTile START_PLAYER_LOCATION = new WorldTile(3087, 3501, 0);
    public static final WorldTile RESPAWN_PLAYER_LOCATION = new WorldTile(3101, 3494, 0);

    public static final String START_CONTROLLER = "StartTutorial";

    public static String[] DONATOR_ITEMS = {};

    /**
     * Constants
     */
    public static final int[] MAP_SIZES = {104, 120, 136, 168};
    public static final int[] GRAB_SERVER_KEYS = {1362, 77448, 44880, 39771, 24563, 363672, 44375, 0, 1614, 0, 5340,
            142976, 741080, 188204, 358294, 416732, 828327, 19517, 22963, 16769, 1244, 11976, 10, 15, 119, 817677,
            1624243};

    public static final BigInteger RSA_MODULUS = new BigInteger
            ("136914452720818738030866974552169510443780002195079066555932963918466900652770700656048535639467254948516578349788331766300501508423540632545649163609036476487799518885938398419700572373453656688641593612122959051281142073284847561395615425637341568986022676889601947424751842962049243156853076006911344463147");

    public static final BigInteger RSA_EXPONENT = new BigInteger
            ("13771458448443430750560371946349411978659349290781714248999955721966733434595182243994567144290525117424070135676101789881332772991256539813249298663514782460990167383046917344365918137372982571516555656061976092215647313526526644753477532352622056441142720798077755436546830504222220547058838300554313975809");

}

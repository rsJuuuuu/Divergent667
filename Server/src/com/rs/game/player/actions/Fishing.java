package com.rs.game.player.actions;

import com.rs.game.npc.Npc;
import com.rs.game.world.Animation;
import com.rs.game.world.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.npc.FishingSpotsHandler;
import com.rs.utils.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Handles the fishing.
 *
 * @author Raghav/Own4g3.
 */
public class Fishing extends Action {

    public enum Fish {
        ANCHOVIES(321, 15, 40),
        BASS(363, 46, 100),
        COD(341, 23, 45),
        CAVE_FISH(15264, 85, 300),
        HERRING(345, 10, 30),
        LOBSTER(377, 40, 90),
        MACKEREL(353, 16, 20),
        MANTA(389, 81, 46),
        MONKFISH(7944, 62, 120),
        PIKE(349, 25, 60),
        SALMON(331, 30, 70),
        SARDINES(327, 5, 20),
        SEA_TURTLE(395, 79, 38),
        SEAWEED(401, 30, 0),
        OYSTER(407, 30, 0),
        SHARK(383, 76, 110),
        SHRIMP(317, 1, 10),
        SWORDFISH(371, 50, 100),
        TROUT(335, 20, 50),
        TUNA(359, 35, 80);

        private final int id, level, xp;

        Fish(int id, int level, int xp) {
            this.id = id;
            this.level = level;
            this.xp = xp;
        }

        public int getId() {
            return id;
        }

        public int getLevel() {
            return level;
        }

        public double getXp() {
            return xp;
        }
    }

    private static final int[] HARPOON = {311, 10129};

    private static final int ROD = 307, NET = 303, BIG_NET = 305, FLY_FISHIGN_ROD = 309, LOBSTER_POT = 301,
            FISHIGN_BITE = 313, FEATHER = 314;

    private static final Animation ROD_FISHING = new Animation(623), FLY_FISHIGN = new Animation(622),
            LOBSTER_FISHING = new Animation(619), HARPOON_FISHING = new Animation(618), NET_FISHING = new Animation
            (621), BIG_NET_FISHING = new Animation(620);

    public enum FishingSpots {
        BAIT(new int[]{327, 323}, 2, ROD, FISHIGN_BITE, ROD_FISHING, Fish.SARDINES, Fish.HERRING),
        NET_1(new int[]{327, 323}, 1, NET, -1, NET_FISHING, Fish.SHRIMP, Fish.ANCHOVIES),
        LURE_1(new int[]{328, 329}, 1, FLY_FISHIGN_ROD, FEATHER, FLY_FISHIGN, Fish.TROUT, Fish.SALMON),
        BAIT_2(new int[]{328}, 2, ROD, FISHIGN_BITE, ROD_FISHING, Fish.PIKE),
        BAIT2_2(new int[]{329}, 2, ROD, FISHIGN_BITE, ROD_FISHING, Fish.PIKE, Fish.CAVE_FISH),
        CAGE_1(new int[]{6267, 312, 324}, 1, LOBSTER_POT, -1, LOBSTER_FISHING, Fish.LOBSTER),
        HARPOON_SPOT_2(new int[]{324}, 2, HARPOON, -1, HARPOON_FISHING, Fish.TUNA, Fish.SWORDFISH),
        HARPOON_SPOT_SHARK_1(new int[]{952}, 1, HARPOON, -1, HARPOON_FISHING, Fish.TUNA, Fish.SWORDFISH, Fish.SHARK),
        HARPOON_SPOT_SHARK_2(new int[]{312, 313}, 2, HARPOON, -1, HARPOON_FISHING, Fish.TUNA, Fish.SWORDFISH, Fish
                .SHARK),
        BIG_NET_1(new int[]{313}, 1, BIG_NET, -1, BIG_NET_FISHING, Fish.MACKEREL, Fish.COD, Fish.BASS, Fish.SEAWEED,
                Fish.OYSTER),
        BIG_NET_2(new int[]{952}, 2, BIG_NET, -1, BIG_NET_FISHING, Fish.MONKFISH);

        private final Fish[] fish;
        private final int[] ids, tools;
        private final int option, bait;
        private final Animation animation;

        static final Map<Integer, FishingSpots> spot = new HashMap<>();

        public static FishingSpots forId(int id) {
            return spot.get(id);
        }

        static {
            for (FishingSpots spots : FishingSpots.values())
                for (int id : spots.getIds()) {
                    spot.put(id | spots.option << 24, spots);
                }
        }

        FishingSpots(int[] ids, int option, int tool, int bait, Animation animation, Fish... fish) {
            this(ids, option, new int[]{tool}, bait, animation, fish);
        }

        FishingSpots(int[] ids, int option, int[] tools, int bait, Animation animation, Fish... fish) {
            this.ids = ids;
            this.tools = tools;
            this.bait = bait;
            this.animation = animation;
            this.fish = fish;
            this.option = option;
        }

        public Fish[] getFish() {
            return fish;
        }

        public int[] getIds() {
            return ids;
        }

        public int getOption() {
            return option;
        }

        public int[] getTools() {
            return tools;
        }

        public int getBait() {
            return bait;
        }

        public Animation getAnimation() {
            return animation;
        }
    }

    /**
     * The fishing spot, where the player is fishing.
     */
    private FishingSpots spot;

    /**
     * The npc, fishing spot is an npc.
     */
    private Npc npc;
    private WorldTile tile;
    /**
     * The fish id.
     */
    private int fishId;

    /**
     *
     */
    private final int[] BONUS_FISH = {341, 349, 401, 407};

    /**
     * If a player is capable to catch 2 fishes.
     */
    private boolean multipleCatch;

    /**
     * Constructs a new {@code Fishing} {@code Object}.
     *
     * @param spot The fishing spot.
     * @param npc  The fishing npc.
     */
    public Fishing(FishingSpots spot, Npc npc) {
        this.spot = spot;
        this.npc = npc;
        tile = new WorldTile(npc);
    }

    @Override
    public boolean start(Player player) {
        if (!checkAll(player)) return false;
        fishId = getRandomFish(player);
        if (spot.getFish()[fishId] == Fish.TUNA || spot.getFish()[fishId] == Fish.SHARK
            || spot.getFish()[fishId] == Fish.SWORDFISH) {
            if (Utils.getRandom(50) <= 5) {
                if (player.getSkills().getLevel(Skills.AGILITY) >= spot.getFish()[fishId].getLevel())
                    multipleCatch = true;
            }
        }
        player.getPackets().sendGameMessage("You attempt to capture a fish...");
        setActionDelay(player, getFishingDelay(player));
        return true;
    }

    @Override
    public boolean process(Player player) {
        player.setNextAnimation(spot.getAnimation());
        return checkAll(player);
    }

    /**
     * Gets the fishing delay.
     *
     * @param player The player.
     * @return Delay
     */
    private int getFishingDelay(Player player) {
        int playerLevel = player.getSkills().getLevel(Skills.FISHING);
        int fishLevel = spot.getFish()[fishId].getLevel();
        int modifier = spot.getFish()[fishId].getLevel();
        int randomAmt = Utils.random(4);
        double cycleCount = 1, otherBonus = 0;
        if (player.getFollower() != null) otherBonus = getSpecialFamiliarBonus(player.getFollower().getId());
        cycleCount = Math.ceil(((fishLevel + otherBonus) * 50 - playerLevel * 10) / modifier * 0.25 - randomAmt * 4);
        if (cycleCount < 1) {
            cycleCount = 1;
        }
        int delay = (int) cycleCount + 1;
        delay /= player.getAuraManager().getFishingAccurayMultiplier();
        return delay;

    }

    private int getSpecialFamiliarBonus(int id) {
        switch (id) {
            case 6796:
            case 6795:// rock crab
                return 1;
        }
        return -1;
    }

    /**
     * Gets the random fish.
     *
     * @param player The player
     * @return Random fish index.
     */
    private int getRandomFish(Player player) {
        int random = Utils.random(spot.getFish().length);
        int difference = player.getSkills().getLevel(Skills.FISHING) - spot.getFish()[random].getLevel();
        if (difference < -1) return 0;
        if (random < -1) return 0;
        return random;
    }

    @Override
    public int processWithDelay(Player player) {
        addFish(player);
        return getFishingDelay(player);
    }

    /**
     * Adds the fish in player's inventory and give exp.
     *
     * @param player The player.
     */
    private void addFish(Player player) {
        Item fish = new Item(spot.getFish()[fishId].getId(), multipleCatch ? 2 : 1);
        player.getPackets().sendGameMessage(getMessage(fish));
        player.getInventory().deleteItem(spot.getBait(), 1);
        player.getSkills().addXp(Skills.FISHING, spot.getFish()[fishId].getXp());
        player.getInventory().addItem(fish);
        if (player.getFollower() != null) {
            if (Utils.getRandom(50) == 0 && getSpecialFamiliarBonus(player.getFollower().getId()) > 0) {
                player.getInventory().addItem(new Item(BONUS_FISH[Utils.getRandom(BONUS_FISH.length)]));
                player.getSkills().addXp(Skills.FISHING, 5.5);
            }
        }
        fishId = getRandomFish(player);
        if (Utils.getRandom(50) == 0 && FishingSpotsHandler.moveSpot(npc)) player.setNextAnimation(new Animation(-1));
    }

    /**
     * Get's the message.
     *
     * @param fish The fish catch player is getting.
     * @return Message
     */
    private String getMessage(Item fish) {
        if (spot.getFish()[fishId] == Fish.ANCHOVIES || spot.getFish()[fishId] == Fish.SHRIMP)
            return "You manage to catch some " + fish.getDefinitions().getName().toLowerCase() + ".";
        else if (multipleCatch)
            return "Your quick reactions allow you to catch two " + fish.getDefinitions().getName().toLowerCase() + ".";
        else return "You manage to catch a " + fish.getDefinitions().getName().toLowerCase() + ".";
    }

    private boolean checkAll(Player player) {
        if (player.getSkills().getLevel(Skills.FISHING) < spot.getFish()[fishId].getLevel()) {
            player.getDialogueManager().startDialogue("SimpleMessage",
                    "You need a fishing level of " + spot.getFish()[fishId].getLevel() + " to fish here.");
            return false;
        }
        if (!player.getInventory().containsOneItem(spot.getTools())) {
            player.getPackets().sendGameMessage(
                    "You need a " + new Item(spot.getTools()[0]).getDefinitions().getName().toLowerCase()
                    + " to fish here.");
            return false;
        }
        if (!player.getInventory().containsOneItem(spot.getBait()) && spot.getBait() != -1) {
            player.getPackets().sendGameMessage(
                    "You don't have " + new Item(spot.getBait()).getDefinitions().getName().toLowerCase()
                    + " to fish here.");
            return false;
        }
        if (!player.getInventory().hasFreeSlots()) {
            player.setNextAnimation(new Animation(-1));
            player.getDialogueManager().startDialogue("SimpleMessage", "You don't have enough inventory space.");
            return false;
        }
        return !(tile.getX() != npc.getX() || tile.getY() != npc.getY());
    }

    @Override
    public void stop(Player player) {
    }
}

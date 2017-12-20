package com.rs.game.player.actions;

import com.rs.game.world.Animation;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.player.OwnedObjectManager;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handles hunter related stuff.
 *
 * @author Raghav/Own4g3
 */
public class Hunter extends Action {

    // 19192 - dismantle box

    /**
     * Huntable NPCs
     *
     * @author Raghav/Own4g3
     */
    public enum HunterNPC {

        CARNIVOROUS_CHINCHOMPA(5080, 10034, 63, 265, HunterEquipment.BOX, 28558), FERRT(
                5081, 10092, 27, 115, HunterEquipment.BOX, 19189), GECKO(6916,
                12184, 27, 100, HunterEquipment.BOX, 19190), RACCOON(7272,
                12487, 27, 100, HunterEquipment.BOX, 19191), MONKEY(6942,
                12201, 27, 100, HunterEquipment.BOX, 28557), CRIMSON_SWIFT(
                5073, 10088, 1, 34, HunterEquipment.BIRD_SNARE, 19180), GOLDEN_WARBLER(
                5075, 1583, 5, 48, HunterEquipment.BIRD_SNARE, 19184), COPPER_LONGTAIL(
                5076, 10091, 9, 61, HunterEquipment.BIRD_SNARE, 19186), CERULEAN_TWITCH(
                5074, 10089, 11, 64.67, HunterEquipment.BIRD_SNARE, 19182), TROPICAL_WAGTAIL(
                5072, 10087, 19, 95.2, HunterEquipment.BIRD_SNARE, 19178), WIMPY_BIRD(
                7031, 11525, 39, 167, HunterEquipment.BIRD_SNARE, 28930);

        private int npcId, level, item, transformObjectId;
        private double xp;
        private HunterEquipment hunter;

        static final Map<Integer, HunterNPC> npc = new HashMap<>();
        static final Map<Integer, HunterNPC> object = new HashMap<>();

        public static HunterNPC forId(int id) {
            return npc.get(id);
        }

        static {
            for (HunterNPC npcs : HunterNPC.values())
                npc.put(npcs.npcId, npcs);
            for (HunterNPC objets : HunterNPC.values())
                object.put(objets.transformObjectId, objets);
        }

        public static HunterNPC forObjectId(int id) {
            return object.get(id);
        }

        HunterNPC(int npcId, int item, int level, double xp,
                  HunterEquipment hunter, int transformObjectId) {
            this.npcId = npcId;
            this.item = item;
            this.level = level;
            this.xp = xp;
            this.hunter = hunter;
            this.transformObjectId = transformObjectId;
        }

        public int getLevel() {
            return level;
        }

        public int getNpcId() {
            return npcId;
        }

        public double getXp() {
            return xp;
        }

        public int getItem() {
            return item;
        }

        public HunterEquipment getEquipment() {
            return hunter;
        }

        public int getTransformObjectId() {
            return transformObjectId;
        }
    }

    /**
     * Enum for hunter's equipment.
     *
     * @author Raghav/Own4g3
     */
    public enum HunterEquipment {

        BOX(10008, 19187, new Animation(5208), 27), BIRD_SNARE(10006, 19175,
                new Animation(5207), 1);

        private int itemId, objectId, baseLevel;
        private Animation pickUpAnimation;

        HunterEquipment(int itemId, int objectId,
                        Animation pickUpAnimation, int baseLevel) {
            this.itemId = itemId;
            this.objectId = objectId;
            this.pickUpAnimation = pickUpAnimation;
            this.baseLevel = baseLevel;
        }

        public int getId() {
            return itemId;
        }

        public int getObjectId() {
            return objectId;
        }

        public Animation getPickUpAnimation() {
            return pickUpAnimation;
        }

        public int getBaseLevel() {
            return baseLevel;
        }
    }

    /**
     * Hunter's equipment.
     */
    private HunterEquipment hunt;

    /**
     * Gets the amount of traps a player can set.
     *
     * @param player The player.
     * @return Trap amount.
     */
    public int getTrapAmount(Player player) {
        int level = 20;
        int trapAmount = 2;
        for (int i = 0; i <= 2; i++) {
            if (player.getSkills().getLevel(Skills.HUNTER) >= level) {
                trapAmount++;
                level += 20;
            }
        }
        return trapAmount;
    }

    /**
     * Constructs a new {@code Fishing} {@code Object}.
     *
     * @param hunt The hunter's equipment.
     */
    public Hunter(HunterEquipment hunt) {
        this.hunt = hunt;
    }

    @Override
    public boolean start(Player player) {
        if (!checkAll(player))
            return false;
        player.getPackets().sendGameMessage("You start setting up the trap..");
        player.setNextAnimation(new Animation(5208));
        player.addStopDelay(3);
        setActionDelay(player, 2);
        return true;
    }

    @Override
    public boolean process(Player player) {
        return true;
    }

    @Override
    public int processWithDelay(Player player) {
        if (!player.addWalkSteps(player.getX() - 1, player.getY(), 1))
            if (!player.addWalkSteps(player.getX() + 1, player.getY(), 1))
                if (!player.addWalkSteps(player.getX(), player.getY() + 1, 1))
                    player.addWalkSteps(player.getX(), player.getY() - 1, 1);
        player.getInventory().deleteItem(hunt.getId(), 1);
        player.setTrapAmount(player.getTrapAmount() + 1);
        OwnedObjectManager.addOwnedObjectManager(player,
                new WorldObject[]{new WorldObject(hunt.getObjectId(), 10, 0,
                        player.getX(), player.getY(), player.getPlane())},
                600000);
        return -1;
    }

    @Override
    public void stop(Player player) {
        setActionDelay(player, 3);
    }

    private boolean checkAll(Player player) {
        if (player.getSkills().getLevel(Skills.HUNTER) < hunt.getBaseLevel()) {
            player.getDialogueManager().startDialogue(
                    "SimpleMessage",
                    "You need a Hunter level of " + hunt.getBaseLevel()
                            + " to use this.");
            return false;
        }
        if (player.getTrapAmount() == getTrapAmount(player)) {
            player.getPackets().sendGameMessage(
                    "You can't setup more than " + player.getTrapAmount()
                            + " traps.");
            return false;
        }
        List<WorldObject> objects = World.getRegion(player.getRegionId())
                .getSpawnedObjects();
        if (objects != null) {
            for (WorldObject object : objects) {
                if (object.getX() == player.getX()
                        && object.getY() == player.getY()
                        && object.getPlane() == player.getPlane()) {
                    player.getPackets().sendGameMessage(
                            "You can't setup your trap here.");
                    return false;
                }
            }
        }
        return true;
    }
}
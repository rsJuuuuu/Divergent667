package com.rs.game.player.content.skills;

import com.rs.game.npc.Npc;
import com.rs.game.world.Animation;
import com.rs.game.world.ForceTalk;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.List;

/**
 * Handles the Thieving Skill
 *
 * @author Dragonkk
 */
public class Thieving {

    public enum Stalls {
        VEGETABAL(4706, 2, new int[]{1957, 1965, 1942, 1982, 1550}, 1, 2, 10, 34381),
        CAKE(34384, 5, new int[]{1891, 1897, 2309}, 1, 2.5, 16, 34381),
        CRAFTING(4874, 5, new int[]{1755, 1592, 1597}, 1, 7, 16, 34381),
        MONKEY_FOOD(4875, 5, new int[]{1963}, 1, 7, 16, 34381),
        MONKEY_GENERAL(6573, 5, new int[]{1931, 2347, 590}, 1, 7, 16, 34381),
        TEA_STALL(6574, 5, new int[]{712}, 1, 7, 16, 34381),
        SILK_STALL(34383, 20, new int[]{950}, 1, 8, 24, 34381),
        WINE_STALL(14011, 22, new int[]{1937, 1993, 1987, 1935, 7919}, 1, 16, 27, 2046),
        SEED_STALL(7053, 27, new int[]{5096, 5097, 5098, 5099, 5100, 5101, 5102, 5103, 5105}, 30, 11, 10, 2047),
        FUR_STALL(34387, 35, new int[]{6814, 958}, 1, 15, 36, 34381),
        FISH_STALL(4707, 42, new int[]{331, 359, 377}, 1, 16, 42, 34381),
        CROSSBOW_STALL(17031, 49, new int[]{877, 9420, 9440}, 1, 11, 52, 34381),
        SILVER_STALL(34382, 50, new int[]{442}, 1, 30, 54, 34381),
        SPICE_STALL(34386, 65, new int[]{2007}, 1, 80, 81, 34381),
        MAGIC_STALL(4877, 65, new int[]{556, 557, 554, 555, 563}, 30, 80, 100, 34381),
        SCIMITAR_STALL(4878, 65, new int[]{1323}, 1, 80, 100, 34381),
        GEM_STALL(34385, 75, new int[]{1623, 1621, 1619, 1617}, 1, 180, 16, 34381);

        private int[] item;
        private int level;
        private int amount;
        private int objectId;
        private int replaceObject;
        private double experience;
        private double seconds;

        Stalls(int objectId, int level, int[] item, int amount, double seconds, double experience, int replaceObject) {
            this.objectId = objectId;
            this.level = level;
            this.item = item;
            this.amount = amount;
            this.seconds = seconds;
            this.experience = experience;
            this.replaceObject = replaceObject;
        }

        public int getReplaceObject() {
            return replaceObject;
        }

        public int getObjectId() {
            return objectId;
        }

        public int getItem(int count) {
            return item[count];
        }

        public int getAmount() {
            return amount;
        }

        public int getLevel() {
            return level;
        }

        public double getTime() {
            return seconds;
        }

        public double getExperience() {
            return experience;
        }
    }

    public static boolean isGuard(int npcId) {
        return npcId == 32 || npcId == 21 || npcId == 2256 || npcId == 23;
    }

    public static void handleStalls(final Player player, final WorldObject object) {
        if (player.getAttackedBy() != null && player.getAttackedByDelay() > TimeUtils.getTime()) {
            player.getPackets().sendGameMessage("You can't do this while you're under combat.");
            return;
        }
        for (final Stalls stall : Stalls.values()) {
            if (stall.getObjectId() == object.getId()) {
                final WorldObject emptyStall = new WorldObject(stall.getReplaceObject(), 10, object.getRotation(),
                        object.getX(), object.getY(), object.getPlane());
                if (player.getSkills().getLevel(Skills.THIEVING) < stall.getLevel()) {
                    player.getPackets().sendGameMessage("You need a thieving level of " + stall.getLevel() + " to " +
                            "steal from this.", true);
                    return;
                }
                if (player.getInventory().getFreeSlots() <= 0) {
                    player.getPackets().sendGameMessage("Not enough space in your inventory.", true);
                    return;
                }

                player.setNextAnimation(new Animation(881));
                player.addStopDelay(2);
                WorldTasksManager.schedule(new WorldTask() {
                    boolean gaveItems;

                    @Override
                    public void run() {
                        // prevents multiempty stall spawn if many ppl using
                        // same spot and also checks if stall there still
                        if (!World.getRegion(object.getRegionId()).containsObject(object.getId(), object)) {
                            stop();
                            return;
                        }
                        if (!gaveItems) {
                            player.getInventory().addItem(stall.getItem(Utils.getRandom(stall.item.length - 1)),
                                    Utils.getRandom(stall.getAmount()) + 1);
                            player.getSkills().addXp(Skills.THIEVING, stall.getExperience());
                            gaveItems = true;
                            checkGuards(player);
                        } else {
                            World.spawnTemporaryObject(emptyStall, (int) (1500 * stall.getTime()));
                            stop();
                        }
                    }
                }, 0, 0);
            }
        }
    }

    public static void checkGuards(Player player) {
        Npc guard = null;
        int lastDistance = -1;
        for (int regionId : player.getMapRegionsIds()) {
            List<Integer> npcIndexes = World.getRegion(regionId).getNPCsIndexes();
            if (npcIndexes == null) continue;
            for (int npcIndex : npcIndexes) {
                Npc npc = World.getNPCs().get(npcIndex);
                if (npc == null) continue;
                if (!isGuard(npc.getId()) || npc.isUnderCombat() || npc.isDead() || !npc.withinDistance(player, 4) ||
                        !npc.clippedProjectile(player, true))
                    continue;
                int distance = Utils.getDistance(npc.getX(), npc.getY(), player.getX(), player.getY());
                if (lastDistance == -1 || lastDistance > distance) {
                    guard = npc;
                    lastDistance = distance;
                }
            }
        }
        if (guard != null) {
            guard.setNextForceTalk(new ForceTalk("Hey, what do you think you are doing!"));
            guard.setTarget(player);
        }
    }

}

package com.rs.game.player.content.skills.agility;

import com.rs.cores.CoresManager;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.world.Animation;
import com.rs.game.world.ForceMovement;
import com.rs.game.world.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.actionHandling.Handler;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

import java.util.concurrent.TimeUnit;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_1;
import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerObjectAction;

/**
 * Created by Peng on 29.10.2016.
 */
public class Obstacles implements Handler {

    private interface ObstacleAction {
        /**
         * @return if started successfully and can proceed with obstacle
         */
        boolean execute(Player player);
    }

    enum Obstacle {
        GNOME_LOG(2295, 1, 7.5, 6, 155, player -> startLog(player, 2474, 3429), Obstacles::stopLog),
        GNOME_CLIMB_NET(2285, 1, 7.5, 1, -1, player -> startClimbNet(player, -1, 3426, -1, 3424, 1), null),
        GNOME_TREE_BRANCH(35970, 1, 5, 1, -1, player -> startTree(player, 2473, 3420, 2, "...to the platform above.")
                , null),
        GNOME_ROPE(2312, 1, 7.5, 5, 155, player -> startRope(player, 2477, 3420, 2483, 3420), null),
        GNOME_ROPE_BACK(4059, 1, 7.5, 5, 155, player -> startRope(player, 2483, 3420, 2477, 3420), null),
        GNOME_TREE_DOWN(2314, 1, 5, 1, -1, player -> startTree(player, 2485, 3419, 0, "...to the ground."), null),
        GNOME_NET(2286, 1, 7.5, 1, -1, player -> startClimbNet(player, -1, 3425, -1, 3427, 0), null),
        GNOME_PIPE(new int[]{43544, 43543}, 1, 7.5, 8, 295, player -> startPipe(player, -1, 3433,
                player.getX() > 2485 ? 2487 : 2483, 3437), null),
        GNOME_ADVANCED_TREE(43528, 85, 25, 0, -1, player -> startTree(player, 2473, 3420, 3,
                "...to the platform above" + "."), null),
        GNOME_SIGN(43581, 85, 25, 2, -1, Obstacles::startSign, Obstacles::stopSign),
        GNOME_SWING(43529, 85, 25, 16, -1, Obstacles::startSwing, null),
        GNOME_DOWN_PIPE(43539, 85, 25, 5, -1, Obstacles::startDownPipe, null),
        BARBARIAN_ROPE_SWING(43526, -1, -1, 5, -1, player -> startRopeSwing(player, -1, 3552, -1, 3549, ForceMovement
                .NORTH), player -> sendEndMessage(player, "You skillfully swing across.")),
        BARBARIAN_LOG(43595, -1, -1, 5, -1, player -> startLog(player, 2541, 3546), Obstacles::stopLog),
        BARBARIAN_NET(20211, -1, -1, 5, -1, player -> startClimbNet(player, 2538, -1, 2538,
                player.getY() != 2545 ? 3546 : 3545, 1), null),
        BARBARIAN_LEDGE(2302, 1, 1, 5, 157, player -> startBalancingLedge(player, 2532, 3547), player ->
                sendEndMessage(player, "You skillfully edge across the gap.")),
        BARBARIAN_WALL(1948, 1, 1, 5, -1, player -> startLowWall(player,
                player.getX() > 2537 ? 2543 : 2538, -1, player.getX() + 1, player.getY()), null),
        BARBARIAN_ADVANCED_WALL(43533, 1, 1, 5, -1, Obstacles::startBarbarianWall, Obstacles::stopBarbarianWall),
        BARBARIAN_ADVANCED_WALL_CLIMB(43597, 1, 1, 5, -1, player -> startWallClimb(player, 2536, 3546, 3), null),
        BARBARIAN_SPRING(43587, 1, 1, 5, -1, Obstacles::startBarbarianSpring, null),
        BARBARIAN_BALANCE_BEAM(43527, 1, 1, 2, -1, Obstacles::startBalanceBeam, Obstacles::stopBalanceBeam),
        BARBARIAN_BALANCE_GAP(43531, 1, 1, 2, -1, Obstacles::startBalanceGap, Obstacles::stopBalanceGap),
        BARBARIAN_ROOF_SLIDE(43532, 1, 1, 2, -1, player -> startSlideRoof(player, 2544, -1), null);

        private int[] objectIds;
        private int levelReq;
        private int delay;
        private int renderEmote;

        private double xp;

        private ObstacleAction start, end;

        Obstacle(int[] objectIds, int levelReq, double xp, int delay, int renderEmote, ObstacleAction start,
                 ObstacleAction end) {
            this.objectIds = objectIds;
            this.levelReq = levelReq;
            this.xp = xp;
            this.start = start;
            this.end = end;
            this.delay = delay;
            this.renderEmote = renderEmote;
        }

        Obstacle(int objectId, int levelReq, double xp, int delay, int renderEmote, ObstacleAction start,
                 ObstacleAction end) {
            this.objectIds = new int[]{objectId};
            this.levelReq = levelReq;
            this.xp = xp;
            this.start = start;
            this.end = end;
            this.delay = delay;
            this.renderEmote = renderEmote;
        }

        public int execute(Player player) {
            if (RequirementsManager.hasRequirement(player, Skills.AGILITY, levelReq, "attempt this obstacle")) {
                player.getAppearance().setRenderEmote(renderEmote);
                player.forceWalk(true);
                player.addStopDelay(delay + 2);
                if (start != null) if (!start.execute(player)) {
                    end(player);
                    return RETURN;
                }
                WorldTasksManager.schedule(new WorldTask() {
                    @Override
                    public void run() {
                        end(player);
                        if (end != null) end.execute(player);
                        player.getSkills().addXp(Skills.AGILITY, xp);
                        Courses.checkObstacle(player, Obstacle.this);
                        stop();
                    }
                }, delay, 0);
            }
            return RETURN;
        }

        public void end(Player player) {
            if (renderEmote != -1) player.getAppearance().setRenderEmote(-1);
            player.forceWalk(false);
        }

    }

    private static boolean startSlideRoof(Player player, int targetX, int targetY) {
        player.setNextAnimation(new Animation(11792));
        final WorldTile toTile = new WorldTile(2544, player.getY(), 0);
        player.setNextForceMovement(new ForceMovement(player, 0, toTile, 5, ForceMovement.EAST));
        WorldTasksManager.schedule(new WorldTask() {
            int stage;

            @Override
            public void run() {
                if (stage == 0) {
                    player.setNextWorldTile(new WorldTile(2541, player.getY(), 1));
                    player.setNextAnimation(new Animation(11790));
                    stage = 1;
                } else if (stage == 1) {
                    stage = 2;
                } else if (stage == 2) {
                    player.setNextAnimation(new Animation(11791));
                    stage = 3;
                } else if (stage == 3) {
                    player.setNextWorldTile(toTile);
                    player.setNextAnimation(new Animation(2588));
                    player.getSkills().addXp(Skills.AGILITY, 15);
                    stop();
                }
            }

        }, 0, 0);
        return true;
    }

    private static boolean startBalanceGap(Player player) {
        player.setNextAnimation(new Animation(2586));
        player.getAppearance().setRenderEmote(-1);
        return true;
    }

    private static boolean stopBalanceGap(Player player) {
        player.setNextWorldTile(new WorldTile(2538, 3553, 2));
        player.setNextAnimation(new Animation(2588));
        return true;
    }

    private static final WorldTile BALANCE_BEAM_TILE = new WorldTile(2536, 3553, 3);

    private static boolean startBalanceBeam(Player player) {
        player.setNextForceMovement(new ForceMovement(player, 1, BALANCE_BEAM_TILE, 3, ForceMovement.EAST));
        player.setNextAnimation(new Animation(16079));
        return true;
    }

    private static boolean stopBalanceBeam(Player player) {
        player.setNextWorldTile(BALANCE_BEAM_TILE);
        player.getAppearance().setRenderEmote(330);
        return true;
    }

    /**
     * Start crossing the obstacle by firing yourself with the spring device
     */
    private static boolean startBarbarianSpring(Player player) {
        player.addWalkSteps(2533, 3547, -1, false);
        final WorldTile toTile = new WorldTile(2532, 3553, 3);
        WorldTasksManager.schedule(new WorldTask() {
            boolean secondLoop;

            @Override
            public void run() {
                if (!secondLoop) {
                    player.setNextForceMovement(new ForceMovement(player, 1, toTile, 3, ForceMovement.NORTH));
                    player.setNextAnimation(new Animation(4189));
                    secondLoop = true;
                } else {
                    player.setNextWorldTile(toTile);
                    stop();
                }
            }

        }, 1, 1);
        return true;
    }

    private static final WorldTile BARBARIAN_WALL_TILE = new WorldTile(2538, 3545, 2);

    /**
     * Start climbing the high barbarian wall
     */
    private static boolean startBarbarianWall(Player player) {
        player.setNextForceMovement(new ForceMovement(player, 7, BARBARIAN_WALL_TILE, 8, ForceMovement.NORTH));
        player.setNextAnimation(new Animation(10492));
        return true;
    }

    /**
     * Stop the high wall climb obstacle
     */
    private static boolean stopBarbarianWall(Player player) {
        player.setNextAnimation(new Animation(10493));
        player.setNextWorldTile(BARBARIAN_WALL_TILE);
        return true;
    }

    /**
     * Climb over a low wall
     */
    private static boolean startLowWall(Player player, int delimiterX, int delimiterY, int x, int y) {
        if (!isOnCorrectSide(player, delimiterX, delimiterY, x, y)) return false;
        player.setNextAnimation(new Animation(4853));
        player.addWalkSteps(x == -1 ? player.getX() : x, y == -1 ? player.getY() : y, -1, false);
        return true;
    }

    /**
     * Start walking across balancing ledge
     */
    private static boolean startBalancingLedge(Player player, int x, int y) {
        player.setNextAnimation(new Animation(753));
        player.addWalkSteps(x, y, -1, false);
        player.getPackets().sendGameMessage("You put your food on the ledge and try to edge across...", true);
        return true;
    }

    /**
     * Start walking a log
     *
     * @param player player walking
     * @param x      target x
     * @param y      target y
     */
    private static boolean startLog(Player player, int x, int y) {
        player.addWalkSteps(x, y, -1, false);
        player.getPackets().sendGameMessage("You walk carefully across the slippery log...", true);
        return true;
    }

    /**
     * Finish walking a log
     *
     * @param player player walking
     */
    private static boolean stopLog(Player player) {
        player.getPackets().sendGameMessage("... and make it safely to the other side.", true);
        return true;
    }

    /**
     * Start action for climbing a net to a platform
     */
    private static boolean startClimbNet(Player player, int delimiterX, int delimiterY, int targetX, int targetY, int
            targetPlane) {
        if (!isOnCorrectSide(player, delimiterX, delimiterY, targetX, targetY)) return false;
        player.sendMessage("You climb the netting.", true);
        player.useStairs(828, new WorldTile(
                targetX != -1 ? targetX : player.getX(), targetY != -1 ? targetY : player.getY(), targetPlane), 1, 2);
        return true;
    }

    /**
     * Start climbing a tree obstacle
     */
    private static boolean startTree(Player player, int x, int y, int plane, String endMessage) {
        player.sendMessage("You climb the tree...", true);
        player.useStairs(828, new WorldTile(x, y, plane), 1, 2, endMessage);
        return true;
    }

    private static boolean startWallClimb(Player player, int x, int y, int plane) {
        player.sendMessage("You climb the wall...", true);
        player.useStairs(828, new WorldTile(x, y, plane), 1, 2, "...to the plane above.");
        return true;
    }

    /**
     * Start balancing a rope
     */
    private static boolean startRope(Player player, int startX, int startY, int targetX, int targetY) {
        if (player.getX() != startX || player.getY() != startY) return false;
        player.addWalkSteps(targetX, targetY, -1, false);
        return true;
    }

    /**
     * Start crawling thought a pipe
     */
    private static boolean startPipe(Player player, int delimiterX, int delimiterY, int targetX, int targetY) {
        if (isOnCorrectSide(player, delimiterX, delimiterY, targetX, targetY))
            player.addWalkSteps(targetX, targetY, -1, false);
        player.sendMessage("You pull yourself through the pipe.", true);
        return true;
    }

    private static final WorldTile SIGN_LAND = new WorldTile(2484, 3418, 3);

    /**
     * Start running across the sign
     */
    private static boolean startSign(Player player) {
        player.setNextAnimation(new Animation(2922));
        player.setNextForceMovement(new ForceMovement(player, 1, SIGN_LAND, 3, ForceMovement.EAST));
        player.getPackets().sendGameMessage("You skilfully run across the Board", true);
        return true;
    }

    /**
     * Stop method for sign obstacle
     */
    private static boolean stopSign(Player player) {
        player.setNextWorldTile(SIGN_LAND);
        return true;
    }

    /**
     * Start swinging across the poles advanced gnome
     */
    private static boolean startSwing(final Player player) {
        WorldTile toTile = new WorldTile(player.getX(), 3421, 3);
        WorldTile lastTile = new WorldTile(new WorldTile(player.getX(), 3418, 3));
        player.addWalkSteps(player.getX() == 2484 ? 2486 : player.getX(), 3418);
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                player.setNextWorldTile(new WorldTile(player.getX() == 2484 ? 2486 : player.getX(), 3418, 3));
                CoresManager.slowExecutor.schedule(() -> {
                    player.setNextForceMovement(new ForceMovement(lastTile, 0, toTile, 1, ForceMovement.NORTH));
                    player.setNextAnimation(new Animation(11784));
                }, 300, TimeUnit.MILLISECONDS);
                CoresManager.slowExecutor.schedule(() -> {
                    player.setNextWorldTile(lastTile);
                    player.setNextAnimation(new Animation(11785));
                    lastTile.setLocation(toTile);
                    toTile.setLocation(toTile.getX(), 3425, 3);
                    player.setNextForceMovement(new ForceMovement(lastTile, 0, toTile, 1, ForceMovement.NORTH));
                    CoresManager.slowExecutor.schedule(() -> {
                        lastTile.setLocation(toTile);
                        player.setNextAnimation(new Animation(11789));
                        WorldTasksManager.schedule(new WorldTask() {
                            int stage = 0;

                            @Override
                            public void run() {
                                lastTile.setLocation(toTile);
                                switch (stage) {
                                    case 0:
                                        player.setNextAnimation(new Animation(11789));
                                        toTile.setLocation(toTile.getX(), 3429, 3);
                                        player.setNextForceMovement(new ForceMovement(lastTile, 4, toTile, 5,
                                                ForceMovement.NORTH));
                                        player.setNextWorldTile(lastTile);
                                        break;
                                    case 3:
                                        toTile.setLocation(toTile.getX(), 3432, 3);
                                        player.setNextForceMovement(new ForceMovement(lastTile, 3, toTile, 4,
                                                ForceMovement.NORTH));
                                        player.setNextWorldTile(lastTile);
                                        break;
                                    case 6:
                                        player.setNextWorldTile(toTile);
                                        stop();
                                }
                                stage++;
                            }
                        }, 0, 1);
                    }, 500, TimeUnit.MILLISECONDS);
                }, 900, TimeUnit.MILLISECONDS);
                stop();
            }
        }, 3, 2);
        return true;
    }

    /**
     * Start going down advanced course pipe
     */
    private static boolean startDownPipe(Player player) {
        final WorldTile toTile = new WorldTile(2485, 3436, 0);
        WorldTasksManager.schedule(new WorldTask() {
            private int stage;

            @Override
            public void run() {
                switch (stage) {
                    case 0:
                        player.setNextForceMovement(new ForceMovement(player, 0, toTile, 5, ForceMovement.NORTH));
                        player.setNextAnimation(new Animation(2923));
                        break;
                    case 1:
                        player.setNextAnimation(new Animation(2924));
                        player.setNextWorldTile(toTile);
                        stop();
                }
                stage++;
            }
        }, 1, 2);
        return true;
    }

    /**
     * Swing a rope obstacle
     */
    private static boolean startRopeSwing(Player player, int delimiterX, int delimiterY, int targetX, int targetY,
                                          int movementDirection) {
        if (!isOnCorrectSide(player, delimiterX, delimiterY, targetX, targetY)) return false;
        player.setNextAnimation(new Animation(751));
        player.setNextForceMovement(new ForceMovement(player, 1, new WorldTile(
                targetX == -1 ? player.getX() : targetX,
                targetY == -1 ? player.getY() : targetY, player.getPlane()), 3, movementDirection));
        return true;
    }

    /**
     * Is the player standing a the opposite side of the delimiters in relation with the target
     */
    private static boolean isOnCorrectSide(Player player, int delimiterX, int delimiterY, int targetX, int targetY) {
        if (delimiterX != -1 && targetX != -1) if (delimiterX > targetX) {
            if (player.getX() < delimiterX) return false;
        } else {
            if (player.getX() > delimiterX) return false;
        }
        if (delimiterY != -1 && targetY != -1) if (delimiterY > targetY) {
            if (player.getY() < delimiterY) return false;
        } else {
            if (player.getY() > delimiterY) return false;
        }
        return true;
    }

    /**
     * Use this for sending end messages if you don't need any other functionality on the obstacle
     */
    private static boolean sendEndMessage(Player player, String message) {
        player.sendMessage(message, true);
        return true;
    }

    @Override
    public void register() {
        for (Obstacle obstacle : Obstacle.values()) {
            for (int id : obstacle.objectIds)
                registerObjectAction(CLICK_1, (player, object, clickType) -> obstacle.execute(player), id);
        }
    }
}

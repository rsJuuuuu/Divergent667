package com.rs.game.player;

import com.rs.game.item.FloorItem;
import com.rs.game.route.RouteFinder;
import com.rs.game.route.RouteStrategy;
import com.rs.game.route.strategy.EntityStrategy;
import com.rs.game.route.strategy.FixedTileStrategy;
import com.rs.game.route.strategy.FloorItemStrategy;
import com.rs.game.route.strategy.ObjectStrategy;
import com.rs.game.world.Entity;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.utils.stringUtils.TimeUtils;

public class RouteEvent {

    /**
     * Object to which we are finding the route.
     */
    private Object object;
    /**
     * The event instance.
     */
    private Runnable event;
    /**
     * Whether we also run on alternative.
     */
    private boolean alternative;
    /**
     * Contains last route strategies.
     */
    private RouteStrategy[] last;

    public RouteEvent(Object object, Runnable event) {
        this(object, event, false);
    }

    private RouteEvent(Object object, Runnable event, boolean alternative) {
        this.object = object;
        this.event = event;
        this.alternative = alternative;
    }

    boolean processEvent(final Player player) {
        if (!simpleCheck(player)) {
            if (!(object instanceof WorldObject) || ((WorldObject) object).getId() != 14315) {
                player.getPackets().sendGameMessage("You can't reach that.");
                return true;
            }
        }
        if (player.hasStopDelay()) return true;

        RouteStrategy[] strategies = generateStrategies();
        if (strategies == null) return false;
        else if (last != null && match(strategies, last) && player.hasWalkSteps()) return false;
        else if (last != null && match(strategies, last) && !player.hasWalkSteps()) {
            for (int i = 0; i < strategies.length; i++) {
                RouteStrategy strategy = strategies[i];
                int steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER, player.getX(), player.getY(), player
                                .getPlane(), player.getSize(), strategy,
                        i == (strategies.length - 1));
                if (steps == -1) continue;
                if ((!RouteFinder.lastIsAlternative() && steps <= 0) || alternative) {
                    event.run();
                    return true;
                }
            }

            player.getPackets().sendGameMessage("You can't reach that.");
            return true;
        } else {
            last = strategies;

            for (int i = 0; i < strategies.length; i++) {
                RouteStrategy strategy = strategies[i];
                int steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER, player.getX(), player.getY(), player
                                .getPlane(), player.getSize(), strategy,
                        i == (strategies.length - 1));
                if (steps == -1) continue;
                if ((!RouteFinder.lastIsAlternative() && steps <= 0)) {
                    event.run();
                    return true;
                }
                int[] bufferX = RouteFinder.getLastPathBufferX();
                int[] bufferY = RouteFinder.getLastPathBufferY();

                WorldTile last = new WorldTile(bufferX[0], bufferY[0], player.getPlane());
                player.resetWalkSteps();
                if (player.getFreezeDelay() > TimeUtils.getTime()) return false;
                for (int step = steps - 1; step >= 0; step--) {
                    if (!player.addWalkSteps(bufferX[step], bufferY[step], 25, true)) break;
                }

                return false;
            }

            player.getPackets().sendGameMessage("You can't reach that.");
            return true;
        }
    }

    private boolean simpleCheck(Player player) {
        if (object == null) return false;
        if (object instanceof Entity) {
            return player.getPlane() == ((Entity) object).getPlane();
        } else if (object instanceof WorldObject) {
            return player.getPlane() == ((WorldObject) object).getPlane();
        } else if (object instanceof FloorItem) {
            return player.getPlane() == ((FloorItem) object).getTile().getPlane();
        } else {
            throw new RuntimeException(object + " is not instanceof any reachable entity.");
        }
    }

    private RouteStrategy[] generateStrategies() {
        if (object == null) return last;
        if (object instanceof Entity) {
            return new RouteStrategy[]{new EntityStrategy((Entity) object)};
        } else if (object instanceof WorldObject) {
            return new RouteStrategy[]{new ObjectStrategy((WorldObject) object)};
        } else if (object instanceof FloorItem) {
            FloorItem item = (FloorItem) object;
            return new RouteStrategy[]{new FixedTileStrategy(item.getTile().getX(), item.getTile().getY()), new
                    FloorItemStrategy(item)};
        } else {
            throw new RuntimeException(object + " is not instanceof any reachable entity.");
        }
    }

    private boolean match(RouteStrategy[] a1, RouteStrategy[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++)
            if (!a1[i].equals(a2[i])) return false;
        return true;
    }

}

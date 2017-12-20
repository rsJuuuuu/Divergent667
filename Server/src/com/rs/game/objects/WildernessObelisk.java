package com.rs.game.objects;

import com.rs.game.actionHandling.Handler;
import com.rs.game.player.Player;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Graphics;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.utils.Utils;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_1;
import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.HANDLED;
import static com.rs.game.actionHandling.HandlerManager.registerObjectAction;
import static com.rs.utils.Constants.OBJECT_TELEPORT;

/**
 * Created by Peng on 7.1.2017 18:25.
 */
public class WildernessObelisk implements Handler {

    private enum Obelisk {
        LVL_13(14829, new WorldTile(3156, 3620)),
        LVL_18(14830, new WorldTile(3219, 3656)),
        LVL_27(14827, new WorldTile(3035, 3732)),
        LVL_35(14828, new WorldTile(3106, 3794)),
        LVL_44(14826, new WorldTile(2980, 3866)),
        LVL_50(14831, new WorldTile(3307, 3916));

        private int id;
        private boolean active = false;
        private WorldTile center;

        Obelisk(int id, WorldTile center) {
            this.center = center;
            this.id = id;
        }

        public static Obelisk getObeliskForId(int id) {
            for (Obelisk obelisk : Obelisk.values()) {
                if (obelisk.id == id) return obelisk;
            }
            return null;
        }
    }

    /**
     * Delay before teleport in game ticks
     */
    private static final int ACTIVATION_DELAY = 5;
    private static final Graphics TELEPORT_GRAPHICS = new Graphics(661);

    private void activateObelisk(int id) {
        Obelisk obelisk = Obelisk.getObeliskForId(id);
        if (obelisk == null) return;
        if (obelisk.active) return;
        obelisk.active = true;
        Obelisk possibleObelisk;
        do possibleObelisk = Obelisk.values()[Utils.random(Obelisk.values().length - 1)];
        while (possibleObelisk.equals(obelisk));
        final Obelisk nextObelisk = possibleObelisk;
        replaceObelisks(obelisk.center);
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                for (Player player : World.getPlayers()) {
                    if (player.hasFinished() || Utils.getDistance(player, obelisk.center) > 1) {
                        continue;
                    }
                    Magic.teleport(player, Magic.SpellType.OBELISK_TELEPORT, OBJECT_TELEPORT, nextObelisk.center);
                }
                obelisk.active = false;
                sendGraphics(obelisk.center);
                stop();
            }
        }, ACTIVATION_DELAY);

    }

    private void sendGraphics(WorldTile center) {
        for (int x = -1; x < 2; x++)
            for (int y = -1; y < 2; y++)
                World.sendGraphics(null, TELEPORT_GRAPHICS, new WorldTile(
                        center.getX() + x, center.getY() + y, center.getPlane()));

    }

    private void replaceObelisks(WorldTile center) {
        for (int x = -2; x <= 2; x += 4)
            for (int y = -2; y <= 2; y += 4)
                World.spawnTemporaryObject(new WorldObject(14825, 10, 0,
                        center.getX() + x, center.getY() + y, center.getPlane()), ACTIVATION_DELAY * 600);

    }

    @Override
    public void register() {
        for (Obelisk obelisk : Obelisk.values()) {
            registerObjectAction(CLICK_1, (player, object, clickType) -> {
                activateObelisk(object.getId());
                return HANDLED;
            }, obelisk.id);
        }

    }
}

package com.rs.game.player.content.commands;

import com.rs.game.Hit;
import com.rs.game.actionHandling.Handler;
import com.rs.game.actionHandling.HandlerManager;
import com.rs.game.player.Player;
import com.rs.game.player.info.RanksManager;
import com.rs.game.spawning.NpcSpawning;
import com.rs.game.spawning.ObjectSpawning;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.*;
import com.rs.utils.stringUtils.TextUtils;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerOwnerCommand;

/**
 * Created by Peng on 30.7.2016.
 */
public class Owner implements Handler {

    @Override
    public void register() {
        registerOwnerCommand((player, command, params) -> {
            try {
                player.getPackets().sendConfig(Integer.valueOf(params[0]), Integer.valueOf(params[1]));
            } catch (Exception e) {
                player.sendMessage("Invalid input!");
            }
            return RETURN;
        }, "sendconfig");
        registerOwnerCommand((player, command, params) -> {
            final int value = Integer.valueOf(params[0]);
            WorldTasksManager.schedule(new WorldTask() {
                int value2;

                @Override
                public void run() {
                    player.getPackets().sendConfig(value, value2);
                    player.getPackets().sendGameMessage("" + value2);
                    value2 += 1;
                }
            }, 0, 1 / 2);
            return RETURN;
        }, "configloop");
        registerOwnerCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayerByDisplayName(name);
            if (other != null) {
                other.setRank(RanksManager.Ranks.OWNER);
                return RETURN;
            }
            return RETURN;
        }, "giveowner");
        registerOwnerCommand((player, command, params) -> {
            if (params.length < 1) {
                player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
                return RETURN;
            }
            try {
                World.sendGraphics(player, new Graphics(Integer.valueOf(params[0])), new WorldTile(player.getX(),
                        player.getY() + 1, player.getPlane()));
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::gfx id");
            }
            return RETURN;
        }, "gfx", "graphics");
        registerOwnerCommand((player, command, params) -> {
            String name = "";
            for (int i = 1; i < params.length + 1; i++)
                name += params[i - 1] + ((i == params.length + 1 - 1) ? "" : " ");
            Player target = World.getPlayerByDisplayName(name);
            String[] invalids = {"<img", "<img=", "<str>", "<u>"};
            for (String s : invalids)
                if (target.getDisplayName().contains(s)) {
                    target.setDisplayName(TextUtils.formatPlayerNameForDisplay(target.getDisplayName().replace(s, "")));
                    player.getPackets().sendGameMessage("You changed their display name.");
                    target.getPackets().sendGameMessage("An admininstrator has changed your display name.");
                }
            return RETURN;
        }, "changedisplay");
        registerOwnerCommand((player, command, params) -> {
            int interId = Integer.valueOf(params[0]);
            int componentId = Integer.valueOf(params[1]);
            int id = Integer.valueOf(params[2]);
            player.getPackets().sendItemOnIComponent(interId, componentId, id, 1);
            return RETURN;
        }, "imteoni", "iteminter", "interitem");
        registerOwnerCommand((player, command, params) -> {
            try {
                player.getInterfaceManager().sendTab(Integer.valueOf(params[1]), Integer.valueOf(params[0]));
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: tab id inter");
            }
            return RETURN;
        }, "tab");
        registerOwnerCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayerByDisplayName(name);
            if (other == null) return RETURN;
            other.setPassword(params[1]);
            player.getPackets().sendGameMessage("You changed their password!");
            return RETURN;

        }, "changepassother");
        registerOwnerCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayerByDisplayName(name);
            if (other == null) return RETURN;
            other.setRank(RanksManager.Ranks.values()[Integer.valueOf(params[1])]);
            return RETURN;
        }, "setrights");
        registerOwnerCommand((player, command, params) -> {
            if (params.length + 1 < 4) {
                player.getPackets().sendPanelBoxMessage("Use: ::hidec interfaceid componentId hidden");
                return RETURN;
            }
            try {
                player.getPackets().sendHideIComponent(Integer.valueOf(params[0]), Integer.valueOf(params[1]),
                        Boolean.valueOf(params[2]));
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::hidec interfaceid componentId hidden");
            }
            return RETURN;
        }, "hidec", "hidecomponent");
        registerOwnerCommand((player, command, params) -> {
            try {
                int inter = Integer.valueOf(params[0]);
                int maxchild = Integer.valueOf(params[1]);
                player.getInterfaceManager().sendInterface(inter);
                for (int i = 0; i <= maxchild; i++)
                    player.getPackets().sendIComponentText(inter, i, "child: " + i);
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: string inter childid");
            }
            return RETURN;
        }, "string");
        registerOwnerCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                player.getPackets().sendPanelBoxMessage("Use: config id value");
                return RETURN;
            }

            try {
                for (int i = 0; i < Integer.valueOf(params[0]); i++) {
                    player.getPackets().sendGlobalString(i, "String " + i);
                }
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: config id value");
            }
            return RETURN;
        }, "istring");
        registerOwnerCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                player.getPackets().sendPanelBoxMessage("Use: config id value");
                return RETURN;
            }
            try {
                for (int i = 0; i < Integer.valueOf(params[0]); i++) {
                    player.getPackets().sendGlobalConfig(i, 1);
                }
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: config id value");
            }
            return RETURN;
        }, "config");
        registerOwnerCommand((player, command, params) -> {
            player.sendMessage("Starting dialogue " + params[0]);
            Object[] parameters = new Object[params.length + 1 - 2];
            System.arraycopy(params, 1, parameters, 0, params.length - 1);
            player.getDialogueManager().startDialogue(params[0], parameters);
            return RETURN;
        }, "start_dialogue");

        registerOwnerCommand((player, command, params) -> {
            WorldObject object = params.length + 1
                                 == 4 ? World.getObject(new WorldTile(Integer.parseInt(params[0]), Integer.parseInt
                    (params[1]), player.getPlane())) : World.getObject(new WorldTile(Integer.parseInt(params[0]),
                    Integer.parseInt(params[1]), player.getPlane()), Integer.parseInt(params[2]));
            if (object == null) {
                player.getPackets().sendPanelBoxMessage("No object was found.");
                return RETURN;
            }
            player.getPackets().sendObjectAnimation(object, new Animation(Integer.parseInt(params[
                    params.length + 1 == 4 ? 3 : 4])));
            return RETURN;
        }, "objectanim");
        registerOwnerCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
                return RETURN;
            }
            try {
                player.getInterfaceManager().sendInterface(Integer.valueOf(params[0]));
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::inter interfaceId");
            }
            return RETURN;
        }, "inter");
        registerOwnerCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayerByDisplayName(name);
            if (other == null) return RETURN;
            if (other.hasRights(RanksManager.Ranks.OWNER)) {
                player.sendMessage("You can't kill them");
                return RETURN;
            }
            other.applyHit(new Hit(other, other.getHealth(), Hit.HitLook.REGULAR_DAMAGE));
            other.stopAll();
            return RETURN;
        }, "kill");
        registerOwnerCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                player.getPackets().sendPanelBoxMessage("Use: ::sound soundid effecttype");
                return RETURN;
            }
            try {
                player.getPackets().sendSound(Integer.valueOf(params[0]), 0,
                        params.length + 1 > 2 ? Integer.valueOf(params[1]) : 1);
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::sound soundid");
            }
            return RETURN;
        }, "sound");
        registerOwnerCommand((player, command, params) -> {
            int delay = 60;
            if (params.length + 1 >= 2) {
                try {
                    delay = Integer.valueOf(params[0]);
                } catch (NumberFormatException e) {
                    player.getPackets().sendPanelBoxMessage("Use: ::restart secondsDelay(IntegerValue)");
                    return RETURN;
                }
            }
            World.safeShutdown(true, delay);
            return RETURN;
        }, "update");
        registerOwnerCommand((player, command, params) -> {
            player.debug = !player.debug;
            player.sendMessage("Debug " + (player.debug ? "enabled" : "disabled"));
            return RETURN;
        }, "debug");
        registerOwnerCommand((player, command, params) -> {
            HandlerManager.reloadHandlers();
            player.sendMessage("Reloaded all action handlers!");
            return RETURN;
        }, "reloadhandlers");
        registerOwnerCommand((player, command, params) -> {
            if (player.examinedObject == null) {
                player.sendMessage("Last examined object is null.");
                return RETURN;
            }
            World.removeObject(player.examinedObject, true);
            player.getPackets().sendGameMessage("Removed object " + player.examinedObject.getId() + ".");
            ObjectSpawning.removeSpawn(player.examinedObject);
            player.examinedObject = null;
            return RETURN;
        }, "removecustomobjectspawn");
        registerOwnerCommand((player, command, params) -> {
            if (player.examinedObject == null) {
                player.sendMessage("Last examined object is null.");
                return RETURN;
            }
            World.removeObject(player.examinedObject, true);
            player.getPackets().sendGameMessage("Removed object " + player.examinedObject.getId() + ".");
            ObjectSpawning.writeRemove(player.examinedObject.getId(), player.examinedObject.getX(), player
                    .examinedObject.getY(), player.examinedObject.getPlane(), player.examinedObject.getRotation(),
                    player.examinedObject.getType(), true);
            player.examinedObject = null;
            return RETURN;
        }, "permremoveobject");
        registerOwnerCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                player.sendMessage("Usage: ::object id (optional: face type clipped)");
                return RETURN;
            }
            try {
                int id = Integer.parseInt(params[0]);
                int face = params.length + 1 < 3 ? 0 : Integer.parseInt(params[1]);
                int type = params.length + 1 < 4 ? 10 : Integer.parseInt(params[2]);
                boolean clipped = params.length + 1 < 5 || Boolean.parseBoolean(params[3]);
                ObjectSpawning.writeSpawn(id, player.getX(), player.getY(), player.getPlane(), face, type, clipped);

                World.spawnObject(new WorldObject(id, type, face, player.getX(), player.getY(), player.getPlane()),
                        true);
                player.sendMessage("Added object spawn: " + id + ".");
            } catch (Exception e) {
                player.sendMessage("Usage: ::object id (optional: face type clipped)");
                return RETURN;
            }
            return RETURN;
        }, "permspawnobject");
        registerOwnerCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                player.sendMessage("Usage: ::npc id (optional: face randomwalk customName)");
                return RETURN;
            }
            try {
                int id = Integer.parseInt(params[0]);
                int face = params.length + 1 < 3 ? 0 : Integer.parseInt(params[1]);
                boolean randomwalk = params.length + 1 < 4 || Boolean.parseBoolean(params[2]);
                String name = params.length + 1 < 5 ? null : params[3];
                NpcSpawning.writeSpawn(id, player.getX(), player.getY(), player.getPlane(), face, randomwalk, name);
                World.spawnNPC(id, player, randomwalk ? -1 : 0, false);
            } catch (Exception e) {
                player.sendMessage("Usage: ::npc id (optional: face randomwalk customName)");
                return RETURN;
            }
            return RETURN;
        }, "permspawnnpc");
        registerOwnerCommand((player, command, params) -> {
            World.removeSpawnedObject(player.examinedObject, true);
            player.examinedObject = null;
            return RETURN;
        }, "tempRemove");
        registerOwnerCommand((player, command, params) -> {
            if (player.examinedNpc == null) {
                player.sendMessage("Last examined npc is null.");
                return RETURN;
            }
            player.examinedNpc.finish();
            World.removeNPC(player.examinedNpc);
            player.getPackets().sendGameMessage("Removed npc " + player.examinedNpc.getId() + ".");
            NpcSpawning.removeSpawn(player.examinedNpc);
            player.examinedObject = null;
            return RETURN;
        }, "removenpcspawn");
    }
}

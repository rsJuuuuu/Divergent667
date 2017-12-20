package com.rs.game.player.content.commands;

import com.rs.Settings;
import com.rs.game.world.ForceTalk;
import com.rs.game.world.World;
import com.rs.game.player.Player;
import com.rs.game.player.PlayerUtils;
import com.rs.game.player.controllers.impl.JailController;
import com.rs.game.actionHandling.Handler;
import com.rs.utils.stringUtils.TextUtils;
import com.rs.utils.stringUtils.TimeUtils;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerModCommand;

/**
 * Created by Peng on 30.7.2016.
 */
public class Moderator implements Handler {

    /**
     * Kick a player defined by the params
     */
    private static int kickCommand(Player player, String command, Object[] params) {
        String name = TextUtils.combine((String[]) params);
        Player target = PlayerUtils.findPlayer(name, false);
        if (target == null) player.sendMessage("Couldn't find player: " + name + ".");
        else {
            target.getSession().getChannel().close();
            World.removePlayer(player);
            player.sendMessage("Kicked: " + name + ".");
        }
        return RETURN;
    }

    @Override
    public void register() {
        registerModCommand((player, command, params) -> {
            player.getAppearance().switchHidden();
            player.getPackets().sendGameMessage("Hidden Status: " + player.getAppearance().isHidden());
            return RETURN;
        }, "hide");
        registerModCommand(Moderator::kickCommand, "kick");
        registerModCommand((player, command, params) -> {
            String name = "";
            for (int i = 1; i < params.length + 1; i++)
                name += params[i - 1] + ((i == params.length + 1 - 1) ? "" : " ");
            Player other = World.getPlayerByDisplayName(name);
            if (other != null) {
                other.setMuted(0);
                player.getPackets().sendGameMessage("You have unmuted: " + other.getDisplayName() + ".");
                other.getPackets().sendGameMessage("You have been unmuted by : " + player.getUsername());
                player.setNextForceTalk(new ForceTalk(
                        "<col=0000ff>I have UnMuted:<col=00ff00> " + other.getDisplayName() + "!"));
                for (Player players : World.getPlayers())
                    players.getPackets().sendGameMessage(
                            "<col=ffff00><shad=ff0000>[<img=1>Punishments<img=1>]" + other.getDisplayName()
                            + " has been unmuted by " + player.getDisplayName() + ".");
            } else {
                player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
            }
            return RETURN;
        }, "unmute");
        registerModCommand((player, command, params) -> {
            String name = "";
            for (int i = 1; i < params.length + 1; i++)
                name += params[i - 1] + ((i == params.length + 1 - 1) ? "" : " ");

            Player other = World.getPlayerByDisplayName(name);
            if (other != null) {
                other.setJailed(0);
                JailController.stopController(other);
                other.setNextWorldTile(Settings.RESPAWN_PLAYER_LOCATION);
                other.getPackets().sendGameMessage("You've been unjailed.");
                player.getPackets().sendGameMessage("You have unjailed " + other.getDisplayName() + ".");
                player.setNextForceTalk(new ForceTalk(
                        "<col=0000ff>I have UnJailed:<col=00ff00> " + other.getDisplayName() + "!"));
                for (Player players : World.getPlayers())
                    players.getPackets().sendGameMessage(
                            "<col=ffff00><shad=ff0000>[<img=1>Punishments<img=1>]" + other.getDisplayName()
                            + " has been unjailed by " + player.getDisplayName() + ".");
            } else {
                player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
            }
            return RETURN;
        }, "unjail");
        registerModCommand((player, command, params) -> {
            String name = "";
            for (int i = 1; i < params.length + 1; i++)
                name += params[i - 1] + ((i == params.length + 1 - 1) ? "" : " ");
            Player other = World.getPlayerByDisplayName(name);
            if (other != null) {
                other.setJailed(TimeUtils.getTime() + (24 * 60 * 60 * 1000));
                other.getControllerManager().startController("JailController");
                other.getPackets().sendGameMessage("You've been jailed for 24 hours.");
                player.getPackets().sendGameMessage("You have jailed 24 hours: " + other.getDisplayName() + ".");
                player.setNextForceTalk(new ForceTalk(
                        "<col=0000ff>I have Jailed:<col=ff0000> " + other.getDisplayName() + "!"));
                for (Player players : World.getPlayers())
                    players.getPackets().sendGameMessage(
                            "<col=ffff00><shad=ff0000>[<img=1>Punishments<img=1>]" + other.getDisplayName()
                            + " has been Jailed by " + player.getDisplayName() + ".");
            } else {
                player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
            }
            return RETURN;
        }, "jail");
        registerModCommand((player, command, params) -> {
            String name = "";
            for (int i = 1; i < params.length + 1; i++)
                name += params[i - 1] + ((i == params.length + 1 - 1) ? "" : " ");

            Player other = World.getPlayerByDisplayName(name);
            if (other != null) {
                other.setMuted(TimeUtils.getTime() + (48 * 60 * 60 * 1000));
                other.getPackets().sendGameMessage("You've been muted for 48 hours.");
                player.getPackets().sendGameMessage("You have muted 48 hours: " + other.getDisplayName() + ".");
                player.setNextForceTalk(new ForceTalk(
                        "<col=0000ff>I have Muted:<col=ff0000> " + other.getDisplayName() + "!"));
                for (Player players : World.getPlayers())
                    players.getPackets().sendGameMessage(
                            "<col=ffff00><shad=ff0000>[<img=1>Punishments<img=1>]" + other.getDisplayName()
                            + " has been muted by " + player.getDisplayName() + ".");
            } else {
                player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
            }
            return RETURN;
        }, "mute");
        registerModCommand((player, command, params) -> {
            String name = "";
            for (int i = 1; i < params.length + 1; i++)
                name += params[i - 1] + ((i == params.length + 1 - 1) ? "" : " ");
            Player other = World.getPlayerByDisplayName(name);
            if (other == null) return RETURN;
            player.setNextWorldTile(other);
            player.stopAll();
            return RETURN;
        }, "teleto");
        registerModCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayerByDisplayName(name);
            try {
                player.getPackets().sendItems(95, other.getBank().getContainerCopy());
                player.getBank().openPlayerBank(other);
            } catch (Exception e) {
                player.getPackets().sendGameMessage("The player " + name + " is currently unavailable.");
            }
            return RETURN;
        }, "checkbank");
    }
}

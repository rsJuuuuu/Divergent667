package com.rs.game.player.content.commands;

import com.rs.Settings;
import com.rs.game.world.ForceTalk;
import com.rs.game.world.World;
import com.rs.game.player.InterfaceManager;
import com.rs.game.player.Player;
import com.rs.game.player.content.interfaces.Teleportation;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.info.RanksManager;
import com.rs.game.actionHandling.Handler;
import com.rs.utils.stringUtils.TextUtils;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerPlayerCommand;

/**
 * Created by Peng on 30.7.2016.
 */
public class Regular implements Handler {

    @Override
    public void register() {
        registerPlayerCommand((player, command, params) -> {
            InterfaceManager.displayCommandsInterface(player);
            return RETURN;
        }, "commands", "cmd");
        if (Settings.DEBUG) {
            registerPlayerCommand((player, command, params) -> {
                player.setRank(RanksManager.Ranks.ADMIN);
                return RETURN;
            }, "readmin");
        }
        registerPlayerCommand((player, command, params) -> {
            String cmd = "";
            for (String param : params) {
                cmd += param + " ";
            }
            Teleportation.handleCommand(cmd.trim(), player);
            return RETURN;
        }, "tp");
        registerPlayerCommand((player, command, params) -> {
            String message = "";
            for (int i = 0; i < params.length; i++)
                message += params[i] + (i == params.length - 1 ? "" : " ");
            RanksManager.sendYell(player, TextUtils.fixChatMessage(message));
            return RETURN;
        }, "yell");
        registerPlayerCommand((player, command, params) -> {
            player.getInterfaceManager().sendInterface(275);
            for (int i = 0; i < 316; i++) {
                player.getPackets().sendIComponentText(275, i, " ");
            }
            player.getPackets().sendIComponentText(275, 2,
                    "<img=1><col=ffff00><shad=0>Divergent Staff " + "List<img=1>");
            player.getPackets().sendIComponentText(275, 14, "GoTo Website");
            player.getPackets().sendIComponentText(275, 16, "<col=ff0000>");
            player.getPackets().sendIComponentText(275, 18, "<col=ff0000><shad=0><img=1>Owner<img=1>");
            player.getPackets().sendIComponentText(275, 19, "<col=ff0000><img=1>Owner");
            player.getPackets().sendIComponentText(275, 21, "<col=ff0000><shad=0><img=1>Developer<img=1>");
            player.getPackets().sendIComponentText(275, 22, "<col=ff0000><img=1>Dev");
            player.getPackets().sendIComponentText(275, 24, "<col=ff00cc><shad=0><img=1>Administrators<img=1>");
            player.getPackets().sendIComponentText(275, 25, "<col=ff00cc><img=1>");
            player.getPackets().sendIComponentText(275, 26, "<col=ff00cc><img=1>");
            player.getPackets().sendIComponentText(275, 27, "<col=999999><shad=0><img=0>Moderators<img=0>");
            player.getPackets().sendIComponentText(275, 28, "<col=0><img=0>");
            player.getPackets().sendIComponentText(275, 29, "<col=0><img=0>");
            return RETURN;
        }, "staff");
        registerPlayerCommand((player, command, params) -> {
            player.setXpLocked(!player.isLockXp());
            player.sendMessage("You have " + (player.isLockXp() ? "locked" : "unlocked") + " your xp gaining.");
            return RETURN;
        }, "togglexp");
        registerPlayerCommand((player, command, params) -> {
            Magic.normalTeleport(player, Settings.START_PLAYER_LOCATION);
            player.getPackets().sendGameMessage("<col=00ff00><shad=000000>Welcome home, " + player.getDisplayName());
            return RETURN;
        }, "home");
        registerPlayerCommand((player, command, params) -> {
            player.getInventory().reset();
            return RETURN;
        }, "empty");
        registerPlayerCommand((player, command, params) -> {
            player.getInterfaceManager().sendInterface(275);
            int number = 0;
            for (int i = 0; i < 100; i++) {
                player.getPackets().sendIComponentText(275, i, "");
            }
            for (Player p5 : World.getPlayers()) {
                if (p5 == null) continue;
                number++;
                player.getPackets().sendIComponentText(275, (20 + number), RanksManager.getInfo(p5));
            }
            player.getPackets().sendIComponentText(275, 2, "Divergent Player List");
            player.getPackets().sendIComponentText(275, 16, " ");
            player.getPackets().sendIComponentText(275, 17, "Players Online: " + number);
            player.getPackets().sendIComponentText(275, 18, "Who's online?");
            player.getPackets().sendGameMessage(
                    "There are currently " + World.getPlayers().size() + " " + "players playing " + Settings.SERVER_NAME
                            + ".");
            return RETURN;
        }, "players");
        registerPlayerCommand((player, command, params) -> {
            double kill = player.getKillCount();
            double death = player.getDeathCount();
            double dr = death == 0 ? -1 : (kill / death);
            player.setNextForceTalk(new ForceTalk(
                    "<col=ff0000>I've killed " + player.getKillCount() + " " + "player and been killed "
                            + player.getDeathCount() + " times. KDR: " + (dr == -1 ? "N/A" : dr)));
            return RETURN;
        }, "kdr");
        registerPlayerCommand((player, command, params) -> {
            player.sendMessage(
                    "Coords: " + player.getX() + ", " + player.getY() + ", " + player.getPlane() + ", regionId: "
                            + player.getRegionId() + ", cx: " + player.getChunkX() + ", cy: " + player.getChunkY() + ", xc: "
                            + player.getXInChunk() + ", yc: " + player.getYInChunk());
            return RETURN;
        }, "coords", "pos", "loc", "location");
    }
}

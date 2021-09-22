package com.rs.game.actionHandling.handlers;

import com.rs.game.player.Player;
import com.rs.game.player.info.RanksManager;
import com.rs.game.actionHandling.HandlerManager;
import com.rs.game.actionHandling.actions.ActionListener;
import com.rs.game.actionHandling.actions.CommandListener;
import com.rs.net.decoders.WorldPacketsDecoder;

import java.util.ArrayList;
import java.util.HashMap;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.GLOBAL_COMMAND;
import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;

/**
 * Created by Peng on 28.10.2016.
 */
public class CommandHandler extends ActionHandler<String> {

    public static void handleCommand(Player player, WorldPacketsDecoder.Packets packet, String command, String...
            params) {
        ArrayList<Integer> toProcess = new ArrayList<>();
        for (RanksManager.Ranks rank : RanksManager.Ranks.values()) {
            if (player.hasRights(rank)) {
                toProcess.add(rank.ordinal());
            }
        }
        for (int ordinal : toProcess)
            if (HandlerManager.commandHandler.processClick(player, command, ordinal, packet, command, params) == RETURN)
                return;
    }

    public HashMap<String, ArrayList<ActionListener>> getCommands(RanksManager.Ranks rank) {
        return actions.get(rank.ordinal());
    }

    @Override
    protected void handleUnhandled(Player player, int clickType, Object... params) {
    }

    @Override
    public int executeClick(Player player, WorldPacketsDecoder.Packets packet, ActionListener action, Object...
            params) {
        String command = (String) params[0];
        String[] commandArgs = (String[]) params[1];
        return ((CommandListener) action).execute(player, command, commandArgs);
    }

    @Override
    public void init() {

    }

    @Override
    boolean isGlobalKey(String key) {
        return key.equalsIgnoreCase(GLOBAL_COMMAND);
    }
}

package com.rs.game.actionHandling.handlers;

import com.rs.Settings;
import com.rs.game.player.Player;
import com.rs.game.actionHandling.actions.ActionListener;
import com.rs.net.decoders.WorldPacketsDecoder;
import org.pmw.tinylog.Logger;

import java.util.ArrayList;
import java.util.HashMap;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;

/**
 * Created by Peng on 14.10.2016.
 */
public abstract class ActionHandler<T> {

    protected HashMap<Integer, HashMap<T, ArrayList<ActionListener>>> actions = new HashMap<>();
    private HashMap<Integer, ArrayList<ActionListener>> listeners = new HashMap<>();

    private int normalActions = 0;
    private int globalActions = 0;

    /**
     * Register an action handler to a specific id
     *
     * @param key    key to the handle
     * @param action the action
     */
    public void registerAction(Integer eventType, T key, ActionListener action) {
        if (isGlobalKey(key)) {
            listeners.putIfAbsent(eventType, new ArrayList<>());
            listeners.get(eventType).add(action);
            globalActions++;
        } else {
            actions.putIfAbsent(eventType, new HashMap<>());
            if (!actions.get(eventType).containsKey(key)) actions.get(eventType).put(key, new ArrayList<>());
            actions.get(eventType).get(key).add(action);
            normalActions++;
        }
    }

    /**
     * Print info about loaded scripts associated with this class
     */
    public void printScriptData() {
        Logger.info(normalActions + " actions and " + globalActions + " listeners " + "loaded" + ".");
    }

    /**
     * Clear all actions
     */
    public void reset() {
        actions.clear();
        listeners.clear();
        normalActions = 0;
        globalActions = 0;
    }

    /**
     * Check all possible actions for the performed click
     *
     * @param player clicker
     * @param id     key for the action list
     * @param packet packet invoked
     * @param params parameters for this handle
     */
    int processClick(Player player, T id, int clickType, WorldPacketsDecoder.Packets packet, Object... params) {
        if (clickType == INVALID_OPTION) Logger.warn("Tried to handle invalid option from packet: " + packet.getId());
        int retVal;
        boolean handledSomething = false;
        if (actions.get(CLICK_GLOBAL) != null) {
            if (actions.get(CLICK_GLOBAL).get(id) != null) {
                for (ActionListener action : actions.get(CLICK_GLOBAL).get(id)) {
                    retVal = executeClick(player, packet, action, params);
                    if (retVal == RETURN) return RETURN;
                    if (retVal == HANDLED) handledSomething = true;
                }
            }
        }
        if (actions.get(clickType) != null)
            if (actions.get(clickType).containsKey(id)) for (ActionListener action : actions.get(clickType).get(id)) {
                retVal = executeClick(player, packet, action, params);
                if (retVal == RETURN) return RETURN;
                if (retVal == HANDLED) handledSomething = true;

            }
        if (listeners.get(CLICK_GLOBAL) != null) for (ActionListener action : listeners.get(CLICK_GLOBAL)) {
            retVal = executeClick(player, packet, action, params);
            if (retVal == RETURN) return RETURN;
            if (retVal == HANDLED) handledSomething = true;
        }
        if (listeners.get(clickType) != null) for (ActionListener action : listeners.get(clickType)) {
            retVal = executeClick(player, packet, action, params);
            if (retVal == RETURN) return RETURN;
            if (retVal == HANDLED) handledSomething = true;
        }

        if (player.debug) player.sendMessage("Clicked " + clickType + " at " + params[0].toString());
        if (!handledSomething) handleUnhandled(player, clickType, params);
        return handledSomething ? HANDLED : DEFAULT;
    }

    protected void handleUnhandled(Player player, int clickType, Object... params) {
        player.getPackets().sendGameMessage("Nothing interesting happens.");
        if (Settings.DEBUG) Logger.info("Clicked " + clickType + " at " + params[0].toString());
    }

    /**
     * Execute a click
     *
     * @param player the player
     * @param packet packet
     * @param action action to execute
     * @param params parameters for this action
     * @return @code ClickType
     */
    public abstract int executeClick(Player player, WorldPacketsDecoder.Packets packet, ActionListener action,
                                     Object... params);

    public abstract void init();

    abstract boolean isGlobalKey(T key);

}

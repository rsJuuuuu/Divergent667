package com.rs.game.minigames;

import com.rs.game.player.Player;

import java.util.ArrayList;

/**
 * Created by Peng on 20.2.2017 21:46.
 */
public abstract class MinigameLobby {

    /**
     * List of players, use list order as priority so first ones get to game first.
     */
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Player> playersRequiringRemove = new ArrayList<>();

    private int ticks = 0;

    private boolean waiting;

    /**
     * How long shall the players wait for the game to stopWaiting
     */
    protected abstract int getWaitingTime();

    /**
     * Start the game
     */
    protected abstract void startGame();

    /**
     * Tell a player that they have been registered as waiting for the game to stopWaiting
     */
    protected abstract void startWaiting(Player player);

    /**
     * Is the player in the lobby area
     */
    public abstract boolean isInLobby(Player player);

    /**
     * Update players interfaces etc...
     */
    public abstract void update(Player player);

    /**
     * Process this lobby
     */
    public synchronized void process() {
        refreshPlayers();
        for (Player player : getPlayers()) {
            if (!isInLobby(player)) removeWaiter(player);
            else update(player);
        }
        refreshPlayers();
        if (waiting && ticks++ > getWaitingTime()) stopWaiting();
    }

    /**
     * Remove players who need removing
     */
    protected synchronized void refreshPlayers() {
        players.removeAll(playersRequiringRemove);
        playersRequiringRemove.clear();
    }

    /**
     * The game has finished, start a new one
     */
    public void startWaiting() {
        waiting = true;
        ticks = 0;
    }

    /**
     * Wait is over, let the game start
     */
    private synchronized void stopWaiting() {
        waiting = false;
        //if we don't have players we won't start the game
        if (getPlayers().isEmpty()) startWaiting();
        else startGame();
    }

    /**
     * Remove process tasks related to removing the player from the lobby
     */
    public abstract void stopWaiting(Player player);

    /**
     * Add a player waiting for the game to stopWaiting
     */
    public synchronized void addWaiter(Player player) {
        startWaiting(player);
        players.add(player);
    }

    /**
     * A player leaves the waiting area
     */
    public synchronized void removeWaiter(Player player) {
        stopWaiting(player);
        playersRequiringRemove.add(player);
    }

    /**
     * Get the players waiting
     */
    public synchronized ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * How much longer in ticks
     */
    protected int getWaitLeft() {
        return getWaitingTime() - ticks;
    }
}

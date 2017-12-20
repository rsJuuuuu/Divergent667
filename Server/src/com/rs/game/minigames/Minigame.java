package com.rs.game.minigames;

import com.rs.game.player.Player;

import java.util.ArrayList;

/**
 * Created by Peng on 21.2.2017 22:33.
 */
public abstract class Minigame {

    private ArrayList<Player> participants = new ArrayList<>();
    private ArrayList<Player> playersToRemove = new ArrayList<>();

    protected abstract void startGame();

    protected abstract void updateGame();

    protected abstract void update(Player player);

    protected abstract void stop(Player player);

    public abstract boolean isInArea(Player player);

    public void start(final ArrayList<Player> participants) {
        this.participants = participants;
        startGame();
    }

    public void process() {
        refreshPlayers();
        for (Player player : participants)
            if (!isInArea(player)) removePlayer(player);
        refreshPlayers();
        updateGame();
        for (Player player : participants)
            update(player);
    }

    /**
     * Called when removing someone
     */
    private synchronized void removePlayer(Player player) {
        stop(player);
        playersToRemove.add(player);
    }

    /**
     * Remove players who need removing
     */
    private synchronized void refreshPlayers() {
        participants.removeAll(playersToRemove);
        playersToRemove.clear();
    }
}

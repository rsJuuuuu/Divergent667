package com.rs.game.minigames.pestControl;

import com.rs.game.minigames.Minigame;
import com.rs.game.minigames.pestControl.npcs.PestPortal;
import com.rs.game.player.Player;
import com.rs.game.tasks.SimpleTimer;
import com.rs.game.world.WorldTile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

/**
 * Created by Peng on 21.2.2017 22:42.
 */
public class PestGame extends Minigame {

    private ArrayList<PestPortal> portals = new ArrayList<>();


    private static final WorldTile EXIT_TILE = new WorldTile(2657, 2639, 0);

    private SimpleTimer portalTimer = new SimpleTimer(25);

    @Override
    protected void startGame() {
        portals.add(new PestPortal(6146, new WorldTile(2628, 2591)));
        portals.add(new PestPortal(6147, new WorldTile(2680, 2588)));
        portals.add(new PestPortal(6148, new WorldTile(2669, 2571)));
        portals.add(new PestPortal(6149, new WorldTile(2645, 2569)));
        //prepare the portals
        for (PestPortal portal : portals)
            portal.prepareForGame();
    }

    @Override
    protected void updateGame() {
        if (portalTimer.update()) {
            Optional<PestPortal> portalToOpen = portals.stream().filter(portal -> portal.isShielded() && !portal
                    .hasFinished()).findAny();
            portalToOpen.ifPresent(PestPortal::removeShield);
        }

    }

    @Override
    protected void update(Player player) {

    }

    @Override
    protected void stop(Player player) {

    }

    @Override
    public boolean isInArea(Player player) {
        return true;
    }

    private HashMap<String, Integer> damages = new HashMap<>();

    /**
     * Register the damage dealt by this player
     */
    void addDamage(Player source, int damage) {
        if (damages.containsKey(source.getUsername()))
            damages.put(source.getUsername(), damage + damages.get(source.getUsername()));
        else damages.put(source.getUsername(), damage);
    }
}

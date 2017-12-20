package com.rs.game.minigames.pestControl;

import com.rs.game.minigames.MinigameLobby;
import com.rs.game.player.Player;
import com.rs.game.world.WorldTile;
import com.rs.utils.areas.Rectangle;

import static com.rs.game.player.InterfaceManager.GameInterface.PEST_LANDER;

/**
 * Created by Peng on 20.2.2017 22:05.
 */
public class PestLobby extends MinigameLobby {

    private static final Rectangle LOBBY_AREA = new Rectangle(2663, 2644, 2660, 2638);
    private static final WorldTile ENTER_TILE = new WorldTile(2661, 2639, 0);

    @Override
    protected int getWaitingTime() {
        return 30;
    }

    @Override
    protected void startGame() {
        PestControl.getGame().start(getPlayers());
        for (Player player : getPlayers()) {
            removeWaiter(player);
        }
        refreshPlayers();
        startWaiting();
    }

    @Override
    protected void startWaiting(Player player) {
        player.setNextWorldTile(ENTER_TILE);
        player.sendMessage("You board the lander.");
        sendInterfaces(player);
    }

    @Override
    public boolean isInLobby(Player player) {
        //check if player is in lobby area or is just about to enter
        return LOBBY_AREA.contains(player) || LOBBY_AREA.contains(player.getNextWorldTile());
    }

    @Override
    public void update(Player player) {
        player.getPackets().sendIComponentText(407, 13, "Next Departure: " + (int) (getWaitLeft() * 0.6) + " sec");
    }

    @Override
    public void stopWaiting(Player player) {
        player.setNextWorldTile(new WorldTile(2657, 2613));
        player.getInterfaceManager().closeInterfaces(PEST_LANDER);
    }

    /**
     * Departure interface.
     */
    private void sendInterfaces(Player player) {
        player.getPackets().sendIComponentText(407, 13, "Next Departure: " + (int) (getWaitLeft() * 0.6) + " sec");
        player.getPackets().sendIComponentText(407, 14, "Players Ready: " + getPlayers().size());
        player.getPackets().sendIComponentText(407, 16, "Pest Points: " + Integer.toString(player.getPestPoints()));
        player.getPackets().sendIComponentText(407, 3, "Novice");
        player.getInterfaceManager().openInterfaces(PEST_LANDER);
    }

}

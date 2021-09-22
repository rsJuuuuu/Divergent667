package com.rs.game.minigames;

import com.rs.game.player.Player;

/**
 * Commence the war between 2 clans.
 * @author Own4g3
 *
 */
public class CommenceWar {

	/**
	 * Constructs a new instance.
	 * 
	 * @param player The player who's challenging.
	 * @param other The player who's opponent.
	 * @param war The war.
	 */
	public CommenceWar(Player player, Player other, War war) {
		player.getCurrentFriendChat().setWar(war);
		other.getCurrentFriendChat().setWar(war);
		sendInterface(player);
		sendInterface(other);
	}

	/**
	 * Sends the setup screen.
	 * @param player The player.
	 */
	public void sendInterface(final Player player) {
        Player other = (Player) player.getTemporaryAttributes().get("challenger");
        player.getPackets().sendIComponentText(791, 14, "Clan Wars Options: Challenging " + other.getDisplayName());
		player.getInterfaceManager().sendInterface(791);
		player.getInterfaceManager().sendInventoryInterface(792);
		player.getPackets().sendUnlockIComponentOptionSlots(791, 141, 0, 63, 0);
		player.setCloseInterfacesEvent(() -> end(player));
	}


	private void end(Player player) {
        Player other = (Player) player.getTemporaryAttributes().get("challenger");
        if (other != null) {
			other.getCurrentFriendChat().setWar(null);
            other.getTemporaryAttributes().remove("challenger");
            other.setCloseInterfacesEvent(null);
			other.closeInterfaces();
		}
		player.getCurrentFriendChat().setWar(null);
        player.getTemporaryAttributes().remove("challenger");
        player.setCloseInterfacesEvent(null);
		player.closeInterfaces();
	}

}

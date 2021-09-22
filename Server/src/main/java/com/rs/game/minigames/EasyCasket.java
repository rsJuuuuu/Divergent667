package com.rs.game.minigames;

import com.rs.game.player.Player;
import com.rs.utils.Utils;

/**
 * Represents the casket on which the prize is random.
 * 
 * @author Stephenn
 */

public class EasyCasket {

	private static final int[] CASKET_REWARDS = { 7370, 7372, 7374, 7376, 2583, 2585, 2587, 2589, 2591, 2593, 2595, 2597, 2599, 2639, 2641, 2643, 2653, 2655, 2657, 2659, 1127, 11235 };
	public static final int Easy_CASKET = 2714;

	public static boolean canOpen(Player p) {
		if (p.getInventory().containsItem(Easy_CASKET, 1)) {
			return true;
		} else {
			p.sendMessage("Wrong casket.");
			return false;
		}
	}

	public static void searchEasy(final Player p) {
		if (canOpen(p)) {
			p.getInventory().deleteItem(Easy_CASKET, 1);
			p.getInventory().addItem(995, Utils.random(10000000));
			p.getInventory().addItem(10476, Utils.random(100));
			p.getInventory().addItem(
					CASKET_REWARDS[Utils.random(getLength() - 2)], 1);
			p.sendMessage("You find some treasure in the casket.");
			p.getInventory().addItem(
					CASKET_REWARDS[Utils.random(getLength() - 2)], 1);
			p.sendMessage("You find some treasure in the casket.");
		}
	}

	public static int getLength() {
		return CASKET_REWARDS.length;
	}
	
}
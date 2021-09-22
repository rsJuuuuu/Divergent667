package com.rs.game.minigames;

import com.rs.game.player.Player;
import com.rs.utils.Utils;

/**
 * Represents the casket on which the prize is random.
 * 
 * @author Stephenn
 */

public class MedCasket {

	private static final int[] CASKET_REWARDS = { 2581, 2577, 2579, 15444, 15443, 15442, 15441, 4151, 861, 3481, 3483, 3485, 3486, 3488, 989, };
	public static final int MED_CASKET = 2802;

	public static boolean canOpen(Player p) {
		if (p.getInventory().containsItem(MED_CASKET, 1)) {
			return true;
		} else {
			p.sendMessage("Wrong casket.");
			return false;
		}
	}

	public static void searchMed(final Player p) {
		if (canOpen(p)) {
			p.getInventory().deleteItem(MED_CASKET, 1);
			p.getInventory().addItem(995, Utils.random(15000000));
			p.getInventory().addItem(10476, Utils.random(200));
			p.getInventory().addItem(11212, Utils.random(50));
			p.getInventory().addItem(
					CASKET_REWARDS[Utils.random(getLength() - 2)], 1);
			p.getInventory().addItem(
					CASKET_REWARDS[Utils.random(getLength() - 2)], 1);
			p.sendMessage("You find some treasure in the casket.");
		}
	}

	public static int getLength() {
		return CASKET_REWARDS.length;
	}
	
}
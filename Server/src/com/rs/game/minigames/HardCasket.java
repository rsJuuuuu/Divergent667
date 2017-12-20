package com.rs.game.minigames;

import com.rs.game.player.Player;
import com.rs.utils.Utils;

/**
 * Represents the casket on which the prize is random.
 * 
 * @author Stephenn
 */

public class HardCasket {

	private static final int[] CASKET_REWARDS = { 3472, 3474, 3476, 3478, 3479, 3480, 10374, 10376, 10378, 10380, 10382, 10384, 10386, 10388, 10390, 19335, 10404, 10406, 10408, 10410, 10412, 10414, 10416, 10418, 10422, 10424, 10426, 10428, 10430, 10432, 14034, 10436, 10438, 10330, 10332, 10334, 10336, 10338, 10340, 10342, 10344, 10346, 10348, 103450, 10352, };
	public static final int HARD_CASKET = 3521;

	public static boolean canOpen(Player p) {
		if (p.getInventory().containsItem(HARD_CASKET, 1)) {
			return true;
		} else {
			p.sendMessage("Wrong casket.");
			return false;
		}
	}

	public static void searchHard(final Player p) {
		if (canOpen(p)) {
			p.getInventory().deleteItem(HARD_CASKET, 1);
			p.getInventory().addItem(995, Utils.random(15000000));
			p.getInventory().addItem(10476, Utils.random(300));
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
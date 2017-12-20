package com.rs.game.player.dialogues.impl.base;

import com.rs.game.item.Item;
import com.rs.game.player.dialogues.Dialogue;

public class DestroyItemOption extends Dialogue {

	int slotId;
	Item item;

	@Override
	public void start() {
		slotId = (Integer) parameters[0];
		item = (Item) parameters[1];
		player.getInterfaceManager().sendChatBoxInterface(94);
		player.getPackets().sendIComponentText(94, 8,
				item.getDefinitions().getName());
		player.getPackets().sendIComponentText(94, 7,
				"If you destroy this item, you will have to earn it again.");
		player.getPackets().sendItemOnIComponent(94, 9, item.getId(), 1);
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (interfaceId == 94 && componentId == 3) {
			player.getInventory().deleteItem(slotId, item);
			player.getCharges().degradeCompletly(item);
			player.getPackets().sendSound(4500, 0, 1);
		}
		end();
	}

	@Override
	public void finish() {

	}

}

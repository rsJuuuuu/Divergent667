package com.rs.game.player.cutscenes.actions;

import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.world.ForceTalk;

public class NPCForceTalkAction extends CutsceneAction {

	private final String text;

	public NPCForceTalkAction(int cachedObjectIndex, String text,
							  int actionDelay) {
		super(cachedObjectIndex, actionDelay);
		this.text = text;
	}

	@Override
	public void process(Player player, Object[] cache) {
		Npc npc = (Npc) cache[getCachedObjectIndex()];
		npc.setNextForceTalk(new ForceTalk(text));
	}

}

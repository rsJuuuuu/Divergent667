package com.rs.game.player.cutscenes.actions;

import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.world.Graphics;

public class NPCGraphicAction extends CutsceneAction {

	private final Graphics gfx;

	public NPCGraphicAction(int cachedObjectIndex, Graphics gfx, int actionDelay) {
		super(cachedObjectIndex, actionDelay);
		this.gfx = gfx;
	}

	@Override
	public void process(Player player, Object[] cache) {
		Npc npc = (Npc) cache[getCachedObjectIndex()];
		npc.setNextGraphics(gfx);
	}

}

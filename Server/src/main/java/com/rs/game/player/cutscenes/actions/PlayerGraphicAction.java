package com.rs.game.player.cutscenes.actions;

import com.rs.game.player.Player;
import com.rs.game.world.Graphics;

public class PlayerGraphicAction extends CutsceneAction {

	private final Graphics gfx;

	public PlayerGraphicAction(Graphics gfx, int actionDelay) {
		super(-1, actionDelay);
		this.gfx = gfx;
	}

	@Override
	public void process(Player player, Object[] cache) {
		player.setNextGraphics(gfx);
	}

}

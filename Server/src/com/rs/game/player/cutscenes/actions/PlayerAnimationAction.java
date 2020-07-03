package com.rs.game.player.cutscenes.actions;

import com.rs.game.player.Player;
import com.rs.game.world.Animation;

public class PlayerAnimationAction extends CutsceneAction {

	private final Animation anim;

	public PlayerAnimationAction(Animation anim, int actionDelay) {
		super(-1, actionDelay);
		this.anim = anim;
	}

	@Override
	public void process(Player player, Object[] cache) {
		player.setNextAnimation(anim);
	}

}

package com.rs.game.player.cutscenes.actions;

import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.world.Animation;

public class NPCAnimationAction extends CutsceneAction {

	private final Animation anim;

	public NPCAnimationAction(int cachedObjectIndex, Animation anim,
							  int actionDelay) {
		super(cachedObjectIndex, actionDelay);
		this.anim = anim;
	}

	@Override
	public void process(Player player, Object[] cache) {
		Npc npc = (Npc) cache[getCachedObjectIndex()];
		npc.setNextAnimation(anim);
	}

}

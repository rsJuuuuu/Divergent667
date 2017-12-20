package com.rs.game.player.cutscenes;

import com.rs.game.world.Animation;
import com.rs.game.world.Graphics;
import com.rs.game.player.Player;
import com.rs.game.player.cutscenes.actions.*;

import java.util.ArrayList;

public class HomeCutScene extends Cutscene {

	@Override
	public boolean hiddenMinimap() {
		return true;
	}

	private static int GUTHIX = 1, GUARD1 = 2, GUARD2 = 3;

	@Override
	public CutsceneAction[] getActions(Player player) {
		ArrayList<CutsceneAction> actionsList = new ArrayList<>();
		// first part
		actionsList.add(new ConstructMapAction(360, 482, 3, 3));
		actionsList.add(new PlayerMusicEffectAction(215, -1));
		actionsList
				.add(new MovePlayerAction(10, 0, 0, Player.TELE_MOVE_TYPE, 0)); // out
		actionsList.add(new LookCameraAction(10, 8, 1000, -1));
		actionsList.add(new PosCameraAction(10, 0, 2000, 3));
		actionsList.add(new CreateNPCAction(GUTHIX, 8008, 10, 6, 0, -1));
		actionsList.add(new NPCFaceTileAction(GUTHIX, 10, 5, -1));
		actionsList.add(new NPCGraphicAction(GUTHIX, new Graphics(184), 2));

		actionsList.add(new NPCForceTalkAction(GUTHIX, "Holy Hell", 3));

		actionsList.add(new NPCForceTalkAction(GUTHIX, "ZENITH!", -1));
		actionsList.add(new NPCAnimationAction(GUTHIX, new Animation(2108), 3)); // headbang

		actionsList.add(new NPCFaceTileAction(GUTHIX, 9, 6, -1));
		actionsList
				.add(new MovePlayerAction(10, 6, 0, Player.TELE_MOVE_TYPE, -1));
		actionsList.add(new PlayerFaceTileAction(9, 5, -1));
		actionsList.add(new PlayerAnimationAction(new Animation(2111), -1));
		actionsList.add(new PlayerGraphicAction(new Graphics(184), 1));

		actionsList.add(new DestroyCachedObjectAction(GUTHIX, 0));

		actionsList.add(new PlayerFaceTileAction(9, 7, 1));

		actionsList.add(new PlayerFaceTileAction(8, 6, 1));

		actionsList.add(new PlayerFaceTileAction(10, 6, 1));

		actionsList.add(new PlayerForceTalkAction("Whoa!", 3));

		actionsList.add(new PlayerAnimationAction(new Animation(857), -1));
		actionsList.add(new PlayerForceTalkAction("Where am I?", 2));

		actionsList.add(new CreateNPCAction(GUARD1, 296, 3, 7, 0, -1));
		actionsList.add(new CreateNPCAction(GUARD2, 298, 3, 5, 0, -1));
		actionsList.add(new MoveNPCAction(GUARD1, 9, 7, false, 0));

		actionsList.add(new MoveNPCAction(GUARD2, 9, 5, false, 2));
		actionsList.add(new NPCForceTalkAction(GUARD1,
				"Noob, What are you Doing Here?!?!", 2));

		actionsList.add(new PlayerForceTalkAction("Doing Where?!", 2));

		actionsList.add(new NPCForceTalkAction(GUARD1, "You must not know, your on Zenith, its da best!",
				2));

		actionsList.add(new NPCForceTalkAction(GUARD2, "I cant believe he doesnt know!!!!!", 3));

		actionsList.add(new NPCForceTalkAction(GUARD1,
				"Lets Bring him to the home, so he can find stuff!", 3));


		actionsList.add(new PlayerForceTalkAction("HOME!?!?!?!?", 2));

		actionsList.add(new NPCForceTalkAction(GUARD2, "He is Definetly a noob.", 2));
		actionsList.add(new NPCForceTalkAction(GUARD2, "Its okay, he will come to like this server!", 2));
		
		actionsList.add(new MoveNPCAction(GUARD1, 15, 7, false, -1));
		actionsList.add(new MovePlayerAction(15, 6, false, -1));
		actionsList.add(new MoveNPCAction(GUARD2, 15, 5, false, 0));

		// second part
		actionsList.add(new ConstructMapAction(734, 590, 6, 9));
		actionsList.add(new PlayerMusicEffectAction(214, -1));
		actionsList.add(new CreateNPCAction(GUARD1, 296, 15, 30, 0, -1));
		actionsList.add(new CreateNPCAction(GUARD2, 298, 17, 30, 0, -1));
		actionsList.add(new MovePlayerAction(16, 29, 0, Player.TELE_MOVE_TYPE,
				0));
		actionsList.add(new PosCameraAction(14, 5, 4000, -1));
		actionsList.add(new LookCameraAction(14, 35, 2000, -1));
		actionsList.add(new MovePlayerAction(16, 39, false, -1));
		actionsList.add(new MoveNPCAction(GUARD1, 15, 40, false, -1));
		actionsList.add(new MoveNPCAction(GUARD2, 17, 40, false, -1));
		actionsList.add(new PosCameraAction(14, 35, 3000, 6, 6, 10));
		return actionsList.toArray(new CutsceneAction[actionsList.size()]);
	}

}

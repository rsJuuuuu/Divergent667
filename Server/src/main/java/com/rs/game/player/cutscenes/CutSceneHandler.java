package com.rs.game.player.cutscenes;

import org.pmw.tinylog.Logger;

import java.util.HashMap;

public class CutSceneHandler {

	private static final HashMap<Object, Class<Cutscene>> handledCutscenes = new HashMap<>();

	public static void init() {
		try {
			Class<Cutscene> value1 = (Class<Cutscene>) Class
					.forName(EdgeWilderness.class.getCanonicalName());
			handledCutscenes.put("EdgeWilderness", value1);
			Class<Cutscene> value3 = (Class<Cutscene>) Class
					.forName(NexCutScene.class.getCanonicalName());
			handledCutscenes.put("NexCutScene", value3);
			Class<Cutscene> value4 = (Class<Cutscene>) Class
					.forName(TowersPkCutscene.class.getCanonicalName());
			handledCutscenes.put("TowersPkCutscene", value4);
			Class<Cutscene> value5 = (Class<Cutscene>) Class
					.forName(HomeCutScene.class.getCanonicalName());
			handledCutscenes.put("HomeCutScene", value5);
		} catch (Throwable e) {
            Logger.error(e);
        }
	}

	public static void reload() {
		handledCutscenes.clear();
		init();
	}

	public static Cutscene getCutscene(Object key) {
		Class<Cutscene> classC = handledCutscenes.get(key);
		if (classC == null)
			return null;
		try {
			return classC.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}

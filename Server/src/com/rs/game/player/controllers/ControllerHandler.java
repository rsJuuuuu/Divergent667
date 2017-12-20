package com.rs.game.player.controllers;

import com.rs.utils.files.FileUtils;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class ControllerHandler {

	private static final HashMap<Object, Class<Controller>> handledControllers = new HashMap<>();

    /**
     * Reload controllers to cache
     */
    public static void init() {
        String fileLoc = "out/com/rs/game/player/controllers/impl";
        String packageDir = "com.rs.game.player.controllers.impl";

        try {
            List<Class> files = FileUtils.getClasses(new File(fileLoc), packageDir);
            for (Class c : files) {
                if (Controller.class.isAssignableFrom(c)) {
                    handledControllers.put("" + c.getSimpleName(), (Class<Controller>) Class.forName(c
                            .getCanonicalName()));
                }
            }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
        }
    }

    /**
     * Reset cached controllers
     */
	public static void reload() {
		handledControllers.clear();
		init();
    }

    /**
     * Get a specific controller
     * @param key controller name
     * @return the controller
     */
	public static Controller getController(Object key) {
		if (key instanceof Controller)
			return (Controller) key;
		Class<Controller> classC = handledControllers.get(key);
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

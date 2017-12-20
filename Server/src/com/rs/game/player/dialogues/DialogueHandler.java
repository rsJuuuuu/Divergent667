package com.rs.game.player.dialogues;

import com.rs.utils.files.FileUtils;
import org.pmw.tinylog.Logger;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public final class DialogueHandler {

    /**
     * Map containing the dialogues
     */
    private static final HashMap<Object, Class<Dialogue>> handledDialogues = new HashMap<>();

    /**
     * Load all dialogues
     */
    @SuppressWarnings("unchecked")
    public static final void init() {
        String fileLoc = "out/com/rs/game/player/dialogues/impl";
        String packageDir = "com.rs.game.player.dialogues.impl";

        try {
            List<Class> files = FileUtils.getClasses(new File(fileLoc), packageDir);
            for (Class c : files)
                if (Dialogue.class.isAssignableFrom(c)) handledDialogues.put(
                        "" + c.getSimpleName() + "", (Class<Dialogue>) Class.forName(c.getCanonicalName()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reload the files
     */
    public static void reload() {
        handledDialogues.clear();
        init();
    }

    /**
     * Get a specific cached dialogue
     *
     * @param key dialogueName
     * @return the dialogue
     */
    public static Dialogue getDialogue(Object key) {
        if (key instanceof Dialogue) return (Dialogue) key;
        Class<Dialogue> classD = handledDialogues.get(key);
        if (classD == null) return null;
        try {
            return classD.newInstance();
        } catch (Throwable e) {
            Logger.error(e);
        }
        return null;
    }

}

package com.rs.game.npc.combat;

import com.rs.game.npc.Npc;
import com.rs.game.world.Entity;
import com.rs.utils.Utils;
import org.pmw.tinylog.Logger;

import java.util.HashMap;

public class CombatScriptsHandler {

	private static final HashMap<Object, CombatScript> cachedCombatScripts = new HashMap<>();
	private static final CombatScript DEFAULT_SCRIPT = new Default();

	@SuppressWarnings("rawtypes")
	public static void init() {
		try {
			Class[] classes = Utils.getClasses("com.rs.game.npc.combat.impl");
			for (Class c : classes) {
				if (c.isAnonymousClass()) // next
					continue;
				Object o = c.newInstance();
				if (!(o instanceof CombatScript))
					continue;
				CombatScript script = (CombatScript) o;
				for (Object key : script.getKeys())
					cachedCombatScripts.put(key, script);
			}
		} catch (Throwable e) {
			Logger.error(e);
		}
	}

	static int specialAttack(final Npc npc, final Entity target) {
		CombatScript script = getScript(npc);
		return script.attack(npc, target);
	}

	public static CombatScript getScript(Npc npc){
		CombatScript script = cachedCombatScripts.get(npc.getId());
		if (script == null) {
			script = cachedCombatScripts.get(npc.getDefinitions().name);
			if (script == null)
				script = DEFAULT_SCRIPT;
		}
		return script;
	}
}

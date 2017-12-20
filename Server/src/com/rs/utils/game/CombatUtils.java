package com.rs.utils.game;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.npc.Npc;
import com.rs.game.npc.combat.CombatScriptsHandler;
import com.rs.game.npc.combat.impl.dragon.LeatherDragonCombat;
import com.rs.game.player.Player;
import com.rs.game.player.Prayer;
import com.rs.game.world.Entity;

public class CombatUtils {

    /**
     * Get the combat modifier of a given entity for given stat
     */
    public static double getCombatModifier(Entity entity, int skill) {
        double multiplier = 1;
        for (Effect effect : entity.getActiveEffects()) {
            if (entity instanceof Player) multiplier *= effect.getCombatModifier((Player) entity, skill);
            multiplier *= effect.getCombatModifier(skill);
        }
        return multiplier;
    }

    /**
     * How hard can we hit with dragon fire
     */
    public static int getDragonFireMaxHit(Entity entity, Entity source) {
        if (!(entity instanceof Player)) return 688;
        Player player = (Player) entity;
        int shieldId = player.getEquipment().getShieldId();
        boolean hasShield = shieldId == 1540 || shieldId == 11283 || shieldId == 11284;
        if (player.getFireImmuneLeft() > 0 && hasShield) return 0;
        if (player.getFireImmuneLeft() > 0 || hasShield) return 688 / 2;
        if (source instanceof Npc) {
            Npc npc = (Npc) source;
            if (player.getPrayer().usingPrayer(Prayer.PrayerSpell.DEFLECT_MAGIC, Prayer.PrayerSpell.PROTECT_MAGIC))
                if (CombatScriptsHandler.getScript(npc) instanceof LeatherDragonCombat) return 100;
                else return 450;

        }
        return 688;
    }

    /**
     * Sends a message when dragon fire hits a player
     */
    public static void sendDragonFireMessage(Player player, int damage, String type) {
        if (damage == 0) player.sendMessage("You manage to fully resist the " + type + ".", true);
        else if (damage < 150) player.sendMessage("You manage to resist most of the " + type + ".", true);
        else if (damage < 300) player.sendMessage("You manage to resist some of the " + type + ".", true);
        else player.sendMessage("You are horribly burned by the " + type + "!", true);
    }

    public static boolean hasFullVeracs(Player player) {
        return hasFullNamedSet(player, "Verac's");
    }

    public static boolean hasFullDharoks(Player player) {
        return hasFullNamedSet(player, "Dharok's");
    }

    private static boolean hasFullNamedSet(Player player, String setName) {
        int helmId = player.getEquipment().getHatId();
        int chestId = player.getEquipment().getChestId();
        int legsId = player.getEquipment().getLegsId();
        int weaponId = player.getEquipment().getWeaponId();
        return !(helmId == -1 || chestId == -1 || legsId == -1 || weaponId == -1)
               && ItemDefinitions.getItemDefinitions(helmId).getName().contains(setName)
               && ItemDefinitions.getItemDefinitions(chestId).getName().contains(setName)
               && ItemDefinitions.getItemDefinitions(legsId).getName().contains(setName)
               && ItemDefinitions.getItemDefinitions(weaponId).getName().contains(setName);
    }

    public static boolean hasFullVoid(Player player, int... helmIds) {
        boolean hasDeflector = player.getEquipment().getShieldId() == 19712;
        if (player.getEquipment().getGlovesId() != 8842) {
            if (hasDeflector) hasDeflector = false;
            else return false;
        }
        int legsId = player.getEquipment().getLegsId();
        boolean hasLegs = legsId != -1 && (legsId == 8840 || legsId == 19786 || legsId == 19788 || legsId == 19790);
        if (!hasLegs) {
            if (hasDeflector) hasDeflector = false;
            else return false;
        }
        int torsoId = player.getEquipment().getChestId();
        boolean hasTorso = torsoId != -1 && (torsoId == 8839 || torsoId == 10611 || torsoId == 19785 || torsoId == 19787
                                             || torsoId == 19789);
        if (!hasTorso) {
            if (hasDeflector) hasDeflector = false;
            else return false;
        }
        if (hasDeflector) return true;
        int hatId = player.getEquipment().getHatId();
        if (hatId == -1) return false;
        boolean hasHelm = false;
        for (int id : helmIds) {
            if (hatId == id) {
                hasHelm = true;
                break;
            }
        }
        return hasHelm;
    }

    public static int getDefenceEmote(Entity target) {
        if (target instanceof Npc) {
            Npc n = (Npc) target;
            return n.getCombatDefinitions().getDefenceEmote();
        } else {
            Player p = (Player) target;
            int shieldId = p.getEquipment().getShieldId();
            String shieldName =
                    shieldId == -1 ? null : ItemDefinitions.getItemDefinitions(shieldId).getName().toLowerCase();
            if (shieldId == -1 || (shieldName.contains("book") && shieldId != 18346)) {
                int weaponId = p.getEquipment().getWeaponId();
                if (weaponId == -1) return 424;
                if (ItemDefinitions.getItemDefinitions(weaponId).getName() == null) return 424;
                String weaponName = ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();
                if (weaponName.contains("scimitar") || weaponName.contains("korasi sword")) return 15074;
                if (weaponName.contains("whip")) return 11974;
                if (weaponName.contains("staff of light")) return 12806;
                if (weaponName.contains("longsword") || weaponName.contains("darklight")
                    || weaponName.contains("silverlight") || weaponName.contains("excalibur")) return 388;
                if (weaponName.contains("dagger")) return 378;
                if (weaponName.contains("rapier")) return 13038;
                if (weaponName.contains("pickaxe")) return 397;
                if (weaponName.contains("mace")) return 403;
                if (weaponName.contains("claws")) return 404;
                if (weaponName.contains("hatchet")) return 397;
                if (weaponName.contains("greataxe")) return 12004;
                if (weaponName.contains("wand")) return 415;
                if (weaponName.contains("staff")) return 420;
                if (weaponName.contains("warhammer") || weaponName.contains("tzhaar-ket-em")) return 403;
                if (weaponName.contains("maul") || weaponName.contains("tzhaar-ket-om")) return 1666;
                if (weaponName.contains("zamorakian spear")) return 12008;
                if (weaponName.contains("spear") || weaponName.contains("halberd") || weaponName.contains("hasta"))
                    return 430;
                if (weaponName.contains("2h sword") || weaponName.contains("godsword")
                    || weaponName.equals("saradomin sword")) return 7050;
                return 424;
            }
            if (shieldName != null) {
                if (shieldName.contains("shield")) return 1156;
                if (shieldName.contains("defender")) return 4177;
            }
            switch (shieldId) {
                case -1:
                default:
                    return 424;
            }
        }
    }
}

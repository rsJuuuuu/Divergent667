package com.rs.game.player;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.actions.combat.PlayerCombat;
import com.rs.utils.game.itemUtils.ItemBonuses;

import java.io.Serializable;

import static com.rs.utils.Constants.*;
import static com.rs.utils.Constants.BonusType.*;

public final class CombatDefinitions implements Serializable {

    private static final long serialVersionUID = 2102201264836121104L;

    public static final int SHARED = -1;
    private transient Player player;
    private transient boolean usingSpecialAttack;
    private transient int[] bonuses;

    // saving stuff

    private byte attackStyle;
    private byte specialAttackPercentage;
    private boolean autoRetaliate;
    private byte sortSpellBook;
    private boolean showCombatSpells;
    private boolean showSkillSpells;
    private boolean showMiscellaneousSpells;
    private boolean showTeleportSpells;
    private boolean defensiveCasting;
    private transient boolean dungeonneringSpellBook;
    private byte spellBook;
    private byte autoCastSpell;

    public int getSpellId() {
        Integer tempCastSpell = (Integer) player.getTemporaryAttributes().get("tempCastSpell");
        if (tempCastSpell != null) return tempCastSpell + 256;
        return autoCastSpell;
    }

    public int getAutoCastSpell() {
        return autoCastSpell;
    }

    public void resetSpells(boolean removeAutoSpell) {
        player.getTemporaryAttributes().remove("tempCastSpell");
        if (removeAutoSpell) {
            setAutoCastSpell(0);
            refreshAutoCastSpell();
        }
    }

    public void setAutoCastSpell(int id) {
        autoCastSpell = (byte) id;
        refreshAutoCastSpell();
    }

    private void refreshAutoCastSpell() {
        refreshAttackStyle();
        player.getPackets().sendConfig(108, getSpellAutoCastConfigValue());
    }

    private int getSpellAutoCastConfigValue() {
        if (dungeonneringSpellBook) return 0;
        if (spellBook == MODERN) {
            switch (autoCastSpell) {
                case 25:
                    return 3;
                case 28:
                    return 5;
                case 30:
                    return 7;
                case 32:
                    return 9;
                case 34:
                    return 11; // air bolt
                case 39:
                    return 13;// water bolt
                case 42:
                    return 15;// earth bolt
                case 45:
                    return 17; // fire bolt
                case 49:
                    return 19;// air blast
                case 52:
                    return 21;// water blast
                case 58:
                    return 23;// earth blast
                case 63:
                    return 25;// fire blast
                case 66: // Saradomin Strike
                    return 41;
                case 67:// Claws of Guthix
                    return 39;
                case 68:// Flames of Zammorak
                    return 43;
                case 70:
                    return 27;// air wave
                case 73:
                    return 29;// water wave
                case 77:
                    return 31;// earth wave
                case 80:
                    return 33;// fire wave
                case 84:
                    return 47;
                case 87:
                    return 49;
                case 89:
                    return 51;
                case 91:
                    return 53;
                case 99:
                    return 145;
                default:
                    return 0;
            }
        } else if (spellBook == ANCIENT) {
            switch (autoCastSpell) {
                case 28:
                    return 63;
                case 32:
                    return 65;
                case 24:
                    return 67;
                case 20:
                    return 69;
                case 30:
                    return 71;
                case 34:
                    return 73;
                case 26:
                    return 75;
                case 22:
                    return 77;
                case 29:
                    return 79;
                case 33:
                    return 81;
                case 25:
                    return 83;
                case 21:
                    return 85;
                case 31:
                    return 87;
                case 35:
                    return 89;
                case 27:
                    return 91;
                case 23:
                    return 93;
                default:
                    return 0;
            }
        } else {
            return 0;
        }
    }

    CombatDefinitions() {
        specialAttackPercentage = 100;
        autoRetaliate = true;
        showCombatSpells = true;
        showSkillSpells = true;
        showMiscellaneousSpells = true;
        showTeleportSpells = true;
    }

    public void setSpellBook(int id) {
        if (id == 3) dungeonneringSpellBook = true;
        else spellBook = (byte) id;
        refreshSpellBookScrollBar_DefCast();
        player.getInterfaceManager().sendMagicBook();
    }

    private void refreshSpellBookScrollBar_DefCast() {
        player.getPackets().sendConfig(439, (dungeonneringSpellBook ? 3 : spellBook) + (defensiveCasting ? 0 : 1 << 8));
    }

    public int getSpellBook() {
        if (dungeonneringSpellBook) return DUNGEONEERING_SPELLBOOK; // dung book
        else {
            if (spellBook == MODERN) return MODERN_SPELLBOOK;
            else if (spellBook == ANCIENT) return ANCIENT_SPELLBOOK;
            else return LUNAR_SPELLBOOK;
        }

    }

    public void switchShowCombatSpells() {
        showCombatSpells = !showCombatSpells;
        refreshSpellBook();
    }

    public void switchShowSkillSpells() {
        showSkillSpells = !showSkillSpells;
        refreshSpellBook();
    }

    public void switchShowMiscellaneousSpells() {
        showMiscellaneousSpells = !showMiscellaneousSpells;
        refreshSpellBook();
    }

    public void switchShowTeleportSkillSpells() {
        showTeleportSpells = !showTeleportSpells;
        refreshSpellBook();
    }

    public void switchDefensiveCasting() {
        defensiveCasting = !defensiveCasting;
        refreshSpellBookScrollBar_DefCast();
    }

    public void setSortSpellBook(int sortId) {
        this.sortSpellBook = (byte) sortId;
        refreshSpellBook();
    }

    public boolean isDefensiveCasting() {
        return defensiveCasting;
    }

    private void refreshSpellBook() {
        if (spellBook == MODERN) {
            player.getPackets().sendConfig(1376,
                    sortSpellBook | (showCombatSpells ? 0 : 1 << 9) | (showSkillSpells ? 0 : 1 << 10)
                    | (showMiscellaneousSpells ? 0 : 1 << 11) | (showTeleportSpells ? 0 : 1 << 12));
        } else if (spellBook == ANCIENT) {
            player.getPackets().sendConfig(1376,
                    sortSpellBook << 3 | (showCombatSpells ? 0 : 1 << 16) | (showTeleportSpells ? 0 : 1 << 17));
        } else if (spellBook == LUNAR) {
            player.getPackets().sendConfig(1376,
                    sortSpellBook << 6 | (showCombatSpells ? 0 : 1 << 13) | (showMiscellaneousSpells ? 0 : 1 << 14)
                    | (showTeleportSpells ? 0 : 1 << 15));
        }
    }

    public static int getMeleeDefenceBonus(int bonusId) {
        if (bonusId == STAB_ATTACK.getId()) return STAB_DEF.getId();
        if (bonusId == SLASH_DEF.getId()) return SLASH_DEF.getId();
        return CRUSH_DEF.getId();
    }

    public static int getMeleeBonusStyle(int weaponId, int attackStyle) {
        if (weaponId != -1) {
            String weaponName = ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();
            if (weaponName.contains("whip")) return SLASH_ATTACK.getId();
            if (weaponName.contains("staff of light")) {
                switch (attackStyle) {
                    case 0:
                        return STAB_ATTACK.getId();
                    case 1:
                        return SLASH_ATTACK.getId();
                    default:
                        return CRUSH_ATTACK.getId();
                }
            }
            if (weaponName.contains("staff") || weaponName.contains("granite mace") || weaponName.contains("warhammer")
                || weaponName.contains("tzhaar-ket-em") || weaponName.contains("tzhaar-ket-om")
                || weaponName.contains("staff of peace") || weaponName.contains("maul")) return CRUSH_ATTACK.getId();
            if (weaponName.contains("scimitar") || weaponName.contains("korasi's sword")
                || weaponName.contains("hatchet") || weaponName.contains("claws") || weaponName.contains("longsword")) {
                switch (attackStyle) {
                    case 2:
                        return STAB_ATTACK.getId();
                    default:
                        return SLASH_ATTACK.getId();
                }
            }
            if (weaponName.contains("mace") || weaponName.contains("anchor")) {
                switch (attackStyle) {
                    case 2:
                        return STAB_ATTACK.getId();
                    default:
                        return CRUSH_ATTACK.getId();
                }
            }
            if (weaponName.contains("halberd")) {
                switch (attackStyle) {
                    case 1:
                        return SLASH_ATTACK.getId();
                    default:
                        return STAB_ATTACK.getId();
                }
            }
            if (weaponName.contains("spear")) {
                switch (attackStyle) {
                    case 1:
                        return SLASH_ATTACK.getId();
                    case 2:
                        return CRUSH_ATTACK.getId();
                    default:
                        return STAB_ATTACK.getId();
                }
            }
            if (weaponName.contains("pickaxe")) {
                switch (attackStyle) {
                    case 2:
                        return CRUSH_ATTACK.getId();
                    default:
                        return STAB_ATTACK.getId();
                }
            }

            if (weaponName.contains("dagger") || weaponName.contains("rapier")) {
                switch (attackStyle) {
                    case 2:
                        return SLASH_ATTACK.getId();
                    default:
                        return STAB_ATTACK.getId();
                }
            }

            if (weaponName.contains("godsword") || weaponName.contains("greataxe") || weaponName.contains("2h sword")
                || weaponName.equals("saradomin sword")) {
                switch (attackStyle) {
                    case 2:
                        return CRUSH_ATTACK.getId();
                    default:
                        return SLASH_ATTACK.getId();
                }
            }

        }
        switch (weaponId) {
            default:
                return CRUSH_ATTACK.getId();
        }
    }

    public static int getXpStyle(int weaponId, int attackStyle) {
        if (weaponId != -1) {
            String weaponName = ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();
            if (weaponName.contains("whip")) {
                switch (attackStyle) {
                    case 0:
                        return Skills.ATTACK;
                    case 1:
                        return SHARED;
                    case 2:
                    default:
                        return Skills.DEFENCE;
                }
            }
            if (weaponName.contains("halberd")) {
                switch (attackStyle) {
                    case 0:
                        return SHARED;
                    case 1:
                        return Skills.STRENGTH;
                    case 2:
                    default:
                        return Skills.DEFENCE;
                }
            }
            if (weaponName.contains("staff")) {
                switch (attackStyle) {
                    case 0:
                        return Skills.ATTACK;
                    case 1:
                        return Skills.STRENGTH;
                    case 2:
                    default:
                        return Skills.DEFENCE;
                }
            }
            if (weaponName.contains("godsword") || weaponName.contains("sword") || weaponName.contains("2h")) {
                switch (attackStyle) {
                    case 0:
                        return Skills.ATTACK;
                    case 1:
                        return Skills.STRENGTH;
                    case 2:
                        return Skills.STRENGTH;
                    case 3:
                    default:
                        return Skills.DEFENCE;
                }
            }
        }
        switch (weaponId) {
            case -1:
                switch (attackStyle) {
                    case 0:
                        return Skills.ATTACK;
                    case 1:
                        return Skills.STRENGTH;
                    case 2:
                    default:
                        return Skills.DEFENCE;
                }
            default:
                switch (attackStyle) {
                    case 0:
                        return Skills.ATTACK;
                    case 1:
                        return Skills.STRENGTH;
                    case 2:
                        return SHARED;
                    case 3:
                    default:
                        return Skills.DEFENCE;
                }
        }
    }

    public void setPlayer(Player player) {
        this.player = player;
        bonuses = new int[18];
    }

    public int[] getBonuses() {
        return bonuses;
    }

    void refreshBonuses() {
        bonuses = new int[18];
        for (Item item : player.getEquipment().getItems().getItems()) {
            if (item == null) continue;
            int[] bonuses = ItemBonuses.getItemBonuses(item.getId());
            if (bonuses == null) continue;
            for (int id = 0; id < bonuses.length; id++) {
                if (id == 15 && this.bonuses[id] != 0) continue;
                this.bonuses[id] += bonuses[id];
            }
        }
    }

    public void resetSpecialAttack() {
        decreaseSpecial(0);
        specialAttackPercentage = 100;
        refreshSpecialAttackPercentage();
    }

    public void setSpecialAttack(int special) {
        decreaseSpecial(0);
        specialAttackPercentage = (byte) special;
        refreshSpecialAttackPercentage();
    }

    public void restoreSpecialAttack() {
        restoreSpecialAttack(10);
        if (player.getFollower() != null) player.getFollower().restoreSpecialAttack(15);
    }

    public void restoreSpecialAttack(int percentage) {
        if (specialAttackPercentage >= 100 || player.getInterfaceManager().containsScreenInter()) return;
        specialAttackPercentage +=
                specialAttackPercentage > (100 - percentage) ? 100 - specialAttackPercentage : percentage;
        refreshSpecialAttackPercentage();
    }

    public void init() {
        refreshUsingSpecialAttack();
        refreshSpecialAttackPercentage();
        refreshAutoRetaliate();
        refreshAttackStyle();
        refreshSpellBook();
        refreshAutoCastSpell();
        refreshSpellBookScrollBar_DefCast();
    }

    void checkAttackStyle() {
        if (autoCastSpell == 0) setAttackStyle(attackStyle);
    }

    public void setAttackStyle(int style) {
        int maxSize = 3;
        int weaponId = player.getEquipment().getWeaponId();
        String name = weaponId == -1 ? "" : ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();
        if (weaponId == -1 || PlayerCombat.isRanging(player) != 0 || name.contains("whip") || name.contains("halberd"))
            maxSize = 2;
        if (style > maxSize) style = maxSize;
        if (style != attackStyle) {
            attackStyle = (byte) style;
            if (autoCastSpell > 1) resetSpells(true);
            else refreshAttackStyle();
        } else if (autoCastSpell > 1) resetSpells(true);
    }

    private void refreshAttackStyle() {
        player.getPackets().sendConfig(43, autoCastSpell > 0 ? 4 : attackStyle);
    }

    void sendUnlockAttackStylesButtons() {
        for (int componentId = 11; componentId <= 14; componentId++)
            player.getPackets().sendUnlockIComponentOptionSlots(884, componentId, -1, 0, 0);
    }

    public void switchUsingSpecialAttack() {
        usingSpecialAttack = !usingSpecialAttack;
        refreshUsingSpecialAttack();
    }

    public void decreaseSpecial(int amount) {
        usingSpecialAttack = false;
        refreshUsingSpecialAttack();
        if (amount > 0) {
            specialAttackPercentage -= amount;
            if (specialAttackPercentage < 0) specialAttackPercentage = 0;
            refreshSpecialAttackPercentage();
        }
    }

    public boolean hasRingOfVigour() {
        return player.getEquipment().getRingId() == 19669;
    }

    public int getSpecialAttackPercentage() {
        return specialAttackPercentage;
    }

    private void refreshUsingSpecialAttack() {
        player.getPackets().sendConfig(301, usingSpecialAttack ? 1 : 0);
    }

    private void refreshSpecialAttackPercentage() {
        player.getPackets().sendConfig(300, specialAttackPercentage * 10);
    }

    public void switchAutoRetaliate() {
        autoRetaliate = !autoRetaliate;
        refreshAutoRetaliate();
    }

    private void refreshAutoRetaliate() {
        player.getPackets().sendConfig(172, autoRetaliate ? 0 : 1);
    }

    public boolean isUsingSpecialAttack() {
        return usingSpecialAttack;
    }

    public int getAttackStyle() {
        return attackStyle;
    }

    public boolean isAutoRetaliate() {
        return autoRetaliate;
    }

    public void setAutoRetaliate(boolean autoRetaliate) {
        this.autoRetaliate = autoRetaliate;
    }

    public boolean isDungeonneringSpellBook() {
        return dungeonneringSpellBook;
    }

    public void removeDungeonneringBook() {
        if (dungeonneringSpellBook) {
            dungeonneringSpellBook = false;
            player.getInterfaceManager().sendMagicBook();
        }
    }
}

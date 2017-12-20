package com.rs.game.player.actions.mining;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.world.Animation;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.actionHandling.Handler;
import com.rs.utils.Utils;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_1;
import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.HANDLED;
import static com.rs.game.actionHandling.HandlerManager.registerObjectAction;

public class EssenceMining extends Action implements Handler {

    @Override
    public void register() {
        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            player.getActionManager().setAction(new EssenceMining(object, player.getSkills().getLevel(Skills.MINING)
                                                                          < 30 ? EssenceDefinitions.Rune_Essence
                    : EssenceDefinitions.Pure_Essence));
            return HANDLED;
        }, 2491);
    }

    public EssenceMining(){}

    private enum EssenceDefinitions {
        Rune_Essence(1, 5, 1436, 1, 1),
        Pure_Essence(30, 5, 7936, 1, 1);
        private int level;
        private double xp;
        private int oreId;
        private int oreBaseTime;
        private int oreRandomTime;

        EssenceDefinitions(int level, double xp, int oreId, int oreBaseTime, int oreRandomTime) {
            this.level = level;
            this.xp = xp;
            this.oreId = oreId;
            this.oreBaseTime = oreBaseTime;
            this.oreRandomTime = oreRandomTime;
        }

        public int getLevel() {
            return level;
        }

        public double getXp() {
            return xp;
        }

        public int getOreId() {
            return oreId;
        }

        public int getOreBaseTime() {
            return oreBaseTime;
        }

        public int getOreRandomTime() {
            return oreRandomTime;
        }

    }

    private WorldObject rock;
    private EssenceDefinitions definitions;

    private int emoteId;
    private int pickaxeTime;

    public EssenceMining(WorldObject rock, EssenceDefinitions definitions) {
        this.rock = rock;
        this.definitions = definitions;
    }

    @Override
    public boolean start(Player player) {
        if (!checkAll(player)) return false;
        player.getPackets().sendGameMessage("You swing your pickaxe at the rock.");
        setActionDelay(player, getMiningDelay(player));
        return true;
    }

    private int getMiningDelay(Player player) {
        int mineTimer = definitions.getOreBaseTime() - player.getSkills().getLevel(Skills.MINING)
                        - Utils.getRandom(pickaxeTime);
        if (mineTimer < 1 + definitions.getOreRandomTime())
            mineTimer = 1 + Utils.getRandom(definitions.getOreRandomTime());
        mineTimer /= player.getAuraManager().getMininingAccurayMultiplier();
        return mineTimer;
    }

    private boolean checkAll(Player player) {
        if (!hasPickAxe(player)) {
            player.getPackets().sendGameMessage("You need a pickaxe to mine this rock.");
            return false;
        }
        if (!setPickAxe(player)) {
            player.getPackets().sendGameMessage("You dont have the required level to use this pickaxe.");
            return false;
        }
        if (!hasMiningLevel(player)) return false;
        if (!player.getInventory().hasFreeSlots()) {
            player.getPackets().sendGameMessage("Not enough space in your inventory.");
            return false;
        }
        return true;
    }

    private boolean hasMiningLevel(Player player) {
        if (definitions.getLevel() > player.getSkills().getLevel(Skills.MINING)) {
            player.getPackets().sendGameMessage(
                    "You need a mining level of " + definitions.getLevel() + " to mind this rock.");
            return false;
        }
        return true;
    }

    private boolean setPickAxe(Player player) {
        int level = player.getSkills().getLevel(Skills.MINING);
        int weaponId = player.getEquipment().getWeaponId();
        if (weaponId != -1) {
            switch (weaponId) {
                // case 15259: //dragon pickaxe
                // if(level >= 61) {
                // emoteId = 12190;
                // pickaxeTime = 13;
                // return true;
                // }
                // break;
                case 1275: // rune pickaxe
                    if (level >= 41) {
                        emoteId = 10342;
                        pickaxeTime = 10;
                        return true;
                    }
                    break;
                case 1271: // adam pickaxe
                    if (level >= 31) {
                        emoteId = 10347;
                        pickaxeTime = 7;
                        return true;
                    }
                    break;
                case 1273: // mith pickaxe
                    if (level >= 21) {
                        emoteId = 10346;
                        pickaxeTime = 5;
                        return true;
                    }
                    break;
                case 1269: // steel pickaxe
                    if (level >= 6) {
                        emoteId = 10345;
                        pickaxeTime = 3;
                        return true;
                    }
                    break;
                case 1267: // iron pickaxe
                    emoteId = 10344;
                    pickaxeTime = 2;
                    return true;
                case 1265: // bronze axe
                    emoteId = 10343;
                    pickaxeTime = 1;
                    return true;
                case 13661: // Inferno adze
                    if (level >= 61) {
                        emoteId = 10348;
                        pickaxeTime = 13;
                        return true;
                    }
                    break;
            }
        }
        // if(player.getInventory().containsOneItem(15259)) {
        // if(level >= 61) {
        // emoteId = 12190;
        // pickaxeTime = 13;
        // return true;
        // }
        // }
        if (player.getInventory().containsOneItem(1275)) {
            if (level >= 41) {
                emoteId = 10342;
                pickaxeTime = 10;
                return true;
            }
        }
        if (player.getInventory().containsOneItem(1271)) {
            if (level >= 31) {
                emoteId = 10347;
                pickaxeTime = 7;
                return true;
            }
        }
        if (player.getInventory().containsOneItem(1273)) {
            if (level >= 21) {
                emoteId = 10346;
                pickaxeTime = 5;
                return true;
            }
        }
        if (player.getInventory().containsOneItem(1269)) {
            if (level >= 6) {
                emoteId = 10345;
                pickaxeTime = 3;
                return true;
            }
        }
        if (player.getInventory().containsOneItem(1267)) {
            emoteId = 10344;
            pickaxeTime = 2;
            return true;
        }
        if (player.getInventory().containsOneItem(1265)) {
            emoteId = 10343;
            pickaxeTime = 1;
            return true;
        }
        if (player.getInventory().containsOneItem(13661)) {
            if (level >= 61) {
                emoteId = 10348;
                pickaxeTime = 13;
                return true;
            }
        }
        return false;

    }

    private boolean hasPickAxe(Player player) {
        if (player.getInventory().containsOneItem(15259, 1275, 1271, 1273, 1269, 1267, 1265, 13661)) return true;
        int weaponId = player.getEquipment().getWeaponId();
        if (weaponId == -1) return false;
        switch (weaponId) {
            case 1265:// Bronze PickAxe
            case 1267:// Iron PickAxe
            case 1269:// Steel PickAxe
            case 1273:// Mithril PickAxe
            case 1271:// Adamant PickAxe
            case 1275:// Rune PickAxe
                // case 15259://Dragon PickAxe
            case 13661: // Inferno adze
                return true;
            default:
                return false;
        }

    }

    @Override
    public boolean process(Player player) {
        player.setNextAnimation(new Animation(emoteId));
        return checkRock(player);
    }

    @Override
    public int processWithDelay(Player player) {
        addOre(player);
        if (!player.getInventory().hasFreeSlots()) {
            player.setNextAnimation(new Animation(-1));
            player.getPackets().sendGameMessage("Not enough space in your inventory.");
            return -1;
        }
        return getMiningDelay(player);
    }

    private void addOre(Player player) {
        double xpBoost = 1.0;
        player.getSkills().addXp(Skills.MINING, definitions.getXp() * xpBoost);
        player.getInventory().addItem(definitions.getOreId(), 1);
        String oreName = ItemDefinitions.getItemDefinitions(definitions.getOreId()).getName().toLowerCase();
        player.getPackets().sendGameMessage("You mine some " + oreName + ".", true);
    }

    private boolean checkRock(Player player) {
        return World.getRegion(rock.getRegionId()).containsObject(rock.getId(), rock);
    }

    @Override
    public void stop(Player player) {
        setActionDelay(player, 3);
    }
}

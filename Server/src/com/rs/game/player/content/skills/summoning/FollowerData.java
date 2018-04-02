package com.rs.game.player.content.skills.summoning;

import com.rs.game.item.Item;
import com.rs.game.npc.combat.impl.summoning.*;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Cooking;
import com.rs.game.player.actions.Fishing;
import com.rs.game.player.actions.herblore.HerbCleaning;
import com.rs.game.player.content.Foods;
import com.rs.game.world.*;
import com.rs.utils.Utils;

import static com.rs.utils.Constants.PURE_ESSENCE;
import static com.rs.utils.Constants.RUNE_ESSENCE;

/**
 * Created by Peng on 13.2.2017 10:28.
 * <p>
 * Follower data enum that holds info about all followers to be passed to  {@link Follower}
 */
public enum FollowerData {
    /*
    Pets
     */
    JAD(21512, 3604),
    HATCHLING_RED(12469, 6900),
    BABY_RED(12470, 6901),
    HATCHLING_BLUE(12471, 6902),
    BABY_BLUE(12472, 6903),
    HATCHLING_GREEN(12473, 6904),
    BABY_GREEN(12474, 6905),
    HATCHLING_BLACK(12475, 6906),
    BABY_BLACK(12476, 6907),
    BABY_PENGUIN(12481, 6908),
    PENGUIN(12482, 6909),
    RAVEN_CHICK(12484, 6911),
    RAVEN(12485, 6912),
    RACCOON(12487, 6914),
    BABY_GECKO(12488, 6915),
    GECKO(12489, 6916),
    BABY_SQUIRREL(12490, 6919),
    SQUIRREL(12491, 6920),
    BABY_CHAMELEON(12492, 6922),
    CHAMELEON(12493, 6923),
    BABY_MONKEY(12496, 6942),
    MONKEY(12497, 6943),
    VULTURE_CHICK(12498, 6945),
    VULTURE(12499, 6946),
    BABY_CRAB(12500, 6947),
    CRAB(12501, 6948),
    SARADOMIN_CHICK(12503, 6949),
    SARADOMIN_BIRD(12504, 6950),
    SARADOMIN_OWN(12505, 6951),
    ZAMORAK_CHICK(12506, 6952),
    ZAMORAK_BIRD(12507, 6953),
    ZAMORAK_HAWK(12508, 6954),
    GUTHIX_CHICK(12509, 6955),
    GUTHIX_BIRD(12510, 6956),
    GUTHIX_RAPTOR(12511, 6957),
    TERRIER_PUPPY(12512, 6958),
    TERRIER(12513, 6959),
    GREYHOUND_PUPPY(12514, 6960),
    GREYHOUND(12515, 6961),
    LABRADOR_PUPPY(12516, 6962),
    LABRADOR(12517, 6963),
    DALMATIAN_PUPPY(12518, 6964),
    DALMATIAN(12519, 6965),
    SHEEPDOG_PUPPY(12520, 6966),
    SHEEPDOG(12521, 6967),
    BULLDOG_PUPPY(12522, 6969),
    BULLDOG(12523, 6968),
    PHOENIX_EGGLING(14627, 8550),
    PHOENIX(14626, 8551),
    OVERGROWN_HELLCAT(7581, 3503),
    HELLCAT(7582, 3504),
    HELL_KITTEN(7583, 3505),
    LAZY_HELLCAT(7584, 3506),
    WILY_HELLCAT(7585, 3507),
    /*
    Familiars
     */
    /**
     * Steel titan, uses {@link SteelTitanCombat}
     */
    STEEL_TITAN(7344, 64, 4.9, 0, true, PouchData.STEEL_TITAN, SpecialAttack.ENTITY, "Steel of Legends",
            "Steel titan's" + " next " + "attack will" + " be four " + "powerful " + "Ranged " + "attacks", 12, 8188),
    PACK_YAK(6874, 58, 4.8, 0, false, PouchData.PACK_YAK, SpecialAttack.ITEM, "Winter Storage",
            "Use special on an " + "item in your " + "inventory to send " + "it to your bank", 12) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            int slotId = (Integer) object;
            if (follower.getOwner().getBank().hasBankSpace()) {
                follower.getOwner().getBank().depositItem(slotId, 1, false);
                follower.getOwner().getPackets().sendGameMessage("Your Pack Yak has sent an item to your bank.");
                follower.getOwner().setNextGraphics(new Graphics(1316));
                follower.getOwner().setNextAnimation(new Animation(7660));
            }
        }

        @Override
        public int getMaxCarriedItems() {
            return 30;
        }
    },
    /**
     * Iron titan, uses {@link IronTitanCombat}
     */
    IRON_TITAN(7376, 60, 4.7, 0, true, PouchData.IRON_TITAN, SpecialAttack.ENTITY, "Iron Within",
            "Iron titan's next " + "attack will be " + "three powerful " + "melee attacks", 12),
    /**
     * Abyssal titan, uses {@link AbyssalTitanCombat}
     */
    ABYSSAL_TITAN(7350, 32, 1.9, 0, true, PouchData.ABYSSAL_TITAN, SpecialAttack.CLICK, "Essence Shipment",
            "Transports all pure essence from your inventory and titan's to your bank", 6) {
        @Override
        public boolean isAbyssalCreature() {
            return true;
        }

        @Override
        public int getMaxCarriedItems() {
            return 20;
        }

        @Override
        public void submitSpecial(Follower follower, Object object) {
            int numberOfRuneEss = follower.getOwner().getInventory().numberOf(RUNE_ESSENCE)
                                  + follower.getBob().getBeastItems().getNumberOf(RUNE_ESSENCE);
            int numberOfPureEss = follower.getOwner().getInventory().numberOf(PURE_ESSENCE)
                                  + follower.getBob().getBeastItems().getNumberOf(PURE_ESSENCE);
            if (numberOfPureEss == 0 && numberOfRuneEss == 0) {
                follower.getOwner().sendMessage("You don't have any essence");
                return;
            }
            follower.getBob().getBeastItems().clear();
            follower.getOwner().getBank().addItem(RUNE_ESSENCE, numberOfRuneEss, false);
            follower.getOwner().getBank().addItem(PURE_ESSENCE, numberOfPureEss, false);
            //just delete as many as they had, it doesnt matter as all of them go
            follower.getOwner().getInventory().deleteItem(RUNE_ESSENCE, numberOfRuneEss);
            follower.getOwner().getInventory().deleteItem(PURE_ESSENCE, numberOfPureEss);
            follower.getOwner().setNextGraphics(new Graphics(1316));
            follower.getOwner().setNextAnimation(new Animation(7660));
        }
    },
    WOLPERTINGER(6870, 62, 4.6, 0, true, PouchData.WOLPERTINGER, SpecialAttack.CLICK, "Magic Focus",
            "Boosts your " + "Magic level by" + " 7", 20) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            int newLevel = player.getSkills().getLevel(Skills.MAGIC) + 7;
            if (newLevel > player.getSkills().getLevelForXp(Skills.MAGIC) + 7)
                newLevel = player.getSkills().getLevelForXp(Skills.MAGIC) + 7;
            player.setNextGraphics(new Graphics(1300));
            player.setNextAnimation(new Animation(7660));
            player.getSkills().set(Skills.MAGIC, newLevel);
        }
    },
    /**
     * Geyser titan, uses {@link GeyserTitanCombat}
     */
    GEYSER_TITAN(7340, 69, 8.9, 0, true, PouchData.GEYSER_TITAN, SpecialAttack.ENTITY, "Boil",
            "Damages a player, more " + "depending on their " + "armor", 6),
    UNICORN_STALLION(6823, 54, 1.8, 0, false, PouchData.UNICORN_STALLION, SpecialAttack.CLICK, "Healing Aura",
            "Heals " + "up " + "to " + "15% " + "of " + "your" + " Life Points", 20) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            if (player.getHealth() == player.getMaxHitPoints()) player.getPackets().sendGameMessage(
                    "You need to have at least some damage before being able to heal " + "yourself.");
            else {
                player.setNextAnimation(new Animation(7660));
                player.setNextGraphics(new Graphics(1300));
                int percentHealed = player.getMaxHitPoints() / 15;
                player.heal(percentHealed);
            }
        }
    },
    /**
     * Rune minotaur, uses {@link MinotaurCombat}
     */
    RUNE_MINOTAUR(6864, 151, 8.7, 0, true, PouchData.RUNE_MINOTAUR, SpecialAttack.ENTITY, "Rune Bull Rush",
            "Magic attack that damages up to 190 with a chance of " + "stun", 6),
    /**
     * Swamp titan, uses {@link SwampTitanCombat}
     */
    SWAMP_TITAN(7330, 56, 4.2, 0, true, PouchData.SWAMP_TITAN, SpecialAttack.ENTITY, "Swamp Plague",
            "Area effect Magic" + " that can " + "poison your " + "enemies", 6),
    /**
     * Lava titan, uses {@link LavaTitanCombat}
     */
    LAVA_TITAN(7342, 61, 8.3, 0, true, PouchData.LAVA_TITAN, SpecialAttack.ENTITY, "Ebon Thunder",
            "Magic attack that " + "drains your " + "opponent's " + "Special Attack " + "energy", 4),
    /**
     * Adamant minotaur, uses {@link MinotaurCombat}
     */
    ADAMANT_MINOTAUR(6862, 66, 7.6, 0, true, PouchData.ADAMANT_MINOTAUR, SpecialAttack.ENTITY, "Adamant Bull Rush",
            "Magic attack that damages up to 160 with a chance of stun", 6),
    BUNYIP(6814, 44, 1.4, 0, false, PouchData.BUNYIP, SpecialAttack.ITEM, "Swallow Whole",
            "Allows you to eat " + "uncooked fish if you " + "have the level to cook " + "it", 3) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Item item = follower.getOwner().getInventory().getItem((Integer) object);
            for (Fishing.Fish fish : Fishing.Fish.values()) {
                if (fish.getId() == item.getId()) {
                    if (follower.getOwner().getSkills().getLevel(Skills.COOKING) < fish.getLevel()) {
                        follower.getOwner().getPackets().sendGameMessage(
                                "Your cooking level is not high enough for " + "the bunyip to eat this fish.");
                        return;
                    } else {
                        follower.getOwner().setNextGraphics(new Graphics(1316));
                        follower.getOwner().setNextAnimation(new Animation(7660));
                        follower.getOwner().heal(Foods.Food.forId(Cooking.Cookables.forId((short) item.getId())
                                .getProduct().getId()).getHeal());
                        follower.getOwner().getInventory().deleteItem(item.getId(), item.getAmount());
                        return;
                    }
                }
            }
            follower.getOwner().getPackets().sendGameMessage("Your bunyip can't eat this.");
        }
    },
    WAR_TORTOISE(6816, 43, 0.7, 0, false, PouchData.WAR_TORTOISE, SpecialAttack.CLICK, "Testudo",
            "Boosts your Defence" + " level by 8", 20) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            int newLevel = player.getSkills().getLevel(Skills.DEFENCE) + 9;
            if (newLevel > player.getSkills().getLevelForXp(Skills.DEFENCE) + 9)
                newLevel = player.getSkills().getLevelForXp(Skills.DEFENCE) + 9;
            player.setNextGraphics(new Graphics(1300));
            player.setNextAnimation(new Animation(7660));
            player.getSkills().set(Skills.DEFENCE, newLevel);
        }

        @Override
        public int getMaxCarriedItems() {
            return 18;
        }
    },
    /**
     * Mithril minotaur, uses {@link MinotaurCombat}
     */
    MITHRIL_MINOTAUR(6860, 55, 6.6, 0, true, PouchData.MITHRIL_MINOTAUR, SpecialAttack.ENTITY, "Mithril Bull Rush",
            "Magic attack that damages up to 120 with a chance of stun", 6),
    /**
     * Steel minotaur, uses {@link MinotaurCombat}
     */
    STEEL_MINOTAUR(6858, 46, 5.6, 0, true, PouchData.STEEL_MINOTAUR, SpecialAttack.ENTITY, "Steel Bull Rush",
            "Magic " + "attack" + " that " + "damages " + "up to " + "90 " + "with a" + " chance of stun", 6),
    SPIRIT_TERRORBIRD(6795, 36, 0.8, 0, false, PouchData.SPIRIT_TERRORBIRD, SpecialAttack.CLICK, "Tireless Run", "+2 Agility boost and restores run energy based on your Agility level", 8) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            if (player.getRunEnergy() == 100) {
                player.getPackets().sendGameMessage("This wouldn't effect you at all.");
                return;
            }
            int newLevel = player.getSkills().getLevel(Skills.AGILITY) + 2;
            int runEnergy = player.getRunEnergy() + (Math.round(newLevel / 2));
            if (newLevel > player.getSkills().getLevelForXp(Skills.AGILITY) + 2)
                newLevel = player.getSkills().getLevelForXp(Skills.AGILITY) + 2;
            follower.setNextAnimation(new Animation(8229));
            player.setNextGraphics(new Graphics(1300));
            player.setNextAnimation(new Animation(7660));
            player.getSkills().set(Skills.AGILITY, newLevel);
            player.setRunEnergy(runEnergy > 100 ? 100 : runEnergy);
        }

        @Override
        public int getMaxCarriedItems() {
            return 12;
        }
    },
    /**
     * Iron minotaur, uses {@link MinotaurCombat}
     */
    IRON_MINOTAUR(6856, 37, 4.6, 0, true, PouchData.IRON_MINOTAUR, SpecialAttack.NONE, "Iron Bull Rush",
            "Magic " + "attack " + "that " + "damages " + "up to 60 " + "with a " + "chance of" + " stun", 6),
    MACAW(6852, 31, 0.8, 0, false, PouchData.MACAW, SpecialAttack.CLICK, "Herbcall", "Chance of making herbs", 12) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            HerbCleaning.Herbs herb;
            player.setNextGraphics(new Graphics(1300));
            player.setNextAnimation(new Animation(7660));
            if (Utils.getRandom(100) == 0)
                herb = HerbCleaning.Herbs.values()[Utils.random(HerbCleaning.Herbs.values().length)];
            else herb = HerbCleaning.Herbs.values()[Utils.getRandom(3)];
            World.addGroundItem(new Item(herb.getHerbId(), 1), player);
        }
    },
    BULL_ANT(6868, 30, 0.6, 0, false, PouchData.BULL_ANT, SpecialAttack.CLICK, "Unburden",
            "Restores run energy based " + "on your Agility level", 12) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            if (player.getRunEnergy() == 100) {
                player.getPackets().sendGameMessage("This wouldn't effect you at all.");
                return;
            }
            int agilityLevel = follower.getOwner().getSkills().getLevel(Skills.AGILITY);
            int runEnergy = player.getRunEnergy() + (Math.round(agilityLevel / 2));
            player.setNextGraphics(new Graphics(1300));
            player.setNextAnimation(new Animation(7660));
            player.setRunEnergy(runEnergy > 100 ? 100 : runEnergy);

        }

        @Override
        public int getMaxCarriedItems() {
            return 9;
        }
    },
    /**
     * Bronze minotaur, uses {@link MinotaurCombat}
     */
    BRONZE_MINOTAUR(6854, 30, 3.6, 0, true, PouchData.BRONZE_MINOTAUR, SpecialAttack.ENTITY, "Bronze Bull Rush",
            "Magic" + " attack that damages up to 40 with a chance of stun", 6) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            player.setNextGraphics(new Graphics(1316));
            player.setNextAnimation(new Animation(7660));
        }
    },
    GRANITE_CRAB(6797, 18, 0.2, 0, false, PouchData.GRANITE_CRAB, SpecialAttack.CLICK, "Stony Shell",
            "Boosts your " + "Defence by " + "4", 12) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            int newLevel = player.getSkills().getLevel(Skills.DEFENCE) + 4;
            if (newLevel > player.getSkills().getLevelForXp(Skills.DEFENCE) + 4)
                newLevel = player.getSkills().getLevelForXp(Skills.DEFENCE) + 4;
            player.setNextGraphics(new Graphics(1300));
            player.setNextAnimation(new Animation(7660));
            follower.setNextGraphics(new Graphics(8108));
            follower.setNextAnimation(new Animation(1326));
            player.getSkills().set(Skills.DEFENCE, newLevel);
        }
    },
    SPIRIT_SPIDER(6841, 15, 0.2, 2, true, PouchData.SPIRIT_SPIDER, SpecialAttack.CLICK, "Egg spawn",
            "Spawns a random" + " amount of " + "red spider " + "eggs", 6) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            follower.setNextAnimation(new Animation(8267));
            player.setNextAnimation(new Animation(7660));
            player.setNextGraphics(new Graphics(1316));
            WorldTile tile;
            for (int count = 0; count < Utils.getRandom(10); count++) {
                tile = new WorldTile(follower, 2);
                if (World.canMoveNPC(follower.getPlane(), tile.getX(), tile.getY(), player.getSize())) return;
                for (Entity entity : follower.getPossibleTargets()) {
                    if (entity instanceof Player) {
                        Player players = (Player) entity;
                        players.getPackets().sendGraphics(new Graphics(1342), tile);
                    }
                    World.addGroundItem(new Item(223, 1), tile, player, false, 120, true);
                }
            }
        }
    },
    //TODO Missing special and combat
    SPIRIT_DAGANNOTH(6805, 57, 4.1, 0, true, PouchData.SPIRIT_DAGANNOTH, SpecialAttack.ENTITY, "Spike Spot",
            "Range " + "attack " + "that " + "damages" + " up to " + "180 and" + " stuns", 6),
    HYDRA(6812, 49, 1.6, 0, true, PouchData.HYDRA, SpecialAttack.OBJECT, "Regrowth",
            "Use on a Farming tree stump to " + "instantly grow back", 6),
    GIANT_ENT(6810, 49, 1.6, 0, true, PouchData.GIANT_ENT, SpecialAttack.NONE, "Acorn Missile",
            "Damages up to 170 on" + " up to 3 enemies " + "and a chance of " + "acorns being " + "dropped", 6),
    TALON_BEAST(7348, 49, 3.8, 0, true, PouchData.TALON_BEAST, SpecialAttack.NONE, "Deadly Claw",
            "Commands Talon " + "beast to do 3 " + "Magic attacks", 6),
    FORGE_REGENT(7336, 45, 1.5, 0, true, PouchData.FORGE_REGENT, SpecialAttack.NONE, "Inferno",
            "Magic attack that " + "can unequip your " + "opponent's weapon " + "or shield", 6),
    PRAYING_MANTIS(6799, 69, 3.7, 0, true, PouchData.PRAYING_MANTIS, SpecialAttack.NONE, "Mantis Strike",
            "Binds, " + "causes " + "Magic-based damage, and drains player's Prayer points", 6),
    GRANITE_LOBSTER(6850, 47, 3.7, 0, false, PouchData.GRANITE_LOBSTER, SpecialAttack.NONE, "Crushing Claw",
            "Damages up to " + "140 as well " + "as removing " + "up to 5 " + "Defence from " + "opponent", 6),
    OBSIDIAN_GOLEM(7346, 55, 7.3, 0, true, PouchData.OBSIDIAN_GOLEM, SpecialAttack.NONE, "Volcanic Strength",
            "Boosts" + " your Strength by 9", 12),
    ARCTIC_BEAR(6840, 28, 1.1, 0, true, PouchData.ARCTIC_BEAR, SpecialAttack.NONE, "Arctic Blast",
            "Magic attack that" + " damages up to " + "150 with a " + "chance to " + "stun", 6),
    RAVENOUS_LOCUST(7374, 24, 1.5, 0, true, PouchData.RAVENOUS_LOCUST, SpecialAttack.NONE, "Famine",
            "Destroys " + "opponent's " + "food", 12),
    FRUIT_BAT(6817, 45, 1.4, 0, false, PouchData.FRUIT_BAT, SpecialAttack.NONE, "Fruitfall",
            "Produces random fruit " + "nearby", 6),
    BARKER_TOAD(6890, 8, 1.0, 0, true, PouchData.BARKER_TOAD, SpecialAttack.NONE, "Toad Bark", "Damages up to 180", 6),
    STRANGER_PLANT(6828, 49, 3.2, 0, true, PouchData.STRANGER_PLANT, SpecialAttack.NONE, "Poisonous Blast",
            "Attack " + "with a" + " 50% " + "chance" + " of " + "poison" + " and " + "inflicting 2 damage", 6),
    SPIRIT_COBRA(6803, 56, 3.1, 0, true, null, SpecialAttack.NONE, "Ophidian Incubation",
            "Transforms an" + " egg into a" + " Cockatrice" + " egg", 3),
    ABYSSAL_LURKER(6821, 41, 1.2, 0, false, PouchData.ABYSSAL_LURKER, SpecialAttack.NONE, "Abyssal Stealth", "+4 boost to Agility and Thieving", 20) {
        @Override
        public boolean isAbyssalCreature() {
            return true;
        }

        @Override
        public int getMaxCarriedItems() {
            return 12;
        }
    },
    SMOKE_DEVIL(6866, 48, 3.0, 0, true, PouchData.SMOKE_DEVIL, SpecialAttack.NONE, "Dust Cloud",
            "Damages up to 80 " + "and up to 60 on " + "nearby " + "opponents", 6),
    KARAMTHULHU_OVERLORD(6810, 44, 5.8, 0, true, PouchData.KARAMTHULHU_OVERLORD, SpecialAttack.NONE,
            "Doomsphere " + "Device", "Damages" + " up " + "to " + "160", 3),
    SPIRIT_LARUPIA(7338, 49, 5.7, 0, true, PouchData.SPIRIT_LARUPIA, SpecialAttack.NONE, "Rending",
            "Magic-based " + "attack which " + "also drains " + "opponent's " + "Strength", 6),
    SPIRIT_KYATT(7366, 49, 5.7, 0, true, PouchData.SPIRIT_KYATT, SpecialAttack.NONE, "Ambush",
            "Commands your kyatt " + "to attack with an " + "instant hit and " + "potentially high " + "damage", 3),
    SPIRIT_GRAAHK(7364, 49, 5.7, 0, true, PouchData.SPIRIT_GRAAHK, SpecialAttack.NONE, "Goad",
            "Commands your graahk " + "to attack", 3),
    IBIS(13624, 38, 1.1, 0, false, PouchData.IBIS, SpecialAttack.NONE, "Fish Rain", "Produces fish up to Bass", 12),
    SPIRIT_JELLY(6993, 43, 5.5, 0, true, PouchData.SPIRIT_JELLY, SpecialAttack.NONE, "Dissolve",
            "Magic attack that " + "damages up to 120" + " and drains the " + "opponent's " + "Attack", 6),
    ABYSSAL_PARASITE(6819, 30, 1.1, 0, false, PouchData.ABYSSAL_PARASITE, SpecialAttack.NONE, "Abyssal Drain",
            "Magic" + " attack that gives you a Prayer point if it hits", 6) {
        @Override
        public boolean isAbyssalCreature() {
            return true;
        }

        @Override
        public int getMaxCarriedItems() {
            return 7;
        }
    },
    BLOATED_LEECH(6844, 34, 2.4, 0, true, PouchData.BLOATED_LEECH, SpecialAttack.NONE, "Blood Drain",
            "Heals stat " + "damage, " + "poison, and " + "disease at " + "the cost of " + "some Life " + "Points", 6),
    MAGPIE(6824, 34, 0.9, 0, false, PouchData.MAGPIE, SpecialAttack.NONE, "Thieving Fingers", "+2 Thieving boost", 12),
    PYRELORD(7378, 32, 2.3, 0, true, PouchData.PYRELORD, SpecialAttack.NONE, "Immense Heat",
            "Smelts a gold bar into " + "an item of jewellery " + "without a furnace", 6),
    EVIL_TURNIP(6834, 30, 2.1, 0, true, PouchData.EVIL_TURNIP, SpecialAttack.NONE, "Evil Flames",
            "Magic attack that " + "drains an " + "opponent's " + "Ranged skill", 6),
    VAMPYRE_BAT(6836, 33, 1.5, 0, true, PouchData.VAMPYRE_BAT, SpecialAttack.NONE, "Vampyre Touch",
            "Damages up to " + "120 with a " + "chance of " + "restoring 20 " + "of your own " + "Life Points", 4),
    BEAVER(6808, 27, 0.7, 0, false, PouchData.BEAVER, SpecialAttack.OBJECT, "Multichop",
            "Cuts up to 3 logs on a nearby" + " tree", 3) {
    },
    HONEY_BADGER(6846, 25, 1.6, 0, true, PouchData.HONEY_BADGER, SpecialAttack.ENTITY, "Insane Ferocity",
            "Reduces its " + "Defence to" + " increase " + "its Attack" + " and " + "Strength", 12),
    GIANT_CHINCHOMPA(7354, 31, 2.9, 0, true, PouchData.GIANT_CHINCHOMPA, SpecialAttack.NONE, "Explode",
            "Detonates " + "the " + "chinchompa, " + "damaging " + "nearby " + "enemies", 3),
    COMPOST_MOUND(6872, 24, 0.6, 0, false, PouchData.COMPOST_MOUND, SpecialAttack.CLICK, "Generate Compost",
            "Fills " + "nearby" + " compost bin with a chance of making supercompost", 12),
    SPIRIT_KALPHITE(6995, 22, 2.5, 0, false, PouchData.SPIRIT_KALPHITE, SpecialAttack.NONE, "Sandstorm",
            "Strikes up " + "to 5 " + "enemies " + "for up to" + " 20 " + "damage", 6) {
        @Override
        public int getMaxCarriedItems() {
            return 6;
        }
    },
    ALBINO_RAT(6848, 22, 2.3, 0, true, PouchData.ALBINO_RAT, SpecialAttack.CLICK, "Cheese Feast",
            "Stores 4 cheese in " + "the rat's " + "inventory", 6) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            player.setNextGraphics(new Graphics(1316));
            player.setNextAnimation(new Animation(7660));
            //TODO add 4 cheese to familiar inv
        }
    },
    SPIRIT_TZ_KIH(7362, 18, 1.1, 0, true, PouchData.SPIRIT_TZ_KIH, SpecialAttack.ENTITY, "Fireball Assault",
            "Hits two " + "nearby " + "enemies" + " up to " + "70 " + "damage", 6),
    SPIRIT_SCORPION(6838, 17, 0.9, 0, true, PouchData.SPIRIT_SCORPION, SpecialAttack.ENTITY, "Venom Shot",
            "Change of making a Range attack of yours be slightly"
            + " poisonous, if the arrows can be poisoned in the first place", 6),
    DESERT_WYRM(6832, 19, 0.4, 0, false, PouchData.DESERT_WYRM, SpecialAttack.ENTITY, "Electric Lash",
            "Magic attack " + "that does 50 " + "damage and " + "stuns your " + "opponent", 12),
    MOSQUITO(7332, 12, 0.5, 0, true, PouchData.MOSQUITO, SpecialAttack.ENTITY, "Pester",
            "Commands mosquito to " + "attack", 3),
    THORNY_SNAIL(6807, 16, 0.2, 0, true, PouchData.THORNY_SNAIL, SpecialAttack.ENTITY, "Slime Spray",
            "Attack that damages " + "up to 80", 3),
    DREADFOWL(6826, 4, 0.1, 0, true, PouchData.DREADFOWL, SpecialAttack.NONE, "Dreadfowl Strike",
            "Magic attack that " + "damages up to " + "30", 3),
    SPIRIT_WOLF(6830, 6, 0.1, 1, true, PouchData.SPIRIT_WOLF, SpecialAttack.ENTITY, "Howl",
            "Scares non-player opponents, causing them to retreat. "
            + "However, this lasts for only a few seconds.", 3) {
        @Override
        public void submitSpecial(Follower follower, Object object) {
            Player player = (Player) object;
            player.setNextAnimation(new Animation(7660));
            player.setNextGraphics(new Graphics(1316));
        }
    },
    //TODO Missing completely
    /*
     Moss Titan
     Ice titan
     Fire titan
      */

    //TODO Finish below ones

    ;

    private int itemId = 0;
    private int specialAmount = 0;
    private int npcId;
    private int life;
    private int summonCost;

    private double summoningXp;

    private boolean aggressive = false;

    private String specialName;
    private String specialDescription;

    private SpecialAttack specialAttack;
    private Animation spawnAnimation;

    private PouchData pouchData;

    /**
     * Creates a new familiar type follower with special attack
     *
     * @param npcId              npc id to be spawned
     * @param life               time in minutes for follower to last
     * @param summoningXp        exp to be gained when spawned
     * @param aggressive         does this help with combat
     * @param summonCost         how much energy does it cost to summon this
     * @param pouchData          info about the familiars pouch
     * @param specialAttack      type of special attack
     * @param specialName        name of the special attack
     * @param specialDescription description about the attack
     * @param specialAmount      how much special energy does the special take
     */

    FollowerData(int npcId, int life, double summoningXp, int summonCost, boolean aggressive, PouchData pouchData,
                 SpecialAttack specialAttack, String specialName, String specialDescription, int specialAmount, int
                         spawnAnimation) {
        this.npcId = npcId;
        this.life = life;
        this.summoningXp = summoningXp;
        this.aggressive = aggressive;
        this.specialAttack = specialAttack;
        this.specialName = specialName;
        this.specialDescription = specialDescription;
        this.specialAmount = specialAmount;
        this.pouchData = pouchData;
        this.summonCost = summonCost;
        if (spawnAnimation != -1) this.spawnAnimation = new Animation(spawnAnimation);
    }

    FollowerData(int npcId, int life, double summoningXp, int summonCost, boolean aggressive, PouchData pouchData,
                 SpecialAttack specialAttack, String specialName, String specialDescription, int specialAmount) {
        this(npcId, life, summoningXp, summonCost, aggressive, pouchData, specialAttack, specialName,
                specialDescription, specialAmount, -1);
    }

    /**
     * Creates a new pet type follower
     *
     * @param itemId id of the item this is created from
     * @param npcId  spawned npc id
     */
    FollowerData(int itemId, int npcId) {
        this.itemId = itemId;
        this.npcId = npcId;
        this.specialAttack = SpecialAttack.NONE;
    }

    /**
     * Overridden by familiars to perform their special attack
     *
     * @param object input to special
     */
    public void submitSpecial(Follower follower, Object object) {
    }

    /**
     * What kind of special attack is this followers special attack
     *
     * @return kind
     */
    public SpecialAttack getSpecialAttack() {
        return specialAttack;
    }

    /**
     * What is the special attack of this called?
     */
    public String getSpecialName() {
        return specialName;
    }

    /**
     * Info about the special attack
     */
    public String getSpecialDescription() {
        return specialDescription;
    }

    /**
     * How many items does this beast of burden carry, 0 for non bob follower
     */
    public int getMaxCarriedItems() {
        return 0;
    }

    /**
     * How much special energy does it take to cast this special
     */
    public int getSpecialAmount() {
        return specialAmount;
    }

    /**
     * Is this follower an abyssal creature, does it carry essence
     */
    public boolean isAbyssalCreature() {
        return false;
    }

    /**
     * Is this a pet, do we need to return an item when de spawned
     */
    public boolean isPet() {
        return pouchData == null;
    }

    /**
     * Does this follower help with combat
     */
    public boolean isAggressive() {
        return aggressive;
    }

    public int getItemId() {
        return itemId;
    }

    public int getScrollId() {
        return pouchData.getScrollId();
    }

    public int getPouchId() {
        return pouchData.getPouchId();
    }

    public int getNpcId() {
        return npcId;
    }

    public int getLife() {
        return life;
    }

    public static FollowerData forPouchData(PouchData data) {
        for (FollowerData followerData : FollowerData.values()) {
            if (followerData.pouchData == null) continue;
            if (followerData.pouchData.equals(data)) return followerData;
        }
        return null;
    }

    public int getSummonCost() {
        return summonCost;
    }

    public double getSummoningXp() {
        return summoningXp;
    }

    public Animation getSpawnAnimation() {
        return spawnAnimation;
    }
}

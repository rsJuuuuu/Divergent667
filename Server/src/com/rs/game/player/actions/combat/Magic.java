package com.rs.game.player.actions.combat;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.Hit;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.npc.Npc;
import com.rs.game.npc.data.NpcDataLoader;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Equipment;
import com.rs.game.player.Player;
import com.rs.game.player.PlayerUtils;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.smithing.Smelting;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.*;
import com.rs.utils.Constants;
import com.rs.utils.game.itemUtils.PriceUtils;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import static com.rs.utils.Constants.*;
import static com.rs.utils.Constants.BonusType.*;

public class Magic {

    private interface SpellAction {
        void execute(Player player, PlayerCombat combat, Spell spell);
    }

    private interface ClickSpellAction {
        void execute(Player player, Spell spell);
    }

    /*
        Saradomin strike:
            SpellId 66 Config 41
        Claws of Guthix
            SpellId 66 Config 39
        Flames of Zamorak
            SpellId 68 Config 43
     */

    public enum Spell {
        /*
            Standard combat spells
         */
        WIND_RUSH(98, 1, 2.7, 10, 143, 2836, 2836, Projectile.getDefaultMagicProjectile(2835), SpellType.MODERN_AIR_SPELL, AIR_RUNE, 2),
        WIND_STRIKE(25, 1, 5.5, 20, 3, 2699, 2700, Projectile.getDefaultMagicProjectile(2835), SpellType.MODERN_AIR_SPELL,
                AIR_RUNE, 1, MIND_RUNE, 1),
        WATER_STRIKE(28, 5, 7.5, 40, 5, 2701, 2708, Projectile.getDefaultMagicProjectile(2703), SpellType
                .MODERN_WATER_SPELL, AIR_RUNE, 1, MIND_RUNE, 1, WATER_RUNE, 1),
        EARTH_STRIKE(30, 9, 9.5, 60, 7, 2713, 2723, Projectile.getDefaultMagicProjectile(2718), SpellType
                .MODERN_EARTH_SPELL, AIR_RUNE, 1, MIND_RUNE, 1, EARTH_RUNE, 2),
        FIRE_STRIKE(32, 13, 11.5, 80, 9, 2728, 2737, Projectile.getDefaultMagicProjectile(2729), SpellType
                .MODERN_FIRE_SPELL, AIR_RUNE, 2, FIRE_RUNE, 3, MIND_RUNE, 1),
        WIND_BOLT(34, 17, 13.5, 90, 11, -1, 2700, Projectile.getDefaultMagicProjectile(2699), SpellType.MODERN_AIR_SPELL,
                CHAOS_RUNE, 1, AIR_RUNE, 2),
        WATER_BOLT(39, 23, 16.5, 100, 13, 2707, 2709, Projectile.getDefaultMagicProjectile(2704), SpellType
                .MODERN_WATER_SPELL, CHAOS_RUNE, 1, AIR_RUNE, 2, WATER_RUNE, 2),
        EARTH_BOLT(42, 29, 19.5, 110, 15, 2714, 2724, Projectile.getDefaultMagicProjectile(2719), SpellType
                .MODERN_EARTH_SPELL, CHAOS_RUNE, 1, AIR_RUNE, 3, EARTH_RUNE, 1),
        FIRE_BOLT(45, 35, 22.5, 120, 17, 2728, 2738, Projectile.getDefaultMagicProjectile(2731), SpellType
                .MODERN_FIRE_SPELL, CHAOS_RUNE, 1, FIRE_RUNE, 4, AIR_RUNE, 3),
        WIND_BLAST(49, 41, 25.5, 130, 19, -1, 2700, Projectile.getDefaultMagicProjectile(2699), SpellType
                .MODERN_AIR_SPELL, AIR_RUNE, 3, DEATH_RUNE, 1),
        WATER_BLAST(52, 47, 28.5, 140, 21, 2701, 2710, Projectile.getDefaultMagicProjectile(2705), SpellType
                .MODERN_WATER_SPELL, AIR_RUNE, 3, WATER_RUNE, 3, DEATH_RUNE, 1),
        EARTH_BLAST(58, 53, 31.5, 150, 23, 2715, 2725, Projectile.getDefaultMagicProjectile(2720), SpellType
                .MODERN_EARTH_SPELL, AIR_RUNE, 3, DEATH_RUNE, 1, EARTH_RUNE, 4),
        FIRE_BLAST(63, 59, 34.5, 160, 25, 2728, 2739, Projectile.getDefaultMagicProjectile(2733), SpellType
                .MODERN_FIRE_SPELL, AIR_RUNE, 4, DEATH_RUNE, 1, FIRE_RUNE, 5),
        WIND_WAVE(70, 62, 36, 170, 27, -1, 2700, Projectile.getDefaultMagicProjectile(2699), SpellType.MODERN_AIR_SPELL,
                AIR_RUNE, 5, BLOOD_RUNE, 1),
        WATER_WAVE(73, 65, 37.5, 180, 29, 2702, 2710, Projectile.getDefaultMagicProjectile(2706), SpellType
                .MODERN_WATER_SPELL, AIR_RUNE, 5, WATER_RUNE, 7, BLOOD_RUNE, 1),
        EARTH_WAVE(77, 70, 40, 190, 31, 2716, 2726, Projectile.getDefaultMagicProjectile(2721), SpellType
                .MODERN_EARTH_SPELL, AIR_RUNE, 5, BLOOD_RUNE, 1, EARTH_RUNE, 7),
        FIRE_WAVE(80, 75, 42.5, 200, 33, 2728, 2740, Projectile.getDefaultMagicProjectile(2735), SpellType
                .MODERN_FIRE_SPELL, AIR_RUNE, 5, FIRE_RUNE, 7, BLOOD_RUNE, 1),
        WIND_SURGE(84, 81, 75, 220, 47, 457, 2700, Projectile.getDefaultMagicProjectile(462), SpellType.MODERN_AIR_SPELL,
                AIR_RUNE, 7, BLOOD_RUNE, 1, DEATH_RUNE, 1),
        WATER_SURGE(87, 85, 80, 240, 49, 2701, 2712, Projectile.getDefaultMagicProjectile(2707), SpellType
                .MODERN_WATER_SPELL, AIR_RUNE, 7, BLOOD_RUNE, 1, DEATH_RUNE, 1, WATER_RUNE, 10),
        EARTH_SURGE(89, 90, 85, 260, 51, 2717, 2727, Projectile.getDefaultMagicProjectile(2722), SpellType
                .MODERN_EARTH_SPELL, AIR_RUNE, 7, BLOOD_RUNE, 1, DEATH_RUNE, 1, EARTH_RUNE, 10),
        FIRE_SURGE(91, 96, 90, 280, 53, 2728, 2741, Projectile.getDefaultMagicProjectile(2735), SpellType
                .MODERN_FIRE_SPELL, FIRE_RUNE, 10, BLOOD_RUNE, 1, DEATH_RUNE, 1, AIR_RUNE, 7) {
            @Override
            public boolean sendCustomProjectile(Player player, PlayerCombat combat) {
                World.sendProjectile(player, combat.getTarget(), 2735, 18, 18, 50, 50, 3, 0);
                World.sendProjectile(player, combat.getTarget(), 2736, 18, 18, 50, 50, 20, 0);
                World.sendProjectile(player, combat.getTarget(), 2736, 18, 18, 50, 50, 110, 0);
                return true;
            }
        },
        /*
            Standard Drain Spells
        */
        CONFUSE(26, 3, 13, -1, 102, 104, Projectile.getDefaultMagicProjectile(103), 710, SpellType.MODERN_DRAIN_SPELL, WATER_RUNE, 3, EARTH_RUNE, 2, BODY_RUNE, 1),
        WEAKEN(31, 11, 21, -1, 105, 107, Projectile.getDefaultMagicProjectile(106), 716, SpellType.MODERN_DRAIN_SPELL, WATER_RUNE, 3, EARTH_RUNE, 2, BODY_RUNE, 1),
        CURSE(35, 19, 29, -1, 108, 110, Projectile.getDefaultMagicProjectile(109), 718, SpellType.MODERN_DRAIN_SPELL, WATER_RUNE, 2, EARTH_RUNE, 3, BODY_RUNE, 1),
        VULNERABILITY(75, 66, 76, -1, 167, 169, Projectile.getDefaultMagicProjectile(168), 718, SpellType.MODERN_DRAIN_SPELL, EARTH_RUNE, 5, WATER_RUNE, 5, SOUL_RUNE, 1),
        ENFEEBLE(78, 73, 83, -1, 170, 172, Projectile.getDefaultMagicProjectile(171), 723, SpellType.MODERN_DRAIN_SPELL, EARTH_RUNE, 8, WATER_RUNE, 8, SOUL_RUNE, 1),
        STUN(82, 80, 90, -1, 173, 254, Projectile.getDefaultMagicProjectile(174), 729, SpellType.MODERN_DRAIN_SPELL, EARTH_RUNE, 12, WATER_RUNE, 12, SOUL_RUNE, 1),
        /*
         * God Spells
         */
        STORM_OF_ARMADYL(99, 77, 70, 160, 145, 457, -1,
                new Projectile(1019, 0, 0, 2000, 50, 0, 0, 50),
                10546, SpellType.STORM_OF_ARMADYL, ARMADYL_RUNE, 1),
        IBAN_BLAST(54, 50, 30, 250, 45, 87, 89, Projectile.getDefaultMagicProjectile(88), 708, SpellType.MODERN_FIRE_SPELL, FIRE_RUNE, 5, DEATH_RUNE, 1) {
            @Override
            public boolean checkRequirements(Player player) {
                return RequirementsManager.hasEquipment(player, Equipment.SLOT_WEAPON, IBANS_STAFF, "cast Iban Blast.")
                        && super.checkRequirements(player);
            }
        },
        MAGIC_DART(56, 50, 30, 0, 37, -1, 329, Projectile.getDefaultMagicProjectile(328), 1575, SpellType.MAGIC_DART, DEATH_RUNE, 1, MIND_RUNE, 4) {
            @Override
            public boolean checkRequirements(Player player) {
                return RequirementsManager.hasRequirement(player, Skills.SLAYER, 55, "to cast Magic Dart")
                        && RequirementsManager.hasEquipment(player, Equipment.SLOT_WEAPON, SLAYER_STAFF, "cast Magic Dart")
                        && super.checkRequirements(player);
            }

            @Override
            public int getDamage(Player player) {
                return (int) (Math.floor(player.getSkills().getLevel(Skills.MAGIC)) + 100);
            }
        },
        // UNDEAD AUTOCAST 35, CLAW OF GUTHIX 39 SS 41 Flames 43
        /*
            Ancients
         */
        SMOKE_RUSH(28, 50, 30, 140, 63, -1, 385, Projectile.getDefaultCurvedProjectile(386), SpellType.RUSH, DEATH_RUNE,
                2, CHAOS_RUNE, 2, FIRE_RUNE, 1, AIR_RUNE, 1) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) combat.getTarget().getPoison().makePoisoned(20);
            }
        },
        SHADOW_RUSH(32, 52, 31, 150, 65, -1, 379, Projectile.getDefaultCurvedProjectile(380), SpellType.RUSH, SOUL_RUNE,
                1, DEATH_RUNE, 2, CHAOS_RUNE, 2, AIR_RUNE, 1) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) if (combat.getTarget() instanceof Player) {
                    Player target = (Player) combat.getTarget();
                    target.getSkills().drainLevelByPercentage(Skills.ATTACK, 0.1);
                }
            }
        },
        BLOOD_RUSH(24, 56, 33, 160, 67, -1, 373, null, SpellType.RUSH, BLOOD_RUNE, 1, DEATH_RUNE, 2, CHAOS_RUNE, 2) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) player.heal((int) (damage * 0.25));
            }
        },
        ICE_RUSH(20, 58, 34, 170, 69, -1, 361, Projectile.getDefaultCurvedProjectile(362), SpellType.RUSH, WATER_RUNE, 2,
                CHAOS_RUNE, 2, DEATH_RUNE, 2) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) combat.getTarget().addFreezeDelay(5000);
            }
        },
        SMOKE_BURST(30, 62, 36, 180, 71, -1, 389, null, SpellType.ANCIENT_MULTI, DEATH_RUNE, 2, CHAOS_RUNE, 4, FIRE_RUNE,
                2, AIR_RUNE, 2) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) combat.getTarget().getPoison().makePoisoned(20);
            }
        },
        SHADOW_BURST(34, 64, 37, 190, 73, -1, 382, null, SpellType.ANCIENT_MULTI, SOUL_RUNE, 2, DEATH_RUNE, 2,
                CHAOS_RUNE, 4, AIR_RUNE, 1) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) if (combat.getTarget() instanceof Player) {
                    Player target = (Player) combat.getTarget();
                    target.getSkills().drainLevelByPercentage(Skills.ATTACK, 0.1);
                }
            }
        },
        BLOOD_BURST(26, 68, 39, 210, 75, -1, 376, null, SpellType.ANCIENT_MULTI, BLOOD_RUNE, 2, DEATH_RUNE, 2,
                CHAOS_RUNE, 4) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) player.heal((int) (damage * 0.25));
            }
        },
        ICE_BURST(22, 70, 40, 220, 77, -1, 363, null, SpellType.ANCIENT_MULTI, DEATH_RUNE, 2, CHAOS_RUNE, 4, WATER_RUNE,
                4) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) combat.getTarget().addFreezeDelay(10000);
            }
        },
        SMOKE_BLITZ(29, 74, 42, 230, 79, -1, 387, Projectile.getDefaultCurvedProjectile(386), SpellType.BLITZ,
                BLOOD_RUNE, 2, DEATH_RUNE, 2, FIRE_RUNE, 2, AIR_RUNE, 2) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) combat.getTarget().getPoison().makePoisoned(40);
            }
        },
        SHADOW_BLITZ(33, 76, 43, 240, 81, -1, 381, Projectile.getDefaultCurvedProjectile(380), SpellType.BLITZ,
                BLOOD_RUNE, 2, SOUL_RUNE, 2, DEATH_RUNE, 2, AIR_RUNE, 2) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) if (combat.getTarget() instanceof Player) {
                    Player target = (Player) combat.getTarget();
                    target.getSkills().drainLevelByPercentage(Skills.ATTACK, 0.15);
                }
            }
        },
        BLOOD_BLITZ(25, 80, 45, 250, 83, -1, 375, Projectile.getDefaultCurvedProjectile(374), SpellType.BLITZ,
                BLOOD_RUNE, 4, DEATH_RUNE, 2) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) player.heal((int) (damage * 0.25));
            }
        },
        ICE_BLITZ(21, 82, 46, 260, 85, 366, 367, null, SpellType.BLITZ, BLOOD_RUNE, 2, DEATH_RUNE, 2, WATER_RUNE, 3) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) combat.getTarget().addFreezeDelay(15000);
            }
        },
        SMOKE_BARRAGE(31, 86, 48, 270, 87, -1, 391, null, SpellType.ANCIENT_MULTI, BLOOD_RUNE, 2, DEATH_RUNE, 4,
                FIRE_RUNE, 4, AIR_RUNE, 4) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) combat.getTarget().getPoison().makePoisoned(40);
            }
        },
        SHADOW_BARRAGE(35, 88, 49, 280, 89, -1, 383, null, SpellType.ANCIENT_MULTI, BLOOD_RUNE, 2, SOUL_RUNE, 3,
                DEATH_RUNE, 4, AIR_RUNE, 4) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) if (combat.getTarget() instanceof Player) {
                    Player target = (Player) combat.getTarget();
                    target.getSkills().drainLevelByPercentage(Skills.ATTACK, 0.15);
                }
            }
        },
        BLOOD_BARRAGE(27, 92, 51, 290, 91, -1, 377, null, SpellType.ANCIENT_MULTI, BLOOD_RUNE, 4, SOUL_RUNE, 1,
                DEATH_RUNE, 4) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) player.heal((int) (damage * 0.25));
            }
        },
        ICE_BARRAGE(23, 94, 52, 300, 93, -1, 369, Projectile.getDefaultCurvedProjectile(368), SpellType.ANCIENT_MULTI,
                BLOOD_RUNE, 2, DEATH_RUNE, 4, WATER_RUNE, 6) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage <= 0) return;
                if (combat.getTarget().getFreezeDelay() >= TimeUtils.getTime()
                        || combat.getTarget().getFrozenBlockedDelay() >= TimeUtils.getTime())
                    combat.setMagicHitGfx(new Graphics(1677));
                else combat.getTarget().addFreezeDelay(20000);
            }
        },
        MODERN_HOME(24, 0, 0, SpellType.MODERN_TELEPORT, Settings.START_PLAYER_LOCATION),
        MA(37, 10, 19, SpellType.MODERN_TELEPORT, new WorldTile(2413, 2853, 0), LAW_RUNE, 1, WATER_RUNE, 1, AIR_RUNE,
                1),
        VARROCK(40, 25, 35, SpellType.MODERN_TELEPORT, new WorldTile(3212, 3424, 0), LAW_RUNE, 1, AIR_RUNE, 3,
                FIRE_RUNE, 1),
        LUMBRIDGE(43, 31, 41, SpellType.MODERN_TELEPORT, new WorldTile(3222, 3218, 0), LAW_RUNE, 1, AIR_RUNE, 3,
                EARTH_RUNE, 1),
        FALADOR(46, 37, 47, SpellType.MODERN_TELEPORT, new WorldTile(2964, 3379, 0), LAW_RUNE, 1, WATER_RUNE, 1,
                AIR_RUNE, 3),
        //TODO HOUSE
        CAMELOT(51, 45, 55.5, SpellType.MODERN_TELEPORT, new WorldTile(2757, 3478, 0), LAW_RUNE, 1, AIR_RUNE, 5),
        ARDOUGNE(57, 51, 61, SpellType.MODERN_TELEPORT, new WorldTile(2664, 3305, 0), LAW_RUNE, 2, WATER_RUNE, 2),
        WATCHTOWER(62, 58, 68, SpellType.MODERN_TELEPORT, new WorldTile(2547, 3113, 2), LAW_RUNE, 2, EARTH_RUNE, 2),
        TROLLHEIM(69, 61, 68, SpellType.MODERN_TELEPORT, new WorldTile(2888, 3674, 0), FIRE_RUNE, 2, LAW_RUNE, 2),
        APE_ATOLL(72, 64, 74, SpellType.MODERN_TELEPORT, new WorldTile(2762, 9094, 0), FIRE_RUNE, 2, LAW_RUNE, 2,
                WATER_RUNE, 2, 1963, 1),
        ANCIENT_HOME(48, 0, 0, SpellType.ANCIENT_TELEPORT, Settings.START_PLAYER_LOCATION),
        PADDEWA(40, 54, 64, SpellType.ANCIENT_TELEPORT, new WorldTile(3099, 9882, 0), LAW_RUNE, 2, FIRE_RUNE, 1,
                AIR_RUNE, 1),
        SENNTISTEN(41, 60, 70, SpellType.ANCIENT_TELEPORT, new WorldTile(3222, 3336, 0), LAW_RUNE, 2, SOUL_RUNE, 1),
        KHARYRLL(42, 66, 76, SpellType.ANCIENT_TELEPORT, new WorldTile(3492, 3471, 0), LAW_RUNE, 2, BLOOD_RUNE, 1),
        LASSAR(43, 72, 82, SpellType.ANCIENT_TELEPORT, new WorldTile(3006, 3471, 0), LAW_RUNE, 2, WATER_RUNE, 4),
        DAREEYAK(44, 78, 88, SpellType.ANCIENT_TELEPORT, new WorldTile(2990, 3696, 0), LAW_RUNE, 2, FIRE_RUNE, 3,
                AIR_RUNE, 2),
        CARRALLANGAR(45, 84, 94, SpellType.ANCIENT_TELEPORT, new WorldTile(3217, 3677, 0), LAW_RUNE, 2, SOUL_RUNE, 2),
        ANNAKARL(46, 90, 100, SpellType.ANCIENT_TELEPORT, new WorldTile(3288, 3886, 0), LAW_RUNE, 2, BLOOD_RUNE, 2),
        GHORROCK(47, 96, 106, SpellType.ANCIENT_TELEPORT, new WorldTile(2977, 3873, 0), LAW_RUNE, 2, WATER_RUNE, 8),
        LOW_ALCHEMY(38, 35, 31, SpellType.MODERN_SPELL, FIRE_RUNE, 3, NATURE_RUNE, 1),
        HIGH_ALCHEMY(59, 55, 65, SpellType.MODERN_SPELL, FIRE_RUNE, 5, NATURE_RUNE, 1),
        BONES_TO_BANANAS(33, 15, 25, SpellType.MODERN_SPELL, (player, spell) -> {
            castBonesToX(player, BANANA);
        }, EARTH_RUNE, 2, WATER_RUNE, 2, NATURE_RUNE, 1) {
            @Override
            public boolean checkRequirements(Player player) {
                return super.checkRequirements(player) && checkBones(player);
            }
        },
        BONES_TO_PEACHES(65, 60, 35.5, SpellType.MODERN_SPELL, (player, spell) -> {
            castBonesToX(player, PEACH);
        }, EARTH_RUNE, 4, WATER_RUNE, 4, NATURE_RUNE, 2) {
            @Override
            public boolean checkRequirements(Player player) {
                return super.checkRequirements(player) && checkBones(player);
            }
        },
        SUPERHEAT(50, 43, 53, SpellType.MODERN_SPELL, FIRE_RUNE, 4, NATURE_RUNE, 1),
        VENGEANCE_OTHER(42, 93, 108, SpellType.LUNAR_USE_SPELL),
        VENGEANCE(37, 94, 112, SpellType.LUNAR_SPELL, Magic::castVeng),
        VENGEANCE_GROUP(74, 95, 120, SpellType.LUNAR_SPELL, Magic::castVeng),
        BIND(36, 20, 30, 20, new Graphics(177), new Graphics(181, 100), Projectile.getDefaultMagicProjectile(178),
                SpellType.BIND_SPELL, NATURE_RUNE, 2, WATER_RUNE, 3, EARTH_RUNE, 3) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage <= 0) return;
                if (!(combat.getTarget().getFreezeDelay() >= TimeUtils.getTime()
                        || combat.getTarget().getFrozenBlockedDelay() >= TimeUtils.getTime()))
                    combat.getTarget().addFreezeDelay(5000);
            }
        },
        SNARE(55, 50, 60, 30, new Graphics(177), new Graphics(180, 100), Projectile.getDefaultMagicProjectile(178),
                SpellType.BIND_SPELL, NATURE_RUNE, 2, WATER_RUNE, 3, EARTH_RUNE, 3) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage <= 0) return;
                if (!(combat.getTarget().getFreezeDelay() >= TimeUtils.getTime()
                        || combat.getTarget().getFrozenBlockedDelay() >= TimeUtils.getTime()))
                    combat.getTarget().addFreezeDelay(10000);
            }
        },
        ENTANGLE(81, 79, 89, 50, new Graphics(177), new Graphics(179, 100), Projectile.getDefaultMagicProjectile(178)
                , SpellType.BIND_SPELL, NATURE_RUNE, 4, WATER_RUNE, 5, EARTH_RUNE, 5) {
            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage <= 0) return;
                if (!(combat.getTarget().getFreezeDelay() >= TimeUtils.getTime()
                        || combat.getTarget().getFrozenBlockedDelay() >= TimeUtils.getTime()))
                    combat.getTarget().addFreezeDelay(15000);
            }
        };

        private final int spellId;
        private final int level;
        private int damage;
        private int uniqueAnimationId = -1;
        private int autoCastConfigId = 0;
        private final double xp;
        int[] runeData;
        private ClickSpellAction action;
        private WorldTile targetTile;
        private Projectile projectile;
        private Graphics castGfx, endGfx;
        private final SpellType type;

        Spell(int spellId, int level, double xp, int damage, int castGfx, int hitGfx, Projectile projectile,
              SpellType type, int... runeData) {
            this.spellId = spellId;
            this.level = level;
            this.xp = xp;
            this.damage = damage;
            this.castGfx = new Graphics(castGfx);
            this.endGfx = new Graphics(hitGfx);
            this.projectile = projectile;
            this.type = type;
            this.runeData = runeData;
        }

        Spell(int spellId, int level, double xp, int damage, int castGfx, int hitGfx, Projectile projectile, int animationId,
              SpellType type, int... runeData) {
            this.uniqueAnimationId = animationId;
            this.spellId = spellId;
            this.level = level;
            this.xp = xp;
            this.damage = damage;
            this.castGfx = new Graphics(castGfx);
            this.endGfx = new Graphics(hitGfx);
            this.projectile = projectile;
            this.type = type;
            this.runeData = runeData;
        }

        Spell(int spellId, int level, double xp, int damage, int autoCastConfigId, int castGfx, int hitGfx, Projectile projectile,
              SpellType type, int... runeData) {
            this.autoCastConfigId = autoCastConfigId;
            this.spellId = spellId;
            this.level = level;
            this.xp = xp;
            this.damage = damage;
            this.castGfx = new Graphics(castGfx);
            this.endGfx = new Graphics(hitGfx);
            this.projectile = projectile;
            this.type = type;
            this.runeData = runeData;
        }

        Spell(int spellId, int level, double xp, int damage, int autoCastConfigId, int castGfx, int hitGfx, Projectile projectile, int animationId,
              SpellType type, int... runeData) {
            this.uniqueAnimationId = animationId;
            this.autoCastConfigId = autoCastConfigId;
            this.spellId = spellId;
            this.level = level;
            this.xp = xp;
            this.damage = damage;
            this.castGfx = new Graphics(castGfx);
            this.endGfx = new Graphics(hitGfx);
            this.projectile = projectile;
            this.type = type;
            this.runeData = runeData;
        }

        Spell(int spellId, int level, double xp, int damage, Graphics castGfx, Graphics hitGfx, Projectile
                projectile, SpellType type, int... runeData) {
            this.spellId = spellId;
            this.level = level;
            this.xp = xp;
            this.damage = damage;
            this.castGfx = castGfx;
            this.endGfx = hitGfx;
            this.projectile = projectile;
            this.type = type;
            this.runeData = runeData;
        }

        /**
         * Teleport spell
         */
        Spell(int spellId, int level, double xp, SpellType type, WorldTile targetTile, int... runeData) {
            this.spellId = spellId;
            this.level = level;
            this.xp = xp;
            this.type = type;
            this.runeData = runeData;
            this.targetTile = targetTile;
        }

        /**
         * Spell that isn't automatically handled (just holds rune and xp data)
         */
        Spell(int spellId, int level, double xp, SpellType type, int... runeData) {
            this.spellId = spellId;
            this.level = level;
            this.xp = xp;
            this.runeData = runeData;
            this.type = type;
        }

        /**
         * Click spell
         */
        Spell(int spellId, int level, double xp, SpellType type, ClickSpellAction spellAction, int... runeData) {
            this.spellId = spellId;
            this.level = level;
            this.xp = xp;
            this.type = type;
            this.runeData = runeData;
            action = spellAction;
        }

        public int getAnimationId(Player player) {
            if (uniqueAnimationId == -1) return type.getStaffAnimationId(player);
            return uniqueAnimationId;
        }

        public int getLevel() {
            return level;
        }

        public int getDamage(Player player) {
            return damage;
        }

        public int getAutoCastConfigId() {
            return autoCastConfigId;
        }

        public double getXp() {
            return xp;
        }

        public int[] getRuneData() {
            return runeData;
        }

        public WorldTile getTargetTile() {
            return targetTile;
        }

        public Projectile getProjectile() {
            return projectile;
        }

        public Graphics getCastGfx() {
            return castGfx;
        }

        public Graphics getEndGfx() {
            return endGfx;
        }

        public SpellType getType() {
            return type;
        }

        public boolean sendCustomProjectile(Player player, PlayerCombat combat) {
            return false;
        }

        /**
         * Process any additional effects
         */
        public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
        }

        /**
         * Process effects after having calculated the final hit
         */
        public void processPostHitEffects(Player player, PlayerCombat combat, int damage) {
            type.applyPostHitEffects(player, combat, damage);
            applyPostHitEffects(player, combat, damage);
        }

        /**
         * Effects to be applied before anything is done to the hit
         */
        public int applyPreHitEffects(Player player, PlayerCombat combat, int damage) {
            return damage;
        }

        /**
         * Add the spell type effect and the spell effect (if they exist)
         */
        public int processPreHitEffects(Player player, PlayerCombat combat, int damage) {
            return (type.applyPreHitEffects(player, combat, applyPreHitEffects(player, combat, damage)));
        }

        /**
         * Execute the casting of this spell
         */
        public int process(Player player, PlayerCombat combat) {
            if (!checkRequirements(player)) return -1;
            if (action != null) action.execute(player, this);
            if (type.action != null) type.action.execute(player, combat, this);
            deleteRunes(player, this);
            return type.getDelay(player);
        }

        /**
         * May the player cast this spell?
         */
        public boolean checkRequirements(Player player) {
            int[] runeData = getRuneData();
            if (!RequirementsManager.hasRequirement(player, Skills.MAGIC, getLevel(), "to cast this spell."))
                return false;
            for (int i = 0; i < runeData.length - 1; i += 2) {
                if (hasInfiniteRunes(runeData[i], player.getEquipment().getWeaponId(), player.getEquipment().getShieldId()))
                    continue;
                if (!player.getInventory().containsItem(runeData[i], runeData[i + 1])) {
                    player.sendMessage("You don't have enough runes to cast this spell.");
                    return false;
                }
            }
            return true;
        }

        private static final HashMap<Integer, HashMap<Integer, Spell>> spells = new HashMap<>();

        static {
            for (Spell spell : Spell.values()) {
                spells.putIfAbsent(spell.type.spellBook, new HashMap<>());
                spells.get(spell.type.spellBook).put(spell.spellId, spell);
            }
        }

        /**
         * Fetch a spell based on the spell id and book its being cast from
         */
        public static Spell forId(int id, int spellBook) {
            return spells.getOrDefault(spellBook, new HashMap<>()).get(id);
        }

    }

    public enum SpellType {
        MAGIC_DART(MODERN_SPELLBOOK, 5, 14221, 10546, Magic::castNormalCombatSpell, 2),
        MODERN_AIR_SPELL(MODERN_SPELLBOOK, 5, 14221, 10546, Magic::castNormalCombatSpell, 2),
        MODERN_WATER_SPELL(MODERN_SPELLBOOK, 5, 14220, 10542, Magic::castNormalCombatSpell, 2),
        MODERN_EARTH_SPELL(MODERN_SPELLBOOK, 5, 14222, 14209, Magic::castNormalCombatSpell, 2),
        MODERN_FIRE_SPELL(MODERN_SPELLBOOK, 5, 14223, 2791, Magic::castNormalCombatSpell, 2) {
            @Override
            public int applyPreHitEffects(Player player, PlayerCombat combat, int damage) {
                if (combat.getTarget() instanceof Npc) {
                    Npc n = (Npc) combat.getTarget();
                    if (n.getId() == 9463) damage *= 2;
                }
                return damage;
            }
        },
        MODERN_DRAIN_SPELL(MODERN_SPELLBOOK, 5, 14223, 2791, Magic::castDrainSpell, 2) {
            @Override
            public int applyPreHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage > 0) {
                    return -1; // This is to do no damage, but not splash as -1 is rounded to 0
                } else {
                    return 0;
                }
            }
        },
        BIND_SPELL(MODERN_SPELLBOOK, 5, 710, -1, Magic::castNormalCombatSpell, 2),
        STORM_OF_ARMADYL(MODERN_SPELLBOOK, 5, 10546, -1, Magic::castNormalCombatSpell, 2) {
            @Override
            public int getDelay(Player player) {
                // SOA cast is 2.4 seconds if wearing armadyl battlestaff, otherwise 3 seconds like normal spells
                return player.getEquipment().getWeaponId() == Constants.ARMADYL_BATTLESTAFF ? 4 : 5;
            }

            @Override
            public int applyPreHitEffects(Player player, PlayerCombat combat, int damage) {
                // The max hit of SOA is 160 at 77 and increased by 5 for each level over 77 up to 270 at 99
                // Furthermore, it has a minimum hit of (MAGIC_LVL - 77) * 5 up to 110 and at least 0
                // Observe that adding this minimum to the base hit of 160 is the same as increasing the max
                // Thus this pre hit effect is sufficient to complete the full formula. Note that is is also affected
                // by the MAGIC_DAMAGE multiplier
                double extraDamage = player.getCombatDefinitions().getBonuses()[MAGIC_DAMAGE.getId()];
                int minimumHit = (int) ((Math.max((Math.min(player.getSkills().getLevel(Skills.MAGIC), 99) - 77), 0) * 5) * (1.0 + extraDamage / 100));
                return damage + minimumHit;
            }

            @Override
            public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
                // SOA Drains the targets defence by 1 whether it is successful or not
                if (combat.getTarget() instanceof Player) {
                    Player target = (Player) combat.getTarget();
                    target.getSkills().drainLevel(Skills.DEFENCE, 1);
                } else if (combat.getTarget() instanceof Npc) {
                    Npc npc = (Npc) combat.getTarget();
                    // Not sure about these, should figure out the correct attack formula to know what bonuses
                    // To drain
                    final BonusType[] bonuses = {RANGE_DEF, MAGIC_DEF, STAB_DEF, CRUSH_DEF, SLASH_DEF};
                    int[] initialBonuses = NpcDataLoader.getBonuses(npc.getId());
                    if (initialBonuses == null) {
                        return;
                    }
                    for (Constants.BonusType bonus : bonuses) {
                        if (initialBonuses[bonus.getId()] == 0) {
                            continue;
                        }
                        npc.getBonuses()[bonus.getId()] = Math.max(npc.getBonuses()[bonus.getId()] - 1, 0);
                    }
                }
            }
        },
        BLITZ(ANCIENT_SPELLBOOK, 4, 1978, Magic::castNormalCombatSpell, 4),
        RUSH(ANCIENT_SPELLBOOK, 4, 1978, Magic::castNormalCombatSpell, 2),
        ANCIENT_MULTI(ANCIENT_SPELLBOOK, 4, 1979, Magic::castMultiTargetCombatSpell, 2),
        MODERN_TELEPORT(MODERN_SPELLBOOK, 3, 8939, 8941, new Graphics(1576), new Graphics(1577),
                Magic::castTeleportSpell),
        ANCIENT_TELEPORT(ANCIENT_SPELLBOOK, 5, 1979, -1, new Graphics(1681), null, Magic::castTeleportSpell),
        OBJECT_TELEPORT(-1, 3, 8939, 8941, new Graphics(1576), new Graphics(1577), Magic::castTeleportSpell),
        ROPE_TELEPORT(-1, 0, 11489, -1, null, null, Magic::castTeleportSpell),
        ITEM_TELEPORT(-1, 4, 9603, -1, new Graphics(1684), null, Magic::castTeleportSpell),
        OBELISK_TELEPORT(-1, 3, 8939, 8941, null, null, Magic::castTeleportSpell),
        LUNAR_SPELL(LUNAR_SPELLBOOK),
        LUNAR_USE_SPELL(LUNAR_SPELLBOOK, USE_SPELL),
        MODERN_SPELL(MODERN_SPELLBOOK);

        private final int spellBook;
        private int delay;
        private int baseAnimation;
        private int alternativeAnimation;
        private int hitDelay;
        private final int spellType;
        private SpellAction action;
        private Graphics baseGfx, secondaryGfx;

        /**
         * Spell with animation for staff and no staff (or otherwise two animations)
         */
        SpellType(int spellBook, int delay, int staffAnimation, int noStaffAnimation, SpellAction action, int
                hitDelay) {
            spellType = COMBAT_SPELL;
            this.spellBook = spellBook;
            this.delay = delay;
            this.action = action;
            this.hitDelay = hitDelay;
            baseAnimation = staffAnimation;
            alternativeAnimation = noStaffAnimation;
        }

        /**
         * Spell with no different animation for when wielding staff
         */
        SpellType(int spellBook, int delay, int staffAnimation, SpellAction action, int hitDelay) {
            spellType = COMBAT_SPELL;
            this.spellBook = spellBook;
            this.delay = delay;
            this.action = action;
            this.hitDelay = hitDelay;
            baseAnimation = staffAnimation;
            alternativeAnimation = -1;
        }

        /**
         * Teleport type constructor
         */
        SpellType(int spellBook, int delay, int upAnimation, int downAnimation, Graphics upGfx, Graphics downGfx,
                  SpellAction action) {
            spellType = TELEPORT_SPELL;
            this.spellBook = spellBook;
            this.delay = delay;
            this.action = action;
            baseAnimation = upAnimation;
            alternativeAnimation = downAnimation;
            baseGfx = upGfx;
            secondaryGfx = downGfx;
        }

        /**
         * Spells that can't be handled with a command method but are linked to a book
         */
        SpellType(int spellBook) {
            this.spellBook = spellBook;
            spellType = CLICK_SPELL;
        }

        SpellType(int spellBook, int spellType) {
            this.spellBook = spellBook;
            this.spellType = spellType;
        }

        public int applyPreHitEffects(Player player, PlayerCombat combat, int damage) {
            return damage;
        }

        public void applyPostHitEffects(Player player, PlayerCombat combat, int damage) {
        }

        public int getSpellType() {
            return spellType;
        }

        public int getHitDelay(Player player) {
            return hitDelay;
        }

        public int getDelay(Player player) {
            return delay;
        }

        public Graphics getBaseGfx() {
            return baseGfx;
        }

        public Graphics getSecondaryGfx() {
            return secondaryGfx;
        }

        public int getBaseAnimation() {
            return baseAnimation;
        }

        public int getAlternativeAnimation() {
            return alternativeAnimation;
        }

        public int getStaffAnimationId(Player player) {
            if (alternativeAnimation == -1) return baseAnimation;
            else return (wearingStaff(player) ? baseAnimation : alternativeAnimation);
        }
    }

    /**
     * Process a click on a spell
     */
    public static void processSpell(Player player, int spellId) {
        Spell spell = Spell.forId(spellId, player.getCombatDefinitions().getSpellBook());
        if (spell == null) return;
        switch (spell.getType().getSpellType()) {
            case COMBAT_SPELL:
                setCombatSpell(player, spellId);
                break;
            case TELEPORT_SPELL:
            case CLICK_SPELL:
                spell.process(player, null);
                break;
        }
    }

    /**
     * Process a spell on an npc
     */
    public static void processSpellOnNpc(Player player, Npc npc, int spellId) {
        if (Magic.checkCombatSpell(player, spellId, 1, false)) {
            player.setNextFaceWorldTile(new WorldTile(npc.getCoordFaceX(npc.getSize()), npc.getCoordFaceY(npc.getSize
                    ()), npc.getPlane()));
            if (!player.getControllerManager().canAttack(npc)) return;
            if (npc instanceof Follower) {
                Follower follower = (Follower) npc;
                if (follower == player.getFollower()) {
                    player.getPackets().sendGameMessage("You can't attack your own familiar.");
                    return;
                }
                if (!follower.canAttack(player)) {
                    player.getPackets().sendGameMessage("You can't attack this npc.");
                    return;
                }
            } else if (!npc.isForceMultiAttacked()) {
                if (!npc.isAtMultiArea() || !player.isAtMultiArea()) {
                    if (player.getAttackedBy() != npc && player.getAttackedByDelay() > TimeUtils.getTime()) {
                        player.getPackets().sendGameMessage("You are already in combat.");
                        return;
                    }
                    if (npc.getAttackedBy() != player && npc.getAttackedByDelay() > TimeUtils.getTime()) {
                        player.getPackets().sendGameMessage("This npc is already in combat.");
                        return;
                    }
                }
            }
            player.getActionManager().setAction(new PlayerCombat(npc));
        }
    }

    public static void processSpellOnPlayer(Player player, Player other, int spellId) {
        if (Magic.checkCombatSpell(player, spellId, 1, false)) {
            Spell spell = Spell.forId(spellId, player.getCombatDefinitions().getSpellBook());
            switch (spell) {
                case VENGEANCE_OTHER:
                    castVengOther(player, other);
            }
            player.setNextFaceWorldTile(new WorldTile(other.getCoordFaceX(other.getSize()), other.getCoordFaceY(other
                    .getSize()), other.getPlane()));
            if (!player.getControllerManager().canAttack(other)) return;
            if (!player.isCanPvp() || !other.isCanPvp()) {
                player.getPackets().sendGameMessage("You can only attack players in a " + "player-vs-player area.");
                return;
            }
            if (!other.isAtMultiArea() || !player.isAtMultiArea()) {
                if (player.getAttackedBy() != other && player.getAttackedByDelay() > TimeUtils.getTime()) {
                    player.getPackets().sendGameMessage(
                            "That " + (player.getAttackedBy() instanceof Player ? "player" : "npc") + " is "
                                    + "already in " + "combat.");
                    return;
                }
                if (other.getAttackedBy() != player && other.getAttackedByDelay() > TimeUtils.getTime()) {
                    if (other.getAttackedBy() instanceof Npc) {
                        other.setAttackedBy(player);
                    } else {
                        player.getPackets().sendGameMessage("That player is already in " + "combat" + ".");
                        return;
                    }
                }
            }
            player.getActionManager().setAction(new PlayerCombat(other));
        }
    }

    /**
     * Set a spell as auto cast
     */
    private static void setCombatSpell(Player player, int spellId) {
        if (player.getCombatDefinitions().getAutoCastSpell() == spellId)
            player.getCombatDefinitions().resetSpells(true);
        else checkCombatSpell(player, spellId, 0, false);
        player.stopAll();
    }

    /**
     * Remove the runes from players inventory
     */
    private static void deleteRunes(Player player, Spell spell) {
        int[] runeData = spell.getRuneData();
        for (int i = 0; i < runeData.length - 1; i += 2) {
            if (hasInfiniteRunes(runeData[i], player.getEquipment().getWeaponId(), player.getEquipment().getShieldId()))
                continue;
            player.getInventory().deleteItem(runeData[i], runeData[i + 1]);
        }
    }

    /**
     * Attempt to teleport the player to given location
     */
    public static boolean teleport(Player player, SpellType teleportType, int movementType, WorldTile toTile) {
        if (!player.checkPlayerInvokedMovement(movementType, toTile)) return false;
        if (teleportType.getBaseAnimation() > 0)
            player.setNextAnimation(new Animation(teleportType.getBaseAnimation()));
        if (teleportType.getBaseGfx() != null) player.setNextGraphics(teleportType.getBaseGfx());
        player.stopAll(true, true);
        player.addStopDelay(teleportType.getDelay(player) + 3);
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                player.setNextWorldTile(toTile);
                player.moved(toTile);
                if (teleportType.getAlternativeAnimation() != -1)
                    player.setNextAnimation(new Animation(teleportType.getAlternativeAnimation()));
                if (teleportType.getSecondaryGfx() != null) player.setNextGraphics(teleportType.getSecondaryGfx());
                player.setNextFaceWorldTile(new WorldTile(toTile.getX(), toTile.getY() - 1, toTile.getPlane()));
                player.setDirection(6);
            }
        }, teleportType.getDelay(player));
        return true;
    }

    public static boolean normalTeleport(Player player, WorldTile tile) {
        return teleport(player, SpellType.MODERN_TELEPORT, MAGIC_TELEPORT, tile);
    }

    public static boolean objectTeleport(Player player, WorldTile tile) {
        return teleport(player, SpellType.OBJECT_TELEPORT, OBJECT_TELEPORT, tile);
    }

    public static boolean itemTeleport(Player player, WorldTile tile) {
        return teleport(player, SpellType.ITEM_TELEPORT, ITEM_TELEPORT, tile);
    }

    public static void ropeTeleport(Player player, WorldTile tile) {
        teleport(player, SpellType.ROPE_TELEPORT, Constants.ROPE_TELEPORT, tile);
    }

    public static void leverTeleport(final Player player, final WorldTile tile) {
        if (!player.getControllerManager().processObjectTeleport(tile)) return;
        player.setNextAnimation(new Animation(2140));
        player.setInfiniteStopDelay();
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                player.resetStopDelay();
                Magic.objectTeleport(player, tile);
            }
        }, 1);
    }

    private static boolean useTeleTab(final Player player, final WorldTile tile) {
        if (player.checkPlayerInvokedMovement(ITEM_TELEPORT, tile)) return false;
        player.setInfiniteStopDelay();
        player.setNextAnimation(new Animation(9597));
        player.setNextGraphics(new Graphics(1680));
        WorldTasksManager.schedule(new WorldTask() {
            boolean teled;

            @Override
            public void run() {
                if (!teled) {
                    player.setNextAnimation(new Animation(4731));
                    teled = true;
                } else {
                    player.setNextWorldTile(tile);
                    player.getControllerManager().magicTeleported(Constants.ITEM_TELEPORT);
                    player.moved(tile);
                    player.setNextFaceWorldTile(new WorldTile(tile.getX(), tile.getY() - 1, tile.getPlane()));
                    player.setDirection(6);
                    player.setNextAnimation(new Animation(-1));
                    player.resetStopDelay();
                    stop();
                }
            }
        }, 2, 1);
        return true;
    }

    private final static WorldTile[] TABS = {new WorldTile(3217, 3426, 0), new WorldTile(3222, 3218, 0), new
            WorldTile(2965, 3379, 0), new WorldTile(2758, 3478, 0), new WorldTile(2660, 3306, 0)};

    public static boolean useTabTeleport(final Player player, final int itemId) {
        if (itemId < 8007 || itemId > 8007 + TABS.length - 1) return false;
        if (useTeleTab(player, TABS[itemId - 8007])) player.getInventory().deleteItem(itemId, 1);
        return true;
    }

    /**
     * Teleport
     */
    public static void castTeleportSpell(Player player, PlayerCombat combat, Spell spell) {
        if (!player.checkPlayerInvokedMovement(MAGIC_TELEPORT, spell.getTargetTile())) return;
        if (spell.type.getBaseAnimation() > 0) player.setNextAnimation(new Animation(spell.type.getBaseAnimation()));
        if (spell.type.getBaseGfx() != null) player.setNextGraphics(spell.type.getBaseGfx());
        if (spell.getXp() != 0) player.getSkills().addXp(Skills.MAGIC, spell.getXp());
        player.stopAll(true, true);
        player.addStopDelay(spell.getType().getDelay(player) + 3);
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                player.setNextWorldTile(spell.getTargetTile());
                player.moved(spell.getTargetTile());
                if (spell.type.getAlternativeAnimation() != -1)
                    player.setNextAnimation(new Animation(spell.type.getAlternativeAnimation()));
                if (spell.getType().getSecondaryGfx() != null)
                    player.setNextGraphics(spell.getType().getSecondaryGfx());
                player.setNextFaceWorldTile(new WorldTile(spell.getTargetTile().getX(),
                        spell.getTargetTile().getY() - 1, spell.getTargetTile().getPlane()));
                player.setDirection(6);
            }
        }, spell.getType().getDelay(player));
    }

    /**
     * Attack an entity using magic
     */
    private static void castNormalCombatSpell(Player player, PlayerCombat combat, Spell spell) {
        player.setNextAnimation(new Animation(spell.getAnimationId(player)));
        player.setNextGraphics(spell.getCastGfx());
        combat.setMagicHitGfx(spell.getEndGfx());
        combat.setBaseMagicXp(spell.getXp());
        if (spell.getProjectile() != null && !spell.sendCustomProjectile(player, combat))
            World.sendProjectile(player, combat.getTarget(), spell.getProjectile());
        combat.delayMagicHit(spell.getType().getHitDelay(player), combat.getMagicHit(player, spell.processPreHitEffects
                (player, combat, combat.getRandomMagicMaxHit(player, spell.getDamage(player)))));
    }

    private static boolean checkDrain(Player player, PlayerCombat combat, Spell spell, boolean apply) {
        // These are a bit weird because of the way the combat works, for instance npc max hit only depends on the attack level
        final BonusType[] attackBonuses = {STAB_ATTACK, RANGE_ATTACK, MAGIC_ATTACK};
        final BonusType[] defenceBonuses = {RANGE_DEF, MAGIC_DEF, STAB_DEF};
        final BonusType[] strengthBonuses = {STAB_ATTACK, RANGE_ATTACK, MAGIC_ATTACK};

        switch (spell) {
            case CONFUSE:
                return checkModernDrain(combat, 0.05, apply, Skills.ATTACK, attackBonuses);
            case WEAKEN:
                return checkModernDrain(combat, 0.05, apply, Skills.STRENGTH, strengthBonuses);
            case CURSE:
                return checkModernDrain(combat, 0.05, apply, Skills.DEFENCE, defenceBonuses);
            case VULNERABILITY:
                return checkModernDrain(combat, 0.10, apply, Skills.DEFENCE, defenceBonuses);
            case ENFEEBLE:
                return checkModernDrain(combat, 0.10, apply, Skills.STRENGTH, strengthBonuses);
            case STUN:
                return checkModernDrain(combat, 0.10, apply, Skills.ATTACK, attackBonuses);
            default:
                return false;
        }
    }

    private static void castDrainSpell(Player player, PlayerCombat combat, Spell spell) {
        if (!checkDrain(player, combat, spell, false)) {
            player.sendMessage("Your target is already weakened.");
            return;
        }

        Hit hit = combat.getMagicHit(player, spell.processPreHitEffects
                (player, combat, combat.getRandomMagicMaxHit(player, 1)));

        if (hit.getDamage() < 0) {
            checkDrain(player, combat, spell, true);
        }

        player.setNextAnimation(new Animation(spell.getAnimationId(player)));

        player.setNextGraphics(spell.getCastGfx());
        combat.setMagicHitGfx(spell.getEndGfx());
        combat.setBaseMagicXp(spell.getXp());

        combat.delayMagicHit(spell.getType().getHitDelay(player), hit);
        if (spell.getProjectile() != null && !spell.sendCustomProjectile(player, combat))
            World.sendProjectile(player, combat.getTarget(), spell.getProjectile());
    }

    private static boolean checkBones(Player player) {
        if (!player.getInventory().containsOneItem(BONES, BIG_BONES)) {
            player.sendMessage("You aren't holding any bones!");
            return false;
        }
        return true;
    }

    private static void castBonesToX(Player player, int toItem) {
        player.setNextAnimation(new Animation(722));
        player.setNextGraphics(new Graphics(141));
        int bones = player.getInventory().numberOf(BONES);
        int bigBones = player.getInventory().numberOf(BIG_BONES);
        player.getInventory().deleteItem(BONES, bones);
        player.getInventory().deleteItem(BIG_BONES, bigBones);
        player.getInventory().addItem(toItem, bones + bigBones);
    }

    /**
     * Check and apply modern (spellbook) drain spell
     *
     * @param combat  the combat of the attacker
     * @param drain   amount to drain
     * @param skillID skill to drain
     * @param toDrain the npc bonuses to drain
     * @return whether drain was possible
     */
    public static boolean checkModernDrain(PlayerCombat combat, double drain, boolean apply, int skillID, BonusType... toDrain) {
        Entity target = combat.getTarget();
        if (target instanceof Player) {
            Player other = (Player) target;
            if (other.getSkills().level[skillID] >= other.getSkills().getLevelForXp(skillID)) {
                if (apply) {
                    other.getSkills().drainLevelByPercentage(skillID, drain);
                }
                return true;
            } else {
                return false;
            }
        } else if (target instanceof Npc) {
            return checkNpcDrain((Npc) target, drain, apply, toDrain);
        } else {
            return false;
        }
    }

    /**
     * Check if the npc stats can be drained by a drain spell
     *
     * @param npc     the npc attacked
     * @param drain   amount of drain in fraction from 0.0 to 1.0
     * @param bonuses the bonuses to be drained
     * @return wheter or not one of the given stats was drainable
     */
    public static boolean checkNpcDrain(Npc npc, double drain, boolean apply, Constants.BonusType... bonuses) {
        boolean drained = false;
        int[] initialBonuses = NpcDataLoader.getBonuses(npc.getId());
        if (initialBonuses == null) {
            return false;
        }
        for (Constants.BonusType bonus : bonuses) {
            if (initialBonuses[bonus.getId()] == 0) {
                continue;
            }
            if (npc.getBonuses()[bonus.getId()] == initialBonuses[bonus.getId()]) {
                if (!apply) {
                    return true;
                }
                drained = true;
                npc.getBonuses()[bonus.getId()] = (int) Math.floor((double) npc.getBonuses()[bonus.getId()] * (1.0 - drain));
            }
        }
        return drained;
    }

    /**
     * Attack multiple enemies using magic
     */
    private static void castMultiTargetCombatSpell(Player player, PlayerCombat combat, Spell spell) {
        Entity[] targets = combat.getMultiAttackTargets(player);
        if (targets == null) return;
        player.setNextAnimation(new Animation(spell.getAnimationId(player)));
        player.setNextGraphics(spell.getCastGfx());
        combat.setMagicHitGfx(spell.getEndGfx());
        combat.setBaseMagicXp(spell.getXp());

        combat.attackTargets(targets, new PlayerCombat.MultiAttack() {
            private boolean nextTarget;

            @Override
            public boolean attack() {
                if (spell.projectile != null && !spell.sendCustomProjectile(player, combat))
                    World.sendProjectile(player, combat.getTarget(), spell.getProjectile());
                int damage = combat.getRandomMagicMaxHit(player, spell.getDamage(player));
                combat.delayMagicHit(spell.getType().getHitDelay(player), combat.getMagicHit(player, spell
                        .processPreHitEffects(player, combat, combat.getRandomMagicMaxHit(player, spell.getDamage(player)
                        ))));
                if (!nextTarget) {
                    if (damage == -1) return false;
                    nextTarget = true;
                }
                return true;
            }
        });
    }

    /**
     * Does the player have a staff (for animation)
     */
    private static boolean wearingStaff(Player player) {
        ItemDefinitions definitions = ItemDefinitions.getItemDefinitions(player.getEquipment().getWeaponId());
        return definitions != null && (definitions.getName().toLowerCase().contains("staff")
                || definitions.getName().toLowerCase().contains("wand"));
    }

    /**
     * Do we have an infinite amount of this rune
     */
    private static boolean hasInfiniteRunes(int runeId, int weaponId, int shieldId) {
        if (runeId == AIR_RUNE) {
            // air staff
            return weaponId == 1381 || weaponId == 21777;
        } else if (runeId == WATER_RUNE) {
            // water staff
            return weaponId == 1383 || shieldId == 18346;
        } else if (runeId == EARTH_RUNE) {
            // earth staff
            return weaponId == 1385;
        } else if (runeId == FIRE_RUNE) {
            // fire staff
            return weaponId == 1387;
        }
        return false;
    }

    /**
     * Check if we can cast this spell and set is as next spell according to set value
     */
    private static boolean checkCombatSpell(Player player, int spellId, int set, boolean delete) {
        Spell spell = Spell.forId(spellId, player.getCombatDefinitions().getSpellBook());
        if (spell != null && spell.checkRequirements(player)) {
            if (set >= 0) {
                if (set == 0) player.getCombatDefinitions().setAutoCastSpell(spellId);
                else player.getTemporaryAttributes().put("tempCastSpell", spellId);
            }
            if (delete) deleteRunes(player, spell);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Cast veng spell
     */
    private static void castVeng(Player player, Spell spell) {
        if (player.getLastVeng() > 0) {
            player.sendMessage("You can't cast vengeance again yet.");
            return;
        }
        if (spell == Spell.VENGEANCE_GROUP) {
            player.setNextAnimation(new Animation(4411));
            player.setLastVeng(50);
            HashSet<Player> playersInArea = PlayerUtils.getPlayersInArea(player, 4);
            player.getPackets().sendGameMessage("You cast a vengeance group. It affected " + (
                    playersInArea.size() == 1 ? " only one person." : playersInArea.size() + " people."));
            for (Player p : playersInArea) {
                p.setNextGraphics(new Graphics(725, 0, 100));
                p.setCastVeng();
                p.getPackets().sendGameMessage("You have the power of vengeance!");
            }
        } else {
            player.setNextGraphics(new Graphics(726, 0, 100));
            player.setNextAnimation(new Animation(4410));
            player.setCastVeng();
            player.setLastVeng(50);
            player.getPackets().sendGameMessage("You cast a vengeance.");
        }
    }

    /**
     * Cast veng other spell
     */
    private static void castVengOther(Player player, Player other) {
        if (other.hasVengCast()) {
            player.sendMessage("They already have vengeance.");
            return;
        }
        if (player.getLastVeng() > 0) {
            player.sendMessage("You can't cast vengeance again yet.");
            return;
        }

        other.setNextGraphics(new Graphics(725, 0, 100));
        player.setNextAnimation(new Animation(4411));
        other.setCastVeng();
        player.setLastVeng(50);
        player.getPackets().sendGameMessage("You cast a vengeance.");
        other.getPackets().sendGameMessage("You have the power of vengeance!");
    }

    /**
     * Alchemise an item
     *
     * @param player     the alchemist
     * @param itemId     the item
     * @param multiplier multiplier of the items price
     */
    private static void alch(Player player, int itemId, double multiplier) {
        player.setNextAnimation(new Animation(9633));
        player.setNextGraphics(new Graphics(112));
        player.getInventory().removeItems(new Item(itemId, 1));
        player.getInventory().addItem(995, (int) Math.ceil(PriceUtils.getPrice(itemId) * multiplier));
        player.sendMessage("You receive: " + (int) Math.ceil(PriceUtils.getPrice(itemId) * multiplier) + " coins.");
        player.getInterfaceManager().sendMagicBook();
    }

    private static boolean superheat(Player player, int itemId) {
        Smelting.SmeltingBar bar = Smelting.SmeltingBar.getBarForSuperheatItem(player, itemId);
        if (bar == null) {
            player.sendMessage("You need to cast superheat item on ore.");
            player.setNextGraphics(new Graphics(85));
            return false;
        }
        if (!player.getInventory().containsItems(bar.getItemsRequired())) {
            player.sendMessage("You do not have the required materials to smelt a " + bar.getProducedBar().getName() + ".");
            return false;
        }
        if (!RequirementsManager.hasRequirement(player, Skills.SMITHING, bar.getLevelRequired(), "to smelt " + bar.getProducedBar().getDefinitions().getName()))
            return false;
        player.setNextAnimation(new Animation(725));
        player.setNextGraphics(new Graphics(148));
        for (Item required : bar.getItemsRequired()) {
            player.getInventory().deleteItem(required.getId(),
                    required.getAmount());
        }
        player.getSkills().addXp(Skills.SMITHING, bar.getExperience());
        player.getInventory().addItem(bar.getProducedBar());
        return true;
    }

    /**
     * Handles using a spell on an item
     */
    public static void handleMagicOnItem(Player player, int spellId, int itemId, int interfaceId) {
        Spell spell = Spell.forId(spellId, interfaceId);
        if (spell == null) return;
        if (!spell.checkRequirements(player)) return;
        switch (spell) {
            case HIGH_ALCHEMY:
                alch(player, itemId, 0.6D);
                break;
            case LOW_ALCHEMY:
                alch(player, itemId, 0.3);
                break;
            case SUPERHEAT:
                if (!superheat(player, itemId)) {
                    return;
                }
                break;
            default:
                return;
        }
        deleteRunes(player, spell);
        player.getSkills().addXp(Skills.MAGIC, spell.getXp());
    }

    /**
     * Handle magic used in ground items
     *
     * @param player      the caster
     * @param itemId      the item cast on
     * @param x           items x coordinate
     * @param y           items y coordinate
     * @param interfaceId inventory interface id (can define spell books with this)
     */
    public static void handleMagicOnGround(Player player, int itemId, int x, int y, int spellId, int interfaceId) {
        final WorldTile tile = new WorldTile(x, y, player.getPlane());
        final int regionId = tile.getRegionId();
        if (!player.getMapRegionsIds().contains(regionId)) return;
        final FloorItem item = World.getRegion(regionId).getGroundItem(itemId, tile, player);
        if (item == null) return;
        player.stopAll(false);

        Spell spell = Spell.forId(spellId, interfaceId);

        switch (spell) {
            //TODO add this
        }

        player.setNextFaceWorldTile(tile);
        player.setNextAnimation(new Animation(711));
        player.getSkills().addXp(Skills.MAGIC, 10);
        World.sendProjectile(player, new WorldTile(x, y, player.getPlane()), 142, 18, 5, 20, 50, 0, 0);
        CoresManager.slowExecutor.schedule(() -> {
            if (World.getRegion(regionId).getGroundItem(itemId, tile, player) == null) {
                player.sendMessage("Too late - it's gone!");
                return;
            }
            World.sendGraphics(player, new Graphics(144), tile);
            player.getInventory().deleteItem(563, 1);
            player.getInventory().addItem(item.getId(), item.getAmount());
            World.removeGroundItem(player, item, false);
        }, 2, TimeUnit.SECONDS);
    }
}

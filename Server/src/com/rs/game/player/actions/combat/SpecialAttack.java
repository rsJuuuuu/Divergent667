package com.rs.game.player.actions.combat;

import com.rs.game.Hit;
import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.*;
import com.rs.utils.Utils;

/**
 * Created by Peng on 26.11.2016 12:58.
 */
public class SpecialAttack {

    private interface Attack {
        int process(Player player, PlayerCombat combat, Special special);
    }

    private enum Special {
        DRAGON_MACE(1434, 25, 1.45, 1060, 251, 2541, SpecialAttack::normalMeleeSpecial),
        DRAGON_DAGGER(new int[]{1215, 1231, 5680, 5698}, 25, 1.15, 1062, new Graphics(252, 0, 100), 2537,
                SpecialAttack::normalMeleeSpecial, 2),
        DRAGON_SCIMITAR(4587, 55, 1.0, 12031, 2118, 2540, SpecialAttack::normalMeleeSpecial) {
            @Override
            void applyOnHitEffects(Player player, PlayerCombat combat, int damage) {
                if (combat.getTarget() instanceof Player) {
                    Player p2 = (Player) combat.getTarget();
                    p2.setPrayerDelay(5000);
                }
            }
        },
        DRAGON_LONGSWORD(1305, 25, 1.25, 12003, 2117, -1, SpecialAttack::normalMeleeSpecial),
        DRAGON_HALBERD(3204, 50, 1.1, 1665, 282, -1, SpecialAttack::dragonHalberdSpecial),
        DRAGON_SPEAR(new int[]{1249, 1263, 3176, 5716, 5730, 13770, 13772, 13774, 13776}, 25, 0, 12017, new Graphics
                (80, 5, 60), -1, SpecialAttack::dragonSpearSpecial),
        DRAGON_CLAWS(14484, 50, 1.0, 10961, 1950, -1, SpecialAttack::dragonClawsSpecial),
        BARRELCHEST_ANCHOR(10887, 50, 1.0, 5870, 1027, -1, SpecialAttack::normalMeleeSpecial),
        ABYSSAL_WHIP(new int[]{15442, 15443, 15444, 15441, 4151}, 50, 1.2, 11971, new Graphics(2108, 0, 100), -1,
                SpecialAttack::normalMeleeSpecial) {
            @Override
            void applyOnHitEffects(Player player, PlayerCombat combat, int damage) {
                if (damage < 0) return;
                if (combat.getTarget() instanceof Player) {
                    Player p2 = (Player) combat.getTarget();
                    p2.setRunEnergy(p2.getRunEnergy() > 25 ? p2.getRunEnergy() - 25 : 0);
                }
            }
        },
        SGS(11698, 50, 1.1, 12019, 2109, -1, SpecialAttack::normalMeleeSpecial) {
            @Override
            void applyOnHitEffects(Player player, PlayerCombat combat, int damage) {
                player.heal(damage / 2);
                player.getPrayer().restorePrayer(damage / 4 * 10);
            }
        },
        BGS(11696, 100, 1.2, 11991, 2114, -1, SpecialAttack::normalMeleeSpecial) {
            @Override
            void applyOnHitEffects(Player player, PlayerCombat combat, int damage) {
                if (!(combat.getTarget() instanceof Player)) return;
                Player targetPlayer = (Player) combat.getTarget();
                int amountLeft;
                if ((amountLeft = targetPlayer.getSkills().drainLevel(Skills.DEFENCE, damage / 10)) > 0) {
                    if ((amountLeft = targetPlayer.getSkills().drainLevel(Skills.STRENGTH, amountLeft)) > 0) {
                        if ((amountLeft = targetPlayer.getSkills().drainLevel(Skills.PRAYER, amountLeft)) > 0) {
                            if ((amountLeft = targetPlayer.getSkills().drainLevel(Skills.ATTACK, amountLeft)) > 0) {
                                if ((amountLeft = targetPlayer.getSkills().drainLevel(Skills.MAGIC, amountLeft)) > 0) {
                                    targetPlayer.getSkills().drainLevel(Skills.RANGE, amountLeft);
                                }
                            }
                        }
                    }
                }
            }
        },
        ZGS(11700, 100, 1.0, 7070, 1221, -1, SpecialAttack::normalMeleeSpecial) {
            @Override
            void applyOnHitEffects(Player player, PlayerCombat combat, int damage) {
                Entity target = combat.getTarget();
                player.setNextAnimation(new Animation(7070));
                player.setNextGraphics(new Graphics(1221));
                if (damage != 0 && target.getSize() <= 1) {
                    target.setNextGraphics(new Graphics(2104));
                    target.addFreezeDelay(18000);
                }
            }
        },
        AGS(11694, 50, 1.5, 11989, 2113, -1, SpecialAttack::normalMeleeSpecial),
        THOK(20821, 100, 1.7, 6606, 281, -1, SpecialAttack::normalMeleeSpecial),
        SARADOMIN_SWORD(11730, 100, 1.1, 11993, 1194, 3853, SpecialAttack::saradominSwordSpecial, 4),
        VLS(new int[]{13899, 13901}, 25, 1.2, 1052, -1, -1, SpecialAttack::normalMeleeSpecial),
        STATIUS_WAR_HAMMER(new int[]{13902, 13904}, 50, 1.25, 10505, 1840, -1, SpecialAttack::normalMeleeSpecial),
        VESTA_SPEAR(new int[]{13904, 13907}, 50, 1.1, 10499, 1835, -1, SpecialAttack::normalMeleeSpecial),
        KORASI(new int[]{19780, 19784, 22401}, 60, 1, 14788, 1729, -1, SpecialAttack::korasiSpecial),
        STAFF_OF_LIGHT(new int[]{15486, 22207, 22209, 22211, 22213}, 100, SpecialAttack::staffOfLightSpecial),
        DRAGON_BATTLE_AXE(new int[]{1377, 13472}, 100, SpecialAttack::dragonBattleAxeSpecial),
        ENCALIBUR(new int[]{35, 14632}, 100, SpecialAttack::excaliburSpecial),
        GRANITE_MAUL(new int[]{4153}, 50, SpecialAttack::graniteMaulSpecial),
        GUTHIX_BOW(new int[]{19146, 19148}, 55, 1, 426, 95, -1, 98, SpecialAttack::normalRangedSpecial, 1),
        SARADOMIN_BOW(new int[]{19143, 19145}, 55, 1, 426, 96, -1, 99, SpecialAttack::normalRangedSpecial, 1),
        ZAMORAK_BOW(new int[]{19149, 19151}, 55, 1, 426, 97, -1, 100, SpecialAttack::normalRangedSpecial, 1),
        MAGIC_BOW(new int[]{859, 861, 10284, 18332}, 55, 1.0, 1074, new Graphics(249, 0, 100), -1,
                SpecialAttack::magicBowSpecial, 1),
        DARK_BOW(new int[]{11235, 15701, 15702, 15703, 15704}, 65, -1, -1, -1, -1, SpecialAttack::darkBowSpecial),
        HAND_CANNON(new int[]{15241}, 50, 1.0, 12174, 2138, -1, SpecialAttack::handCannonSpecial),
        MORRIGANS_THROWN_AXE(new int[]{13883, 13957}, 50, 1.0, 10504, 1838, new Projectile(1839, 41, 41, 41, 35, 0,
                0), -1, SpecialAttack::normalRangedSpecial, 1, 2) {
            @Override
            public boolean useWeaponAsAmmo() {
                return true;
            }
        },
        MORRIGANS_JAVELIN(new int[]{13954, 12955, 13956, 13879, 13880, 13881, 13882}, 50, 1.0, 10501, 1836, new
                Projectile(1837, 41, 41, 41, 35, 0, 0), -1, SpecialAttack::morriganJavelinSpecial, 1, 2) {
            @Override
            public boolean useWeaponAsAmmo() {
                return true;
            }
        },
        ZANIK_C_BOW(new int[14648], 50, -1, 2075, 1714, new Projectile(2001, 41, 41, 41, 35, 0, 0), -1,
                SpecialAttack::zanikBowSpecial, 1, 2);
        private int specialAmount, soundId, numberOfHits = 1, delay = 1;

        private double damageMultiplier;

        private boolean instantSpecial = false;

        private int[] weaponIds;

        private Graphics graphics;
        private Animation animation;
        private Projectile projectile;
        private Attack attack;

        Special(int[] weaponIds, int specialAmount, double damageMultiplier, Animation animation, Graphics gfx, int
                soundId, Attack attack, int numberOfHits) {
            this.weaponIds = weaponIds;
            this.specialAmount = specialAmount;
            this.damageMultiplier = damageMultiplier;
            this.animation = animation;
            this.graphics = gfx;
            this.soundId = soundId;
            this.attack = attack;
            this.numberOfHits = numberOfHits;
        }

        Special(int[] weaponIds, int specialAmount, double damageMultiplier, int animationId, Graphics graphics, int
                soundId, Attack attack, int numberOfHits) {
            this(weaponIds, specialAmount, damageMultiplier, new Animation(animationId), graphics, soundId, attack,
                    numberOfHits);
        }

        Special(int[] weaponIds, int specialAmount, double damageMultiplier, int animationId, Graphics graphics, int
                soundId, Attack attack) {
            this(weaponIds, specialAmount, damageMultiplier, new Animation(animationId), graphics, soundId, attack, 1);
        }

        Special(int weaponId, int specialAmount, double damageMultiplier, int animationId, int gfxId, int soundId,
                Attack attack) {
            this(new int[]{weaponId}, specialAmount, damageMultiplier, new Animation(animationId), new Graphics
                    (gfxId), soundId, attack, 1);
        }

        Special(int[] weaponIds, int specialAmount, double damageMultiplier, int animationId, int gfxId, int soundId,
                Attack attack) {
            this(weaponIds, specialAmount, damageMultiplier, new Animation(animationId), new Graphics(gfxId),
                    soundId, attack, 1);
        }

        Special(int weaponId, int specialAmount, double damageMultiplier, int animationId, int gfxId, int soundId,
                Attack attack, int numberOfHits) {
            this(new int[]{weaponId}, specialAmount, damageMultiplier, new Animation(animationId), new Graphics
                    (gfxId), soundId, attack, numberOfHits);
        }

        /**
         * For ranged
         */
        Special(int[] weaponIds, int specialAmount, double damageMultiplier, int animationId, int gfxId, int
                projectileId, int soundId, Attack attack, int numberOfHits) {
            this(weaponIds, specialAmount, damageMultiplier, new Animation(animationId), new Graphics(gfxId),
                    soundId, attack, numberOfHits);
            projectile = Projectile.getDefaultRangedProjectile(projectileId);
        }

        /**
         * For ranged
         */
        Special(int[] weaponIds, int specialAmount, double damageMultiplier, int animationId, int gfxId, Projectile
                projectile, int soundId, Attack attack, int numberOfHits, int delay) {
            this(weaponIds, specialAmount, damageMultiplier, new Animation(animationId), new Graphics(gfxId),
                    soundId, attack, numberOfHits);
            this.projectile = projectile;
            this.delay = delay;
        }

        /**
         * For ranged
         */
        Special(int[] weaponIds, int specialAmount, double damageMultiplier, int animationId, Graphics gfx,
                Projectile projectile, int soundId, Attack attack, int numberOfHits, int delay) {
            this(weaponIds, specialAmount, damageMultiplier, new Animation(animationId), gfx, soundId, attack,
                    numberOfHits);
            this.projectile = projectile;
            this.delay = delay;
        }

        /**
         * This constructor is only for instant specials
         * As all of these need individual handling there's no point having the animations or graphics stored in the
         * enum
         */
        Special(int[] weaponIds, int specialAmount, Attack attack) {
            this(weaponIds, specialAmount, -1.0, null, null, -1, attack, 1);
            instantSpecial = true;
        }

        void applyOnHitEffects(Player player, PlayerCombat combat, int damage) {
        }

        public int process(Player player, PlayerCombat combat) {
            return attack.process(player, combat, this);
        }

        public static Special forId(int id) {
            for (Special special : Special.values()) {
                for (int weaponId : special.weaponIds) {
                    if (weaponId == id) return special;
                }
            }
            return null;
        }

        public boolean isInstantSpecial() {
            return instantSpecial;
        }

        public boolean useWeaponAsAmmo() {
            return false;
        }
    }

    private static int normalRangedSpecial(Player player, PlayerCombat combat, Special special) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        player.setNextAnimation(special.animation);
        player.setNextGraphics(special.graphics);
        int damage;
        for (int i = 0; i < special.numberOfHits; i++) {
            World.sendProjectile(player, combat.getTarget(), special.projectile);
            damage = combat.getRandomMaxHit(player, weaponId, attackStyle, true, true, special.damageMultiplier, true);
            special.applyOnHitEffects(player, combat, damage);
            combat.delayHit(special.delay, weaponId, attackStyle, combat.getRangeHit(player, damage));
        }

        combat.dropAmmo(player, special.useWeaponAsAmmo() ? -1 : special.numberOfHits);
        PlayerCombat.playSound(special.soundId, player, combat.getTarget());
        return -1;
    }

    private static int normalMeleeSpecial(Player player, PlayerCombat combat, Special special) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        player.setNextAnimation(special.animation);
        player.setNextGraphics(special.graphics);
        int damage;
        for (int i = 0; i < special.numberOfHits; i++) {
            damage = combat.getRandomMaxHit(player, weaponId, attackStyle, false, true, special.damageMultiplier, true);
            special.applyOnHitEffects(player, combat, damage);
            combat.delayHit(0, weaponId, attackStyle, combat.getMeleeHit(player, damage));
        }
        PlayerCombat.playSound(special.soundId, player, combat.getTarget());
        return -1;
    }

    private static int handCannonSpecial(Player player, PlayerCombat combat, Special special) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        Entity target = combat.getTarget();
        WorldTasksManager.schedule(new WorldTask() {
            int loop = 0;

            @Override
            public void run() {
                if ((target.isDead() || player.isDead() || loop > 1)) {
                    stop();
                    return;
                }
                player.setNextAnimation(special.animation);
                player.setNextGraphics(special.graphics);
                World.sendProjectile(player, target, 2143, 18, 18, 50, 50, 0, 0);
                combat.delayHit(1, weaponId, attackStyle, combat.getRangeHit(player, combat.getRandomMaxHit(player,
                        weaponId, attackStyle, true, true, 1.0, true)));
                if (loop == 1) stop();
                loop++;
            }
        }, 0, (int) 0.25);
        return 9;
    }

    private static void fireDoubleArrow(Entity start, Entity target, int projectilId) {
        World.sendProjectile(start, target, projectilId, 41, 16, 31, 35, 16, 0);
        World.sendProjectile(start, target, projectilId, 41, 16, 25, 35, 21, 0);

    }

    private static int magicBowSpecial(Player player, PlayerCombat combat, Special special) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        player.setNextAnimation(special.animation);
        player.setNextGraphics(special.graphics);
        Entity target = combat.getTarget();
        fireDoubleArrow(player, target, 249);
        combat.delayHit(2, weaponId, attackStyle, combat.getRangeHit(player, combat.getRandomMaxHit(player, weaponId,
                attackStyle, true, true, 1.0, true)));
        combat.delayHit(3, weaponId, attackStyle, combat.getRangeHit(player, combat.getRandomMaxHit(player, weaponId,
                attackStyle, true, true, 1.0, true)));
        combat.dropAmmo(player, 2);
        PlayerCombat.playSound(special.soundId, player, combat.getTarget());
        return -1;
    }

    private static int darkBowSpecial(Player player, PlayerCombat combat, Special special) {
        int ammoId = player.getEquipment().getAmmoId();
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        Entity target = combat.getTarget();
        player.setNextAnimation(new Animation(PlayerCombat.getWeaponAttackEmote(weaponId, attackStyle)));
        player.setNextGraphics(new Graphics(combat.getArrowThrowGfxId(weaponId, ammoId), 0, 100));

        int damage = combat.getRandomMaxHit(player, weaponId, attackStyle, true, true, 1.5, true);
        int damage2 = combat.getRandomMaxHit(player, weaponId, attackStyle, true, true, 1.5, true);
        int projectileId = 1099;
        if (ammoId == 11212) {
            if (damage < 80) damage = 80;
            if (damage2 < 80) damage = 80;
            WorldTasksManager.schedule(new WorldTask() {
                @Override
                public void run() {
                    target.setNextGraphics(new Graphics(1100, 0, 100));
                }
            }, 2);
        } else {
            projectileId = 1101;
            if (damage < 50) damage = 50;
            if (damage2 < 50) damage = 50;
        }
        fireDoubleArrow(player, target, projectileId);
        combat.delayHit(2, weaponId, attackStyle, combat.getRangeHit(player, damage));
        combat.delayHit(3, weaponId, attackStyle, combat.getRangeHit(player, damage2));

        combat.dropAmmo(player, 2);
        return -1;
    }

    private static int zanikBowSpecial(Player player, PlayerCombat combat, Special special) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        player.setNextAnimation(special.animation);
        player.setNextGraphics(special.graphics);
        World.sendProjectile(player, combat.getTarget(), special.projectile);
        combat.delayHit(2, weaponId, attackStyle, combat.getRangeHit(player,
                combat.getRandomMaxHit(player, weaponId, attackStyle, true, true, 1.0, true) + 30
                + Utils.getRandom(120)));
        combat.dropAmmo(player, special.numberOfHits);
        return -1;
    }

    private static int morriganJavelinSpecial(Player player, PlayerCombat combat, Special special) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        player.setNextGraphics(special.graphics);
        player.setNextAnimation(special.animation);
        Entity target = combat.getTarget();
        World.sendProjectile(player, target, special.projectile);
        final int hit = combat.getRandomMaxHit(player, weaponId, attackStyle, true, true, 1.0, true);
        combat.delayHit(2, weaponId, attackStyle, combat.getRangeHit(player, hit));
        if (hit > 0) {
            final Entity finalTarget = target;
            WorldTasksManager.schedule(new WorldTask() {
                int damage = hit;

                @Override
                public void run() {
                    if (finalTarget.isDead() || finalTarget.hasFinished()) {
                        stop();
                        return;
                    }
                    if (damage > 50) {
                        damage -= 50;
                        finalTarget.applyHit(new Hit(player, 50, Hit.HitLook.REGULAR_DAMAGE));
                    } else {
                        finalTarget.applyHit(new Hit(player, damage, Hit.HitLook.REGULAR_DAMAGE));
                        stop();
                    }
                }
            }, 4, 2);
        }
        combat.dropAmmo(player, -1);
        return -1;
    }

    private static int saradominSwordSpecial(Player player, PlayerCombat combat, Special special) {
        player.setNextAnimation(special.animation);
        combat.getTarget().setNextGraphics(special.graphics);
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        combat.delayHit(0, weaponId, attackStyle, combat.getMeleeHit(player, 50
                                                                             + Utils.getRandom(100)), combat
                .getMeleeHit(player, combat.getRandomMaxHit(player, weaponId, attackStyle, false, true, 1.1, true)));
        PlayerCombat.playSound(special.soundId, player, combat.getTarget());
        return -1;
    }

    private static int dragonSpearSpecial(Player player, PlayerCombat combat, Special special) {
        Entity target = combat.getTarget();
        player.setNextAnimation(special.animation);
        player.stopAll();
        target.setNextGraphics(special.graphics);

        if (!target.addWalkSteps(
                target.getX() - player.getX() + target.getX(), target.getY() - player.getY() + target.getY(), 1))
            player.setNextFaceEntity(target);
        target.setNextFaceEntity(player);
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                target.setNextFaceEntity(null);
                player.setNextFaceEntity(null);
            }
        });
        if (target instanceof Player) {
            final Player other = (Player) target;
            other.setInfiniteStopDelay();
            other.addFoodDelay(3000);
            other.setDisableEquip(true);
            WorldTasksManager.schedule(new WorldTask() {
                @Override
                public void run() {
                    other.setDisableEquip(false);
                    other.resetStopDelay();
                }
            }, 5);
        } else {
            Npc n = (Npc) target;
            n.setFreezeDelay(3000);
            n.resetCombat();
            n.setRandomWalk(false);
        }
        return -1;
    }

    private static int dragonHalberdSpecial(Player player, PlayerCombat combat, Special special) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        player.setNextAnimation(special.animation);
        player.setNextGraphics(special.graphics);
        Entity target = combat.getTarget();
        if (target.getSize() < 3) {
            target.setNextGraphics(new Graphics(254, 0, 100));
            target.setNextGraphics(new Graphics(80));
        }
        combat.delayHit(0, weaponId, attackStyle, combat.getMeleeHit(player, combat.getRandomMaxHit(player, weaponId,
                attackStyle, false, true, special.damageMultiplier, true)));
        if (target.getSize() > 1)
            combat.delayHit(1, weaponId, attackStyle, combat.getMeleeHit(player, combat.getRandomMaxHit(player,
                    weaponId, attackStyle, false, true, special.damageMultiplier, true)));
        return -1;
    }

    private static int dragonClawsSpecial(Player player, PlayerCombat combat, Special special) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        player.setNextAnimation(special.animation);
        player.setNextGraphics(special.graphics);
        int hit1 = combat.getRandomMaxHit(player, weaponId, attackStyle, false, true, 1.0, true);
        int hit2 = hit1 == 0 ? combat.getRandomMaxHit(player, weaponId, attackStyle, false, true, 1.0, true) : hit1;
        if (hit1 == 0 && hit2 == 0) {
            int hit3 = combat.getRandomMaxHit(player, weaponId, attackStyle, false, true, 1.0, true);
            if (hit3 == 0) {
                int hit4 = combat.getRandomMaxHit(player, weaponId, attackStyle, false, true, 1.0, true);
                if (hit4 == 0) {
                    combat.delayHit(0, weaponId, attackStyle, combat.getMeleeHit(player, hit1), combat.getMeleeHit
                            (player, hit2));
                    combat.delayHit(1, weaponId, attackStyle, combat.getMeleeHit(player, hit3), combat.getMeleeHit
                            (player, 1));
                } else {
                    combat.delayHit(0, weaponId, attackStyle, combat.getMeleeHit(player, hit1), combat.getMeleeHit
                            (player, hit2));
                    combat.delayHit(1, weaponId, attackStyle, combat.getMeleeHit(player, hit3), combat.getMeleeHit
                            (player, (int) (
                            hit4 * 1.5)));
                }
            } else {
                combat.delayHit(0, weaponId, attackStyle, combat.getMeleeHit(player, hit1), combat.getMeleeHit
                        (player, hit2));
                combat.delayHit(1, weaponId, attackStyle, combat.getMeleeHit(player, hit3), combat.getMeleeHit
                        (player, hit3));
            }
        } else {
            combat.delayHit(0, weaponId, attackStyle, combat.getMeleeHit(player, hit1), combat.getMeleeHit(player,
                    hit1 == 0 ? hit2 : hit2 / 2));
            combat.delayHit(1, weaponId, attackStyle, combat.getMeleeHit(player,
                    hit1 == 0 ? hit2 / 2 : hit2 / 4), combat.getMeleeHit(player, hit2 / 4));
        }
        return -1;
    }

    private static int korasiSpecial(Player player, PlayerCombat combat, Special special) {
        player.setNextAnimation(special.animation);
        player.setNextGraphics(special.graphics);
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        int korasiDamage = PlayerCombat.getMaxHit(player, weaponId, attackStyle, false, true, 1);
        double multiplier = 0.5;
        multiplier += Math.random();
        korasiDamage *= multiplier;
        combat.delayHit(0, weaponId, attackStyle, combat.getMagicHit(player, korasiDamage));
        return -1;
    }

    private static int graniteMaulSpecial(Player player, PlayerCombat combat, Special special) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        if (combat == null) //means we are being called from the interface handler (not combat)
        {
            if (player.getActionManager().getAction() != null
                //this should have been checked already but no harm to check again
                && (player.getActionManager().getAction() instanceof PlayerCombat)) {
                player.getCombatDefinitions().switchUsingSpecialAttack();//must enable spec else we do normal hits
                combat = (PlayerCombat) player.getActionManager().getAction();
                combat.processWithDelay(player);
            }
        } else {
            player.setNextAnimation(new Animation(1667));
            player.setNextGraphics(new Graphics(340, 0, 96 << 16));
            combat.delayHit(0, weaponId, attackStyle, combat.getMeleeHit(player, combat.getRandomMaxHit(player,
                    weaponId, attackStyle, false, true, 1.1, true)));
        }
        return -1;
    }

    private static int staffOfLightSpecial(Player player, PlayerCombat combat, Special special) {
        player.setNextAnimation(new Animation(12804));
        player.setNextGraphics(new Graphics(2319));// 2320
        player.setNextGraphics(new Graphics(2321));
        player.addSolDelay(60000);
        return -1;
    }

    private static int dragonBattleAxeSpecial(Player player, PlayerCombat combat, Special special) {
        player.setNextAnimation(new Animation(1056));
        player.setNextGraphics(new Graphics(246));
        player.setNextForceTalk(new ForceTalk("Raarrrrrgggggghhhhhhh!"));
        int defence = (int) (player.getSkills().getLevel(Skills.DEFENCE) * 0.90D);
        int attack = (int) (player.getSkills().getLevel(Skills.ATTACK) * 0.90D);
        int range = (int) (player.getSkills().getLevel(Skills.RANGE) * 0.90D);
        int magic = (int) (player.getSkills().getLevel(Skills.MAGIC) * 0.90D);
        int strength = (int) (player.getSkills().getLevel(Skills.STRENGTH) * 1.2D);
        player.getSkills().set(Skills.DEFENCE, defence);
        player.getSkills().set(Skills.ATTACK, attack);
        player.getSkills().set(Skills.RANGE, range);
        player.getSkills().set(Skills.MAGIC, magic);
        player.getSkills().set(Skills.STRENGTH, strength);
        return -1;
    }

    private static int excaliburSpecial(Player player, PlayerCombat combat, Special special) {
        player.setNextAnimation(new Animation(1168));
        player.setNextGraphics(new Graphics(247));
        player.setNextForceTalk(new ForceTalk("For Camelot!"));
        final boolean enhanced = player.getEquipment().getWeaponId() == 14632;
        player.getSkills().set(Skills.DEFENCE, enhanced ? (int) (player.getSkills().getLevelForXp(Skills.DEFENCE)
                                                                 * 1.15D) : (player.getSkills().getLevel(Skills.DEFENCE)
                                                                             + 8));
        WorldTasksManager.schedule(new WorldTask() {
            int count = 5;

            @Override
            public void run() {
                if (player.isDead() || player.hasFinished() || player.getHealth() >= player.getMaxHitPoints()) {
                    stop();
                    return;
                }
                player.heal(enhanced ? 80 : 40);
                if (count-- == 0) {
                    stop();
                }
            }
        }, 4, 2);
        return -1;
    }

    static int processSpecial(Player player, PlayerCombat combat) {
        Special special = Special.forId(player.getEquipment().getWeaponId());
        if (special == null) {
            player.sendMessage("This weapon has no special attack. Please report staff.");
            return -1;
        }
        int specAmt = special.specialAmount;
        if (specAmt == 0) {
            player.getPackets().sendGameMessage("This weapon has no special attack. Please report staff.");
            player.getCombatDefinitions().decreaseSpecial(0);
            return -1;
        }
        if (player.getCombatDefinitions().hasRingOfVigour()) specAmt *= 0.9;
        if (player.getCombatDefinitions().getSpecialAttackPercentage() < specAmt) {
            player.getPackets().sendGameMessage("You don't have enough power left.");
            player.getCombatDefinitions().decreaseSpecial(0);
            return -1;
        }
        player.getCombatDefinitions().decreaseSpecial(specAmt);
        return special.process(player, combat);
    }

    public static boolean processInstantSpecial(Player player) {
        int weaponId = player.getEquipment().getWeaponId();
        Special special = Special.forId(weaponId);
        if (special == null) {
            player.sendMessage("This weapon has no special attack. Please report staff.");
            return false;
        }
        if (!special.isInstantSpecial()) return false;
        if (special == Special.GRANITE_MAUL && (player.getActionManager().getAction() == null
                                                || !(player.getActionManager().getAction() instanceof PlayerCombat)))
            return false;//special check for granite maul because if no combat we waste spec

        int specAmt = special.specialAmount;
        if (specAmt == 0) {
            player.getPackets().sendGameMessage("This weapon has no special attack. Please report staff.");
            player.getCombatDefinitions().decreaseSpecial(0);
            return true;
        }
        if (player.getCombatDefinitions().hasRingOfVigour()) specAmt *= 0.9;
        if (player.getCombatDefinitions().getSpecialAttackPercentage() < specAmt) {
            player.getPackets().sendGameMessage("You don't have enough power left.");
            player.getCombatDefinitions().decreaseSpecial(0);
            return true;
        }
        if (special != Special.GRANITE_MAUL)//we only take special when we hit
            player.getCombatDefinitions().decreaseSpecial(specAmt);
        special.process(player, null);
        return true;
    }

    public static boolean isInstantSpecialAvailable(int itemId) {
        Special special = Special.forId(itemId);
        return special != null && special.instantSpecial;
    }
}

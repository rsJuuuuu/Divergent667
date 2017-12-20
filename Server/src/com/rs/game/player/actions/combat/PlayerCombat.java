package com.rs.game.player.actions.combat;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.item.Item;
import com.rs.game.npc.Npc;
import com.rs.game.npc.impl.boss.godwars.zaros.NexMinion;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.CombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Prayer;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.skills.slayer.SlayerTask;
import com.rs.game.player.info.RanksManager;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.*;
import com.rs.utils.MapAreas;
import com.rs.utils.Utils;
import com.rs.utils.game.CombatUtils;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.ArrayList;
import java.util.List;

import static com.rs.utils.Constants.BonusType.*;

public class PlayerCombat extends Action {

    private Entity target;
    private int max_hit; // temporary constant
    private double baseMagicXp; // temporary constant
    private int magic_sound; // temporary constant
    private int max_poison_hit; // temporary constant
    private int freeze_time; // temporary constant

    private boolean block_tele;

    private transient boolean veracsEffect;

    private transient Graphics magicHitGfx;
    private transient Magic.Spell lastSpell;

    public PlayerCombat(Entity target) {
        this.target = target;
    }

    @Override
    public boolean start(Player player) {
        player.setNextFaceEntity(target);
        if (target instanceof Npc) {
            if (((Npc) target).getId() == 7891 && ((Npc) target).isSpawned()
                && !player.hasRights(RanksManager.Ranks.ADMIN)) {
                player.sendMessage("Only Admin+ can attack this dummy.");
                return false;
            }
        }
        if (checkAll(player)) return true;
        player.setNextFaceEntity(null);
        return false;
    }

    @Override
    public boolean process(Player player) {
        return checkAll(player);
    }

    @Override
    public int processWithDelay(Player player) {
        int isRanging = isRanging(player);
        int spellId = player.getCombatDefinitions().getSpellId();
        int maxDistance = isRanging != 0 || spellId > 0 ? 7 : 0;
        int distanceX = player.getX() - target.getX();
        int distanceY = player.getY() - target.getY();
        int size = target.getSize();
        if (!player.clippedProjectile(target, !(target instanceof NexMinion) && maxDistance == 0, size) && (
                (distanceX > size + maxDistance || distanceX < -1 - maxDistance || distanceY > size + maxDistance
                 || distanceY < -1 - maxDistance) || maxDistance != 0)) return 0;
        if (player.hasWalkSteps()) maxDistance += 1;
        if (distanceX > size + maxDistance || distanceX < -1 - maxDistance || distanceY > size + maxDistance
            || distanceY < -1 - maxDistance) return 0;
        if (!player.getControllerManager().keepCombating(target)) return -1;
        addAttackedByDelay(player);
        if (spellId > 0) {
            boolean manualCast = spellId >= 256;
            return castSpell(player, manualCast ? spellId - 256 : spellId, !manualCast);
        } else {
            if (isRanging == 0) {
                return meleeAttack(player);
            } else if (isRanging == 1) {
                player.getPackets().sendGameMessage("This ammo is not very effective with this.");
                return -1;
            } else if (isRanging == 3) {
                player.getPackets().sendGameMessage("You don't have any ammo in your backpack.");
                return -1;
            } else {
                return rangeAttack(player);
            }
        }
    }

    private void addAttackedByDelay(Entity player) {
        target.setAttackedBy(player);
        target.setAttackedByDelay(TimeUtils.getTime() + 8000); // 8seconds
    }

    private int getRangeCombatDelay(int weaponId, int attackStyle) {
        int delay = 6;
        if (weaponId != -1) {
            String weaponName = ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();
            if (weaponName.contains("shortbow") || weaponName.contains("karil's crossbow")) delay = 3;
            else if (weaponName.contains("crossbow")) delay = 5;
            else if (weaponName.contains("dart") || weaponName.contains("knife")) delay = 2;
            else if (weaponName.contains("chinchompa")) delay = 4;
            else {
                switch (weaponId) {
                    case 15241:
                    case 24338:
                        delay = 7;
                        break;
                    case 11235: // dark bows
                    case 15701:
                    case 15702:
                    case 15703:
                    case 15704:
                        delay = 9;
                        break;
                    default:
                        delay = 6;
                        break;
                }
            }
        }
        if (attackStyle == 1) delay--;
        else if (attackStyle == 2) delay++;
        return delay;
    }

    private int castSpell(Player player, int spellId, boolean autoCast) {
        if (!autoCast) {
            player.getCombatDefinitions().resetSpells(false);
            player.getActionManager().forceStop();
        }
        Magic.Spell spell = Magic.Spell.forId(spellId, player.getCombatDefinitions().getSpellBook());

        if (spell == null) {
            player.sendMessage("Invalid spell!");
            return -1;
        }
        lastSpell = spell;
        return spell.process(player, this);
    }

    public Entity getTarget() {
        return target;
    }

    void setMagicHitGfx(Graphics graphics) {
        magicHitGfx = graphics;
    }

    void setBaseMagicXp(double xp) {
        baseMagicXp = xp;
    }

    int getRandomMagicMaxHit(Player player, int baseDamage) {
        int hit = Utils.getRandom(getMagicMaxHit(player, baseDamage));
        if (hit != 0 && target instanceof Npc && ((Npc) target).getId() == 9463 && hasFireCape(player)) hit += 40;
        return hit;
    }

    private int getMagicMaxHit(Player player, int baseDamage) {
        double defBonus;
        double effectiveMagicDefence = 0;
        double att = ((player.getSkills().getLevel(Skills.MAGIC) + 8)
                      * CombatUtils.getCombatModifier(player, Skills.MAGIC));
        int style = CombatDefinitions.getXpStyle(player.getEquipment().getWeaponId(), player.getCombatDefinitions()
                .getAttackStyle());
        att += style == Skills.ATTACK ? 3 : style == CombatDefinitions.SHARED ? 1 : 0;
        att *= player.getAuraManager().getMagicAccurayMultiplier();
        if (CombatUtils.hasFullVoid(player, 11663, 11674)) att *= 1.3;
        double def = 0;
        if (target instanceof Player) {
            Player p2 = (Player) target;
            int p2style = CombatDefinitions.getXpStyle(p2.getEquipment().getWeaponId(), p2.getCombatDefinitions()
                    .getAttackStyle());
            def = ((p2.getSkills().getLevel(Skills.MAGIC) + 8) + CombatUtils.getCombatModifier(p2, Skills.DEFENCE)
                   + p2style == Skills.DEFENCE ? 3 : p2style == CombatDefinitions.SHARED ? 1 : 0);
            defBonus = p2.getCombatDefinitions().getBonuses()[MAGIC_DEF.getId()];
            effectiveMagicDefence = Math.floor((double) p2.getSkills().getLevel(Skills.MAGIC));
        } else {
            Npc n = (Npc) target;
            def = n.getBonuses() == null ? 0 : n.getBonuses()[MAGIC_DEF.getId()];
            defBonus = def;
        }
        effectiveMagicDefence *= 0.7;
        def *= 0.3;

        def = Math.floor(def);
        effectiveMagicDefence = Math.floor(effectiveMagicDefence);

        def = def + effectiveMagicDefence;
        double attBonus = player.getCombatDefinitions().getBonuses()[MAGIC_ATTACK.getId()];
        double attackRoll = Math.floor(att * (1 + attBonus / 64));
        double defenceRoll = Math.floor(def * (1 + defBonus / 64));
        double accuracy;
        if (attackRoll < defenceRoll) accuracy = (attackRoll - 1) / (2 * defenceRoll);
        else accuracy = 1 - (defenceRoll + 1) / (2 * attackRoll);
        if (Utils.getRandomGenerator().nextDouble() > accuracy) return 0;

        double extraDamage = player.getCombatDefinitions().getBonuses()[MAGIC_DAMAGE.getId()];
        max_hit = (int) (baseDamage * (1.0 + extraDamage / 100));
        double boost = 1 + ((player.getSkills().getLevel(Skills.MAGIC) - player.getSkills().getLevelForXp(Skills.MAGIC))
                            * 0.03);
        if (boost > 1) max_hit *= boost;
        return max_hit;
    }

    private int rangeAttack(final Player player) {
        final int weaponId = player.getEquipment().getWeaponId();
        final int attackStyle = player.getCombatDefinitions().getAttackStyle();
        int combatDelay = getRangeCombatDelay(weaponId, attackStyle);
        int soundId = getSoundId(weaponId, attackStyle);
        if (player.getCombatDefinitions().isUsingSpecialAttack()) {
            player.getCombatDefinitions().switchUsingSpecialAttack();
            int result = SpecialAttack.processSpecial(player, this);
            if (result > 0) return result;
            return combatDelay;
        } else {
            if (weaponId != -1) {
                String weaponName = ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();
                if (weaponName.contains("throwing axe") || weaponName.contains("knife") || weaponName.contains("dart")
                    || weaponName.contains("javelin") || weaponName.contains("thrownaxe")) {
                    if (!weaponName.contains("javelin") && !weaponName.contains("thrownaxe"))
                        player.setNextGraphics(new Graphics(getKnifeThrowGfxId(weaponId), 0, 100));
                    World.sendProjectile(player, target, getKnifeThrowGfxId(weaponId), 41, 16, 60, 30, 16, 0);
                    delayHit(1, weaponId, attackStyle, getRangeHit(player, getRandomMaxHit(player, weaponId,
                            attackStyle, true)));
                    dropAmmo(player, -1);
                } else if (weaponName.contains("crossbow")) {
                    int damage = 0;
                    int ammoId = player.getEquipment().getAmmoId();
                    if (ammoId != -1 && Utils.getRandom(10) == 5) {
                        switch (ammoId) {
                            case 9237:
                                damage = getRandomMaxHit(player, weaponId, attackStyle, true);
                                target.setNextGraphics(new Graphics(755));
                                if (target instanceof Player) {
                                    Player p2 = (Player) target;
                                    p2.stopAll();
                                } else {
                                    Npc n = (Npc) target;
                                    n.setTarget(null);
                                }
                                soundId = 2914;
                                break;
                            case 9242:
                                max_hit = Short.MAX_VALUE;
                                damage = (int) (target.getHealth() * 0.2);
                                target.setNextGraphics(new Graphics(754));
                                player.applyHit(new Hit(target, player.getHealth() > 20 ? (int) (player.getHealth()
                                                                                                 * 0.1) : 1, HitLook
                                        .REFLECTED_DAMAGE));
                                soundId = 2912;
                                break;
                            case 9243:
                                damage = getRandomMaxHit(player, weaponId, attackStyle, true, false, 1.15, true);
                                target.setNextGraphics(new Graphics(751));
                                soundId = 2913;
                                break;
                            case 9244:
                                damage = getRandomMaxHit(player, weaponId, attackStyle, true, false,
                                        CombatUtils.getDragonFireMaxHit(target, player) > 300 ? 1.45 : 1.0, true);
                                target.setNextGraphics(new Graphics(756));
                                soundId = 2915;
                                break;
                            case 9245:
                                damage = getRandomMaxHit(player, weaponId, attackStyle, true, false, 1.15, true);
                                target.setNextGraphics(new Graphics(753));
                                player.heal((int) (player.getMaxHitPoints() * 0.25));
                                soundId = 2917;
                                break;
                            default:
                                damage = getRandomMaxHit(player, weaponId, attackStyle, true);
                        }
                    } else damage = getRandomMaxHit(player, weaponId, attackStyle, true);
                    delayHit(2, weaponId, attackStyle, getRangeHit(player, damage));
                    if (weaponId != 4740) dropAmmo(player);
                    else player.getEquipment().removeAmmo(ammoId, 1);
                } else if (weaponId == 15241) {// hand cannon
                    if (Utils.getRandom(player.getSkills().getLevel(Skills.FIREMAKING)) == 0) {
                        // explode
                        player.setNextGraphics(new Graphics(2140));
                        player.getEquipment().getItems().set(3, null);
                        player.getEquipment().refresh(3);
                        player.getAppearance().generateAppearanceData();
                        player.applyHit(new Hit(player, Utils.getRandom(150) + 10, HitLook.REGULAR_DAMAGE));
                        player.setNextAnimation(new Animation(12175));
                        return combatDelay;
                    } else {
                        player.setNextGraphics(new Graphics(2138));
                        World.sendProjectile(player, target, 2143, 18, 18, 60, 30, 0, 0);
                        delayHit(1, weaponId, attackStyle, getRangeHit(player, getRandomMaxHit(player, weaponId,
                                attackStyle, true)));
                        dropAmmo(player, -2);
                    }
                } else if (weaponName.contains("crystal bow")) {
                    player.setNextAnimation(new Animation(getWeaponAttackEmote(weaponId, attackStyle)));
                    player.setNextGraphics(new Graphics(250));
                    World.sendProjectile(player, target, 249, 41, 41, 41, 35, 0, 0);
                    delayHit(2, weaponId, attackStyle, getRangeHit(player, getRandomMaxHit(player, weaponId,
                            attackStyle, true)));
                } else if (weaponName.contains("chinchompa")) {
                    player.getEquipment().removeAmmo(weaponId, -1);
                    World.sendProjectile(player, target, weaponId == 10034 ? 909 : 908, 41, 16, 31, 35, 16, 0);
                    attackTargets(getMultiAttackTargets(player), new MultiAttack() {
                        private boolean nextTarget;

                        @Override
                        public boolean attack() {
                            int damage = getRandomMaxHit(player, weaponId, attackStyle, true, true,
                                    weaponId == 10034 ? 1.2 : 1.0, true);
                            player.setNextAnimation(new Animation(2779));

                            delayHit(1, weaponId, attackStyle, getRangeHit(player, damage));
                            WorldTasksManager.schedule(new WorldTask() {
                                @Override
                                public void run() {
                                    target.setNextGraphics(new Graphics(2739, 0, 96 << 16));
                                }
                            }, 2);
                            if (!nextTarget) {
                                if (damage == -1) return false;
                                nextTarget = true;
                            }
                            return true;

                        }
                    });
                } else { // bow/default
                    final int ammoId = player.getEquipment().getAmmoId();
                    player.setNextGraphics(new Graphics(getArrowThrowGfxId(weaponId, ammoId), 0, 100));
                    World.sendProjectile(player, target, getArrowProjectileGfxId(weaponId, ammoId), 41, 16, 20, 35,
                            16, 0);
                    delayHit(2, weaponId, attackStyle, getRangeHit(player, getRandomMaxHit(player, weaponId,
                            attackStyle, true)));
                    if (weaponId == 11235 || weaponId == 15701 || weaponId == 15702 || weaponId == 15703
                        || weaponId == 15704) { // dbows
                        World.sendProjectile(player, target, getArrowProjectileGfxId(weaponId, ammoId), 41, 35, 26,
                                35, 21, 0);

                        delayHit(3, weaponId, attackStyle, getRangeHit(player, getRandomMaxHit(player, weaponId,
                                attackStyle, true)));
                        dropAmmo(player, 2);
                    } else {
                        if (!weaponName.endsWith("bow full") && !weaponName.equals("zaryte bow")) dropAmmo(player);
                    }
                }
                player.setNextAnimation(new Animation(getWeaponAttackEmote(weaponId, attackStyle)));
            }
        }
        playSound(soundId, player, target);
        return combatDelay;
    }

    private Entity[] getMultiAttackTargets(Player player, int maxDistance, int maxAmtTargets) {
        List<Entity> possibleTargets = new ArrayList<Entity>();
        possibleTargets.add(target);
        if (target.isAtMultiArea()) {
            y:
            for (int regionId : target.getMapRegionsIds()) {
                Region region = World.getRegion(regionId);
                if (target instanceof Player) {
                    List<Integer> playerIndexes = region.getPlayerIndexes();
                    if (playerIndexes == null) continue;
                    for (int playerIndex : playerIndexes) {
                        Player p2 = World.getPlayers().get(playerIndex);
                        if (p2 == null || p2 == player || p2 == target || p2.isDead() || !p2.hasStarted()
                            || p2.hasFinished() || !p2.isCanPvp() || !p2.isAtMultiArea()
                            || !p2.withinDistance(target, maxDistance) || !player.getControllerManager().canHit(p2))
                            continue;
                        possibleTargets.add(p2);
                        if (possibleTargets.size() == maxAmtTargets) break y;
                    }
                } else {
                    List<Integer> npcIndexes = region.getNPCsIndexes();
                    if (npcIndexes == null) continue;
                    for (int npcIndex : npcIndexes) {
                        Npc n = World.getNPCs().get(npcIndex);
                        if (n == null || n == target || n == player.getFollower() || n.isDead() || n.hasFinished()
                            || !n.isAtMultiArea() || !n.withinDistance(target, maxDistance)
                            || !n.getDefinitions().hasAttackOption() || !player.getControllerManager().canHit(n))
                            continue;
                        possibleTargets.add(n);
                        if (possibleTargets.size() == maxAmtTargets) break y;
                    }
                }
            }
        }
        return possibleTargets.toArray(new Entity[possibleTargets.size()]);
    }

    Entity[] getMultiAttackTargets(Player player) {
        return getMultiAttackTargets(player, 1, 9);
    }

    public interface MultiAttack {
        boolean attack();
    }

    void attackTargets(Entity[] targets, MultiAttack perform) {
        Entity realTarget = target;
        for (Entity t : targets) {
            target = t;
            if (!perform.attack()) break;
        }
        target = realTarget;
    }

    void dropAmmo(Player player, int quantity) {
        if (quantity == -2) {
            final int ammoId = player.getEquipment().getAmmoId();
            player.getEquipment().removeAmmo(ammoId, 1);
        } else if (quantity == -1) {
            final int weaponId = player.getEquipment().getWeaponId();
            if (weaponId != -1) {
                if (Utils.getRandom(3) > 0) {
                    int capeId = player.getEquipment().getCapeId();
                    if (capeId != -1 && ItemDefinitions.getItemDefinitions(capeId).getName().contains("Ava's"))
                        return; // nothing happens
                } else {
                    player.getEquipment().removeAmmo(weaponId, quantity);
                    return;
                }
                player.getEquipment().removeAmmo(weaponId, quantity);
                World.updateGroundItem(new Item(weaponId, quantity), new WorldTile(target.getCoordFaceX(target
                        .getSize()), target.getCoordFaceY(target.getSize()), target.getPlane()), player);
            }
        } else {
            final int ammoId = player.getEquipment().getAmmoId();
            if (Utils.getRandom(3) > 0) {
                int capeId = player.getEquipment().getCapeId();
                if (capeId != -1 && ItemDefinitions.getItemDefinitions(capeId).getName().contains("Ava's"))
                    return; // nothing happens
            } else {
                player.getEquipment().removeAmmo(ammoId, quantity);
                return;
            }
            if (ammoId != -1) {
                player.getEquipment().removeAmmo(ammoId, quantity);
                World.updateGroundItem(new Item(ammoId, quantity), new WorldTile(target.getCoordFaceX(target.getSize
                        ()), target.getCoordFaceY(target.getSize()), target.getPlane()), player);
            }
        }
    }

    private void dropAmmo(Player player) {
        dropAmmo(player, 1);
    }

    int getArrowThrowGfxId(int weaponId, int arrowId) {
        if (arrowId == 884) {
            return 18;
        } else if (arrowId == 886) {
            return 20;
        } else if (arrowId == 888) {
            return 21;
        } else if (arrowId == 890) {
            return 22;
        } else if (arrowId == 892) return 24;
        return 19; // bronze default
    }

    private int getArrowProjectileGfxId(int weaponId, int arrowId) {
        if (arrowId == 884) {
            return 11;
        } else if (arrowId == 886) {
            return 12;
        } else if (arrowId == 888) {
            return 13;
        } else if (arrowId == 890) {
            return 14;
        } else if (arrowId == 892) return 15;
        else if (arrowId == 11212) return 1120;
        else if (weaponId == 20171) return 1066;
        else if (arrowId == 24336) return 3023;
        return 10;// bronze default
    }

    private int getKnifeThrowGfxId(int weaponId) {
        if (weaponId == 868) {
            return 225;
        } else if (weaponId == 867) {
            return 224;
        } else if (weaponId == 866) {
            return 223;
        } else if (weaponId == 865) {
            return 221;
        } else if (weaponId == 864) {
            return 219;
        } else if (weaponId == 863) {
            return 220;
        }
        // darts
        if (weaponId == 806) {
            return 232;
        } else if (weaponId == 807) {
            return 233;
        } else if (weaponId == 808) {
            return 234;
        } else if (weaponId == 3093) {
            return 273;
        } else if (weaponId == 809) {
            return 235;
        } else if (weaponId == 810) {
            return 236;
        } else if (weaponId == 811) {
            return 237;
        } else if (weaponId == 11230) {
            return 1123;
        }
        // javelins
        if (weaponId >= 13954 && weaponId <= 13956 || weaponId >= 13879 && weaponId <= 13882) return 1837;
        // thrownaxe
        if (weaponId == 13883 || weaponId == 13957) return 1839;
        if (weaponId == 800) return 43;
        else if (weaponId == 13954 || weaponId == 13955 || weaponId == 13956 || weaponId == 13879 || weaponId == 13880
                 || weaponId == 13881 || weaponId == 13882) return 1837;
        return 219;
    }

    private int meleeAttack(final Player player) {
        int weaponId = player.getEquipment().getWeaponId();
        int attackStyle = player.getCombatDefinitions().getAttackStyle();
        int combatDelay = getMeleeCombatDelay(weaponId);
        int soundId = getSoundId(weaponId, attackStyle);
        if (player.getCombatDefinitions().isUsingSpecialAttack()) {
            player.getCombatDefinitions().switchUsingSpecialAttack();
            int result = SpecialAttack.processSpecial(player, this);
            if (result > 0) return result;
            return combatDelay;

        } else {
            veracsEffect = CombatUtils.hasFullVeracs(player) && Utils.random(3) == 0;
            Hit hit = getMeleeHit(player, getRandomMaxHit(player, weaponId, attackStyle, false));
            hit.setIgnoreDamageModifier(veracsEffect);
            delayNormalHit(weaponId, attackStyle, hit);
            player.setNextAnimation(new Animation(getWeaponAttackEmote(weaponId, attackStyle)));
        }
        playSound(soundId, player, target);
        return combatDelay;
    }

    static void playSound(int soundId, Entity... listeners) {
        if (soundId <= 0) return;
        Player player;
        for (Entity entity : listeners) {
            if (entity instanceof Player) {
                player = (Player) entity;
                player.getPackets().sendSound(soundId, 0, 1);
            }
        }
    }

    public int getRandomMaxHit(Player player, int weaponId, int attackStyle, boolean ranging) {
        return getRandomMaxHit(player, weaponId, attackStyle, ranging, true, 1.0D, false);
    }

    public int getRandomMaxHit(Player player, int weaponId, int attackStyle, boolean ranging, boolean defenceAffects,
                               double specMultiplier, boolean usingSpec) {
        max_hit = getMaxHit(player, weaponId, attackStyle, ranging, usingSpec, specMultiplier);
        if (defenceAffects && !veracsEffect) {
            double att = player.getSkills().getLevel(ranging ? 4 : 0)
                         + player.getCombatDefinitions().getBonuses()[ranging ? 4 : CombatDefinitions
                    .getMeleeBonusStyle(weaponId, attackStyle)];
            att *= ranging ? CombatUtils.getCombatModifier(player, Skills.RANGE) : CombatUtils.getCombatModifier
                    (player, Skills.ATTACK);
            if (CombatUtils.hasFullVoid(player, ranging ? (new int[]{11664, 11675}) : (new int[]{11665, 11676})))
                att *= 1.1;
            if (ranging) att *= player.getAuraManager().getRangeAccuracyMultiplier();
            double def;
            if (target instanceof Player) {
                Player p2 = (Player) target;
                def = (double) p2.getSkills().getLevel(Skills.DEFENCE) + (2
                                                                          * p2.getCombatDefinitions().getBonuses()
                                                                                  [ranging ? 9 : CombatDefinitions
                        .getMeleeDefenceBonus(CombatDefinitions.getMeleeBonusStyle(weaponId, attackStyle))]);
                def *= CombatUtils.getCombatModifier(p2, Skills.DEFENCE);
                if (!ranging) {
                    //if (p2.getFollower() instanceof SteelTitan) def *= 1.15;
                }
            } else {
                Npc n = (Npc) target;
                def = n.getBonuses()
                      != null ? n.getBonuses()[ranging ? 9 : CombatDefinitions.getMeleeDefenceBonus(CombatDefinitions
                        .getMeleeBonusStyle(weaponId, attackStyle))] : 0;
            }
            if (usingSpec) {
                att *= specMultiplier;
            }
            double prob = att / def;
            if (prob > 0.90) // max, 90% prob hit so even lvl 138 can miss at
                // lvl 3
                prob = 0.90;
            else if (prob < 0.05) // minimum 5% so even lvl 3 can hit lvl 138
                prob = 0.05;
            if (prob < Math.random()) return 0;
        }
        int hit = Utils.getRandom(max_hit);
        if (target instanceof Npc) {
            Npc n = (Npc) target;
            if (n.getId() == 9463 && hasFireCape(player)) hit += 40;
        }
        if (player.getAuraManager().usingEquilibrium()) {
            int perc25MaxHit = (int) (max_hit * 0.25);
            hit -= perc25MaxHit;
            max_hit -= perc25MaxHit;
            if (hit < 0) hit = 0;
            if (hit < perc25MaxHit) hit += perc25MaxHit;

        }
        return hit;
    }

    private boolean hasFireCape(Player player) {
        int capeId = player.getEquipment().getCapeId();
        return capeId == 6570 || capeId == 20769 || capeId == 20771;
    }

    public static int getMaxHit(Player player, int weaponId, int attackStyle, boolean ranging, boolean usingSpec,
                                double specMultiplier) {
        if (!ranging) {
            int strengthLvl = player.getSkills().getLevel(Skills.STRENGTH);
            double xpStyle = CombatDefinitions.getXpStyle(weaponId, attackStyle);
            double styleBonus = xpStyle == Skills.STRENGTH ? 3 : xpStyle == CombatDefinitions.SHARED ? 1 : 0;
            double otherBonus = 1;
            if (CombatUtils.hasFullDharoks(player)) {
                double hp = player.getHealth();
                double maxHp = player.getMaxHitPoints();
                double d = hp / maxHp;
                otherBonus = 2 - d;
            }
            double effectiveStrength =
                    8 + strengthLvl * CombatUtils.getCombatModifier(player, Skills.STRENGTH) + styleBonus;
            if (CombatUtils.hasFullVoid(player, 11665, 11676)) effectiveStrength *= 1.1;
            double strengthBonus = player.getCombatDefinitions().getBonuses()[STRENGTH_BONUS.getId()];
            double baseDamage = 5 + effectiveStrength * (1 + (strengthBonus / 64));
            return (int) (baseDamage * specMultiplier * otherBonus);
        } else {
            double rangedLvl = player.getSkills().getLevel(Skills.RANGE);
            double styleBonus = attackStyle == 0 ? 3 : attackStyle == 1 ? 0 : 1;
            double otherBonus = 1;
            double effectiveStrength =
                    (rangedLvl * CombatUtils.getCombatModifier(player, Skills.RANGE) * otherBonus) + styleBonus;
            if (CombatUtils.hasFullVoid(player, 11664, 11675))
                effectiveStrength += (player.getSkills().getLevelForXp(Skills.RANGE) / 5) + 1.6;
            double strengthBonus = player.getCombatDefinitions().getBonuses()[RANGED_STR_BONUS.getId()];
            double baseDamage = 5 + (((effectiveStrength + 8) * (strengthBonus + 64)) / 64);
            return (int) (baseDamage * specMultiplier);
        }
    }

    private void delayNormalHit(int weaponId, int attackStyle, Hit... hits) {
        delayHit(0, weaponId, attackStyle, hits);
    }

    public Hit getMeleeHit(Player player, int damage) {
        return new Hit(player, damage, HitLook.MELEE_DAMAGE);
    }

    public Hit getRangeHit(Player player, int damage) {
        return new Hit(player, damage, HitLook.RANGE_DAMAGE);
    }

    public Hit getMagicHit(Player player, int damage) {
        return new Hit(player, damage, HitLook.MAGIC_DAMAGE);
    }

    void delayMagicHit(int delay, final Hit... hits) {
        delayHit(delay, -1, -1, hits);
    }

    public void delayHit(int delay, final int weaponId, final int attackStyle, final Hit... hits) {
        addAttackedByDelay(hits[0].getSource());
        final Entity target = this.target;
        for (Hit hit : hits) {
            Player player = (Player) hit.getSource();
            int damage = hit.getDamage() > target.getHealth() ? target.getHealth() : hit.getDamage();
            if (hit.getLook() == HitLook.RANGE_DAMAGE || hit.getLook() == HitLook.MELEE_DAMAGE) {
                double combatXp = damage / 2.5;
                if (combatXp > 0) {
                    player.getAuraManager().checkSuccefulHits(hit.getDamage());
                    if (hit.getLook() == HitLook.RANGE_DAMAGE) {
                        if (attackStyle == 2) {
                            player.getSkills().addXp(Skills.RANGE, combatXp / 2);
                            player.getSkills().addXp(Skills.DEFENCE, combatXp / 2);
                        } else player.getSkills().addXp(Skills.RANGE, combatXp);

                    } else {
                        int xpStyle = CombatDefinitions.getXpStyle(weaponId, attackStyle);
                        if (xpStyle != CombatDefinitions.SHARED) player.getSkills().addXp(xpStyle, combatXp);
                        else {
                            player.getSkills().addXp(Skills.ATTACK, combatXp / 3);
                            player.getSkills().addXp(Skills.STRENGTH, combatXp / 3);
                            player.getSkills().addXp(Skills.DEFENCE, combatXp / 3);
                        }
                    }
                    double hpXp = damage / 7.5;
                    if (hpXp > 0) player.getSkills().addXp(Skills.HITPOINTS, hpXp);
                }
            } else if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
                if (magicHitGfx != null && damage > 0) {
                    if (freeze_time > 0) {
                        target.addFreezeDelay(freeze_time, freeze_time == 0);
                        if (freeze_time > 0) target.addFrozenBlockedDelay(freeze_time + (4 * 1000));// four seconds :p
                    }
                }
                double combatXp = baseMagicXp * 1 + (damage / 5);

                if (combatXp > 0) {
                    player.getAuraManager().checkSuccefulHits(hit.getDamage());
                    if (player.getCombatDefinitions().isDefensiveCasting()) {
                        int defenceXp = (int) (damage / 7.5);
                        if (defenceXp > 0) {
                            combatXp -= defenceXp;
                            player.getSkills().addXp(Skills.DEFENCE, defenceXp / 7.5);
                        }
                    }
                    player.getSkills().addXp(Skills.MAGIC, combatXp);
                    double hpXp = damage / 7.5;
                    if (hpXp > 0) player.getSkills().addXp(Skills.HITPOINTS, hpXp);
                }
            }
        }

        WorldTasksManager.schedule(new WorldTask() {

            @Override
            public void run() {
                for (Hit hit : hits) {
                    Player player = (Player) hit.getSource();
                    if (player.isDead() || player.hasFinished() || target.isDead() || target.hasFinished()) return;
                    target.applyHit(hit); // also reduces damage if needed, pray
                    // and special items affect here
                    doDefenceEmote();
                    int damage = hit.getDamage() > target.getHealth() ? target.getHealth() : hit.getDamage();
                    if ((damage >= max_hit * 0.90) && (hit.getLook() == HitLook.MAGIC_DAMAGE
                                                       || hit.getLook() == HitLook.RANGE_DAMAGE
                                                       || hit.getLook() == HitLook.MELEE_DAMAGE)) hit.setCriticalMark();
                    if (hit.getLook() == HitLook.RANGE_DAMAGE || hit.getLook() == HitLook.MELEE_DAMAGE) {
                        double combatXp = damage / 2.5;
                        if (combatXp > 0) {
                            if (hit.getLook() == HitLook.RANGE_DAMAGE) {
                                if (weaponId != -1) {
                                    String name = ItemDefinitions.getItemDefinitions(weaponId).getName();
                                    if (name.contains("(p++)")) {
                                        if (Utils.getRandom(8) == 0) target.getPoison().makePoisoned(48);
                                    } else if (name.contains("(p+)")) {
                                        if (Utils.getRandom(8) == 0) target.getPoison().makePoisoned(38);
                                    } else if (name.contains("(p)")) {
                                        if (Utils.getRandom(8) == 0) target.getPoison().makePoisoned(28);
                                    }
                                }
                            } else {
                                if (weaponId != -1) {
                                    String name = ItemDefinitions.getItemDefinitions(weaponId).getName();
                                    if (name.contains("(p++)")) {
                                        if (Utils.getRandom(8) == 0) target.getPoison().makePoisoned(68);
                                    } else if (name.contains("(p+)")) {
                                        if (Utils.getRandom(8) == 0) target.getPoison().makePoisoned(58);
                                    } else if (name.contains("(p)")) {
                                        if (Utils.getRandom(8) == 0) target.getPoison().makePoisoned(48);
                                    }
                                    if (target instanceof Player) {
                                        if (((Player) target).getSolDelay() >= TimeUtils.getTime())
                                            target.setNextGraphics(new Graphics(2320));
                                    }
                                }
                            }
                        }
                    } else if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
                        if (lastSpell != null) {
                            lastSpell.processPostHitEffects(player, PlayerCombat.this, damage);
                        }
                        if (hit.getDamage() == 0) {
                            target.setNextGraphics(new Graphics(85, 0, 100));
                            playSound(227, player, target);
                        } else {
                            if (magicHitGfx != null) {
                                target.setNextGraphics(magicHitGfx);
                                if (block_tele) {
                                    if (target instanceof Player) {
                                        Player targetPlayer = (Player) target;
                                        targetPlayer.setTeleBlockDelay((targetPlayer.getPrayer().usingPrayer(Prayer
                                                .PrayerSpell.PROTECT_MAGIC, Prayer.PrayerSpell.DEFLECT_MAGIC) ?
                                                                                100000 : 300000));
                                        targetPlayer.getPackets().sendGameMessage("You have been teleblocked.", true);
                                    }
                                }
                            }
                            if (magic_sound > 0) playSound(magic_sound, player, target);
                        }
                        magicHitGfx = null;
                        freeze_time = 0;
                        magic_sound = 0;
                        block_tele = false;
                    }
                    if (max_poison_hit > 0 && Utils.getRandom(10) == 0) {
                        if (!target.getPoison().isPoisoned()) target.getPoison().makePoisoned(max_poison_hit);
                        max_poison_hit = 0;
                    }
                    if (target instanceof Player) {
                        Player p2 = (Player) target;
                        p2.closeInterfaces();
                        if (p2.getCombatDefinitions().isAutoRetaliate() && !p2.getActionManager().hasSkillWorking()
                            && !p2.hasWalkSteps()) {
                            p2.getActionManager().setAction(new PlayerCombat(player));
                        }
                    } else {
                        Npc n = (Npc) target;
                        if (!n.isUnderCombat() || n.canBeAttackedByAutoRelatie()) n.setTarget(player);
                    }

                }
            }
        }, delay);
    }

    private int getSoundId(int weaponId, int attackStyle) {
        if (weaponId != -1) {
            String weaponName = ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();
            if (weaponName.contains("dart") || weaponName.contains("knife")) return 2707;
        }
        return -1;
    }

    public static int getWeaponAttackEmote(int weaponId, int attackStyle) {
        if (weaponId != -1) {
            String weaponName = ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();
            if (!weaponName.equals("null")) {
                if (weaponName.contains("crossbow") || weaponName.contains("c'bow"))
                    return weaponName.contains("karil's crossbow") ? 2075 : 4230;
                if (weaponName.contains("bow")) return 426;
                if (weaponName.contains("staff of light")) {
                    switch (attackStyle) {
                        case 0:
                            return 15072;
                        case 1:
                            return 15071;
                        case 2:
                            return 414;
                    }
                }
                if (weaponName.contains("chinchompa")) return 2779;
                if (weaponName.contains("staff") || weaponName.contains("wand")) return 419;
                if (weaponName.contains("dart")) return 6600;
                if (weaponName.contains("knife")) return 9055;
                if (weaponName.contains("scimitar") || weaponName.contains("korasi")) {
                    switch (attackStyle) {
                        case 2:
                            return 15072;
                        default:
                            return 15071;
                    }
                }
                if (weaponName.contains("granite mace")) return 400;
                if (weaponName.contains("mace")) {
                    switch (attackStyle) {
                        case 2:
                            return 400;
                        default:
                            return 401;
                    }
                }
                if (weaponName.contains("hatchet")) {
                    switch (attackStyle) {
                        case 2:
                            return 401;
                        default:
                            return 395;
                    }
                }
                if (weaponName.contains("warhammer")) {
                    switch (attackStyle) {
                        default:
                            return 401;
                    }
                }
                if (weaponName.contains("claws")) {
                    switch (attackStyle) {
                        case 2:
                            return 1067;
                        default:
                            return 393;
                    }
                }
                if (weaponName.contains("whip")) {
                    switch (attackStyle) {
                        case 1:
                            return 11969;
                        case 2:
                            return 11970;
                        default:
                            return 11968;
                    }
                }
                if (weaponName.contains("anchor")) {
                    switch (attackStyle) {
                        default:
                            return 5865;
                    }
                }
                if (weaponName.contains("tzhaar-ket-em")) {
                    switch (attackStyle) {
                        default:
                            return 401;
                    }
                }
                if (weaponName.contains("tzhaar-ket-om")) {
                    switch (attackStyle) {
                        default:
                            return 13691;
                    }
                }
                if (weaponName.contains("halberd")) {
                    switch (attackStyle) {
                        case 1:
                            return 440;
                        default:
                            return 428;
                    }
                }
                if (weaponName.contains("zamorakian spear")) {
                    switch (attackStyle) {
                        case 1:
                            return 12005;
                        case 2:
                            return 12009;
                        default:
                            return 12006;
                    }
                }
                if (weaponName.contains("spear")) {
                    switch (attackStyle) {
                        case 1:
                            return 440;
                        case 2:
                            return 429;
                        default:
                            return 428;
                    }
                }
                if (weaponName.contains("flail")) {
                    return 2062;
                }
                if (weaponName.contains("javelin")) {
                    return 10501;
                }
                if (weaponName.contains("morrigan's throwing axe")) return 10504;
                if (weaponName.contains("pickaxe")) {
                    switch (attackStyle) {
                        case 2:
                            return 400;
                        default:
                            return 401;
                    }
                }
                if (weaponName.contains("dagger")) {
                    switch (attackStyle) {
                        case 2:
                            return 377;
                        default:
                            return 376;
                    }
                }
                if (weaponName.contains("longsword") || weaponName.contains("light") || weaponName.contains("excalibur")
                    || weaponName.contains("reese")) {
                    switch (attackStyle) {
                        case 2:
                            return 12310;
                        default:
                            return 12311;
                    }
                }
                if (weaponName.contains("rapier") || weaponName.contains("brackish")) {
                    switch (attackStyle) {
                        case 2:
                            return 13048;
                        default:
                            return 13049;
                    }
                }

                if (weaponName.contains("godsword")) {
                    switch (attackStyle) {
                        case 2:
                            return 11980;
                        case 3:
                            return 11981;
                        default:
                            return 11979;
                    }
                }

                if (weaponName.contains("ags")) {
                    switch (attackStyle) {
                        case 2:
                            return 11980;
                        case 3:
                            return 11981;
                        default:
                            return 11979;
                    }
                }

                if (weaponName.contains("primal 2h sword")) {
                    switch (attackStyle) {
                        case 2:
                            return 11980;
                        case 3:
                            return 11981;
                        default:
                            return 11979;
                    }
                }
                if (weaponName.contains("greataxe")) {
                    switch (attackStyle) {
                        case 2:
                            return 12003;
                        default:
                            return 12002;
                    }
                }
                if (weaponName.contains("granite maul")) {
                    switch (attackStyle) {
                        default:
                            return 1665;
                    }
                }
                if (weaponName.contains("2h sword") || weaponName.equals("saradomin sword")) {
                    switch (attackStyle) {
                        case 2:
                            return 7048;
                        case 3:
                            return 7049;
                        default:
                            return 7041;
                    }
                }

            }
        }
        switch (weaponId) {
            case 16405:// novite maul
            case 16407:// Bathus maul
            case 16409:// Maramaros maul
            case 16411:// Kratonite maul
            case 16413:// Fractite maul
            case 18353:// chaotic maul
            case 16415:// Zephyrium maul
            case 16417:// Argonite maul
            case 16419:// Katagon maul
            case 16421:// Gorgonite maul
            case 16423:// Promethium maul
            case 16425:// primal maul
                return 2661; // maul
            case 13883: // morrigan thrown axe
                return 10504;
            case 15241:
                return 12174;
            default:
                switch (attackStyle) {
                    case 1:
                        return 423;
                    default:
                        return 422;
                }
        }
    }

    private void doDefenceEmote() {
        target.setNextAnimationNoPriority(new Animation(CombatUtils.getDefenceEmote(target)));
    }

    private int getMeleeCombatDelay(int weaponId) {
        if (weaponId != -1) {
            String weaponName = ItemDefinitions.getItemDefinitions(weaponId).getName().toLowerCase();

            // Interval 2.4
            if (weaponName.contains("zamorakian spear")) return 3;
            // Interval 3.0
            if (weaponName.contains("spear") || weaponName.contains("longsword") || weaponName.contains("light")
                || weaponName.contains("hatchet") || weaponName.contains("pickaxe") || weaponName.contains("mace")
                || weaponName.contains("hasta") || weaponName.contains("warspear") || weaponName.contains("flail")
                || weaponName.contains("hammers")) return 4;
            // Interval 3.6
            if (weaponName.contains("godsword") || weaponName.contains("warhammer") || weaponName.contains("battleaxe")
                || weaponName.contains("maul")) return 5;
            // Interval 4.2
            if (weaponName.contains("greataxe") || weaponName.contains("halberd") || weaponName.contains("2h sword")
                || weaponName.contains("two handed sword") || weaponName.contains("primal 1h sword")) return 6;
        }
        switch (weaponId) {
            case 6527:// tzhaar-ket-em
                return 4;
            case 10887:// barrelchest anchor
                return 5;
            case 15403:// balmung
            case 6528:// tzhaar-ket-om
                return 6;
            default:
                return 3;
        }
    }

    @Override
    public void stop(Player player) {
        player.setNextFaceEntity(null);
    }

    private boolean checkAll(Player player) {
        if (player.isDead() || player.hasFinished() || target.isDead() || target.hasFinished()) return false;
        int distanceX = player.getX() - target.getX();
        int distanceY = player.getY() - target.getY();
        int size = target.getSize();
        int maxDistance = 16;
        if (player.getPlane() != target.getPlane() || distanceX > size + maxDistance || distanceX < -1 - maxDistance
            || distanceY > size + maxDistance || distanceY < -1 - maxDistance) return false;
        if (player.getFreezeDelay() >= TimeUtils.getTime()) return !player.withinDistance(target, 0);

        if (target instanceof Npc) {
            Npc n = (Npc) target;
            if (n.isCantInteract()) return false;
            if (!RequirementsManager.hasRequirement(player, Skills.SLAYER, SlayerTask.getSlayerRequirement(n),
                    "harm " + "this " + "monster")) return false;
            if (n instanceof Follower) {
                Follower follower = (Follower) n;
                if (!follower.canAttack(target)) return false;
            } else {
                if (!n.canBeAttackFromOutOfArea() && !MapAreas.isAtArea(n.getMapAreaNameHash(), player)) return false;
                if (n.getId() == 6222 || n.getId() == 6223 || n.getId() == 6225 || n.getId() == 6227) {
                    if (isRanging(player) == 0) {
                        player.getPackets().sendGameMessage("I can't reach that!");
                        return false;
                    }
                }
            }
        }
        if (!(target instanceof Npc && ((Npc) target).isForceMultiAttacked())) {

            if (!target.isAtMultiArea() || !player.isAtMultiArea()) {
                if (player.getAttackedBy() != target && player.getAttackedByDelay() > TimeUtils.getTime()) return false;
                if (target.getAttackedBy() != player && target.getAttackedByDelay() > TimeUtils.getTime()) return false;
            }
        }
        int isRanging = isRanging(player);
        if (player.getX() == target.getX() && player.getY() == target.getY() && target.getSize() == 1
            && !target.hasWalkSteps()) {
            if (!player.addWalkSteps(target.getX() + 1, target.getY(), 1))
                if (!player.addWalkSteps(target.getX() - 1, target.getY(), 1))
                    if (!player.addWalkSteps(target.getX(), target.getY() + 1, 1))
                        if (!player.addWalkSteps(target.getX(), target.getY() - 1, 1)) return false;
        } else if (isRanging == 0 && target.getSize() == 1 && player.getCombatDefinitions().getSpellId() <= 0
                   && Math.abs(player.getX() - target.getX()) == 1 && Math.abs(player.getY() - target.getY()) == 1
                   && !target.hasWalkSteps()) {
            if (!player.addWalkSteps(target.getX(), player.getY(), 1))
                player.addWalkSteps(player.getX(), target.getY(), 1);
            return true;
        }
        maxDistance = isRanging != 0 || player.getCombatDefinitions().getSpellId() > 0 ? 7 : 0;
        if ((!player.clippedProjectile(target, !(target instanceof NexMinion) && maxDistance == 0))
            || distanceX > size + maxDistance || distanceX < -1 - maxDistance || distanceY > size + maxDistance
            || distanceY < -1 - maxDistance) {
            if (!player.hasWalkSteps()) {
                player.resetWalkSteps();
                player.addWalkStepsInteract(target.getX(), target.getY(), player.getRun() ? 2 : 1, size, true);
            }
            return true;
        } else {
            player.resetWalkSteps();
        }
        if (player.getSolDelay() >= TimeUtils.getTime() && !(player.getEquipment().getWeaponId() == 15486
                                                             || player.getEquipment().getWeaponId() == 22207
                                                             || player.getEquipment().getWeaponId() == 22209
                                                             || player.getEquipment().getWeaponId() == 22211
                                                             || player.getEquipment().getWeaponId() == 22213))
            player.setSolDelay(0);
        return true;
    }

    /*
     * 0 not ranging, 1 invalid ammo so stops att, 2 can range, 3 no ammo
	 */
    public static int isRanging(Player player) {
        int weaponId = player.getEquipment().getWeaponId();
        if (weaponId == -1) return 0;
        String name = ItemDefinitions.getItemDefinitions(weaponId).getName();
        if (name != null) { // those don't need arrows
            if (name.contains("knife") || name.contains("dart") || name.contains("javelin")
                || name.contains("thrownaxe") || name.contains("throwing axe") || name.contains("Crystal bow")
                || name.contains("Zaryte bow") || name.contains("chinchompa") || name.contains("Polypore staff")
                || name.equalsIgnoreCase("Training bow")) return 2;
        }
        int ammoId = player.getEquipment().getAmmoId();
        switch (weaponId) {
            case 15241: // Hand cannon
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 15243: // bronze arrow
                        return 2;
                    default:
                        return 1;
                }
            case 839: // longbow
            case 841: // shortbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 882: // bronze arrow
                    case 884: // iron arrow
                        return 2;
                    default:
                        return 1;
                }
            case 843: // oak longbow
            case 845: // oak shortbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 882: // bronze arrow
                    case 884: // iron arrow
                    case 886: // steel arrow
                        return 2;
                    default:
                        return 1;
                }
            case 847: // willow longbow
            case 849: // willow shortbow
            case 13541: // Willow composite bow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 882: // bronze arrow
                    case 884: // iron arrow
                    case 886: // steel arrow
                    case 888: // mithril arrow
                        return 2;
                    default:
                        return 1;
                }
            case 851: // maple longbow
            case 853: // maple shortbow
            case 18331: // Maple longbow (sighted)
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 882: // bronze arrow
                    case 884: // iron arrow
                    case 886: // steel arrow
                    case 888: // mithril arrow
                    case 890: // adamant arrow
                        return 2;
                    default:
                        return 1;
                }
            case 2883:// ogre bow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 2866: // ogre arrow
                        return 2;
                    default:
                        return 1;
                }
            case 4827:// Comp ogre bow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 2866: // ogre arrow
                    case 4773: // bronze brutal
                    case 4778: // iron brutal
                    case 4783: // steel brutal
                    case 4788: // black brutal
                    case 4793: // mithril brutal
                    case 4798: // adamant brutal
                    case 4803: // rune brutal
                        return 2;
                    default:
                        return 1;
                }
            case 855: // yew longbow
            case 857: // yew shortbow
            case 10281: // Yew composite bow
            case 14121: // Sacred clay bow
            case 859: // magic longbow
            case 861: // magic shortbow
            case 10284: // Magic composite bow
            case 18332: // Magic longbow (sighted)
            case 6724: // seercull
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 882: // bronze arrow
                    case 884: // iron arrow
                    case 886: // steel arrow
                    case 888: // mithril arrow
                    case 890: // adamant arrow
                    case 892: // rune arrow
                        return 2;
                    default:
                        return 1;
                }
            case 11235: // dark bows
            case 15701:
            case 15702:
            case 15703:
            case 15704:
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 882: // bronze arrow
                    case 884: // iron arrow
                    case 886: // steel arrow
                    case 888: // mithril arrow
                    case 890: // adamant arrow
                    case 892: // rune arrow
                    case 11212: // dragon arrow
                        return 2;
                    default:
                        return 1;
                }
            case 19143: // saradomin bow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 19152: // saradomin arrow
                        return 2;
                    default:
                        return 1;
                }
            case 19146: // guthix bow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 19157: // guthix arrow
                        return 2;
                    default:
                        return 1;
                }
            case 19149: // zamorak bow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 19162: // zamorak arrow
                        return 2;
                    default:
                        return 1;
                }
            case 24575: // Cbow of Love
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 9139: // bolts of love
                        return 2;
                    default:
                        return 1;
                }
            case 4734: // karil crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 4740: // bolt rack
                        return 2;
                    default:
                        return 1;
                }
            case 10156: // hunters crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 10158: // Kebbit bolts
                    case 10159: // Long kebbit bolts
                        return 2;
                    default:
                        return 1;
                }
            case 8880: // Dorgeshuun c'bow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 8882: // bone bolts
                        return 2;
                    default:
                        return 1;
                }
            case 14684: // zanik crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 9141: // steel bolts
                    case 13083: // black bolts
                    case 9142:// mithril bolts
                    case 9143: // adam bolts
                    case 9145: // silver bolts
                    case 8882: // bone bolts
                        return 2;
                    default:
                        return 1;
                }
            case 767: // phoenix crossbow
            case 837: // crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                        return 2;
                    default:
                        return 1;
                }
            case 9174: // bronze crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9236: // Opal bolts (e)
                        return 2;
                    default:
                        return 1;
                }
            case 9176: // blurite crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 9141: // steel bolts
                    case 13083: // black bolts
                    case 9236: // Opal bolts (e)
                    case 9238: // Pearl bolts (e)
                    case 9239: // Topaz bolts (e)
                    case 9139: // Blurite bolts
                    case 9237: // Jade bolts (e)
                        return 2;
                    default:
                        return 1;
                }
            case 9177: // iron crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 9236: // Opal bolts (e)
                    case 9238: // Pearl bolts (e)
                        return 2;
                    default:
                        return 1;
                }
            case 9179: // steel crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 9141: // steel bolts
                    case 9236: // Opal bolts (e)
                    case 9238: // Pearl bolts (e)
                    case 9239: // Topaz bolts (e)
                        return 2;
                    default:
                        return 1;
                }
            case 13081: // black crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 9141: // steel bolts
                    case 13083: // black bolts
                    case 9236: // Opal bolts (e)
                    case 9238: // Pearl bolts (e)
                    case 9239: // Topaz bolts (e)
                        return 2;
                    default:
                        return 1;
                }
            case 9181: // Mith crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 9141: // steel bolts
                    case 13083: // black bolts
                    case 9142:// mithril bolts
                    case 9145: // silver bolts
                    case 9236: // Opal bolts (e)
                    case 9238: // Pearl bolts (e)
                    case 9239: // Topaz bolts (e)
                    case 9240: // Sapphire bolts (e)
                    case 9241: // Emerald bolts (e)
                        return 2;
                    default:
                        return 1;
                }
            case 9183: // adam c bow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 9141: // steel bolts
                    case 13083: // black bolts
                    case 9142:// mithril bolts
                    case 9143: // adam bolts
                    case 9145: // silver bolts wtf
                    case 9236: // Opal bolts (e)
                    case 9238: // Pearl bolts (e)
                    case 9239: // Topaz bolts (e)
                    case 9240: // Sapphire bolts (e)
                    case 9241: // Emerald bolts (e)
                    case 9242: // Ruby bolts (e)
                    case 9243: // Diamond bolts (e)
                        return 2;
                    default:
                        return 1;
                }
            case 9185: // rune c bow
            case 18357: // chaotic crossbow
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 9141: // steel bolts
                    case 13083: // black bolts
                    case 9142:// mithril bolts
                    case 9143: // adam bolts
                    case 9144: // rune bolts
                    case 9145: // silver bolts wtf
                    case 9236: // Opal bolts (e)
                    case 9238: // Pearl bolts (e)
                    case 9239: // Topaz bolts (e)
                    case 9240: // Sapphire bolts (e)
                    case 9241: // Emerald bolts (e)
                    case 9242: // Ruby bolts (e)
                    case 9243: // Diamond bolts (e)
                    case 9244: // Dragon bolts (e)
                    case 9245: // Onyx bolts (e)
                        return 2;
                    default:
                        return 1;
                }
            case 24338:
                switch (ammoId) {
                    case -1:
                        return 3;
                    case 877: // bronze bolts
                    case 9140: // iron bolts
                    case 9141: // steel bolts
                    case 13083: // black bolts
                    case 9142:// mithril bolts
                    case 9143: // adam bolts
                    case 9144: // rune bolts
                    case 9145: // silver bolts wtf
                    case 9236: // Opal bolts (e)
                    case 9238: // Pearl bolts (e)
                    case 9239: // Topaz bolts (e)
                    case 9240: // Sapphire bolts (e)
                    case 9241: // Emerald bolts (e)
                    case 9242: // Ruby bolts (e)
                    case 9243: // Diamond bolts (e)
                    case 9244: // Dragon bolts (e)
                    case 9245: // Onyx bolts (e)
                    case 24336:
                        return 2;
                    default:
                        return 1;
                }
            default:
                return 0;
        }
    }

}

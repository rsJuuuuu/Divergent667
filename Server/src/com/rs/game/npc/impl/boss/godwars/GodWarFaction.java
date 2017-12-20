package com.rs.game.npc.impl.boss.godwars;

import com.rs.game.item.Item;
import com.rs.game.npc.Npc;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.world.Entity;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.ArrayList;
import java.util.List;

import static com.rs.utils.Constants.*;

/**
 * Created by Peng on 5.1.2017 1:40.
 */
public class GodWarFaction extends Npc {

    private int faction;

    public GodWarFaction(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean
            spawned, int faction) {
        super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
        this.faction = faction;
    }

    @Override
    public ArrayList<Entity> getPossibleTargets() {
        ArrayList<Entity> possibleTarget = new ArrayList<>();
        for (int regionId : getMapRegionsIds()) {
            List<Integer> playerIndexes = World.getRegion(regionId).getPlayerIndexes();
            if (playerIndexes != null) {
                playerLoop:
                for (int playerIndex : playerIndexes) {
                    Player player = World.getPlayers().get(playerIndex);
                    if (player == null || player.isDead() || player.hasFinished() || !player.isRunning()
                        || !player.withinDistance(this,
                            getCombatDefinitions().getAttackStyle() == NpcCombatDefinitions.MELEE ? 4 :
                                    getCombatDefinitions().getAttackStyle() == NpcCombatDefinitions.SPECIAL ? 16 : 8)
                        || ((!isAtMultiArea() || !player.isAtMultiArea()) && player.getAttackedBy() != this
                            && player.getAttackedByDelay() > TimeUtils.getTime()) || !clippedProjectile(player, false))
                        continue;
                    for (Item item : player.getEquipment().getItems().getItems()) {
                        if (item == null) continue;
                        for (String itemName : ZAROS_FACTION_ITEMS)
                            if (item.getName().contains(itemName)) continue playerLoop;
                        switch (faction) {
                            case ARMADYL_FACTION:
                                for (String itemName : ARMADYL_FACTION_ITEMS)
                                    if (item.getName().contains(itemName)) continue playerLoop;
                                break;
                            case BANDOS_FACTION:
                                for (String itemName : BANDOS_FACTION_ITEMS)
                                    if (item.getName().contains(itemName)) continue playerLoop;
                                break;
                            case SARADOMIN_FACTION:
                                for (String itemName : SARADOMIN_FACTION_ITEMS)
                                    if (item.getName().contains(itemName)) continue playerLoop;
                                break;
                            case ZAMORAK_FACTION:
                                for (String itemName : ZAMORAK_FACTION_ITEMS)
                                    if (item.getName().contains(itemName)) continue playerLoop;
                                break;
                        }

                    }
                    possibleTarget.add(player);
                }
            }
            List<Integer> npcIndexes = World.getRegion(regionId).getNPCsIndexes();
            if (npcIndexes != null) {
                for (int npcIndex : npcIndexes) {
                    Npc npc = World.getNPCs().get(npcIndex);
                    if (npc == null || npc == this || !(npc instanceof GodWarFaction)
                        || ((GodWarFaction) npc).getFaction() == faction || npc.isDead() || npc.hasFinished()
                        || !npc.withinDistance(this,
                            getCombatDefinitions().getAttackStyle() == NpcCombatDefinitions.MELEE ? 4 :
                                    getCombatDefinitions().getAttackStyle() == NpcCombatDefinitions.SPECIAL ? 16 : 8)
                        || !npc.getDefinitions().hasAttackOption()
                        || (!isAtMultiArea() || !npc.isAtMultiArea()) && npc.getAttackedBy() != this
                           && npc.getAttackedByDelay() > TimeUtils.getTime() || !clippedProjectile(npc, false))
                        continue;
                    possibleTarget.add(npc);
                }
            }
        }
        return possibleTarget;
    }

    public int getFaction() {
        return faction;
    }

    private static final String[] ARMADYL_FACTION_ITEMS = new String[]{"Armadyl"};
    private static final String[] BANDOS_FACTION_ITEMS = new String[]{"Bandos"};
    private static final String[] SARADOMIN_FACTION_ITEMS = new String[]{"Saradomin"};
    private static final String[] ZAMORAK_FACTION_ITEMS = new String[]{"Zamorak"};
    private static final String[] ZAROS_FACTION_ITEMS = new String[]{"Torva", "Virtus", "Pernix"};

    public static int getGWDFaction(int npcId) {
        if (npcId >= 6229 && npcId <= 6246) return ARMADYL_FACTION;
        if (npcId >= 6268 && npcId <= 6283 || npcId == 9184 || npcId == 9185 || npcId == 374) return BANDOS_FACTION;
        if (npcId >= 6254 && npcId <= 6259) return SARADOMIN_FACTION;
        if (npcId >= 6210 && npcId <= 6221 || npcId == 3406) return ZAMORAK_FACTION;
        return -1;
    }

}


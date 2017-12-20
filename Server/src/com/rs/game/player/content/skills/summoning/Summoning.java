package com.rs.game.player.content.skills.summoning;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.world.Animation;
import com.rs.game.world.WorldObject;

public class Summoning {

    public static void sendInterface(Player player) {
        player.getInterfaceManager().sendInterface(INTERFACE);
        Object options[] = {78, 1, "Infuse-All<col=FF9040>", "Infuse-10<col=FF9040>", "Infuse-5<col=FF9040>",
                "Infuse<col=FF9040>", 10, 8,
                INTERFACE << 16 | 0x10};
        player.getPackets().sendRunScript(757, options);
        player.getPackets().sendIComponentSettings(INTERFACE, 16, 0, 462, 190);
    }

    public static void spawnFamiliar(Player player, PouchData data) {
        if (player.getFollower() != null) {
            player.getPackets().sendGameMessage("You already have a follower.");
            return;
        }
        FollowerData followerData = FollowerData.forPouchData(data);
        if (followerData == null) {
            player.sendMessage("This familiar isn't added yet.");
            return;
        }
        if (player.getSkills().getLevel(Skills.SUMMONING) < followerData.getSummonCost()) return;

        final Follower npc = new Follower(player, followerData, player);
        player.getSkills().addXp(Skills.SUMMONING, followerData.getSummoningXp());
        player.getInventory().deleteItem(followerData.getPouchId(), 1);
        player.getSkills().drainSummoning(followerData.getSummonCost());
        if (followerData.getSpawnAnimation() != null) npc.setNextAnimation(followerData.getSpawnAnimation());
        player.getFollowerManager().setFollower(npc);
    }

    private static int amountCanCreate(final Player player, int itemId) {
        PouchData pouch = PouchData.forPouchId(itemId);
        if (pouch == null) return 0;
        return player.getInventory().getItems().getNumberOf(pouch.getTertiaryId());
    }

    public static void createPouch(final Player player, int itemId, int amount) {
        PouchData pouchData = PouchData.forPouchId(itemId);
        if (pouchData == null) {
            player.getPackets().sendGameMessage("You do not have the items required to create this pouch.");
            return;
        }
        int amountToCreate = amountCanCreate(player, itemId);
        if (amount > amountToCreate) {
            amount = player.getInventory().getItems().getNumberOf(itemId);
        }
        if (amount > 28) {
            amount = 1;
        }
        player.getInterfaceManager().closeScreenInterface();
        boolean end = false;
        int i;
        for (i = 0; i < amount; i++) {
            for (Item item : pouchData.getItems()) {
                if (!player.getInventory().getItems().contains(item)) {
                    if (amount == 1) {
                        player.getPackets().sendGameMessage("You do not have the items required to create this pouch.");
                    }
                    end = true;
                    break;
                }
            }
            if (end) {
                break;
            }
            player.getInventory().removeItems(pouchData.getItems());
            player.getInventory().addItem(pouchData.getPouchId(), 1);
            player.getSkills().addXp(Skills.SUMMONING, (pouchData.getCreationExp()));
            player.getPackets().sendObjectAnimation(new WorldObject(28716, 10, 1, 2209, 5344, 0), new Animation(8509));
        }
        if (i == 1) {
            player.getPackets().sendGameMessage(
                    "You infuse a " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase() + ".");
        } else if (i > 0) {
            player.getPackets().sendGameMessage(
                    "You infuse some " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase() + "es.");
        } else {
            return;
        }
        player.setNextAnimation(new Animation(9068));
    }

    public static void transformScrolls(Player player, int itemId, int amount) {
        PouchData pouchData = PouchData.forPouchId(itemId);
        if (pouchData == null) {
            player.sendMessage("You do not have the pouch required to make this scroll.");
            return;
        }
        if (!RequirementsManager.hasRequirement(player, Skills.SUMMONING, pouchData.getLevel(), "to make this scroll"))
            return;

        int maxAmount = player.getInventory().numberOf(pouchData.getPouchId());
        if (maxAmount == 0) return;

        int currentAmount = player.getInventory().numberOf(pouchData.getScrollId());
        if (currentAmount > 0 && currentAmount + amount * 10 < 1) {
            amount = Integer.MAX_VALUE - currentAmount;
        }
        if (amount <= 0) {
            return;
        }
        if (amount > maxAmount) {
            amount = maxAmount;
        }
        player.getInterfaceManager().closeScreenInterface();
        player.getInventory().deleteItem(pouchData.getPouchId(), amount);
        player.getInventory().addItem(pouchData.getScrollId(), amount * 10);
        player.getSkills().addXp(Skills.SUMMONING, 5 * amount);
        player.getPackets().sendObjectAnimation(new WorldObject(28716, 10, 1, 2209, 5344, 0), new Animation(8509));
        player.getPackets().sendGameMessage(
                "You transform some " + ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase() + ".");
        player.setNextAnimation(new Animation(9068));
    }

    private static int INTERFACE = 672;

    public static void infusePouches(Player player) {
        player.getInterfaceManager().sendInterface(INTERFACE);// close to this
        Object[] options = new Object[]{78, 1, "List<col=FF9040>", "Infuse-X<col=FF9040>", "Infuse-All<col=FF9040>",
                "Infuse-10<col=FF9040>", "Infuse-5<col=FF9040>", "Infuse<col=FF9040>", 10, 8,
                INTERFACE << 16 | 16};
        // to slot, from slot, options, width, height, component
        player.getPackets().sendRunScript(757, options);
        player.getPackets().sendIComponentSettings(INTERFACE, 16, 0, 430, 190);
    }

    public static void infuseScrolls(Player player) {
        player.getInterfaceManager().sendInterface(666);
        Object[] options = new Object[]{78, 1, "Transform-X<col=ff9040>", "Transform-All<col=ff9040>",
                "Transform-10<col=ff9040>", "Transform-5<col=ff9040>", "Transform<col=ff9040>", 10, 8,
                666 << 16 | 16};
        player.getPackets().sendRunScript(763, options);
        player.getPackets().sendIComponentSettings(666, 16, 0, 462, 126);
    }

}
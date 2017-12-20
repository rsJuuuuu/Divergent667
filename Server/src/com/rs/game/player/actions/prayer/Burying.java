package com.rs.game.player.actions.prayer;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Animation;
import com.rs.utils.stringUtils.TimeUtils;

public class Burying {

    public static boolean bury(final Player player, int inventorySlot) {
        final Item item = player.getInventory().getItem(inventorySlot);
        if (item == null || Bone.forId(item.getId()) == null) return false;
        if (player.getBoneDelay() > TimeUtils.getTime()) return true;
        final Bone bone = Bone.forId(item.getId());
        final ItemDefinitions itemDef = new ItemDefinitions(item.getId());
        player.addBoneDelay(3000);
        player.getPackets().sendSound(2738, 0, 1);
        player.setNextAnimation(new Animation(827));
        player.getPackets().sendGameMessage("You dig a hole in the ground...");
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                player.getPackets().sendGameMessage("You bury the " + itemDef.getName().toLowerCase() + ".");
                player.getInventory().deleteItem(item.getId(), 1);
                player.getSkills().addXp(Skills.PRAYER, bone.getExperience());
                stop();
            }

        }, 2);
        return true;
    }

}

package com.rs.game.minigames.evilTree;

/**
 * Created by Peng on 17.12.2016 21:08.
 */

import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Animation;
import com.rs.game.world.WorldObject;
import com.rs.utils.Utils;

import static com.rs.game.minigames.evilTree.TreeManager.KINDLING_ID;

public class LightEvilTree extends Action {

    private EvilTree tree;

    public LightEvilTree(WorldObject tree) {
        if (tree instanceof EvilTree) this.tree = (EvilTree) tree;
    }

    @Override
    public boolean start(Player player) {
        if (!checkAll(player)) return false;
        player.sendMessage("You attempt to light the Evil tree.", true);
        setActionDelay(player, Utils.getRandom(5) + 4);
        player.setNextAnimation(new Animation(733));
        player.getPackets().sendSound(2599, 0, 1);
        return true;
    }

    public boolean checkAll(Player player) {
        if (tree == null) return false;
        if (!player.getInventory().containsItem(590, 1)) {
            player.getPackets().sendGameMessage("You do not have the required items to light this.");
            return false;
        }
        return RequirementsManager.hasRequirement(player, Skills.FIREMAKING, tree.getTreeDefinitions().getFiremakingLevel(),
                "light this");
    }

    @Override
    public boolean process(Player player) {
        return checkAll(player);
    }

    @Override
    public int processWithDelay(final Player player) {
        final WorldObject tile = tree.getFire(player);
        if (tile == null) {
            player.sendMessage("There is already a fire there.");
            return -1;
        }
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                tree.setFire(tile);
                player.getInventory().deleteItem(KINDLING_ID, 1);
                player.getPackets().sendGameMessage("You manage to light the evil tree", true);
                player.getPackets().sendSound(2594, 0, 1);
                player.getSkills().addXp(Skills.FIREMAKING, tree.getTreeDefinitions().getFiremakingXp());
                player.setNextFaceWorldTile(tile);
            }
        }, 1);
        return -1;
    }

    @Override
    public void stop(Player player) {

    }

}


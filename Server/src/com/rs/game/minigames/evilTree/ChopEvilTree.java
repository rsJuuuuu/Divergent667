package com.rs.game.minigames.evilTree;

import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.skills.Woodcutting;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.world.Animation;
import com.rs.game.world.WorldObject;
import com.rs.utils.Utils;

/**
 * Created by Peng on 27.11.2016 12:54.
 */
public class ChopEvilTree extends Action {

    /**
     * Chop one of these
     */
    private EvilTree tree;
    private EvilRoot root;
    private TreeManager.EvilTreeDefinitions definitions;

    private int emoteId;
    private int axeTime;

    ChopEvilTree(WorldObject tree, TreeManager.EvilTreeDefinitions definitions) {
        if (tree instanceof EvilTree) this.tree = (EvilTree) tree;
        if (tree instanceof EvilRoot) this.root = (EvilRoot) tree;
        this.definitions = definitions;
    }

    private boolean setAxe(Player player) {
        Woodcutting.Hatchet hatchet = Woodcutting.Hatchet.forId(player);
        if (hatchet == null) return false;
        axeTime = hatchet.getTime();
        emoteId = hatchet.getEmoteId();
        return true;
    }

    private boolean checkAll(Player player) {
        if (tree == null && root == null) return false; //not chopping if its not spawned by tree manager
        if (tree == null && !root.isAlive() || root == null && tree.isDead()) {
            player.sendMessage("The evil " + (root == null ? "tree" : "root") + " has fallen.");
            return false;
        }
        if (!Woodcutting.Hatchet.hasHatchet(player)) {
            player.getPackets().sendGameMessage("You need a hatchet to chop down this tree.");
            return false;
        }
        if (!setAxe(player)) {
            player.getPackets().sendGameMessage("You don't have the required level to use that axe.");
            return false;
        }
        return RequirementsManager.hasRequirement(player, Skills.WOODCUTTING, definitions.getWoodcuttingLevel(),
                "to chop this " + "tree");
    }

    @Override
    public boolean start(Player player) {
        if (!checkAll(player)) return false;
        player.getPackets().sendGameMessage("You swing your hatchet at the " + definitions.getTreeName() + ".");
        setActionDelay(player, 10);
        return true;
    }

    @Override
    public boolean process(Player player) {
        if (!checkAll(player)) return false;
        player.setNextAnimation(new Animation(emoteId));
        return true;
    }

    @Override
    public int processWithDelay(Player player) {
        int damage = Utils.getRandom(1020);
        player.getSkills().addXp(Skills.WOODCUTTING, definitions.getWoodcuttingXp());
        if (tree != null) tree.processDamage(player, damage);
        else root.processDamaged();
        return 20 / axeTime * Utils.random(4) + 3;
    }

    @Override
    public void stop(Player player) {
        setActionDelay(player, 3);
    }

}

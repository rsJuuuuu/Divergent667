package com.rs.game.player.actions.prayer;

import com.rs.game.actionHandling.handlers.listeners.Construction;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.controllers.impl.HouseController;
import com.rs.game.world.*;

/**
 * Created by Peng on 28.1.2017 0:57.
 */
public class BonesOnAltar extends Action {

    public enum Altar {
        OAK(13179, 1.0),
        TEAK(13182, 1.10),
        CLOTH(13185, 1.25),
        MAHOGANY(13188, 1.5),
        LIMESTONE(13191, 1.75),
        MARBLE(13194, 2.0),
        GILDED(13197, 2.5);
        private int id;
        private double boost;

        Altar(int id, double boost) {
            this.id = id;
            this.boost = boost;
        }

        public static Altar forId(int id) {
            for (Altar altar : Altar.values())
                if (altar.id == id) return altar;
            return null;
        }
    }

    private int boneId;
    private Bone bone;
    private Altar altar;
    private WorldTile faceTile;

    private BonesOnAltar(int boneId, Altar altar) {
        this.boneId = boneId;
        this.altar = altar;
        bone = Bone.forId(boneId);

    }

    @Override
    public boolean start(Player player) {
        faceTile = player.getNextFaceWorldTile();
        return player.getInventory().containsOneItem(boneId);
    }

    @Override
    public boolean process(Player player) {
        return player.getInventory().containsOneItem(boneId);
    }

    @Override
    public int processWithDelay(Player player) {
        if (!player.getInventory().containsItem(boneId, 1)) return -1;
        player.sendMessage("The gods are very pleased with your offering.", true);
        player.setNextAnimation(new Animation(896));
        World.sendGraphics(player, new Graphics(624), faceTile);
        player.setNextGraphics(new Graphics(624));
        player.getInventory().deleteItem(new Item(boneId, 1));
        Region region = World.getRegion(player.getRegionId());
        int burnerCount = 0;
        for (WorldObject object : region.getSpawnedObjects()) {
            if (Construction.isBurner(object)) burnerCount++;
        }
        if (burnerCount > 2) burnerCount = 2;//make sure no other rooms interfere for infinite exp
        double xp = bone.getExperience() * (altar.boost + burnerCount * 0.5);

        player.getSkills().addXp(Skills.PRAYER, xp);
        player.getInventory().refresh();
        return 3;
    }

    @Override
    public void stop(Player player) {

    }

    public static boolean useBone(Player player, int itemId, int altarId) {
        Bone bone = Bone.forId(itemId);
        Altar altar = Altar.forId(altarId);
        if (bone == null || altar == null) return false;
        if (!(player.getControllerManager().getController() instanceof HouseController)) {
            player.sendMessage("You can only do this with a player owned house altar");
            return false;
        }
        player.getActionManager().setAction(new BonesOnAltar(itemId, altar));
        return true;
    }
}

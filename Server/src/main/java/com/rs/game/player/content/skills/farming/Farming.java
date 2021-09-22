package com.rs.game.player.content.skills.farming;

import com.rs.game.world.Animation;
import com.rs.game.world.WorldObject;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;

public class Farming implements Serializable {

    /**
     * @author Peng, inspired by Jake | Santa Hat @Rune-Server
     */

    /**
     *
     */
    private static final long serialVersionUID = -4161665396836298939L;
    /**
     * Farming
     */
    public CopyOnWriteArrayList<PatchStatus> farmingPatches;
    public CopyOnWriteArrayList<WorldObject> rakedPatches;
    private transient Player player;

    public Farming() {
        farmingPatches = new CopyOnWriteArrayList<>();
        rakedPatches = new CopyOnWriteArrayList<>();
    }

    public void login(Player player) {
        this.player = player;
        sendConfigs();
    }

    /**
     * Sends the current states of farming patches
     */
    public void sendConfigs() {
        if (farmingPatches == null)
            return;
        for (PatchStatus patch : farmingPatches) {
            player.getPackets().sendConfigByFile(patch.getConfigId(), patch.getConfigValue());
        }
    }

    /**
     * Gets ran once every game tick and updates patches when needed
     */
    public void updateConfigs() {
        if (farmingPatches == null)
            return;
        for (PatchStatus patch : farmingPatches) {
            if (patch.getConfigValue() >= patch.getMaxConfigValue())
                continue;
            if (patch.updateConfig()) {
                patch.setConfigValue(patch.getConfigValue() + 1);
            }
            if (patch.getConfigValue() >= patch.getMaxConfigValue()) {
                player.sendMessage("[Farming] Some of your crops have fully grown.");
            }
        }
        sendConfigs();
    }

    /**
     * Handles using seed to patch
     *
     * @param seedId
     * @param object
     */
    public void handleSeed(int seedId, WorldObject object) {
        if (!isRaked(object)) {
            player.sendMessage("You must first clear the weeds.");
            return;
        }
        for (PatchStatus patch : farmingPatches) {
            if (patch.getObjectId() == object.getId()) {
                player.sendMessage("There is already something growing here.");
                return;
            }
        }
        Seeds.Seed seed = Seeds.Seed.forItemId(seedId);
        if (seed == null)
            return;
        if (player.getSkills().getLevel(Skills.FARMING) < seed.getLevel()) {
            player.sendMessage("You need at least " + seed.getLevel() + " farming to plant that seed.");
            return;
        }
        if (!player.getInventory().containsItem(seed.getItem().getId(), seed.getItem().getAmount())) {
            player.sendMessage("You need " + seed.getItem().getAmount() + " " + seed.getItem().getName() + "s");
            return;
        }
        if (Seeds.PatchGroup.belongsToGroup(seed.getSuitablePatch(), object.getId())) {
            player.sendMessage("You plant some " + seed.getItem().getName() + "s.");
            player.getInventory().deleteItem(seed.getItem());
            player.setNextAnimation(new Animation(2291));
            farmingPatches.add(new PatchStatus(object.getId(), object.getDefinitions().getConfigFileId(),
                    seed.getStartConfig(), seed.getEndConfig(),
                    "Some" + seed.getItem().getName() + "s have been planted here.", seed.getTime()));
            sendConfigs();
        }

    }

    /**
     * Farming patch action
     *
     * @param object
     */
    public void farmingAction(WorldObject object) {
        if (hasCrop(object)) {
            harvest(object);
        } else
            rake(object);
    }

    /**
     * Collect crops and add xp
     *
     * @param object
     */
    public void harvest(WorldObject object) {
        player.getPackets().sendConfigByFile(object.getDefinitions().getConfigFileId(), 0);
        addProducts(object);
        // Removes the Crops
        farmingPatches.stream().filter(patch -> patch.getConfigId() == object.getDefinitions().getConfigFileId())
                .forEach(patch -> {
                    Seeds.Seed seed =
                            Seeds.Seed
                                    .forConfig(Seeds.PatchGroup.forObjectId(object.getId()), patch.getMaxConfigValue());
                    player.getSkills().addXp(Skills.FARMING, seed.getXp());
                    farmingPatches.remove(patch); // Removes the Crops
                });
        rakedPatches.stream().filter(o -> o.getId() == object.getId()).forEach(o -> rakedPatches.remove(o));
    }

    /**
     * @param object
     * @return whether there is something grown in specified patch
     */
    public boolean hasCrop(WorldObject object) {
        for (PatchStatus patch : farmingPatches) {
            if (patch.getConfigId() == object.getDefinitions().getConfigFileId()) {
                if (patch.getConfigValue() == patch.getMaxConfigValue())
                    return true;
            }
        }
        return false;
    }

    /**
     * Gives player the products
     *
     * @param object
     */
    public void addProducts(WorldObject object) {
        for (PatchStatus patch : farmingPatches) {
            if (patch.getObjectId() == object.getId()) {
                for (Seeds.Seed seed : Seeds.Seed.values()) {
                    if (seed.getEndConfig() == patch.getMaxConfigValue()
                            && Seeds.PatchGroup.belongsToGroup(seed.getSuitablePatch(), object.getId())) {
                        player.setNextAnimation(new Animation(2286));
                        player.getInventory().addItem(seed.getProduce());
                        player.sendMessage("You harvest the " + seed.getProduce().getName() + "s.");
                    }
                }
            }
        }
    }

    /**
     * For Raking the patch
     *
     * @param object
     */
    public void rake(final WorldObject object) {
        if (!player.getInventory().containsItem(5341, 1)) {
            player.sendMessage("You'll need a rake to get rid of the weeds.");
            return;
        }
        WorldTasksManager.schedule(new WorldTask() {
            int loop;
            int configValue;

            @Override
            public void run() {
                player.stopAll();
                if (loop == 0 || loop == 3 || loop == 6) {
                    configValue++;
                    player.setNextAnimation(new Animation(2273));
                    player.getPackets().sendConfigByFile(object.getDefinitions().getConfigFileId(), configValue);
                    player.getInventory().addItem(6055, 1);
                    player.getSkills().addXp(Skills.FARMING, 1);
                }
                if (loop == 6) {
                    rakedPatches.add(object);
                    player.sendMessage("You successfully clear all the weeds.");
                } else if (loop >= 7) {
                    stop();
                }
                loop++;
            }
        }, 0, 1);
    }

    /**
     * Inspect message
     *
     * @param object
     */
    public void inspectPatch(WorldObject object) {
        if (farmingPatches.size() == 0) {
            player.getDialogueManager().startDialogue("SimpleMessage", "There is currently nothing growing here.");
            return;
        }
        for (PatchStatus patch : farmingPatches) {
            if (object.getId() == patch.getObjectId()) {
                player.getDialogueManager().startDialogue("SimpleMessage", patch.getInspectText());
                return;
            }
        }
        player.getDialogueManager().startDialogue("SimpleMessage", "There is currently nothing growing here.");
    }

    /**
     * @param object
     * @return Whether the patch has been raked (can we plant on it)
     */
    public boolean isRaked(WorldObject object) {
        for (WorldObject o : rakedPatches) {
            if (o.getId() == object.getId())
                return true;
        }
        return false;
    }

}

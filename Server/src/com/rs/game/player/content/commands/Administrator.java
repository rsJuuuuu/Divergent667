package com.rs.game.player.content.commands;

import com.rs.Settings;
import com.rs.game.Hit;
import com.rs.game.actionHandling.Handler;
import com.rs.game.item.Item;
import com.rs.game.item.ItemSet;
import com.rs.game.npc.Npc;
import com.rs.game.npc.drops.NpcDrops;
import com.rs.game.player.Player;
import com.rs.game.player.PlayerUtils;
import com.rs.game.player.Skills;
import com.rs.game.player.content.shops.ShopHandler;
import com.rs.game.player.info.RanksManager;
import com.rs.game.world.Animation;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.utils.IdSearch;
import com.rs.utils.stringUtils.TextUtils;
import com.rs.utils.stringUtils.TimeUtils;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerAdminCommand;

/**
 * Created by Peng on 30.7.2016.
 */
public class Administrator implements Handler {

    @Override
    public void register() {

        registerAdminCommand((player, command, params) -> {
            if (params.length == 0) {
                player.sendMessage("Usage: getid [type (npc/object/item)] [search terms]");
                return RETURN;
            }
            String[] search = new String[params.length - 1];
            System.arraycopy(params, 1, search, 0, params.length - 1);
            switch (params[0].toLowerCase()) {
                case "npc":
                    IdSearch.searchForNpc(player, TextUtils.combine(search));
                    break;
                case "object":
                    IdSearch.searchForObject(player, TextUtils.combine(search));
                    break;
                case "item":
                    IdSearch.searchForItem(player, TextUtils.combine(search));
                    break;
                default:
                    player.sendMessage("Usage: getid [type (npc/object/item)] [search terms]");

            }
            return RETURN;
        }, "getid");

        registerAdminCommand((player, command, params) -> {
            try {
                NpcDrops.checkRareDrop(player, new Item(Integer.valueOf(params[0])));
            } catch (NumberFormatException nfe) {
                player.sendMessage("Usage: testdrop [itemid]");
            }
            return RETURN;
        }, "testdrop");

        registerAdminCommand((player, command, params) -> {
            player.cureAll();
            return RETURN;
        }, "heal");

        registerAdminCommand((player, command, params) -> {
            player.applyHit(new Hit(player, player.getHealth() - 1, Hit.HitLook.REGULAR_DAMAGE));
            return RETURN;
        }, "1hp");
        registerAdminCommand((player, command, params) -> {
            Npc npc = World.spawnNPC(7891, new WorldTile(player.getX(),
                    player.getY() + 1, player.getPlane()), -1, true, true);
            npc.setName("Test dummy");
            npc.setCombatLevel(3);
            npc.setHealth(133700);
            npc.setCantFollowUnderCombat(true);
            npc.setForceMultiArea(true);
            npc.setRandomWalk(false);
            return RETURN;
        }, "testdummy");
        registerAdminCommand((player, command, params) -> {
            for (Npc n : World.getNPCs()) {
                if (n == null || n.getId() != 7891) continue;
                n.sendDeath(n);
            }
            return RETURN;
        }, "killdummy");
        registerAdminCommand((player, command, params) -> {
            String name = params[0];
            Player target = PlayerUtils.loadPlayer(TextUtils.formatPlayerNameForProtocol(name));
            if (target == null) return RETURN;
            target.setUsername(TextUtils.formatPlayerNameForProtocol(name));
            target.setLocation(new WorldTile(3095, 3497, 0));
            PlayerUtils.savePlayer(target);
            player.sendMessage("Attempted to unstuck " + target.getDisplayName());
            return RETURN;
        }, "unstuck");
        registerAdminCommand((player, command, params) -> {
            ItemSet.listSets(player);
            return RETURN;
        }, "listsets");
        registerAdminCommand((player, command, params) -> {
            if (!(params.length + 1 >= 2)) return RETURN;
            String name = "";
            for (int i = 1; i < params.length + 1; i++) {
                name += params[i - 1];
                ItemSet.addEquipmentSet(player, name);
            }
            return RETURN;
        }, "setgear");
        registerAdminCommand((player, command, params) -> {
            if (!(params.length + 1 >= 2)) return RETURN;
            String name = "";
            for (int i = 1; i < params.length + 1; i++) {
                name += params[i - 1];
            }
            ItemSet.addInvSet(player, name);
            return RETURN;
        }, "setinv");
        registerAdminCommand((player, command, params) -> {
            try {
                int itemId = Integer.valueOf(params[0]);
                player.getInventory().addItem(itemId, params.length + 1 >= 3 ? Integer.valueOf(params[1]) : 1);
            } catch (NumberFormatException e) {
                player.getPackets().sendGameMessage("Use: ::item id (optional:amount)");
            }
            return RETURN;
        }, "item");
        registerAdminCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayerByDisplayName(name);
            try {
                player.getPackets().sendItems(95, other.getBank().getContainerCopy());
                player.getBank().openPlayerBank(other);
            } catch (Exception e) {
                player.getPackets().sendGameMessage("The player " + name + " is currently unavailable.");
            }
            return RETURN;
        }, "checkbank");

        registerAdminCommand((player, command, params) -> {
            String name = TextUtils.combine(params);
            Player p2 = PlayerUtils.findPlayer(name, false);
            if (p2 == null) {
                player.sendMessage("Couldn't locate player: " + name + ".");
                return RETURN;
            }
            if (player.getEquipment().wearingArmour()) {
                player.getPackets().sendGameMessage("Please remove your armour first.");
                return RETURN;
            }
            Item[] items = p2.getEquipment().getItems().getItemsCopy();
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) continue;
                player.getEquipment().getItems().set(i, items[i]);
                player.getEquipment().refresh(i);
            }
            player.getAppearance().generateAppearanceData();
            return RETURN;
        }, "copy"); //note that this has no req check as its for admins

        registerAdminCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayerByDisplayName(name);
            if (other == null) return RETURN;
            int skill = Integer.parseInt(params[1]);
            int level = Integer.parseInt(params[2]);
            other.getSkills().set(Integer.parseInt(params[1]), Integer.parseInt(params[2]));
            other.getSkills().set(skill, level);
            other.getSkills().setXp(skill, Skills.getXPForLevel(level));
            other.getPackets().sendGameMessage(
                    "One of your skills:  " + other.getSkills().getLevel(skill) + " has been set to " + level + " from "
                    + player.getDisplayName() + ".");
            player.getPackets().sendGameMessage(
                    "You have set the skill:  " + other.getSkills().getLevel(skill) + " to " + level + " for "
                    + other.getDisplayName() + ".");
            return RETURN;
        }, "setlevelother");
        registerAdminCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayers().get(World.getIdFromName(name));
            if (other == null) {
                player.getPackets().sendGameMessage("There is no such player as " + name + ".");
                return RETURN;
            }
            int item = Integer.parseInt(params[1]);
            int amount = Integer.parseInt(params[2]);
            other.getInventory().addItem(item, amount);
            other.sendMessage("You have received an item from " + player.getDisplayName() + ".");
            player.sendMessage("You have given an item to " + other.getDisplayName() + ".");
            return RETURN;
        }, "giveitem");
        registerAdminCommand((player, command, params) -> {
            player.setHealth(Short.MAX_VALUE);
            player.getEquipment().setEquipmentHpIncrease(Short.MAX_VALUE - 990);
            for (int i = 0; i < 10; i++)
                player.getCombatDefinitions().getBonuses()[i] = 5000;
            for (int i = 14; i < player.getCombatDefinitions().getBonuses().length; i++)
                player.getCombatDefinitions().getBonuses()[i] = 5000;
            return RETURN;
        }, "god");
        registerAdminCommand((player, command, params) -> {
            if (ShopHandler.openShop(player, params[0].replaceAll("_", " "))) {
                player.sendMessage("Opened shop " + params[0].replaceAll("_", " "));
            } else player.sendMessage("Error opening shop! Usage: ::shop [shop_name]");
            return RETURN;
        }, "shop");
        registerAdminCommand((player, command, params) -> {
            for (Player p : World.getPlayers()) {
                String[] invalids = {"<img", "<img=", "col", "<col=", "<shad", "<shad=", "<str>", "<u>"};
                for (String s : invalids)
                    if (p.getDisplayName().contains(s)) {
                        player.getPackets().sendGameMessage(TextUtils.formatPlayerNameForDisplay(p.getUsername()));
                    } else {
                        player.getPackets().sendGameMessage("None exist!");
                    }
            }
            return RETURN;
        }, "checkdisplay");
        registerAdminCommand((player, command, params) -> {
            player.startDialogue("SwapPrayersAndSpells");
            return RETURN;
        }, "switchbooks", "switch");

        registerAdminCommand((player, command, params) -> {
            if (player.getAppearance().isMale()) player.getAppearance().female();
            else player.getAppearance().male();
            return RETURN;
        }, "swap_gender");
        registerAdminCommand((player, command, params) -> {
            if (params.length + 1 < 3) {
                player.getPackets().sendGameMessage("Usage ::setlevel skillId level");
                return RETURN;
            }
            try {
                int skill = Integer.parseInt(params[0]);
                int level = Integer.parseInt(params[1]);
                if (level < 0 || level > 99) {
                    player.getPackets().sendGameMessage("Please choose a valid level.");
                    return RETURN;
                }
                player.getSkills().set(skill, level);
                player.getSkills().setXp(skill, Skills.getXPForLevel(level));
                player.getAppearance().generateAppearanceData();
                return RETURN;
            } catch (NumberFormatException e) {
                player.getPackets().sendGameMessage("Usage ::setlevel skillId level");
                return RETURN;
            }
        }, "setlevel", "setskill", "level");
        registerAdminCommand((player, command, params) -> {
            try {
                World.spawnNPC(Integer.parseInt(params[0]), player, -1, true, true);
                return RETURN;
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::npc id(Integer)");
            }
            return RETURN;
        }, "npc", "spawnnpc");
        registerAdminCommand((player, command, params) -> {
            try {
                World.spawnObject(new WorldObject(Integer.valueOf(params[0]),
                        params.length + 1 > 2 ? Integer.valueOf(params[1]) : 10, params.length + 1
                                                                                 > 3 ? Integer.parseInt(params[2]) :
                        0, player.getX(), player.getY(), player.getPlane()), true);
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::" + command + " id type rotation");
            }
            return RETURN;
        }, "object", "spawnobject");
        registerAdminCommand((player, command, params) -> {
            player.applyHit(new Hit(player, player.getHealth(), Hit.HitLook.REGULAR_DAMAGE));
            return RETURN;
        }, "killme");
        registerAdminCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                for (int skill = 0; skill < 25; skill++)
                    player.getSkills().setXp(skill, 0);
                player.getSkills().restoreSkills();
                return RETURN;
            }
            try {
                player.getSkills().setXp(Integer.valueOf(params[0]), 0);
                player.getSkills().set(Integer.valueOf(params[0]), 1);
                player.getSkills().restoreSkills();
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::reset skill");
            }
            return RETURN;
        }, "reset");
        registerAdminCommand((player, command, params) -> {
            if (params.length < 2) {
                for (int skill = 0; skill < 25; skill++)
                    player.getSkills().setXp(skill, 15000000);
                player.getSkills().restoreSkills();
                return RETURN;
            }
            try {
                player.getSkills().setXp(Integer.valueOf(params[0]), 15000000);
                player.getSkills().restoreSkills();
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::master skill");
            }
            return RETURN;
        }, "master");
        registerAdminCommand((player, command, params) -> {
            String name = "";
            for (int i = 1; i < params.length + 1; i++)
                name += params[i - 1] + ((i == params.length + 1 - 1) ? "" : " ");

            Player target = World.getPlayerByDisplayName(name);
            if (target != null) {
                target.setBanned(TimeUtils.getTime() + (48 * 60 * 60 * 1000));
                target.getSession().getChannel().close();
                player.getPackets().sendGameMessage("You have banned 48 hours: " + target.getDisplayName() + ".");
            } else {
                player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
            }
            return RETURN;
        }, "ban");
        registerAdminCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                player.getPackets().sendPanelBoxMessage("Use: ::tonpc id(-1 for player)");
                return RETURN;
            }
            try {
                player.getAppearance().transformIntoNPC(Integer.valueOf(params[0]));
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::tonpc id(-1 for player)");
            }
            return RETURN;
        }, "tonpc");
        registerAdminCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayerByDisplayName(name);
            if (other == null) return RETURN;
            other.setNextWorldTile(Settings.RESPAWN_PLAYER_LOCATION);
            other.stopAll();
            return RETURN;
        }, "teleaway");
        registerAdminCommand((player, command, params) -> {
            if (params.length == 1) {
                try {
                    //shift click
                    String[] teleParams = params[0].split(",");
                    int plane = Integer.valueOf(teleParams[0]);
                    int x = Integer.valueOf(teleParams[1]) << 6 | Integer.valueOf(teleParams[3]);
                    int y = Integer.valueOf(teleParams[2]) << 6 | Integer.valueOf(teleParams[4]);
                    player.setNextWorldTile(new WorldTile(x, y, plane));
                    return RETURN;
                } catch (Exception e) {
                    player.getPackets().sendPanelBoxMessage("Use: ::tele coordX coordY");
                    return RETURN;
                }
            } else {
                //normal
                if (params.length < 2) {
                    player.getPackets().sendPanelBoxMessage("Use: ::tele coordX coordY");
                    return RETURN;
                }
                try {
                    player.resetWalkSteps();
                    player.setNextWorldTile(new WorldTile(Integer.valueOf(params[0]), Integer.valueOf(params[1]),
                            params.length >= 3 ? Integer.valueOf(params[2]) : player.getPlane()));
                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                    player.getPackets().sendPanelBoxMessage("Use: ::tele coordX coordY plane");
                }
                return RETURN;
            }
        }, "tele");
        registerAdminCommand((player, command, params) -> {
            for (Npc n : World.getNPCs()) {
                if (n == null || n.getId() != Integer.parseInt(params[0])) continue;
                n.sendDeath(n);
            }
            return RETURN;
        }, "killnpc");
        registerAdminCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                player.getPackets().sendPanelBoxMessage("Use: ::emote id");
                return RETURN;
            }
            try {
                player.setNextAnimation(new Animation(Integer.valueOf(params[0])));
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::emote id");
            }
            return RETURN;
        }, "emote");
        registerAdminCommand((player, command, params) -> {
            if (params.length + 1 < 2) {
                player.getPackets().sendPanelBoxMessage("Use: ::emote id");
                return RETURN;
            }
            try {
                player.getAppearance().setRenderEmote(Integer.valueOf(params[0]));
            } catch (NumberFormatException e) {
                player.getPackets().sendPanelBoxMessage("Use: ::emote id");
            }
            return RETURN;
        }, "remote");
        registerAdminCommand((player, command, params) -> {
            player.getCombatDefinitions().resetSpecialAttack();
            return RETURN;
        }, "spec");
        registerAdminCommand((player, command, params) -> {
            String name = params[0].substring(params[0].indexOf(" ") + 1);
            Player other = World.getPlayerByDisplayName(name);
            if (other == null) return RETURN;
            other.setNextWorldTile(player);
            other.stopAll();
            return RETURN;
        }, "teletome");
        registerAdminCommand((player, command, params) -> {
            player.setRank(RanksManager.Ranks.NORMAL);
            return RETURN;
        }, "removeadmin");
        registerAdminCommand((player, command, params) -> {
            String name = "";
            for (int i = 1; i < params.length + 1; i++)
                name += params[i - 1] + ((i == params.length + 1 - 1) ? "" : " ");
            Player other = World.getPlayerByDisplayName(name);
            boolean loggedIn = true;
            if (other == null) {
                other = PlayerUtils.loadPlayer(TextUtils.formatPlayerNameForProtocol(name));
                if (other != null) other.setUsername(TextUtils.formatPlayerNameForProtocol(name));
                loggedIn = false;
            }
            if (other != null) {
                other.setPermBanned(true);
                if (loggedIn) other.getSession().getChannel().close();
                else PlayerUtils.savePlayer(other);
                player.getPackets().sendGameMessage(
                        "You've permanently banned " + (loggedIn ? other.getDisplayName() : name) + ".");
            } else {
                player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
            }
            return RETURN;
        }, "permban");
        registerAdminCommand((player, command, params) -> {
            String name = "";
            for (int i = 1; i < params.length + 1; i++)
                name += params[i - 1] + ((i == params.length + 1 - 1) ? "" : " ");
            Player other = World.getPlayerByDisplayName(name);
            boolean loggedIn = true;
            if (other == null) {
                other = PlayerUtils.loadPlayer(TextUtils.formatPlayerNameForProtocol(name));
                loggedIn = false;
            }
            if (other != null) {
                other.setPermBanned(false);
                other.setBanned(0);
                other.setPassword("123");
                if (loggedIn) other.getSession().getChannel().close();
                else PlayerUtils.savePlayer(other);
                player.getPackets().sendGameMessage(
                        "You've permanently unbanned " + (loggedIn ? other.getDisplayName() : name) + ".");
            } else {
                player.getPackets().sendGameMessage("Couldn't find player " + name + ".");
            }
            return RETURN;

        }, "unpermban");

        registerAdminCommand((player, command, params) -> {
            player.getBank().openBank();
            return RETURN;
        }, "bank");
    }
}

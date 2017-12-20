package com.rs.game.player.content.skills.slayer;

import com.rs.game.player.Player;

import java.io.Serializable;

public class CoopSlayer implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3787391374833919591L;
    private transient Player player;
    private Player partner;

    public int killAmount;

    public CoopSlayer(Player player) {
        this.player = player;
    }

    public void partnerWith(Player partner) {
        killAmount = 0;
        this.partner = partner;
        partner.getCoopSlayer().partner = player;
        partner.getCoopSlayer().killAmount = 0;
        player.sendMessage("You have partnered for co-op slayer with " + partner.getUsername() + ".");
        partner.sendMessage("You have partnered for co-op slayer with " + player.getUsername() + ".");
    }

    public void setNextTask() {
        if (partner == null) return;
        if (partner.getTask() != null) {
            disband();
            return;
        }
        if (partner.getTask() == null) {
            partner.setTask(player.getTask());
            killAmount = 0;
            partner.getCoopSlayer().killAmount = 0;
        }
    }

    public Player getPartner() {
        return partner;
    }

    public boolean partnerLeftArea() {
        int distanceX = partner.getX() - player.getX();
        int distanceY = partner.getY() - player.getY();
        return Math.abs(distanceX) > 25 || Math.abs(distanceY) > 25 || partner.getPlane() != player.getPlane();
    }

    public void sendRequest(Player partner) {
        if (partner != null) {
            partner.sendMessage("They already have a Co-op team.");
            return;
        }
        if ((player.getTask() == null && partner.getTask() != null)
            || partner.getTask() == null && player.getTask() != null) {
            partner.sendMessage("You must both have the same task or no task!");
            return;
        }
        if (player.getTask() == null && partner.getTask() == null) {
            player.getDialogueManager().startDialogue("CoopInvite", partner);
            return;
        } else if (player.getTask().getName().equals(partner.getTask().getName())) {
            player.getDialogueManager().startDialogue("CoopInvite", partner);
            return;
        }
        partner.sendMessage(player.getDisplayName() + " is unable to partner with you right now.");
    }

    public void disband() {
        if (partner == null) return;
        player.sendMessage("You have disbanded your co-op team.");
        partner.getCoopSlayer().disband(player.getDisplayName());
        partner = null;
    }

    public void disband(String username) {
        player.sendMessage(username + " has disbanded your co-op team.");
        partner = null;
    }

    public void silentDisband() {
        if (partner == null) return;
        partner.getCoopSlayer().partner = null;
        partner = null;
    }

    public void checkKill(int npcId) {
        if (partner == null) return;
        if (partner.isDead() || partner.hasFinished() || partnerLeftArea()) {
            player.sendMessage("Your partner has left so your team has disbanded.");
            silentDisband();
            return;
        }
        if (partner.getTask() == null) return;
        if (!partner.getTask().getName().equals(player.getTask().getName())) {
            player.sendMessage("Your partner has gotten another task so your team has been disbanded.");
            silentDisband();
            return;
        }
        partner.getTask().decreaseAmount();
        killAmount++;
    }

}
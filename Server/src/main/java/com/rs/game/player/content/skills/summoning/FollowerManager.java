package com.rs.game.player.content.skills.summoning;

import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;

/**
 * Created by Peng on 13.2.2017 11:18.
 */
public class FollowerManager {

    private transient Player player;
    private Follower follower;

    public FollowerManager() {

    }

    public void login(Player player) {
        this.player = player;
        if (follower != null) follower.respawn(player);
    }

    public void logout() {
        if (follower != null) follower.dismiss(true);
    }

    public void sendDeath() {
        if (follower != null) follower.sendDeath(player);
    }

    public void setFollower(Follower follower) {
        this.follower = follower;
    }

    public boolean ownsFollower(Follower follower) {
        return follower.ownedBy(player);
    }

    public void store() {
        follower.store();
    }

    public Follower getFollower() {
        return follower;
    }
}

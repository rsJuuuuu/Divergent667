package com.rs.game.world;

/**
 * Created by Peng on 19.11.2016 20:47.
 */
public class Projectile {
    private int gfxId, startHeight, endHeight, speed, delay, curve, startDistanceOffset;

    public Projectile(int gfxId, int startHeight, int endHeight, int speed, int delay, int curve, int
            startDistanceOffset) {
        this.gfxId = gfxId;
        this.startHeight = startHeight;
        this.endHeight = endHeight;
        this.speed = speed;
        this.delay = delay;
        this.curve = curve;
        this.startDistanceOffset = startDistanceOffset;
    }

    int getGfxId() {
        return gfxId;
    }

    int getStartHeight() {
        return startHeight;
    }

    int getEndHeight() {
        return endHeight;
    }

    int getSpeed() {
        return speed;
    }

    public int getDelay() {
        return delay;
    }

    int getCurve() {
        return curve;
    }

    int getStartDistanceOffset() {
        return startDistanceOffset;
    }

    public static Projectile getDefaultRangedProjectile(int gfxId){
        return new Projectile(gfxId, 41, 16, 25, 35, 16, 0);
    }

    public static Projectile getDefaultMagicProjectile(int gfxId) {
        return new Projectile(gfxId, 40, 40, 50, 50, 0, 0);
    }

    public static Projectile getDefaultCurvedProjectile(int gfxId) {
        return new Projectile(gfxId, 30, 18, 40, 50, 20, 1);
    }
}

package com.rs.game.world;

/**
 * Created by Peng on 19.11.2016 20:47.
 */
public class Projectile {
    private final int gfxId;
    private final int startHeight;
    private final int endHeight;
    private final int speed;
    private final int delay;
    private final int curve;
    private final int startDistanceOffset;

    private final int delayOnTarget;

    /**
     * @param gfxId               the id of the graphic to display on the projectile
     * @param startHeight         starting height of the projectile
     * @param endHeight           ending height of the projectile
     * @param speed               the flying speed of the projectile
     * @param delay               delay before showing the projectile
     * @param curve               the curve of the projectile
     * @param startDistanceOffset the offset from the source towards the target
     */
    public Projectile(int gfxId, int startHeight, int endHeight, int speed, int delay, int curve, int
            startDistanceOffset) {
        this.gfxId = gfxId;
        this.startHeight = startHeight;
        this.endHeight = endHeight;
        this.speed = speed;
        this.delay = delay;
        this.curve = curve;
        this.startDistanceOffset = startDistanceOffset;
        this.delayOnTarget = 0;
    }

    /**
     * @param gfxId               the id of the graphic to display on the projectile
     * @param startHeight         starting height of the projectile
     * @param endHeight           ending height of the projectile
     * @param speed               the flying speed of the projectile
     * @param delay               delay before showing the projectile
     * @param curve               the curve of the projectile
     * @param startDistanceOffset the offset from the source towards the target
     * @param delayOnTarget       the delay the projectile stays on the target after reaching it
     */
    public Projectile(int gfxId, int startHeight, int endHeight, int speed, int delay, int curve, int
            startDistanceOffset, int delayOnTarget) {
        this.gfxId = gfxId;
        this.startHeight = startHeight;
        this.endHeight = endHeight;
        this.speed = speed;
        this.delay = delay;
        this.curve = curve;
        this.startDistanceOffset = startDistanceOffset;
        this.delayOnTarget = delayOnTarget;
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

    int getDelayOnTarget() {
        return delayOnTarget;
    }

    public static Projectile getDefaultRangedProjectile(int gfxId) {
        return new Projectile(gfxId, 41, 16, 25, 35, 16, 0);
    }

    public static Projectile getDefaultMagicProjectile(int gfxId) {
        return new Projectile(gfxId, 40, 40, 50, 50, 0, 0);
    }

    public static Projectile getDefaultCurvedProjectile(int gfxId) {
        return new Projectile(gfxId, 30, 18, 40, 50, 20, 1);
    }
}

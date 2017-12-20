package com.rs.game.tasks;

/**
 * Created by Peng on 28.3.2017.
 * <p>
 * A simple timer that updates ticks every time you call the update method and returns if the timer has reseted
 */
public class SimpleTimer {

    private int tick;
    private int ticks;

    /**
     * Create a new timer
     *
     * @param ticks how many update calls till reset?
     */
    public SimpleTimer(int ticks) {
        this.ticks = ticks;
    }

    /**
     * Update the timer
     *
     * @return if rolled over
     */
    public boolean update() {
        tick++;
        if (tick > ticks) {
            tick = 0;
            return true;
        }
        return false;
    }

}

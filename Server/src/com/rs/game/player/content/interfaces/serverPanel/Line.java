package com.rs.game.player.content.interfaces.serverPanel;

/**
 * Created by Peng on 15.2.2017 10:52.
 */
public class Line {

    private StringBuilder builder;
    private int value;

    public Line(StringBuilder builder, int color) {
        this.builder = builder;
        this.value = color;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public int getValue() {
        return value;
    }
}

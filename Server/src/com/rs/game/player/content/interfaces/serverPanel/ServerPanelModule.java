package com.rs.game.player.content.interfaces.serverPanel;

import com.rs.game.player.Player;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Peng on 15.2.2017 10:42.
 */
public enum ServerPanelModule {

    SLAYER_DATA_MODULE() {
        @Override
        void updateData(Player player) {
            StringBuilder points = builders.get("points");
            if (points == null) return;
            points.delete(0, points.length());
            points.append("Slayer points: ").append(player.getSlayerPoints());
        }

        @Override
        void init() {
            StringBuilder title = new StringBuilder("Slayer information:");
            StringBuilder points = new StringBuilder("Slayer points:");
            lines.add(new Line(title, 1));
            lines.add(new Line(points, 1));
            builders.put("points", points);
        }
    };

    HashMap<String, StringBuilder> builders = new HashMap<>();
    ArrayList<Line> lines = new ArrayList<>();

    ServerPanelModule() {
        init();
    }

    /**
     * @return module size in spent lines
     */
    int getSize() {
        return lines.size();
    }

    int getPrimaryColor() {
        int color = 0;
        for (int i = 0; i < 15; i++) {
            if (lines.size() > (i)) color += intColorValue(lines.get(i).getValue(), i);
        }
        return color;
    }

    int getSecundaryColor() {
        int color = 0;
        for (int i = 0; i < 15; i++) {
            if (lines.size() > (i + 16)) color += intColorValue(lines.get(i + 16).getValue(), i);
        }
        return color;
    }

    int intColorValue(int noteId, int color) {
        return (int) (Math.pow(4, noteId) * color);
    }

    Line getLine(int i) {
        return lines.get(i);
    }

    abstract void updateData(Player player);

    abstract void init();
}

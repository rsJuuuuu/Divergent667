package com.rs.game.player.content.skills.agility;

import com.rs.game.player.Player;
import com.rs.game.player.Skills;

import static com.rs.game.player.content.skills.agility.Obstacles.Obstacle.*;

/**
 * Created by Peng on 4.11.2016.
 */
public class Courses {
    private enum Course {
        GNOME_COURSE("gnome_course", 39.0, GNOME_LOG, GNOME_CLIMB_NET, GNOME_TREE_BRANCH, GNOME_ROPE,
                GNOME_TREE_DOWN, GNOME_NET, GNOME_PIPE),
        GNOME_ADVANCED("gnome_advanced", 605, GNOME_LOG, GNOME_CLIMB_NET, GNOME_TREE_BRANCH, GNOME_ADVANCED_TREE,
                GNOME_SIGN, GNOME_SWING, GNOME_DOWN_PIPE),
        BARBARIAN_COURSE("barbarian_course", 56.7, BARBARIAN_ROPE_SWING, BARBARIAN_LOG, BARBARIAN_NET,
                BARBARIAN_LEDGE, BARBARIAN_WALL, BARBARIAN_WALL),
        BARBARIAN_ADVANCED("barbarian_advanced", 615, BARBARIAN_ROPE_SWING, BARBARIAN_LOG, BARBARIAN_ADVANCED_WALL,
                BARBARIAN_ADVANCED_WALL_CLIMB, BARBARIAN_SPRING, BARBARIAN_BALANCE_BEAM, BARBARIAN_BALANCE_GAP,
                BARBARIAN_ROOF_SLIDE);

        String name;

        double xp;

        Obstacles.Obstacle[] obstacles;

        Course(String name, double xp, Obstacles.Obstacle... obstacles) {
            this.name = name;
            this.xp = xp;
            this.obstacles = obstacles;
        }

        private void reward(Player player) {
            player.getSkills().addXp(Skills.AGILITY, xp);
        }

        /**
         * Advance a stage in this course
         */
        private void advanceStage(Player player, int index) {
            if (player.getTemporaryAttributes().get(name) != null && ((int) player.getTemporaryAttributes().get(name)
                                                                      == (index - 1))) {
                if (index >= obstacles.length - 1) {
                    player.getTemporaryAttributes().remove(name);
                    reward(player);
                    return;
                }
                player.getTemporaryAttributes().put(name, index);
            } else if (index == 0 && player.getTemporaryAttributes().get(name) == null)
                player.getTemporaryAttributes().put(name, index);
        }

        /**
         * Get the index of an obstacle in this course
         */
        private int getIndex(Obstacles.Obstacle obs) {
            int index = 0;
            for (Obstacles.Obstacle obstacle : obstacles) {
                if (obstacle.ordinal() == obs.ordinal()) return index;
                index++;
            }
            return -1;
        }
    }

    /**
     * Check if we should advance a stage on a course when passing this obstacle
     */
    static void checkObstacle(Player player, Obstacles.Obstacle obstacle) {
        int index;
        for (Course course : Course.values()) {
            index = course.getIndex(obstacle);
            if (index != -1) {
                course.advanceStage(player, index);
            }
        }
    }
}

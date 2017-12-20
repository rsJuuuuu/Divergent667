package com.rs.game.player.content.skills.slayer;

import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.skills.combat.BossKillCounter;
import com.rs.utils.Utils;

import java.io.Serializable;

/**
 * SlayerTasks used for getting a random task and storing players task data
 *
 * @author Peng
 */
public class SlayerTask implements Serializable {

    private static final long serialVersionUID = -3885979679549716755L;

    public static int getSlayerRequirement(Npc n) {
        for (Task task : Task.values()) {
            if (n.getName().equalsIgnoreCase(task.getName())) {
                if (BossKillCounter.isBoss(task.getName())) return 0;
                return task.level;
            }
        }
        return 0;
    }

    public enum Task {
        CRAWLING_HAND("Crawling hand", 1, 9.4, 20, 50),

        LESSER_DEMON("Lesser demon", 1, 86.6, 20, 50),

        BLACK_DEMON("Black demon", 1, 294.4, 20, 50),

        CAVE_CRAWLER("Cave crawler", 10, 25.8, 20, 50),

        BANSHEE("Banshee", 15, 15.5, 20, 50),

        ROCKSLUG("Rockslug", 20, 27, 20, 50),

        PYREFIEND("Pyrefiend", 30, 41.4, 20, 50),

        INFERNAL_MAGE("Infernal mage", 45, 96, 20, 50),

        ABERRANT_SPECTRE("Aberrant spectre", 60, 124, 20, 50),

        BLOODVELD("Bloodveld", 50, 88.4, 20, 50),

        JELLY("Jelly", 52, 43.2, 20, 50),

        TUROTH("Turoth", 55, 47, 10, 50),

        KURASK("Kurask", 70, 115, 10, 50),

        GARGOYLE("Gargoyle", 75, 197.4, 10, 50),

        GANODERMIC("Ganodermic beast", 95, 565, 10, 100),

        NECHRYAEL("Nechryael", 80, 251.6, 10, 50),

        ABYSSAL_DEMON("Abyssal demon", 85, 277.8, 10, 100),

        MUTADED_JADINKO_MALE("Mutated jadinko male", 91, 209.6, 10, 100),

        DARK_BEAST("Dark beast", 90, 331.4, 10, 100),

        KREE_ARRA("Kree'arra", 90, 1000.0, 10, 20),

        COMMANDER_ZILYANA("Commander Zilyana", 90, 1000.0, 10, 20),

        KRIL_TSUTSAROTH("K'ril Tsutsaroth", 90, 1000.0, 10, 20),

        NEX("Nex", 90, 1000.0, 10, 20),

        KBD("King black dragon", 90, 1000.0, 10, 20),

        CORP("Corporeal beast", 90, 1000.0, 10, 20),

        QBD("Queen black dragon", 90, 1000.0, 10, 20),

        HATI("Hati", 90, 1000.0, 10, 20),

        GLACOR("Glacor", 90, 1000.0, 10, 20),

        NOMAD("Nomad", 90, 1000.0, 10, 20),

        AVATAR("Avatar of Destruction", 90, 1000.0, 10, 20),

        TD("Tormented demon", 90, 1000.0, 10, 20),

        PARTY_DEMON("Party demon", 90, 1000.0, 10, 20),

        BLINK("Blink", 90, 1000.0, 10, 20),

        KALPHITE_QUEEN("Kalphite queen", 90, 1000.0, 10, 20),

        THUNDEROUS("Yk'lagor the thunderous", 90, 1000.0, 10, 20),

        GENERAL_GRAARDOR("General Graardor", 90, 1000.0, 10, 20),

        YOUNG_GROTWORM("Young Grotworm", 1, 11.4, 20, 50),

        GROTWORM("Grotworm", 35, 102.8, 20, 50),

        BLUE_DRAGON("Blue dragon", 1, 93.8, 20, 50),

        HELLHOUND("Hellhound", 1, 93.6, 20, 50),

        GREATER_DEMON("Greater demon", 1, 135.4, 20, 50),

        MATURE_GROTWORM("Mature Grotworm", 50, 343.5, 20, 50),

        WATERFIEND("Waterfiend", 50, 335, 10, 50),

        MITHRIL_DRAGON("Mithril Dragon", 50, 564.4, 10, 60),

        BRUTAL_GREEN_DRAGON("Brutal Green Dragon", 50, 440, 20, 50),

        IRON_DRAGON("Iron Dragon", 50, 245, 20, 50),

        STEEL_DRAGON("Steel Dragon", 50, 350, 20, 50),

        RED_DRAGON("Red Dragon", 75, 220.8, 20, 50),

        YAK("Yak", 1, 70, 20, 50),

        FIRE_GIANT("Fire Giant", 30, 161.2, 20, 50),

        BRONZE_DRAGON("Bronze Dragon", 50, 124.5, 20, 50),

        AQUANITE("Aquanite", 78, 103.6, 20, 50),

        SKELETON("Skeleton", 1, 9, 20, 50),

        GHOST("Ghost", 1, 8, 20, 50),

        CHAOS_DWARF("Chaos Dwarf", 20, 21, 20, 50),

        COCKATRICE("Cockatrice", 35, 23.5, 10, 50),

        LIVING_ROCK_STRIKER("Living Rock Striker", 80, 200, 15, 40),

        LIVING_ROCK_PROTECTOR("Living Rock Protector", 70, 150, 15, 40);

        String name;
        int level, minAmount, maxAmount;
        double xp;

        /**
         * @param name      monster name displayed when getting the task or checking
         *                  with gem
         * @param level     level required for getting the monster as a task
         * @param xp        exp given for killing the monster on task (multiplied
         *                  after so use runewiki exp)
         * @param minAmount lowest amount of monsters to get as a task
         * @param maxAmount highest ^
         */
        Task(String name, int level, double xp, int minAmount, int maxAmount) {
            this.name = name;
            this.level = level;
            this.minAmount = minAmount;
            this.maxAmount = maxAmount;
            this.xp = xp;
        }

        double getXp() {
            return this.xp;
        }

        int getLevel() {
            return this.level;
        }

        String getName() {
            return this.name;
        }
    }

    public enum monsterSet {
        Beginner(1, new Task[]{Task.CRAWLING_HAND, Task.PYREFIEND, Task.BANSHEE, Task.CAVE_CRAWLER, Task.ROCKSLUG,
                Task.YAK, Task.SKELETON, Task.GHOST, Task.YOUNG_GROTWORM,}),

        Easy(35, new Task[]{Task.LESSER_DEMON, Task.INFERNAL_MAGE, Task.CAVE_CRAWLER, Task.PYREFIEND, Task.BANSHEE,
                Task.CHAOS_DWARF, Task.GROTWORM, Task.FIRE_GIANT, Task.COCKATRICE}),

        Medium(50, new Task[]{Task.HELLHOUND, Task.JELLY, Task.BLOODVELD, Task.ABERRANT_SPECTRE, Task.KURASK, Task
                .TUROTH, Task.BLUE_DRAGON, Task.GREATER_DEMON, Task.ABERRANT_SPECTRE, Task.WATERFIEND, Task
                .BRONZE_DRAGON, Task.BLUE_DRAGON, Task.LIVING_ROCK_PROTECTOR}),

        Hard(75, new Task[]{Task.GARGOYLE, Task.NECHRYAEL, Task.ABYSSAL_DEMON, Task.STEEL_DRAGON, Task.IRON_DRAGON,
                Task.BRUTAL_GREEN_DRAGON, Task.MITHRIL_DRAGON, Task.BLACK_DEMON, Task.GREATER_DEMON, Task.HELLHOUND,
                Task.RED_DRAGON, Task.AQUANITE, Task.LIVING_ROCK_STRIKER}),

        Expert(90, new Task[]{Task.DARK_BEAST, Task.GANODERMIC, Task.ABYSSAL_DEMON, Task.BLACK_DEMON, Task.NECHRYAEL,
                Task.NEX, Task.GENERAL_GRAARDOR, Task.KREE_ARRA, Task.COMMANDER_ZILYANA, Task.KRIL_TSUTSAROTH, Task
                .KBD, Task.CORP, Task.QBD, Task.HATI, Task.GLACOR, Task.NOMAD, Task.AVATAR, Task.TD, Task
                .PARTY_DEMON, Task.BLINK, Task.KALPHITE_QUEEN, Task.THUNDEROUS, Task.MUTADED_JADINKO_MALE});

        int level;
        Task[] tasks;

        private monsterSet(int level, Task[] tasks) {
            this.level = level;
            this.tasks = tasks;
        }

        Task[] getTasks() {
            return this.tasks;
        }
    }

    Task task;
    int amountKilled;
    int taskAmount;

    private SlayerTask(Task task) {
        this.task = task;
        amountKilled = 0;
        taskAmount = Utils.random(task.minAmount, task.maxAmount);
    }

    public static void setTask(Player player) {
        player.setTask(getTask(player));
    }

    private static SlayerTask getTask(Player player) {
        int level = player.getSkills().getLevel(Skills.SLAYER);
        Task task;
        if (level >= 90) {
            while (true) {
                task = monsterSet.Expert.getTasks()[Utils.random(monsterSet.Expert.getTasks().length - 1)];
                if (BossKillCounter.isBoss(task.getName().toLowerCase()) && !player.isAllowBossTasks()) continue;
                if (level >= task.getLevel()) {
                    return new SlayerTask(task);
                }
            }
        } else if (level >= 75) {
            while (true) {
                task = monsterSet.Hard.getTasks()[Utils.random(monsterSet.Hard.getTasks().length - 1)];
                if (level >= task.getLevel()) {
                    return new SlayerTask(task);
                }
            }
        } else if (level >= 50) {
            while (true) {
                task = monsterSet.Medium.getTasks()[Utils.random(monsterSet.Medium.getTasks().length - 1)];
                if (level >= task.getLevel()) {
                    return new SlayerTask(task);
                }
            }
        } else if (level >= 35) {
            while (true) {
                task = monsterSet.Easy.getTasks()[Utils.random(monsterSet.Easy.getTasks().length - 1)];
                if (level >= task.getLevel()) {
                    return new SlayerTask(task);
                }
            }
        } else {
            while (true) {
                task = monsterSet.Beginner.getTasks()[Utils.random(monsterSet.Beginner.getTasks().length - 1)];
                if (level >= task.getLevel()) {
                    return new SlayerTask(task);
                }
            }
        }

    }

    public double getXPAmount() {
        return task.getXp();
    }

    public int getTaskAmount() {
        return taskAmount;
    }

    public void decreaseAmount() {
        taskAmount--;
    }

    public int getAmountKilled() {
        return amountKilled;
    }

    public void setAmountKilled(int amountKilled) {
        this.amountKilled = amountKilled;
    }

    public String getName() {
        return task.getName();
    }

    public double getDifficulty(Player player) {
        int level = player.getSkills().getLevel(Skills.SLAYER);
        if (level >= 90) {
            return 4;
        } else if (level >= 75) {
            return 3;
        } else if (level >= 50) {
            return 2;
        } else if (level >= 35) {
            return 1;
        } else return 0;
    }

}
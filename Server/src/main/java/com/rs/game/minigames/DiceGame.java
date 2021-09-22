package com.rs.game.minigames;

import com.rs.game.world.ForceTalk;
import com.rs.game.player.Player;

import java.util.Random;

/**
 *
 * @author someone from runelocus
 * @created April, 06, 2012
 */
public class DiceGame {

    public static void rollDice1(Player player) {
    if (!player.getInventory().containsOneItem(15100)){
            return;
        }
        int LOWEST = 1;
        int HIGHEST = 4;
        Random r = new Random();
        generateRolledNumber(LOWEST, HIGHEST, r, player);
    }
    public static void rollDice2(Player player) {
    if (!player.getInventory().containsOneItem(15086)){
            return;
        }
        int LOWEST = 1;
        int HIGHEST = 6;
        Random r = new Random();
        generateRolledNumber(LOWEST, HIGHEST, r, player);
    }
    public static void rollDice3(Player player) {
    if (!player.getInventory().containsOneItem(15088)){
            return;
        }
        int LOWEST = 1;
        int HIGHEST = 12;
        Random r = new Random();
        generateRolledNumber(LOWEST, HIGHEST, r, player);
    }
    public static void rollDice4(Player player) {
    if (!player.getInventory().containsOneItem(15090)){
            return;
        }
        int LOWEST = 1;
        int HIGHEST = 8;
        Random r = new Random();
        generateRolledNumber(LOWEST, HIGHEST, r, player);
    }
    public static void rollDice5(Player player) {
    if (!player.getInventory().containsOneItem(15092)){
            return;
        }
        int LOWEST = 1;
        int HIGHEST = 10;
        Random r = new Random();
        generateRolledNumber(LOWEST, HIGHEST, r, player);
    }
    public static void rollDice6(Player player) {
    if (!player.getInventory().containsOneItem(15094)){
            return;
        }
        int LOWEST = 1;
        int HIGHEST = 12;
        Random r = new Random();
        generateRolledNumber(LOWEST, HIGHEST, r, player);
    }
    public static void rollDice7(Player player) {
    if (!player.getInventory().containsOneItem(15096)){
            return;
        }
        int LOWEST = 1;
        int HIGHEST = 20;
        Random r = new Random();
        generateRolledNumber(LOWEST, HIGHEST, r, player);
    }
    public static void rollDice8(Player player) {
    if (!player.getInventory().containsOneItem(15098)){
            return;
        }        
        int LOWEST = 1;
        int HIGHEST = 100;
        
        Random r = new Random();
        generateRolledNumber(LOWEST, HIGHEST, r, player);
    }

    private static void generateRolledNumber(int lowest, int highest, Random r, Player player) {
        if (lowest > highest) {
            return;
        }
        long range = (long) highest - (long) lowest + 1;
        long fraction = (long) (range * r.nextDouble());
        int numberRolled = (int) (fraction + lowest);
        sendNumber(player, numberRolled);

    }

    private static void sendNumber(Player player, int numberRolled) {
                        player.getPackets().sendGameMessage(
                        "Rolling...");//can be deleted if you want
        player.setNextForceTalk(new ForceTalk(
                                "rolled <col=FF0000>" + numberRolled + "</col> " + "on the percentile dice"));
                        player.getPackets().sendGameMessage(
                        "rolled <col=FF0000>" + numberRolled + "</col> " + "on the percentile dice");//correct message when number is rolled
    }
}
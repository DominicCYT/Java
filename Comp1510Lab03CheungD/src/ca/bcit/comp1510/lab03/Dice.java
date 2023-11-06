package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Dungeon and Dragons Dice.
 *
 * @author Dominic Cheung
 * @version 1.0
 */

public class Dice {

    /**
     * Constants for 4sided die.
     */
    static final int FOURMAX = 4;
    
    /**
     * Constants for 6sided die.
     */
    static final int SIXMAX = 6;
    
    /**
     * Constants for 8sided die.
     */
    static final int EIGHTMAX = 8;
    
    /**
     * Constants for 10sided die.
     */
    static final int TENMAX = 10;
    
    /**
     * Constants for 12sided die.
     */
    static final int TWELVEMAX = 12;
    
    /**
     * Constants for 20sided die.
     */
    static final int TWENTYMAX = 20;

    /**
     * Drives the program.
     *
     * @param args unused
     */

    public static void main(String[] args) {

        // 4 sided
        Random dice4 = new Random();
        int fourSided = dice4.nextInt(FOURMAX) + 1;
        System.out.println("4-sided dice roll: " + (fourSided));

        // 6 sided
        Random dice6 = new Random();
        int sixSided = dice6.nextInt(SIXMAX) + 1;
        System.out.println("6-sided dice roll: " + (sixSided));

        // 8 sided
        Random dice8 = new Random();
        int eightSided = dice8.nextInt(EIGHTMAX) + 1;
        System.out.println("8-sided dice roll: " + (eightSided));

        // 10 sided
        Random dice10 = new Random();
        int tenSided = dice10.nextInt(TENMAX) + 1; 
        System.out.println("10-sided dice roll: " + (tenSided));

        // 12 sided
        Random dice12 = new Random();
        int twelveSided = dice12.nextInt(TWELVEMAX) + 1;
        System.out.println("12-sided dice roll: " + (twelveSided));

        // 20 sided
        Random dice20 = new Random();
        int twentySided = dice20.nextInt(TWENTYMAX) + 1;
        System.out.println("20-sided dice roll: " + (twentySided));

        //total roll 
        int totalRoll = fourSided + sixSided + eightSided + tenSided 
                + twelveSided + twentySided;
        
        System.out.println("Total: " + totalRoll);
    }

}

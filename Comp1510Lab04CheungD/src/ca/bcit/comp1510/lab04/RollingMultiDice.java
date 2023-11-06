package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Demonstrates the creation and use of a user-defined class.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Dominic Cheung, Set C
 * @version 1
 */
public class RollingMultiDice {
    /**
     * Driver program creates two MultiDie objects and rolls them.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        
        // create scanner to get user input on number of sides for the two die
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of sides for Die A: ");
        int sidesA = scan.nextInt();
        System.out.println("Please enter number of sides for Die B: ");
        int sidesB = scan.nextInt();
        
        // create two die objects and the int to sum later
        MultiDie dieA = new MultiDie(sidesA);
        MultiDie dieB = new MultiDie(sidesB);
        int sum;

        /*use multi die constructor. Since we are using user input 
         * as a parameter for max, we do not need getters and setters here.
         * */

        dieA.roll();
        dieB.roll();
        
        System.out.println("Die A: " + dieA + ", Die B: " + dieB);
        
        // can use getters now to do the sum.
        sum = dieA.getFaceValue() + dieB.getFaceValue();
        
        System.out.println("Roll 1 Total: " + sum);
        
        // second sum for next roll. Does not need getters here since rolling
        sum = dieA.roll() + dieB.roll();
        System.out.println("Die A: " + dieA + ", Die B: " + dieB);
        System.out.println("Roll 2 Total: " + sum);
              
        
        // if playing a game where rules dictate a fixed value, use setters
        System.out.println("Set value for Dice A: ");
        int setA = scan.nextInt();
        dieA.setFaceValue(setA);
        //roll just die 2. Must use getters here since we need the new value
        sum = dieA.getFaceValue() + dieB.roll();
        System.out.println("Die A: " + dieA + ", Die B: " + dieB);
        System.out.println("Roll 3 Total: " + sum);
        
        // swapping Dice A and B for set value
        System.out.println("Set value for Dice B: ");
        int setB = scan.nextInt();
        dieB.setFaceValue(setB);
        //roll just die 1. Must use getters here since we need the new value
        sum = dieB.getFaceValue() + dieA.roll();
        System.out.println("Die A: " + dieA + ", Die B: " + dieB);
        System.out.println("Roll 4 Total: " + sum);
        
        
        /*
        
        //using getter for max for cases where max is set to a previous roll
        System.out.println("Roll to create max sides for following roll:");
        dieA.roll();
        dieB.roll();
        System.out.println("Die A: " + dieA + ", Die B: " + dieB);
        sum = dieA.getFaceValue() + dieB.getFaceValue();
        System.out.println("Roll 5 Total: " + sum);
        
        //need new objects
        MultiDie dieC = new MultiDie(dieA.getFaceValue());
        MultiDie dieD = new MultiDie(dieB.getFaceValue());
        System.out.println("Die C max sides set to previous Die A roll");
        System.out.println("Die D max sides set to previous Die B roll");
        System.out.println("Die C: " + dieC + ", Die D: " + dieD);
        sum = dieC.getFaceValue() + dieD.getFaceValue();
        System.out.println("Roll 6 Total: " + sum);
        
        */
        
        scan.close();
    }
}


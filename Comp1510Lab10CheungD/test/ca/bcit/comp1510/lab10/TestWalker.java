package ca.bcit.comp1510.lab10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Test for RandomWalker.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */

public class TestWalker {
    
    /**
     * Creates two robo walkers.
     * @param args unused
     */
    public static void main(String[] args) {
        
        final int robo1MaxSteps = 10;
        final int robo1Boundary = 5;
        RandomWalker robo1 = new RandomWalker(robo1MaxSteps, robo1Boundary);

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter max steps: ");
            int robo2MaxSteps = scan.nextInt();
            System.out.println("Please enter boundary: ");
            int robo2Boundary = scan.nextInt();
            System.out.println("Please enter x-coordinate: ");
            int robo2X = scan.nextInt();
            System.out.println("Please enter y-coordinate: ");
            int robo2Y = scan.nextInt();
            
            RandomWalker robo2 = new RandomWalker(robo2MaxSteps, robo2X, 
                    robo2Y, robo2Boundary);

            System.out.println("Robo 1: " + robo1.toString() 
                + "\nRobo 2: " + robo2.toString());
    
            // takes 5 steps each
            final int totalSteps = 5;
            
            for (int i = 0; i < totalSteps; i++) {
                robo1.takeStep();
                robo2.takeStep();
                //System.out.println("Step " + (i + 1));
                System.out.println("Robo 1: " + robo1.toString());
                System.out.println("Robo 2: " + robo2.toString());
            }
    
            // new robo with 200 steps and boundary 10
            final int robo3Boundary = 10;
            final int robo3MaxSteps = 200;
            RandomWalker robo3 = new RandomWalker(robo3MaxSteps, robo3Boundary);
            System.out.println("Robo 3 Before walking: " + robo3.toString());
    
            robo3.walk();
    
            System.out.println("Robo 3 After walking: " + robo3.toString());
            System.out.println("Robo 3 Maximum Distance: " 
                    + robo3.getMaxDistance());
            
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input. Please enter valid integer.");
        }
        scan.close();
    }
}

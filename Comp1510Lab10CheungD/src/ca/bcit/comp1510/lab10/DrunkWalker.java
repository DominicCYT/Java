package ca.bcit.comp1510.lab10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program that simulates drunk walkers.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class DrunkWalker {
    
    /**
     * Ask user for inputs.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter the boundary size for the platform: ");
            int boundary = scan.nextInt();

            System.out.print("Enter the number of steps for each drunk: ");
            int steps = scan.nextInt();

            System.out.print("Enter the number of drunks to simulate: ");
            int sims = scan.nextInt();
            if (sims <= 0) {
                scan.close();
                throw new IllegalArgumentException("Must be greater than 0");
            }


            int falls = 0;

            for (int i = 1; i <= sims; i++) {
                RandomWalker drunkWalker = new RandomWalker(steps, boundary);
                drunkWalker.walk();

                if (!drunkWalker.inBounds()) {
                    falls++;
                }
            }

            System.out.println("Total number of simulations: " + sims);
            System.out.println("Number of falls: " + falls);
            
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input. Please enter valid integer.");
        }

        scan.close();
    }
}

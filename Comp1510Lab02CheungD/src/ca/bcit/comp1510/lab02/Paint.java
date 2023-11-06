package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Calculates the required amount of paint.
 * 
 * @author Dominic Cheung
 * @version 1.0
 */

public class Paint {
    
    /**
     * Constant 4L can of paint can cover 400sq ft.
     */
    static final int COVERAGE = 400;
    
    /**
     * Drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        //Setting up scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Prompt user for room length in ft
        System.out.println("Please enter the room length in feet (e.g. 23.1):");
        //Initialize an int to save user input
        double length = myScanner.nextDouble();
        
        //Prompt user for room length in ft
        System.out.println("Please enter the room width in feet (e.g. 23.1):");
        //Initialize an int to save user input
        double width = myScanner.nextDouble();
        
        //Prompt user for room length in ft
        System.out.println("Please enter the room height in feet (e.g. 23.1):");
        //Initialize an int to save user input
        double height = myScanner.nextDouble();
        
        //Prompt user for number of coats
        System.out.println("Please enter the number of coats (e.g. 2):");
        
        //Initialize an int to save user input
        double coats = myScanner.nextDouble();
        
        //Initialize int for surface area of 4 sides and top
        double surfaceArea = (2 * length * height) + (2 * height * width) 
                + (width * length);
        //surfaceArea * coats to determine coverageNeeded
        double coverageNeeded = surfaceArea * coats;
        //divide coverageNeeded by COVERAGE to get cansOfPaintNeeded
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;
        
        //Tell user how many cans of paint needed
        System.out.println("You need to buy: " + cansOfPaintNeeded 
                + " cans of paint");
        
        
        myScanner.close();
        
    }

}

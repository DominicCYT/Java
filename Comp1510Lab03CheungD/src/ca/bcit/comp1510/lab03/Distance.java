package ca.bcit.comp1510.lab03;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate distance given two coordinates.
 *
 * @author Dominic Cheung
 * @version 1.0
 */

public class Distance {

    /**
     * Drives the program.
     *
     * @param args unused
     */

    public static void main(String[] args) {
        // Ask user for x-y coordinates
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide X and Y coordinate for Point A: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.println("Provide X and Y coordinate for Point B: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        // calculate distance
        double result = Math.sqrt((Math.pow((x2 - x1), 2)) 
                + (Math.pow((y2 - y1), 2)));

        System.out.println("Result: " + (result));
        
        //create new object with DecimalFormat class to limit 2dp
        DecimalFormat resultf = new DecimalFormat("#.##");
        System.out.println("To two decimal places: " 
                + (resultf.format(result)));

        scan.close();
    }

}

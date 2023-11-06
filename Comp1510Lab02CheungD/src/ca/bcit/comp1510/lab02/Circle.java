package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Circle area and circumference calculator. User inputs the radius.
 * 
 * @author Dominic Cheung
 * @version 1.0
 */
public class Circle {
    
    /**
     * Constant for Pi.
     */
    static final double PI = 3.14159;
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        //Setting up scanner
        Scanner myScanner = new Scanner(System.in);
        //Prompt user for a radius value
        System.out.println("Please enter a radius value (e.g. 2.5):");
        
        //Initialize a double to save user input and its double
        double radius = myScanner.nextDouble();
        double radiusx2 = radius * 2;
        //Initialize double for the circumference and area
        double area;
        double area2;
        double circum;
        double circum2;
        
        //Calculate circumference of circle with the user input
        circum = PI * 2 * radius;
        //Calculate area of circle with the user input
        area = PI * radius * radius;
        //Print result
        System.out.println("The circumference of a circle given the radius is: "
                + circum + "\nThe area of a circle given the radius is: "
                + area);
        
        //Calculate circumference of circle if radius doubled
        circum2 = PI * 2 * radiusx2;
        //Calculate area of circle if radius doubled
        area2 = PI * radiusx2 * radiusx2;        
        //Print result
        System.out.println("\n" + "The circumference if radius is doubled: "
                + circum2 + "\nThe area if radius is doubled: "
                + area2);
        
        //calculate the multiple between the circumferences and areas if doubled
        double circummult;
        double areamult;
        
        circummult = circum2 / circum;
        areamult = area2 / area;
        
        //Print the multiple result
        System.out.println("\n" + "The circumference when radius is doubled: " 
                + circummult + " times larger"
                + "\nThe area when radius is doubled: "
                + areamult + " times larger");
        
        myScanner.close();
    }

}

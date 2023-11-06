package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Program that Integer Wraps.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */

public class IntegerWrapper {

    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */

    public static void main(String[] args) {
        // Create scanner to get input from user
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a decimal integer to convert: ");
        int input = scan.nextInt();
       
        //give output converted to binary octal and hex
        System.out.println("The decimal integer " + (input) + " converted to: " 
                + "\nBinary: " + (Integer.toBinaryString(input))
                + "\nOctal: " + (Integer.toOctalString(input))
                + "\nHex: " + (Integer.toHexString(input)));
        
        
        //print the min and max java integer with the integer class constants
        System.out.println("The minimum Java integer value is: " 
                + (Integer.MIN_VALUE) 
                + "\nThe maximum Java integer value is: "
                + (Integer.MAX_VALUE));
        
        //getting two numbers with next to convert strings to int
        System.out.println("1) Please enter a new integer: ");
        String n1 = scan.next();
        System.out.println("2) Please enter another integer: ");
        String n2 = scan.next();
        
        System.out.println("The sum of the above two integers is: " 
                + ((Integer.parseInt(n1)) + (Integer.parseInt(n2))));
        
        
        scan.close();
    }

}

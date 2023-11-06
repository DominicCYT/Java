package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Program that gives you a factorial.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Factorial {

    /**
     * Creates a factorial until user stops.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a non-negative integer (0 to quit): ");
        while (scan.hasNext()) {

            if (scan.hasNextInt()) {
                int input = scan.nextInt();
                final int limit = 13;
                if ((input > 0) && (input < limit)) {

                    int factorial = 1;
                    int i = 1;

                    while (i <= input) {
                        factorial = factorial * i;
                        i++;
                    }
                    System.out.println("The factorial of " 
                            + input + " is: " + factorial);
                    System.out.println("Please input a non-negative integer " 
                            + "(0 to quit): ");

                } else if (input >= limit) {
                    System.out.println(
                            "Max limit is: " + (limit) + " Please input a "
                            + "non-negative integer " + "(0 to quit): ");

                } else if (input == 0) {
                    scan.close();
                    return;

                } else if (input < 0) {
                    System.out.println("Non-negative number is required. " 
                            + "Please input a non-negative integer "
                            + "(0 to quit): ");
                }
            } else {
                System.out.println("Non-numbers not allowed. " 
                        + "Please input a non-negative integer (0 to quit): ");
                scan.next();
            }

        }
        scan.close();

    }

}

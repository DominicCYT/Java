package q2;

import java.util.Scanner;

/**
 * Gets double value from user and calculates an approximation to the square
 * root.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Sqrt {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // Create scanner and get input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculates the next 10 square root approximation "
                + "estimates using Newton's algorithm. "
                + "\nPlease enter value greater than or equal to 1: ");
        double a = scan.nextDouble();

        System.out.println("Next 10 estimates:");

        // next 10 estimates calculated using Newton's algorithm
        double s = (a + 1) / 2;
        System.out.println(s);
        s = (s + (a / s)) / 2;
        System.out.println(s);
        s = (s + (a / s)) / 2;
        System.out.println(s);
        s = (s + (a / s)) / 2;
        System.out.println(s);
        s = (s + (a / s)) / 2;
        System.out.println(s);
        s = (s + (a / s)) / 2;
        System.out.println(s);
        s = (s + (a / s)) / 2;
        System.out.println(s);
        s = (s + (a / s)) / 2;
        System.out.println(s);
        s = (s + (a / s)) / 2;
        System.out.println(s);
        s = (s + (a / s)) / 2;
        System.out.println(s);

        scan.close();
    }

}

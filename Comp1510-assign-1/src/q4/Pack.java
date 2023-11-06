package q4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Encodes 5-MIX character strings into a single int variable and decodes an int
 * value back into MIX-characters.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Pack {

    /**
     * constant for base56.
     *
     */

    static final double B56 = 56;

    /**
     * constant for 1st digit in base56.
     *
     */

    static final double P1 = Math.pow(56, 4);

    /**
     * constant for 2nd digit in base56.
     *
     */

    static final double P2 = Math.pow(56, 3);

    /**
     * constant for 3rd digit in base56.
     *
     */

    static final double P3 = Math.pow(56, 2);

    /**
     * constant for 4th digit in base56.
     *
     */

    static final double P4 = Math.pow(56, 1);

    /**
     * constant for 5th digit in base56.
     *
     */

    static final double P5 = Math.pow(56, 0);

    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // create scanner to get user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 alphabet characters between" 
                + " A to I (inclusive):");
        String input = scan.nextLine();

        // trim and toUpper
        input = input.toUpperCase().trim();

        final char c1 = input.charAt(0);
        final char c2 = input.charAt(1);
        final char c3 = input.charAt(2);
        final char c4 = input.charAt(3);
        final char c5 = input.charAt(4);

        System.out.println("Your input is: " + (c1) + (c2) + (c3) 
                + (c4) + (c5));

        // convert each character to its numeric value
        int n1 = c1 - 'A' + 1;
        int n2 = c2 - 'A' + 1;
        int n3 = c3 - 'A' + 1;
        int n4 = c4 - 'A' + 1;
        int n5 = c5 - 'A' + 1;

        //System.out.println("n: " + (n1) + (n2) + (n3) + (n4) + (n5));

        // convert base56 to decimal equivalent (d)
        double d1 = n1 * P1;
        double d2 = n2 * P2;
        double d3 = n3 * P3;
        double d4 = n4 * P4;
        double d5 = n5 * P5;

        double total = d1 + d2 + d3 + d4 + d5;
        //System.out.println("t:" + (total));

        // format total
        DecimalFormat df = new DecimalFormat("#");
        String encoded = df.format(total);
        System.out.println("Encoded: " + (encoded));

        // convert decimal to base56 by finding quotient (q) and remainder (r)
        double q1 = total / B56;
        double r1 = total % B56;
        // System.out.println(q1);
        // System.out.println(r1);

        double q2 = q1 / B56;
        double r2 = q1 % B56;
        // System.out.println(q2);
        // System.out.println(r2);

        double q3 = q2 / B56;
        double r3 = q2 % B56;
        // System.out.println(q3);
        // System.out.println(r3);

        double q4 = q3 / B56;
        double r4 = q3 % B56;
        // System.out.println(q4);
        // System.out.println(r4);

        // double q5 = q4 / B56;
        double r5 = q4 % B56;
        // System.out.println(q5);
        // System.out.println(r5);
        
        //System.out.println("r:" + "\n" + (r5) + "\n" + (r4) 
        //        + "\n" + (r3) + "\n" + (r2) + "\n" + (r1));

        // print char final in correct order
        char cf1 = (char) (r5 - 1 + 'A');
        char cf2 = (char) (r4 - 1 + 'A');
        char cf3 = (char) (r3 - 1 + 'A');
        char cf4 = (char) (r2 - 1 + 'A');
        char cf5 = (char) (r1 - 1 + 'A');
        
        System.out.println("Decoded: " + (cf1) + (cf2) + (cf3) + (cf4) + (cf5));
        
                 
        scan.close();
    }

}

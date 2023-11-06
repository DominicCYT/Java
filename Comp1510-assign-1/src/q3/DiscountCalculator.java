package q3;

import java.util.Scanner;

/**
 * Discount calculator for cheese club's best customers.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class DiscountCalculator {
    
    /**
     * set up max discount.
     */
    static final int MAX_DISCOUNT = 75;
    
    /**
     * percent to decimal factor.
     */
    static final int HUNDRED = 100;

    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */

    public static void main(String[] args) {
        // Create scanner and get input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of cheeses purchased: ");
        int cheese = scan.nextInt();
        System.out.println("Please enter number of new customers referred: ");
        int refer = scan.nextInt();
        
        //Show the discount
        int totalDiscount = Math.min(MAX_DISCOUNT, (cheese + refer));
        System.out.println("Your discount is: " + (totalDiscount) + "%");
        float fpDiscount = (float) totalDiscount / HUNDRED;
        System.out.println("In floating point: " + (fpDiscount));
        
        
        scan.close();
        

    }

}

package q1;

import java.util.Scanner;

/**
 * Program that returns the fewest number of each bill and coin needed for a
 * given monetary amount.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Change {

    /**
     * set up $10 in pennies.
     */
    static final int TENS = 1000;

    /**
     * set up $5 in pennies.
     */

    static final int FIVES = 500;
    
    /**
     * set up $2 in pennies.
     */

    static final int TOONIES = 200;
    
    /**
     * set up $1 in pennies.
     */

    static final int LOONIES = 100;
    
    /**
     * set up quarters in pennies.
     */

    static final int QUARTERS = 25;
    
    /**
     * set up dimes in pennies.
     */

    static final int DIMES = 10;
    
    /**
     * set up nickels in pennies.
     */

    static final int NICKELS = 5;
    
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */

    public static void main(String[] args) {
        // Create scanner and get input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter monetary amount: ");
        double dollar = scan.nextDouble();
        System.out.println("For $" + (dollar) + ", you would need:");
        
        //working in pennies
        dollar = Math.round(dollar * LOONIES);
               
        //calculate amount of $10 needed
        int tens = (int) dollar / TENS;
        System.out.println((tens) + " ten dollar bills");
        //removed the number of tens from dollar
        dollar = dollar - (tens * TENS);
        //System.out.println(dollar);
        
        //calculate amount of $5 needed
        int fives = (int) dollar / FIVES;
        System.out.println((fives) + " five dollar bills");
        //removed the number of fives from dollar
        dollar = dollar - (fives * FIVES);
        //System.out.println(dollar);
        
        //calculate amount of $2 needed
        int twos = (int) dollar / TOONIES;
        System.out.println((twos) + " toonies");
        //removed the number of fives from dollar
        dollar = dollar - (twos * TOONIES);
        //System.out.println(dollar);
        
        //calculate amount of $1 needed
        int ones = (int) dollar / LOONIES;
        System.out.println((ones) + " loonies");
        //removed the number of fives from dollar
        dollar = dollar - (ones * LOONIES);
        //System.out.println(dollar);
        
        //calculate amount of quarters needed
        int quarters = (int) dollar / QUARTERS;
        System.out.println((quarters) + " quarters");
        //removed the number of fives from dollar
        dollar = dollar - (quarters * QUARTERS);
        //System.out.println(dollar);
        
        //calculate amount of dimes needed
        int dimes = (int) dollar / DIMES;
        System.out.println((dimes) + " dimes");
        //removed the number of fives from dollar
        dollar = dollar - (dimes * DIMES);
        //System.out.println(dollar);
        
        //calculate amount of nickels needed
        int nickels = (int) dollar / NICKELS;
        System.out.println((nickels) + " nickels");
        //removed the number of fives from dollar
        dollar = dollar - (nickels * NICKELS);
        //System.out.println(dollar);
        
        //remaining are pennies
        int pennies = (int) dollar;
        System.out.println((pennies) + " pennies");
        
        
        scan.close();
    }

}

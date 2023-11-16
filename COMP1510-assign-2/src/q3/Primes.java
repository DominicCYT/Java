package q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>Prints a list of prime numbers and the number of prime numbers
 * given an upper bound using the Sieve of Eratosthenes.</p>
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Primes {
    
    /**
     * private instance variable for array list.
     */
    private List<Boolean> primes;
    
    
    /**
     * Makes new array list for primes.
     * @param n an int
     */
    public Primes(int n) {
        if (n > 1) {
            primes = new ArrayList<Boolean>(n);
            for (int i = 0; i < n; i++) {
                primes.add(true);
            }
            //check array size is as expected
            //System.out.println(primes.size());

            calculatePrimes(n);
        } else {
            // in case you are running j unit and not using main
            throw new IllegalArgumentException("Input must be bigger than 1.");
        }

    }
    
    /** Determine the primes up to sqrt(n). This is enough because after
     * you reach sqrt(n) you would have found the largest multiple already. 
     * Going beyond is not meaningful since you 
     * will only find lower multiples.
     * @param n an int
    */
    private void calculatePrimes(int n) {
        
        //special cases of primes, manually set
        primes.set(0, false);
        primes.set(1, false);
        
        // starts at index 2 since 0 and 1 are special case
        for (int i = 2; i < Math.sqrt(n); i++) {
            
            /* Skip over the index, only its multiples so not itself. 
             * Multiples are basically just a lot of repeated additions of
             * itself. 
            */
            
            for (int j = i + i; j < n; j += i) {
                primes.set(j, false);
            }
        }
        
    }
    
    /**
     * Prints the prime numbers given the user input.
     */
    
    private void printPrimes() {
        
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
        } System.out.println();
        
    }
    
    /**
     * method to count the number of primes given the user input.
     * @return count an int
     */
    
    private int countPrimes() {
        
        int count = 0;
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Method to check whether an int is prime or not.
     * @param x an int
     * @return true if x is prime and false if x is not prime.
     */
    
    private boolean isPrime(int x) {
        
        // must be less than array size or will get error
        if (x >= 0 && x < primes.size()) {
            return primes.get(x);    
        } else {
            // since this method is not required to be called, made a throw
            throw new IllegalArgumentException("Input must be bigger than 0 "
                    + "or less than " + primes.size());
        }
    }
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.
     * Asks users for the input. Validation loop will handle special cases
     * and for 2 since there is just one prime (itself).</p>
     *
     * @param args command line arguments unused.
     */
    public static void main(String[] args) {
        
        System.out.println("This program uses the sieve of Eratosthenes "
                + "to determine which numbers are prime. "
                + "\nEnter an upper bound:");
        
        Scanner scan = new Scanner(System.in);

        // validation loop
        while (scan.hasNext()) {
            // make sure user inputs an int
            if (scan.hasNextInt()) {
                
                int input = scan.nextInt();
                
                // 0 and 1 are special cases handled below
                if (input > 2) {
                    Primes primes = new Primes(input);
                    
                    /* called method to avoid checkstyle error
                    even though not printed. Must be 1 smaller to account for 
                    array range*/
                    primes.isPrime(input - 1);
                    
                    System.out.println("There are " + primes.countPrimes() 
                        + " primes.");
                    System.out.println("The prime numbers between 0 and " 
                        + input + " are:");
                    primes.printPrimes();
                    scan.close();
                    return;
                  
                // handle if user gave negative int 
                } else if (input < 0) {
                    System.out.println("Non-negative number is required. " 
                            + "Please input a non-negative integer: ");
                
                // handle special case for 1
                } else if (input == 1) {
                    System.out.println("1 is not prime.");
                    scan.close();
                    return;
                    
                // handle special case for 0
                } else if (input == 0) {
                    System.out.println("0 is not prime.");
                    scan.close();
                    return;
                    
                // if user gave 2, there is just itself that's prime
                } else if (input == 2) {
                    System.out.println("2 is the only prime.");
                    scan.close();
                    return;
                }
                
            // if not an int, warn and ask for a number again    
            } else {
                System.out.println("Non-numbers not allowed. " 
                        + "Please input a non-negative integer: ");
                scan.next();
            }
        }                
        scan.close();
    }
}

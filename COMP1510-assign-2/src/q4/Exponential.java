package q4;

/**
 * <p> A main method that evaluates and prints a table of 21
exponentials for x = -10.0 to 10.0 with one value per row, showing x 
and e^x. It does not use any standard Math library methods nor custom
methods, only the formula provided.</p>
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Exponential {
    
   
    static double exp(double x) {
        
        // use doubles to enable promotions of int in calculations
        double currentTerm = 1;
        double nextTerm;
        double sum = 1;
        
        /* since this is an infinite series, should technically 
         * use Integer.MAX_VALUE for largest possible int.
         * However there are no difference in results 
         * after k <= 57. So for performance reasons will use limit of 57. */
        
        final int performanceLimit = 57;
        
        for (int k = 0; k <= performanceLimit; k++) {
            nextTerm = currentTerm * (x / (k + 1));
            sum = sum + nextTerm;
            currentTerm = nextTerm;
        }
        return sum;
    }
        
    /**
     * Calls exp to print the requested results.
     * 
     * @param args command line arguments unused
     */
    public static void main(String[] args) {
        // table header
        System.out.println("x" + "\t" + "e^x");
        System.out.println();
        // given lower and upper bounds
        final int lower = -10;
        final int upper = 10;
        
        // print results of x and e^x per line
        for (int x = lower; x <= upper; x++) {
            System.out.println(x + "\t" + exp(x)); 
        }
        
    }
}


package ca.bcit.comp1510.lab05;

/**
 * Program that maths.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Mathematics {

    /**
     * Constant for Pi.
     */
    public static final double PI = Math.PI;

    /**
     * Returns circle area given radius.
     * 
     * @param d is a double
     * @return cArea
     */
    public double getCircleArea(double d) {
        // calculate circle area given radius
        double cArea = Math.PI * d * d;
        return cArea;
    }

    /**
     * Returns sum of ints.
     * 
     * @param upper is an int
     * @return sum
     */
    public int sumOfInts(int upper) {
        // loop from 0 to upper bound
        int sum = 0;
        for (int i = 0; i <= upper; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Returns true if positive.
     * 
     * @param i is an int
     * @return b1
     */
    public boolean isPositive(int i) {
        // check if even number
        Boolean b1 = (i > 0);
        return b1;
    }

    /**
     * Returns true if even.
     * 
     * @param i is an int
     * @return b2
     */
    public boolean isEven(int i) {
        // check if even number
        Boolean b2 = (i % 2 == 0);
        return b2;
    }

    /**
     * Returns sum of evens.
     * 
     * @param upper2 is an int
     * @return sum2
     */
    public int sumOfEvens(int upper2) {
        // loop from 0 to upper bound
        if (upper2 >= 0) {
            int sum2 = 0;
            for (int i = 0; i <= upper2; i++) {
                if (i % 2 == 0) {
                    sum2 = sum2 + i;
                }
            }
            return sum2;
        } else {
            int sum3 = 0;
            for (int i = 0; i >= upper2; i--) {
                if (i % 2 == 0) {
                    sum3 = sum3 + i;
                }

            }
            return sum3;
        }
    }
}

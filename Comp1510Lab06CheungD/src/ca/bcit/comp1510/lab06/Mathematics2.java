package ca.bcit.comp1510.lab06;

/**
 * Program that maths2.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Mathematics2 {
    
    /**
     * Constant ratio for foot to km.
     */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    
    /**
    * Returns the area of the square with the specified edge length.
    *
    * @param edgeLength
    *       of the square.
    * @return area as a double
    */
    public double getSquareArea(double edgeLength) {
        double area = edgeLength * edgeLength;
        return area;
    }

    /**
    * Returns the sum of the specified values.
    *
    * @param first
    *       operand
    * @param second
    *       operand
    * @return sum of the operands
    */
    public double add(double first, double second) {
        double sum = first + second;
        return sum;
    }

    /**
    * Returns the product of the specified values.
    *
    * @param first
    *       operand
    * @param second
    *       operand
    * @return product of the operands
    */
    public double multiply(double first, double second) {
        double product = first * second;
        return product;
    }

    /**
    * Returns the difference of the specified values.
    *
    * @param first
    *       operand
    * @param second
    *       operand
    * @return difference of the operands
    */
    public double subtract(double first, double second) {
        double diff = first - second;
        return diff;
    }

    /**
    * Returns the quotient of the specified values. If the divisor is zero,
    * returns zero instead of NaN or infinity.
    *
    * @param first
    *       operand
    * @param second
    *       operand
    * @return quotient of the operands
    */
    public double divide(double first, double second) {
        if (second == 0) {
            return 0;
        } else {
            double q = first / second;
            return q;
        }
    }

    /**
    * Returns the absolute value of the specified integer.
    *
    * @param number
    *       to test
    * @return absolute value of number
    */
    public int absoluteValue(int number) {
        int abs = Math.abs(number);
        return abs;
    }

    /**
    * Returns a random number between 10 and 20 inclusive,
    * but NOT 15.
    * @return random number in range [10, 20] excluding 15.
    */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        final int max = 21;
        final int min = 10;
        final int no = 15;
        int rand = (int) ((Math.random() * (max - min)) + min);
        
        if (rand == no) {
            return (rand - 1);
        } else {

            return rand;
        }
    }

    /**
    * Converts the specified number of feet to kilometres.
    * @param feet to convert
    * @return kilometres in the specified number of feet
    */
    public double convertFeetToKilometres(double feet) {
        double converted = feet * FOOT_TO_KILOMETRE_RATIO;
        return converted;
    }

    /**
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. For example, sumOfProducts(10, 3) will return
    * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
    * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
    * return -2 + -4 + -6 + -8 + -10 = -30.
    * @param bound the upper bound
    * @param divisor the divisor
    * @return sum
    */
    public int sumOfProducts(int bound, int divisor) {
        int sum = 0;
        if (bound >= 0) {
            for (int i = 0; (divisor * i) <= bound; i++) {
                sum = sum + divisor * i;
            }
            return sum;
        } else {
            for (int i = 0; (divisor * i) >= bound; i--) {
                sum = sum + divisor * i;
            }
            
            return sum;
        }
    }

}

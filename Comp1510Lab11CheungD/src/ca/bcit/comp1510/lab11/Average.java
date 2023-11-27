package ca.bcit.comp1510.lab11;

/**
 * calculates average from command line inputs. First non integer will throw.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Average {

    /**
     * Program that drives. 
     * 
     * @param args used for ints
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments");
        } else {
            int sum = 0;
            int count = 0;

            for (String arg : args) {
                try {
                    int n = Integer.parseInt(arg);
                    sum += n;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("bad input - " + arg);
                    return;
                }
            }
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        }
    }
}

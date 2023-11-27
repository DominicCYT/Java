package ca.bcit.comp1510.lab10;

/**
 * Simulates space particle collisions.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Collisions {
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        final int boundary = 2000000;
        final int steps = 100000;
        final int part1X = -3;
        final int part2X = 3;

        RandomWalker particle1 = new RandomWalker(steps, part1X, 0, boundary);
        RandomWalker particle2 = new RandomWalker(steps, part2X, 0, boundary);

        int collisions = 0;


        for (int i = 0; i < steps; i++) {
            particle1.takeStep();
            particle2.takeStep();

            if (samePosition(particle1, particle2)) {
                collisions++;
            }
        }


        System.out.println("Number of collisions: " + collisions);
        System.out.println("Farthest distance particle1: " 
                + particle1.getMaxDistance());
        System.out.println("Farthest distance particle1: " 
                + particle2.getMaxDistance());
    }

    /**
     * check if obj at same coord.
     * @param one an obj
     * @param two an obj
     * @return boolean
     */
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        return one.getX() == two.getX() && one.getY() == two.getY();
    }
}

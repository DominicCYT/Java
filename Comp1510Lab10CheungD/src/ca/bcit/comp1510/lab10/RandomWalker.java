package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * Program that drives.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class RandomWalker {
    
    /**
     * private instance variable for x coord.
     */
    private int x;
    
    /**
     * private instance variable for y coord.
     */
    private int y;
    
    /**
     * private instance variable for max steps.
     */
    private int maxSteps;
    
    /**
     * private instance variable for current steps.
     */
    private int currentSteps;
    
    /**
     * private instance variable for boundary of square.
     */
    private int boundary;
    
    /**
     * private instance variable for max distance walked.
     */
    private int maximumDistance;

    /**
     * Constructors for random walking obj.
     * @param maxSteps an int
     * @param boundary an int
     */
    public RandomWalker(int maxSteps, int boundary) {
        if (maxSteps <= 0 || boundary <= 0) {
            throw new IllegalArgumentException("Maximum steps and "
                    + "boundary must be greater than 0.");
        }
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        this.x = 0;
        this.y = 0;
        this.currentSteps = 0;
        this.maximumDistance = 0;
    }

    /**
     * Another constructor for random walking obj.
     * @param maxSteps an int
     * @param x an int
     * @param y an int
     * @param boundary an int
     */
    public RandomWalker(int maxSteps, int x, int y, int boundary) {
        if (maxSteps <= 0 || boundary <= 0) {
            throw new IllegalArgumentException("Maximum steps and "
                    + "boundary must be greater than 0.");
        }
        this.maxSteps = maxSteps;
        this.x = x;
        this.y = y;
        this.boundary = boundary;
        this.currentSteps = 0;
        this.maximumDistance = 0;
    }

    /**
     * Tells you current position and the current steps.
     * @return a string
     */
    public String toString() {
        return "Position: (" + x + ", " + y + "), Step: " + currentSteps;
    }

    /**
     * take random steps.
     */
    public void takeStep() {
        Random random = new Random();
        final int udlr = 4;
        int direction = random.nextInt(udlr);
        
        final int left = 3;
        
        switch (direction) {
            case 0:
                y++; 
                break;
            case 1:
                y--; 
                break;
            case 2:
                x++; 
                break;
            case left:
                x--; 
                break;
            default:
                break;
        }

        currentSteps++;
        updateMaxDistance();
    }

    /**
     * check if there are more steps to take.
     * @return boolean
     */
    public boolean moreSteps() {
        return currentSteps < maxSteps;
    }

    /**
     * check still in bounds.
     * @return boolean
     */
    public boolean inBounds() {
        return Math.abs(x) <= boundary && Math.abs(y) <= boundary;
    }

    /**
     * keep walking while in bounds and have steps left.
     */
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }

    /**
     * getter for maxDistance.
     * @return maxDistance an int
     */
    public int getMaxDistance() {
        return maximumDistance;
    }

    /**
     * update maxDistance.
     */
    private void updateMaxDistance() {
        maximumDistance = Math.abs(x) > Math.abs(y) ? Math.abs(x) : Math.abs(y);
    }
    
    /**
     * getter for x.
     * @return x an int
     */
    public int getX() {
        return x;
    }

    /**
     * getter for y.
     * @return y an int
     */
    public int getY() {
        return y;
    }

}

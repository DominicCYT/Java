package ca.bcit.comp1510.lab04;

/**
 * Represents one die (singular of dice) with n number of faces.
 * Used with RollingMultiDice.java where user input n.
 * 
 * 1. Do you need getters and setters for max? Should you have them?
 * 
 * You do not need them, but can. 
 * In my RollingMultiDice.java, I used setters for max in the event
 * a board game has a specific case that sets a max value for one of the dice.
 * Getters should not be used for max since you would not have a value until
 * after the roll. That is why I designed the max to be mainly user input.
 *  
 * 2. Can you have getters and setters for max?
 * 
 * Yes you can. You can have getters for max if for a specific reason you want
 * the max value to be the value of a previous roll. In that case, you would 
 * need new objects and set the MultiDie constructor to take the parameter
 * of the previous die getter value (getters return int). Made code in
 * RollingMultiDice.java lines 71+ that are commented out due to checkstyle.
 * 
 * 3. Why do you think it makes sense (or not) to have max be final?
 * 
 * I think it makes sense when you think about how a real die can't have its 
 * sides changed either, without getting new ones.
 * That is why it is important to keep user input as a final max value. 
 * You can override results it if there is a specific requirement
 * with faceValue, but never changes max. For new rolls you would want to 
 * revert back to user defined max.
 * 
 * 4. What does max’s being final say about the abstraction
 * of a MultiDie object?
 * 
 * For other java files using MultiDie, they have access to a lot of the
 * details. So I would say it is not very abstracted. The only thing private
 * is faceValue, which makes sense as you do not want that changed mid program.
 * 
 * 
 * 5. Is max an instance variable?
 * No, because instance variable should be declared with private visibility
 * to promote encapsulation. max here is public.
 * 
 * 
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class MultiDie {
    /** Maximum face value. */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * Constructor sets the initial face value to a random number.
     * @param numSides integer.
     */
    public MultiDie(int numSides) {
        
        max = numSides;
        faceValue = roll();
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}


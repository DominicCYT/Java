package ca.bcit.comp1510.lab10;

/**
 * Name Constructors and its methods.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Name implements Comparable<Name> {
    
    /**
     * private instance variable for first name.
     */
    
    private final String first;
    
    /**
     * private instance variable for middle name.
     */
    
    private final String middle;
    
    /**
     * private instance variable for last name.
     */
    
    private final String last;

    /**
     * constructor for name, takes first middle and last.
     * @param first a string
     * @param middle a string
     * @param last a string
     */
    public Name(String first, String middle, String last) {
        checkName(first);
        checkName(middle);
        checkName(last);
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    /**
     * 2nd constructor for name, takes first and last but middle null.
     * @param first a string
     * @param last a string
     */
    public Name(String first, String last) {
        checkName(first);
        checkName(last);
        this.first = first;
        this.middle = null;
        this.last = last;
    }

    /**
     * getter for first name.
     * @return first a string
     */
    public String getFirst() {
        return first;
    }

    /**
     * getter for middle name.
     * @return middle a string
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * getter for last name.
     * @return last a string
     */
    public String getLast() {
        return last;
    }
    
    private void checkName(String name) {
        if (name.equals(null) || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
    
    /**
     * compares Name objects. negative, 0 or positive int if object is
     * less than, equal or greater than the object compared as the parameter.
     * We want to sort alphabetically. 
     * @param input a string
     * @return result an int
     */
    
    public int compareTo(Name input) {
        
        // check last name first to sort
        int lastNameOrder = this.last.compareTo(input.last);
        
        // if they are not the same (ie not 0) then we already have order
        if (lastNameOrder != 0) {
            return lastNameOrder;
        }

        // if last name is same (ie 0) then we check first name
        int firstNameOrder = this.first.compareTo(input.first);

        // if first name is not the same (ie not 0) then we have order
        if (firstNameOrder != 0) {
            return firstNameOrder;
        }

        // if both last and first name are the same (ie both are 0):
        // check if middle is null
        if (this.middle.equals(null)) {
            // if both middle are null, then order does not matter
            return (input.middle.equals(null)) ? 0 : 1;
        }

        return this.middle.compareTo(input.middle);
    }
}

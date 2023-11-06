package ca.bcit.comp1510.lab04;

/**
 * Allows other programs to use Name.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */

public class Name {

    /**
     * Sets the parameters to the private instance variables.
     * 
     * firstName a string
     */
    
    private String firstName;
    /**
     * Sets the parameters to the private instance variables.
     * 
     * middleName a string
     */
    
    private String middleName;
    /**
     * Sets the parameters to the private instance variables.
     * 
     * lastName a string.
     */
    
    private String lastName;

    /**
     * constructor for name.
     * 
     * @param fname a string
     * @param mname a string
     * @param lname a string.
     */
    public Name(String fname, String mname, String lname) {

        firstName = fname;
        middleName = mname;
        lastName = lname;

    }

    /**
     * creating setters for first name.
     * 
     * @param fnameSetter a string
     */
    public void setFirstName(String fnameSetter) {
        firstName = fnameSetter;
    }

    /**
     * creating setters for middle name.
     * 
     * @param mnameSetter a string
     */
    public void setMiddleName(String mnameSetter) {
        middleName = mnameSetter;
    }

    /**
     * creating setters for last name.
     * 
     * @param lnameSetter a string
     */
    public void setLastName(String lnameSetter) {
        lastName = lnameSetter;
    }

    /**
     * Returns the string value of first name.
     * 
     * @return firstName as String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the string value of first name.
     * 
     * @return middleName as String
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Returns the string value of first name.
     * 
     * @return lastName as String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns a String representation all the names.
     * 
     * @return toString concats the three names together
     */
    public String toString() {
        String fullname = firstName + " " + middleName + " " + lastName;

        return fullname;
    }

}

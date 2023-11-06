package ca.bcit.comp1510.lab06;

/**
 * Allows other programs to use Name.
 *
 * @author Dominic Cheung, Set C
 * @version 1.1
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
        
        if (fname == null || fname.trim().isEmpty()) {
            
            firstName = "John";
        } else {
            fname = fname.toLowerCase();
            String firstC = fname.substring(0, 1).toUpperCase();  
            String remainder = fname.substring(1);
            fname = firstC + remainder;
            firstName = fname;
        }

        if (mname.trim().isEmpty() || mname == null) {
            
            middleName = "Tim";
        } else {
            mname = mname.toLowerCase();
            String firstC = mname.substring(0, 1).toUpperCase();  
            String remainder = mname.substring(1);
            mname = firstC + remainder;
            middleName = mname;
        }

        if (lname.trim().isEmpty() || lname == null) {
            
            lastName = "Apple";
        } else {
            lname = lname.toLowerCase();
            String firstC = lname.substring(0, 1).toUpperCase();  
            String remainder = lname.substring(1);
            lname = firstC + remainder;
            lastName = lname;
        }
        

    }

    /**
     * creating setters for first name.
     * 
     * @param fnameSetter a string
     */
    public void setFirstName(String fnameSetter) {
        
        if (!fnameSetter.trim().isEmpty() && fnameSetter != null) {
            fnameSetter = fnameSetter.toLowerCase();
            String firstC = fnameSetter.substring(0, 1).toUpperCase();  
            String remainder = fnameSetter.substring(1);
            fnameSetter = firstC + remainder;
            firstName = fnameSetter;
        }
    }

    /**
     * creating setters for middle name.
     * 
     * @param mnameSetter a string
     */
    public void setMiddleName(String mnameSetter) {
        if (!mnameSetter.trim().isEmpty() && mnameSetter != null) {
            mnameSetter = mnameSetter.toLowerCase();
            String firstC = mnameSetter.substring(0, 1).toUpperCase();  
            String remainder = mnameSetter.substring(1);
            mnameSetter = firstC + remainder;
            middleName = mnameSetter;
        }
    }

    /**
     * creating setters for last name.
     * 
     * @param lnameSetter a string
     */
    public void setLastName(String lnameSetter) {
        if (!lnameSetter.trim().isEmpty() && lnameSetter != null) {
            lnameSetter = lnameSetter.toLowerCase();
            String firstC = lnameSetter.substring(0, 1).toUpperCase();  
            String remainder = lnameSetter.substring(1);
            lnameSetter = firstC + remainder;
            lastName = lnameSetter;
        }
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

    /**
     * Returns length of names.
     * 
     * @return length of three names together without space
     */
    public int nameLength() {
        int length = firstName.length() + middleName.length() 
            + lastName.length();

        return length;
    }
    
    /**
     * Returns the three initials in upper case.
     * 
     * @return string of the three initials concat
     */
    public String initials() {
        String init = firstName.substring(0, 1).toUpperCase()
                + middleName.substring(0, 1).toUpperCase()
                + lastName.substring(0, 1).toUpperCase();
        
        return init;
    }
    
    /**
     * Returns the nth character.
     * 
     * @param n is index in string as int
     * @return char at index n
     */
    public char nthChar(int n) {
        String combined = firstName + middleName + lastName;
        
        if (n > 0 && n <= combined.length()) {
            // -1 because starts at index 0
            char nth = combined.charAt(n - 1);
            return nth;
        } else {
            char a = '@';
            return a;
        }
    }
    
    /**
     * Returns a String representation all the names but last name first.
     * 
     * @return lastNameFirst concats the three names together
     */
    public String lastNameFirst() {
        String fullname2 = lastName + ", " 
                + firstName + " " + middleName;

        return fullname2;
    }
    
    /**
     * Returns a boolean if match with first name.
     * @param check is user provided name
     * @return boolean value
     */
    public Boolean firstNameCheck(String check) {
        String n1 = firstName.toLowerCase().trim();
        String n2 = check.toLowerCase().trim();
        Boolean b1 = n1.equals(n2);
        
        return b1;
    }
    
    /**
     * Returns a boolean if match with this Name object.
     * @param checkobj is user provided name object
     * @return boolean value
     */
    public Boolean objectNameCheck(Name checkobj) {
        String c1 = checkobj.getFirstName().trim().toLowerCase() 
                + checkobj.getMiddleName().trim().toLowerCase()
                + checkobj.getLastName().trim().toLowerCase();
        
        String c2 = this.getFirstName().trim().toLowerCase() 
                + this.getMiddleName().trim().toLowerCase()
                + this.getLastName().trim().toLowerCase();
        
        Boolean b2 = c1.equals(c2);
        
        return b2;
    }
    
}

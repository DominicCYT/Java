package ca.bcit.comp1510.lab04;

/**
 * Student class.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Student {

    /**
     * Sets the parameters to the private instance variables.
     * 
     * firstName a string
     */

    private String firstName;

    /**
     * Sets the parameters to the private instance variables.
     * 
     * lastName a string.
     */

    private String lastName;

    /**
     * Sets the parameters to the private instance variables.
     * 
     * yearOfBirth an int.
     */

    private int yearOfBirth;

    /**
     * Sets the parameters to the private instance variables.
     * 
     * studentNumber a String.
     */

    private String studentNumber;

    /**
     * Sets the parameters to the private instance variables.
     * 
     * gradePA a int.
     */

    private int gradePA;

    /**
     * Sets the parameters to the private instance variables.
     * 
     * @param fname     a string
     * @param lname     a string
     * @param yob       an int
     * @param studentno a string
     * @param gpa       an int
     */
    public Student(String fname, String lname, int yob, 
            String studentno, int gpa) {

        firstName = fname;
        lastName = lname;
        yearOfBirth = yob;
        studentNumber = studentno;
        gradePA = gpa;

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
     * creating setters for last name.
     * 
     * @param lnameSetter a string
     */
    public void setLastName(String lnameSetter) {
        lastName = lnameSetter;
    }

    /**
     * creating setter for year of birth.
     * 
     * @param yobSetter an int
     */
    public void setBirthYear(int yobSetter) {
        yearOfBirth = yobSetter;
    }

    /**
     * creating setter for student number.
     * 
     * @param stuNumSetter a String
     */
    public void setStudentNumber(String stuNumSetter) {
        studentNumber = stuNumSetter;
    }

    /**
     * creating setter for GPA.
     * 
     * @param gpaSetter a int
     */
    public void setGradeAverage(int gpaSetter) {
        gradePA = gpaSetter;
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
     * Returns the string value of last name.
     * 
     * @return lastName as String
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Returns the value of year of birth.
     * 
     * @return yearOfBirth as int
     */
    public int getBirthYear() {
        return yearOfBirth;
    }

    /**
     * Returns the value of student number.
     * 
     * @return studentNumber a String
     */
    public String getStudentNumber() {
        return studentNumber;
    }
    
    /**
     * Returns the value of GPA.
     * 
     * @return gradePA as int
     */
    public int getGradeAverage() {
        return gradePA;
    }
    
    /**
     * Returns a String representation Student.
     * 
     * @return toString concats everything together
     */
    public String toString() {
        String fullstudent = firstName + " " + lastName + " "  
                + (yearOfBirth) + " " + (studentNumber) + " "  + (gradePA);

        return fullstudent;
    }
}

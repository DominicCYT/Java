package ca.bcit.comp1510.lab09;

/**
 * Class for cat objects.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Cat {
    
    /**
     * cat name cannot change.
     */
    private final String name;
    
    /**
     * age of cat can be changed.
     */
    private int age;
    
    /**
     * constructor for cat object.
     * @param name a string
     * @param age an int
     */
    public Cat(String name, int age) {
        if (name.isEmpty() || name.isBlank() || name.equals(null)) {
            this.name = "Cleo";
        } else {
            this.name = name;
        }

        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    
    /**
     * getter for cat name.
     * @return name a string
     */
    
    public String getName() {
        return name;
    }
    
    /**
     * getter for cat age.
     * @return age an int
     */
    
    public int getAge() {
        return age;
    }

    /**
     * setter for cat age. Must be greater than or equal to 0. 
     * @param age an int
     */
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    
    /**
     * override toString prints the name and age of cat.
     * @return a string
     */
    
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

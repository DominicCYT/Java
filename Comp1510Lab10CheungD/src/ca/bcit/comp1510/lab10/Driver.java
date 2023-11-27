package ca.bcit.comp1510.lab10;

import java.util.ArrayList;
import java.util.List;

/**
 * Program that drives the Name class.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */

public class Driver {

    /**
     * Adds and sorts Names.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        List<Name> names = new ArrayList<Name>();
        try {
            // Add random names to the list
            names.add(new Name("John", "Rock", "Smith"));
            names.add(new Name("Jane", "Smith"));
            names.add(new Name("Jane", "Doe", "Mary"));
            names.add(new Name("Alice", "Smith"));
            names.add(new Name("Tim", "Apple"));
            names.add(new Name("Tim", "Cook"));
            //names.add(new Name("", "apple", ""));
            //names.add(new Name("", "", ""));

            // sort the list of names with null per doc
            names.sort(null);

            // print the sorted names
            for (Name name : names) {
                System.out.println(name.getLast() + ", " + name.getFirst() + " "
                        + (name.getMiddle() == null ? "" : name.getMiddle()));
            }

        } catch (IllegalArgumentException ex) {
            System.out.println("Name cannot be null or empty.");
        }
    }
}

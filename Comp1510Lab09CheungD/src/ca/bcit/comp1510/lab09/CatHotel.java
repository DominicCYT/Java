package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class for cat hotel objects.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */

public class CatHotel {

    /**
     * private instance variable for array list for 
     * cat objects which are guests.
     */
    private ArrayList<Cat> guests;

    /**
     * private instance variable for string hotel name.
     */
    private String name;

    /**
     * constructor for cat hotel object.
     * 
     * @param name a string
     */
    public CatHotel(String name) {
        this.name = name;
        this.guests = new ArrayList<Cat>();
    }

    /**
     * accepts cat objects as the hotel guests. No return value.
     * 
     * @param catGuest a Cat object
     */
    public void addCat(Cat catGuest) {
        guests.add(catGuest);
    }

    /**
     * deletes all cat guests from array list.
     */
    public void removeAllGuests() {
        guests.clear();
    }

    /**
     * number of cat guests in hotel currently.
     * 
     * @return size of array an int
     */
    public int guestCount() {
        return guests.size();
    }

    /**
     * remove the cat guests with ages that are too old.
     * 
     * @param tooOld an int
     * @return an int for number of cat guests removed
     */
    public int removeOldGuests(int tooOld) {

        Iterator<Cat> catIterator = guests.iterator();

        int removed = 0;

        while (catIterator.hasNext()) {

            Cat temp = catIterator.next();

            if (temp.getAge() > tooOld) {
                catIterator.remove();
                removed++;
            }
        }

        return removed;
    }

    /**
     * prints the current cat guest list at the current hotel.
     */
    public void printGuestList() {

        System.out.println("Cat Hotel: " + name);

        // if empty, print empty
        if (guests.isEmpty()) {
            System.out.println("Hotel is empty.");
        } else {
            // for each loop
            for (Cat catGuest : guests) {

                System.out.println(catGuest);
            }
        }

    }
}


package ca.bcit.comp1510.lab09;

import java.util.Random;

/**
 * Uses Cat and CatHotel.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */


public class CatHotelDriver {
    /**
     * Program that drives.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        CatHotel catHotel = new CatHotel("Five Seasons");
        Random rng = new Random();

        // get random number of cat guests
        final int upper = 20;
        int nGuests = rng.nextInt(upper);
        
        
        for (int i = 0; i < nGuests; i++) {
            
            // new name for each cat object created
            String name = "Chocolate" + (i + 1);
            
            // get random age
            final int upperAge = 10;
            int age = rng.nextInt(upperAge);
            
            Cat cat = new Cat(name, age);
            
            catHotel.addCat(cat);
        }

        
        System.out.println("Starting Guest Count: " + catHotel.guestCount());
        catHotel.printGuestList();
        
        
        final int tooOld = 7;
        int removed = catHotel.removeOldGuests(tooOld);
        System.out.println("\nCats older than 7 removed: " + removed);
        
        System.out.println("New guest count: " + catHotel.guestCount() + "\n" 
            + "List after removal:");
        catHotel.printGuestList();
        
        
        catHotel.removeAllGuests();
        System.out.println("\nAfter removing all guests:\nCount: " 
                + catHotel.guestCount());
        catHotel.printGuestList();
    }
}


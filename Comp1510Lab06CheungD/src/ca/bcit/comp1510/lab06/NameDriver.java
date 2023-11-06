package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Program that tests the names.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class NameDriver {
    
    /**
     * Driver program for name.
     * @param args unused
     */
    public static void main(String[] args) {
        
        // create scanner for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String f1 = scan.nextLine();
        System.out.println("Please enter middle name: ");
        String m1 = scan.nextLine();
        System.out.println("Please enter last name: ");
        String l1 = scan.nextLine();
        
        // create new name object to run tests
        Name nameA = new Name(f1, m1, l1);
        
        System.out.println(nameA.getFirstName() + " " + nameA.getMiddleName() 
            + " " + nameA.getLastName());
        
        //test setters
        System.out.println("Please enter first name: ");
        String f2 = scan.nextLine();
        System.out.println("Please enter middle name: ");
        String m2 = scan.nextLine();
        System.out.println("Please enter last name: ");
        String l2 = scan.nextLine();
        
        nameA.setFirstName(f2);
        nameA.setMiddleName(m2);
        nameA.setLastName(l2);
        
        System.out.println(nameA.getFirstName() + " " + nameA.getMiddleName() 
            + " " + nameA.getLastName());

        
        //nth character test
        System.out.println("Enter integer number "
                + "to find the nth character: ");
        int n1 = scan.nextInt();
        System.out.println("nth character: " + nameA.nthChar(n1));
        
        scan.close();
    }

}

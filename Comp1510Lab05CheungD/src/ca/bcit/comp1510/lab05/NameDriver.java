package ca.bcit.comp1510.lab05;

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
        String f1 = scan.next();
        System.out.println("Please enter middle name: ");
        String m1 = scan.next();
        System.out.println("Please enter last name: ");
        String l1 = scan.next();
        
        // create new name object to run tests
        Name nameA = new Name(f1, m1, l1);
        
        //length test
        System.out.println("Length: " + nameA.nameLength());
        
        //initials test
        System.out.println("Initials: " + nameA.initials());
        
        //nth character test
        System.out.println("Enter integer number to find the nth character: ");
        int n1 = scan.nextInt();
        System.out.println("nth character: " + nameA.nthChar(n1));
        
        //test last name first print
        System.out.println("Last name, First name Middle name: " 
                + nameA.lastNameFirst());
        
        // test same first name
        System.out.println("Please enter another first name: ");
        String f2 = scan.next();
        Boolean b1 = nameA.firstNameCheck(f2);
        System.out.println("The original first name and the "
                + "recently inputted first name is the same: " + b1);
        
        // test same object name
        System.out.println("Please enter another first name: ");
        String f3 = scan.next();
        System.out.println("Please enter another middle name: ");
        String m2 = scan.next();
        System.out.println("Please enter another last name: ");
        String l2 = scan.next();
        
        Name nameB = new Name(f3, m2, l2);
        
        Boolean b2 = nameA.objectNameCheck(nameB);
        
        System.out.println("The original full name and the "
                + "recently inputted full name is the same: " + b2);
        
        scan.close();
    }

}

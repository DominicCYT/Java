package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Program that drives.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Names {
    
    /**
     * Driver program creates names.
     * @param args unused
     */
    public static void main(String[] args) {
        // create scanner for user input and ask for first middle and last name
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String firstname = scan.nextLine();
        System.out.println("Please enter middle name: ");
        String middlename = scan.nextLine();
        System.out.println("Please enter last name: ");
        String lastname = scan.nextLine();
        
        firstname.trim();
        middlename.trim();
        lastname.trim();
        
        //create object
        Name personA = new Name(firstname, middlename, lastname);
        
        //print full name
        //System.out.println(personA.toString());
        
        
        //find first character of first name and upper with Character class    
        char f1 = Character.toUpperCase(firstname.charAt(0));
        //Concat first character and substring
        String upperFirst = f1 + firstname.substring(1);
        //use setter
        personA.setFirstName(upperFirst);
        
        //find first character of middle name and upper with Character class    
        char m1 = Character.toUpperCase(middlename.charAt(0));
        //Concat first character and substring
        String upperMiddle = m1 + middlename.substring(1);
        //use setter
        personA.setMiddleName(upperMiddle);
        
        //find first character of last name and upper with Character class    
        char l1 = Character.toUpperCase(lastname.charAt(0));
        //Concat first character and substring
        String upperLast = l1 + lastname.substring(1);
        //use setter
        personA.setLastName(upperLast);
        
        //print full name with capital first characters
        System.out.println("The full name is: " + "\n" + personA.toString());
        
        scan.close();
    }

}

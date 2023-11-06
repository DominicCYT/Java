package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * Fun With Strings.
 *
 * @author Dominic Cheung
 * @version 1.0
 */

public class FunWithStrings {
    /**
     * Drives the program.
     *
     * @param args unused
     */
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the title of your favorite book?");
        // Assign the user's input to the title variable

        String title;

        // save user next line input into title
        title = scan.nextLine();

        // print the user input
        System.out.println("Your favorite book is: " + title);

        // challenge
        // System.out.println("C. What is the title of your favorite book?");
        // save user next into title2
        // String title2;
        // title2 = scan.next();
        // the above will not take white spaces and will wait for chars

        // print the user input
        // System.out.println("C. Your favorite book is: " + title2);

        // find length of title
        int length = title.length();
        System.out.println("The title is: " + length 
                + " characters long");

        // determine if begins with the. 
        boolean hasThe = title.toLowerCase().startsWith("the");

        System.out.println("The title begins with \"The\": " + hasThe);

        // toupper and tolower the title
        String titleUpper = title.toUpperCase();
        String titleLower = title.toLowerCase();
        System.out.println("The title in all upper case is: " + titleUpper);
        System.out.println("The title in all lower case is: " + titleLower);

        // trim user input
        String trimmedUserInput = title.trim();
        int trimmedLength = trimmedUserInput.length();
        System.out.println("The title trimmed is: " + trimmedUserInput);
        System.out.println("The trimmed length is: " + trimmedLength 
                + " characters long");

        // trimmed, lower case, first and last letter capitalized
        String trimmedLower = trimmedUserInput.toLowerCase();

        // find first and last letter and store the capitalized version
        String trimmedLowerFirst = trimmedLower.substring(0, 1);
        trimmedLowerFirst = trimmedLowerFirst.toUpperCase();
        //System.out.println(trimmedLowerFirst);

        String trimmedLowerLast = trimmedLower.substring(trimmedLength - 1);
        trimmedLowerLast = trimmedLowerLast.toUpperCase();
        // System.out.println(trimmedLowerLast);

        // save the string without first and last char
        String trimmedLowerMid = trimmedLower.substring(1, trimmedLength - 1);
        // System.out.println(trimmedLowerMiddle);

        // put them all together
        String output;
        output = trimmedLowerFirst + trimmedLowerMid + trimmedLowerLast;
        System.out.println(output);
        
        scan.close();
    }

}

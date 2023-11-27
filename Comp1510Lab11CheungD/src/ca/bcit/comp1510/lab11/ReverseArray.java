package ca.bcit.comp1510.lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program that drives.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class ReverseArray {

    /**
     * User given int in an array and reverses order.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input array size: ");
            int size = scanner.nextInt();
            
            if (size <= 0) {
                System.out.println("Please enter a non-zero positive integer "
                        + "for the number of values.");
                scanner.close();
                return;
            }

            int[] array = new int[size];

            // Ask the user to enter values and store them in the array
            for (int i = 0; i < size; i++) {
                System.out.print("Input value #" + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            // original array
            System.out.println("\nOriginal array:");
            printArray(array);

            // reverse the array
            reverseArray(array);

            // reversed array
            System.out.println("\nReversed array:");
            printArray(array);

            scanner.close();
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    // swap elements in the array by just assigning.
    private static void swap(int[] array, int a, int b) {
        
        // save original value at position A
        int ogA = array[a];
        // update value at position A with the value at position B
        array[a] = array[b];
        // assign original A value at position B
        array[b] = ogA;
    }

    // reverse the array
    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // swap beginning and end
            swap(array, start, end);

            // move start up by 1, move end down by 1 to work towards middle
            start++;
            end--;
        }
    }

    // print the array with for each
    private static void printArray(int[] array) {
        
        // for each value in the array, print the int
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

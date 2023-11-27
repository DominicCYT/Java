package ca.bcit.comp1510.lab11;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Uses Item and Transaction class to simulate shopping.
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Shopping {
    
    /**
     * Program that drives shopping.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of cart: ");
        int size;
        try {
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Initial size must be "
                        + "a positive integer.");
                scanner.close();
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter "
                    + "a positive integer.");
            scanner.close();
            return;
        }
        
        Transaction transaction = new Transaction(size);

        shopping(transaction);
        displayResults(transaction);
        scanner.close();
    }
    
    private static void displayResults(Transaction transaction) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Items in cart:");
        System.out.println(transaction);
        System.out.println("Total Count of items: " + transaction.getCount());
        System.out.println("Total Price of the transaction: " 
                + currencyFormat.format(transaction.getTotalPrice()));
    }
    
    private static double truncate(double value) {
        final double hundred = 100;
        return Math.floor(value * hundred) / hundred;
    }
    
    private static void shopping(Transaction transaction) {
        Scanner scanner = new Scanner(System.in);
        String keepGoing;
        do {
            System.out.print("Enter item name: ");
            
            String itemName = scanner.next();
            double itemPrice;
            int itemQuantity;
            
            try {
                System.out.print("Enter item price: ");
                itemPrice = truncate(scanner.nextDouble());

                if (itemPrice <= 0) {
                    System.out.println("Item price must be "
                            + "a positive number.");
                    return;
                }

                System.out.print("Enter item quantity: ");
                itemQuantity = scanner.nextInt();

                if (itemQuantity <= 0) {
                    System.out.println("Item quantity must be "
                            + "a positive integer.");
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter "
                        + "valid numeric values.");
                scanner.close();
                return;
            }

            Item freeCake = new Item("Free Cake", 0, 1);
            transaction.addToCart(freeCake);
            transaction.addToCart(itemName, itemPrice, itemQuantity);
            

            System.out.print("Continue shopping? (yes/no): ");
            keepGoing = scanner.next();
        } while (keepGoing.equalsIgnoreCase("yes"));
        scanner.close();
    }

}

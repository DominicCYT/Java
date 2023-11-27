package ca.bcit.comp1510.lab11;

import java.text.NumberFormat;

/**
 * Item class for shopping.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Item {
    
    /**
     * name of item.
     */
    private final String name;
    
    /**
     * price of item.
     */
    private final double price;
    
    /**
     * the quantity of items to buy.
     */
    private final int quantity;

    /**
     * constructor for items.
     * @param name a string
     * @param price a double
     * @param quantity an int
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * constructor for items but quantity is 1.
     * @param name a string
     * @param price a double
     */
    public Item(String name, double price) {
        this(name, price, 1);
    }

    /**
     * getter for item name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getter for item price.
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * getter for item quantity.
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return String.format("%s - %s x %d", name, 
                currencyFormat.format(price), quantity);
    }
}

package ca.bcit.comp1510.lab11;

import java.text.NumberFormat;

/**
 * Transaction class for shopping items.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Transaction {
    
    /**
     * array for Item objects called cart.
     */
    private Item[] cart;
    
    /**
     * total price of Items in cart.
     */
    private double totalPrice;
    
    /**
     * total number of Item objects.
     */
    private int itemCount;

    /**
     * constructor of shopping list of Items.
     * @param size an int
     */
    public Transaction(int size) {
        this.cart = new Item[size];
        this.totalPrice = 0.0;
        this.itemCount = 0;
    }

    /**
     * Add items to cart.
     * @param name a string
     * @param price a double
     * @param quantity an int
     */
    public void addToCart(String name, double price, int quantity) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        Item newItem = new Item(name, price, quantity);
        cart[itemCount] = newItem;
        totalPrice += newItem.getPrice() * newItem.getQuantity();
        itemCount++;
    }

    /**
     * instead of variables just takes the Item object.
     * @param item an Item object
     */
    public void addToCart(Item item) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        totalPrice += item.getPrice() * item.getQuantity();
        itemCount++;
    }

    /**
     * "increase" the size of the cart (create new array).
     */
    public void increaseSize() {
        final int increment = 3;
        int sizeInc = cart.length + increment;
        Item[] newCart = new Item[sizeInc];
        
        //System.arraycopy(cart, 0, newCart, 0, itemCount);
        for (int i = 0; i < cart.length; i++) {
            newCart[i] = cart[i];
        }
        
        cart = newCart;
    }

    /**
     * getter total price.
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * getter the total count of items.
     * @return totalCount
     */
    public int getCount() {
        int totalCount = 0;
        for (Item item : cart) {
            if (item != null) {
                totalCount += item.getQuantity();
            }
        }
        return totalCount;
    }

    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String result = "";
        for (Item item : cart) {
            if (item != null) {
                result += item.toString() + "\n";
            }
        }
        result += "Total Price: " + currencyFormat.format(getTotalPrice());
        return result;
    }
}

package ca.bcit.comp1510.lab11;

/**
 * Program that drives the Coin class.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Driver {

    /**
     * Shows Coin locked and unlocked.
     * @param args unused
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        
        final int myKey = 777;
        coin.setKey(myKey);

        System.out.println("Starting state: " + coin);

        coin.lock(myKey);
        
        System.out.println("Lock state: " + coin.locked());

        // flip the locked coin
        System.out.println("Flip locked coin.");
        coin.flip(); 

        System.out.println("State after flip: " + coin);

        // unlock coin
        coin.unlock(myKey);
        System.out.println("Lock state: " + coin.locked());

        // starting state and now should be same
        System.out.println("After unlocking: " + coin);
        
        // flip now works
        coin.flip();
        System.out.println("After flipping: " + coin);

    }

}





package ca.bcit.comp1510.lab11;

/**
 * Represents a two-sided coin that can be flipped. Takes into account lock
 * status.
 * 
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Coin implements Lockable {
    
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;
    
    /** Coin's lock state. */
    private boolean isLocked;
    
    /** Coin's key to lock or unlock. */
    private int key;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip();
        isLocked = false;
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        if (!isLocked) {
            face = (int) (Math.random() * 2);
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Checks lock state then return heads or tails.
     * @return toString description
     */
    public String toString() {
        return isLocked ? "Locked" : (isHeads() ? "Heads" : "Tails");
    }
    
    @Override
    public void setKey(int k) {
        this.key = k;
    }
    
    @Override
    public boolean lock(int k) {
        if (this.key == k) {
            isLocked = true;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean unlock(int k) {
        if (this.key == k) {
            isLocked = false;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean locked() {
        return isLocked;
    }
    
}


package ca.bcit.comp1510.lab11;

/**
 * Locks or unlocks the coin interface.
 * 
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public interface Lockable {
    
    /**
     * setKey(int key) establishes the key used to unlock.
     * @param key an int
     */
    void setKey(int key);

    /**
     * boolean lock(int key) locks the implementing object if 
     * the correct key is provided and returns true if the object was locked.
     * @param key an int
     * @return a boolean
     */
    boolean lock(int key);

    /**
     * boolean unlock(int key) unlocks the implementing object 
     * if the correct key is provided and returns true 
     * if the object was unlocked.
     * @param key an int
     * @return a boolean
     */
    boolean unlock(int key);

    /**
     * boolean locked() returns true if the implementing object is locked.
     * @return a boolean
     */
    boolean locked();
}

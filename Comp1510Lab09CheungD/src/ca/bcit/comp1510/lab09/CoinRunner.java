package ca.bcit.comp1510.lab09;

/**
 * Program flips a coin a hundred times and records heads and tails, the 
 * longest streak.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class CoinRunner {
    
    /**
     * Flips the coin 100 times.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Coin coin = new Coin();
        
        // given number of flips
        final int flips = 100;
        int longest = 0;
        int current = 0;

        for (int i = 0; i < flips; i++) {
            coin.flip();
            System.out.println((i + 1) + "." + coin);

            if (coin.isHeads()) {
                current++;
                
                if (current > longest) {
                    // update longest
                    longest = current;
                }
            } else {
                // reset current if tails 
                current = 0;
            }
        }

        System.out.println("The longest run of heads is: " + longest);
    }
}


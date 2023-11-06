package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Randomly draws a card from a standard deck.
 *
 * @author Dominic Cheung
 * @version 1.0
 */

public class CardGame {

    enum Rank {
        /**
         * Enumerated type for Rank1 in card game.
         */
        ace,

        /**
         * Enumerated type for Rank2 in card game.
         */
        two,

        /**
         * Enumerated type for Rank3 in card game.
         */
        three,

        /**
         * Enumerated type for Rank4 in card game.
         */
        four,

        /**
         * Enumerated type for Rank5 in card game.
         */
        five,

        /**
         * Enumerated type for Rank6 in card game.
         */
        six,

        /**
         * Enumerated type for Rank7 in card game.
         */
        seven,

        /**
         * Enumerated type for Rank8 in card game.
         */

        eight,
        /**
         * Enumerated type for Rank9 in card game.
         */

        nine,
        /**
         * Enumerated type for Rank10 in card game.
         */

        ten,
        /**
         * Enumerated type for Rank11 in card game.
         */

        jack,
        /**
         * Enumerated type for Rank12 in card game.
         */

        queen,
        /**
         * Enumerated type for Rank13 in card game.
         */

        king
    }

    enum Suits {

        /**
         * Enumerated type for Suits1 in card game.
         */
        hearts,

        /**
         * Enumerated type for Suits2 in card game.
         */
        diamonds,

        /**
         * Enumerated type for Suits3 in card game.
         */
        clubs,

        /**
         * Enumerated type for Suits4 in card game.
         */
        spades
    }

    /**
     * Drives the program.
     *
     * @param args unused
     */

    public static void main(String[] args) {
        // new random object
        Random card = new Random();
        
        // get int up to max of enum Rank length
        int randomGetRank = card.nextInt(Rank.values().length);
        // find the name of the corresponding Rank given the int
        Rank randomRank = Rank.values()[randomGetRank];
        
        // get int up to max of enum Suits length
        int randomGetSuits = card.nextInt(Suits.values().length);
        // find the name of the corresponding Rank given the int
        Suits randomSuits = Suits.values()[randomGetSuits];
        
        System.out.println("You have drawn: " + (randomRank) 
                + " of " + (randomSuits));

    }

}

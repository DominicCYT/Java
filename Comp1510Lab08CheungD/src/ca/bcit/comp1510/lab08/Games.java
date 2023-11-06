package ca.bcit.comp1510.lab08;

import java.util.Random;
import java.util.Scanner;

/**
 * It is all fun and games.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Games {

    /**
     * Private instance variable for score.
     * 
     * score an int
     */
    private int score;

    /**
     * Private instance variable for a scanner.
     * 
     * scan a Scanner
     */
    private Scanner scan;

    /**
     * Private instance variable for a random.
     * 
     * rng a Random
     */
    private Random rng;

    /**
     * constructor for Games.
     * 
     */
    public Games() {
        score = 0;
        scan = new Scanner(System.in);
        rng = new Random();

    }

    /**
     * Games menu options.
     * 
     */
    public void play() {
        String menu = "Welcome to the Games Program!" 
                + "\nMake your choice (enter a number): " 
                + "\n1. See your score "
                + "\n2. Guess a number " 
                + "\n3. Play Rock, Paper, Scissors " 
                + "\n4. Quit " 
                + "\n>";

        System.out.println(menu);

        do {
            
            if (scan.hasNextInt()) {
                int input = Integer.parseInt(scan.next());

                switch (input) {

                    case 1:
                        System.out.println("Your score is: " + score 
                                + "\n" + menu);
                        break;
                    case 2:
                        System.out.println(menu);
                        break;
                    case 3:
                        System.out.println(menu);
                        break;
                    case 4:
                        System.out.println("Bye!");
                        return;
                    default:
                        System.out.println("Please make another choice." 
                                + menu);
                }
                
            } else {
                System.out.println("Non-numbers not allowed. \n" + menu);
                scan.next();
            }
        } while (scan.hasNext());

    }

}

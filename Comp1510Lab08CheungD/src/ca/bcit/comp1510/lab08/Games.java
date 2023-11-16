package ca.bcit.comp1510.lab08;

import java.util.ArrayList;
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

        final int menu3 = 3;
        final int menu4 = 4;
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
                        guessANumber();
                        System.out.println(menu);
                        break;
                    case menu3:
                        rockPaperScissors();
                        System.out.println(menu);
                        break;
                    case menu4:
                        System.out.println("Bye!");
                        return;
                    default:
                        System.out.println("Invalid choice.\n" + menu);
                }
                
            } else {
                System.out.println("Invalid choice.\n" + menu);
                scan.next();
            }
        } while (scan.hasNext());

    }
    
    /**
     * Games menu option 3. Rock Paper Scissors.
     * 5 points for winning or else lose 3 points.
     * 
     */
    public void rockPaperScissors() {
        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS\n"
                + "Which one do you choose?");
        final int max = 3;
        final int win = 5;
        final int lose = 3;
        
        ArrayList<String> options = new ArrayList<String>();
        options.add("rock");
        options.add("paper");
        options.add("scissors");
        
        int pick = rng.nextInt(max);
        String computer = options.get(pick);
        System.out.println(computer);
        
        while (scan.hasNext()) {
            String player = (scan.next().trim().toLowerCase());
            if (player.equals("rock") || player.equals("paper") 
                    || player.equals("scissors")) {
                
                if (player.equals("rock") && computer.equals("scissors")
                        || player.equals("scissors") && computer.equals("paper")
                        || player.equals("paper") && computer.equals("rock")) {
                    System.out.println("You won! +5 points");
                    score = score + win;
                    return;
                    
                } else if (player.equals(computer)) {
                    System.out.println("Draw!");
                    return;
                                
                } else {
                    System.out.println("You lose! -3 points");
                    score = score - lose;
                    return;
                }
            } else {
                System.out.println("Invalid input. Try again:");
                //scan.next();
            } 
        }
        
    }

    /**
     * Games menu option 2. Guess a number between 0 and 100.
     * 5 points if under 5 tries.
     * 
     */
    public void guessANumber() {
        System.out.println("I've picked a random number between 0 and 100\n"
                + "Can you guess it?\nGuess the number!");
        final int limit = 101;
        final int max = 5;
        int counter = 0;
        int target = rng.nextInt(limit);
        
        System.out.println(target);
        while (scan.hasNext()) {
            
            if (scan.hasNextInt()) {
                
                int input = scan.nextInt();
                
                if (input > target) {
                    System.out.println("Too high, guess again!"
                            + "\nGuess the number!");
                    counter++;
                    
                } else if (input < target) {
                    System.out.println("Too low, guess again!"
                            + "\nGuess the number!");
                    counter++;
                    
                } else {
                    if (counter <= max) {
                        System.out.println("RIGHT!\nFive Points!");
                        score = score + max;
                    } else {
                        System.out.println("RIGHT!");
                    }
                    
                    return;
                }
                
            } else {
                System.out.println("Non-numbers not allowed.\n"
                        + "Guess the number!");
                scan.next();
            }
        }         
    }
}

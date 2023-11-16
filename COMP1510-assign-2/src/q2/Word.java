package q2;

/**
 * Word constructor, setter and getter, and toString.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Word implements Comparable <Word> {

    /**
     * Private instance variable for word.
     * 
     * word a String
     */
    private final String word;
    
    /**
     * Private instance variable for frequency.
     * 
     * frequency an int
     */
    private int frequency;
    
    /**
     * constructor for Word. Frequency initially set to 1.
     * 
     * @param w a String
     */
    public Word(String w) {
        word = w;
        frequency = 1;
    }
    
    /**
     * getter for word.
     * @return word a String
     */
    public String getWord() {
        return word;
    }
    
    /**
     * getter for frequency.
     * @return frequency an int
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * method to increment frequency.
     * @return frequency an int
     */
    public int incFrequency() {
        frequency++;
        return frequency;
    }
    
    /**
     * Returns a String of word info.
     * 
     * @return toString concats the info together
     */
    public String toString() {
        String wordInfo = "Word: " + (word) 
                + "\nFrequency: " + (frequency) + "\n";

        return wordInfo;
    }
    
    /**
     * Returns an int of a word with higher frequency.
     * 
     * @param input is the word
     * @return compareTo returns an int that tells you which Word comes first
     */
    public int compareTo(Word input) {
        
        int result = 0;
        int x = input.getFrequency();
        
        if (frequency > x) {
            result = -1;
        }         
        
        if (frequency < x) {
            result = 1;
        }
            
        return result;
    }
   
}

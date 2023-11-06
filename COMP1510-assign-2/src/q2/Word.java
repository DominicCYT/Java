package q2;

/**
 * Word constructor, setter and getter, and toString.
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class Word {

    /**
     * Private instance variable for word.
     * 
     * word a String
     */
    private final String WORD;
    
    /**
     * Private instance variable for frequency.
     * 
     * frequency an int
     */
    private int frequency;
    
    /**
     * constructor for Word.
     * 
     * @param w a String
     */
    public Word(String w) {
        WORD = w;
        frequency = 1;
    }
    
    /**
     * getter for WORD.
     * @return the WORD
     */
    public String getWord() {
        return WORD;
    }
    
    /**
     * getter for frequency.
     * @return the frequency
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * method to increment frequency.
     * @return the frequency
     */
    public int incFrequency() {
        frequency = frequency + 1;
        return frequency;
    }
    
    /**
     * Returns a String of WORD info.
     * 
     * @return toString concats the info together
     */
    public String toString() {
        String wordInfo = "Word: " + (WORD) 
                + "\nFrequency: " + (frequency);

        return wordInfo;
    }
    
    /**
     * Returns an int of a word with higher frequency.
     * 
     * @return compareTo returns an int that tells you which Word comes first
     */
    public int compareTo(Word input) {
        
        int result = 0;
        int x = input.getFrequency();
        
        if (frequency > x) 
            result = -1;      
        
        if (frequency < x) 
            result = 1;
        
        return result;
    }
}

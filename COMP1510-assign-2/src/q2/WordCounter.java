package q2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

/**
 * <p>
 * This program will tell you how many distinct words there
 * are in the enclosed text file which is a plain text copy of the 
 * King James Bible, available from Project Gutenberg.
 * A word here is assumed to be delimited by a space.
 * </p>
 *
 * @author Dominic Cheung, Set C
 * @version 1.0
 */
public class WordCounter {

    /**
     * ArrayList to store the Word objects.
     * new private instance variable
     */
    private List<Word> listOfWord = new ArrayList<Word>();

    private int parseBook(String fileName) throws FileNotFoundException {
        
        Scanner fileScan = new Scanner(new File(fileName));
        
        // default delimiter is a space.
        while (fileScan.hasNext()) {
            // avoid case issues and white spaces
            String currentWord = fileScan.next().toLowerCase().trim();
            
            // store the first word to get the list size to be bigger than 0
            if (listOfWord.size() == 0) {
                listOfWord.add(new Word(currentWord));

            } else {
                int i = searchWord(currentWord);
                // if searchWord finds it, it will be larger than or equal to 0
                if (i >= 0) {
                    listOfWord.get(i).incFrequency();
                
                } else {
                    // if searchWord does NOT find it, it will add to list
                    listOfWord.add(new Word(currentWord));
                }     

            }
        }
        return listOfWord.size();
    }
    
    // prints the top n words as requested
    private void printTopWords(int n) {
        
        /* hinted in instructions; calling the List sort method 
         with a null parameter will sort the list according 
         to Word's compareTo method */
        
        listOfWord.sort(null);
        
        // prints the word
        for (int i = 0; i < n; i++) {
            System.out.println(listOfWord.get(i));
            
            // For some reason the first "the" has length of 4.
            //System.out.println(listOfWord.get(i).getWord().length());
        }
    }
    
    private int searchWord(String currentWord) {
        for (int i = 0; i < listOfWord.size(); i++) {

            if (listOfWord.get(i).getWord().equals(currentWord)) {
                return i;
            } 
        } return -1;
    }
    

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * Will give you the top 10 words in the bible.txt file. Do note that
     * as mentioned earlier, further parsing to define a word may require regex
     * or even import a proper dictionary to compare words, which are beyond 
     * ch6 material.
     * </p>
     *
     * @param args command line arguments unused.
     * @throws FileNotFoundException if file not there
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        // new object created to run the methods.
        WordCounter wordCounter = new WordCounter();
        System.out.println("The total number of words in the file is:");
        
        // print the total word count of specified file
        System.out.println(wordCounter.parseBook("bible.txt"));
        
        // set the specified number of words to print and its frequency
        final int requestedN = 10;
        System.out.println("\nThe top 10 words and its frequency:");
        wordCounter.printTopWords(requestedN);

    }

}

package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line of the file
 * contains a name followed by a list of symbols indicating the result of each
 * at bat: h for hit, o for out, w for walk, s for sacrifice. Statistics are
 * computed and printed for each player.
 * 
 * @author blink
 * @version 2
 */

public class BaseballStats {

    /**
     * Reads baseball stats from a file and counts total hits, outs, walks, and
     * sacrifice flies for each player.
     * 
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {
        String fileName;
        Scanner fileScan;
        Scanner lineScan;

        // Input name of file to scan
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();

        fileScan = new Scanner(new File(fileName));
        // show entire file
        // while (fileScan.hasNext()) {
        // System.out.println(fileScan.nextLine());
        // }

        while (fileScan.hasNext()) {
            String line = fileScan.nextLine();
            //System.out.println("Line entry: " + line);

            lineScan = new Scanner(line);
            lineScan.useDelimiter(",");
            String player = lineScan.next();
            System.out.println("Player Name: " + player);
           
            int hcount = 0;
            int ocount = 0;
            int wcount = 0;
            int scount = 0;
            
            while (lineScan.hasNext()) {
                // print each part
                // System.out.println(" " + lineScan.next());

                String linenow = lineScan.next();
                
                if (linenow.charAt(0) == 'h') {
                    hcount++;
                
                } 
                if (linenow.charAt(0) == 'o') {
                    ocount++;
  
                } 
                if (linenow.charAt(0) == 'w') {
                    wcount++;
                    
                } 
                if (linenow.charAt(0) == 's') {
                    scount++;
                    
                }     

            }
            System.out.println("Number of hits: " + hcount);
            System.out.println("Number of outs: " + ocount);
            System.out.println("Number of walks: " + wcount);
            System.out.println("Number of sacrifices: " + scount);
        } 

        scan.close();
    }
}

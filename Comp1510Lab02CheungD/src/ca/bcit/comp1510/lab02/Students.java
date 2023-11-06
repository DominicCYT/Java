package ca.bcit.comp1510.lab02;

/**
 * A table of student grades.
 * 
 * @author Dominic Cheung
 * @version 1.0
 */

public class Students {
    /**
     * Drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        //printing the top border
        System.out.println("///////////////////"
                + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        
        //printing the Student Points title
        System.out.println("== \t    Student Points \t    ==");
        
        //printing the bottom border
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                + "///////////////////");
        
        //printing the column headers
        System.out.println("Name" + "\t" + "\tLab" + "\tBonus" + "\tTotal");
        System.out.println("____" + "\t" + "\t___" + "\t_____" + "\t_____");
        
        //update variables for use in formatted print
        String name1 = "Joe";
        final int lab1 = 43;
        final int bonus1 = 7;
        final int total1 = 50;
        
        String name2 = "William";
        final int lab2 = 50;
        final int bonus2 = 8;
        final int total2 = 58;
        
        String name3 = "Mary Sue";
        final int lab3 = 39;
        final int bonus3 = 10;
        final int total3 = 49;
        
        String name4 = "Peng";
        final int lab4 = 87;
        final int bonus4 = 6;
        final int total4 = 93;
        
        String name5 = "Kwon";
        final int lab5 = 99;
        final int bonus5 = 0;
        final int total5 = 99;
        
        //print formatted lines
        System.out.printf("\n%s" + "\t" + "\t" + "%2d" + "\t" + "%2d" 
                + "\t" + "%2d", name1, lab1, bonus1, total1);
        System.out.printf("\n%s" + "\t" + "\t" + "%2d" + "\t" + "%2d" 
                + "\t" + "%2d", name2, lab2, bonus2, total2);
        System.out.printf("\n%s" + "\t" + "%2d" + "\t" + "%2d" 
                + "\t" + "%2d", name3, lab3, bonus3, total3);
        System.out.printf("\n%s" + "\t" + "\t" + "%2d" + "\t" + "%2d" 
                + "\t" + "%2d", name4, lab4, bonus4, total4);
        System.out.printf("\n%s" + "\t" + "\t" + "%2d" + "\t" + "%2d" 
                + "\t" + "%2d", name5, lab5, bonus5, total5);
        
    }
}

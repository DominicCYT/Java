package ca.bcit.comp1510.lab01;

/**
 * Prints the line "I love Java".
 * 
 * @author Dominic Cheung
 * @version 1.0
 */

public class Simple {

    /**
     * Simple print line.
     * @param args unused
.... */

    public static void main(String[] args) {
        // Print in new line "I love Java"
        System.out.println("I love Java");

    }

}

/*
1. simple (why is this different from the first)
This is different from the first because the case is different.
While a valid identifier, it says it must be defined it its own file. 
Remedies include renaming the file to simple.java
or changing it back to Simple.

Error: Could not find or load main class ca.bcit.comp1510.lab01.Simple
Caused by: java.lang.NoClassDefFoundError: ca/bcit/comp1510/lab01/simple 

2. SimpleProgram
While a valid identifier, it says it must be defined it its own file. 
Remedies include renaming the file to SimpleProgram.java
or changing back to Simple

Error: Could not find or load main class ca.bcit.comp1510.lab01.Simple
Caused by: java.lang.ClassNotFoundException: ca.bcit.comp1510.lab01.Simple

3. 1 Simple
Identifiers cannot begin with numbers. 
Syntax error on "token 1" and it suggests to delete.

Error: Could not find or load main class ca.bcit.comp1510.lab01.Simple
Caused by: java.lang.ClassNotFoundException: ca.bcit.comp1510.lab01.Simple

4. _Simple_
Identifiers should not begin with underscore (but allowed). 
However it also suggests to rename file to _Simple_ 
and if you do it would work.

Error: Could not find or load main class ca.bcit.comp1510.lab01.Simple
Caused by: java.lang.ClassNotFoundException: ca.bcit.comp1510.lab01.Simple

5. *Simple*
Identifiers cannot contain the * symbol so it is not recognized.

Error: Could not find or load main class ca.bcit.comp1510.lab01.Simple
Caused by: java.lang.ClassNotFoundException: ca.bcit.comp1510.lab01.Simple

6. $123_45
Identifiers should not begin with $ (but allowed). 
However it also suggests to rename file to $123_45 
and if you do it would work.

 Error: Could not find or load main class ca.bcit.comp1510.lab01.Simple
Caused by: java.lang.ClassNotFoundException: ca.bcit.comp1510.lab01.Simple

7. Simple
This is a class that follows the title case convention and 
successfully prints the line*/

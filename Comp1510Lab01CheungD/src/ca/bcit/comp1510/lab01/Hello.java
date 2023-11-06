package ca.bcit.comp1510.lab01;

/**
 * Prints a Hello World message.
 * 
 * @author BCIT
 * @version 2022
 */

public class Hello {
    /**
    * Prints the greeting.
    * @param args unused
    */

    public static void main(String[] args) {

        System.out.println("Hello world!");

    }

}

/*
a. Class name different from file name. 
Delete one l (el) from the name of the class 
(so the first non-comment line is public class Helo), 
save the program, and recompile it. What was the error message?

The public type Helo must be defined in its own file. 
It suggests to rename file to Helo or change the class name back to Hello.

Error: Could not find or load main class ca.bcit.comp1510.lab01.Hello
Caused by: java.lang.ClassNotFoundException: ca.bcit.comp1510.lab01.Hello

b. Misspelling inside string. 
Correct the mistake above, then delete one l from the Hello 
in the message to be printed (inside the quotation marks).
Save the program and recompile it. 
There is no error message—why not? Now run the program. What has changed?

There is no error message because the syntax is correct. 
Whatever is inside the "" in the print function will be showed as-is.
As a result the printed message is now "Helo world!"

c. No ending quotation mark in a string literal. 
Correct the spelling in the string, 
then delete the ending quotation mark enclosing the string Hello, World!. 
Save the program and recompile it. What error message(s) do you get?

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
String literal is not properly closed by a double-quote
at ca.bcit.comp1510.lab01.Hello.main(Hello.java:19)

d. No beginning quotation mark in a string literal. 
Put the ending quotation mark back, then take out the beginning one. 
Save and recompile. How many errors this time? 
Lots, even though there is really only one error. 
Pro-tip: When you get lots of errors always concentrate on finding the 
first one listed. Often fixing that first error will fix the rest.

There are now three errors. 
This is because it is probably expecting a string but 
instead got potential identifiers so it is throwing syntax errors.
! probably has special meaning and it is showing an error 
because it is not a string anymore outside of "".

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
Syntax error on token(s), misplaced construct(s)
Syntax error on token "!", ; expected
String literal is not properly closed by a double-quote
at ca.bcit.comp1510.lab01.Hello.main(Hello.java:19)

e. No semicolon after a statement. Fix the last error 
(put the quotation mark back).
Now remove the semicolon at the end of the line that prints the message. 
Save the program and recompile it. What error message(s) do you get?

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
Syntax error, insert ";" to complete BlockStatements
at ca.bcit.comp1510.lab01.Hello.main(Hello.java:19)*/

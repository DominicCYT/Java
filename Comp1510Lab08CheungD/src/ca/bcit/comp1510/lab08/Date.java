package ca.bcit.comp1510.lab08;

import java.util.Scanner;


/**
 * Represent a valid Gregorian date on or after 24 February 1582.
 * @author blink
 * @version 1.0
 */
public class Date {
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    /**
     * constructor for Date.
     * @param theDay an int
     * @param theMonth an int
     * @param theYear an int
     */
    public Date(int theDay, int theMonth, int theYear) {
        // fill this code in and only store a valid date.  
        // throw exception if parameters are not a valid date
             
        boolean leapYear = isLeapYear(theYear);
        boolean validDate = isDateValid(theDay, theMonth, theYear);
        
        if (validDate) {
            
            day = theDay;
            month = theMonth;
            year = theYear;
            
            System.out.println("Date is valid and it is " 
                    + (leapYear ? "" : "not ")
                    + "a leap year.");   
            
        } else {
            System.out.println("Date is invalid");
        }

    }
    
    
    /**
     * getter for day.
     * @return day
     */
    public int getDay() {
        return day;
    }


    /**
     * setter for day.
     * @param day an int
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * getter for month.
     * @return month
     */
    public int getMonth() {
        return month;
    }


    /**
     * setter for month.
     * @param month an int
     */
    public void setMonth(int month) {
        this.month = month;
    }


    /**
     * getter for year.
     * @return year
     */
    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
    }


    /**
     * setter for year.
     * @param year an int
     */
    public void setYear(int year) {
        this.year = year;
    }



    /**
     * Check if day is 1-31 for appropriate month.
     * @param d an int
     * @param m an int
     * @param y an int
     * @return true if valid false otherwise.
     */
    public static boolean isDayValid(int d, int m, int y) {
        final int maxDays = daysInMonth(m, isLeapYear(y));
        
        return ((d > 0) && (d <= maxDays));   
    }
    
    
    /**
     * Check if month is 1-12.
     * @param m an int
     * @return true if 1-12 false otherwise.
     */
    public static boolean isMonthValid(int m) {
        final int maxMonths = 12;
        
        return ((m > 0) && (m <= maxMonths));   
    }
    
    /**
     * Check if year is 1582-2999.
     * @param year an int
     * @return true if between valid years false otherwise.
     */
    public static boolean isYearValid(int year) {
        final int minYear = 1582;
        final int maxYear = 2999;
        
        return ((year >= minYear) && (year <= maxYear));
    }
        
    /**
     * Check for leap year. If divisible by 400 OR by 4 AND not 100.
     * @param year an int
     * @return true if valid false otherwise.
     */
    public static boolean isLeapYear(int year) {
        final int leapYear400 = 400;
        final int leapYear4 = 4;
        final int leapYear100 = 100;
         
        return (year % leapYear400 == 0 
                || (year % leapYear4 == 0 && year % leapYear100 != 0));

    }
    /**
     * Check for max days given valid month.
     * @param month an int
     * @param isLeapYear a boolean
     * @return max days
     */
    
    public static int daysInMonth(int month, boolean isLeapYear) {
        final int maxDays31 = 31;
        final int maxDays30 = 30;
        final int maxDays28 = 28;
        final int maxDays29 = 29;
        final int mar = 3;
        final int apr = 4;
        final int may = 5;
        final int jun = 6;
        final int jul = 7;
        final int aug = 8;
        final int sep = 9;
        final int oct = 10;
        final int nov = 11;
        final int dec = 12;
        
        if (isMonthValid(month)) {
            switch (month) {
                case 1:
                    return maxDays31;
                case 2:
                    return (isLeapYear) ? maxDays29 : maxDays28; 
                case mar:
                    return maxDays31;
                case apr:
                    return maxDays30;
                case may:
                    return maxDays31;
                case jun:
                    return maxDays30;
                case jul:
                    return maxDays31;
                case aug:
                    return maxDays31;
                case sep:
                    return maxDays30;
                case oct:
                    return maxDays31;
                case nov:
                    return maxDays30;
                case dec:
                    return maxDays31;
                default:
                    return 0;
            }
        } else {
            return 0;
        }   
    }
    
    /**
     * Check if date is bigger than 24 Feb, 1582.
     * @param day an int
     * @param month an int
     * @param year an int
     * @return boolean
     */
    public static boolean isDateValid(int day, int month, int year) {
        
        final int minYear = 1582;
        final int minDay = 24;
        
        if (isYearValid(year) && isMonthValid(month) 
                && isDayValid(day, month, year)) {
             
            return (year > minYear || month > 2 
                    || (month == 2 && day >= minDay));          
        } else {
            return false;
        }
                 
    }
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) { 
        //date read in from user
        //int month, day, year;
        //true if parts of input from user is valid
        //boolean monthValid, yearValid, dayValid;  
        //number of days in month read in
        //int daysInMonth;
        //true if user's year is a leap year
        //boolean leapYear;
        
        Scanner scan = new Scanner(System.in);
        //Get integer month, day, and year from user
        
        System.out.println("Please enter year (1582-2999): ");
        while (scan.hasNext()) {
            
            if (scan.hasNextInt()) {
                
                int year = scan.nextInt();
                System.out.println("Please enter month (1-12): ");
                int month = scan.nextInt();
                System.out.println("Please enter day (1-31): ");
                int day = scan.nextInt();
                
                //Use the methods to check to see if month is valid
                //boolean monthValid = isMonthValid(month);
                //Use the methods to check to see if year is valid
                //boolean yearValid = isYearValid(year);
                //Use the methods to determine whether it's a leap year
                boolean leapYear = isLeapYear(year);
                //Use the methods to determine number of days in month
                //int daysInMonth = daysInMonth(month, leapYear);
                //Use the methods to see if day is valid
                //boolean dayValid = isDayValid(day, month, year);
                //Use the methods to determine whether date is valid
                //and print appropriate message
                
                if (isDateValid(day, month, year)) {
                    System.out.println("Date is valid and it is " 
                            + (leapYear ? "" : "not ")
                            + "a leap year.");
                    //Create a Date object with month, day, year
                    //Date date = new Date(day, month, year);
                    //System.out.println(date);
                    scan.close();
                    return;
                } else {
                    System.out.println("Date is invalid");
                    scan.close();
                    return;
                }
                
            } else {
                System.out.println("Invalid input. Please try again: ");
                scan.next();
            }
            
        }   scan.close();       
    } 
} 

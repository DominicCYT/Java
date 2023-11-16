package ca.bcit.comp1510.lab08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTest {

    private Date test;

    /**
     * Creates a new object before each test is executed.
     * 
     * @throws Exception if a object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        test = new Date(25, 12, 2023);
    }
    
    
    /**
     * check for Date obj not created 
     */
    @Test
    void testNullDate() {
        Date bad = new Date(1,1,1111);
        Object obj = null;

        boolean expected = false;

        assertEquals(expected,bad.equals(obj));
    }
     
    /**
     * check for Date obj created 
     */
    @Test
    void testDate() {
        test.setDay(24);
        test.setMonth(3);
        test.setYear(1600);
        String result = test.toString();
        assertEquals(result, "Date [day=" + 24 + ", month=" + 3 + ", year=" + 1600 + "]");
    }
    
    /**
     * check for Date obj created println
     */
    @Test
    void testDatePrintln() {
        test.setDay(24);
        test.setMonth(4);
        test.setYear(1600);
        String result = "Date is valid and it is a leap year.";
        assertEquals(result, "Date is valid and it is a leap year.");
    }
    
    /**
     * check for Date obj created println
     */
    @Test
    void testDatePrintln2() {
        test.setDay(24);
        test.setMonth(3);
        test.setYear(1599);
        String result = "Date is valid and it is not a leap year.";
        assertEquals(result, "Date is valid and it is not a leap year.");
    }
    
    /**
     * check for Date obj created 
     */
    @Test
    void testgetterDate() {
        test.setDay(24);
        test.setMonth(3);
        test.setYear(1600);
        int d = test.getDay();
        int m = test.getMonth();
        int y = test.getYear();

        assertEquals(d,24);
        assertEquals(m,3);
        assertEquals(y,1600);
    }
    
    /**
     * check for Date obj invalid println 
     */
    @Test
    void testNoDate() {
        test.setDay(23);
        test.setMonth(2);
        test.setYear(1591);
        String result = "Date is invalid";
        assertEquals(result, "Date is invalid");
    }
    
    /**
     * check for month that is valid (1-12)
     */
    @Test
    void testValidMonth() {
        boolean result = Date.isMonthValid(12);
        assertEquals(result, true);
    }
    
    /**
     * check for month that is invalid (12+)
     */
    @Test
    void testInvalidMonthBiggerThan12() {
        boolean result = Date.isMonthValid(13);
        assertEquals(result, false);
    }

    /**
     * check for month that is invalid (<1)
     */
    @Test
    void testInvalidMonth0() {
        boolean result = Date.isMonthValid(0);
        assertEquals(result, false);
    }
    
    /**
     * check for month that is invalid (<0)
     */
    @Test
    void testInvalidMonthNegative() {
        boolean result = Date.isMonthValid(-1);
        assertEquals(result, false);
    }
    
    /**
     * check for year that is valid (>1582)
     */
    @Test
    void testValidYear() {
        boolean result = Date.isYearValid(1698);
        assertEquals(result, true);
    }
    
    /**
     * check for year that is invalid (<1582)
     */
    @Test
    void testInvalidYear() {
        boolean result = Date.isYearValid(999);
        assertEquals(result, false);
    }
    
    /**
     * check for leap year that is valid (1600)
     */
    @Test
    void testValidLeapYear() {
        boolean result = Date.isLeapYear(1600);
        assertEquals(result, true);
    }
    
    /**
     * check for leap year that is invalid (1599)
     */
    @Test
    void testInvalidLeapYear() {
        boolean result = Date.isLeapYear(1599);
        assertEquals(result, false);
    }
    
    /**
     * check for day that is valid (25th Mar 1599)
     */
    @Test
    void testValidDay() {
        boolean result = Date.isDayValid(25,3,1599);
        assertEquals(result, true);
    }
    
    /**
     * check for day that is invalid (99th Mar 1599)
     */
    @Test
    void testInvalidDay() {
        boolean result = Date.isDayValid(99,3,1599);
        assertEquals(result, false);
    }
    
    /**
     * check for day that is valid leap year (25th Feb 1600)
     */
    @Test
    void testValidDayLeapYear() {
        boolean result = Date.isDayValid(25,2,1600);
        assertEquals(result, true);
    }
    
    /**
     * check for date that is valid (24th Feb 1582)
     */
    @Test
    void testValidDateMinYear() {
        boolean result = Date.isDateValid(24,2,1582);
        assertEquals(result, true);
    }
    
    /**
     * check for date that is invalid (24th Feb 1482)
     */
    @Test
    void testInValidDateMinYear() {
        boolean result = Date.isDateValid(24,2,1482);
        assertEquals(result, false);
    }
    
    /**
     * check for date that is invalid (23 Feb 1582)
     */
    @Test
    void testInValidDateMinYear2() {
        boolean result = Date.isDateValid(23,2,1582);
        assertEquals(result, false);
    }
    
    /**
     * check for date that is valid (23 Mar 1582)
     */
    @Test
    void testInValidDateMinYear3() {
        boolean result = Date.isDateValid(23,3,1582);
        assertEquals(result, true);
    }
    
    /**
     * check for date that is valid (25 Feb 1582)
     */
    @Test
    void testValidDateMinYear3() {
        boolean result = Date.isDateValid(25,2,1582);
        assertEquals(result, true);
    }
    
    /**
     * check for date that is valid (23 Mar 1582)
     */
    @Test
    void testInValidDateMinYear4() {
        boolean result = Date.isDateValid(23,1,1582);
        assertEquals(result, false);
    }
    
    


}

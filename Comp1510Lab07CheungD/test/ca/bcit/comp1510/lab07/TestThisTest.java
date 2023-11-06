package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestThisTest {

    private TestThis test;

    /**
     * Creates a new object before each test is executed.
     * 
     * @throws Exception if a object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        test = new TestThis();
    }

    /**
     * check for all orders in (a b c) (b c a) etc
     * check for negatives and 0
     * parameterized test
     */
    @Test
    void testLargestFirst() {
        int biggest = test.largest(7,8,9);
        assertEquals(9,biggest);
    }
    @Test
    void testLargestSecond() {
        int biggest = test.largest(7, 9, 8);
        assertEquals(9, biggest);
    }
    @Test
    void testLargestThird() {
        int biggest = test.largest(9, 7, 8);
        assertEquals(9, biggest);
    }
    
    @Test
    void testLargestNegative() {
        int biggest = test.largest(-9, -7, -8);
        assertEquals(-7, biggest);
    }
    
    @Test
    void testLargestZero() {
        int biggest = test.largest(-9, -7, 0);
        assertEquals(0, biggest);
    }

    @Test
    void testLargestListOneValue() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        int biggest = test.largest(list);
        assertEquals(10, biggest);
    }
    
    @Test
    void testLargestListThreeValues() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(9);
        list.add(8);
        int biggest = test.largest(list);
        assertEquals(10, biggest);
    }
    
    @Test
    void testLargestListThreeValuesOutOfOrder() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(10);
        list.add(8);
        int biggest = test.largest(list);
        assertEquals(10, biggest);
    }
    
    @Test
    void testLargestListFiveValuesWithNegative() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-9);
        list.add(-10);
        list.add(-7);
        list.add(-6);
        list.add(-8);
        int biggest = test.largest(list);
        assertEquals(-6, biggest);
    }
    
    @Test
    void testLargestListFiveValuesWithNegativeAndLarge() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(10);
        list.add(999);
        list.add(0);
        list.add(-8);
        int biggest = test.largest(list);
        assertEquals(999, biggest);
    }
}

package ca.bcit.comp1510.lab09;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ComplexTest {

    @Test
    public void testEquals() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(3, 4);
        assertEquals(z1, z2);
    }

    @Test
    public void testReciprocal() {
        Complex z1 = new Complex(3, 4);
        Complex reciprocal = z1.reciprocal();
        assertEquals(0.12, reciprocal.re, 0.01);
        assertEquals(-0.16, reciprocal.im, 0.01);
    }

    @Test
    public void testMath() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 1);

        Complex sum = z1.add(z2);
        Complex diff = z1.subtract(z2);
        Complex prod = z1.multiply(z2);
        Complex quot = z1.divide(z2);

        assertEquals(new Complex(4, 5), sum);
        assertEquals(new Complex(2, 3), diff);
        assertEquals(new Complex(-1, 7), prod);
        assertEquals(new Complex(3.5, 0.5), quot);

        Complex ii = Complex.I.multiply(Complex.I);
        assertEquals(Complex.I.multiply(Complex.I), ii);
    }

    @Test
    public void testDivisionByZero() {
    Assertions.assertThrows(IllegalArgumentException.class, 
    () -> { Complex.ONE.divide(Complex.ZERO); });
    }

     
    @Test
    public void testReciprocalOfZero() {
    Assertions.assertThrows(IllegalArgumentException.class,
    () -> { Complex.ZERO.reciprocal(); });
    }

    
    @Test
    public void testOtherComplexFunctions() {
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 1);

        double piDiv4 = Math.PI / 4.0;
        Complex minusOne = Complex.ZERO.subtract(Complex.ONE);
        Complex πi = new Complex(0.0, Math.PI);

        assertEquals(5.0, z1.abs(), 0.01);
        assertEquals(1.0, Complex.I.abs(), 0.01);
        assertEquals(z2.arg(), piDiv4, 0.01);
        assertEquals(Complex.I.arg(), Math.PI / 2.0, 0.01);
        assertEquals(Math.PI, minusOne.arg(), 0.01);
        
        //assertEquals(z1, z1.log().exp());
        //assertEquals(z1, z1.exp().log());
        //assertEquals(z1.log().exp(), z1.exp().log());
        
        //Complex expPii = πi.exp().add(Complex.ONE);
        //assertEquals(πi.exp().add(Complex.ONE), expPii);


    }
}

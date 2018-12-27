/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author suley
 */
public class CalculClassTest {
    
    public CalculClassTest() {
    }
    CalculClass calc ;
    @Before
    public void setUp() {
        calc = new CalculClass();
        System.err.println("Invocation de Before");
    }

    /**
     * Test of addition method, of class CalculClass.
     */
    @Test
    public void testAddition() {
        assertEquals("Test addition a echoué", 4, calc.addition(2, 2));
        assertNotEquals("Test addition a echoué", 6, calc.addition(2, 2));
        assertEquals("Test addition a echoué", 0, calc.addition(0, 0));
        assertEquals("Test addition a echoué", -4, calc.addition(-2, -2));
        System.out.println("Invocation de testaddition");
    }

    /**
     * Test of multiplication method, of class CalculClass.
     */
    @Test
    public void testMultiplication() {
        assertEquals("Test multplication a echoué", 4, calc.multiplication(-2, -2));
        assertEquals("Test multplication a echoué", 0, calc.multiplication(0, 0));
        assertEquals("Test multplication a echoué", 6, calc.multiplication(-3, -2));
        System.out.println("Invocation de testmultiplication");
    }
    @Test
    public void testsoustraction() {
        assertEquals("Test soustraction a echoué", 4, calc.soustraction(-2, -2));
        assertEquals("Test soustraction a echoué", 0, calc.soustraction(0, 0));
        assertEquals("Test soustraction a echoué", 6, calc.soustraction(-4, -2));
        System.out.println("Invocation de testsoustraction");
    }@Test
    public void testdivision() {
        assertEquals("Test division a echoué", 4, calc.division(-2, -2));
        assertEquals("Test division a echoué", 0, calc.division(0, 0));
        assertEquals("Test division a echoué", 6, calc.division(-4, -2));
        System.out.println("Invocation de testdivision");
    }
    
}

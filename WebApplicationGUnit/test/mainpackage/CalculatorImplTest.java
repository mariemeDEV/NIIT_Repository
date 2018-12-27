/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author suley
 */
public class CalculatorImplTest {
    

    @Test
    public void testAddition() {
        System.out.println("additionition");
        int a, b, res;
        CalculatorImpl calc = new CalculatorImpl();
	a = 5; 
        b  = 5;
        res = a + b;
        int resultattendu= calc.addition(a, b);
	if (resultattendu != res) {
		fail("a et b positif");
        }
	a = 0; 
        b  = 5; 
        res = a + b;
	if (calc.addition(a, b) != res) {
		fail("a nul");
        }
	a = 5; 
        b  = 0; 
        res = a + b;
	if (calc.addition(a, b) != res) {
		fail("b nul");
        }
	a = 0; 
        b  = 0; 
        res = a + b;
	if (calc.addition(a, b) != res) {
		fail("a et b nuls");
        }
	a = -5; 
        b  = 5; 
        res = a + b;
	if (calc.addition(a, b) != res) {
		fail("a negatif");
        }
	a = 5; 
        b  = -5; 
        res = a + b;
	if (calc.addition(a, b) != res) {
		fail("b negatif");
        }
	a = -5; 
        b  = -5; 
        res = a + b;
	if (calc.addition(a, b) != res) {
		fail("a et b negatif");
        }
    }

    /**
     * Test of soustrat method, of class CalculatorImpl.
     */
    @Test
    public void testSoustrat() {
        System.out.println("soustrat");
        int a, b, res;
        CalculatorImpl calc = new CalculatorImpl();
	a = 5; 
        b  = 5;
        res = a - b;
        int resultattendu= calc.soustrat(a, b);
	if (resultattendu != res) {
		fail("a et b positif");
        }
	a = 0; 
        b  = 5; 
        res = a - b;
	if (calc.soustrat(a, b) != res) {
		fail("a nul");
        }
	a = 5; 
        b  = 0; 
        res = a - b;
	if (calc.soustrat(a, b) != res) {
		fail("b nul");
        }
	a = 0; 
        b  = 0; 
        res = a - b;
	if (calc.soustrat(a, b) != res) {
		fail("a et b nuls");
        }
	a = -5; 
        b  = 5; 
        res = a - b;
	if (calc.soustrat(a, b) != res) {
		fail("a negatif");
        }
	a = 5; 
        b  = -5; 
        res = a - b;
	if (calc.soustrat(a, b) != res) {
		fail("b negatif");
        }
	a = -5; 
        b  = -5; 
        res = a - b;
	if (calc.soustrat(a, b) != res) {
		fail("a et b negatif");
        }
    }

    /**
     * Test of multiply method, of class CalculatorImpl.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a, b ,res ;
         a = 0;
         b = 0;
        CalculatorImpl instance = new CalculatorImpl();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals("The test case is a prototype.", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test (expected = ArithmeticException.class)
    public final void testDivideByZero() {
	CalculatorImpl calc = new CalculatorImpl();
	int a, b, res;
	a = 5; 
        b  = 0; 
        res = 0;
	if (calc.division(a, b) != res) {
		fail("b nul");
        }
	a = 0; 
        b  = 0; 
        res = 0;
	if (calc.division(a, b) != res) {
		fail("a et b nuls");
        }
}

    @Test
public final void testDivide() {
	CalculatorImpl calc = new CalculatorImpl();
	int a, b, res;
	a = 5; 
        b  = 5; 
        res = a / b;
	if (calc.division(a, b) != res) {
		fail("a et b positif");
        }
	a = 0; 
        b  = 5; 
        res = a / b;
	if (calc.division(a, b) != res) {
		fail("a nul");
        }
	a = -5; 
        b  = 5; 
        res = a / b;
	if (calc.division(a, b) != res) {
		fail("a negatif");
        }
	a = 5; 
        b  = -5; 
        res = a / b;
	if (calc.division(a, b) != res) {
		fail("b negatif");
        }
	a = -5; 
        b  = -5; 
        res = a / b;
	if (calc.division(a, b) != res) {
		fail("a et b negatif");
        }
}
}

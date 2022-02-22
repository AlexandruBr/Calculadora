/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        Calculadora calcu=new Calculadora(20,10);
        int expResult = 30;
        int result = calcu.suma();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        Calculadora calcu=new Calculadora(20,10);
        int expResult = 10;
        int result = calcu.resta();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta2 method, of class Calculadora.
     */
    @Test
    public void testResta2() {
        Calculadora calcu=new Calculadora(20,10);
        boolean result = calcu.resta2();
        assertTrue(result);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        Calculadora calcu=new Calculadora(20,10);
        int expResult = 200;
        int result = calcu.multiplica();
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        Calculadora calcu=new Calculadora(20,10);
        int expResult = 2;
        int result = calcu.divide();
        assertEquals(expResult, result);
    }

    /**
     * Test of divide2 method, of class Calculadora.
     */
    @Test
    public void testDivide2() {
        Calculadora calcu=new Calculadora(20,10);
        Integer result = calcu.divide2();
        assertNull(result);
    }

    /**
     * Test of divide0 method, of class Calculadora.
     */
    @Test (expected = java.lang.ArithmeticException.class)
    public void testDivide0() {
        Calculadora calcu=new Calculadora(20,0);
        Integer result = calcu.divide0();
    }
    
}

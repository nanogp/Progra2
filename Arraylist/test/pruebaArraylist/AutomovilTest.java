/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaArraylist;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mponti
 */
public class AutomovilTest {
    
    public AutomovilTest() {
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
     * Test of toString method, of class Automovil.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Automovil instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCantidadDeRuedas method, of class Automovil.
     */
    @Test
    public void testMostrarCantidadDeRuedas() {
        System.out.println("mostrarCantidadDeRuedas");
        Automovil.mostrarCantidadDeRuedas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadDeRuedas method, of class Automovil.
     */
    @Test
    public void testSetCantidadDeRuedas() {
        System.out.println("setCantidadDeRuedas");
        int cantidadDeRuedas = 0;
        Automovil.setCantidadDeRuedas(cantidadDeRuedas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarVelocidadActual method, of class Automovil.
     */
    @Test
    public void testMostrarVelocidadActual() {
        System.out.println("mostrarVelocidadActual");
        Automovil instance = null;
        instance.mostrarVelocidadActual();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class Automovil.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Automovil instance = null;
        instance.mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

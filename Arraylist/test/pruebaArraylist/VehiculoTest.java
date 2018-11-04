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
public class VehiculoTest
{

    public VehiculoTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getVelocidadActual method, of class Vehiculo.
     */
    @Test
    public void testGetVelocidadActual()
    {
        System.out.println("getVelocidadActual");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.getVelocidadActual();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVelocidadActual method, of class Vehiculo.
     */
    @Test
    public void testSetVelocidadActual()
    {
        System.out.println("setVelocidadActual");
        int velocidadActual = 10;
        Vehiculo instance = new Vehiculo();
        instance.setVelocidadActual(velocidadActual);
        assertEquals(velocidadActual, instance.getVelocidadActual());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoVehiculo method, of class Vehiculo.
     */
    @Test
    public void testGetTipoVehiculo()
    {
        System.out.println("getTipoVehiculo");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getTipoVehiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoVehiculo method, of class Vehiculo.
     */
    @Test
    public void testSetTipoVehiculo()
    {
        System.out.println("setTipoVehiculo");
        String tipo = "";
        Vehiculo instance = new Vehiculo();
        //instance.setTipoVehiculo(tipo);
        assertEquals(instance.getTipoVehiculo(), tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of acelerar method, of class Vehiculo.
     */
    @Test
    public void testAcelerar()
    {
        System.out.println("acelerar");
        int velocidad = 0;
        Vehiculo instance = new Vehiculo();
        instance.acelerar(velocidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}

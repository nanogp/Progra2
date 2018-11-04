/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

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
public class CadenaTest
{

    public CadenaTest()
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
     * Test of repeat method, of class Cadena.
     */
    @Test
    public void testRepeat()
    {
        System.out.println("repeat");
        String texto = "hola";
        int count = 2;
        String expResult = "holahola";
        String result = Cadena.repeat(texto, count);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of pad method, of class Cadena.
     */
    @Test
    public void testPad()
    {
        System.out.println("pad");
        String texto = "";
        int ancho = 0;
        int lado = 0;
        String tabulador = "";
        String expResult = "";
        String result = Cadena.pad(texto, ancho, lado, tabulador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of lPad method, of class Cadena.
     */
    @Test
    public void testLPad_3args()
    {
        System.out.println("lPad");
        String texto = "";
        int ancho = 0;
        String tabulador = "";
        String expResult = "";
        String result = Cadena.lPad(texto, ancho, tabulador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of rPad method, of class Cadena.
     */
    @Test
    public void testRPad_3args()
    {
        System.out.println("rPad");
        String texto = "";
        int ancho = 0;
        String tabulador = "";
        String expResult = "";
        String result = Cadena.rPad(texto, ancho, tabulador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of mPad method, of class Cadena.
     */
    @Test
    public void testMPad_3args()
    {
        System.out.println("mPad");
        String texto = "";
        int ancho = 0;
        String tabulador = "";
        String expResult = "";
        String result = Cadena.mPad(texto, ancho, tabulador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of lPad method, of class Cadena.
     */
    @Test
    public void testLPad_String_int()
    {
        System.out.println("lPad");
        String texto = "";
        int ancho = 0;
        String expResult = "";
        String result = Cadena.lPad(texto, ancho);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of rPad method, of class Cadena.
     */
    @Test
    public void testRPad_String_int()
    {
        System.out.println("rPad");
        String texto = "";
        int ancho = 0;
        String expResult = "";
        String result = Cadena.rPad(texto, ancho);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of mPad method, of class Cadena.
     */
    @Test
    public void testMPad_String_int()
    {
        System.out.println("mPad");
        String texto = "";
        int ancho = 0;
        String expResult = "";
        String result = Cadena.mPad(texto, ancho);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of encolumnarTexto method, of class Cadena.
     */
    @Test
    public void testEncolumnarTexto()
    {
        System.out.println("encolumnarTexto");
        String separador = "";
        Object[] args = null;
        String expResult = "";
        String result = Cadena.encolumnarTexto(separador, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of encolumnarAlinearTexto method, of class Cadena.
     */
    @Test
    public void testEncolumnarAlinearTexto()
    {
        System.out.println("encolumnarAlinearTexto");
        String separador = "";
        Object[] args = null;
        String expResult = "";
        String result = Cadena.encolumnarAlinearTexto(separador, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}

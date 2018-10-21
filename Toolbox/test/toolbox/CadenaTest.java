package toolbox;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        Cadena.stringBuilder = new StringBuilder();
    }

    @After
    public void tearDown()
    {
        //Cadena.stringBuilder.delete(0, Cadena.stringBuilder.length());
    }

    @Test
    public void testPadRight()
    {
        System.out.println("padRight");
        String texto = "texto";
        int padding = 10;
        String expResult = "texto     ";
        String result = Cadena.rightPad(texto, padding);
        assertEquals(expResult, result);

    }

    @Test
    public void testPadLeft()
    {
        System.out.println("padLeft");
        String texto = "texto";
        int padding = 10;
        String expResult = "     texto";
        String result = Cadena.leftPad(texto, padding);
        assertEquals(expResult, result);

    }

    @Test
    public void testAppendRightPad()
    {
        System.out.println("appendRightPad");
        String texto = "texto     ";
        int padding = 10;
        Cadena.appendRightPad(texto, padding);
        assertEquals(texto, Cadena.stringBuilder.toString());

    }

    @Test
    public void testAppendLeftPad()
    {
        System.out.println("appendLeftPad");
        String texto = "     texto";
        int padding = 10;
        Cadena.appendRightPad(texto, padding);
        assertEquals(texto, Cadena.stringBuilder.toString());

    }

    @Test
    public void testAppendRightPadSeparator()
    {
        System.out.println("appendRightPadSeparator");
        int padding = 10;
        String texto = "texto     ";
        Cadena.appendRightPadSeparator(texto, padding, "");
        //String texto = "texto     -separador";
        //Cadena.appendRightPadSeparator(texto, padding, "-separador");
        assertEquals(texto, Cadena.stringBuilder.toString());

    }

    @Test
    public void testAppendLeftPadSeparator()
    {
        System.out.println("appendLeftPadSeparator");
        int padding = 10;
        String texto = "     texto";
        Cadena.appendRightPadSeparator(texto, padding, "");
        //String texto = "     texto-separador";
        //Cadena.appendRightPadSeparator(texto, padding, "-separador");
        assertEquals(texto, Cadena.stringBuilder.toString());

    }

}

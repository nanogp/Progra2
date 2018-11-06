package toolbox;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnteroTest
{

    public EnteroTest()
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

    @Test
    public void testToString()
    {
        System.out.println("toString");
        int entero = 0;
        String expResult = "0";
        String result = Numero.toString(entero);
        assertEquals(expResult, result);

    }

    @Test
    public void testArrayIntRandom()
    {
        System.out.println("arrayIntRandom");
        int length = 0;
        int min = 10;
        int max = 100;
        int[] result = Numero.arrayIntRandom(length, min, max);
        assertEquals(length, result.length);

    }

    @Test
    public void testArrayIntConsola()
    {
        System.out.println("arrayIntConsola");
        int length = 0;
        String texto = "";
        int[] expResult = null;
        //int[] result = Numero.arrayIntConsola(length, texto);
        //assertArrayEquals(expResult, result);

    }

}

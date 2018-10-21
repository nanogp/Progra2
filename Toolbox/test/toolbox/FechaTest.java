package toolbox;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FechaTest
{

    Calendar calendario = Calendar.getInstance();
    static int año = 2000;
    static int mes = Month.JANUARY.getValue();
    static int dia = 1;
    static int hora = 0;
    static int minutos = 0;
    static int segundos = 0;

    public FechaTest()
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
        calendario.set(Calendar.YEAR, año);
        calendario.set(Calendar.MONTH, mes);
        calendario.set(Calendar.DAY_OF_MONTH, dia);
        calendario.set(Calendar.HOUR_OF_DAY, hora);
        calendario.set(Calendar.MINUTE, minutos);
        calendario.set(Calendar.SECOND, segundos);
        calendario.set(Calendar.MILLISECOND, 0);
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testNewDate_3args()
    {
        System.out.println("date 3args");
        Date expResult = calendario.getTime();
        Date result = Toolbox.fechas.newDate(año, mes, dia);
        assertEquals(expResult, result);
    }

    @Test
    public void testNewDate_6args()
    {
        System.out.println("date 6args");
        hora = 15;
        minutos = 30;
        segundos = 45;
        setUp();
        Date expResult = calendario.getTime();
        Date result = Toolbox.fechas.newDate(año, mes, dia, hora, minutos, segundos);
        assertEquals(expResult, result);
    }

}

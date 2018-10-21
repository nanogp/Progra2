package toolbox;

import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Toolbox
{

    public static Scanner leerIn = new Scanner(System.in);
    public static ThreadLocalRandom random = ThreadLocalRandom.current();

    //<editor-fold defaultstate="collapsed" desc="Date">

    /**
     * Constructor de fecha
     * @param año
     * @param mes
     * @param dia
     * @return
     */
    public static Date date(int año, int mes, int dia)
    {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, año);
        calendario.set(Calendar.MONTH, mes);
        calendario.set(Calendar.DAY_OF_MONTH, dia);
        calendario.set(Calendar.HOUR_OF_DAY, 0);
        calendario.set(Calendar.MINUTE, 0);
        calendario.set(Calendar.SECOND, 0);
        calendario.set(Calendar.MILLISECOND, 0);
        return calendario.getTime();
    }

    /**
     * Constructor de fecha y hora
     * @param año
     * @param mes
     * @param dia
     * @param hora
     * @param minutos
     * @param segundos
     * @return
     */
    public static Date date(int año, int mes, int dia, int hora, int minutos, int segundos)
    {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, año);
        calendario.set(Calendar.MONTH, mes);
        calendario.set(Calendar.DAY_OF_MONTH, dia);
        calendario.set(Calendar.HOUR_OF_DAY, hora);
        calendario.set(Calendar.MINUTE, minutos);
        calendario.set(Calendar.SECOND, segundos);
        calendario.set(Calendar.MILLISECOND, 0);
        return calendario.getTime();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Nombre Random">
    public static class NombreRandom
    {

        private static String[] inicio =
        {
            "Kr", "Ca", "Ra", "Mrok", "Cru",
            "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
            "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
            "Mar", "Luk"
        };
        private static String[] medio =
        {
            "air", "ir", "mi", "sor", "mee", "clo",
            "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
            "marac", "zoir", "slamar", "salmar", "urak"
        };
        private static String[] fin =
        {
            "d", "ed", "ark", "arc", "es", "er", "der",
            "tron", "med", "ure", "zur", "cred", "mur"
        };

        public static String generarNombre()
        {

            return inicio[ThreadLocalRandom.current().nextInt(inicio.length)]
                    + medio[ThreadLocalRandom.current().nextInt(medio.length)]
                    + fin[ThreadLocalRandom.current().nextInt(fin.length)];
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Enteros">

    /**
     * Clase para manejo de datos int
     */
    public static class Enteros
    {

        public static int[] arrayIntRandom(int length, int min, int max)
        {
            int[] retorno = new int[length];

            for (int i = 0; i < length; i++)
            {
                retorno[i] = random.nextInt(min, max);
            }
            return retorno;
        }

        public static int[] arrayIntConsola(int length, String texto)
        {
            int[] retorno = new int[length];

            for (int i = 0; i < length; i++)
            {
                System.out.println(texto);
                retorno[i] = leerIn.nextInt();
            }
            return retorno;
        }
    }
    //</editor-fold>
}

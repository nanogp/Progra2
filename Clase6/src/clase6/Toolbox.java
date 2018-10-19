package clase6;

import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

/**
 *
 * @author mponti
 */
public class Toolbox
{

    public static Scanner leerIn = new Scanner(System.in);
    public static ThreadLocalRandom random = ThreadLocalRandom.current();

    //<editor-fold defaultstate="collapsed" desc="Date">
    public static Date date(int año, int mes, int dia)
    {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, año);
        calendario.set(Calendar.MONTH, mes);
        calendario.set(Calendar.DAY_OF_MONTH, dia);
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

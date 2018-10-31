package toolbox;

import static toolbox.Toolbox.*;

public class Entero
{

    public static String toString(int entero)
    {
        return "" + entero;
    }

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
            retorno[i] = leerDeConsola.nextInt();
        }
        return retorno;
    }
}

package toolbox;

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
            retorno[i] = Random.randomSeed.nextInt(min, max);
        }
        return retorno;
    }

    public static int[] arrayIntConsola(int length, String texto)
    {
        int[] retorno = new int[length];

        for (int i = 0; i < length; i++)
        {
            System.out.println(texto);
            retorno[i] = Toolbox.leerDeConsola.nextInt();
        }
        return retorno;
    }
}

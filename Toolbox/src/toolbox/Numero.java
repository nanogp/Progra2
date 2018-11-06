package toolbox;

public class Numero
{
    //<editor-fold defaultstate="collapsed" desc="Int">

    public static String toString(int entero)
    {
        return String.format("%d", entero);
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
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Float">

    public static String toString(float flotante)
    {
        return String.format("%.2f", flotante);
    }

    public static float[] arrayFloatRandom(int length, float min, float max)
    {
        float[] retorno = new float[length];

        for (int i = 0; i < length; i++)
        {
            retorno[i] = (float) Random.randomSeed.nextDouble(min, max);
        }
        return retorno;
    }

    public static float[] arrayFloatConsola(int length, String texto)
    {
        float[] retorno = new float[length];

        for (int i = 0; i < length; i++)
        {
            System.out.println(texto);
            retorno[i] = Toolbox.leerDeConsola.nextFloat();
        }
        return retorno;
    }
    //</editor-fold>
}

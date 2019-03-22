package ahorcado.Enumerados;

public enum Dificultad
{
    Facil, Normal, Dificil;
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private static final int[] puntaje =
    {
        1, 2, 3
    };

    //define momento de pista
    private static final int[] pista =
    {
        3, 4, 3
    };

    //define maximo intentos fallidos
    private static final int[] fallos =
    {
        10, 7, 5
    };

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    //define puntaje de partida ganada
    public static Dificultad getRandom()
    {
        return Dificultad.values()[java.util.concurrent.ThreadLocalRandom.current().nextInt(Dificultad.values().length)];
    }

    public static int getValorPuntos(Dificultad d)
    {
        return puntaje[d.ordinal()];
    }

    public static int getMomentoPista(Dificultad d)
    {
        return pista[d.ordinal()];
    }

    public static int getMaxFallos(Dificultad d)
    {

        return fallos[d.ordinal()];
    }
//</editor-fold>
}

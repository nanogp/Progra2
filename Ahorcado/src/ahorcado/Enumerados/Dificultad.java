package ahorcado.Enumerados;

public enum Dificultad
{
    Facil, Normal, Dificil;

    private static final int PUNTAJE_FACIL = 1;
    private static final int PUNTAJE_NORMAL = 2;
    private static final int PUNTAJE_DIFICIL = 3;

    private static int[] puntaje =
    {
        PUNTAJE_FACIL, PUNTAJE_NORMAL, PUNTAJE_DIFICIL
    };

    public static Dificultad getRandom()
    {
        return Dificultad.values()[java.util.concurrent.ThreadLocalRandom.current().nextInt(Dificultad.values().length)];
    }

    public static int getPuntos(Dificultad d)
    {
        return puntaje[d.ordinal()];
    }
}

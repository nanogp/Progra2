package ahorcado.Enumerados;

import ahorcado.Excepciones.GanaJuego;

public enum Dificultad
{
    Facil, Normal, Dificil;
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    //definir puntaje por partida ganada
    private static final int[] puntaje =
    {
        1, 2, 3
    };

    //definir momento de pista
    private static final int[] pista =
    {
        3, 4, 3
    };

    //definir maximo intentos fallidos
    private static final int[] fallos =
    {
        10, 7, 5
    };

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
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

    public Dificultad levelUp() throws GanaJuego
    {
        Dificultad ret = null;
        switch (this)
        {
            case Facil:
                ret = Normal;
                break;
            case Normal:
                ret = Dificil;
                break;
            default:
                throw new GanaJuego();
        }

        return ret;

    }
//</editor-fold>

}

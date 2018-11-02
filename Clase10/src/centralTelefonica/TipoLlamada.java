package centralTelefonica;

public enum TipoLlamada
{
    Local, Provincial, Todas;

    public static TipoLlamada getRandom()
    {
        return TipoLlamada.values()[java.util.concurrent.ThreadLocalRandom.current().nextInt(TipoLlamada.values().length)];
    }
}

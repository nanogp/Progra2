package clase11;

public enum eTipoComestible
{
    Solido, Liquido;

    public static eTipoComestible getRandom()
    {
        return eTipoComestible.values()[java.util.concurrent.ThreadLocalRandom.current().nextInt(eTipoComestible.values().length)];
    }

}

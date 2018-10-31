package clase7;

public enum eRaza
{
    ROTTIE, PUTTY, TAJUNGAPUL, PERRO;

    public static eRaza getRandom()
    {
        return eRaza.values()[java.util.concurrent.ThreadLocalRandom.current().nextInt(eRaza.values().length)];
    }

}
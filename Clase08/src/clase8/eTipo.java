package clase8;

public enum eTipo
{
    URGENTE, NORMAL;

    public static eTipo getRandom()
    {
        return eTipo.values()[java.util.concurrent.ThreadLocalRandom.current().nextInt(eTipo.values().length)];
    }
}

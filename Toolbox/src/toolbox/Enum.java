package toolbox;

public enum Enum
{
    Valores;

    public static Enum getRandom()
    {
        return Enum.values()[java.util.concurrent.ThreadLocalRandom.current().nextInt(Enum.values().length)];
    }
}

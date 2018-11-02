package centralTelefonica;

public enum Franja
{
    Franja_1, Franja_2, Franja_3;

    public static Franja getRandom()
    {
        return Franja.values()[java.util.concurrent.ThreadLocalRandom.current().nextInt(Franja.values().length)];
    }
}

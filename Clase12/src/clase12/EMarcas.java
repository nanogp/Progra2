package clase12;

import java.util.concurrent.ThreadLocalRandom;

public enum EMarcas
{
    Honda, Ford, Zanella, Scania, Iveco, Fiat;

    public static EMarcas getRandom()
    {
        return EMarcas.values()[ThreadLocalRandom.current().nextInt(EMarcas.values().length)];
    }
}

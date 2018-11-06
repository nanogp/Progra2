package toolbox;

public class Random
{

    public static java.util.concurrent.ThreadLocalRandom randomSeed = java.util.concurrent.ThreadLocalRandom.current();

    //<editor-fold defaultstate="collapsed" desc="Float">
    public static float randomFloat(float min, float max)
    {
        return randomSeed.nextLong((long) min, (long) max);
    }

    public static float randomFloat(int min, int max)
    {
        return randomFloat((float) min, (float) max);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="String">

    public static String randomName()
    {
        String[] inicio =
        {
            "Kr", "Ca", "Ra", "Mrok", "Cru",
            "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mol",
            "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
            "Mar", "Luk"
        };

        String[] medio =
        {
            "air", "ir", "mi", "sor", "mee", "clo",
            "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
            "ma", "zoir", "sla", "sal", "urak"
        };

        String[] fin =
        {
            "d", "ed", "ark", "arc", "es", "er", "der",
            "tron", "med", "ure", "zur", "cred", "mur"
        };

        return inicio[randomSeed.nextInt(inicio.length)] + medio[randomSeed.nextInt(medio.length)] + fin[randomSeed.nextInt(fin.length)];
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Object">

    public static Object randomObject(Object... args)
    {
        return args[randomSeed.nextInt(args.length)];
    }
    //</editor-fold>
}

package toolbox;

public class Cadena
{

    public static StringBuilder stringBuilder;

    public static String rightPad(String texto, int padding)
    {
        return String.format("%-" + padding + "s", texto);
    }

    public static String leftPad(String texto, int padding)
    {
        return String.format("%" + padding + "s", texto);
    }

    public static String rightPad(String texto, int padding, String textoPad)
    {
        String retString = texto;
        for (int i = 0; i < padding - texto.length(); i++)
        {
            retString += textoPad;
        }
        return retString;
    }

    public static String leftPad(String texto, int padding, String textoPad)
    {
        String retString = new String();
        for (int i = 0; i < padding - texto.length(); i++)
        {
            retString += textoPad;
        }
        return (retString + texto);
    }

    public static void appendRightPad(String texto, int padding)
    {

        stringBuilder.append(rightPad(texto, padding));
    }

    public static void appendLeftPad(String texto, int padding)
    {

        stringBuilder.append(leftPad(texto, padding));
    }

    public static void appendRightPadSeparator(String texto, int padding, String separador)
    {

        stringBuilder.append(rightPad(texto, padding));
        stringBuilder.append(separador);

    }

    public static void appendLeftPadSeparator(String texto, int padding, String separador)
    {

        stringBuilder.append(leftPad(texto, padding));
        stringBuilder.append(separador);
    }

    public static String generarNombreRandom()
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

        return inicio[Toolbox.random.nextInt(inicio.length)]
                + medio[Toolbox.random.nextInt(medio.length)]
                + fin[Toolbox.random.nextInt(fin.length)];
    }
}

package toolbox;

public class Cadena
{

    public static final int PADLEFT = 0;
    public static final int PADRIGHT = 1;
    public static final int PADMID = 2;
    public static final int ALINEA_IZQ = PADRIGHT;
    public static final int ALINEA_DER = PADLEFT;
    public static final int ALINEA_MED = PADMID;
    public static StringBuilder stringBuilder;

    //<editor-fold defaultstate="collapsed" desc="Transformaciones">
    public static String repeat(String texto, int count)
    {
        StringBuilder retString = new StringBuilder();
        for (int i = 0; i < count; i++)
        {
            retString.append(texto);
        }
        return retString.toString();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Tabular">
    public static String pad(String texto, int ancho, int lado, String tabulador)
    {
        String retString = new String();
        switch (lado)
        {
            case PADLEFT:
                retString = repeat(tabulador, (ancho - texto.length()) / tabulador.length());
                retString += texto;
                retString = String.format("%" + ancho + "s", retString);
                break;
            case PADRIGHT:
                retString = texto;
                retString += repeat(tabulador, (ancho - texto.length()) / tabulador.length());
                retString = String.format("%-" + ancho + "s", retString);
                break;
            case PADMID:
                retString = repeat(tabulador, (ancho - texto.length()) / tabulador.length() / 2);
                retString += texto;
                retString += repeat(tabulador, (ancho - retString.length()) / tabulador.length());
                retString = String.format("%-" + ancho + "s", retString);
                break;
        }

        return retString;
    }

    public static String lPad(String texto, int ancho, String tabulador)
    {

        return pad(texto, ancho, PADLEFT, tabulador);
    }

    public static String rPad(String texto, int ancho, String tabulador)
    {

        return pad(texto, ancho, PADRIGHT, tabulador);
    }

    public static String mPad(String texto, int ancho, String tabulador)
    {

        return pad(texto, ancho, PADMID, tabulador);
    }

    public static String lPad(String texto, int ancho)
    {

        return pad(texto, ancho, PADLEFT, " ");
    }

    public static String rPad(String texto, int ancho)
    {

        return pad(texto, ancho, PADRIGHT, " ");
    }

    public static String mPad(String texto, int ancho)
    {

        return pad(texto, ancho, PADMID, " ");
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Encolumnar">
    /**
     * Funcion que genera una cadena encolumnada y separada por un tabulador que
     * recibe una lista de columnas de a pares (tamaño, valor)
     *
     * @param separador cadena que separa las columnas
     * @param args 1er argumento ancho, 2do argumento valor, ... etc
     * @return una cadena encolumnada
     */
    public static String encolumnarTexto(String separador, Object... args)
    {
        StringBuilder stringBuilder = new StringBuilder();
        boolean esDato = false;
        String texto;
        int ancho = 0;

        for (int i = 0; i < args.length; i++)
        {
            Object obj = args[i];
            if (esDato)
            {
                switch (obj.getClass().getSimpleName())
                {
                    case "Integer":
                        texto = String.format("%1$d", (int) obj);
                        texto = lPad(texto, ancho);
                        stringBuilder.append(texto);
                        break;

                    case "int[]":
                        for (int entero : (int[]) obj)
                        {
                            texto = String.format("%1$d", (int) obj);
                            texto = lPad(texto, ancho);
                            stringBuilder.append(texto);
                        }
                        break;

                    case "Float":
                        texto = String.format("%1$.2f", obj);
                        texto = lPad(texto, ancho);
                        stringBuilder.append(texto);
                        break;

                    case "String":
                        texto = (String) obj;
                        texto = rPad(texto, ancho);
                        stringBuilder.append(texto);
                        break;
                }

                if (i < args.length - 1)
                {
                    stringBuilder.append(separador);
                }
                esDato = false;
            } else
            {
                ancho = (int) obj;
                esDato = true;
            }

        }

        return stringBuilder.toString();
    }

    /**
     * Funcion que genera una cadena encolumnada y separada por un tabulador que
     * recibe una lista de columnas de a trios (tamaño, alineacion, valor)
     *
     * @param separador cadena que separa las columnas
     * @param args 1er argumento ancho, 2do argumento alineacion de columnna,
     * 3er argumento valor, ... etc
     * @return una cadena encolumnada
     */
    public static String encolumnarAlinearTexto(String separador, Object... args)
    {
        StringBuilder stringBuilder = new StringBuilder();
        boolean esAlineacion = false;
        boolean esDato = false;
        String texto;
        int ancho = 0;
        int alineacion = 0;

        for (int i = 0; i < args.length; i++)
        {
            Object obj = args[i];
            if (esDato)
            {
                switch (obj.getClass().getSimpleName())
                {
                    case "Integer":
                        texto = String.format("%1$d", (int) obj);
                        texto = pad(texto, ancho, alineacion, " ");
                        stringBuilder.append(texto);
                        break;

                    case "int[]":
                        for (int entero : (int[]) obj)
                        {
                            texto = String.format("%1$d", (int) obj);
                            texto = pad(texto, ancho, alineacion, " ");
                            stringBuilder.append(texto);
                        }
                        break;

                    case "Float":
                        texto = String.format("%1$.2f", obj);
                        texto = pad(texto, ancho, alineacion, " ");
                        stringBuilder.append(texto);
                        break;

                    case "String":
                        texto = (String) obj;
                        texto = pad(texto, ancho, alineacion, " ");
                        stringBuilder.append(texto);
                        break;
                }

                if (i < args.length - 1)
                {
                    stringBuilder.append(separador);
                }
                esDato = false;
            } else
            {
                if (esAlineacion)
                {
                    alineacion = (int) obj;
                    esAlineacion = false;
                    esDato = true;
                } else
                {
                    ancho = (int) obj;
                    esAlineacion = true;
                }
            }

        }

        return stringBuilder.toString();
    }
    //</editor-fold>
}

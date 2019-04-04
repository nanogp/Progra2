package toolbox;

public class Cadena
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    public static final int PADLEFT = 0;
    public static final int PADRIGHT = 1;
    public static final int PADMID = 2;
    public static final int ALINEA_IZQ = PADRIGHT;
    public static final int ALINEA_DER = PADLEFT;
    public static final int ALINEA_MED = PADMID;
    public static StringBuilder stringBuilder;

    //</editor-fold>
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
    public static String concatenarTexto(String separador, Object... args)
    {
        StringBuilder retString = new StringBuilder();
        for (int i = 0; i < args.length; i++)
        {
            retString.append(args[i]);
            if (i < args.length - 1)
            {
                retString.append(separador);
            }
        }
        return retString.toString();
    }

    /**
     * Funcion que genera una cadena encolumnada y separada por un tabulador que
     * recibe una lista de columnas de a pares (valor, ancho columna)
     *
     * @param args 1er argumento dato, 2do argumento ancho de columnna ... etc
     * @return una cadena encolumnada
     */
    public static String encolumnarTexto(String separador, Object... args)
    {
        StringBuilder retString = new StringBuilder();
        final int ES_DATO = 0;
        final int ES_ANCHO = 1;
        int pivot_dato_ancho = 0;
        int ancho = 0;
        int alineacion = 0;
        String texto = new String();

        for (int i = 0; i < args.length; i++)
        {
            Object obj = args[i];
            switch (pivot_dato_ancho)
            {
                case ES_DATO:
                    switch (obj.getClass().getSimpleName())
                    {
                        case "Integer":
                            texto = String.format("%1$d", (int) obj);
                            alineacion = ALINEA_DER;
                            break;

                        case "int[]":
                            for (int entero : (int[]) obj)
                            {
                                texto = String.format("%1$d", (int) obj);

                            }
                            alineacion = ALINEA_DER;
                            break;

                        case "Float":
                            texto = String.format("%1$.2f", obj);
                            alineacion = ALINEA_DER;
                            break;

                        case "String":
                            texto = (String) obj;
                            alineacion = ALINEA_IZQ;
                            break;
                    }

                    pivot_dato_ancho++;
                    break;

                case ES_ANCHO:
                    ancho = (int) obj;
                    texto = pad(texto, ancho, alineacion, " ");
                    retString.append(texto);
                    if (i < args.length - 1)
                    {
                        retString.append(separador);
                    }
                    pivot_dato_ancho = 0;
                    break;

            }//switch

        }//for

        return retString.toString();
    }

    /**
     * Funcion que genera una cadena encolumnada y separada por un tabulador que
     * recibe una lista de columnas de a trios (valor, ancho columna,
     * alineacion)
     *
     * @param separador cadena que separa las columnas
     * @param args 1er argumento dato, 2do argumento ancho de columnna, 3er
     * argumento alineacion, ... etc
     * @return una cadena encolumnada
     */
    public static String encolumnarAlinearTexto(String separador, Object... args)
    {
        StringBuilder retString = new StringBuilder();
        final int ES_DATO = 0;
        final int ES_ANCHO = 1;
        final int ES_ALINEACION = 2;
        int pivot_dato_ancho_alineacion = 0;
        int ancho = 0;
        int alineacion = 0;
        String texto = new String();

        for (int i = 0; i < args.length; i++)
        {
            Object obj = args[i];
            switch (pivot_dato_ancho_alineacion)
            {
                case ES_DATO:
                    switch (obj.getClass().getSimpleName())
                    {
                        case "Integer":
                            texto = String.format("%1$d", (int) obj);

                            break;

                        case "int[]":
                            for (int entero : (int[]) obj)
                            {
                                texto = String.format("%1$d", (int) obj);

                            }
                            break;

                        case "Float":
                            texto = String.format("%1$.2f", obj);

                            break;

                        case "String":
                            texto = (String) obj;
                            break;
                    }

                    pivot_dato_ancho_alineacion++;
                    break;

                case ES_ANCHO:
                    ancho = (int) obj;
                    pivot_dato_ancho_alineacion++;
                    break;

                case ES_ALINEACION:
                    alineacion = (int) obj;
                    texto = pad(texto, ancho, alineacion, " ");
                    retString.append(texto);
                    if (i < args.length - 1)
                    {
                        retString.append(separador);
                    }
                    pivot_dato_ancho_alineacion = 0;
                    break;

            }//switch

        }//for

        return retString.toString();
    }
//</editor-fold>

}

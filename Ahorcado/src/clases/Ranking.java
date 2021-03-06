package clases;

import toolbox.Archivo;
import java.io.FileNotFoundException;
import interfaces.InterfazXml;
import toolbox.Cadena;

public class Ranking implements InterfazXml
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected ListaDeUsuarios listaDeUsuarios;
    protected static String nombreArchivo = null;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    static
    {
        nombreArchivo = "Ranking.xml";
    }

    public Ranking()
    {
        this.listaDeUsuarios = new ListaDeUsuarios();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public ListaDeUsuarios getListaDeUsuarios()
    {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(ListaDeUsuarios listaDeUsuarios)
    {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public String getNombreArchivo()
    {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo)
    {
        this.nombreArchivo = nombreArchivo;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public String toString()
    {
        StringBuilder ret = new StringBuilder();

        ret.append(Cadena.encolumnarAlinearTexto(" | ",
                "JUGADOR", 15, Cadena.ALINEA_IZQ,
                "PUNTAJE", 7, Cadena.ALINEA_MED,
                "ULTIMO", 7, Cadena.ALINEA_MED,
                "JUGADAS", 7, Cadena.ALINEA_MED));
        ret.append("\n");
        ret.append(Cadena.repeat("-", ret.toString().length()));
        ret.append("\n");
        ret.append(this.getListaDeUsuarios().toString());

        return ret.toString();
    }

    public static Ranking leerDeXml(String nombreArchivo)
    {
        return (Ranking) InterfazXml.leerDeXml(nombreArchivo);
    }

    @Override
    public void guardarEnXml()
    {
        try
        {
            Archivo.serializarXml(this, this.getNombreArchivo());
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo " + nombreArchivo);
        }
    }

    //</editor-fold>
}

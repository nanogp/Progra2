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
                "NOMBRE", 20, Cadena.ALINEA_IZQ,
                "PUNTAJE", 10, Cadena.ALINEA_MED,
                "PUNTAJE ULTIMA PARTIDA", 10, Cadena.ALINEA_MED,
                "PARTIDAS JUGADAS", 1, Cadena.ALINEA_MED));
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

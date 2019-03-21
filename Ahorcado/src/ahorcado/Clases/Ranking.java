package ahorcado.Clases;

import ahorcado.Interfaces.InterfaceXml;
import ahorcado.ListaDeUsuarios;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import toolbox.Random;

public class Ranking implements InterfaceXml
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
    public static Ranking leerDeXml(String nombreArchivo)
    {
        return (Ranking) InterfaceXml.leerDeXml(nombreArchivo);
    }

    @Override
    public void guardarEnXml()
    {
        try
        {
            Archivo.serializarXml(this, this.nombreArchivo);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo " + nombreArchivo);
        }
    }

    //</editor-fold>
}

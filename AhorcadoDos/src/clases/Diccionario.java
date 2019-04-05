package clases;

import toolbox.Archivo;
import java.io.FileNotFoundException;
import interfaces.InterfazXml;
import toolbox.Cadena;

public class Diccionario implements InterfazXml
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected ListaDePalabras listaDePalabras;
    protected static String nombreArchivo;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    static
    {
        nombreArchivo = "Diccionario.xml";
    }

    public Diccionario()
    {
        this.listaDePalabras = new ListaDePalabras();

    }

    public Diccionario(ListaDePalabras lista)
    {

        this.listaDePalabras = lista;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public ListaDePalabras getListaDePalabras()
    {
        return listaDePalabras;
    }

    public void setListaDePalabras(ListaDePalabras listaDePalabras)
    {
        this.listaDePalabras = listaDePalabras;
    }

    public String getNombreArchivo()
    {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo)
    {
        Diccionario.nombreArchivo = nombreArchivo;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public String toString()
    {
        StringBuilder retorno = new StringBuilder();
        retorno.append(Cadena.encolumnarAlinearTexto(" | ",
                "PALABRA", 20, Cadena.ALINEA_IZQ,
                "DIFICULTAD", 10, Cadena.ALINEA_MED,
                "DEFINICION", 1, Cadena.ALINEA_IZQ));
        retorno.append("\n");
        retorno.append(Cadena.repeat("-", retorno.toString().length()));
        retorno.append("\n");
        for (Palabra palabra : this.getListaDePalabras())
        {
            retorno.append(palabra.toString());
            retorno.append("\n");
        }
        return retorno.toString();
    }

    public void mostrar()
    {
        System.out.println(this.toString());
    }

    public static Diccionario leerDeXml(String nombreArchivo)
    {
        return (Diccionario) InterfazXml.leerDeXml(nombreArchivo);
    }

    @Override
    public void guardarEnXml()
    {
        try
        {
            Archivo.serializarXml(this, Diccionario.nombreArchivo);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo " + nombreArchivo);
        }
    }

    //</editor-fold>
}

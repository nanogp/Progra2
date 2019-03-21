package ahorcado.Clases;

import ahorcado.Enumerados.Dificultad;
import java.util.Comparator;

public class Palabra implements Comparable<Palabra>, Comparator<Palabra>
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected String nombre;
    protected String definicion;
    protected Dificultad dificultad;
    protected int tamaño;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Palabra()
    {
    }

    public Palabra(String nombre, String definicion, Dificultad dificultad)
    {
        this.nombre = nombre;
        this.definicion = definicion;
        this.dificultad = dificultad;
        this.tamaño = this.nombre.length();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDefinicion()
    {
        return definicion;
    }

    public void setDefinicion(String definicion)
    {
        this.definicion = definicion;
    }

    public Dificultad getDificultad()
    {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad)
    {
        this.dificultad = dificultad;
    }

    public int getTamaño()
    {
        return tamaño;
    }

    public void setTamaño(int tamaño)
    {
        this.tamaño = tamaño;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public String toString()
    {
        return toolbox.Cadena.encolumnarAlinearTexto(" | ",
                this.getNombre(), 20, toolbox.Cadena.ALINEA_IZQ,
                this.getDificultad().toString(), 10, toolbox.Cadena.ALINEA_MED,
                this.getDefinicion(), 1, toolbox.Cadena.ALINEA_IZQ);
    }

    @Override
    public int compareTo(Palabra p)
    {
        return this.getNombre().compareToIgnoreCase(p.getNombre());
    }

    @Override
    public int compare(Palabra una, Palabra otra)
    {
        return una.getDificultad().compareTo(otra.getDificultad());
    }

    public static Comparator<Palabra> ComparatorAlfabetico = Palabra::compareTo;

    public static Comparator<Palabra> ComparatorDificultad = (Palabra una, Palabra otra) -> una.compare(una, otra);

    //</editor-fold>
}

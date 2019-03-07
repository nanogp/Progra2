package ahorcado;

import java.util.Comparator;

public class Palabra implements Comparable<Palabra>, Comparator<Palabra>
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected String nombre;
    protected String definicion;
    protected int dificultad;
    public static int FACIL = 0;
    public static int NORMAL = 1;
    public static int DIFICIL = 2;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Palabra()
    {
    }

    public Palabra(String nombre, String definicion, int dificultad)
    {
        this.nombre = nombre;
        this.definicion = definicion;
        this.dificultad = dificultad;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public String getNombrePalabra()
    {
        return nombre;
    }

    public void setNombrePalabra(String nombrePalabra)
    {
        this.nombre = nombrePalabra;
    }

    public String getDefinicionPalabra()
    {
        return definicion;
    }

    public void setDefinicionPalabra(String definicionPalabra)
    {
        this.definicion = definicionPalabra;
    }

    public int getDificultad()
    {
        return dificultad;
    }

    public void setDificultad(int dificultad)
    {
        this.dificultad = dificultad;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public String toString()
    {
        return new StringBuilder()
                .append(this.getNombrePalabra())
                .append(" | ")
                .append(this.getDefinicionPalabra()).toString();
    }

    @Override
    public int compareTo(Palabra p)
    {
        return this.getNombrePalabra().compareToIgnoreCase(p.getNombrePalabra());
    }

    @Override
    public int compare(Palabra una, Palabra otra)
    {
        return (int) Math.signum(una.getDificultad() - otra.getDificultad());
    }

    public static Comparator<Palabra> ComparatorAlfabetico = Palabra::compareTo;

    public static Comparator<Palabra> ComparatorDificultad = (Palabra una, Palabra otra) -> una.compare(una, otra);

    //</editor-fold>
}

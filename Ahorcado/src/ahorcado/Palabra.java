package ahorcado;

public class Palabra
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
    //</editor-fold>

}

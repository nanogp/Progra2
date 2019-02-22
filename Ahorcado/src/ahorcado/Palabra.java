package ahorcado;

public class Palabra
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected String nombrePalabra;
    protected String definicionPalabra;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Palabra()
    {
    }

    public Palabra(String nombrePalabra, String definicionPalabra)
    {
        this.nombrePalabra = nombrePalabra;
        this.definicionPalabra = definicionPalabra;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public String getNombrePalabra()
    {
        return nombrePalabra;
    }

    public void setNombrePalabra(String nombrePalabra)
    {
        this.nombrePalabra = nombrePalabra;
    }

    public String getDefinicionPalabra()
    {
        return definicionPalabra;
    }

    public void setDefinicionPalabra(String definicionPalabra)
    {
        this.definicionPalabra = definicionPalabra;
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

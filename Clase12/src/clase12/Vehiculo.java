package clase12;

public class Vehiculo
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private String _patente;
    private int _cantRuedas;
    private EMarcas _marca;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Vehiculo(String _patente, int _cantRuedas, EMarcas _marca)
    {
        this._patente = _patente;
        this._cantRuedas = _cantRuedas;
        this._marca = _marca;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public String getPatente()
    {
        return _patente;
    }

    public int getCantRuedas()
    {
        return _cantRuedas;
    }

    public void setCantRuedas(int _cantRuedas)
    {
        this._cantRuedas = _cantRuedas;
    }

    public EMarcas getMarca()
    {
        return _marca;
    }

    public void setMarca(EMarcas _marca)
    {
        this._marca = _marca;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    protected String Mostrar()
    {
        StringBuilder retString = new StringBuilder();

        retString.append("Marca: ").append(this._marca);
        retString.append("\nPatente: ").append(this._patente);
        retString.append("\nCantidad de ruedas: ").append(this._cantRuedas);

        return retString.toString();
    }

    public static boolean ComparaVehiculos(Vehiculo uno, Vehiculo otro)
    {
        return uno._patente.contentEquals(otro._patente);

    }
    //</editor-fold>    
}

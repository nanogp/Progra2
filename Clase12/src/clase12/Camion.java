package clase12;

public class Camion extends Vehiculo
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    protected float _tara;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Camion()
    {
        super(null, 0, null);
        this._tara = 0;
    }

    public Camion(Vehiculo vehiculo, float _tara)
    {
        super(vehiculo.getPatente(), vehiculo.getCantRuedas(), vehiculo.getMarca());
        this._tara = _tara;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public String Mostrar()
    {
        StringBuilder retString = new StringBuilder();
        retString.append(super.Mostrar());
        retString.append("\nTara: ").append(this._tara);
        return retString.toString();
    }

    //</editor-fold>
}

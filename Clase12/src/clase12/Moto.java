package clase12;

public class Moto extends Vehiculo
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    protected float _cilindrada;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Moto()
    {
        super(null, 0, null);
        this._cilindrada = 0;
    }

    public Moto(EMarcas _marca, float _cilindrada, String _patente, int _cantRuedas)
    {
        super(_patente, _cantRuedas, _marca);
        this._cilindrada = _cilindrada;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public String Mostrar()
    {
        StringBuilder retString = new StringBuilder();
        retString.append(super.Mostrar());
        retString.append("\nCilindrada: ").append(this._cilindrada);
        return retString.toString();
    }

    //</editor-fold>
}

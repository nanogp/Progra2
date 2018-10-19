package ejercicios;

public class Cuenta
{

    public static enum eTipoInteres
    {
        TIN, TAE, TIR
    }

//<editor-fold defaultstate="collapsed" desc="Campos">
    private String _nombre;
    private long _nroCuenta;
    private double _saldo;
    private eTipoInteres _tipoInteres;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public String getNombre()
    {
        return _nombre;
    }

    public long getNroCuenta()
    {
        return _nroCuenta;
    }

    public double getSaldo()
    {
        return _saldo;
    }

    public eTipoInteres getTipoInteres()
    {
        return _tipoInteres;
    }

    public void setNombre(String nombre)
    {
        this._nombre = nombre;
    }

    public boolean setNroCuenta(long nroCuenta)
    {
        if (nroCuenta > 0)
        {
            this._nroCuenta = nroCuenta;
            return true;
        }

        return false;
    }

    public void setSaldo(double saldo)
    {
        this._saldo = saldo;
    }

    public void setTipoInteres(eTipoInteres tipoInteres)
    {
        this._tipoInteres = tipoInteres;
    }

//</editor-fold>
    public void mostrar()

    {
        System.out.println("cuenta: "
                + this._nombre + " | numero: "
                + this._nroCuenta + " | saldo: $"
                + this._saldo + "| tipo interes: "
                + this._tipoInteres);
    }

}

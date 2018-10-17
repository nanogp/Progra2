/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author nano
 */
public class Cuenta
{

//<editor-fold defaultstate="collapsed" desc="Campos">
    private String _nombre;
    private long _nroCuenta;
    private double _saldo;
    private eTipoInteres _tipoInteres;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Metodos">
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

    public void setNombre(String _nombre)
    {
        this._nombre = _nombre;
    }

    public void setNroCuenta(long _nroCuenta)
    {
        this._nroCuenta = _nroCuenta;
    }

    public void setSaldo(double _saldo)
    {
        this._saldo = _saldo;
    }

    public void setTipoInteres(eTipoInteres _tipoInteres)
    {
        this._tipoInteres = _tipoInteres;
    }
//</editor-fold>
}

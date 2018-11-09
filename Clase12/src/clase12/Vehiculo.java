/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

/**
 *
 * @author mponti
 */
public class Vehiculo
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private String _patente;
    private int _cantRuedas;
    private eMarcas _marca;

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Constructores">
    public Vehiculo(String _patente, int _cantRuedas, eMarcas _marca)
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

    public void setPatente(String _patente)
    {
        this._patente = _patente;
    }

    public int getCantRuedas()
    {
        return _cantRuedas;
    }

    public void setCantRuedas(int _cantRuedas)
    {
        this._cantRuedas = _cantRuedas;
    }

    public eMarcas getMarca()
    {
        return _marca;
    }

    public void setMarca(eMarcas _marca)
    {
        this._marca = _marca;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    protected String Mostrar()
    {
        return "";
    }

    public static boolean ComparaVehiculos(Vehiculo uno, Vehiculo otro)
    {
        return true;
    }
//</editor-fold>    
}

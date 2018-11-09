/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

public class Auto extends Vehiculo
{
//<editor-fold defaultstate="collapsed" desc="Atributos">

    protected int _cantidadAsientos;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Constructores">

    public Auto(String _patente, eMarcas _marca, int _cantidadAsientos)
    {
        super(_patente, 4, _marca);
        this._cantidadAsientos = _cantidadAsientos;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="GetSet">
    public int getCantidadAsientos()
    {
        return _cantidadAsientos;
    }

    public void setCantidadAsientos(int _cantidadAsientos)
    {
        this._cantidadAsientos = _cantidadAsientos;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">

    public String Mostrar()
    {
        String aux = super.Mostrar();
        return aux;
    }

//</editor-fold>
}

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

    public Auto()
    {
        super(null, 0, null);
        this._cantidadAsientos = 0;
    }

    public Auto(String _patente, EMarcas _marca, int _cantidadAsientos)
    {
        super(_patente, 4, _marca);
        this._cantidadAsientos = _cantidadAsientos;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public String Mostrar()
    {
        StringBuilder retString = new StringBuilder();
        retString.append(super.Mostrar());
        retString.append("\nCantidad de asientos: ").append(this._cantidadAsientos);
        return retString.toString();
    }

//</editor-fold>
}

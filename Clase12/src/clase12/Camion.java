/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

public class Camion extends Vehiculo
{
//<editor-fold defaultstate="collapsed" desc="Atributos">

    protected float _tara;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Constructores">

    public Camion(Vehiculo vehiculo, float _tara)
    {
        super(vehiculo.getPatente(), vehiculo.getCantRuedas(), vehiculo.getMarca());
        this._tara = _tara;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="GetSet">
    public float getCilindrada()
    {
        return _tara;
    }

    public void setCilindrada(float _cilindrada)
    {
        this._tara = _cilindrada;
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

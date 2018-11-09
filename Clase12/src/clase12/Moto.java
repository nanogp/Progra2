/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

public class Moto extends Vehiculo
{
//<editor-fold defaultstate="collapsed" desc="Atributos">

    protected float _cilindrada;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Constructores">

    public Moto(eMarcas _marca, float _cilindrada, String _patente, int _cantRuedas)
    {
        super(_patente, _cantRuedas, _marca);
        this._cilindrada = _cilindrada;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="GetSet">
    public float getCilindrada()
    {
        return _cilindrada;
    }

    public void setCilindrada(float _cilindrada)
    {
        this._cilindrada = _cilindrada;
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

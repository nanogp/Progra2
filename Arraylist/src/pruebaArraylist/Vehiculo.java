/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaArraylist;

/**
 *
 * @author mponti
 */
public class Vehiculo
{

    private int _velocidadActual;
    private String _tipoVehiculo;

    public Vehiculo()
    {
        _velocidadActual = 0;
        _tipoVehiculo = "";
    }

    protected int getVelocidadActual()
    {
        return _velocidadActual;
    }

    protected void setVelocidadActual(int velocidadActual)
    {
        _velocidadActual = velocidadActual;
    }

    protected String getTipoVehiculo()
    {
        return _tipoVehiculo;
    }

    protected void setTipoVehiculo(String tipo)
    {
        _tipoVehiculo = tipo;
    }

    public void acelerar(int velocidad)
    {
        this._velocidadActual += velocidad;
    }
}

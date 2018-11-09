/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package clase12;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mponti
 */
public class Lavadero
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private ArrayList<Vehiculo> _vehiculos;
    private static float _precioAuto = 0;
    private static float _precioCamion = 0;
    private static float _precioMoto = 0;
    private String _razonSocial;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    static
    {
        generarPrecios();
    }

    private Lavadero()
    {
        this._vehiculos = new ArrayList<Vehiculo>();
    }

    public Lavadero(ArrayList<Vehiculo> _vehiculos, float _precioAuto, float _precioMoto, String _razonSocial)
    {

        this._vehiculos = _vehiculos;

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public ArrayList<Vehiculo> getVehiculos()
    {
        return _vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> _vehiculos)
    {
        this._vehiculos = _vehiculos;
    }

    public String getRazonSocial()
    {
        return _razonSocial;
    }

    public void setRazonSocial(String _razonSocial)
    {
        this._razonSocial = _razonSocial;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">

    private static boolean verificarPrecio(float precio)
    {
        return precio == _precioMoto
                || precio == _precioAuto
                || precio == _precioCamion;
    }

    private static void generarPrecios()
    {
        ThreadLocalRandom seed = ThreadLocalRandom.current();
        float precio = 0;

        while (_precioMoto == 0 && _precioAuto == 0 && _precioCamion == 0)
        {
            while (verificarPrecio(precio))
            {
                precio = (float) seed.nextDouble(150, 565);
            }

            if (_precioMoto == 0)
            {
                _precioMoto = precio;
                if (_precioAuto == 0)
                {
                    _precioAuto = precio;
                }
                else
                {
                    _precioMoto = precio;
                }
            }
        }
    }

    private double calcularTotalFacturado(eVehiculos tipo)
    {
        int autos = 0;
        int camiones = 0;
        int motos = 0;
        double total = 0;

        for (Vehiculo vehiculo : _vehiculos)
        {
            if (vehiculo instanceof Auto)
            {
                autos++;
            }
            else
            {
                if (vehiculo instanceof Camion)
                {
                    camiones++;

                }
                else
                {
                    motos++;
                }
            }
        }

        switch (tipo)
        {
            case Auto:
                total = (double) autos * _precioAuto;
                break;
            case Camion:
                total = (double) camiones * _precioCamion;
                break;
            case Moto:
                total = (double) motos * _precioMoto;
                break;

        }

        return total;

    }

    private double calcularTotalFacturado()
    {
        return calcularTotalFacturado(eVehiculos.Auto)
                + calcularTotalFacturado(eVehiculos.Camion)
                + calcularTotalFacturado(eVehiculos.Moto);
    }

    /**
     * MostrarTotalFacturado: devolverá la ganancia total del lavadero (Double),
     * dicho método tendrá una sobrecarga que reciba como parámetro la
     * enumeración EVehiculos (con Auto, Camión y Moto como enumerados) y
     * retornará la ganancia del Lavadero por tipo de vehículo.
     */
    public double MostrarTotalFacturado()
    {
        return calcularTotalFacturado();
    }

    /**
     * El método EstaEnLavadero(Vehículo,Lavadero) retorna -1 si no está el
     * vehículo en el lavadero, caso contrario, retorna el índice de donde se
     * encuentra dicho vehículo
     */
    public static int EstaEnLavadero(Vehiculo vehiculo, Lavadero lavadero)
    {
        int pos = -1;
        ArrayList<Vehiculo> vehiculos = lavadero.getVehiculos();
        Vehiculo vehiculoEnPos;

        for (int i = 0; i < vehiculos.size(); i++)
        {
            vehiculoEnPos = vehiculos.get(i);
            if (vehiculoEnPos.getPatente().equalsIgnoreCase(vehiculo.getPatente()))
            {
                pos = i;
                break;
            }
        }

        return pos;
    }

    /**
     * El método EstaEnLavadero(Lavadero,Vehículo) retornara TRUE, si el
     * vehículo se encuentra en el lavadero.
     */
    public static boolean EstaEnLavadero(Lavadero lavadero, Vehiculo vehiculo)
    {
        boolean esta = false;
        if (EstaEnLavadero(vehiculo, lavadero) != -1)
        {
            esta = true;
        }
        return esta;
    }

    //</editor-fold>
}

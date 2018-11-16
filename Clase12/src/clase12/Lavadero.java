package clase12;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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
    private static boolean precioYaExiste(double precio)
    {
        boolean retorno = false;
        if (precio == _precioAuto || precio == _precioCamion || precio == _precioMoto)
        {
            retorno = true;
        }
        return retorno;
    }

    static
    {

        ThreadLocalRandom seed = ThreadLocalRandom.current();
        float precio = 0;

        do
        {
            do
            {
                precio = (float) seed.nextDouble(150, 565);
            }
            while (precioYaExiste(precio));

            if (_precioAuto == 0)
            {
                _precioAuto = precio;

            }
            else
            {
                if (_precioCamion == 0)
                {
                    _precioCamion = precio;
                }
                else
                {

                    _precioMoto = precio;

                }
            }
        }
        while (_precioAuto == 0 || _precioCamion == 0 || _precioMoto == 0);
    }

    private Lavadero()
    {
        this._vehiculos = new ArrayList<Vehiculo>();
    }

    public Lavadero(String _razonSocial)
    {
        this();
        this._razonSocial = _razonSocial;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public String LavaderoString()
    {
        StringBuilder retString = new StringBuilder();

        retString.append("RAZON SOCIAL: ").append(this._razonSocial);
        retString.append("\n***Precios vigentes***");
        retString.append("\nMoto: $").append(String.format("%.2f", _precioMoto));
        retString.append("\nAuto: $").append(String.format("%.2f", _precioAuto));
        retString.append("\nCamion: $").append(String.format("%.2f", _precioCamion));
        retString.append("\n\n***Listado de vehiculos***\n");

        for (Vehiculo vehiculo : _vehiculos)
        {
            retString.append(vehiculo.Mostrar());
            retString.append("\n*************\n");
        }
        retString.append("\n\n***Ganancias***");
        retString.append("\nTotales: $").append(String.format("%.2f", this.MostrarTotalFacturado()));
        retString.append("\nPor motos: $").append(String.format("%.2f", this.MostrarTotalFacturado(eVehiculos.Moto)));
        retString.append("\nPor autos: $").append(String.format("%.2f", this.MostrarTotalFacturado(eVehiculos.Auto)));
        retString.append("\nPor camiones: $").append(String.format("%.2f", this.MostrarTotalFacturado(eVehiculos.Camion)));

        return retString.toString();
    }

    private double MostrarTotalFacturado(eVehiculos tipo)
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
                total = (double) motos * _precioAuto;
                break;

        }

        return total;

    }

    /**
     * MostrarTotalFacturado: devolverá la ganancia total del lavadero (Double),
     * dicho método tendrá una sobrecarga que reciba como parámetro la
     * enumeración EVehiculos (con Auto, Camión y Moto como enumerados) y
     * retornará la ganancia del Lavadero por tipo de vehículo.
     */
    public double MostrarTotalFacturado()
    {
        return MostrarTotalFacturado(eVehiculos.Auto)
                + MostrarTotalFacturado(eVehiculos.Camion)
                + MostrarTotalFacturado(eVehiculos.Moto);
    }

    /**
     * El método EstaEnLavadero(Vehículo,Lavadero) retorna -1 si no está el
     * vehículo en el lavadero, caso contrario, retorna el índice de donde se
     * encuentra dicho vehículo
     */
    public static int EstaEnLavadero(Vehiculo vehiculo, Lavadero lavadero)
    {
        int pos = -1;
        Vehiculo vehiculoPosicion;

        for (int i = 0; i < lavadero._vehiculos.size(); i++)
        {
            vehiculoPosicion = lavadero._vehiculos.get(i);
            if (vehiculoPosicion.getPatente().equalsIgnoreCase(vehiculo.getPatente()))
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
        boolean retorno = false;
        if (EstaEnLavadero(vehiculo, lavadero) != -1)
        {
            retorno = true;
        }
        return retorno;
    }

    /**
     * El método AgregarVehiculo, agregara un vehiculo al lavadero siempre y
     * cuando el vehículo no se encuentre en el lavadero. Ej.
     * Lavadero.AgregarVehiculo(unLavadero, unAuto);
     */
    public static void AgregarVehiculo(Lavadero lavadero, Vehiculo vehiculo)
    {
        if (!EstaEnLavadero(lavadero, vehiculo))
        {
            lavadero._vehiculos.add(vehiculo);
        }
    }

    /**
     * El método QuitarVehiculo, quitara un vehiculo al lavadero siempre y
     * cuando el vehículo no se encuentre en el lavadero. Ej.
     * unLavadero.QuitarVehiculo(unaMoto);
     */
    public void QuitarVehiculo(Vehiculo vehiculo)
    {
        if (EstaEnLavadero(this, vehiculo))
        {
            this._vehiculos.remove(EstaEnLavadero(vehiculo, this));
        }
    }

    /**
     * Generar un método estático (OrdenarVehiculosPorPatente : int) que reciba
     * dos vehículos y retorne un 0 (cero), si ambas patentes son iguales, si la
     * primera patente es ‘mayor’ que la segunda, retornará un 1 (uno) y si no,
     * retornará un -1 (menos uno).
     */
    public static int OrdenarVehiculosPorPatente(Vehiculo uno, Vehiculo otro)
    {
        return (int) Math.signum(uno.getPatente().compareTo(otro.getPatente()));
    }

    /**
     * Generar un método de instancia (OrdenarVehiculosPorMarca : int) que
     * reciba dos vehículos retorne un 0 (cero), si ambas marcas son iguales, si
     * la primera marca es ‘mayor’ que la segunda, retornará un 1 (uno) y si no,
     * retornará un -1 (menos uno).
     */
    public int OrdenarVehiculosPorMarca(Vehiculo uno, Vehiculo otro)
    {
        return (int) Math.signum(uno.getMarca().compareTo(otro.getMarca()));
    }
    //</editor-fold>
}

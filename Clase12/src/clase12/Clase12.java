package clase12;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Clase12
{

    public static void main(String[] args)
    {
        Lavadero unLavadero = new Lavadero("TE MANGUEREO LA CARROCERIA");
        Auto auto;
        Camion camion;
        Moto moto;
        Vehiculo vehiculo;

        //<editor-fold defaultstate="collapsed" desc="Autos">
        auto = new Auto(getPatenteRandom(), EMarcas.Fiat, 4);

        Lavadero.AgregarVehiculo(unLavadero, auto);
        Lavadero.AgregarVehiculo(unLavadero, auto);

        auto = new Auto(getPatenteRandom(), EMarcas.Ford, 5);
        Lavadero.AgregarVehiculo(unLavadero, auto);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Camiones">
        vehiculo = new Vehiculo(getPatenteRandom(), 18, EMarcas.Scania);
        camion = new Camion(vehiculo, 13000);
        Lavadero.AgregarVehiculo(unLavadero, camion);

        vehiculo = new Vehiculo(getPatenteRandom(), 10, EMarcas.Iveco);
        camion = new Camion(vehiculo, 8000);
        Lavadero.AgregarVehiculo(unLavadero, camion);

        vehiculo = new Vehiculo("NO DEBE ESTAR", 10, EMarcas.Iveco);
        camion = new Camion(vehiculo, 3000);
        unLavadero.QuitarVehiculo(camion);//no debe fallar si no existe
        Lavadero.AgregarVehiculo(unLavadero, camion);
        unLavadero.QuitarVehiculo(camion);//ahora existe y lo debe quitar
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Motos">
        moto = new Moto(EMarcas.Zanella, 50, getPatenteRandom(), 2);
        Lavadero.AgregarVehiculo(unLavadero, moto);
        //</editor-fold>

        System.out.println(unLavadero.LavaderoString());

        System.out.println("\n\n\n******************* ORDEN EN LA SALA **********************\n");
        System.out.println(auto.Mostrar());
        System.out.println(moto.Mostrar());
        System.out.println("OrdenarVehiculosPorPatente(auto, moto): " + Lavadero.OrdenarVehiculosPorPatente(auto, moto));
        System.out.println("OrdenarVehiculosPorPatente(moto, auto): " + Lavadero.OrdenarVehiculosPorPatente(moto, auto));
        System.out.println("OrdenarVehiculosPorPatente(moto, moto): " + Lavadero.OrdenarVehiculosPorPatente(moto, moto));
        System.out.println("OrdenarVehiculosPorMarca(auto, moto): " + unLavadero.OrdenarVehiculosPorMarca(auto, moto));
        System.out.println("OrdenarVehiculosPorMarca(moto, auto): " + unLavadero.OrdenarVehiculosPorMarca(moto, auto));
        System.out.println("OrdenarVehiculosPorMarca(moto, moto): " + unLavadero.OrdenarVehiculosPorMarca(moto, moto));

    }

    //<editor-fold defaultstate="collapsed" desc="Patente Ramndom">
    public static String getPatenteRandom()
    {
        String[] letras =
        {
            "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG", "HHH", "III", "JJJ"
        };
        int numeros = ThreadLocalRandom.current().nextInt(111, 999);

        return letras[ThreadLocalRandom.current().nextInt(letras.length)] + numeros;
    }
//</editor-fold>
}

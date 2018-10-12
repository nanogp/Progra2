/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3y4;

/**
 *
 * @author mponti
 */
public class Carrera
{

    public static int cantidadDeMinutos = 0;
    public static int cantidadDeAutos = 6;
    private static int autoGanador;
    public Auto autos[] = new Auto[cantidadDeAutos];

    public void mostrarCarrera()
    {
        System.out.println("Minuto: " + cantidadDeMinutos);
        for (int i = 0; i < autos.length; i++)
        {
            System.out.print("Auto " + (i + 1) + " - ");
            System.out.println(autos[i].toString());
            buscarGanador(i);
        }

        System.out.println("Va ganando el auto " + (autoGanador + 1) + " con " + autos[autoGanador].getKm() + "km");
        System.out.println("****************************");
    }

    public void porTiempo(int min)
    {
        autoGanador = 0;
        for (int i = 0; i < min; i++)
        {
            for (Auto auto : autos)
            {
                auto.agregarKm((int) (Math.random() * 10));
            }
            cantidadDeMinutos++;
            mostrarCarrera();
        }
        System.out.println("Gano el auto " + (autoGanador + 1) + " con " + autos[autoGanador].getKm() + "km");
    }

    private void buscarGanador(int numeroAuto)
    {
        if (autos[autoGanador].getKm() < autos[numeroAuto].getKm())
        {
            autoGanador = numeroAuto;
        }
    }

    public Carrera()
    {
        for (int i = 0; i < autos.length; i++)
        {
            autos[i] = new Auto();
            autos[i].agregarKm((int) (Math.random() * 10));
        }
    }
}

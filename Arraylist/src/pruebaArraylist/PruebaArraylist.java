/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaArraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mponti
 */
public class PruebaArraylist
{

    /**
     * @param args the command line arguments
     */
    private static boolean add;

    public static void main(String[] args)
    {
        ArrayList lista = new ArrayList();
        Automovil automovil;

        System.out.println("crear 3 autos en la lista...");

        add = lista.add(new Automovil("Fiat", "Vivace", 1997, 40));

        add = lista.add(new Automovil("Renault", "Fuego", 1986, 70));

        add = lista.add(new Automovil("Peugeot", "405", 2001, 65));

        for (Iterator it = lista.iterator(); it.hasNext();)
        {
            Object o = it.next();
            System.out.println("--------------");
            automovil = (Automovil) o;
            automovil.mostrar();
            automovil.mostrarVelocidadActual();
            System.out.println("Acelero 20km/h...");
            automovil.acelerar(20);
            automovil.mostrarVelocidadActual();
        }
    }//main
}//class
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
public class PruebaArraylist {

    /**
     * @param args the command line arguments
     */
    private static boolean add;

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        Automovil automovil;

        System.out.println(
                "crear 3 autos en la lista...");

        automovil = new Automovil("Fiat", "Vivace", 1997);
        add = lista.add(automovil);

        automovil = new Automovil("Renault", "Fuego", 1986);
        add = lista.add(automovil);

        automovil = new Automovil("Peugeot", "405", 2001);
        add = lista.add(automovil);

        for (Object o : lista) {
            ((Automovil) o).mostrar();
        }
    }
}

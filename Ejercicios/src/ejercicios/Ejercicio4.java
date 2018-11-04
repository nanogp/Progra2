/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.awt.Color;

public class Ejercicio4
{

    public static void main()
    {
        Boligrafo unBoligrafo = new Boligrafo(Color.BLUE, 100);
        Boligrafo otroBoligrafo = new Boligrafo(Color.RED, 50);
        unBoligrafo.pintar(55);
        unBoligrafo.recargar();
        unBoligrafo.pintar(15);
        otroBoligrafo.pintar(87);
    }
}

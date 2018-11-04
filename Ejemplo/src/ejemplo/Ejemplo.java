/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import toolbox.Input;
import toolbox.Output;
import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Automovil miAuto = new Automovil();

        miAuto.velocidadActual = 50;
        Automovil.cantidadDeRuedas = 4;
        Automovil.mostrarCantidadRuedas();
        miAuto.mostrarVelocidadActual();
        miAuto.Acelerar(10);
        miAuto.mostrarVelocidadActual();
    }
}

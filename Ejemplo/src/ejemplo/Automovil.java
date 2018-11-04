/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import static toolbox.Output.mostrarMensaje;

/**
 *
 * @author mponti
 */
public class Automovil {

    public int velocidadActual;
    public static int cantidadDeRuedas;

    public static void mostrarCantidadRuedas() {
        mostrarMensaje("La cantidad de ruedas es: " + cantidadDeRuedas);
    }

    public void mostrarVelocidadActual() {
        mostrarMensaje("La velocidad actual es: " + this.velocidadActual);
    }

    public void Acelerar(int velocidad) {
        this.velocidadActual += velocidad;
    }
}

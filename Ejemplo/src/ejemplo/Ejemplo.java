/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;
import toolbox.Input;
import toolbox.Output;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int unNumero;
        String unaString = new String();
        
        Output.mostrarMensaje("Ingrese numero");
        unNumero = Input.leerIn.nextInt();
        
        Output.mostrarMensaje("El numero es: " + unNumero);
        
        Output.mostrarMensaje("Ingrese nombre");
        
        unaString = Input.leerIn.next();
        
        Output.mostrarMensaje("El nombre es: " + unaString);
    }

}
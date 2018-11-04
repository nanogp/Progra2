/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10;

import centralTelefonica.*;
import toolbox.*;
import java.util.ArrayList;

public class Clase10
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Centralita centralita = new Centralita("TELECOMICA DE ARGENZUELA");
        ArrayList<Llamada> lista = centralita.getLlamadas();
        Llamada unaLlamada;

        unaLlamada = new Llamada(String.format("%.0f", Random.randomFloat(1141111111, 1169999999)),
                String.format("%.0f", Random.randomFloat(1141111111, 1169999999)),
                21);

        lista.add(new Local(String.format("%.0f", Random.randomFloat(1141111111, 1169999999)),
                30,
                String.format("%.0f", Random.randomFloat(1141111111, 1169999999)),
                (float) 2.65));

        lista.add(new Provincial(Franja.Franja_1, unaLlamada));

        lista.add(new Local(String.format("%.0f", Random.randomFloat(1141111111, 1169999999)),
                45,
                String.format("%.0f", Random.randomFloat(1141111111, 1169999999)),
                (float) 1.99));

        lista.add(new Provincial(Franja.Franja_3, unaLlamada));

        centralita.mostrar();

    }
}

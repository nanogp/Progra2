/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.Date;

/**
 *
 * @author mponti
 */
public class Clase5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        Date fecha = new Date(2015, 5, 15);

        NewClass objeto1 = new NewClass();
        System.out.println("OBJETE 1");
        objeto1.mostrarDatos();

        NewClass objeto2 = new NewClass(10, "Sarlanga", fecha);
        System.out.println("OBJETE 2");
        objeto2.mostrarDatos();

        NewClass objete3 = new NewClass(objeto2);
        System.out.println("OBJETE 3");
        objeto2.mostrarDatos();

    }
}

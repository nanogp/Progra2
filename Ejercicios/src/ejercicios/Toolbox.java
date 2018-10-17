/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mponti
 */
public class Toolbox
{

    public static class NombreRandom
    {

        private static String[] inicio =
        {
            "Kr", "Ca", "Ra", "Mrok", "Cru",
            "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
            "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
            "Mar", "Luk"
        };
        private static String[] medio =
        {
            "air", "ir", "mi", "sor", "mee", "clo",
            "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
            "marac", "zoir", "slamar", "salmar", "urak"
        };
        private static String[] fin =
        {
            "d", "ed", "ark", "arc", "es", "er", "der",
            "tron", "med", "ure", "zur", "cred", "mur"
        };

        public static String generarNombre()
        {

            return inicio[ThreadLocalRandom.current().nextInt(inicio.length)]
                    + medio[ThreadLocalRandom.current().nextInt(medio.length)]
                    + fin[ThreadLocalRandom.current().nextInt(fin.length)];

        }
    }
    public static Scanner leerIn = new Scanner(System.in);

}

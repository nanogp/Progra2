package ejercicios;

import toolbox.*;

public class Ejercicios
{

    public static void main(String[] args)
    {
        //Ejercicio1.main();
        //Ejercicio2.main();
        //Ejercicio4.main();

        class Prueba
        {

            public String cadena;
            public int entero;
            public float flotante;
            public int[] arrayInt;

            public Prueba()
            {
                cadena = Random.randomName();
                entero = Random.randomSeed.nextInt(10, 100);
                flotante = (float) (entero + 0.57484);
                arrayInt = Entero.arrayIntRandom(3, 10, 100);
            }

        }

        String cabeceras = Cadena.encolumnarAlinearTexto(" | ", "ENTERO", 15, Cadena.ALINEA_MED, "CADENA", 20, Cadena.ALINEA_MED, "FLOTANTE", 15, Cadena.ALINEA_MED);
        System.out.println(cabeceras);
        System.out.println(Cadena.repeat("-", cabeceras.length()));

        for (int i = 0; i < 5; i++)
        {
            Prueba p = new Prueba();
            System.out.println(Cadena.encolumnarAlinearTexto(" | ", p.entero, 15, Cadena.ALINEA_MED, p.cadena, 20, Cadena.ALINEA_IZQ, p.flotante, 15, Cadena.ALINEA_DER));
        }

        for (int i = 0; i < 5; i++)
        {
            Prueba p = new Prueba();
            System.out.println(Cadena.encolumnarTexto(" | ", p.entero, 15, p.cadena, 20, p.flotante, 15));
        }

    }

}

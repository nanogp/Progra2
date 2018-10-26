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

        String cabeceras = Cadena.encolumnarAlinearTexto(" | ", 15, Cadena.ALINEA_IZQ, "FLOTANTE", 20, Cadena.ALINEA_MED, "CADENA", 15, Cadena.ALINEA_DER, "ENTERO");
        System.out.println(cabeceras);

        System.out.println(Cadena.repeat("-", cabeceras.length()));
        for (int i = 0;
                i < 10; i++)
        {
            Prueba p = new Prueba();
            String aux = Cadena.encolumnarTexto(" | ", 15, p.flotante, 20, p.cadena, 15, p.entero);
            System.out.println(Cadena.encolumnarAlinearTexto(" | ", 15, Cadena.ALINEA_IZQ, p.flotante, 20, Cadena.ALINEA_MED, p.cadena, 15, Cadena.ALINEA_DER, p.entero));
        }
    }

}

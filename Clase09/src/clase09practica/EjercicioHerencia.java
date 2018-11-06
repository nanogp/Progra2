package clase09practica;

import toolbox.*;

public class EjercicioHerencia
{

    public static void main(String[] args)
    {

        SerHumano unSerHumano;
        Empleado unEmpleado;
        Gerente unGerente;
        String cabeceras;

        cabeceras = toolbox.Cadena.encolumnarAlinearTexto(" | ",
                "NOMBRE", 20, Cadena.ALINEA_MED,
                "PESO", 6, Cadena.ALINEA_MED,
                "ALTURA", 6, Cadena.ALINEA_MED,
                "SEXO", 10, Cadena.ALINEA_MED);

        System.out.println(cabeceras);
        System.out.println(toolbox.Cadena.repeat("-", cabeceras.length()));

        for (int i = 0; i < 10; i++)
        {
            unSerHumano = new SerHumano(Random.randomName(),
                    (byte) Random.randomSeed.nextInt(30, 100),
                    (byte) Random.randomSeed.nextInt(14, 21),
                    (String) Random.randomObject("M", "F"));
            unSerHumano.mostrarSerHumano();
        }

    }

}

package clase6;

import toolbox.*;

public class Clase6
{

    public static void main(String[] args)
    {

        int cantidadAlumnos = 10;
        Alumno.cantidadNotas = 3;
        int notaMin = 2;
        int notaMax = 10;

        Alumno[] alumnos = new Alumno[cantidadAlumnos];

        //cargo el array de alumnos
        for (int i = 0; i < alumnos.length; i++)
        {
            alumnos[i] = new Alumno(Alumno.getNextId(),
                    Random.randomName() + ", " + Random.randomName(),
                    Random.randomName() + " " + Random.randomSeed.nextInt(101, 6000),
                    Random.randomName() + "@gmail.com");
        }

        //genero cabecera
        Cadena.stringBuilder = new StringBuilder();
        Cadena.stringBuilder.append(
                Cadena.encolumnarAlinearTexto(" | ",
                        "ID", 3, Cadena.ALINEA_MED,
                        "APELLIDO Y NOMBRE", 25, Cadena.ALINEA_MED,
                        "DIRECCION", 20, Cadena.ALINEA_MED,
                        "EMAIL", 25, Cadena.ALINEA_MED,
                        ""));

        for (int i = 1; i <= Alumno.cantidadNotas; i++)
        {
            Cadena.stringBuilder.append(
                    Cadena.encolumnarAlinearTexto(" | ", "NOTA " + i, 6, Cadena.ALINEA_MED,
                            ""));

        }
        Cadena.stringBuilder.append(Cadena.encolumnarAlinearTexto(" | ", "PROMEDIO ", 6, Cadena.ALINEA_MED));

        System.out.println(Cadena.stringBuilder.toString());
        System.out.println(Cadena.repeat("-", Cadena.stringBuilder.length()));

        //calculo campos numericos y muestro
        for (Alumno alumno : alumnos)
        {
            alumno.setNotasIngreso(Entero.arrayIntRandom(Alumno.cantidadNotas, notaMin, notaMax));
            alumno.calcularPromedio();
            System.out.println(alumno.alumnoAString());
        }
    }
}

package clase6;

import java.util.Arrays;

public class Clase6
{

    public static int cantidadAlumnos;

    public static void main(String[] args)
    {
        cantidadAlumnos = 2;
        Alumno._cantidadNotas = 3;
        int notaMin = 1;
        int notaMax = 10;

        Alumno[] alumnos = new Alumno[cantidadAlumnos];

        //cargo el array de alumnos
        for (int i = 0; i < alumnos.length; i++)
        {
            alumnos[i] = new Alumno(Alumno.getNextId(), Toolbox.NombreRandom.generarNombre(), Toolbox.NombreRandom.generarNombre(), Toolbox.NombreRandom.generarNombre() + "@gmail.com");
        }

        //calculo campos numericos y muestro
        for (Alumno alumno : alumnos)
        {
            alumno.setNotasIngreso(Toolbox.Enteros.arrayIntRandom(Alumno._cantidadNotas, notaMin, notaMax));
            alumno.calcularPromedio();
            System.out.println(alumno.alumnoAString());
        }
    }

}

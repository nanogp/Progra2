package clase6;

import java.util.Arrays;

public class Clase6
{

    public static void main(String[] args)
    {
        Alumno[] alumnos = new Alumno[2];

        for (int i = 0; i < alumnos.length; i++)
        {
            alumnos[i] = new Alumno(Alumno.getNextId(), Toolbox.NombreRandom.generarNombre(), Toolbox.NombreRandom.generarNombre(), Toolbox.NombreRandom.generarNombre() + "@gmail.com");
        }

        for (Alumno alumno : alumnos)
        {
            for (int i = 0; i < Alumno._cantidadNotas; i++)
            {
                alumno.setNotasIngreso(Toolbox.random.nextInt(1, 10), i);
                alumno.calcularPromedio();
            }
            System.out.println(alumno.alumnoAString());
        }

    }
}

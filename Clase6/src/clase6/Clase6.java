package clase6;

import java.util.Arrays;

public class Clase6
{

    public static void main(String[] args)
    {
        Alumno unAlumno = new Alumno(Alumno.getNextId(), Toolbox.NombreRandom.generarNombre(), "Sarasa 1234", "unmail@gmail.com");

        for (int i = 0; i < 3; i++)
        {
            unAlumno.setNotasIngreso(Toolbox.random.nextInt(1, 10), i);
        }

        unAlumno.calcularPromedio();

        System.out.println(unAlumno.alumnoAString());
    }
}

/**
 * crear clase alumno con nombre y nota getters y constructor que inicializa
 * atributos polimorfismo en toString de la clase alumno extiende
 * alumnoDesaprobado con atributo privado string motivo el constructor recibe un
 * alumno y el motivo getter para motivo
 *
 * la clase AlumnoDesaprobadoException extiende de Exception y posee un atributo privado del tipo AlumnoDesaprobado
 * el constructor parametrizado recibira un alumnoDesaprobado, realizar getter
 */
package clase23;

import java.util.*;

public class Clase23
{

    public static void main(String[] args)
    {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Pepe Biondi", 6));
        alumnos.add(new Alumno("Guillermo Francella", 4));
        alumnos.add(new Alumno("Martin Prince", 10));

        for (Alumno alumno : alumnos)
        {
            try
            {
                valorarAlumno(alumno);
            }
            catch (AlumnoDesaprobadoException e)
            {
                System.out.println(e.toString());
            }
        }
    }

    public static void valorarAlumno(Alumno alumno) throws AlumnoDesaprobadoException
    {
        /**
         * si nota >=6 mensaje aprobo sino exception
         */
        if (alumno.getNota() >= 6)
        {
            System.out.println(alumno.toString());
        }
        else
        {
            throw new AlumnoDesaprobadoException(new AlumnoDesaprobado("no llega al 6 y saca ese " + alumno.getNota() + " cochino", alumno));
        }
    }

}

/**
 *
 * Se pide crear 3 instancias de la clase Alumno (3 objetos), colocarle nombre,
 * apellido y legajo a cada uno de ellos. Sólo se podrá ingresar las notas
 * (nota1 y nota2) a través del método Estudiar. El método CalcularFinal deberá
 * colocar la nota del final sólo si las notas 1 y 2 son mayores o iguales a 4 ,
 * caso contrario la inicializará con -1. Para darle un valor a la nota final
 * utilice el método de instancia NextInt de la clase Random. Por último, el
 * método Mostrar, expondrá en la consola todos los datos de los alumnos, a
 * excepción de la nota final. Este valor se mostrará sólo si es distinto de -1.
 *
 */
package ejercicios;

import toolbox.*;

public class Ejercicio1
{

    public static void main()
    {

        Alumno tresAlumnos[] = new Alumno[3];

        for (int i = 0; i < 3; i++)
        {
            tresAlumnos[i] = new Alumno();
            switch (i)
            {
                case 0:
                    tresAlumnos[i].apellido = Random.randomName();
                    tresAlumnos[i].nombre = Random.randomName();
                    tresAlumnos[i].legajo = 100 + i;
                    tresAlumnos[i].estudiar();
                    tresAlumnos[i].calcularFinal();
                    tresAlumnos[i].mostrar();
                    break;
                case 1:
                    tresAlumnos[i].apellido = Random.randomName();
                    tresAlumnos[i].nombre = Random.randomName();
                    tresAlumnos[i].legajo = 100 + i;
                    tresAlumnos[i].estudiar();
                    tresAlumnos[i].calcularFinal();
                    tresAlumnos[i].mostrar();
                    break;
                case 2:
                    tresAlumnos[i].apellido = Random.randomName();
                    tresAlumnos[i].nombre = Random.randomName();
                    tresAlumnos[i].legajo = 100 + i;
                    tresAlumnos[i].estudiar();
                    tresAlumnos[i].calcularFinal();
                    tresAlumnos[i].mostrar();
                    break;
            }
        }
    }
}

/**
 * Ejercicio 2.
 * Crear las siguientes Excepciones:
 * DesbordePilaExcepcion cuyo constructor recibirá un String que representa un mensaje.
 * PilaVaciaExcepcion cuyo constructor recibirá un String que representa un mensaje.
 *
 * Crear la clase Pila que poseerá los siguientes atributos públicos y de clase:
 * int capacidad
 * int[] a
 * Stack<Integer> numeros
 *
 * Con los siguientes métodos:
 *
 * void InsertarDato(int) para sumar elementos a la pila. Para ello deberá
 * verificar que la cantidad de elementos que tiene la pila no supere el valor
 * de la capacidad de la colección. En caso contrario lanzar la excepción
 * correspondiente ExtrarDato() para retirar el tope de la pila. En el caso de
 * que no haya elementos para retirar, lanzar la excepción correspondiente.
 *
 * En el método Main, realizar un menú de opciones en donde se pueda interactuar
 * con un menú de usuarios que permita agregar, quitar y mostrar los elementos
 * de una pila. Manejar las excepciones que se puedan llegar a generar.
 */
package clase20;

public class Ejercicio02
{

    public static void main(String[] args) throws DesbordePilaExcepcion
    {
        Pila.capacidad = 5;
        Pila unaPila = new Pila();
        try
        {
            for (int i = 0; i < unaPila.capacidad; i++)
            {
                unaPila.InsertarDato(toolbox.Random.randomSeed.nextInt(10));
            }
        }
        catch (DesbordePilaExcepcion e)
        {
            System.out.println("pila llena");
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

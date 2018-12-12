package clase20;

import java.util.Stack;

public class Pila
{

    /*
        * Con los siguientes métodos:
        *
        * void InsertarDato(int) para sumar elementos a la pila. Para ello deberá
        * verificar que la cantidad de elementos que tiene la pila no supere el valor
        * de la capacidad de la colección. En caso contrario lanzar la excepción
        * correspondiente 
        * ExtrarDato() para retirar el tope de la pila. En el caso de
        * que no haya elementos para retirar, lanzar la excepción correspondiente.
        *
        * En el método Main, realizar un menú de opciones en donde se pueda interactuar
        * con un menú de usuarios que permita agregar, quitar y mostrar los elementos
        * de una pila. Manejar las excepciones que se puedan llegar a generar.
     */
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    public static int capacidad;
    public static int[] a;
    public static Stack<Integer> numeros;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Pila()
    {
        numeros = new Stack<>();
        capacidad = 0;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    void InsertarDato(int numero) throws DesbordePilaExcepcion
    {
        boolean ret;
        if (numeros.size() > capacidad)
        {
            ret = numeros.add(numero);
        }
        else
        {
            throw new DesbordePilaExcepcion("La pila se lleno");
        }
    }

    int ExtraerDato() throws PilaVaciaExcepcion
    {
        int ret = 0;
        if (numeros.size() == 0)
        {
            throw new PilaVaciaExcepcion("La pila esta vacia");
        }
        else
        {
            ret = numeros.pop();
        }
        return ret;
    }
    //</editor-fold>
}

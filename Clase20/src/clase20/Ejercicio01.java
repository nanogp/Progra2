/**
 *Ejercicio 1.
 * Crear la clase fueraDeRangoExcepcion que hereda de la clase Exception.
 * Cuyo constructor recibe como parámetro un String que representa un mensaje.
 * La clase Main, tendrá un método verificarRango que recibe como parámetros dos enteros.
 * Este método verifica si el primer parámetro es menor que 100 y el segundo mayor que 9.
 * En caso de que no se cumplan estas condiciones, el método deberá lanzar una excepción del tipo fueraDeRangoExcepcion.
 * Pedir en el método Main dos valores intentar dividirlos entre sí y manejar las correspondientes excepciones
 * que se puedan generar.
 */
package clase20;

import java.util.InputMismatchException;

public class Ejercicio01
{

    static int primerEntero, segundoEntero;
    static float resultado;

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Ingresar primer numero < 100");
            primerEntero = toolbox.Toolbox.leerDeConsola.nextInt();

            System.out.println("Ingresar segundo numero > 9");
            segundoEntero = toolbox.Toolbox.leerDeConsola.nextInt();

            verificarRango(primerEntero, segundoEntero);
            resultado = (float) primerEntero / segundoEntero;

            System.out.println(String.format("%.2f", resultado));

        }
        catch (FueraDeRangoExcepcion e)
        {
            System.out.println("FUERA DE RANGO");
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e)
        {
            System.out.println("Dije numero entero, papu");
        }
        catch (Exception e)
        {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

        }

    }

    public static void verificarRango(int primero, int segundo) throws FueraDeRangoExcepcion
    {
        if (!(primero < 100 && segundo > 9))
        {
            throw new FueraDeRangoExcepcion("No se cumple el rango esperado");
        }

    }
}

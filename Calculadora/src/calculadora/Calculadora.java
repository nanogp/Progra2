/*
Crear Calculadora con los siguientes miembros estáticos:

Atributos:
(-)Resultado :float
(-)Operador :char

Métodos:
(-)Sumar(int,int) :void
(-)Restar(int,int) :void
(-)Multiplicar(int,int) :void
(-)Dividir(int,int) :void
(+)CalcularOperacion(int, int) : void


(+)MostrarResultado :void
(+)setOperador(char) :void
(+)getOperador() :char


MAIN

pedir un numero
pedir otro numero

setoperador (+)
calculo
mostrarresultado

setoperador (-)
calculo
mostrarresultado

Realizar en la clase main un programa que permite testear todos los métodos de la clase Calculadora
 */
package calculadora;

/**
 *
 * @author mponti
 */
public class Calculadora
{

    private static float _resultado;
    private static char _operador;

    private static void _sumar(int a, int b)
    {
        _resultado = a + b;
    }

    private static void _restar(int a, int b)
    {
        _resultado = a - b;
    }

    private static void _multiplicar(int a, int b)
    {
        _resultado = a * b;
    }

    private static void _dividir(int a, int b)
    {
        if (b != 0)
        {
            _resultado = (float) a / b;
        }
    }

    public static void mostrarResultado()
    {
        System.out.println("El resultado de la operacion '" + getOperador() + "'  es: " + Calculadora._resultado);
    }

    public static void setOperador(char operador)
    {
        Calculadora._operador = operador;
    }

    public static char getOperador()
    {
        return Calculadora._operador;
    }

    public static void calcularOperacion(int a, int b)
    {
        switch (Calculadora.getOperador())
        {
            case '+':
                _sumar(a, b);
                break;
            case '-':
                _restar(a, b);
                break;
            case '*':
                _multiplicar(a, b);
                break;
            case '/':
                _dividir(a, b);
                break;
            default:
                System.out.println("");
        }
    }

    public static void probarTodo()
    {
        char operador = 'a';
        int a, b;

        operador = toolbox.Toolbox.leerDeConsola.next().charAt(0);
        while (operador != 'f')
        {
            System.out.println("Ingrese operador (f para finalizar)");
            setOperador(operador);
            System.out.println("Ingresar primer numero");
            a = toolbox.Toolbox.leerDeConsola.nextInt();
            System.out.println("Ingresar segundo numero");
            b = toolbox.Toolbox.leerDeConsola.nextInt();

            calcularOperacion(a, b);
            mostrarResultado();
            operador = toolbox.Toolbox.leerDeConsola.next().charAt(0);
        }
    }

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args)
    {
        probarTodo();
    }
}

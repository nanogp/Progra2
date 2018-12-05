package clase19;

import java.util.Scanner;

public class Demo
{

    public static class ZeroDivisionException extends ArithmeticException
    {
    }

    public static void main(String[] args)
    {

        int a, b;
        Scanner leerDeConsola = new Scanner(System.in);

        try
        {
            System.out.println("ingresar numero");
            a = Integer.parseInt(leerDeConsola.nextLine());
            System.out.println("ingresar numero");
            b = Integer.parseInt(leerDeConsola.nextLine());
            if (b == 0)
            {
                throw new IllegalArgumentException("No se puede dividir por zero");
            }
            System.out.println(a / b);

        }
        catch (ZeroDivisionException e)
        {
            System.out.println("no se puede dividir por zeraaaaa");
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("no es un numero válido");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Error aritmetico");
        }
        catch (Exception e)
        {

            System.out.println(e.getMessage());
            System.out.println("----------------");
            System.out.println(e.getClass());
            System.out.println("----------------");
            throw e;
        }
        finally
        {
            System.out.println("el finally");
        }
        System.out.println("despues del finally");

    }

    public static void dividir(int n) throws IllegalArgumentException, Exception
    {
        if (n == 0)
        {

            throw new IllegalArgumentException("el divisor es cero");
        }
        else
        {
            throw new Exception(String.format("%.2f", (float) 40 / n));
        }
    }
}

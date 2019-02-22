/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase19;

/**
 *
 * @author mponti
 */
public class Encadenadas
{

    public static void main(String[] args)
    {
        try
        {
            funcion1();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void funcion1() throws Exception
    {
        try
        {
            System.out.println("funcion 1");
            funcion2();
        }
        catch (Exception e)
        {
            throw new Exception(
                    new StringBuilder()
                            .append(e.getMessage())
                            .append("\nERROR EN F1")
                            .toString());
        }
    }

    public static void funcion2() throws Exception

    {
        try
        {
            System.out.println("funcion 2");
            funcion3();
        }
        catch (Exception e)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append("\nERROR EN F2");
            throw new Exception(sb.toString());
        }
    }

    public static void funcion3() throws Exception
    {
        try
        {
            System.out.println("funcion 3");
            funcion4();
        }
        catch (Exception e)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append("\nERROR EN F3");
            throw new Exception(sb.toString());
        }
    }

    public static void funcion4() throws Exception
    {
        try
        {
            System.out.println("funcion 4");
            System.out.println(1 / 0);
        }
        catch (Exception e)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append("\nERROR EN F4");
            throw new Exception(sb.toString());
        }
    }
}

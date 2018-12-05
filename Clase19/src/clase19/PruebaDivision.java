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
public class PruebaDivision
{

    public static void main(String[] args)
    {
        try
        {
            System.out.println("primera llamada:");
            Demo.dividir(6);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            System.out.println("segunda llamada:");
            Demo.dividir(0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());

        }
    }
}

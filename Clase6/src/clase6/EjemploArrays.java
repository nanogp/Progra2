/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author mponti
 */
public class EjemploArrays
{

    public static void main(String[] args)
    {
        int[] unVector = new int[5];

        for (int i = 0; i < unVector.length; i++)
        {
            //unVector[i] = Toolbox.random.nextInt(1, 10);
            //unVector[i] = Toolbox.leerIn.nextInt();
            unVector[i] = i + 1;
        }

        for (int i = 0; i < unVector.length; i++)
        {
            System.out.println("pos " + i + ": " + unVector[i]);
        }

        int[] clonVector = unVector.clone();

        for (int i = 0; i < clonVector.length; i++)
        {
            clonVector[i] = Toolbox.random.nextInt(1, 10);
        }

        for (int i = 0; i < clonVector.length; i++)
        {
            System.out.println("clon pos " + i + ": " + unVector[i]);
        }
    }
}

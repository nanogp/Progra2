package clase6;

import toolbox.Toolbox;

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

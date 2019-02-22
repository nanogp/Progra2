package clase20;

import java.lang.ref.WeakReference;

public class Clase20
{

    public static void garbageCollector()
    {
        Object obj = new Object();
        WeakReference ref = new WeakReference<>(obj);
        int i = 0;
        while (ref.get() != null)
        {
            System.gc();
            i++;

        }
        System.out.println("corrio " + i + " veces");
    }

    public static void main(String[] args)
    {
        try
        {
            Ejercicio01.main(args);
            Ejercicio02.main(args);
            garbageCollector();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}

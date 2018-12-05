package clase19;

public class Clase19
{

    public static void main(String[] args)
    {
        //Demo.main(args);
        try
        {
            Demo.dividir(6);

            Demo.dividir(0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}

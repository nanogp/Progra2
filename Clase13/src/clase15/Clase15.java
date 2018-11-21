package clase15;

import java.util.ArrayList;

public class Clase15
{

    public static void main(String[] args)
    {
        ClaseDos dos = new ClaseDos("ATRIBUTEEEE", 11);
        ClaseTres tres = new ClaseTres(dos.getUno(), dos.getDos(), 4345);

        ArrayList<ClaseUno> lista = new ArrayList<>();

        /**
         * ClaseUno uno = new ClaseUno("ATRIBUTILLO PILLO");
         * System.out.println("\nel primero es este:");
         * System.out.println(uno.mostrarUno());
         * System.out.println("********************");
         */
        lista.add(dos);
        lista.add(tres);

        for (ClaseUno claseUno : lista)
        {
            System.out.println(claseUno.mostrar());
        }
        
        System.out.println(tres.equals(dos));

        /**
         * System.out.println("\nel segundo es este:");
         * System.out.println(dos.mostrar());
         * System.out.println("********************");
         *
         * System.out.println("\nel tercero es este:");
         * System.out.println(tres.mostrar());
         * System.out.println("********************");
         */
    }
}

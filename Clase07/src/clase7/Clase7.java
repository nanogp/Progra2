package clase7;

import java.util.ArrayList;
import toolbox.*;

public class Clase7
{

    public static void main(String[] args)
    {
        ArrayList<Perro> lista;
        lista = new ArrayList();

        for (int i = 0; i < 4; i++)
        {
            Perro unPerro = new Perro(Cadena.generarNombreRandom(), Toolbox.random.nextInt(1, 5));
            lista.add(unPerro);
        }

        lista.add(lista.get(2));

        System.out.println(lista.get(4).equals(lista.get(2)));

        for (Perro perro : lista)
        {
            Perro.mostrarPerro(perro);
        }

    }

}

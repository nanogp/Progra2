package clase8;

import java.util.*;
import toolbox.Cadena;

public class Clase8
{

    public static void main(String[] args)
    {
        //Teoria.main();
        //TeoriaQueue.main();
        Queue<Turno> colaNormal = new LinkedList<>();
        Queue<Turno> colaUrgente = new LinkedList<>();
        Turno nuevoTurno;

        final int cantidadTurnosADar = 15;

        for (int i = 0; i < cantidadTurnosADar; i++)
        {
            nuevoTurno = Turno.random();
            switch (nuevoTurno.getTipo())
            {
                case NORMAL:
                    colaNormal.offer(nuevoTurno);
                    break;
                case URGENTE:
                    colaUrgente.offer(nuevoTurno);
                    break;
            }
        }

        String cabeceras = "\n---SIGUIENTE TURNO---";
        while (colaUrgente.size() > 0)
        {
            System.out.println(cabeceras);
            colaUrgente.poll().mostrar();
        }

        while (colaNormal.size() > 0)
        {
            System.out.println(cabeceras);
            colaNormal.poll().mostrar();
        }

    }
}

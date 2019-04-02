package clases;

import enumerados.Dificultad;

import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class ListaDePalabras extends LinkedList<Palabra>
{
    //<editor-fold defaultstate="collapsed" desc="Metodos">

    public ListaDePalabras getListaPalabrasPorDificultad(Dificultad dificultad)
    {
        ListaDePalabras retorno = new ListaDePalabras();

        for (Palabra palabra : this)
        {
            if (palabra.getDificultad().equals(dificultad))
            {
                retorno.add(palabra);
            }
        }

        return retorno;
    }

    public void sortByAlfabetico()
    {
        Collections.sort(this, Palabra.ComparatorAlfabetico);
    }

    public void sortByDificultad()
    {
        Collections.sort(this, Palabra.ComparatorDificultad);
    }

    public Palabra popRandom()
    {
        return this.remove(ThreadLocalRandom.current().nextInt(this.size()));
    }

    @Override
    public String toString()
    {
        StringBuilder ret = new StringBuilder();
        for (Palabra p : this)
        {
            ret.append(p.toString()).append("\n");
        }
        return ret.toString();
    }
    //</editor-fold>
}

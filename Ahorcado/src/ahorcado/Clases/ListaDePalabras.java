package ahorcado.Clases;

import ahorcado.Enumerados.Dificultad;
import ahorcado.Toolbox.Random;
import java.util.Collections;
import java.util.LinkedList;

public class ListaDePalabras extends LinkedList<Palabra>
{

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
        return this.remove(Random.randomSeed.nextInt(this.size()));
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
}

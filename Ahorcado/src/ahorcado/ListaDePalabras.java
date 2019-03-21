package ahorcado;

import ahorcado.Enumerados.Dificultad;
import ahorcado.Clases.Palabra;
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

    public Palabra getRandom()
    {
        return this.get(toolbox.Random.randomSeed.nextInt(this.size()));
    }

    @Override
    public String toString()
    {
        StringBuffer ret = new StringBuffer();
        for (Palabra p : this)
        {
            ret.append(p.toString()).append("\n");
        }
        return ret.toString();
    }
}

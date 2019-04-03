package clases;

import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class ListaDeUsuarios extends LinkedList<Usuario>
{
    //<editor-fold defaultstate="collapsed" desc="Metodos">

    public int indexOf(Usuario u)
    {
        for (int i = 0; i < this.size(); i++)
        {
            if (this.get(i).equals(u))
            {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Usuario u)
    {
        return indexOf(u) >= 0;
    }

    public void sortByAlfabetico()
    {
        Collections.sort(this, Usuario.ComparatorAlfabetico);
    }

    public void sortByPuntaje()
    {
        Collections.sort(this, Usuario.ComparatorPuntaje);
    }

    public Usuario getRandom()
    {
        return this.get(ThreadLocalRandom.current().nextInt(this.size()));
    }

    @Override
    public String toString()
    {
        StringBuffer ret = new StringBuffer();
        for (Usuario u : this)
        {
            ret.append(u.toString()).append("\n");
        }
        return ret.toString();
    }

    //</editor-fold>
}

package ahorcado;

import java.util.Collections;
import java.util.LinkedList;

public class Ranking
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private LinkedList<Usuario> listaDeUsuarios;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Ranking()
    {
        this.listaDeUsuarios = new LinkedList<>();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void sort()
    {
        Collections.sort(this.listaDeUsuarios, Usuario.PorPuntaje);
        Collections.sort(this.listaDeUsuarios, Usuario.PorNombre);
    }
    //</editor-fold>
}

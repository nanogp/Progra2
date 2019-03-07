package ahorcado;

import java.util.Comparator;

public class Usuario implements Comparable<Usuario>, Comparator<Usuario>

{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected String nombre;
    protected int puntajeAcumulado;
    protected int puntajeUltimo;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Usuario()
    {
    }

    public Usuario(String nombre, int puntajeAcumulado, int puntajeUltimo)
    {
        this.nombre = nombre;
        this.puntajeAcumulado = puntajeAcumulado;
        this.puntajeUltimo = puntajeUltimo;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getPuntajeTotal()
    {
        return puntajeAcumulado;
    }

    public void setPuntajeTotal(int puntajeTotal)
    {
        this.puntajeAcumulado = puntajeTotal;
    }

    public int getPuntajeUltimo()
    {
        return puntajeUltimo;
    }

    public void setPuntajeUltimo(int puntajeUltimo)
    {
        this.puntajeUltimo = puntajeUltimo;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">

    @Override
    public int compareTo(Usuario u)
    {
        return (int) Math.signum(this.getPuntajeTotal() - u.getPuntajeTotal());
    }

    @Override
    public int compare(Usuario uno, Usuario otro)
    {
        return uno.compareTo(otro);
    }

    public static Comparator<Usuario> ComparatorPuntaje = Usuario::compareTo;

    public static Comparator<Usuario> ComparatorNombre = (Usuario uno, Usuario otro) -> uno.getNombre().compareTo(otro.getNombre());

    //</editor-fold>
}

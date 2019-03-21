package ahorcado.Clases;

import java.util.Comparator;

public class Usuario implements Comparable<Usuario>, Comparator<Usuario>

{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String nombre;
    private int puntajeAcumulado;
    private int puntajeUltimo;
    private int partidasJugadas;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Usuario()
    {
        this.puntajeAcumulado = 0;
        this.puntajeUltimo = 0;
        this.partidasJugadas = 0;
    }

    public Usuario(String nombre)
    {
        this();
        this.nombre = nombre;
    }

    public Usuario(String nombre, int puntajeAcumulado, int puntajeUltimo, int partidasJugadas)
    {
        this(nombre);
        this.puntajeAcumulado = puntajeAcumulado;
        this.puntajeUltimo = puntajeUltimo;
        this.partidasJugadas = partidasJugadas;
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

    public int getPuntajeAcumulado()
    {
        return puntajeAcumulado;
    }

    public void setPuntajeAcumulado(int puntajeAcumulado)
    {
        this.puntajeAcumulado = puntajeAcumulado;
    }

    public int getPuntajeUltimo()
    {
        return puntajeUltimo;
    }

    public void setPuntajeUltimo(int puntajeUltimo)
    {
        this.puntajeUltimo = puntajeUltimo;
    }

    public int getPartidasJugadas()
    {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas)
    {
        this.partidasJugadas = partidasJugadas;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public String toString()
    {
        return toolbox.Cadena.encolumnarAlinearTexto(" | ",
                this.getNombre(), 20, toolbox.Cadena.ALINEA_IZQ,
                this.getPuntajeAcumulado(), 10, toolbox.Cadena.ALINEA_MED,
                Integer.toString(this.getPartidasJugadas()), 1, toolbox.Cadena.ALINEA_MED);
    }

    public int compareByPuntajeTo(Usuario u)
    {
        return (int) Math.signum(this.getPuntajeAcumulado() - u.getPuntajeAcumulado());
    }

    @Override
    public int compareTo(Usuario u)
    {
        return this.getNombre().compareToIgnoreCase(u.getNombre());
    }

    public boolean equals(Usuario u)
    {
        return this.getNombre().equalsIgnoreCase(u.getNombre());
    }

    @Override
    public int compare(Usuario uno, Usuario otro)
    {
        return uno.compareTo(otro);
    }

    public static Comparator<Usuario> ComparatorPuntaje = Usuario::compareByPuntajeTo;

    public static Comparator<Usuario> ComparatorAlfabetico = Usuario::compareTo;

    //</editor-fold>
}

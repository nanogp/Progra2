package ponti.mariano;

import java.util.concurrent.ThreadLocalRandom;

public class Libro
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected Autor _autor;
    protected int _cantidadDePaginas;
    protected float _precio;
    protected String _titulo;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Libro()
    {
        this._cantidadDePaginas = generadorDePaginas();
    }

    public Libro(Autor _autor, float _precio, String _titulo)
    {
        this();
        this._autor = _autor;
        this._precio = _precio;
        this._titulo = _titulo;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public int getCantidadDePaginas()
    {
        return _cantidadDePaginas;
    }

    public float getPrecio()
    {
        return _precio;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    private static int generadorDePaginas()
    {
        return ThreadLocalRandom.current().nextInt(10, 580);
    }

    public static String Mostrar(Libro l)
    {
        StringBuilder retBuilder = new StringBuilder();
        retBuilder.append("\nAutor: ").append(l._autor._apellido).append(" ").append(l._autor._nombre);
        retBuilder.append("\nPaginas: ").append(l._cantidadDePaginas);
        retBuilder.append("\nPrecio: ").append(String.format("%.0f", l._precio));
        retBuilder.append("\nTitulo: ").append(l._titulo);
        return retBuilder.toString();
    }

    public static boolean compararLibros(Libro uno, Libro otro)
    {
        return Autor.compararAutores(uno._autor, otro._autor) && uno._titulo.equalsIgnoreCase(otro._titulo);
    }
    //</editor-fold>

}

package ponti.mariano;

import java.util.ArrayList;

public class Biblioteca
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int _capacidad;
    private ArrayList<Libro> _lista;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Biblioteca()
    {
        this._lista = new ArrayList<>();
    }

    public Biblioteca(int _capacidad)
    {
        this();
        this._capacidad = _capacidad;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    private float getPrecioGenerico(ETipoLibro tipoLibro)
    {
        float novela = 0;
        float manual = 0;
        float retorno = 0;

        for (Libro libro : this._lista)
        {
            if (libro instanceof Novela)
            {
                novela += libro.getPrecio();
            }
            else
            {
                manual += libro.getPrecio();
            }
        }

        switch (tipoLibro)
        {
            case Manual:
                retorno = manual;
                break;
            case Novela:
                retorno = novela;
                break;

            case Total:
                retorno = manual + novela;
                break;
        }
        return retorno;
    }

    public float getPrecioDeManuales()
    {
        return getPrecioGenerico(ETipoLibro.Manual);
    }

    public float getPrecioDeNovelas()
    {
        return getPrecioGenerico(ETipoLibro.Novela);
    }

    public float getPrecioTotal()
    {
        return getPrecioGenerico(ETipoLibro.Total);
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    private boolean estaEnBiblioteca(Libro libro)
    {
        boolean retorno = false;
        for (Libro libroEnLista : this._lista)
        {
            if (Libro.compararLibros(libroEnLista, libro))
            {
                retorno = true;
                break;
            }
        }
        return retorno;
    }

    public boolean agregarLibro(Libro libro)
    {
        boolean retorno = false;
        if (this._capacidad > this._lista.size() && !this.estaEnBiblioteca(libro))
        {
            this._lista.add(libro);
            retorno = true;
        }
        return retorno;
    }

    private float ObtenerPrecio(ETipoLibro tipoLibro)
    {
        float retorno = 0;
        switch (tipoLibro)
        {
            case Manual:
                retorno = getPrecioDeManuales();
                break;
            case Novela:
                retorno = getPrecioDeNovelas();
                break;
            case Total:
                retorno = getPrecioTotal();
                break;
        }
        return retorno;
    }

    public static String MostrarBiblioteca(Biblioteca biblioteca)
    {
        StringBuilder retBuilder = new StringBuilder();
        retBuilder.append("Capacidad de la biblioteca: ").append(biblioteca._capacidad);
        retBuilder.append("\nListado de libros:\n******************");
        for (Libro libro : biblioteca._lista)
        {
            retBuilder.append(Libro.Mostrar(libro));
            retBuilder.append("\n****************");
        }
        retBuilder.append("\nRecaudacion por novela: ").append(String.format("%.0f", biblioteca.ObtenerPrecio(ETipoLibro.Novela)));
        retBuilder.append("\nRecaudacion por manual: ").append(String.format("%.0f", biblioteca.ObtenerPrecio(ETipoLibro.Manual)));
        retBuilder.append("\nRecaudacion por todo: ").append(String.format("%.0f", biblioteca.ObtenerPrecio(ETipoLibro.Total)));
        return retBuilder.toString();
    }

    //</editor-fold>
}

package ponti.mariano;

public class Novela extends Libro
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private EGenero _genero;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Novela(EGenero _genero, Autor _autor, float _precio, String _titulo)
    {
        super(_autor, _precio, _titulo);
        this._genero = _genero;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public String Mostrar()
    {
        StringBuilder retBuilder = new StringBuilder();
        retBuilder.append(Libro.Mostrar(this));
        retBuilder.append("\nGenero: ").append(this._genero);
        return retBuilder.toString();
    }

    public static boolean compararNovelas(Novela uno, Novela otro)
    {
        return Libro.compararLibros(uno, otro) && uno._genero == otro._genero;
    }
    //</editor-fold>
}

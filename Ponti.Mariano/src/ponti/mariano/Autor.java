package ponti.mariano;

public class Autor
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    String _apellido;
    String _nombre;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Autor(String _nombre, String _apellido)
    {
        this._apellido = _apellido;
        this._nombre = _nombre;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">

    public static boolean compararAutores(Autor uno, Autor otro)
    {
        return uno._apellido.equalsIgnoreCase(otro._apellido) && uno._nombre.equalsIgnoreCase(otro._nombre);
    }

    public static String mostrarAutor(Autor a)
    {
        StringBuilder retBuilder = new StringBuilder();
        retBuilder.append("Nombre: ").append(a._nombre);
        retBuilder.append("Apellido: ").append(a._apellido);
        return retBuilder.toString();
    }
    //</editor-fold>
}

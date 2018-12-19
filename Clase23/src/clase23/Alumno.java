package clase23;

public class Alumno
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private String _nombre;
    private float _nota;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Alumno(String nombre, float nota)
    {
        this._nombre = nombre;
        this._nota = nota;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String getNombre()
    {
        return _nombre;
    }

    public float getNota()
    {
        return _nota;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">

    @Override
    public String toString()
    {
        return "Alumno " + this.getNombre() + ", nota " + this.getNota();
    }

    //</editor-fold>
}

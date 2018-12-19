package clase23;

public class AlumnoDesaprobado extends Alumno
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private String _motivo;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public AlumnoDesaprobado(String motivo, Alumno alumno)
    {
        super(alumno.getNombre(), alumno.getNota());
        this._motivo = motivo;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">

    public String getMotivo()
    {
        return _motivo;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">

    @Override
    public String toString()
    {
        return "Alumno " + this.getNombre() + " fue desaprobado porque " + this.getMotivo();
    }

    //</editor-fold>
}

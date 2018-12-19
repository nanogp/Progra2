package clase23;

public class AlumnoDesaprobadoException extends Exception
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private AlumnoDesaprobado _alumnoDesaprobado;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public AlumnoDesaprobadoException(AlumnoDesaprobado alumnoDesaprobado)
    {
        this._alumnoDesaprobado = alumnoDesaprobado;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">

    public AlumnoDesaprobado getAlumnoDesaprobado()
    {
        return _alumnoDesaprobado;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">

    @Override
    public String toString()
    {
        return this.getAlumnoDesaprobado().toString();
    }
    //</editor-fold>
}
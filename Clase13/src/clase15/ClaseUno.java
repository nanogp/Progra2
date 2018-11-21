package clase15;

public abstract class ClaseUno
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    protected String atributoUno;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public ClaseUno(String atributoUno)
    {
        this.atributoUno = atributoUno;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public String getUno()
    {
        return atributoUno;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public String mostrarUno()
    {
        StringBuilder ret = new StringBuilder();
        ret.append("\natributoUno: ").append(this.atributoUno);
        return ret.toString();

    }

    abstract public String mostrar();
    //</editor-fold>
}

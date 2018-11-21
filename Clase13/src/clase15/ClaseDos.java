package clase15;

public class ClaseDos extends ClaseUno
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected int atributoDos;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public ClaseDos(String atributoUno, int atributoDos)
    {
        super(atributoUno);
        this.atributoDos = atributoDos;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public int getDos()
    {
        return atributoDos;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * public String mostrarDos() { StringBuilder ret = new StringBuilder();
     * ret.append(super.mostrarUno()); ret.append("\natributoDos:
     * ").append(this.atributoDos); return ret.toString();
     *
     * }
     */
    @Override
    public String mostrar()
    {
        return new StringBuilder().append("claseUno").append(" claseDos").toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.getUno() == ((ClaseDos) obj).getUno()
                && this.getDos() == ((ClaseDos) obj).getDos();
    }
    //</editor-fold>    

}

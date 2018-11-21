package clase15;

public final class ClaseTres extends ClaseDos
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected float atributoTres;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public ClaseTres(String atributoUno, int atributoDos, float atributoTres)
    {
        super(atributoUno, atributoDos);
        this.atributoTres = atributoTres;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public float getTres()
    {
        return atributoTres;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * public String mostrarTres() { StringBuilder ret = new StringBuilder();
     * ret.append(super.mostrarDos()); ret.append("\natributoTres:
     * ").append(this.atributoTres); return ret.toString();
     *
     * }
     */
    @Override
    public String mostrar()
    {
        return new StringBuilder().append(super.mostrar()).append(" claseTres").toString();
    }
    //</editor-fold>

    @Override
    public String toString()
    {
        return mostrar();
    }

}

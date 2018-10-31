/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3y4;

/**
 *
 * @author mponti
 */
public class Auto
{

    /*COMPOSICION O AGREGACION COMPUESTA: UNA CLASE ESTA COMPUESTA POR OTRAS
    EL AUTO ES LA CLASE DEPENDIENTE DE LA CLASE RUEDA: SIN RUEDA NO HAY AUTO*/
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private eFabricante _fabricante;
    public Rueda ruedaDD;
    public Rueda ruedaDI;
    public Rueda ruedaTD;
    public Rueda ruedaTI;
    public static int count = 0;
    private int _kilometrosRecorridos;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * @return the _fabricante
     */
    public eFabricante getFabricante()
    {
        return this._fabricante;
    }

    /**
     * @return the _kilometrosRecorridos
     */
    public int getKm()
    {
        return this._kilometrosRecorridos;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * @param _kilometrosRecorridos the _kilometrosRecorridos to set
     */
    public void setKilometrosRecorridos(int _kilometrosRecorridos)
    {
        this._kilometrosRecorridos = _kilometrosRecorridos;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void volverACero()
    {
        this._kilometrosRecorridos = 0;
    }

    public void agregarKm(int kilometros)
    {
        this._kilometrosRecorridos += kilometros;
    }

    public void mostrarAuto()
    {
        System.out.println(this._fabricante);
    }

    @Override
    public String toString()
    {
        return this._fabricante.name() + " - " + this.getKm() + "km";
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     *
     */
    public Auto()
    {
        this._fabricante = eFabricante.getRandom();
        this._kilometrosRecorridos = 0;
        count++;

        //<editor-fold defaultstate="collapsed" desc="Ruedas">
        this.ruedaDD = new Rueda();
        this.ruedaDI = new Rueda();
        this.ruedaTD = new Rueda();
        this.ruedaTI = new Rueda();
        //</editor-fold>
    }
    //</editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author mponti
 */
public class Auto
{

    /*COMPOSICION O AGREGACION COMPUESTA: UNA CLASE ESTA COMPUESTA POR OTRAS
    EL AUTO ES LA CLASE DEPENDIENTE DE LA CLASE RUEDA: SIN RUEDA NO HAY AUTO*/
    public String fabricante;
    public Rueda ruedaDD;
    public Rueda ruedaDI;
    public Rueda ruedaTD;
    public Rueda ruedaTI;

    public Auto()
    {
        this.fabricante = "un fabricante por defecto";
        this.ruedaDD = new Rueda();
        this.ruedaDI = new Rueda();
        this.ruedaTD = new Rueda();
        this.ruedaTI = new Rueda();
    }
}

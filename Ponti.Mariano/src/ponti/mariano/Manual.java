/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package ponti.mariano;

public class Manual extends Libro
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private ETipo _tipo;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Manual(ETipo _tipo, Autor _autor, float _precio, String _titulo)
    {
        super(_autor, _precio, _titulo);
        this._tipo = _tipo;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public String Mostrar()
    {
        StringBuilder retBuilder = new StringBuilder();
        retBuilder.append(Libro.Mostrar(this));
        retBuilder.append("\nTipo de manual: ").append(this._tipo);
        return retBuilder.toString();

    }

    public static boolean compararManuales(Manual uno, Manual otro)
    {
        return Libro.compararLibros(uno, otro) && uno._tipo == otro._tipo;
    }
    //</editor-fold>
}

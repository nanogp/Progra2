/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Date;

/**
 *
 * @author mponti
 */
public class NewClass
{

    private int _entero;
    private String _cadena;
    private Date _fecha;

    //<editor-fold defaultstate="collapsed" desc="Getters y Setter">
    /**
     * @return the _entero
     */
    public int getEntero()
    {
        return _entero;
    }

    /**
     * @return the _cadena
     */
    public String getCadena()
    {
        return _cadena;
    }

    /**
     * @return the _fecha
     */
    public Date getFecha()
    {
        return _fecha;
    }

    /**
     * @param entero the _entero to set
     */
    public void setEntero(int entero)
    {
        this._entero = entero;
    }

    /**
     * @param cadena the _cadena to set
     */
    public void setCadena(String cadena)
    {
        this._cadena = cadena;
    }

    /**
     * @param fecha the _fecha to set
     */
    public void setFecha(Date fecha)
    {
        this._fecha = fecha;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public NewClass()
    {
        this._fecha = new Date();
    }

    public NewClass(int entero, String cadena)
    {
        this();
        this._entero = entero;
        this._cadena = cadena;
    }

    public NewClass(int entero, String cadena, Date fecha)
    {
        this(entero, cadena);
        this._fecha = fecha;
    }

    public NewClass(NewClass objeto)
    {
        this(objeto._entero, objeto._cadena, objeto._fecha);
    }

    public void establecerValor(int entero)
    {
        this._entero = entero;
    }

    public void establecerValor(String cadena)
    {
        this._cadena = cadena;
    }

    public void establecerValor(Date fecha)
    {
        this._fecha = fecha;
    }

    public void mostrarDatos()
    {
        System.out.println("entero: " + this._entero + " - cadena: " + this._cadena + " - fecha: " + this._fecha);
    }
    //</editor-fold>
}

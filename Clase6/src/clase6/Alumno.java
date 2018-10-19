/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.text.DecimalFormat;

/**
 *
 * @author mponti
 */
public class Alumno
{

    //<editor-fold defaultstate="collapsed" desc="Propiedades">
    private static int _secuencia = 0;
    public static int _cantidadNotas = 3;
    private int _id;
    private String _apellidoNombre;
    private String _eMail;
    private float _promedio;
    private int[] _notasIngreso;
    private String _direccion;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Alumno()
    {
        this._notasIngreso = new int[_cantidadNotas];
    }

    public Alumno(int id, String apellidoNombre)
    {
        this();
        this._id = id;
        this._apellidoNombre = apellidoNombre;
    }

    public Alumno(int id, String apellidoNombre, String direccion)
    {
        this(id, apellidoNombre);
        this._direccion = direccion;
    }

    public Alumno(int id, String apellidoNombre, String direccion, String eMail)
    {
        this(id, apellidoNombre, direccion);
        this._eMail = eMail;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public static int getNextId()
    {
        _secuencia++;
        return _secuencia;
    }

    public int getId()
    {
        return _id;
    }

    public void setId(int _id)
    {
        this._id = _id;
    }

    public String getApellidoNombre()
    {
        return _apellidoNombre;
    }

    public void setApellidoNombre(String _apellidoNombre)
    {
        this._apellidoNombre = _apellidoNombre;
    }

    public String geteMail()
    {
        return _eMail;
    }

    public void seteMail(String _eMail)
    {
        this._eMail = _eMail;
    }

    public float getPromedio()
    {
        return _promedio;
    }

    public void setPromedio(float _promedio)
    {
        this._promedio = _promedio;
    }

    public int[] getNotasIngreso()
    {
        return _notasIngreso;
    }

    public void setNotasIngreso(int[] _notasIngreso)
    {
        this._notasIngreso = _notasIngreso;
    }

    public String getDireccion()
    {
        return _direccion;
    }

    public void setDireccion(String _direccion)
    {
        this._direccion = _direccion;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos">    
    public String alumnoAString()
    {
        //StringBuffer retorno = new StringBuffer();
        StringBuilder retorno = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#,##0.00");

        retorno.append("id: " + this._id);
        retorno.append(" | apellido y nombre : " + this._apellidoNombre);
        retorno.append(" | direccion: " + this._direccion);
        retorno.append(" | email: " + this._eMail);

        for (int i = 0; i < Alumno._cantidadNotas; i++)
        {
            retorno.append(" | nota " + (i + 1) + ": " + this._notasIngreso[i]);
        }
        retorno.append(" | promedio: " + df.format(this.getPromedio()));

        return retorno.toString();
    }

    public void calcularPromedio()
    {
        float acumulador = 0;

        if (Alumno._cantidadNotas > 0)
        {
            for (int nota : _notasIngreso)
            {
                acumulador += nota;
            }
        }

        this.setPromedio(acumulador / Alumno._cantidadNotas);
    }
    //</editor-fold>
}

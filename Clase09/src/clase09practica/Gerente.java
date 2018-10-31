/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase09practica;

/**
 *
 * @author mponti
 */
public class Gerente extends Empleado
{

    private int _sueldo;
    private int _horasLaborales;
    private int _empleadosACargo;

    public int getSueldo()
    {
        return _sueldo;
    }

    public void setSueldo(int sueldo)
    {
        this._sueldo = sueldo;
    }

    public int getHorasLaborales()
    {
        return _horasLaborales;
    }

    public void setHorasLaborales(int horasLaborales)
    {
        this._horasLaborales = horasLaborales;
    }

    public int getEmpleadosACargo()
    {
        return _empleadosACargo;
    }

    public void setEmpleadosACargo(int empleadosACargo)
    {
        this._empleadosACargo = empleadosACargo;
    }

    public Gerente()
    {
    }

    public Gerente(int _sueldo, int horasLaborales, int empleadosACargo)
    {
        this._sueldo = _sueldo;
        this._horasLaborales = horasLaborales;
        this._empleadosACargo = empleadosACargo;
    }

    public Gerente(int _sueldo, int horasLaborales, int empleadosACargo, int sueldo)
    {
        super(sueldo);
        this._sueldo = _sueldo;
        this._horasLaborales = horasLaborales;
        this._empleadosACargo = empleadosACargo;
    }

    public Gerente(int _sueldo, int horasLaborales, int empleadosACargo, int sueldo, String _nombre, byte _peso, byte _altura, String _sexo)
    {
        super(sueldo, _nombre, _peso, _altura, _sexo);
        this._sueldo = _sueldo;
        this._horasLaborales = horasLaborales;
        this._empleadosACargo = empleadosACargo;
    }

    public String gerenteAString()
    {
        return toolbox.Cadena.concatenarTexto(" - ", this.serHumanoAString(), this._horasLaborales, this._sueldo, this._empleadosACargo);
    }

    public void mostrarGerente()
    {
        System.out.println(this.gerenteAString());
    }
}

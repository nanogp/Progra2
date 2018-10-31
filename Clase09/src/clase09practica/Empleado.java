package clase09practica;

public class Empleado extends SerHumano
{

    private int _sueldo;
    private int _horasLaborales;

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

    public Empleado()
    {
    }

    public Empleado(int sueldo)
    {
        this();
        this._sueldo = sueldo;
    }

    public Empleado(int sueldo, String _nombre, byte _peso, byte _altura, String _sexo)
    {
        super(_nombre, _peso, _altura, _sexo);
        this._sueldo = sueldo;
    }

    public String empleadoAString()
    {
        return toolbox.Cadena.concatenarTexto(" - ", this.serHumanoAString(), this._horasLaborales, this._sueldo);
    }

    public void mostrarEmpleado()
    {
        System.out.println(this.empleadoAString());
    }

}

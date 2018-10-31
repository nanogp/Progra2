/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author mponti
 */
public class Perro
{

    private String _nombre;
    private int _edad;
    private eRaza _raza;

    public Perro()
    {

    }

    public Perro(String _nombre, int _edad, eRaza _raza)
    {
        this();
        this._nombre = _nombre;
        this._edad = _edad;
        this._raza = _raza;
    }

    public Perro(String _nombre, int _edad)
    {
        this(_nombre, _edad, eRaza.getRandom());

    }

    public String getNombre()
    {
        return _nombre;
    }

    public void setNombre(String _nombre)
    {
        this._nombre = _nombre;
    }

    public int getEdad()
    {
        return _edad;
    }

    public void setEdad(int _edad)
    {
        this._edad = _edad;
    }

    public eRaza getRaza()
    {
        return _raza;
    }

    public void setRaza(eRaza _raza)
    {
        this._raza = _raza;
    }

    public static void mostrarPerro(Perro perro)
    {
        StringBuilder mostrar = new StringBuilder();
        mostrar.append(String.format("%1d", perro.getEdad()));
        mostrar.append(" | ");
        mostrar.append(String.format("%1s", perro.getNombre()));
        mostrar.append(" | ");
        mostrar.append(perro.getRaza());
        System.out.println(mostrar.toString());
    }

}

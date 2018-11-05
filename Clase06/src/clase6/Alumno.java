package clase6;

import java.text.DecimalFormat;
import toolbox.Cadena;
import toolbox.Toolbox;

public class Alumno
{

    //<editor-fold defaultstate="collapsed" desc="Propiedades">
    private int _id;
    private String _apellidoNombre;
    private String _eMail;
    private float _promedio;
    private int[] _notasIngreso;
    private String _direccion;

    private static int _secuencia = 0;
    public static int cantidadNotas = 3;

    private static int _paddingId = 3;
    private static int _paddingApellidoNombre = 25;
    private static int _paddingEmail = 25;
    private static int _paddingPromedio = 3;
    private static int _paddingNotasIngreso = 6;
    private static int _paddingDireccion = 20;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Alumno()
    {
        this._notasIngreso = new int[cantidadNotas];
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
        StringBuilder retBuilder = new StringBuilder();
        /*
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Toolbox.cadenas.stringBuilder = new StringBuilder();

         retorno.append(String.format("%1$3d | %2$-25s | %3$-20s | %4$-25s | ", this._id, this._apellidoNombre, this._direccion, this._eMail));
        for (int i = 0; i < Alumno.cantidadNotas; i++)
        {
            retBuffer.append(String.format("%6d | ", this._notasIngreso[i]));
        }
        retBuffer.append(String.format("%8.2f", this.getPromedio()));
         */
        retBuilder = new StringBuilder();
        retBuilder.append(
                Cadena.encolumnarAlinearTexto(" | ",
                        this._id, 3, Cadena.ALINEA_MED,
                        this._apellidoNombre, 25, Cadena.ALINEA_MED,
                        this._direccion, 20, Cadena.ALINEA_MED,
                        this._eMail, 25, Cadena.ALINEA_MED,
                        ""));

        for (int i : this._notasIngreso)
        {
            retBuilder.append(Cadena.encolumnarAlinearTexto(" | ",
                    i, 6, Cadena.ALINEA_MED,
                    ""));
        }
        retBuilder.append(
                Cadena.encolumnarAlinearTexto(" | ",
                        String.format("%.2f",
                                this.getPromedio()), 8, Cadena.ALINEA_MED));
        return retBuilder.toString();
    }

    public void calcularPromedio()
    {
        float acumulador = 0;

        if (Alumno.cantidadNotas > 0)
        {
            for (int nota : _notasIngreso)
            {
                acumulador += nota;
            }
        }

        this.setPromedio(acumulador / Alumno.cantidadNotas);
    }

    //</editor-fold>
}

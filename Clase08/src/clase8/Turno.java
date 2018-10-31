package clase8;

public class Turno
{

    private static int _numeroOrden = 0;
    private int _orden;
    private Paciente _paciente;
    private eTipo _tipo;

    public static int getNumeroOrden()
    {
        return _numeroOrden;
    }

    public static void setNumeroOrden(int aNumeroOrden)
    {
        _numeroOrden = aNumeroOrden;
    }

    public int getOrden()
    {
        return _orden;
    }

    public void setOrden(int orden)
    {
        this._orden = orden;
    }

    public Paciente getPaciente()
    {
        return _paciente;
    }

    public void setPaciente(Paciente paciente)
    {
        this._paciente = paciente;
    }

    public eTipo getTipo()
    {
        return _tipo;
    }

    public void setTipo(eTipo tipo)
    {
        this._tipo = tipo;
    }

    static int siguienteNumeroOrden()
    {
        _numeroOrden++;
        return _numeroOrden;
    }

    public Turno()
    {
        this._orden = siguienteNumeroOrden();
    }

    public Turno(int orden, Paciente paciente, eTipo tipo)
    {
        this._orden = orden;
        this._paciente = paciente;
        this._tipo = tipo;
    }

    public static Turno random()
    {
        Turno retTurno;
        retTurno = new Turno(
                siguienteNumeroOrden(),
                Paciente.random(),
                eTipo.getRandom());
        return retTurno;
    }

    public String aString()
    {
        StringBuffer retString = new StringBuffer();
        retString.append(this._tipo.toString());
        retString.append("\nNumero de turno: ");
        retString.append(this._orden);
        return retString.toString();
    }

    public void mostrar()
    {
        System.out.println(this.aString());
        this._paciente.mostrar();
    }
}

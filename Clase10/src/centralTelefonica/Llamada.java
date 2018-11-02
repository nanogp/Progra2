package centralTelefonica;

public class Llamada
{

    private float _duracion;
    private String _nroDestino;
    private String _nroOrigen;

    public float getDuracion()
    {
        return _duracion;
    }

    public String getNroDestino()
    {
        return _nroDestino;
    }

    public String getNroOrigen()
    {
        return _nroOrigen;
    }

    public Llamada()
    {
    }

    public Llamada(String _nroOrigen, String _nroDestino, float _duracion)
    {
        this._nroOrigen = _nroOrigen;
        this._nroDestino = _nroDestino;
        this._duracion = _duracion;
    }

    public int ordenarPorDuracion(Llamada uno, Llamada dos)
    {
        return (int) (uno.getDuracion() - dos.getDuracion());
    }

}

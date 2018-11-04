package centralTelefonica;

import toolbox.*;

public class Local extends Llamada
{

    protected float _costo;

    public float getCostoLlamada()
    {
        return _costo;
    }

    public Local()
    {
    }

    public Local(Llamada unaLlamada, float _costo)
    {
        super(unaLlamada.getNroOrigen(), unaLlamada.getNroDestino(), unaLlamada.getDuracion());
        this._costo = calcularCosto();
    }

    public Local(String _nroOrigen, float _duracion, String _nroDestino, float _costo)
    {
        super(_nroDestino, _nroOrigen, _duracion);
        this._costo = calcularCosto();
    }

    private float calcularCosto()
    {
        return (float) (this.getDuracion() * 0.5);
    }

    public void mostrar()
    {
        String texto;
        texto = Cadena.encolumnarAlinearTexto(" | ",
                "$" + this.getCostoLlamada(), 8, Cadena.ALINEA_MED,
                this.getDuracion() + " mins", 12, Cadena.ALINEA_MED,
                this.getNroOrigen(), 12, Cadena.ALINEA_MED,
                this.getNroDestino(), 12, Cadena.ALINEA_MED,
                TipoLlamada.Local.name(), 10, Cadena.ALINEA_DER);
        System.out.println(texto);
    }
}

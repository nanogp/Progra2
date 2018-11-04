package centralTelefonica;

import toolbox.Cadena;

public class Provincial extends Llamada
{

    protected Franja _franjaHoraria;
    protected float _costo;

    public Franja getFranjaHoraria()
    {
        return this._franjaHoraria;
    }

    public float getCostoLlamada()
    {
        return _costo;
    }

    public Provincial()
    {
    }

    public Provincial(Franja miFranja, Llamada unaLlamada)
    {
        super(unaLlamada.getNroOrigen(), unaLlamada.getNroDestino(), unaLlamada.getDuracion());
        this._franjaHoraria = miFranja;
        this._costo = this.calcularCosto();
    }

    private float calcularCosto()
    {
        float retCosto = 0;
        switch (this.getFranjaHoraria())
        {
            case Franja_1:
                retCosto = (float) (this.getDuracion() * 0.99);
                break;

            case Franja_2:
                retCosto = (float) (this.getDuracion() * 1.25);
                break;

            case Franja_3:
                retCosto = (float) (this.getDuracion() * 0.66);
                break;
        }
        return retCosto;
    }

    public void mostrar()
    {
        String texto;
        texto = Cadena.encolumnarAlinearTexto(" | ",
                "$" + this.getCostoLlamada(), 8, Cadena.ALINEA_MED,
                this.getDuracion() + " mins", 12, Cadena.ALINEA_MED,
                this.getNroOrigen(), 12, Cadena.ALINEA_MED,
                this.getNroDestino(), 12, Cadena.ALINEA_MED,
                TipoLlamada.Provincial.name(), 10, Cadena.ALINEA_DER);
        System.out.println(texto);
    }
}

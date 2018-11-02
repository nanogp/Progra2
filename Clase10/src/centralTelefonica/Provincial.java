package centralTelefonica;

public class Provincial extends Llamada
{

    protected Franja _franjaHoraria;
    protected float _costo;

    public Franja getFranjaHoraria()
    {
        return _franjaHoraria;
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
        texto = toolbox.Cadena.concatenarTexto(" - ", this.getCostoLlamada(), this.getDuracion(), this.getNroOrigen(), this.getNroDestino());
        System.out.println(texto);
    }
}

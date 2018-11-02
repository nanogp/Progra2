package centralTelefonica;

import java.util.ArrayList;

public class Centralita
{

    protected ArrayList<Llamada> _listaDeLlamadas;
    protected String _razonSocial;

    public ArrayList<Llamada> getLlamadas()
    {
        return _listaDeLlamadas;
    }

    public Centralita()
    {
        this._listaDeLlamadas = new ArrayList<>();
    }

    public Centralita(String nombreEmpresa)
    {
        this();
        this._razonSocial = nombreEmpresa;
    }

    public float calcularGanancia(TipoLlamada tipo)
    {
        float retGanancia = 0;
        float costoLlamada = 0;

        for (Llamada llamada : getLlamadas())
        {
            if (llamada instanceof Local)
            {
                costoLlamada = ((Local) llamada).getCostoLlamada();
            } else
            {
                costoLlamada = ((Provincial) llamada).getCostoLlamada();
            }

            switch (tipo)
            {
                case Local:
                    retGanancia += costoLlamada;
                    break;

                case Provincial:
                    retGanancia += costoLlamada;
                    break;

                case Todas:
                    retGanancia += costoLlamada;
                    break;
            }
        }

        return retGanancia;
    }

    public float getGananciaPorLocal()
    {
        return calcularGanancia(TipoLlamada.Local);
    }

    public float getGananciaPorProvincial()
    {
        return calcularGanancia(TipoLlamada.Provincial);
    }

    public float getGananciaTotal()
    {
        return calcularGanancia(TipoLlamada.Todas);
    }

    public void mostrar()
    {

    }

    public void ordenarLlamadar()
    {
        //this._listaDeLlamadas.sort(c);
    }
}

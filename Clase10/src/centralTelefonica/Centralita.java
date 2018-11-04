package centralTelefonica;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;
import java.util.ArrayList;
import java.util.Collections;
import toolbox.Cadena;

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
        TipoLlamada tipoLlamada;

        for (Llamada llamada : getLlamadas())
        {
            if (llamada instanceof Local)
            {
                costoLlamada = ((Local) llamada).getCostoLlamada();
                tipoLlamada = TipoLlamada.Local;
            }
            else
            {
                costoLlamada = ((Provincial) llamada).getCostoLlamada();
                tipoLlamada = TipoLlamada.Provincial;
            }

            if (tipo == tipoLlamada || tipo == TipoLlamada.Todas)
            {
                retGanancia += costoLlamada;
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
        String cabecera;
        String cabeceraListado;
        String detalleListado;

        this.ordenarLlamadas();

        cabecera = "CENTRAL " + this._razonSocial;
        System.out.println(cabecera);
        System.out.println(toolbox.Cadena.repeat("-", cabecera.length()));

        System.out.println("Ganancia Local: \t$" + this.getGananciaPorLocal());
        System.out.println("Ganancia Provincial: \t$" + this.getGananciaPorProvincial());
        System.out.println("Ganancia Total: \t$" + this.getGananciaTotal());

        cabeceraListado = "\nLISTA DE LLAMADAS:";
        System.out.println(cabeceraListado);
        System.out.println(toolbox.Cadena.repeat("-", cabeceraListado.length()));

        detalleListado = Cadena.encolumnarAlinearTexto(" | ",
                "COSTO", 8, Cadena.ALINEA_MED,
                "DURACION", 12, Cadena.ALINEA_MED,
                "NRO ORIGEN", 12, Cadena.ALINEA_MED,
                "NRO DESTINO", 12, Cadena.ALINEA_MED,
                "TIPO", 10, Cadena.ALINEA_MED);
        System.out.println(detalleListado);
        System.out.println(Cadena.repeat("-", detalleListado.length()));

        for (Llamada llamada : _listaDeLlamadas)
        {
            if (llamada instanceof Local)
            {
                ((Local) llamada).mostrar();
            }
            else
            {
                ((Provincial) llamada).mostrar();
            }
        }
    }

    public void ordenarLlamadas()
    {
        Collections.sort(this._listaDeLlamadas, Llamada.ordenarPorDuracion);
    }
}

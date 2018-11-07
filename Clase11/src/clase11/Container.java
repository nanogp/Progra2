package clase11;

import java.util.ArrayList;
import toolbox.Cadena;

public class Container
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    int _capacidad;
    String _empresa;
    ArrayList<Producto> _lista;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Container(int capacidad, String empresa)
    {
        this._lista = new ArrayList<Producto>();
        this._empresa = empresa;
        this._capacidad = capacidad;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">

    public boolean Agregar(Producto proUno)
    {
        boolean retorno = false;

        if (this._capacidad > this._lista.size()
                && !ContieneProducto(this, proUno))
        {
            this._lista.add(proUno);
            retorno = true;

        }

        return retorno;

    }

    public static void Mostrar(Container contenedor)
    {
        System.out.println("-__-__Container__-__-");
        System.out.println("Empresa:" + contenedor._empresa);
        System.out.println("Capacidad:" + contenedor._capacidad);
        System.out.println("Productos:");

        for (Producto producto : contenedor._lista)
        {
            producto.Mostrar();
        }

    }

    public static ArrayList<Producto> SeleccionarComestible(Container contenedorUno, eTipoComestible tipoComestible)
    {
        ArrayList<Producto> retList = new ArrayList<>();

        for (Producto producto : contenedorUno._lista)
        {
            if (Producto.comparaComestible(producto, tipoComestible))
            {
                retList.add(producto);
            }
        }
        return retList;
    }

    public boolean ContieneProducto(Container unContenedor, Producto unProducto)
    {
        boolean contiene = false;

        for (Producto producto : unContenedor._lista)
        {
            if (Producto.comparaDosProductos(unProducto, producto))
            {
                contiene = true;
                break;
            }
        }

        return contiene;
    }
    //</editor-fold>
}

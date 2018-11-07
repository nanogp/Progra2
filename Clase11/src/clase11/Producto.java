package clase11;

import toolbox.Cadena;

public class Producto
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private int _codigoBarras;
    private String _nombre;
    private double _precio;
    private eTipoComestible _tipo;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Producto(int codigo)
    {
        this._codigoBarras = codigo;
    }

    public Producto(int codigo, String nombre, eTipoComestible tipo)
    {
        this(codigo);
        this._nombre = nombre;
        this._tipo = tipo;
    }

    public Producto(int codigo, String nombre, eTipoComestible tipo, double precio)
    {
        this(codigo, nombre, tipo);
        this._precio = precio;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void Mostrar()
    {
        System.out.println("Nombre:" + this._nombre);
        System.out.println("Tipo:" + this._tipo);
        System.out.println("Codigo:" + this._codigoBarras);
        System.out.println("Precio:" + String.format("%.0f", this._precio));
    }

    public static boolean comparaComestible(Producto unProducto, eTipoComestible tipo)
    {
        return unProducto._tipo == tipo;
    }

    public static boolean comparaDosProductos(Producto unProducto, Producto otroProducto)
    {
        return unProducto.equals(otroProducto);
    }

    public boolean equals(Producto p)
    {
        return this._codigoBarras == p._codigoBarras;
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.equals((Producto) obj);
    }

    //</editor-fold>
}

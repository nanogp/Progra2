package ejercicios;

import java.awt.Color;

public class Boligrafo
{

    private Color _color;
    private int _cantTinta;

    public Boligrafo(Color color, int cantTinta)
    {
        this._color = color;
        this._cantTinta = cantTinta;
    }

    public Color getColor()
    {
        return _color;
    }

    public int getCantTinta()
    {
        return _cantTinta;
    }

    public void pintar(int gasto)
    {
        if (getCantTinta() >= gasto)
        {
            _cantTinta -= gasto;
            System.out.println("Pintó de color " + nombreColor() + " | Le quedan " + this._cantTinta + " de tinta");
        } else
        {
            System.out.println("Color " + nombreColor() + " | No alcanza la tinta");
        }
    }

    public void recargar()
    {
        _cantTinta = 100;
        System.out.println("Se recargó el color " + nombreColor() + " | Le quedan " + this._cantTinta + " de tinta");

    }

    private String nombreColor()
    {
        if (this._color.getBlue() > 0)
        {
            return "Azul";
        }
        return "Rojo";
    }

}

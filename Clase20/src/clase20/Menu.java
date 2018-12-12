package clase20;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private class OpcionDeMenu
    {
        //<editor-fold defaultstate="collapsed" desc="Atributos">

        int codigo;
        String descripcion;

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Constructores">
        public OpcionDeMenu(int codigo, String descripcion)
        {
            this.codigo = codigo;
            this.descripcion = descripcion;
        }
        //</editor-fold>
    }

    private int codigoSiguiente;
    String titulo;
    ArrayList<OpcionDeMenu> opciones;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    private Menu()
    {
        this.codigoSiguiente = 0;
        this.opciones = new ArrayList<>();
    }

    public Menu(String titulo)
    {
        this();
        this.titulo = titulo;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    private int getCodigoSiguiente()
    {
        this.codigoSiguiente++;
        return this.codigoSiguiente;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public boolean agregarItems(String... items)
    {
        boolean ret = false;

        for (String item : items)
        {
            ret = opciones.add(new OpcionDeMenu(this.getCodigoSiguiente(), item));
            if (!ret)
            {
                break;
            }
        }

        return ret;
    }

    @Override
    public String toString()
    {
        StringBuilder ret = new StringBuilder();

        ret.append(this.titulo).append("\n")
                .append(toolbox.Cadena.repeat("-", this.titulo.length()))
                .append("\n\n");

        for (OpcionDeMenu odm : this.opciones)
        {
            ret.append(odm.codigo).append(" - ").append(odm.descripcion).append("\n");
        }

        return ret.toString();
    }

    private boolean contains(int codigo)
    {
        boolean ret = false;
        if (codigo > 0 || codigo <= this.opciones.size())
        {
            ret = true;
        }
        return ret;
    }

    public int pedirOpcion()
    {
        int opcion;
        String listaOpciones = null;

        System.out.println(this.toString());
        System.out.println("Elija una opcion del menu");

        opcion = toolbox.Toolbox.leerDeConsola.nextInt();
        while (!this.contains(opcion))
        {
            System.out.println(this.toString());
            System.out.println("La opcion no es valida");
            System.out.println("Elija una opcion del menu");
        }
        return opcion;
    }

//</editor-fold>
}

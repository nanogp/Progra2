package ahorcado.Clases;

import ahorcado.Enumerados.Dificultad;
import java.util.LinkedList;

public class Partida
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected Dificultad dificultad;
    protected Usuario usuario;
    protected Palabra palabra;
    protected int contadorFallos;
    protected int contadorAciertos;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Partida()
    {
        this.contadorFallos = 0;
        this.contadorAciertos = 0;
    }

    public Partida(Dificultad dificultad, Usuario usuario, Palabra palabra)
    {
        this.dificultad = dificultad;
        this.usuario = usuario;
        this.palabra = palabra;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public Dificultad getDificultad()
    {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad)
    {
        this.dificultad = dificultad;
    }

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    public Palabra getPalabra()
    {
        return palabra;
    }

    public void setPalabra(Palabra palabra)
    {
        this.palabra = palabra;
    }

    public int getIntentosFallidos()
    {
        return contadorFallos;
    }

    public void setIntentosFallidos(int intentosFallidos)
    {
        this.contadorFallos = intentosFallidos;
    }

    public int getContadorAciertos()
    {
        return contadorAciertos;
    }

    public void setContadorAciertos(int contadorAciertos)
    {
        this.contadorAciertos = contadorAciertos;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    //</editor-fold>
}

package ahorcado.Clases;

import ahorcado.Enumerados.Dificultad;
import java.util.LinkedList;

public class Partida
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected Dificultad dificultad;
    protected Usuario usuario;
    protected Palabra palabra;
    protected int maxFallos;
    protected int momentoPista;
    protected int valorPuntos;
    protected int contadorFallos;
    protected int contadorAciertos;
    protected char[] palabraSecreta;
    protected char[] letrasUsadas;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Partida()
    {
        this.contadorFallos = 0;
        this.contadorAciertos = 0;
        this.maxFallos = Dificultad.getMaxFallos(dificultad);
        this.momentoPista = Dificultad.getMomentoPista(dificultad);
        this.momentoPista = Dificultad.getValorPuntos(dificultad);
    }

    public Partida(Dificultad dificultad, Usuario usuario, Palabra palabra)
    {
        this.dificultad = dificultad;
        this.usuario = usuario;
        this.palabra = palabra;
        this.setPalabraSecreta();
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

    public int getMaxFallos()
    {
        return maxFallos;
    }

    public void setMaxFallos(int maxFallos)
    {
        this.maxFallos = maxFallos;
    }

    public int getMomentoPista()
    {
        return momentoPista;
    }

    public void setMomentoPista(int momentoPista)
    {
        this.momentoPista = momentoPista;
    }

    public int getValorPuntos()
    {
        return valorPuntos;
    }

    public void setValorPuntos(int valorPuntos)
    {
        this.valorPuntos = valorPuntos;
    }

    public int getContadorFallos()
    {
        return contadorFallos;
    }

    public void setContadorFallos(int contadorFallos)
    {
        this.contadorFallos = contadorFallos;
    }

    public void addContadorFallos()
    {
        this.contadorFallos++;
    }

    public int getContadorAciertos()
    {
        return contadorAciertos;
    }

    public void setContadorAciertos(int contadorAciertos)
    {
        this.contadorAciertos = contadorAciertos;
    }

    public void addContadorAciertos()
    {
        this.contadorAciertos++;
    }

    public char[] getPalabraSecreta()
    {
        return palabraSecreta;
    }

    private void setPalabraSecreta()
    {
        for (int i = 0; i < getPalabra().getNombre().length(); i++)
        {
            this.palabraSecreta[i] = '_';
        }
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void validarLetraIngresada(char letra)
    {
        boolean noHayCoincidencia = true;

        letrasUsadas[letrasUsadas.length] = letra;

        for (int i = 0; i < palabraSecreta.length; i++)
        {
            if (palabraSecreta[i] == letra)
            {
                palabraSecreta[i] = letra;
                noHayCoincidencia = false;
                addContadorAciertos();
            }
        }

        if (noHayCoincidencia)
        {
            addContadorFallos();
        }
    }

    //</editor-fold>
}

package ahorcado.Clases;

import ahorcado.Enumerados.Dificultad;
import ahorcado.Excepciones.GanaPartida;
import ahorcado.Excepciones.PierdePartida;
import java.util.ArrayList;

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
    protected char[] alfabeto;
    protected ArrayList<Character> palabraSecreta;
    protected ArrayList<Character> letrasUsadas;
    protected char letraElegida;
    private final String alfabetoValido;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Partida()
    {
        this.alfabetoValido = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        this.contadorFallos = 0;
        this.contadorAciertos = 0;
        this.maxFallos = Dificultad.getMaxFallos(dificultad);
        this.momentoPista = Dificultad.getMomentoPista(dificultad);
        this.valorPuntos = Dificultad.getValorPuntos(dificultad);

    }

    public Partida(Dificultad dificultad, Usuario usuario, Palabra palabra)
    {
        this();
        this.dificultad = dificultad;
        this.usuario = usuario;
        this.palabra = palabra;
        this.setPalabraSecreta();
        this.setAlfabeto();
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

    public ArrayList<Character> getPalabraSecreta()
    {
        return palabraSecreta;
    }

    private void setPalabraSecreta()
    {/*
        for (int i = 0; i < getPalabra().getNombre().length(); i++)
        {
            this.palabraSecreta[i] = '_';
        }
         */
        if (this.palabraSecreta == null)
        {
            this.palabraSecreta = new ArrayList<>();
        }
        else
        {
            this.palabraSecreta.clear();
        }

        for (char c : getPalabra().getNombre().toCharArray())
        {
            this.palabraSecreta.add('_');
        }
    }

    public char getLetraElegida()
    {
        return letraElegida;
    }

    public void setLetraElegida(char letraElegida)
    {
        this.letraElegida = letraElegida;
    }

    public char[] getAlfabeto()
    {
        return alfabeto;
    }

    private void setAlfabeto()
    {

        this.alfabeto = new char[alfabetoValido.length()];

        for (int i = 0; i < alfabetoValido.length(); i++)
        {
            this.alfabeto[i] = alfabetoValido.charAt(i);
        }
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void validarLetraIngresada(char letra)
    {
        boolean noHayCoincidencia = true;

        letrasUsadas.add(letra);

        for (int i = 0; i < palabraSecreta.size(); i++)
        {
            if (palabraSecreta.get(i) == letra)
            {
                palabraSecreta.set(i, letra);
                noHayCoincidencia = false;
                addContadorAciertos();
            }
        }

        if (noHayCoincidencia)
        {
            addContadorFallos();
        }

    }

    public void validarEstadoPartida() throws GanaPartida, PierdePartida
    {
        if (getContadorAciertos() == getPalabra().getTamaño())
        {
            throw new GanaPartida();
        }

        if (getContadorFallos() == getMaxFallos())
        {
            throw new PierdePartida();
        }

    }
    //</editor-fold>
}

package clases;

import enumerados.Dificultad;
import excepciones.GanaPartida;
import excepciones.PierdePartida;
import java.util.ArrayList;

public class Partida
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    protected Dificultad dificultad;
    protected Usuario usuario;
    protected Palabra palabra;
    protected boolean pistaMostrada;
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
        this.letrasUsadas = new ArrayList<>();
        this.contadorFallos = 0;
        this.contadorAciertos = 0;
        this.pistaMostrada = false;

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
        return Dificultad.getMaxFallos(getDificultad());
    }

    public int getMomentoPista()
    {
        return Dificultad.getMomentoPista(getDificultad());
    }

    public boolean isPistaMostrada()
    {
        return pistaMostrada;
    }

    public void setPistaMostrada()
    {
        this.pistaMostrada = true;
    }

    public int getValorPuntos()
    {
        return Dificultad.getValorPuntos(getDificultad());
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
    {
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
            this.palabraSecreta.add('*');
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
    public void validarLetraElegida()
    {
        boolean noHayCoincidencia = true;

        System.out.println("Letra elegida:" + getLetraElegida());

        letrasUsadas.add(getLetraElegida());

        for (int i = 0; i < palabra.getNombre().length(); i++)
        {
            if (palabra.getNombre().charAt(i) == getLetraElegida())
            {
                palabraSecreta.set(i, getLetraElegida());
                noHayCoincidencia = false;
                addContadorAciertos();
            }
        }

        if (noHayCoincidencia)
        {
            addContadorFallos();
        }

        System.out.println("Palabra secreta:" + getPalabraSecreta().toString());
        System.out.println("Contador aciertos:" + getContadorAciertos());
        System.out.println("Contador fallos:" + getContadorFallos());
    }

    public void validarEstadoPartida() throws GanaPartida, PierdePartida
    {
        if (getContadorAciertos() == getPalabra().getNombre().length())
        {
            actualizarEstadisticaUsuario();
            throw new GanaPartida();
        }
        else if (getContadorFallos() == getMaxFallos())
        {
            actualizarEstadisticaUsuario();
            throw new PierdePartida();
        }

    }

    public void actualizarEstadisticaUsuario()
    {
        getUsuario().addPuntaje(getValorPuntos());
        getUsuario().addPartidasJugadas();
    } //</editor-fold>

}

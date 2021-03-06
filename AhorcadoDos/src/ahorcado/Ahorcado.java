package ahorcado;

import enumerados.*;
import clases.*;
import excepciones.*;
import java.util.ArrayList;

public class Ahorcado
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Diccionario diccionario;
    private ListaDePalabras palabrasEnJuego;
    private Ranking ranking;
    private Usuario usuario;
    private boolean usuarioExistia;
    private Dificultad dificultad;
    protected Palabra palabra;
    protected boolean pistaMostrada;
    protected boolean partidaEnCurso;
    protected int contadorFallos;
    protected int contadorAciertos;
    protected ArrayList<Character> palabraSecreta;
    protected ArrayList<Character> letrasUsadas;
    protected char letraElegida;
    private static final String NOMBRE_USUARIO_DEFAULT;
    private static final String ALFABETO;
    public static final boolean GANA_PARTIDA;
    public static final boolean PIERDE_PARTIDA;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    static
    {
        ALFABETO = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        NOMBRE_USUARIO_DEFAULT = "Anonimo";
        GANA_PARTIDA = true;
        PIERDE_PARTIDA = false;
    }

    public Ahorcado()
    {
        this.diccionario = new Diccionario();
        this.diccionario = Diccionario.leerDeXml(diccionario.getNombreArchivo());
        this.ranking = new Ranking();
        this.ranking = Ranking.leerDeXml(ranking.getNombreArchivo());
        this.usuario = new Usuario(getNombreUsuarioDefault());
        this.palabraSecreta = new ArrayList<>();
        this.letrasUsadas = new ArrayList<>();
        this.partidaEnCurso = false;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public Diccionario getDiccionario()
    {
        return diccionario;
    }

    public void setDiccionario(Diccionario diccionario)
    {
        this.diccionario = diccionario;
    }

    public ListaDePalabras getPalabrasEnJuego()
    {
        return palabrasEnJuego;
    }

    public void setPalabrasEnJuego(ListaDePalabras palabrasEnJuego)
    {
        this.palabrasEnJuego = palabrasEnJuego;
    }

    public Ranking getRanking()
    {
        return ranking;
    }

    public Ranking getSortedRanking()
    {
        getRanking().getListaDeUsuarios().sort(Usuario.ComparatorPuntaje);
        return ranking;
    }

    public void setRanking(Ranking ranking)
    {
        this.ranking = ranking;
    }

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    public boolean getUsuarioExistia()
    {
        return usuarioExistia;
    }

    public void setUsuarioExistia(boolean usuarioExistia)
    {
        this.usuarioExistia = usuarioExistia;
    }

    public Dificultad getDificultad()
    {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad)
    {
        this.dificultad = dificultad;
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

    public void setPistaMostrada(boolean b)
    {
        this.pistaMostrada = b;
    }

    public boolean isPartidaEnCurso()
    {
        return partidaEnCurso;
    }

    public void setPartidaEnCurso(boolean partidaEnCurso)
    {
        this.partidaEnCurso = partidaEnCurso;
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

    public String getAlfabeto()
    {
        return ALFABETO;
    }

    public String getNombreUsuarioDefault()
    {
        return NOMBRE_USUARIO_DEFAULT;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void nuevoJuego() throws GanaJuego
    {

        //setear usuario por default
        setUsuario(new Usuario(getNombreUsuarioDefault()));

        //setear variables para el juego
        setDificultad(dificultad);

        //obtener lista de palabras acorde a dificultad
        setPalabrasEnJuego(getDiccionario().getListaDePalabras().getListaPalabrasPorDificultad(getDificultad()));

        //crear una nueva partida del juego
        nuevaPartida();
    }

    public void nuevaPartida() throws GanaJuego
    {
        System.out.println("usuario:" + getUsuario().getNombre());
        System.out.println("partidas jugadas: " + getUsuario().getPartidasJugadas());
        System.out.println("puntaje ultimo:" + getUsuario().getPuntajeUltimo());
        System.out.println("puntaje acumulado:" + getUsuario().getPuntajeAcumulado());

        setPartidaEnCurso(true);

        //verificar si quedan mas palabras
        if (getPalabrasEnJuego().isEmpty())
        {
            //subir de nivel o lanzar GanaJuego
            setDificultad(getDificultad().levelUp());

            //obtener lista de palabras acorde a nueva dificultad
            setPalabrasEnJuego(getDiccionario().getListaDePalabras().getListaPalabrasPorDificultad(getDificultad()));
        }

        /**
         * getUsuario().addPartidasJugadas(); cuento las partidas del usuario
         * solo cuando las termina en actualizarEstadisticaUsuario();
         */
        //resetear variables
        setContadorFallos(0);
        setContadorAciertos(0);
        setPistaMostrada(false);

        //elegir palabra nueva
        setPalabra(getPalabrasEnJuego().popRandom());
        //for (Palabra p : palabrasEnJuego){setPalabra(p);} //agotar diccionario para debug
        System.out.println("Palabra a adivinar:" + getPalabra());

        //armar palabra secreta con los puntitos
        setPalabraSecreta();

    }

    public void validarLetraElegida()
    {
        boolean noHayCoincidencia = true;

        //System.out.println("Letra elegida:" + getLetraElegida());
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
            //actualizarEstadisticaUsuario(ganaPartida);
            throw new GanaPartida();
        }
        else if (getContadorFallos() == getMaxFallos())
        {
            //actualizarEstadisticaUsuario(pierdePartida);
            throw new PierdePartida();
        }

    }

    public void actualizarEstadisticaUsuario(boolean b)
    {
        getUsuario().addPartidasJugadas(1);

        if (b == GANA_PARTIDA)
        {
            getUsuario().addPuntaje(getValorPuntos());
        }
        else
        {
            actualizarRanking();
        }

    }

    public void actualizarRanking()
    {
        //solo si suma puntos
        if (getUsuario().getPuntajeUltimo() > 0)
        {
            //ver si ya existe el usuario en el ranking
            if (getRanking().getListaDeUsuarios().contains(getUsuario()))
            {
                //tomar usuario del ranking
                Usuario aux = getRanking().getListaDeUsuarios().get(getRanking().getListaDeUsuarios().indexOf(getUsuario()));

                //actualizar stats
                aux.addPartidasJugadas(getUsuario().getPartidasJugadas());
                aux.addPuntajeAcumulado(getUsuario().getPuntajeAcumulado());
                aux.setPuntajeUltimo(getUsuario().getPuntajeUltimo());
            }
            else
            {
                //agregar al ranking
                getRanking().getListaDeUsuarios().addLast(getUsuario());

            }

            //actualizar archivo ranking
            Main.backend.getRanking().guardarEnXml();

        }
    }

    //</editor-fold>
}

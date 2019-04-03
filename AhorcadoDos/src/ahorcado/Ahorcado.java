package ahorcado;

import enumerados.Dificultad;
import clases.Diccionario;
import clases.ListaDePalabras;
import clases.Partida;
import clases.Usuario;
import clases.Ranking;
import excepciones.GanaJuego;

public class Ahorcado
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Diccionario diccionario;
    private ListaDePalabras palabrasEnJuego;
    private Ranking ranking;
    private Partida partida;
    private Usuario usuario;
    private boolean usuarioExistia;
    private int contadorPartidas;
    private int puntajeActual;
    private int puntajeAcumulado;
    private Dificultad dificultad;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Ahorcado()
    {
        this.diccionario = new Diccionario();
        this.diccionario = Diccionario.leerDeXml(diccionario.getNombreArchivo());

        this.ranking = new Ranking();
        this.ranking = Ranking.leerDeXml(ranking.getNombreArchivo());

        this.usuario = new Usuario();

        this.getUsuario().setNombre("Anonimo");
        this.contadorPartidas = 0;
        this.puntajeActual = 0;
        this.puntajeAcumulado = 0;
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

    public void setRanking(Ranking ranking)
    {
        this.ranking = ranking;
    }

    public Partida getJuego()
    {
        return partida;
    }

    public void setJuego(Partida juego)
    {
        this.partida = juego;
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

    public int getContadorPartidas()
    {
        return contadorPartidas;
    }

    public void setContadorPartidas(int contadorPartidas)
    {
        this.contadorPartidas = contadorPartidas;
    }

    public void addContadorPartidas()
    {
        this.contadorPartidas++;
    }

    public int getPuntajeActual()
    {
        return puntajeActual;
    }

    public void setPuntajeActual(int puntajeActual)
    {
        this.puntajeActual = puntajeActual;
    }

    public int getPuntajeAcumulado()
    {
        return puntajeAcumulado;
    }

    public void setPuntajeAcumulado(int puntajeAcumulado)
    {
        this.puntajeAcumulado = puntajeAcumulado;
    }

    public Dificultad getDificultad()
    {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad)
    {
        this.dificultad = dificultad;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void nuevoJuego(Usuario nuevoJugador, Dificultad dificultad) throws GanaJuego
    {
        if (getRanking().getListaDeUsuarios().contains(nuevoJugador))
        {
            setUsuarioExistia(true);
            setUsuario(getRanking().getListaDeUsuarios().get(getRanking().getListaDeUsuarios().indexOf(nuevoJugador)));
        }
        else
        {
            setUsuarioExistia(false);
            getRanking().getListaDeUsuarios().addLast(nuevoJugador);
            setUsuario(getRanking().getListaDeUsuarios().getLast());
        }

        //setear dificultad
        setDificultad(dificultad);

        //obtener lista de palabras acorde a dificultad
        setPalabrasEnJuego(getDiccionario().getListaDePalabras().getListaPalabrasPorDificultad(getDificultad()));

        //crear una nueva partida del juego
        nuevaPartida();
    }

    public void nuevaPartida() throws GanaJuego
    {

        //verificar si quedan mas palabras
        if (getPalabrasEnJuego().isEmpty())
        {
            //subir de nivel o lanzar GanaJuego
            setDificultad(getDificultad().levelUp());
        }

        addContadorPartidas();

        //crear parida nueva
        partida = new Partida(getDificultad(), getUsuario(), getPalabrasEnJuego().popRandom());

    }

    //</editor-fold>
}

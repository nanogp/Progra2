package ahorcado;

import ahorcado.Clases.*;
import ahorcado.Enumerados.*;
import ahorcado.Excepciones.GanaJuego;

public class Ahorcado
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Diccionario diccionario;
    private ListaDePalabras palabrasEnJuego;
    private Ranking ranking;
    private Partida partida;
    private Usuario usuario;
    private boolean usuarioExistia;
    public Dificultad dificultad;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Ahorcado()
    {
        this.diccionario = new Diccionario();
        this.diccionario = Diccionario.leerDeXml(diccionario.getNombreArchivo());

        this.ranking = new Ranking();
        this.ranking = Ranking.leerDeXml(ranking.getNombreArchivo());
        
        this.usuario= new Usuario(); 
       

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

    public boolean isUsuarioExistia()
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

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void nuevoJuego(Usuario nuevoJugador, Dificultad dificultad) throws GanaJuego
    {
        //setear usuario y si existe, cargar sus datos
        //System.out.println("Ingresar nombre jugador: ");
        //Usuario nuevoJugador = new Usuario(toolbox.Toolbox.leerDeConsola.next());

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

        //crear parida nueva
        partida = new Partida(getDificultad(), getUsuario(), getPalabrasEnJuego().popRandom());

    }

    //</editor-fold>
}

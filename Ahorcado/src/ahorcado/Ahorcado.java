/**
 * leer diccionarios
 * esperar seleccion del usuario
 * a. config
 * b. jugar
 * c. salir
 */
package ahorcado;

import ahorcado.Clases.Diccionario;
import ahorcado.Clases.Partida;
import ahorcado.Clases.Ranking;
import ahorcado.Clases.Usuario;
import ahorcado.Enumerados.Dificultad;
import ahorcado.ListaDePalabras;
import java.util.LinkedList;

public class Ahorcado
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Diccionario diccionario;
    private ListaDePalabras palabrasEnJuego;
    private Ranking ranking;
    private Partida partida;
    private Usuario usuario;
    private boolean usuarioExistia;
    private Dificultad dificultad;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Ahorcado()
    {
        //this.diccionario = new Diccionario();
        this.diccionario = Diccionario.leerDeXml(diccionario.getNombreArchivo());

        //this.ranking = new Ranking();
        this.ranking = Ranking.leerDeXml(ranking.getNombreArchivo());

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
    public void nuevaPartida()
    {
        //setear usuario y si existe, cargar sus datos
        Usuario nuevoJugador = new Usuario(toolbox.Toolbox.leerDeConsola.next());

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
        setDificultad(Dificultad.getRandom());

        //obtener lista de palabras acorde a dificultad
        setPalabrasEnJuego(getDiccionario().getListaDePalabras().getListaPalabrasPorDificultad(getDificultad()));

        partida = new Partida(getDificultad(), getUsuario(), getPalabrasEnJuego().getRandom());
        System.out.println("palabra: " + partida.getPalabra());
        System.out.println("dificultad: " + partida.getDificultad());
        System.out.println("fallidos: " + partida.getIntentosFallidos());
        System.out.println("aciertos: " + partida.getContadorAciertos());
        System.out.println("usuario: " + partida.getUsuario());
    }
    //</editor-fold>

}

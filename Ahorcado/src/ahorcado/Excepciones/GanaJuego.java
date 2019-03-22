/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Excepciones;

/**
 *
 * @author mponti
 */
public class GanaJuego extends Exception
{

    /**
     * Creates a new instance of <code>ganaJuego</code> without detail message.
     */
    public GanaJuego()
    {
    }

    /**
     * Constructs an instance of <code>ganaJuego</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public GanaJuego(String msg)
    {
        super(msg);
    }
}

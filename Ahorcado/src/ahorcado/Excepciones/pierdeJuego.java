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
public class pierdeJuego extends Exception
{

    /**
     * Creates a new instance of <code>pierdeJuego</code> without detail
     * message.
     */
    public pierdeJuego()
    {
    }

    /**
     * Constructs an instance of <code>pierdeJuego</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public pierdeJuego(String msg)
    {
        super(msg);
    }
}

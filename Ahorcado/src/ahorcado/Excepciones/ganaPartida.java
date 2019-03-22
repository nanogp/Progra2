/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Excepciones;

/**
 *
 * @author Nano
 */
public class ganaPartida extends Exception
{

    /**
     * Creates a new instance of <code>ganaPartida</code> without detail
     * message.
     */
    public ganaPartida()
    {
    }

    /**
     * Constructs an instance of <code>ganaPartida</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ganaPartida(String msg)
    {
        super(msg);
    }
}

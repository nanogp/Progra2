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
public class pierdePartida extends Exception
{

    /**
     * Creates a new instance of <code>pierdePartida</code> without detail
     * message.
     */
    public pierdePartida()
    {
    }

    /**
     * Constructs an instance of <code>pierdePartida</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public pierdePartida(String msg)
    {
        super(msg);
    }
}

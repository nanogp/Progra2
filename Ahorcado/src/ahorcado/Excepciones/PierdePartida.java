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
public class PierdePartida extends Exception
{

    /**
     * Creates a new instance of <code>pierdePartida</code> without detail
     * message.
     */
    public PierdePartida()
    {
    }

    /**
     * Constructs an instance of <code>pierdePartida</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PierdePartida(String msg)
    {
        super(msg);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20;

/**
 *
 * @author mponti
 */
public class DesbordePilaExcepcion extends Exception
{

    /**
     * Creates a new instance of <code>DesbordePilaExcepcion</code> without
     * detail message.
     */
    public DesbordePilaExcepcion()
    {
    }

    /**
     * Constructs an instance of <code>DesbordePilaExcepcion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DesbordePilaExcepcion(String msg)
    {
        super(msg);
    }
}

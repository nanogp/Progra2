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
public class PilaVaciaExcepcion extends Exception
{

    /**
     * Creates a new instance of <code>PilaVaciaExcepcion</code> without detail
     * message.
     */
    public PilaVaciaExcepcion()
    {
    }

    /**
     * Constructs an instance of <code>PilaVaciaExcepcion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PilaVaciaExcepcion(String msg)
    {
        super(msg);
    }
}

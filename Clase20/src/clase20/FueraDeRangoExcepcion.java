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
public class FueraDeRangoExcepcion extends Exception
{

    /**
     * Creates a new instance of <code>fueraDeRangoExcepcion</code> without
     * detail message.
     */
    public FueraDeRangoExcepcion()
    {
    }

    /**
     * Constructs an instance of <code>fueraDeRangoExcepcion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FueraDeRangoExcepcion(String msg)
    {
        super(msg);
    }
}

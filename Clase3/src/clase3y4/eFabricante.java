/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3y4;

/**
 *
 * @author mponti
 */
public enum eFabricante
{
    Fiat,
    Ford,
    Chevrolet,
    Honda;

    public static eFabricante getRandom()
    {
        return values()[(int) (Math.random() * values().length)];
    }

    @Override
    public String toString()
    {
        return this.ordinal() + " : " + this.name();
    }
}

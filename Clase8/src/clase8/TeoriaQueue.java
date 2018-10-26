/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.*;

/**
 *
 * @author mponti
 */
public class TeoriaQueue
{

    public static void main()
    {
        Queue<Integer> cola;
        cola = new LinkedList();

        cola.offer(1);
        cola.offer(2);
        cola.offer(3);
        cola.offer(4);
        /*
        for (Integer integer : cola)
        {
            System.out.println(integer);
        }
         */

        while (cola.size() > 0)
        {
            System.out.println(cola.poll());
        }
    }

}

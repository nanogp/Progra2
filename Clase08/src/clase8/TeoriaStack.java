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
public class TeoriaStack
{

    public static void main()
    {
        Stack<Integer> pila;
        pila = new Stack();

        pila.push(1);
        pila.push(9);
        pila.push(3);
        pila.push(7);

        System.out.println("pila.size():" + pila.size());
        System.out.println("pila.peek():" + pila.peek());

        /*
        for (int i = pila.size(); i > 0; i--)
        {
            System.out.println(pila.pop());
        }
         */
        while (pila.size() > 0)
        {
            System.out.println(pila.pop());
        }


        /*
        for (int i = 0; i < cantidadElementos; i++)
        {
            pila.push(Random.randomSeed.nextInt(10));
        }

        for (Integer integer : pila)
        {
            System.out.println(integer);
        }
         */
    }
}

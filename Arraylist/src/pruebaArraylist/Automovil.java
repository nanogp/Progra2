/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaArraylist;

/**
 *
 * @author mponti
 */
public class Automovil extends Vehiculo {

    private static int _cantidadDeRuedas;
    public String fabricante;
    public String modelo;
    public int anio;

    Automovil(String fabricante,
            String modelo,
            int anio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anio = anio;
    }

    public static void mostrarCantidadDeRuedas() {
        System.out.println("La cantidad de ruedas es: " + _cantidadDeRuedas);
    }

    public static void setearCantidadDeRuedas(int cantidadDeRuedas) {
        _cantidadDeRuedas = cantidadDeRuedas;
    }

    public void mostrarVelocidadActual() {
        System.out.println("La velocidad actual es: " + this.getVelocidadActual());
    }

    public void mostrar() {
        System.out.println(this.fabricante + " - " + this.modelo + " - " + this.anio);
    }

}

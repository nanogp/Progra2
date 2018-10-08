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

    private void setTipoVehiculo() {
        super.setTipoVehiculo("Automovil");
    }

    Automovil(String fabricante, String modelo, int anio, int velocidad) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anio = anio;
        super.setVelocidadActual(velocidad);
        setTipoVehiculo();
    }

    public String toString() {
        return this.fabricante + " - " + this.modelo + " - " + this.anio;
    }

    public static void mostrarCantidadDeRuedas() {
        System.out.println("La cantidad de ruedas es: " + _cantidadDeRuedas);
    }

    public static void setCantidadDeRuedas(int cantidadDeRuedas) {
        _cantidadDeRuedas = cantidadDeRuedas;
    }

    public void mostrarVelocidadActual() {
        System.out.println("La velocidad actual es: " + this.getVelocidadActual() + "km/h");
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

}

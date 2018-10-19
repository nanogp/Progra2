package ejercicios;

import java.util.concurrent.ThreadLocalRandom;

public class Alumno
{

    //<editor-fold defaultstate="collapsed" desc="Miembros">
    private byte _nota1;
    private byte _nota2;
    private float _notaFinal;
    public String apellido;
    public int legajo;
    public String nombre;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void calcularFinal()
    {
        if (this._nota1 >= 4 && this._nota2 >= 4)
        {
            this._notaFinal = (float) (this._nota1 + this._nota2) / 2;
        }
        else
        {
            this._notaFinal = -1;
        }

    }

    public void estudiar()
    {
        this._nota1 = (byte) ThreadLocalRandom.current().nextInt(10);
        this._nota2 = (byte) ThreadLocalRandom.current().nextInt(10);
    }

    public void mostrar()
    {
        System.out.println("Legajo: " + this.legajo);
        System.out.println("Nombre y Apellido: " + this.nombre + " " + this.apellido);
        System.out.println("Nota 1: " + this._nota1);
        System.out.println("Nota 2: " + this._nota2);

        if (this._notaFinal != -1)
        {
            System.out.println("Nota final: " + this._notaFinal);
        }

        System.out.println("\n*************************\n");
    }
//</editor-fold>

}

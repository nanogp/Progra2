/*
Crear una clase llamada Cuenta y un enumerado llamado ETipoInteres, 
según se muestra en el siguiente diagrama:
Se pide crear los métodos públicos (getters y setters) necesarios 
para poder manipular un objeto de tipo Cuenta, sabiendo que dichos métodos 
deberán de realizar las validaciones correspondientes
(en ningún caso se deberá pedir el reingreso de datos dentro del método)
 */
package ejercicios;

public class Ejercicio2
{

    public static void main()
    {
        Cuenta unaCuenta = new Cuenta();
        unaCuenta.setNombre("Esta cuenta");
        unaCuenta.setNroCuenta(982374434);
        unaCuenta.setSaldo(1564453.25);
        unaCuenta.setTipoInteres(Cuenta.eTipoInteres.values()[Toolbox.random.nextInt(Cuenta.eTipoInteres.values().length)]);
        unaCuenta.mostrar();
    }
}

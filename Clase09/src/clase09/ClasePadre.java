package clase09;

public class ClasePadre
{

    protected int _entero;
    private char _caracter;
    public String cadena;

    public ClasePadre(int _entero, char _caracter, String cadena)
    {
        this._entero = _entero;
        this._caracter = _caracter;
        this.cadena = cadena;
    }

    public void mostrarPublico()
    {
        System.out.println("Hola metodo publico " + this.cadena);
    }

    protected void mostrarProtegido()
    {
        System.out.println("Hola metodo protegido " + this._entero);
    }

    private void mostrarPrivado()
    {
        System.out.println("Hola metodo privado " + this._caracter);
    }
}

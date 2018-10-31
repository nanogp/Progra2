package clase09;

public class ClaseDerivada extends ClasePadre
{

    public ClaseDerivada(int i, char c, String s)
    {
        super(i, c, s);
    }

    public void mostrarDerivada()
    {
        this.mostrarProtegido();
        this.mostrarPublico();
    }

}

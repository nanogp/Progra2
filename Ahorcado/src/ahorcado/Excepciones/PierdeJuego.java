package ahorcado.Excepciones;

public class PierdeJuego extends Exception
{
    public PierdeJuego()
    {
    }

    public PierdeJuego(String msg)
    {
        super(msg);
    }

}

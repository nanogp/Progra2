package excepciones;

public class PierdePartida extends Exception
{
    public PierdePartida()
    {
    }

    public PierdePartida(String msg)
    {
        super(msg);
    }

}

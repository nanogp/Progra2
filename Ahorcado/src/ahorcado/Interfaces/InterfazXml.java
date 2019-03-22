package ahorcado.Interfaces;

import ahorcado.Clases.Archivo;
import java.io.FileNotFoundException;

public interface InterfazXml
{

    public void guardarEnXml();

    public static Object leerDeXml(String nombreArchivo)
    {
        Object retorno = new Object();
        try
        {
            retorno = Archivo.deserializarXml(nombreArchivo);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo " + nombreArchivo);
        }
        return retorno;
    }

}

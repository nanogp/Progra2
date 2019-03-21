package ahorcado.Clases;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Archivo
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public static void serializarXml(Object objeto, String nombreArchivo) throws FileNotFoundException
    {
        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(nombreArchivo)));
        encoder.writeObject(objeto);
        encoder.close();
    }

    public static Object deserializarXml(String nombreArchivo) throws FileNotFoundException
    {
        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(nombreArchivo)));
        Object objeto = decoder.readObject();
        return objeto;
    }

    //</editor-fold>
}

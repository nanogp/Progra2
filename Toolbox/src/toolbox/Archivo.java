package toolbox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public static void escribirEnTxt(String path)
    {
        File file = new File(path);
        PrintWriter writer = null;
        BufferedReader reader = null;

        if (!file.exists())
        {
            try
            {
                file.createNewFile();
            }
            catch (IOException ex)
            {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else
        {
            try
            {
                writer = new PrintWriter(file, "utf-8");
                writer.append("sarlanganga");

                
            
            }
            catch (FileNotFoundException | UnsupportedEncodingException ex)
            {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                writer.close();
            }
        }
    }

    //</editor-fold>
}

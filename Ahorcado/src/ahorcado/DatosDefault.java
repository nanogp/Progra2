package ahorcado;

import clases.Diccionario;
import clases.Palabra;
import clases.Ranking;
import clases.Usuario;
import enumerados.Dificultad;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatosDefault
{
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    private static void crearArchivoVacio(String nombre)
    {
        try
        {
            new File(nombre).createNewFile();
        }
        catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void generarDiccionarioDefault()
    {
        Diccionario d = new Diccionario();
        crearArchivoVacio(d.getNombreArchivo());
        d.getListaDePalabras().add(new Palabra("HORA", "Tiempo que equivale a 60 minutos, es decir, 3600 segundos", Dificultad.Facil));
        d.getListaDePalabras().add(new Palabra("TECHO", "Parte superior de un edificio, construcción, habitáculo, etc., que lo cubre y cierra", Dificultad.Facil));
        d.getListaDePalabras().add(new Palabra("CINTA", "Tira de tela u otro material de propiedades semejantes que sirve para atar, ceñir o adornar", Dificultad.Facil));
        d.getListaDePalabras().add(new Palabra("CUENTA", "Cálculo u operación aritmética. Cada una de las bolas ensartadas que componen el rosario", Dificultad.Facil));
        d.getListaDePalabras().add(new Palabra("OVULO", "Células sexuales o gametos femeninos.1​ Son células grandes, esféricas e inmóviles.", Dificultad.Normal));
        d.getListaDePalabras().add(new Palabra("REDITO", "Renta, utilidad o beneficio renovable que rinde un capital", Dificultad.Normal));
        d.getListaDePalabras().add(new Palabra("CUERDA", "Conjunto de hilos entrelazados que forman un solo cuerpo largo y flexible que sirve para atar, suspender pesos, etc.", Dificultad.Normal));
        d.getListaDePalabras().add(new Palabra("VIOLIN", "Instrumento musical de cuerda, el más pequeño y agudo entre los de su clase, que se compone de una caja de resonancia en forma de 8, un mástil sin trastes y cuatro cuerdas que se hacen sonar con un arco", Dificultad.Normal));
        d.getListaDePalabras().add(new Palabra("ZAPATILLA", "Calzado cómodo y ligero, de paño, piel, etc., y con suela delgada, que se usa para estar en casa", Dificultad.Normal));
        d.getListaDePalabras().add(new Palabra("VENTILADOR", "Instrumento o aparato con aspas giratorias que impulsa o remueve el aire", Dificultad.Dificil));
        d.getListaDePalabras().add(new Palabra("PARACAIDAS", "Artefacto de tela resistente o de otra materia análoga, que se extiende en el aire en forma de sombrilla grande, cuya función es la de moderar la velocidad de caída de un cuerpo que se arroja desde una aeronave", Dificultad.Dificil));
        d.getListaDePalabras().add(new Palabra("DECORACION", "Arte que estudia la combinación de elementos ornamentales y la acomodación del espacio interior", Dificultad.Dificil));
        d.getListaDePalabras().add(new Palabra("MATRIMONIO", "Antigua institución social, presente en gran cantidad de culturas, que establece un vínculo conyugal entre personas naturales, reconocido y consolidado por medio de prácticas comunitarias y normas legales, consuetudinarias, religiosas o morales", Dificultad.Dificil));
        d.guardarEnXml();
    }

    public static void generarRankingDefault()
    {
        Ranking r = new Ranking();
        java.util.concurrent.ThreadLocalRandom randomSeed;
        randomSeed = java.util.concurrent.ThreadLocalRandom.current();
        crearArchivoVacio(r.getNombreArchivo());
        r.getListaDeUsuarios().add(new Usuario("FULANO", randomSeed.nextInt(10, 20), randomSeed.nextInt(1, 5), randomSeed.nextInt(1, 20)));
        r.getListaDeUsuarios().add(new Usuario("MENGANO", randomSeed.nextInt(10, 20), randomSeed.nextInt(1, 5), randomSeed.nextInt(1, 20)));
        r.getListaDeUsuarios().add(new Usuario("SULTANO", randomSeed.nextInt(10, 20), randomSeed.nextInt(1, 5), randomSeed.nextInt(1, 20)));
        r.getListaDeUsuarios().add(new Usuario("UN-TANO", randomSeed.nextInt(10, 20), randomSeed.nextInt(1, 5), randomSeed.nextInt(1, 20)));
        r.getListaDeUsuarios().add(new Usuario("NANO", randomSeed.nextInt(10, 50), randomSeed.nextInt(1, 5), randomSeed.nextInt(1, 20)));
        r.guardarEnXml();
    }
    //</editor-fold>
}

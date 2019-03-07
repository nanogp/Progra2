package ahorcado;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.LinkedList;

public class Diccionario
{

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private final LinkedList<Palabra> listaDePalabras;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Diccionario()
    {
        this.listaDePalabras = new LinkedList<>();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="GetSet">
    public LinkedList<Palabra> getListaDePalabras()    
    {
        return listaDePalabras;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void cargaDePrueba()
    {
        this.listaDePalabras.add(new Palabra("HORA", "Tiempo que equivale a 60 minutos, es decir, 3600 segundos", Palabra.FACIL));
        this.listaDePalabras.add(new Palabra("TECHO", "Parte superior de un edificio, construcción, habitáculo, etc., que lo cubre y cierra", Palabra.FACIL));
        this.listaDePalabras.add(new Palabra("CINTA", "Tira de tela u otro material de propiedades semejantes que sirve para atar, ceñir o adornar", Palabra.FACIL));
        this.listaDePalabras.add(new Palabra("CUENTA", "Cálculo u operación aritmética. Cada una de las bolas ensartadas que componen el rosario", Palabra.FACIL));
        this.listaDePalabras.add(new Palabra("OVULO", "Células sexuales o gametos femeninos.1​ Son células grandes, esféricas e inmóviles.", Palabra.NORMAL));
        this.listaDePalabras.add(new Palabra("REDITO", "Renta, utilidad o beneficio renovable que rinde un capital", Palabra.NORMAL));
        this.listaDePalabras.add(new Palabra("CUERDA", "Conjunto de hilos entrelazados que forman un solo cuerpo largo y flexible que sirve para atar, suspender pesos, etc.", Palabra.NORMAL));
        this.listaDePalabras.add(new Palabra("VIOLIN", "Instrumento musical de cuerda, el más pequeño y agudo entre los de su clase, que se compone de una caja de resonancia en forma de 8, un mástil sin trastes y cuatro cuerdas que se hacen sonar con un arco", Palabra.NORMAL));
        this.listaDePalabras.add(new Palabra("ZAPATILLA", "Calzado cómodo y ligero, de paño, piel, etc., y con suela delgada, que se usa para estar en casa", Palabra.NORMAL));
        this.listaDePalabras.add(new Palabra("VENTILADOR", "Instrumento o aparato con aspas giratorias que impulsa o remueve el aire", Palabra.DIFICIL));
        this.listaDePalabras.add(new Palabra("PARACAIDAS", "Artefacto de tela resistente o de otra materia análoga, que se extiende en el aire en forma de sombrilla grande, cuya función es la de moderar la velocidad de caída de un cuerpo que se arroja desde una aeronave", Palabra.DIFICIL));
        this.listaDePalabras.add(new Palabra("DECORACION", "Arte que estudia la combinación de elementos ornamentales y la acomodación del espacio interior", Palabra.DIFICIL));
        this.listaDePalabras.add(new Palabra("MATRIMONIO", "Antigua institución social, presente en gran cantidad de culturas, que establece un vínculo conyugal entre personas naturales, reconocido y consolidado por medio de prácticas comunitarias y normas legales, consuetudinarias, religiosas o morales", Palabra.DIFICIL));
    }

    @Override
    public String toString()
    {
        StringBuilder retorno = new StringBuilder();
        for (Palabra palabra : listaDePalabras)
        {
            retorno.append(toolbox.Cadena.encolumnarAlinearTexto(" | ",
                    palabra.getNombrePalabra(), 30, toolbox.Cadena.ALINEA_IZQ,
                    palabra.getDefinicionPalabra(), 1, toolbox.Cadena.ALINEA_IZQ));
            retorno.append("\n");
        }
        return retorno.toString();
    }

    public void mostrar()
    {
        System.out.println(this.toString());
    }

    public void sortByAlfabetico()
    {
        Collections.sort(this.listaDePalabras, Palabra.ComparatorAlfabetico);
    }

    public void sortByDificultad()
    {
        Collections.sort(this.listaDePalabras, Palabra.ComparatorDificultad);
    }

    public static void serializar(Diccionario lista, String nombreArchivo)
    {
        XMLEncoder encoder = null;

        try
        {
            //FileOutputStream archivo = new FileOutputStream(nombreArchivo);
            //BufferedOutputStream salida = new BufferedOutputStream(archivo);
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(nombreArchivo)));
        }
        catch (FileNotFoundException fileNotFound)
        {
            fileNotFound.getMessage();
            System.out.println("ERROR- tu archivo no esta");
        }

        encoder.writeObject(lista);
        encoder.close();

    }

    //</editor-fold>
}

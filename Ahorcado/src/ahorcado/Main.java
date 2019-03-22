package ahorcado;

import ahorcado.Enumerados.Dificultad;
import ahorcado.Clases.Usuario;
import ahorcado.Clases.Diccionario;
import ahorcado.Clases.Palabra;
import ahorcado.Clases.Ranking;
import ahorcado.Forms.FormInicial;
import toolbox.Random;

public class Main
{

    public static void generarDiccionarioPrueba(Diccionario d)
    {
        //l = new ListaDePalabras();
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

    public static void generarRankingPrueba(Ranking r)
    {
        //l = new ListaDeUsuarios();
        r.getListaDeUsuarios().add(new Usuario("Fulano", Random.randomSeed.nextInt(10, 20), 0, Random.randomSeed.nextInt(1, 20)));
        r.getListaDeUsuarios().add(new Usuario("Mengano", Random.randomSeed.nextInt(10, 20), 0, Random.randomSeed.nextInt(1, 20)));
        r.getListaDeUsuarios().add(new Usuario("Sultano", Random.randomSeed.nextInt(10, 20), 0, Random.randomSeed.nextInt(1, 20)));
        r.getListaDeUsuarios().add(new Usuario("Un-tano", Random.randomSeed.nextInt(10, 20), 0, Random.randomSeed.nextInt(1, 20)));
        r.getListaDeUsuarios().add(new Usuario("Nano", Random.randomSeed.nextInt(10, 50), 0, Random.randomSeed.nextInt(1, 20)));
        r.guardarEnXml();
    }

    public static void main(String[] args)
    {
        /*
        generarDiccionarioPrueba(new Diccionario());
        generarRankingPrueba(new Ranking());
         */

        Ahorcado juegoNuevo = new Ahorcado();
        ahorcado.Forms.FormInicial gui = new FormInicial();
        gui.setVisible(true);

        //juegoNuevo.nuevaPartida();
        //System.out.println(juegoNuevo.getRanking().getListaDeUsuarios().toString());
        /*  
        System.out.println(toolbox.Cadena.encolumnarAlinearTexto(" | ",
                "PALABRA", 20, toolbox.Cadena.ALINEA_IZQ,
                "DIFICULTAD", 10, toolbox.Cadena.ALINEA_IZQ,
                "DEFINICION", 1, toolbox.Cadena.ALINEA_IZQ));
        System.out.println(toolbox.Cadena.repeat("-", 50));
        System.out.println(juegoNuevo.getDiccionario().getListaDePalabras().toString());

        System.out.println(toolbox.Cadena.encolumnarAlinearTexto(" | ",
                "NOMBRE", 20, toolbox.Cadena.ALINEA_IZQ,
                "PUNTAJE", 10, toolbox.Cadena.ALINEA_IZQ,
                "PARTIDAS JUGADAS", 1, toolbox.Cadena.ALINEA_IZQ));
        System.out.println(toolbox.Cadena.repeat("-", 50));
         */
    }
}

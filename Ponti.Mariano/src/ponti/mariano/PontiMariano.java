package ponti.mariano;

public class PontiMariano
{
    
    public static void main(String[] args)
    {
        Biblioteca miBiblioteca = new Biblioteca(5);
        
        Autor a = new Autor("Esteban", "Rey");
        Autor b = new Autor("Joe", "Mayo");
        Manual m1 = new Manual(ETipo.Finanzas, a, 500, "Economia para tontos");
        Novela n1 = new Novela(EGenero.Romantica, a, 750, "El amor en tiempos de ...");
        Manual m2 = new Manual(ETipo.Escolar, new Autor("Moni", "Argento"), 500, "Como criar a sus hijos");
        Manual m3 = new Manual(ETipo.Tecnico, b, 854, "Java, desde el punto de vista de C#");
        Novela n2 = new Novela(EGenero.Accion, a, 410, "Miseria");
        Novela n3 = n2;
        
        if (!miBiblioteca.agregarLibro(m1)){System.out.println("\nFallo al agregar este libro:"+m1.Mostrar());};
    
        if (!miBiblioteca.agregarLibro(n1)){System.out.println("\nFallo al agregar este libro:"+n1.Mostrar());};
        
        if (!miBiblioteca.agregarLibro(m2)){System.out.println("\nFallo al agregar este libro:"+m2.Mostrar());};
        
        if (!miBiblioteca.agregarLibro(n2)){System.out.println("\nFallo al agregar este libro:"+n2.Mostrar());};
        
        if (!miBiblioteca.agregarLibro(n3)){System.out.println("\nFallo al agregar este libro:"+n3.Mostrar());};
        
        if (!miBiblioteca.agregarLibro(m3)){System.out.println("\nFallo al agregar este libro:"+m3.Mostrar());};
        
        System.out.println("\n\n");
        System.out.println(Biblioteca.MostrarBiblioteca(miBiblioteca));
        
    }
    
}

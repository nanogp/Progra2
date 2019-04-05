package ahorcado;

import forms.FormInicial;

public class Main
{
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    public static Ahorcado backend;
    public static FormInicial gui;

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public static void main(String[] args)
    {
        backend = new Ahorcado();
        gui = new FormInicial();
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);

        System.out.println(backend.getDiccionario().toString());
        System.out.println(backend.getRanking().toString());
    }
    //</editor-fold>

}

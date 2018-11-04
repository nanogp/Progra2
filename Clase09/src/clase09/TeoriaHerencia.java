package clase09;

public class TeoriaHerencia
{

    public static void main(String[] args)
    {
        ClaseDerivada unObjetoDerivado;
        ClasePadre unObjetoPadre;

        unObjetoPadre = new ClasePadre(1, 'a', "CABEZA");
        unObjetoDerivado = new ClaseDerivada(3, 'f', "Salaaalaaaa");

        unObjetoDerivado.mostrarDerivada();

        //unObjetoDerivado = (ClaseDerivada) unObjetoPadre; un padre no puede hacer de hijo
        unObjetoPadre = (ClasePadre) unObjetoDerivado; //un hijo de padre si

        unObjetoDerivado.mostrarDerivada();

    }
}

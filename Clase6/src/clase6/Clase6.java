package clase6;

import toolbox.Toolbox;

public class Clase6
{

    public static int cantidadAlumnos;

    public static void main(String[] args)
    {
        cantidadAlumnos = 10;
        Alumno.cantidadNotas = 3;
        int notaMin = 2;
        int notaMax = 10;

        Alumno[] alumnos = new Alumno[cantidadAlumnos];

        //cargo el array de alumnos
        for (int i = 0; i < alumnos.length; i++)
        {
            alumnos[i] = new Alumno(Alumno.getNextId(),
                    Toolbox.cadenas.generarNombreRandom() + ", " + Toolbox.cadenas.generarNombreRandom(),
                    Toolbox.cadenas.generarNombreRandom() + " " + Toolbox.random.nextInt(101, 6000),
                    Toolbox.cadenas.generarNombreRandom() + "@gmail.com");
        }

        //genero cabecera
        Toolbox.cadenas.stringBuilder = new StringBuilder();
        Toolbox.cadenas.appendRightPadSeparator("ID", 3, " | ");
        Toolbox.cadenas.appendRightPadSeparator("APELLIDO Y NOMBRE", 25, " | ");
        Toolbox.cadenas.appendRightPadSeparator("DIRECCION", 20, " | ");
        Toolbox.cadenas.appendRightPadSeparator("eMAIL", 25, " | ");
        for (int i = 1; i <= Alumno.cantidadNotas; i++)
        {
            Toolbox.cadenas.appendRightPadSeparator("NOTA " + i, 6, " | ");

        }
        Toolbox.cadenas.stringBuilder.append("PROMEDIO");
        System.out.println(Toolbox.cadenas.stringBuilder.toString());
        System.out.println(Toolbox.cadenas.rightPad("-", Toolbox.cadenas.stringBuilder.toString().length(), "-"));

        //calculo campos numericos y muestro
        for (Alumno alumno : alumnos)
        {
            alumno.setNotasIngreso(Toolbox.enteros.arrayIntRandom(Alumno.cantidadNotas, notaMin, notaMax));
            alumno.calcularPromedio();
            System.out.println(alumno.alumnoAString());
        }
    }
}

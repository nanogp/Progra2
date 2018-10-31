package clase8;

import toolbox.Random;

public class Paciente
{

    public String dni;
    public String nombre;

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Paciente()
    {
    }

    public Paciente(String dni, String nombre)
    {
        this.dni = dni;
        this.nombre = nombre;
    }

    public static Paciente random()
    {
        Paciente retPaciente;
        retPaciente = new Paciente(
                String.format("%d", Random.randomSeed.nextInt(30000000, 60000000)),
                Random.randomName());
        return retPaciente;
    }

    public String aString()
    {
        StringBuffer retString = new StringBuffer();
        retString.append("Dni:");
        retString.append(this.dni);
        retString.append(" - Nombre:");
        retString.append(this.nombre);
        return retString.toString();
    }

    public void mostrar()
    {
        System.out.println(this.aString());
    }
}

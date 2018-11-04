package clase09practica;

public class SerHumano
{

    private String _nombre;
    private byte _peso;
    private byte _altura;
    private String _sexo;

    public String getNombre()
    {
        return _nombre;
    }

    public void setNombre(String nombre)
    {
        this._nombre = nombre;
    }

    public byte getPeso()
    {
        return _peso;
    }

    public void setPeso(byte peso)
    {
        this._peso = peso;
    }

    public byte getAltura()
    {
        return _altura;
    }

    public void setAltura(byte altura)
    {
        this._altura = altura;
    }

    public String getSexo()
    {
        return _sexo;
    }

    public void setSexo(String sexo)
    {
        this._sexo = sexo;
    }

    public SerHumano()
    {
    }

    public SerHumano(String _nombre, byte _peso, byte _altura, String _sexo)
    {
        this._nombre = _nombre;
        this._peso = _peso;
        this._altura = _altura;
        this._sexo = _sexo;
    }

    public void comer()
    {
        System.out.println("comiendo");
    }

    public void dormir()
    {
        System.out.println("durmiendo");
    }

    public String serHumanoAString()
    {
        return toolbox.Cadena.encolumnarAlinearTexto(" - ",
                this._nombre, 20, toolbox.Cadena.ALINEA_MED,
                (int) this._peso, 6, toolbox.Cadena.ALINEA_MED,
                (int) this._altura, 6, toolbox.Cadena.ALINEA_MED,
                this._sexo, 10, toolbox.Cadena.ALINEA_MED);
    }

    public void mostrarSerHumano()
    {
        System.out.println(this.serHumanoAString());
    }
}

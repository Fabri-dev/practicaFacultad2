package Modelo;

public class Persona {

    //atributos
    private String nombre;

    private int edad;

    //constructores

    public Persona()
    {
        setEdad(0);
        setNombre("Sin nombre");
    }

    public Persona(int p_edad, String p_nombre)
    {
        setNombre(p_nombre);
        setEdad(p_edad);

    }

    //getters y setters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int p_edad) {
        this.edad= p_edad;
    }

    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    //metodos

    public void getInfo()
    {
        System.out.println("Hola "+nombre+",su edad es: "+edad);

    }
}

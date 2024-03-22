package Modelo;

public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private String genero;

    //constructor
    public Persona()
    {
        setNombre("Sin Nombre");
        setEdad(0);
        setGenero("Sin genero");
    }

    public Persona(String pNombre, String pGenero, int pEdad)
    {
        setGenero(pGenero);
        setNombre(pNombre);
        setEdad(pEdad);
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }

    public void setGenero(String pGenero) {
        this.genero = pGenero;
    }
    //metodos

    public String getInfo()
    {
        return "El nombre es: "+nombre+ "La edad: "+edad+ "El genero: "+genero;
    }

}

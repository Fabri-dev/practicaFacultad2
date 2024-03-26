package Modulo;

public class Estudiante {

    //atributos
    private String nombre;
    private int edad;
    private double[] calificaciones;
    //constructores

    public Estudiante() {
        setNombre("");
        setEdad(0);
        calificaciones = new double[3];

    }

    public Estudiante(String pNombre, int pEdad, double[] pArreglo)
    {
        nombre = pNombre;
        edad = pEdad;
        calificaciones = pArreglo;
    }
    //getter y setters

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos
    /*obtenerPromedio(): calcula y devuelve el promedio de las calificaciones del estudiante.
imprimirInformacion(): muestra por pantalla el nombre, la edad y el promedio del estudiante.*/
    public double obtenerPromedio()
    {
        double promedio = 0;
        for(int i = 0;i<calificaciones.length;i++)
        {
            promedio += calificaciones[i];
        }
        promedio = promedio/calificaciones.length;
        return promedio;
    }
    public String imprimirInformacion()
    {
        return "Nombre["+nombre+"]"+",Edad["+edad+"]"+",Promedio ["+obtenerPromedio()+"].\n";
    }
}

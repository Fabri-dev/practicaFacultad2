import Modulo.Curso;
import Modulo.Estudiante;

public class Main
{
    public static void main(String[] args)
    {
        Curso cursoActual= new Curso();
        double[] arregloNotas = new double[3];
            arregloNotas[0] = 10;
            arregloNotas[1] = 7;
            arregloNotas[2] = 8;
            Estudiante estudiante1 = new Estudiante("leo",18,arregloNotas);
            Estudiante estudiante2 = new Estudiante("Fabri",20,arregloNotas);
            //System.out.println(estudiante1.imprimirInformacion());
        System.out.println(cursoActual.agregarEstudiante(estudiante1));
        System.out.println(cursoActual.agregarEstudiante(estudiante2));
        System.out.println(cursoActual.mostrarInfo());
        System.out.println("Promedio general["+cursoActual.obtenerPromedioGeneral()+"]");


    }
}
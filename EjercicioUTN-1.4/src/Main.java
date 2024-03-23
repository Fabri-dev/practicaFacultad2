
import Modelo.Tarea;

import java.util.Scanner;

/*
Crea un programa que pida al usuario una lista de tareas pendientes
y muestre por pantalla las tareas más importantes y su fecha de vencimiento.
 */
public class Main {

    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {


        Tarea[] arregloTareas= new Tarea[5];

        for (int i=0; i< arregloTareas.length;i++ )
        {
            arregloTareas[i] = new Tarea();

            System.out.println("Ingrese la tarea a realizar(texto): ");
            scanner.nextLine();
            arregloTareas[i].setTexto(scanner.nextLine());

            System.out.println("Ingrese la importancia de la tarea(1 a 3, donde 1 es mas imp.)");
            arregloTareas[i].setImportancia(scanner.nextInt());

            System.out.println("Ingrese los dias que durara la tarea: ");
            arregloTareas[i].setVencimiento(scanner.nextInt());

            arregloTareas[i].setFechaVencimiento(arregloTareas[i].calcularFechaDeVencimiento(arregloTareas[i].getFechaInicio()));

        }

        clasificarFechas(arregloTareas);

        mostrarTareas(arregloTareas);
    }

    public static void clasificarFechas(Tarea[] arregloTareas)
    {
        Tarea auxTarea;
        int pos;
        for (int i=0; i < arregloTareas.length-1; i++)
        {
            pos=i;
            for (int j=i+1; j < arregloTareas.length; j++)
            {
                if(arregloTareas[pos] .getImportancia()> arregloTareas[j].getImportancia())
                {
                    pos=j;
                }
            }

            auxTarea= arregloTareas[i];
            arregloTareas[i]=arregloTareas[pos];
            arregloTareas[pos]=auxTarea;



        }

    }

    public static void mostrarTareas(Tarea[] arregloTareas)
    {
        for (int i=0; i < arregloTareas.length; i++)
        {
            System.out.println("Tarea: "+ arregloTareas[i].getTexto()+
                    "\sImportancia: "+arregloTareas[i].getImportancia()+
                    "\sFecha de inicio: "+ arregloTareas[i].getFechaInicio()+
                    "\sFecha de vencimiento: "+ arregloTareas[i].getFechaDeVencimientoFormateado());
        }
    }


}

import Modelo.Tarea;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*
Crea un programa que pida al usuario una lista de tareas pendientes
y muestre por pantalla las tareas más importantes y su fecha de vencimiento.
 */
public class Main {

    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        Tarea tareita= new Tarea();


        System.out.println("Ingrese la tarea a realizar(texto): ");
        tareita.setTexto(scanner.nextLine());

        System.out.println("Ingrese la importancia de la tarea(1 a 3, donde 1 es mas imp.)");
        tareita.setImportancia(scanner.nextInt());

        System.out.println("Ingrese los dias que durara la tarea: ");
        tareita.setVencimiento(scanner.nextInt());

        Calendar fechaInicicito = tareita.getFechaInicio();//dia hoy
        fechaInicicito.add(Calendar.DATE,tareita.getVencimiento());//calcula hasta cuando hay tiempo
        tareita.setFechaVenc(fechaInicicito);//seteo la nueva fecha de vencimiento


        System.out.println(tareita.getFechaDeVencimineto());




    }



}
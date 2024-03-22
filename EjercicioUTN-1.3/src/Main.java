/*
Crea un programa que pida al usuario el nombre, la edad y el género de varias personas,
 y muestre por pantalla estadísticas como la edad promedio y el porcentaje de hombres y
  mujeres.

 */


import Modelo.Persona;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        double promEdad,promHombres,promMujeres;
        String auxNombre,auxGenero;
        int auxEdad;

        Persona[] arregloPersonas= new Persona[5]; // creo un arreglo del tamanio de 5 personas
        for (int i=0; i < arregloPersonas.length;i++)
        {
            arregloPersonas[i]= new Persona(); // en cada ciclo del bucle creo una instancia nueva de la clase Persona


            System.out.println("Persona: "+(i+1));
            System.out.println("Ingrese el nombre: ");
            scanner.nextLine();
            arregloPersonas[i].setNombre(scanner.nextLine());
            System.out.println("Ingrese el genero: ");

            arregloPersonas[i].setGenero(scanner.nextLine());

            System.out.println("Ingrese la edad: ");

            arregloPersonas[i].setEdad(scanner.nextInt());

            arregloPersonas[i].getInfo();
        }

        System.out.println("El promedio de las edades es: "+ calcularPromedioEdad(arregloPersonas));
        System.out.println("El promedio de Hombres es: "+ calcularPromedioHombres(arregloPersonas));
        System.out.println("El promedio de Mujeres es: "+ calcularPromedioMujeres(arregloPersonas));

    }
    public static double calcularPromedioEdad(Persona[] arregloPersonas)
    {
        double prom;
        int sum = 0;
        for (int i=0; i < arregloPersonas.length; i++)
        {
            sum+=arregloPersonas[i].getEdad();
        }
        prom = (double) sum /arregloPersonas.length;

        return prom;
    }

    public static double calcularPromedioHombres(Persona[] arregloPersonas)
    {
        double prom;
        int sum = 0;
        String auxGenero;
        for (int i=0; i < arregloPersonas.length; i++)
        {
            auxGenero= arregloPersonas[i].getGenero().toLowerCase(Locale.ROOT);
            if ("hombre".equals(auxGenero) || "masculino".equals(auxGenero))
            {
                sum++;

            }
        }
        prom = (double) sum /arregloPersonas.length;

        return prom;
    }


    public static double calcularPromedioMujeres(Persona[] arregloPersonas)
    {
        double prom;
        int sum = 0;
        String auxGenero;
        for (int i=0; i < arregloPersonas.length; i++)
        {
            auxGenero= arregloPersonas[i].getGenero().toLowerCase(Locale.ROOT);
            if ("femenino".equals(auxGenero) || "mujer".equals(auxGenero))
            {
                sum++;
            }
        }
        prom = (double) sum /arregloPersonas.length;

        return prom;
    }


}
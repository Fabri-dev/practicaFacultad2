/*
Crea un programa que pida al usuario su altura
 y su peso, y muestre por pantalla su índice de masa corporal y
 si se encuentra en un rango saludable.
 */

import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        double peso=0,altura=0;

        System.out.println("Ingrese su peso en KG: ");
        peso= scanner.nextDouble();
        System.out.println("Ingrese su altura en Metros: ");
        altura= scanner.nextDouble();

    }
}
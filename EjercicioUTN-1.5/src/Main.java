/*
    Crea un programa que simule una cuenta bancaria, permitiendo al usuario depositar y retirar dinero, y mostrar el saldo actual.
 */

import Modelo.Persona;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Persona persona1= new Persona();
        int opSw, auxDni=0;
        String auxNombre, auxContra = null, mensaje;
        boolean flag;
        char op;

        do {
            System.out.println("1. Crear cuenta \n" +
                    "2. Ingresar a cuenta");
            System.out.println("-----------------------------------------");
            System.out.println("Que desea hacer?: \s");
            opSw= scanner.nextInt();

            switch (opSw)
            {
                case 1:
                    System.out.println("Cual es su nombre?:");
                    scanner.nextLine();
                    auxNombre= scanner.nextLine();

                    do {

                        System.out.println("Ingrese su DNI: ");
                        auxDni= scanner.nextInt();

                    }while (verificarDni(auxDni));
                    scanner.nextLine();

                    System.out.println("Ingrese una contrasenia:");
                    auxContra= scanner.nextLine();


                    mensaje = persona1.crearCuenta(auxDni,auxContra,auxNombre);
                    System.out.println(mensaje);

                    break;
                case 2:

                    do {

                        System.out.println("Ingrese su DNI: ");
                        auxDni= scanner.nextInt();
                    }while (verificarDni(auxDni));

                    System.out.println("Ingrese su contrasenia: ");
                    scanner.nextLine();
                    auxContra= scanner.nextLine();



                    break;
                default:
                    System.out.println("Ingrese un numero valido");
                    break;
            }

            flag= persona1.ingresarCuenta(auxDni,auxContra);



            if (flag)
            {
                //activo el menu

                do
                {
                    System.out.println("Hola, "+persona1.getNombre());
                    System.out.println("1. Depositar dinero a su cuenta\n" +
                            "2. Extraer dinero de su cuenta\n" +
                            "3. Consultar saldo\n" +
                            "4. Salir");

                    System.out.println("Que desea hacer?:");
                    opSw=scanner.nextInt();
                    switch (opSw)
                    {
                        case 1:
                            System.out.println("Ingrese el monto a depositar: ");
                            persona1.depositarDinero(scanner.nextInt());
                            break;
                        case 2:
                            System.out.println("Ingrese el monto a retirar: ");
                            persona1.extraerDinero(scanner.nextInt());
                            break;
                        case 3:
                            System.out.println("Su saldo es de: $"+persona1.getSaldo());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Ingrese una accion valida");
                            break;
                    }


                }while (opSw != 4);

            }
            else {
                System.out.println("Error datos mal ingresados");
            }
            System.out.println("Desea volver al menu principal? s/n: ");
            scanner.nextLine();
            op= scanner.nextLine().charAt(0);

        }while (op == 's' || op=='S');

    }

    public static boolean verificarDni(int dni)
    {
        boolean flag=false;
        if (dni <= 0)
        {
            flag=true;
        }
        return flag;
    }
}
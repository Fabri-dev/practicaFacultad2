import Modelo.Producto;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

      /*Crea un programa que pida al usuario el precio y la cantidad de varios productos,
      y muestre por pantalla el total de la venta.*/
        double venta = 0;
        Producto[] producto = new Producto[3];
        for(int i = 0;i<producto.length;i++)
        {
            producto[i] = new Producto();
            System.out.println("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            producto[i].setPrecio(precio);
            System.out.println("Ingrese la cantidad del producto: ");
            int cant = scanner.nextInt();
            producto[i].setCantidadProducto(cant);
            venta += (precio * cant);
        }

        System.out.println("El total de la venta es: "+venta);

        

    }
}
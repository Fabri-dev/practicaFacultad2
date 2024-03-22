import Modelo.Persona;

public class Main {
    public static void main(String[] args) {
        /*Crea un programa que pida al usuario su nombre y su edad,
        y muestre por pantalla un mensaje personalizado de bienvenida.*/
        Persona persona1= new Persona();
        Persona persona2= new Persona(34,"Carlos");

        persona1.getInfo();
        persona2.getInfo();


    }
}
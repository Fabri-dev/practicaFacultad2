import Modelo.Lapiz;

public class Main {
    public static void main(String[] args)
    {

        Lapiz lapiz001 = new Lapiz();
        Lapiz lapiz002 = new Lapiz("rojo");
        Lapiz lapiz003 = new Lapiz(10);

        System.out.println("#001: "+lapiz001.getInfo());
        System.out.println("#002: "+lapiz002.getInfo());
        System.out.println("#003: "+lapiz003.getInfo());

        lapiz001.setColor("Azul");
        System.out.println(" "+lapiz001.getInfo());
    }
}

package Modelo;

public class Lapiz {
    //atributos
    private String color;
    private int largo;
    private String marca;

    //constructores
    public Lapiz() {
        color = "";
        largo = 0;
        marca = "Sin marca";
    }

    public Lapiz(String pColor) {
        color = pColor;
    }

    public Lapiz(int plargo) {
        largo = plargo;

    }

    //getter and setter

    public int getLargo() {
        return largo;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //metodos
    public String getInfo()
    {
        return "Marca: "+marca+", Color: "+color+",Largo: "+largo;
    }

}

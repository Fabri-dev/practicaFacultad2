package Modelo;

public class Persona {
    //atributos
    private double altura;
    private double peso;
    //constructores

    public Persona()
    {
        setAltura(0);
        setPeso(0);
    }
    public Persona(double altura, double peso)
    {
        setAltura(altura);
        setPeso(peso);
    }
    //setters y getters

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    //metodos

    public double calcularIMC()
    {
        return peso / Math.pow(altura,2);
    }
}

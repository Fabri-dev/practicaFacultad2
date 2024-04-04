package Modelo;

public class Coche {

    //atributos
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadActual;

    private int id;
    //constructores
    public Coche()
    {
        setMarca("Sin marca");
        setModelo("Sin modelo");
        setAnio(0);
        setVelocidadActual(0);
    }
    public Coche(String pMarca, String pModelo, int pAnio)
    {
        setMarca(pMarca);
        setModelo(pModelo);
        setAnio(pAnio);
        setVelocidadActual(0);
    }

    //setters y getters

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public int getAnio() {
        return anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getId() {
        return id;
    }
    //metodos

    public String acelerar(double incremento)
    {
        String texto;
        this.velocidadActual+=incremento;
        texto="La velocidad actual es de: "+this.velocidadActual;
        return texto;
    }

    public String frenar(double decremento)
    {
        String texto;
        if (decremento <= velocidadActual)
        {
            this.velocidadActual-=decremento;
            texto= "La velocidad actual es de: "+ this.velocidadActual;
        }
        else
        {
            texto="Ingrese un valor valido que no supere a la velocidad actual";
        }
        return texto;
    }

    public String obtenerInfo()
    {
        return this.id+" " +
                this.modelo+" " +
                this.anio + " " +
                this.velocidadActual+" " +
                this.marca;
    }


}

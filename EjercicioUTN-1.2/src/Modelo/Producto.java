package Modelo;

public class Producto
{
    //atributos
    private double precio;
    private int cantidadProducto;
    //constructores

    public Producto()
    {

        setPrecio(0);
        setCantidadProducto(0);
    }
    public Producto(double p_precio,int p_cantidadProductos)
    {

        setPrecio(p_precio);
        setCantidadProducto(p_cantidadProductos);
    }
    //getters y setters

    public double getPrecio() {
        return precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }



    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //metodos
    public String getInfo()
    {
        return "Precio $"+precio+",cantidad del producto: "+cantidadProducto;
    }
}

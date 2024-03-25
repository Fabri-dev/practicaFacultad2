package Modelo;

import java.util.Objects;

public class Persona {
    //atributos
    private int dni;
    private String contrasenia;
    private int saldo;
    private String nombre;


    //constructores
    public Persona()
    {
        setNombre("NoNombre");
        setContrasenia(" ");
        setDni(0);
        setSaldo(0);
    }

    public Persona (int pDni, String pContrasenia, String pNombre){
        setNombre(pNombre);
        setContrasenia(pContrasenia);
        setDni(pDni);
        setSaldo(0);
    }

    //setters y getters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setContrasenia(String pContrasenia) {
        this.contrasenia = pContrasenia;
    }

    private void setDni(int pDni) {
        this.dni = pDni;
    }

    private void setSaldo(int pSaldo) {
        this.saldo = pSaldo;
    }
    

    public int getDni() {
        return dni;
    }

    public int getSaldo() { //mostrar saldo
        return saldo;
    }

    private String getContrasenia() {
        return contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    //metodos

    public String crearCuenta(int pDni, String pContrasenia,String pNombre)
    {
        String mensaje;
        if (this.getDni() == 0)
        {
            this.setNombre(pNombre);
            this.setContrasenia(pContrasenia);
            this.setDni(pDni);
            mensaje="Cuenta creada con exito!";
        }
        else
        {
            mensaje="Esta persona ya tiene una cuenta";
        }
        return mensaje;
    }

    public boolean ingresarCuenta(int pDni, String pContrasenia)
    {
        boolean flag=false;
        if (Objects.equals(pContrasenia, this.contrasenia) && pDni == this.dni)
        {
            flag=true;
        }
        return flag;
    }



    public String depositarDinero(int dinero)
    {
        String mensaje;
        if (dinero > 0)
        {
            this.saldo+=dinero;
            mensaje="Dinero depositado con exito";
        }
        else
        {
            mensaje="Ingrese un numero positivo";
        }

        return mensaje;
    }


    public String extraerDinero(int dinero)
    {
        String mensaje;
        if (dinero > 0 && this.saldo >= dinero)
        {
            this.saldo-=dinero;
            mensaje="Dinero extraido con exito";
        }
        else
        {
            mensaje="Ingrese un numero positivo o un numero menor o igual al saldo de su cuenta";
        }
        return mensaje;
    }

}

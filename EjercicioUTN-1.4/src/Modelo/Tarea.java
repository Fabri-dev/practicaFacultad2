package Modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tarea {
    //atributos
    private int importancia; // 1 al 3, 1 mas importante
    private String texto;

    private Calendar fechaInicio;
    private Calendar FechaVencimiento;
    private int vencimiento; //en dias


    //constructores
    public Tarea() {
        setFechaInicio(Calendar.getInstance());
        setFechaVencimiento(Calendar.getInstance());
        setImportancia(0);
        setVencimiento(0);
        setTexto("Sin texto");
    }

    public Tarea(Calendar pfechaVenc, Calendar pFechaInicio, int pVencimiento, int pImportancia, String pTexto) {
        setVencimiento(pVencimiento);
        setImportancia(pImportancia);
        setTexto(pTexto);
        setFechaInicio(pFechaInicio);
        setFechaVencimiento(pfechaVenc);
    }


    //getters y setters

    public int getImportancia() {
        return importancia;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public String getTexto() {
        return texto;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }


    public String getFechaDeVencimientoFormateado()///me muestra la fecha con el vencimiento nuevo
    {
        SimpleDateFormat fechita = new SimpleDateFormat("dd/MM/yyyy"); // le da el formato a la fecha
        return fechita.format(FechaVencimiento.getTime());
    }
    public String getFechaInicioFormateado() {
        SimpleDateFormat fechita = new SimpleDateFormat("dd/MM/yyyy"); // le da el formato a la fecha
        return fechita.format(fechaInicio.getTime());
    }

    private Calendar getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setImportancia(int pImportancia) {
        this.importancia = pImportancia;
    }

    public void setFechaInicio(Calendar pFechaInicio) {
        this.fechaInicio = pFechaInicio;
    }

    public void setFechaVencimiento(Calendar pFechaVenc) { this.FechaVencimiento = pFechaVenc; }

    public void setTexto(String pTexto) {
        this.texto = pTexto;
    }

    public void setVencimiento(int pVencimiento) {
        this.vencimiento = pVencimiento;
    }

    //metodos

    public Calendar calcularFechaDeVencimiento(Calendar fechaDeVencimiento)
    {
        fechaDeVencimiento.add(Calendar.DATE,this.getVencimiento());//se le suma a la fecha de inicio, los dias que tiene el usuario (osea se calcula la fecha de vencimiento)

        return fechaDeVencimiento;

    }



}

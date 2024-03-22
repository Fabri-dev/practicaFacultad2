package Modelo;

import com.sun.source.tree.BreakTree;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tarea {
    //atributos
    private int importancia; // 1 al 3, 1 mas importante
    private String texto;

    private Calendar fechaInicio;
    private Calendar fechaVenc;
    private int vencimiento; //en dias


    //constructores
    public Tarea() {
        setFechaInicio(Calendar.getInstance());
        setFechaVenc(Calendar.getInstance());
        setImportancia(0);
        setVencimiento(0);
        setTexto("Sin texto");
    }

    public Tarea(Calendar pfechaVenc, Calendar pFechaInicio, int pVencimiento, int pImportancia, String pTexto) {
        setVencimiento(pVencimiento);
        setImportancia(pImportancia);
        setTexto(pTexto);
        setFechaInicio(pFechaInicio);
        setFechaVenc(pfechaVenc);
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

    private Calendar getFechaVenc() {
        return fechaVenc;
    }

    public void setImportancia(int pImportancia) {
        this.importancia = pImportancia;
    }

    public void setFechaInicio(Calendar pFechaInicio) {
        this.fechaInicio = pFechaInicio;
    }

    public void setFechaVenc(Calendar pFechaVenc) {
        this.fechaVenc = pFechaVenc;
    }

    public void setTexto(String pTexto) {
        this.texto = pTexto;
    }

    public void setVencimiento(int pVencimiento) {
        this.vencimiento = pVencimiento;
    }

    //metodos
    public String getFechaDeVencimineto()///me muestra la fecha con el vencimiento nuevo
    {
        SimpleDateFormat fechita = new SimpleDateFormat("dd/MM/yyyy"); // le da el formato a la fecha
        return fechita.format(fechaVenc.getTime());
    }


}

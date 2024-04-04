package Modelo;

import java.util.ArrayList;

public class Concesionario {

    //atributos

    private String nombre;
    private ArrayList <Coche> cochesDisponibles= new ArrayList<>();
    int contadorId=0;

    //constructores
    public Concesionario()
    {
        setNombre("Concesionario Sin nombre");
    }

    public Concesionario(String pNombre)
    {
        setNombre(pNombre);
    }

    //setters y getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCochesDisponibles(ArrayList<Coche> cochesDisponibles) {
        this.cochesDisponibles = cochesDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Coche> getCochesDisponibles() {
        return cochesDisponibles;
    }

    public int getContadorId() {
        return contadorId;
    }

    //metodos

    public String agregarCoche(Coche pCoche)
    {
        pCoche.setId(contadorId);
        this.contadorId++;
        cochesDisponibles.add(pCoche);

        return "Coche agregado con exito! Tienes un total de "+this.cochesDisponibles.size()+"coches";
    }

    public String eliminarCoche(int idBuscar)
    {
        String texto="Coche no existe";
        for(int i=0; i < cochesDisponibles.size(); i++)
        {
            if (cochesDisponibles.get(i).getId() == idBuscar)
            {
                cochesDisponibles.remove(i);
                texto="Coche eliminado con exito";
            }
        }
        return texto;

    }


}

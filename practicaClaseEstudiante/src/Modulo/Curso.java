package Modulo;

public class Curso {
    //atributos
    private String nombreCurso;
    private Estudiante[] estudianteDelCurso;
    private int cantEstudiantes=0;
    //constructores
    public Curso() {
        setNombreCurso("");
        estudianteDelCurso = new Estudiante[5];
        cantEstudiantes=0;
    }

    public Curso(String pCurso, Estudiante[] estudiantes) {
        nombreCurso = pCurso;
        estudianteDelCurso = estudiantes;
        cantEstudiantes=0;
    }

    //getters y setters


    public int getCantEstudiantes() {
        return cantEstudiantes;
    }

    public Estudiante[] getEstudianteDelCurso() {
        return estudianteDelCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setEstudianteDelCurso(Estudiante[] estudianteDelCurso) {
        this.estudianteDelCurso = estudianteDelCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }

    //metodos
    /*

    obtenerPromedioGeneral(): calcula y devuelve el promedio general de calificaciones de todos los estudiantes del curso.
    imprimirEstudiantes(): muestra por pantalla la información de todos los estudiantes del curso.

     */
    public String agregarEstudiante(Estudiante pEstudiante)
    {
        String msj;
        if (cantEstudiantes < estudianteDelCurso.length)
        {
            estudianteDelCurso[cantEstudiantes]=pEstudiante;
            msj= "Estudiante agregado con exito!";
            cantEstudiantes++;
        }
        else
        {
            msj="Error, Curso lleno";
        }
        return msj;
    }

    public double obtenerPromedioGeneral()
    {
        double promedio = 0;
        for(int i = 0;i<cantEstudiantes;i++)
        {
            promedio += estudianteDelCurso[i].obtenerPromedio();
        }
        promedio = promedio/cantEstudiantes;
        return promedio;
    }

    public String mostrarInfo()
    {
        String rta="";
        for (int i=0; i< cantEstudiantes; i++)
        {

            rta+= estudianteDelCurso[i].imprimirInformacion();

        }
        return rta;
    }
}

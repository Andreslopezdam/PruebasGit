package ejercicio2;

import java.util.LinkedList;

public class Curso {
    private String nombreCurso;
    private CentroEducativo centroEducativo;
    private LinkedList<Estudiante> estudiantes;

    public Curso() {
    }

    public Curso(String nombreCurso, CentroEducativo centroEducativo) {
        this.nombreCurso = nombreCurso;
        this.centroEducativo = centroEducativo;
        this.estudiantes = new LinkedList<>();
    }

    public void agregarEstudiantes(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public CentroEducativo getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(CentroEducativo centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", centroEducativo=" + centroEducativo +
                ", estudiantes=" + estudiantes +
                '}';
    }
}

package ejercicio2;

import java.util.ArrayList;
import java.util.Set;

public class Curso {
    private String nombreCurso;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private CentroEducativo centroEducativo;

    public Curso() {
    }

    public Curso(String nombreCurso, CentroEducativo centroEducativo) {
        this.nombreCurso = nombreCurso;
        this.centroEducativo = centroEducativo;
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

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", estudiantes=" + estudiantes +
                ", centroEducativo=" + centroEducativo +
                '}';
    }
}

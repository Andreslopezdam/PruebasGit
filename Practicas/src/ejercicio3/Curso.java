package ejercicio3;

import utilidades.Formateo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Estudiante> estudiantes;
    private CentroEducativo centro;
    private String nombre;

    public Curso() {
    }

    public Curso( CentroEducativo centro, String nombre) {
        this.estudiantes = new ArrayList<>();
        this.centro = centro;
        this.nombre = Formateo.nameFormateo(nombre);
    }

    public void asignarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public CentroEducativo getCentro() {
        return centro;
    }

    public void setCentro(CentroEducativo centro) {
        this.centro = centro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "estudiantes=" + estudiantes +
                ", centro=" + centro +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

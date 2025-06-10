package ejercicio2;

import java.util.List;

public class Curso {
    private List<Estudiantes> estudiantes;
    private CentroEducativo centro;

    public Curso() {
    }

    public Curso(List<Estudiantes> estudiantes, CentroEducativo centro) {
        this.estudiantes = estudiantes;
        this.centro = centro;
    }

    public void agregarEstudiante(Estudiantes estudiante){
        estudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "estudiantes=" + estudiantes +
                ", centro=" + centro +
                '}';
    }
}

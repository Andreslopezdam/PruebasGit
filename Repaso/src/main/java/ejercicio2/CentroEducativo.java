package ejercicio2;

import java.util.HashMap;

public class CentroEducativo {
    private String nombre;
    private HashMap<String,Curso> cursos;

    public CentroEducativo() {
    }

    public CentroEducativo(String nombre) {
        this.nombre = nombre;
        this.cursos = new HashMap<>();
    }

    public void agregarCurso(String nombreCusos,Curso curso) {
        cursos.put(nombreCusos,new Curso());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Curso> getCursos() {
        return cursos;
    }

    public void setCursos(HashMap<String, Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "nombre='" + nombre + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}

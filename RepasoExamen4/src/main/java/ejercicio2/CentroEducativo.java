package ejercicio2;

import java.util.Map;

public class CentroEducativo extends EdificioPublico{
    private String nombre;
    private Map<String,Curso> cursos;

    public CentroEducativo() {
    }

    public CentroEducativo(String id, String nombre, String direccion, int fundacion, String nombre1, Map<String, Curso> cursos) {
        super(id, nombre, direccion, fundacion);
        this.nombre = nombre1;
        this.cursos = cursos;
    }

    public void agregarCurso(String nombreCurso){
        cursos.put(nombreCurso,new Curso());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Map<String, Curso> cursos) {
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

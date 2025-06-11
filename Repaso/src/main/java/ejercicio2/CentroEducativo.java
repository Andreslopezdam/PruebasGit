package ejercicio2;

import java.util.HashMap;

public class CentroEducativo {
    private String nombreCentro;
    private HashMap<String,Curso> cursos = new HashMap<>();

    public CentroEducativo() {
    }

    public CentroEducativo(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public void agregarCurso(String nombreCentro, Curso Curso){
        cursos.put(nombreCentro,Curso);
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public HashMap<String, Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "nombreCentro='" + nombreCentro + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}

package ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class CentroEducativo {
    private String nombreCentro;
    private Map<String,Curso> cursos;

    public CentroEducativo() {
    }

    public CentroEducativo(String nombreCentro) {
        this.nombreCentro = nombreCentro;
        this.cursos = new HashMap<>();
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


    @Override
    public String toString() {
        return "CentroEducativo{" +
                "nombreCentro='" + nombreCentro + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}

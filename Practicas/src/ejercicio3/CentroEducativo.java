package ejercicio3;

import utilidades.Formateo;

import java.util.HashMap;
import java.util.Map;

public class CentroEducativo {
    private String nombre;
    private Map<String,Curso> centro;

    public CentroEducativo() {
    }

    public CentroEducativo(String nombre) {
        this.nombre = Formateo.nameFormateo(nombre);
        this.centro = new HashMap<>();
    }

    public void asignarCentro(String nombre,Curso curso) {
        centro.put(nombre,curso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Curso> getCentro() {
        return centro;
    }

    public void setCentro(Map<String, Curso> centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "CentroEducativo{" +
                "nombre='" + nombre + '\'' +
                ", centro=" + centro +
                '}';
    }
}

package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Conselleria {
    private String nombre;
    private Persona responsable;
    private double presupuesto;
    private List<EdificioPublico> edificios = new ArrayList<>();

    public Conselleria() {
    }

    public Conselleria(String nombre, Persona responsable, double presupuesto, List<EdificioPublico> edificios) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.presupuesto = presupuesto;
        this.edificios = new ArrayList<>();
    }

    public void agregarEdificio(EdificioPublico edificioPublico) {
        edificios.add(edificioPublico);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<EdificioPublico> getEdificios() {
        return edificios;
    }

    public void setEdificios(List<EdificioPublico> edificios) {
        this.edificios = edificios;
    }

    @Override
    public String toString() {
        return "Conselleria{" +
                "nombre='" + nombre + '\'' +
                ", responsable=" + responsable +
                ", presupuesto=" + presupuesto +
                ", edificios=" + edificios +
                '}';
    }
}

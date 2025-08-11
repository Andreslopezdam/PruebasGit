package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Conselleria {
    private String nombreConselleria;
    private Persona represetante;
    private Integer presupuesto;
    private List<EdificioPublico> edificios;

    public Conselleria() {
    }

    public Conselleria(String nombreConselleria, Persona represetante, Integer presupuesto) {
        this.nombreConselleria = nombreConselleria;
        this.represetante = represetante;
        this.presupuesto = presupuesto;
        this.edificios = new ArrayList<>();
    }

    public void agregarEdificio(EdificioPublico edificioPublico){
        edificios.add(edificioPublico);
    }

    public String getNombreConselleria() {
        return nombreConselleria;
    }

    public void setNombreConselleria(String nombreConselleria) {
        this.nombreConselleria = nombreConselleria;
    }

    public Persona getRepresetante() {
        return represetante;
    }

    public void setRepresetante(Persona represetante) {
        this.represetante = represetante;
    }

    public Integer getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Integer presupuesto) {
        this.presupuesto = presupuesto;
    }


    @Override
    public String toString() {
        return "Conselleria{" +
                "nombreConselleria='" + nombreConselleria + '\'' +
                ", represetante=" + represetante +
                ", presupuesto=" + presupuesto +
                ", edificios=" + edificios +
                '}';
    }
}

package ejercicio2;

import java.util.ArrayList;

public class Conselleria {
    private String nombreConselleria;
    private Persona represetante;
    private Integer presupuesto;
    private ArrayList<EdificioPublico> edificios = new ArrayList<>();

    public Conselleria() {
    }

    public Conselleria(String nombreConselleria, Persona represetante, Integer presupuesto) {
        this.nombreConselleria = nombreConselleria;
        this.represetante = represetante;
        this.presupuesto = presupuesto;
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

    public ArrayList<EdificioPublico> getEdificios() {
        return edificios;
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

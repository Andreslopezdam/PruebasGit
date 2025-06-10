package Ejercicio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Autobus {
    private String matricula;
    private Integer capacidad;
    private String modelo;
    private List<Conductores> conductores;

    public Autobus() {
    }

    public Autobus(String matricula, Integer capacidad, String modelo) {
        this.matricula = matricula;
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.conductores = new ArrayList<>();
    }

    public void agregarConductor(Conductores coductor) {
        conductores.add(coductor);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Conductores> getConductores() {
        return conductores;
    }

    public void setConductores(List<Conductores> conductores) {
        this.conductores = conductores;
    }
}

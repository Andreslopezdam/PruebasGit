package Ejercicio2;

import Enumerados.Color;
import Enumerados.PuestoTrabajo;

import java.time.LocalDate;

public class Personal extends Persona{
 private PuestoTrabajo puestoTrabajo;


    public Personal() {
    }

    public Personal(String nombre, String apellido, String dni, Color colorOjos, LocalDate nacimiento, PuestoTrabajo puestoTrabajo) {
        super(nombre, apellido, dni, colorOjos, nacimiento);
        this.puestoTrabajo = puestoTrabajo;
    }

    public PuestoTrabajo getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(PuestoTrabajo puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "puestoTrabajo=" + puestoTrabajo +
                "} " + super.toString();
    }
}

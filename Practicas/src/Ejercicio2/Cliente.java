package Ejercicio2;

import Enumerados.Color;

import java.time.LocalDate;

public class Cliente extends Persona{
    private Personal personal;
    private Centro centro;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String dni, Color colorOjos, LocalDate nacimiento, Personal personal, Centro centro) {
        super(nombre, apellido, dni, colorOjos, nacimiento);
        this.personal = personal;
        this.centro = centro;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Centro getCentro() {
        return centro;
    }

    public void setCentro(Centro centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "personal=" + personal +
                ", centro=" + centro +
                "} " + super.toString();
    }
}

package Ejercicio2;

import Enumerados.Color;

import java.time.LocalDate;
import java.util.Date;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected Color colorOjos;
    protected LocalDate nacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, Color colorOjos, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.colorOjos = colorOjos;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Color getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(Color colorOjos) {
        this.colorOjos = colorOjos;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", colorOjos=" + colorOjos +
                ", nacimiento=" + nacimiento +
                '}';
    }
}

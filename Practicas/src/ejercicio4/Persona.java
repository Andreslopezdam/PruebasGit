package ejercicio4;

import utilidades.Formateo;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = Formateo.nameFormateo(nombre);
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad(fechaNacimiento);
    }

    private int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(LocalDate.now(),fechaNacimiento).getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                '}';
    }
}

package ejercicio2;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    protected String nombre;
    protected int edad;
    protected LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = calcularEdad(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
    }

    private int calcularEdad(LocalDate fechaNacimiento){
        return Period.between(fechaNacimiento,LocalDate.now()).getYears();
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
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}

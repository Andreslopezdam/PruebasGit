package ejercicio2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Persona {
    protected String nombreCompleto;
    protected int edad;
    protected LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombreCompleto, String fechaNacimiento) {
        this.nombreCompleto = nombreCompleto;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
        this.edad = calcularEdad();
    }

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}

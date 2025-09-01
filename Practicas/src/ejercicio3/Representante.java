package ejercicio3;

import java.time.LocalDate;

public class Representante extends Persona{
    public Representante() {
    }

    public Representante(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Representante{} " + super.toString();
    }
}

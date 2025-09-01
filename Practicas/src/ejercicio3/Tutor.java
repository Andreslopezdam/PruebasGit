package ejercicio3;

import java.time.LocalDate;

public class Tutor extends Persona{
    public Tutor() {
    }

    public Tutor(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Tutor{} " + super.toString();
    }
}

package ejercicio4;

import java.time.LocalDate;

public class Lector extends Persona{
    private TipoLector tipoLector;
    private static int contadorId = 1;
    private String id;

    public Lector() {
    }

    public Lector(String nombre, LocalDate fechaNacimiento, TipoLector tipoLector) {
        super(nombre, fechaNacimiento);
        this.tipoLector = tipoLector;
        this.id = "L" + contadorId++;
    }

    public TipoLector getTipoLector() {
        return tipoLector;
    }

    public void setTipoLector(TipoLector tipoLector) {
        this.tipoLector = tipoLector;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Lector{" +
                "tipoLector=" + tipoLector +
                ", id='" + id + '\'' +
                "} " + super.toString();
    }
}

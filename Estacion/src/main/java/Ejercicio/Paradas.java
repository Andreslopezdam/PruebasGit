package Ejercicio;

import java.time.LocalDateTime;

public class Paradas {
    private String nombre;
    private LocalDateTime hora;

    public Paradas() {
    }

    public Paradas(String nombre, LocalDateTime hora) {
        this.nombre = nombre;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Paradas{" +
                "nombre='" + nombre + '\'' +
                ", hora=" + hora +
                '}';
    }
}

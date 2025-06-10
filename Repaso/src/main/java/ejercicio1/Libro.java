package ejercicio1;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private LocalDate edicion;

    public Libro() {
    }

    public Libro(String titulo, LocalDate edicion) {
        this.titulo = titulo;
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getEdicion() {
        return edicion;
    }

    public void setEdicion(LocalDate edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", edicion=" + edicion +
                '}';
    }
}

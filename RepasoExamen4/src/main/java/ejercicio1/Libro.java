package ejercicio1;

import java.time.LocalDateTime;

public class Libro {
    private String titulo;
    private LocalDateTime edicion;

    public Libro() {
    }

    public Libro(String titulo, LocalDateTime edicion) {
        this.titulo = titulo;
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getEdicion() {
        return edicion;
    }

    public void setEdicion(LocalDateTime edicion) {
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

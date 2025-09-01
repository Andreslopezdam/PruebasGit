package ejercicio4;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Lector lector;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionEsperada;

    public Prestamo() {
    }

    public Prestamo(Libro libro, Lector lector,int diasPrestamo) {
        this.libro = libro;
        this.lector = lector;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucionEsperada = fechaPrestamo.plusDays(diasPrestamo);
    }

    public boolean estaVEncido() {
        return LocalDate.now().isAfter(fechaDevolucionEsperada);
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucionEsperada() {
        return fechaDevolucionEsperada;
    }

    public void setFechaDevolucionEsperada(LocalDate fechaDevolucionEsperada) {
        this.fechaDevolucionEsperada = fechaDevolucionEsperada;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", lector=" + lector +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucionEsperada=" + fechaDevolucionEsperada +
                '}';
    }
}

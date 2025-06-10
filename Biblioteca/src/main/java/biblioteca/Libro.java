package biblioteca;

public class Libro implements Comparable<Libro> {
    private Editorial editorial;
    private String titulo;
    private int precio;

    public Libro() {
    }
    public Libro(Editorial editorial, String titulo) {
        this.editorial = editorial;
        this.titulo = titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "editorial=" + editorial +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int compareTo(Libro o) {
        return this.getTitulo().compareTo(o.getTitulo());

    }
}

package tienda;

public class Videojuego implements Comparable<Videojuego> {
    private Plataforma plataforma;
    private String titulo;
    private Integer precio;

    public Videojuego() {
    }

    public Videojuego(Plataforma plataforma, String titulo, Integer precio) {
        this.plataforma = plataforma;
        this.titulo = titulo;
        this.precio = precio;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "plataforma=" + plataforma +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int compareTo(Videojuego o) {
        return this.titulo.compareTo(o.titulo);
    }
}

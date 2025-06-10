package tienda;

public class Plataforma {
    private String nombre;

    public Plataforma(String nombre) {
        this.nombre = nombre;
    }

    public Plataforma() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

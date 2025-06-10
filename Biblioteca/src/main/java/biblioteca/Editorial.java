package biblioteca;

public class Editorial {
    private String nombre;

    public Editorial() {
    }
    public Editorial(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

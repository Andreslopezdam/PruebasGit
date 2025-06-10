package Ejercicio;

public class Conductores {
    private String nombre;
    private String identificador;
    private Integer telefeno;

    public Conductores() {
    }

    public Conductores(String nombre, String identificador, Integer telefeno) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.telefeno = telefeno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Integer getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(Integer telefeno) {
        this.telefeno = telefeno;
    }

    @Override
    public String toString() {
        return "Conductores{" +
                "nombre='" + nombre + '\'' +
                ", identificador='" + identificador + '\'' +
                ", telefeno=" + telefeno +
                '}';
    }
}

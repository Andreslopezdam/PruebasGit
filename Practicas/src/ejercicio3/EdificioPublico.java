package ejercicio3;

import utilidades.Formateo;

import java.time.LocalDate;

public class EdificioPublico {
    private static int contadorId = 1;
    private String id;
    private String nombre;
    private String direccion;
    private LocalDate fundacion;

    public EdificioPublico() {
    }

    public EdificioPublico(String nombre, String direccion, LocalDate fundacion) {
        this.id = "EDIF" + contadorId++;
        this.nombre = Formateo.nameFormateo(nombre);
        this.direccion = direccion;
        this.fundacion = fundacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFundacion() {
        return fundacion;
    }

    public void setFundacion(LocalDate fundacion) {
        this.fundacion = fundacion;
    }

    @Override
    public String toString() {
        return "EdificioPublico{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fundacion=" + fundacion +
                '}';
    }
}

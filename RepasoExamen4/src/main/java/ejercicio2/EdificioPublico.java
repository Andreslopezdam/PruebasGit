package ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class EdificioPublico {
    private  Set<String> codigosUsados = new HashSet<>();
    private String id;
    private String nombre;
    private String direccion;
    private int fundacion;

    public EdificioPublico() {
    }

    public EdificioPublico(String id, String nombre, String direccion, int fundacion) {
        this.id = id;
        codigosUsados.add(id);
        this.nombre = nombre;
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

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }


    @Override
    public String toString() {
        return "EdificioPublico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fundacion=" + fundacion +
                '}';
    }
}

package ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class EdificioPublico {
    private static int contadorId = 1;
    private String id;
    private String nombreEdificio;
    private String direccion;
    private String fundacion;

    public EdificioPublico() {
    }

    public EdificioPublico(String id, String nombreEdificio, String direccion, String fundacion) {
        this.id = "EDIF" + contadorId++;
        this.nombreEdificio = nombreEdificio;
        this.direccion = direccion;
        this.fundacion = fundacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    @Override
    public String toString() {
        return "EdificioPublico{" +
                ", id='" + id + '\'' +
                ", nombreEdificio='" + nombreEdificio + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fundacion='" + fundacion + '\'' +
                '}';
    }
}

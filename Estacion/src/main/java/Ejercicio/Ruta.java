package Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private String id;
    private String nombre;
    private List<String> recorrido;
    private List<Autobus> autobuses;

    public Ruta() {
    }

    public Ruta(String id, String nombre, List<String> recorrido) {
        this.id = id;
        this.nombre = nombre;
        this.recorrido = recorrido;
        this.autobuses = new ArrayList<>();
    }

    public void agregarAutobus(Autobus autobus) {
        autobuses.add(autobus);
    }

    public void listarAutobuse() {
        for (Autobus a : autobuses){
            System.out.println(a);
        }
    }

    public int calcularPasa() {
        int total = 0;
        for (Autobus a: autobuses){
            total += a.getCapacidad() * 5;
        }
        return total;
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

    public List<String> getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(List<String> recorrido) {
        this.recorrido = recorrido;
    }

    public List<Autobus> getAutobuses() {
        return autobuses;
    }

    public void setAutobuses(List<Autobus> autobuses) {
        this.autobuses = autobuses;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", recorrido=" + recorrido +
                ", autobuses=" + autobuses +
                '}';
    }
}

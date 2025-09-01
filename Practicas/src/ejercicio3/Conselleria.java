package ejercicio3;

import utilidades.Formateo;

import java.util.ArrayList;
import java.util.List;

public class Conselleria {
    private String nombre;
    private Integer presupuesto;
    private List<EdificioPublico> edificioPublicos;
    private Representante representante;

    public Conselleria() {
    }

    public Conselleria(String nombre, Integer presupuesto, Representante representante) {
        this.nombre = Formateo.nameFormateo(nombre);
        this.presupuesto = presupuesto;
        this.edificioPublicos = new ArrayList<>();
        this.representante = representante;
    }

    public void agregarEdificio(EdificioPublico edificioPublico) throws Exception{
        try {
            edificioPublicos.add(edificioPublico);
        } catch (Exception e) {
            throw new Exception("No se pudo agregar el Edificio");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Integer presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<EdificioPublico> getEdificioPublicos() {
        return edificioPublicos;
    }

    public void setEdificioPublicos(List<EdificioPublico> edificioPublicos) {
        this.edificioPublicos = edificioPublicos;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Conselleria{" +
                "nombre='" + nombre + '\'' +
                ", presupuesto=" + presupuesto +
                ", edificioPublicos=" + edificioPublicos +
                ", representante=" + representante +
                '}';
    }
}

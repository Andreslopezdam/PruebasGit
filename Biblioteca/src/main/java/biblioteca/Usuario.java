package biblioteca;

import java.util.ArrayList;
import java.util.LinkedList;

public class Usuario extends Persona{
    private Integer credito;
    private ArrayList<Libro> libros = new ArrayList<>();
    private LinkedList<String> historialTransacciones = new LinkedList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni, int credito) {
        super(nombre, apellido, dni);
        this.credito = credito;
    }

    public void  insertarLibros(Libro libro){
        libros.add(libro);
    }

    public void insertarTransaciones(String factura, int importe){
        historialTransacciones.add(factura);
        this.credito-=importe;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public LinkedList<String> getHistorialTransacciones() {
        return historialTransacciones;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "credito=" + credito +
                ", libros=" + libros +
                ", historialTransacciones=" + historialTransacciones +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}

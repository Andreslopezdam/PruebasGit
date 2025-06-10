package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private HashSet<Usuario> usuarios = new HashSet<>();
    private HashMap<Libro, Integer> librosDisponibles = new HashMap<>();
    private HashMap<Usuario, List<String>> transacciones = new HashMap<>();
    private ArrayList<String> historialPagos = new ArrayList<>();

    public Biblioteca() {
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void insertarLibroDisponible(Libro libro, Integer precio) {
        librosDisponibles.put(libro, precio);
    }

    public void comprarLibro(Libro libro, Integer importe, Usuario usuario) throws Exception {
        if (librosDisponibles.containsKey(libro)){
            if (librosDisponibles.get(libro).equals(importe)){
                usuarios.add(usuario);
                String linea = "Libro: " + libro.getTitulo() + " por " + importe + "€" + " el " + LocalDate.now();
                historialPagos.add(linea);
                transacciones.put(usuario,historialPagos);
                librosDisponibles.remove(libro);
                usuario.insertarLibros(libro);
                String factura = "-" + importe + "€" + " el " + LocalDate.now();
                usuario.insertarTransaciones(factura,importe);
            }else {
                throw  new Exception("El importe es erroneo! Introduce el importe EXACTO para comprar el libro");
            }
        }else {
            throw new Exception("No tenemos ese libro!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public HashMap<Libro, Integer> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public HashMap<Usuario, List<String>> getTransacciones() {
        return transacciones;
    }

    public ArrayList<String> getHistorialPagos() {
        return historialPagos;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", usuarios=" + usuarios +
                ", librosDisponibles=" + librosDisponibles +
                ", transacciones=" + transacciones +
                ", historialPagos=" + historialPagos +
                '}';
    }
}

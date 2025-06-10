package concesionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Concesionario implements Imprimir {
    private String nombre;
    private HashSet<Cliente> clientes = new HashSet<>();
    private HashMap<Coche, Integer> cochesDiponibles = new HashMap<>();
    private HashMap<Cliente, List<String>> transacciones = new HashMap<>();
    private ArrayList<String> historialPagos = new ArrayList<>();

    public Concesionario() {
    }


    public Concesionario(String nombre) {
        this.nombre = nombre;
    }

    public void insertarCocheDisponible(Coche coche, Integer precio) {
        cochesDiponibles.put(coche, precio);
    }

    public void comprarCoche(Coche coche, Integer importe, Cliente cliente) throws Exception {
        if (cochesDiponibles.containsKey(coche)) {
            if (cochesDiponibles.get(coche).equals(importe)) {
                clientes.add(cliente);
                String linea = "Coche: " + coche.getMarca().getNombre() + " " + coche.getModelo() + " por " + importe + "€ " + "el " + LocalDate.now();
                historialPagos.add(linea);
                transacciones.put(cliente, historialPagos);
                cochesDiponibles.remove(coche);
                cliente.insertarCoche(coche);
                String linea2 = "-" + importe + "€ " + "el " + LocalDate.now();
                cliente.insertarPago(linea2, importe);
            } else {
                throw new Exception("El importe es erroneo! Introduce el importe EXACTO para comprar el coche");
            }
        } else {
            throw new Exception("No tenemos ese coche!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public HashMap<Coche, Integer> getCochesDiponibles() {
        return cochesDiponibles;
    }

    public HashMap<Cliente, List<String>> getTransacciones() {
        return transacciones;
    }

    public ArrayList<String> getHistorialPagos() {
        return historialPagos;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "nombre='" + nombre + '\'' +
                ", clientes=" + clientes +
                ", cochesDiponibles=" + cochesDiponibles +
                ", transacciones=" + transacciones +
                ", historialPagos=" + historialPagos +
                '}';
    }


    @Override
    public void imprimirHistorial() {
        System.out.println("HISTORIAL DE COMPRAS:");
        for (String value : historialPagos) {
            System.out.println(value);
        }
        System.out.println();
    }


}

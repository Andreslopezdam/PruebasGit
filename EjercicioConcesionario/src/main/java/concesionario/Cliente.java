package concesionario;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cliente extends Persona implements Imprimir {
    private int saldo;
    private ArrayList<Coche> coches = new ArrayList<>();
    private LinkedList<String> historialPagos = new LinkedList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String dni, int saldo) {
        super(nombre, apellido, dni);
        this.saldo = saldo;
    }

    public void insertarCoche(Coche coche){
        coches.add(coche);
    }
    public void insertarPago(String lista,Integer importe){
        historialPagos.addFirst(lista);
        this.saldo-=importe;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public LinkedList<String> getHistorialPagos() {
        return historialPagos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "saldo=" + saldo +
                ", coches=" + coches +
                ", historialPagos=" + historialPagos +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public void imprimirHistorial() {
        System.out.println("HISTORIAL DE COMPRAS:");
        for (String value : historialPagos){
            System.out.println(value);
        }
        System.out.println();
    }
}

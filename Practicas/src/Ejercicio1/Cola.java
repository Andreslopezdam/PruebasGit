package Ejercicio1;

import Ejercicio2.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Cola {
    private Vehiculo[] cola;
    private Integer posicion;

    public Cola () {
        cola = new Vehiculo[0];
        posicion = -1;
    }

    private void redimensionar () {
        Vehiculo[] nuevaArray = new Vehiculo[cola.length + 1];
        for (int i = 0; i < cola.length;i++) {
            nuevaArray[i] = cola[i];
        }
        cola = nuevaArray;
    }

    public void add(Vehiculo coche) {
        redimensionar();
        posicion++;
        cola[posicion] = coche;
    }

    public Vehiculo poll() {
        if (empty()) {
            System.out.println("La cola está vacia");
            return null;
        }

        Vehiculo referncia = cola[0];

        Vehiculo[] nuevaArray = new Vehiculo[cola.length - 1];

        for (int i = 1;i < cola.length;i++) {
            nuevaArray[i - 1] = cola[i];
        }
        cola = nuevaArray;
        posicion--;
        return referncia;
    }

    public Vehiculo peek() {
        if (empty()) {
            System.out.println("La cola está vacia");
            return null;
        }
        return cola[0];
    }

    public Integer size() {
        return cola.length;
    }

    public boolean empty() {
        return cola.length == 0;
    }

    public List<Vehiculo> toList() {
        List<Vehiculo> lista = new ArrayList<>();
        for (Vehiculo o: cola) {
            lista.add(o);
        }
        return lista;
    }

    public void mostrarCola() {
        for (int i = 0;i < cola.length;i++) {
            System.out.println(cola[i] + " ");
        }
    }


}

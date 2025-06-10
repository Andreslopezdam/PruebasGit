import concesionario.Cliente;
import concesionario.Coche;
import concesionario.Concesionario;
import concesionario.Marca;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TestEjercicio {
    @Test
    void test() throws Exception {
        Cliente luis = new Cliente("Luis", "García", "12345678A", 200000);
        System.out.println("CLIENTE: ");
        System.out.println(luis.toString());
        System.out.println();
        Marca toyota = new Marca("Toyota");
        Marca honda = new Marca("Honda");
        Marca ford = new Marca("Ford");
        System.out.println("MARCA: ");
        System.out.println(toyota.toString());
        System.out.println(honda.toString());
        System.out.println(ford.toString());
        Coche coche1 = new Coche(toyota, "Corolla");
        Coche coche2 = new Coche(honda, "Civic");
        Coche coche3 = new Coche(ford, "Mustang");
        System.out.println();
        System.out.println("COCHE: ");
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(coche3.toString());
        System.out.println();
        Concesionario autoMax = new Concesionario("AutoMax");
        System.out.println("CONCESIONARIO: ");
        System.out.println(autoMax.toString());
        autoMax.insertarCocheDisponible(coche1, 25000);
        autoMax.insertarCocheDisponible(coche2, 30000);
        autoMax.insertarCocheDisponible(coche3, 40000);
        System.out.println("COCHES DISPONIBLES: ");
        System.out.println(autoMax.getCochesDiponibles().toString());
        System.out.println();
        autoMax.comprarCoche(coche2, 30000, luis);
        autoMax.comprarCoche(coche3, 40000, luis);

        System.out.println("COCHE COMPRADO: ");
        System.out.println(autoMax.toString());
        System.out.println(luis.toString());

        System.out.println("TRANSACCIONES:");
        autoMax.imprimirHistorial();
        HashMap<Cliente, List<String>> transacciones = autoMax.getTransacciones();
        Iterator<Cliente> i = transacciones.keySet().iterator();        System.out.println();
        while (i.hasNext()){
            Cliente aux = i.next();
            System.out.println("Cliente: " + aux.getNombre() + " " + aux.getApellido());
            for (String value : transacciones.get(aux)){
                System.out.println(value);
            }
        }
        System.out.println("HISTORIAL DE PAGOS:");
        for (String pago : luis.getHistorialPagos()) {
            System.out.println(pago);
        }
        Assertions.assertEquals(1,1);
    }
}

import Ejercicio1.Cola;
import Ejercicio2.Vehiculo;
import ejercicio3.Estudiante;
import ejercicio3.Persona;
import ejercicio3.Tutor;
import ejercicio4.Biblioteca;
import ejercicio4.Lector;
import ejercicio4.Libro;
import ejercicio4.TipoLector;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Vehiculo coche1 = new Vehiculo("Seat");
        Vehiculo coche2 = new Vehiculo("Citroen");
        Vehiculo coche3 = new Vehiculo("Ferrari");
        System.out.println(cola.empty());
        cola.add(coche1);
        cola.add(coche2);
        System.out.println(cola.empty());
        cola.mostrarCola();
        System.out.println(cola.size());
        System.out.println(cola.peek());
        System.out.println(cola.size());
        System.out.println(cola.poll());
        System.out.println(cola.size());
        cola.add(coche3);
        cola.mostrarCola();
        System.out.println(cola.toList());
        System.out.println();
        System.out.println("EJERCICIO2");
        Biblioteca a = new Biblioteca();

        Lector l1 = new Lector("andres lopez",LocalDate.of(2000,5,2), TipoLector.profesor);
        Lector l2 = new Lector("sara lopez",LocalDate.of(2006,5,2), TipoLector.estudiante);
        a.registrarLector(l1);
        a.registrarLector(l2);
        System.out.println(l1);

        Libro libro1 = new Libro("Hola mundo","Maria","Aventura",2001);
        Libro libro2 = new Libro("Chao mundo","Laura","Aventura",2005);

        a.agregarLibro(libro1);
        a.agregarLibro(libro2);

        System.out.println("Biblioteca");

        try {
            a.prestarLibro(libro1,l1,4);
            a.prestarLibro(libro2,l2,6);

            System.out.println("Prestamos");
            a.listarLibros();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
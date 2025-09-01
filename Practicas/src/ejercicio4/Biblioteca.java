package ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private List<Libro> libros;
    private List<Lector> lectores;
    private Map<Lector,List<Prestamo>> prestamos;



    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.lectores = new ArrayList<>();
        this.prestamos = new HashMap<>();
    }

    public void listarLibros() {
        for (Libro l: libros) {
            System.out.println(l);
        }
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void registrarLector(Lector lector) {
        lectores.add(lector);
    }

    public void prestarLibro(Libro libro,Lector lector, int dia) throws Exception{
        if (!libro.isDisponible()) {
            throw new Exception("El libro no está disponible");
        }
        libro.prestar();
        Prestamo p = new Prestamo(libro,lector,dia);
        prestamos.put(lector,new ArrayList<>());
        prestamos.get(lector).add(p);
    }

    public void devolverLibro(Libro libro,Lector lector) throws Exception{
        libro.devolver();
        List<Prestamo> lista = prestamos.get(lector);
        if (lista == null || lista.isEmpty()) {
            throw new Exception("Este lector no tiene préstamos");
        }

    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "libros=" + libros +
                ", lectores=" + lectores +
                ", prestamos=" + prestamos +
                '}';
    }
}

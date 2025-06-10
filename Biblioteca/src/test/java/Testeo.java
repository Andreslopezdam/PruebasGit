import biblioteca.Biblioteca;
import biblioteca.Editorial;
import biblioteca.Libro;
import biblioteca.Usuario;
import org.junit.jupiter.api.Test;

public class Testeo {
    @Test
    void test() throws Exception{
        Usuario ana = new Usuario("Ana","López","12345678A",150);
        System.out.println("USUARIO: ");
        System.out.println(ana.toString());
        System.out.println();
        Editorial planeta = new Editorial("Planeta");
        Editorial anaya = new Editorial("Anaya");
        Editorial sm = new Editorial("SM");
        System.out.println("EDITORIAL: ");
        System.out.println(planeta.toString());
        System.out.println(anaya.toString());
        System.out.println(sm.toString());
        System.out.println();
        Libro libro1 = new Libro(planeta,"El Quijote");
        Libro libro2 = new Libro(anaya,"El Principito");
        Libro libro3 = new Libro(sm,"Cien años de soledad");
        System.out.println("LIBRO: ");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println();
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");
        biblioteca.insertarLibroDisponible(libro1,30);
        biblioteca.insertarLibroDisponible(libro2,60);
        biblioteca.insertarLibroDisponible(libro3,80);
        System.out.println("LIBROS DISPONIBLES: ");
        System.out.println(biblioteca.getLibrosDisponibles().toString());
        System.out.println();
        biblioteca.comprarLibro(libro1,30,ana);
        biblioteca.comprarLibro(libro2,60,ana);

        System.out.println("LIBRO COMPRADO: ");
        System.out.println(biblioteca.toString());
        System.out.println(ana.toString());
        System.out.println("TRANSACCIONES:");
        for (String value : biblioteca.getHistorialPagos()){
            System.out.println(value);
        }

    }
}

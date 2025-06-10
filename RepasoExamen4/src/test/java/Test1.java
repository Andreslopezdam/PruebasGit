import ejercicio1.Libro;
import ejercicio1.Pila;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class Test1 {
    @Test
    void test() throws Exception {
        Pila pila = new Pila(2);
        pila.push(new Libro("Quijote", LocalDateTime.now()));
        pila.push(new Libro("Don Quijote de la Mancha", LocalDateTime.of(2000,4,5,5,5)));
        pila.push(new Libro("DoCon Quijote de la Mancha", LocalDateTime.of(2000,4,5,5,5)));

        System.out.println(pila.peek());
        pila.mostrar();
        System.out.println(pila.pop());
        pila.mostrar();
        pila.size();
    }
}

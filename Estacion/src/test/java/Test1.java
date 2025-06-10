import Ejercicio.Autobus;
import Ejercicio.Conductores;
import Ejercicio.Paradas;
import Ejercicio.Ruta;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    @Test
    void test() throws Exception {
        Conductores c1 = new Conductores("Juan Pérez", "123A", 755);
        Conductores c2 = new Conductores("Maria ", "122A", 73);

        Autobus a1 = new Autobus("AVD333",34,"Volvo");
        Paradas primera = new Paradas("Primera", LocalDateTime.now());

        Ruta ruta1 = new Ruta("1","Ruta66", Arrays.asList("Parada A"));

        ruta1.agregarAutobus(a1);

        a1.agregarConductor(c1);

        ruta1.listarAutobuse();
        System.out.println(ruta1.toString() + " " + ruta1.calcularPasa());
        System.out.println(c1.toString());
        System.out.println(primera.toString());
    }
}

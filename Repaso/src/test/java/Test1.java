import ejercicio2.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class Test1 {
    @Test
    void test() throws Exception{
        Persona director = new Persona("ana martinez", LocalDate.of(1975, 3, 12));

        CentroEducativo centro = new CentroEducativo("IES Sanxillao");

        EdificioPublico edificioPublico = new EdificioPublico("1","Sanxillao","Fontiñas",2033);
        Conselleria conselleria = new Conselleria("Consellería Valenciana", director, 55);
        conselleria.agregarEdificio(edificioPublico);
        Curso eso = new Curso("Eso2",centro);
        centro.agregarCurso("Eso",eso);

        Estudiante e1 = new Estudiante("e1","mateo",LocalDate.of(2010,5,25),centro,eso);

        System.out.println("Estudiantes matriculados en: " + eso.getNombreCurso() + " en el centro " + centro.getNombre());
        System.out.println(e1.getNombre());

        System.out.println("Director: " + director);
        System.out.println("Conselleria: " + conselleria);
        System.out.println("Presupuesto: " + conselleria.getPresupuesto());

    }
}

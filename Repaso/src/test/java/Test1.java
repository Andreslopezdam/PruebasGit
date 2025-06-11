import ejercicio2.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class Test1 {
    @Test
    void test() throws Exception{
        Persona director = new Persona("ana martinez", LocalDate.of(1975, 3, 12));

        CentroEducativo centro = new CentroEducativo("IES Sanxillao");

        EdificioPublico edificioPublico = new EdificioPublico("1","Sanxillao","Fontiñas","2033");
        Conselleria conselleria = new Conselleria("Consellería Valenciana", director, 55);
        conselleria.agregarEdificio(edificioPublico);
        Curso eso = new Curso("Eso2",centro);
        centro.agregarCurso("Eso",eso);
        Persona tutor = new Persona("Andrés",LocalDate.of(2003,9,5));
        Estudiante e1 = new Estudiante("mateo",LocalDate.of(2010,5,25),tutor,centro,eso);

        System.out.println("Estudiantes matriculados en: " + eso.getNombreCurso() + " en el centro " + centro.getNombreCentro());
        System.out.println(e1.getNombre());

        System.out.println("Director: " + director);
        System.out.println("Conselleria: " + conselleria);
        System.out.println("Presupuesto: " + conselleria.getPresupuesto());

    }
}

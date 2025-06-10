package ejercicio2;

import java.util.Random;

public enum Casa {
    GRYFFINDOR, HUFFLEPUFF, RAVENCLAW, SLYTHERIN();

    public static Casa asignarAleatoriamente(){
        Casa[] casas = Casa.values();
        Random random = new Random();
        return casas[random.nextInt(casas.length)];
    }
}

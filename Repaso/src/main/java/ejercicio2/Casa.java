package ejercicio2;

import java.util.Random;

public enum Casa {
    Gryffindor,Hufflepuff,Ravenclaw,Slytherin;

    public static Casa asignarCasa(){
        Casa[] casas = Casa.values();
        Random random = new Random();
        return casas[random.nextInt(casas.length)];
    }
}

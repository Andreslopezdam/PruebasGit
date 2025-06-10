import org.junit.jupiter.api.Test;
import tienda.Gamer;
import tienda.Plataforma;
import tienda.Tienda;
import tienda.Videojuego;

import java.util.Iterator;
import java.util.Map;

public class Testeos {
    @Test
    void test() throws Exception{
        Gamer carlos = new Gamer("Carlos","Pérez","55667788D",100);
        System.out.println("GAMER: ");
        System.out.println(carlos.toString());
        System.out.println();
        Plataforma play = new Plataforma("Play");
        Plataforma xbox = new Plataforma("Xbox");
        Plataforma nintendo = new Plataforma("Nintendo");
        Videojuego juego1 = new Videojuego(play,"Fifa 20",50);
        Videojuego juego2 = new Videojuego(xbox,"Call of Duty",60);
        Videojuego juego3 = new Videojuego(nintendo,"Mario Bros",40);
        System.out.println("PLATAFORMA: ");
        System.out.println(play.toString());
        System.out.println(xbox.toString());
        System.out.println(nintendo.toString());
        System.out.println();
        System.out.println("VIDEOJUEGO: ");
        System.out.println(juego1.toString());
        System.out.println(juego2.toString());
        System.out.println(juego3.toString());
        System.out.println();
        Tienda gameZone = new Tienda("GameZone");
        System.out.println("TIENDA: ");
        System.out.println(gameZone.toString());
        gameZone.insertarVideojuego(juego1);
        gameZone.insertarVideojuego(juego2);
        gameZone.insertarVideojuego(juego3);
        System.out.println("VIDEOJUEGOS DISPONIBLES: ");
        System.out.println(gameZone.getVideojuegosDisponibles().toString());
        System.out.println();
        gameZone.ccomprarJuego(juego2,carlos,60);
        gameZone.ccomprarJuego(juego3,carlos,40);
        System.out.println("VIDEOJUEGO COMPRADO: ");
        System.out.println(gameZone.toString());
        System.out.println(carlos.toString());
        gameZone.registrarHoras("Call of Duty",carlos,5);
        gameZone.registrarHoras("Call of Duty",carlos,2);
        System.out.println("HORAS JUGADAS: ");
        for (Map.Entry<String,Integer> key : carlos.getHorasJugadas().entrySet()){
            System.out.println(key.getKey() + ": " + key.getValue());
        }
        String[] palabras = toString().split("");
        System.out.println(carlos.getHorasJugadas().toString());
        System.out.println(gameZone.getVideojuegosDisponibles().toString());
    }
}

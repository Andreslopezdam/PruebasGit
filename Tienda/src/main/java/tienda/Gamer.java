package tienda;

import java.util.HashMap;
import java.util.HashSet;

public class Gamer extends Persona {
    private Integer saldo;
    private HashSet<Videojuego> videojuegos = new HashSet<>();
    private HashMap<String,Integer> horasJugadas = new HashMap<>();

    public Gamer() {
    }

    public Gamer(String nombre, String apellido, String dni, Integer saldo) {
        super(nombre, apellido, dni);
        this.saldo = saldo;
    }

    public void insertarVideojuego(Videojuego videojuego){
        videojuegos.add(videojuego);
    }

    public void insertarHorasJugadas(String titulo, Integer horas){
        int horasPrevias = horasJugadas.getOrDefault(titulo, 0);
        horasJugadas.put(titulo,horasPrevias + horas);
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public HashSet<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public HashMap<String, Integer> getHorasJugadas() {
        return horasJugadas;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "saldo=" + saldo +
                ", videojuegos=" + videojuegos +
                ", horasJugadas=" + horasJugadas +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}

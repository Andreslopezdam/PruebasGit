package tienda;

import java.util.ArrayList;
import java.util.HashMap;

public class Tienda {
    private String nombre;
    private ArrayList<Videojuego> videojuegosDisponibles = new ArrayList<>();
    private HashMap<String, Gamer> usuariosRegistrados = new HashMap<>();

    public Tienda() {
    }

    public Tienda(String nombre) {
        this.nombre = nombre;
    }
    public void insertarVideojuego(Videojuego videojuego) {
        videojuegosDisponibles.add(videojuego);
    }

    public void ccomprarJuego(Videojuego videojuego, Gamer usuario, Integer importe) throws Exception {
        if (videojuegosDisponibles.contains(videojuego)) {
            if (videojuego.getPrecio() <= usuario.getSaldo()) {
                usuario.setSaldo(usuario.getSaldo() - videojuego.getPrecio());
            }
            usuario.insertarVideojuego(videojuego);
            videojuegosDisponibles.remove(videojuego);
        }  else {
            throw new Exception("No tenemos ese videojuego!");
        }
    }

    public void registrarHoras(String titulo,Gamer usuario,Integer horas) throws Exception {
        for (Videojuego juego : usuario.getVideojuegos()) {
            if (juego.getTitulo().equals(titulo)) {
                usuario.insertarHorasJugadas(titulo, horas);
                return;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Videojuego> getVideojuegosDisponibles() {
        return videojuegosDisponibles;
    }

    public HashMap<String, Gamer> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", videojuegosDisponibles=" + videojuegosDisponibles +
                ", usuariosRegistrados=" + usuariosRegistrados +
                '}';
    }
}

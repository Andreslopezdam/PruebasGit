package Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Centro {
    private String direccion;
    private static int contadorId = 1;
    private String id;
    private Personal personal;
    private List<Cliente> clientes;
    private Map<Marca, List<Vehiculo>> coches;
    private List<Transaccion> transiciones;
    private LocalDate fecha;
    private Integer facturacion;

    public Centro() {
    }

    public Centro(String direccion, Personal personal, LocalDate fecha, Integer facturacion) {
        this.direccion = direccion;
        this.id = "CENTRO" + contadorId++;
        this.personal = personal;
        this.clientes = new ArrayList<>();
        this.coches = new HashMap<>();
        this.transiciones = new ArrayList<>();
        this.fecha = fecha;
        this.facturacion = facturacion;
    }

    public void agregarClientes(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        } else {
            throw new IllegalArgumentException("El cliente ya está registrado");
        }

    }

    public void agregatVehiculo(Marca marca, Vehiculo vehiculo) {
        coches.put(marca, new ArrayList<>());
        coches.get(marca).add(vehiculo);
    }

    public void registrarTrans(String tipo, Personal p, Cliente c, Vehiculo v, Integer importe) {
        if (!clientes.contains(c)) {
            throw new IllegalArgumentException("El cliente no pertenece a este centro");
        }
        Transaccion t = new Transaccion(tipo, p, c, v, importe);
        transiciones.add(t);

        switch (tipo.toLowerCase()) {
            case "compra":
                facturacion -= importe;
                break;
            case "venta":
                facturacion += importe;
                break;
            case "reparacion":
                facturacion += importe;
                break;
            default:
                throw new IllegalArgumentException("Tipo de transición no registrada");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }


    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(Integer facturacion) {
        this.facturacion = facturacion;
    }

    @Override
    public String toString() {
        return "Centro{" +
                "direccion='" + direccion + '\'' +
                ", id='" + id + '\'' +
                ", personal=" + personal +
                ", clientes=" + clientes +
                ", coches=" + coches +
                ", fecha=" + fecha +
                ", facturacion=" + facturacion +
                '}';
    }
}

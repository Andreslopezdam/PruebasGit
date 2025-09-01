package Ejercicio2;

import java.time.LocalDate;

public class Transaccion {
    private String tipo;
    private LocalDate fecha;
    private Personal personal;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Integer importe;

    public Transaccion() {
    }

    public Transaccion(String tipo, Personal personal, Cliente cliente, Vehiculo vehiculo,Integer importe) {
        this.tipo = tipo;
        this.fecha = LocalDate.now();
        this.personal = personal;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.importe = importe;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", personal=" + personal +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", importe=" + importe +
                '}';
    }
}

package Ejercicio2;

import Enumerados.Color;

import java.util.Date;

public class Vehiculo {
    private Integer potencia;
    private Date anioMatriculacion;
    private String modelo;
    private String matricula;
    private Marca marca;
    private Color color;

    public Vehiculo() {
    }

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculo(Integer potencia, Date anioMatriculacion, String modelo, String matricula, Marca marca, Color color) {
        this.potencia = potencia;
        this.anioMatriculacion = anioMatriculacion;
        this.modelo = modelo;
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Date getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(Date anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "potencia=" + potencia +
                ", anioMatriculacion=" + anioMatriculacion +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", marca=" + marca +
                ", color=" + color +
                '}';
    }
}

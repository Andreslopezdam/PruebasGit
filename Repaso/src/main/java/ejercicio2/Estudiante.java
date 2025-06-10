package ejercicio2;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private String etapaMadurez;
    private CentroEducativo centro;
    private Curso curso;
    private Casa casa;
    private  String tutorLegal;

    public Estudiante() {
    }

    public Estudiante(String nombre, String tutorLegal, LocalDate fechaNacimiento, CentroEducativo centro, Curso curso) {
        super(nombre, fechaNacimiento);
        this.tutorLegal = tutorLegal;
        this.etapaMadurez = determinarMadurez();
        this.centro = centro;
        this.curso = curso;
        curso.agregarEstudiantes(this);
        this.casa = Casa.asignarCasa();
    }

    private String determinarMadurez(){
        if (edad <12){
            return "Infantil";
        } else if (edad < 18) {
            return "Pavo";
        }else {
            return "Adulto";
        }
    }

    public String getEtapaMadurez() {
        return etapaMadurez;
    }

    public void setEtapaMadurez(String etapaMadurez) {
        this.etapaMadurez = etapaMadurez;
    }

    public CentroEducativo getCentro() {
        return centro;
    }

    public void setCentro(CentroEducativo centro) {
        this.centro = centro;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getTutorLegal() {
        return tutorLegal;
    }

    public void setTutorLegal(String tutorLegal) {
        this.tutorLegal = tutorLegal;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "etapaMadurez='" + etapaMadurez + '\'' +
                ", centro=" + centro +
                ", curso=" + curso +
                ", casa=" + casa +
                ", tutorLegal='" + tutorLegal + '\'' +
                "} " + super.toString();
    }
}

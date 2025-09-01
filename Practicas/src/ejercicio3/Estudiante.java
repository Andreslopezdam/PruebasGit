package ejercicio3;

import java.time.LocalDate;

public class Estudiante extends Persona {
    private String madurez;
    private Tutor tutorLegal;
    private CentroEducativo centro;
    private Curso curso;
    private Casa casa;

    public Estudiante() {
    }

    public Estudiante(String nombre, LocalDate fechaNacimiento, String madurez, Tutor tutorLegal, CentroEducativo centro, Curso curso, Casa casa) {
        super(nombre, fechaNacimiento);
        this.madurez = determinarMadurez();
        this.tutorLegal = tutorLegal;
        this.centro = centro;
        this.curso = curso;
        curso.asignarEstudiante(this);
        this.casa = Casa.asignarCasa();
    }

    private String determinarMadurez() {
        if (edad < 12) {
            return "Infantil";
        } else if (edad < 18) {
            return "Pavo";
        } else {
            return "Adulto";
        }
    }

    public String getMadurez() {
        return madurez;
    }

    public void setMadurez(String madurez) {
        this.madurez = madurez;
    }

    public Tutor getTutorLegal() {
        return tutorLegal;
    }

    public void setTutorLegal(Tutor tutorLegal) {
        this.tutorLegal = tutorLegal;
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

    @Override
    public String toString() {
        return "Estudiante{" +
                "madurez='" + madurez + '\'' +
                ", tutorLegal=" + tutorLegal +
                ", centro=" + centro +
                ", curso=" + curso +
                ", casa=" + casa +
                "} " + super.toString();
    }
}

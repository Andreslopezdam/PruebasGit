package ejercicio2;

public class Estudiantes extends Persona{
    private String madurez;
    private String tutorLegal;
    private CentroEducativo centroEducativo;
    private Curso curso;
    private Casa casa;

    public Estudiantes() {
    }

    public Estudiantes(String nombreCompleto, String fechaNacimiento, String madurez, String tutorLegal, CentroEducativo centroEducativo, Curso curso, Casa casa) {
        super(nombreCompleto, fechaNacimiento);
        this.madurez = determinarMadurez();
        this.tutorLegal = tutorLegal;
        this.centroEducativo = centroEducativo;
        this.curso = curso;
        curso.agregarEstudiante(this);
        this.casa = Casa.asignarAleatoriamente();
    }

    public String determinarMadurez(){
        if (edad < 12){
            return "Infantil";
        } else if (edad < 18) {
            return "Pavo";
        }else {
            return "Adulto";
        }
    }

    public String getMadurez() {
        return madurez;
    }

    public void setMadurez(String madurez) {
        this.madurez = madurez;
    }

    public String getTutorLegal() {
        return tutorLegal;
    }

    public void setTutorLegal(String tutorLegal) {
        this.tutorLegal = tutorLegal;
    }

    public CentroEducativo getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(CentroEducativo centroEducativo) {
        this.centroEducativo = centroEducativo;
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
        return "Estudiantes{" +
                "madurez='" + madurez + '\'' +
                ", tutorLegal='" + tutorLegal + '\'' +
                ", centroEducativo=" + centroEducativo +
                ", curso=" + curso +
                ", casa=" + casa +
                "} " + super.toString();
    }
}

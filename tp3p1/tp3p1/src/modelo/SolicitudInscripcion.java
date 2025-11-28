package modelo;
import java.util.Date;

public class SolicitudInscripcion {
    public Estudiante estudiante;
    public Materia materia;
    public Date fechaSolicitud;

    public SolicitudInscripcion(Estudiante e, Materia m) {
        this.estudiante = e;
        this.materia = m;
        this.fechaSolicitud = new Date();
    }
}

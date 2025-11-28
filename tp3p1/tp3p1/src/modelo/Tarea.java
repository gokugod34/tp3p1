package modelo;

public class Tarea {
    private String descripcion;
    private Materia materia;
    private String fechaLimite;
    private int prioridad;

    public Tarea(String descripcion, Materia materia, String fechaLimite, int prioridad) {
        this.descripcion = descripcion;
        this.materia = materia;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return descripcion + " | Materia: " + materia.getNombre() 
            + " | Fecha límite: " + fechaLimite
            + " | Prioridad: " + prioridad;
    }
}

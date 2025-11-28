package modelo;

public class CambioNota {
    private Estudiante estudiante;
    private Materia materia;
    private double notaVieja;
    private double notaNueva;

    public CambioNota(Estudiante estudiante, Materia materia, double notaVieja, double notaNueva) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.notaVieja = notaVieja;
        this.notaNueva = notaNueva;
    }

    public void revertir() {
        materia.setNota(notaVieja);
    }

    @Override
    public String toString() {
        return "Cambio de nota en " + materia.getNombre() + 
            " para " + estudiante.toString() + 
            ": " + notaVieja + " → " + notaNueva;
    }
}

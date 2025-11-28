package modelo;

public class Materia {
    private String nombre;
    private double nota;

    public Materia(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNota(double n) {
    this.nota = n;
}

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nombre + " (" + nota + ")";
    }
}

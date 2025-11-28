
package modelo;

import estructuras.Cola;

public class Profesor {
    private String nombre;
    private Cola colaConsultas;

    public Profesor(String nombre) {
        this.nombre = nombre;
        colaConsultas = new Cola();
    }

    public void agregarEstudianteACola(Estudiante e) {
        colaConsultas.insertar(e);
    }

    public Estudiante atenderSiguienteEstudiante() {
        return (Estudiante) colaConsultas.quitar();
    }
}

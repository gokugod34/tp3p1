package modelo;
import estructuras.Nodo;
import estructuras.Pila;
import estructuras.ListaEnlazada;

public class Estudiante {
    private String nombre;
    private String apellido;
    private ListaEnlazada materias;
    private Pila tareasPendientes;

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        materias = new ListaEnlazada();
        tareasPendientes = new Pila();
    }

    public void agregarMateria(Materia m) {
        materias.agregar(m);
    }

    public double calcularPromedioRecursivo() {
        return calcularPromedioRecursivo(materias.getPrimero(), 0, 0);
    }

    private double calcularPromedioRecursivo(Nodo actual, int contador, double suma) {
        if (actual == null) {
            return contador == 0 ? 0 : suma / contador;
        }
        Materia m = (Materia) actual.dato;
        return calcularPromedioRecursivo(actual.siguiente, contador + 1, suma + m.getNota());
    }

    // PILA DE TAREAS
    public void agregarTarea(Tarea t) {
        tareasPendientes.insertar(t);
    }

    public Tarea completarUltimaTarea() {
        return (Tarea) tareasPendientes.quitar();
    }

    public boolean tieneTareasPendientes() {
        return !tareasPendientes.estaVacia();
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}

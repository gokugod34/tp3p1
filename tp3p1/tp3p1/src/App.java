import modelo.*;

public class App {
    public static void main(String[] args) {

        Estudiante s1 = new Estudiante("Juan", "Perez");
        Estudiante s2 = new Estudiante("Maria", "Lopez");

        Materia m1 = new Materia("Matematica", 8);
        Materia m2 = new Materia("Historia", 10);

        s1.agregarMateria(m1);
        s1.agregarMateria(m2);

        System.out.println("Promedio Juan: " + s1.calcularPromedioRecursivo());

        s1.agregarTarea(new Tarea("TP poo", m1, "2025-01-10", 2));
        s1.agregarTarea(new Tarea("Practicar recursividad", m2, "2025-01-08", 1));
        
        System.out.println("Última tarea completada: " + s1.completarUltimaTarea());

        HistorialCambios h = new HistorialCambios();
        h.registrarCambio(new CambioNota(s1, m1, 8, 9));
        System.out.println("Deshacer cambio: " + h.deshacerUltimoCambio());

        Profesor p1 = new Profesor("Ramirez");
        p1.agregarEstudianteACola(s1);
        p1.agregarEstudianteACola(s2);

        System.out.println("Profesor atiende: " + p1.atenderSiguienteEstudiante());
    }
}

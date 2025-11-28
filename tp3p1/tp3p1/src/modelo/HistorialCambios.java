package modelo;
import estructuras.Pila;

public class HistorialCambios {
    private Pila historial;

    public HistorialCambios() {
        historial = new Pila();
    }

    public void registrarCambio(CambioNota c) {
        historial.insertar(c);
    }

    public CambioNota deshacerUltimoCambio() {
        return (CambioNota) historial.quitar();
    }
}

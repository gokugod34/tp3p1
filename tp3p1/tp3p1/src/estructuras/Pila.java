package estructuras;

public class Pila {
    private ListaEnlazada elementos;

    public Pila() {
        elementos = new ListaEnlazada();
    }

    public void insertar(Object dato) {
        elementos.agregarAlInicio(dato);
    }

    public Object quitar() {
        return elementos.eliminarDelInicio();
    }

    public Object verTope() {
        return elementos.verPrimero();
    }

    public boolean estaVacia() {
        return elementos.estaVacia();
    }

    public int tamaño() {
        return elementos.tamaño();
    }
}

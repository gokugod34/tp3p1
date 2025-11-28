package estructuras;

import estructuras.Nodo;

public class Cola {
    private Nodo primero;
    private Nodo ultimo;

    public Cola() {
        primero = null;
        ultimo = null;
    }

    public void insertar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public Object quitar() {
        if (primero == null) return null;
        Object dato = primero.dato;
        primero = primero.siguiente;
        return dato;
    }

    public boolean estaVacia() {
        return primero == null;
    }
}

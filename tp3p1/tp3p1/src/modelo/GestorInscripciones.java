package modelo;

import estructuras.Cola;

public class GestorInscripciones {
    private Cola solicitudesPendientes;

    public GestorInscripciones() {
        solicitudesPendientes = new Cola();
    }

    public void agregarSolicitud(SolicitudInscripcion s) {
        solicitudesPendientes.insertar(s);
    }

    public SolicitudInscripcion procesarSiguienteSolicitud() {
        return (SolicitudInscripcion) solicitudesPendientes.quitar();
    }
}

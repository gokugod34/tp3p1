# tp3p1
En este sistema utilizamos Pilas y Colas debido a que cada una representa comportamientos diferentes en el manejo de datos.
La Pila funciona bajo el principio LIFO (Last In, First Out), donde el último elemento insertado es el primero en procesarse.
Esto resulta ideal cuando se requiere trabajar con acciones recientes, como en mecanismos de deshacer cambios, historial de modificaciones o tareas recientes del estudiante.
En cambio, la Cola funciona bajo el principio FIFO (First In, First Out), donde el primer elemento que entra es el primero que sale, reflejando un flujo ordenado y justo de atención como el turno de personas en una fila, solicitudes de inscripción o turnos de consulta con profesores.
Por este motivo, en este sistema se utiliza una Pila para almacenar los cambios realizados en notas y permitir deshacer, así como para manejar las tareas más recientes del estudiante, mientras que las Colas se usan para gestionar solicitudes de inscripción y turnos con profesores respetando el orden temporal.

En cuanto a la implementación interna de Pilas y Colas, existen ventajas claras al utilizar Listas Enlazadas en vez de Arrays. 
Las Listas Enlazadas permiten un crecimiento dinámico sin tener que definir un tamaño máximo previamente, y facilitan la inserción y eliminación en los extremos con un costo constante O(1), ya que solo se reasignan punteros en los nodos. 
Esto hace que el uso de memoria sea eficiente y escalable conforme los datos incrementen.
En contraste, las implementaciones con Arrays requieren un tamaño fijo o procesos costosos de copia para redimensionar la estructura cuando se llena, además de que el acceso es rápido pero la inserción o eliminación en posiciones extremas puede ser costosa. 
Dado que las Pilas y Colas en este sistema solo requieren manipular el principio y fin de la estructura, las Listas Enlazadas resultan la elección más eficiente y flexible.

Finalmente, en la vida real, las Pilas y Colas representan comportamientos observables en sistemas reales.
Las Pilas son utilizadas en acciones como deshacer en editores de texto, historial de navegación en un navegador, manejo de llamadas de funciones en un programa o priorización de tareas más recientes de un usuario.
Las Colas aparecen en escenarios donde se requiere un orden justo, como la fila de espera para atención al cliente, la cola de impresión, la planificación de procesos en un sistema operativo o el orden de llegada de solicitudes académicas.
De esta forma, el uso de Pilas y Colas en este proyecto no solo resulta adecuado desde una perspectiva algorítmica, sino que también modela fielmente comportamientos naturales del contexto académico real.

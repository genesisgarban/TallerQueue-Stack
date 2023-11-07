import java.util.LinkedList;
import java.util.Queue;

public class MusicQueue {
    final Queue<String> colaReproduccion;

    public MusicQueue() {
        colaReproduccion = new LinkedList<>();
    }

    public void agregarCancion(String cancion) {
        colaReproduccion.offer(cancion);
    }

    public String reproducirSiguienteCancion() {
        return colaReproduccion.poll();
    }

    public void mostrarColaReproduccion() {
        for (String cancion : colaReproduccion) {
            System.out.println(cancion);
        }
    }

    public boolean eliminarCancion(String cancion) {
        return colaReproduccion.remove(cancion);
    }
}

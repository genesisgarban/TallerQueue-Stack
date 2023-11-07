import java.util.LinkedList;
import java.util.Queue;

public class Evento {
    Queue<Asistente> cola;
    int aforo;
    int cantDisponibles;

    public Evento(int aforo) {
        this.aforo = aforo;
        this.cantDisponibles = aforo;
        this.cola = new LinkedList<>();
    }

    public void registrarComprador(Asistente asistente, int boletosAComprar) {
        // Asegúrate de que no se vendan más boletos de los disponibles
        if (boletosAComprar <= cantDisponibles) {
            for (int i = 0; i < boletosAComprar; i++) {
                cola.add(asistente);
            }
            cantDisponibles -= boletosAComprar;
        } else {
            System.out.println("No hay suficientes boletos disponibles para esta compra.");
        }
    }

    public void procesarSiguienteCompra() {
        if (!cola.isEmpty()) {
            Asistente asistente = cola.poll();
            // Procesa la compra del asistente, por ejemplo, imprimir un mensaje
            System.out.println("Compra procesada para un asistente: " + asistente);
        } else {
            System.out.println("Sold out");
        }
    }
}

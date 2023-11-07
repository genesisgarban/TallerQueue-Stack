
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento(100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la venta de boletos. Por favor, proporcione sus datos:");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Cantidad de boletos a comprar: ");
        int cantidadBoletos = scanner.nextInt();

        Asistente asistente = new Asistente(nombre, email, cedula, cantidadBoletos);

        evento.registrarComprador(asistente, cantidadBoletos);

        evento.procesarSiguienteCompra();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicQueue musicQueue = new MusicQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Cola de Reproducción de Música");
            System.out.println("1. Agregar canción");
            System.out.println("2. Reproducir siguiente canción");
            System.out.println("3. Mostrar cola de reproducción");
            System.out.println("4. Eliminar canción de la cola");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la canción: ");
                    String cancion = scanner.nextLine();
                    musicQueue.agregarCancion(cancion);
                    System.out.println("Canción '" + cancion + "' agregada a la cola.");
                    break;
                case 2:
                    String cancionReproducir = musicQueue.reproducirSiguienteCancion();
                    if (cancionReproducir != null) {
                        System.out.println("Reproduciendo: " + cancionReproducir);
                    } else {
                        System.out.println("La cola de reproducción está vacía.");
                    }
                    break;
                case 3:
                    System.out.println("Cola de Reproducción Actual:");
                    musicQueue.mostrarColaReproduccion();
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la canción a eliminar: ");
                    String cancionEliminar = scanner.nextLine();
                    if (musicQueue.eliminarCancion(cancionEliminar)) {
                        System.out.println("Canción '" + cancionEliminar + "' eliminada de la cola.");
                    } else {
                        System.out.println("La canción no se encontró en la cola.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        }
    }
}

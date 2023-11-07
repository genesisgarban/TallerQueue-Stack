import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una expresión matemática: ");
        String expresion = scanner.nextLine();

        if (VerificarExpresionMatematica.esExpresionValida(expresion)) {
            System.out.println("La expresión es válida.");
        } else {
            System.out.println("La expresión no es válida.");
        }
    }
}
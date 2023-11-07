import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String texto = sc.next();

            if (texto.equals("-1")) {
                te.undo();
            } else if (texto.equals("+print")) {
                te.printText();
            } else {
                te.write(texto);
            }
        }
    }
}
import java.util.Stack;

class VerificarExpresionMatematica {

    public static boolean esExpresionValida(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == ']' || caracter == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                char caracterPila = pila.pop();
                if (!esParValido(caracterPila, caracter)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private static boolean esParValido(char caracterApertura, char caracterCierre) {
        return (caracterApertura == '(' && caracterCierre == ')') ||
                (caracterApertura == '[' && caracterCierre == ']') ||
                (caracterApertura == '{' && caracterCierre == '}');
    }
}
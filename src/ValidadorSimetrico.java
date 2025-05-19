import java.util.Scanner;

public class ValidadorSimetrico {

    // Método recursivo para verificar si un texto es un palíndromo
    public static boolean verificarSimetria(String texto, int izquierda, int derecha) {
        if (izquierda >= derecha) {
            return true; // Punto de convergencia: texto simétrico
        }
        if (texto.charAt(izquierda) != texto.charAt(derecha)) {
            return false; // Desajuste detectado
        }
        return verificarSimetria(texto, izquierda + 1, derecha - 1); // Llamada recursiva con acotamiento
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba un texto para validar si es palíndromo: ");
        String entradaUsuario = entrada.nextLine();

        boolean esSimetrico = verificarSimetria(entradaUsuario, 0, entradaUsuario.length() - 1);
        System.out.println("¿La palabra \"" + entradaUsuario + "\" es palíndroma?: " + esSimetrico);
    }
}

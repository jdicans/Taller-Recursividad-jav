import java.util.Scanner;

public class RevertirCadena {

    // Método recursivo para invertir una cadena
    public static String invertirTexto(String entrada) {
        if (entrada.length() <= 1) {
            return entrada; // Condición de salida: cadena vacía o de un solo carácter
        }

        char ultimoCaracter = entrada.charAt(entrada.length() - 1);
        String restoTexto = entrada.substring(0, entrada.length() - 1);
        return ultimoCaracter + invertirTexto(restoTexto);
    }

    public static void main(String[] argumentos) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Escriba una palabra o frase: ");
        String original = lector.nextLine();

        String resultadoInvertido = invertirTexto(original);
        System.out.println("Texto invertido de '" + original + "' es: " + resultadoInvertido);
    }
}

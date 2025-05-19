import java.util.Scanner;

public class ContarCaracteres {

    // Método recursivo para contar ocurrencias de un carácter en una cadena
    public static int contarCoincidencias(String cadena, char objetivo) {
        if (cadena.isEmpty()) {
            return 0;
        }

        int coincidencia = (cadena.charAt(0) == objetivo) ? 1 : 0;
        String resto = cadena.substring(1);
        return coincidencia + contarCoincidencias(resto, objetivo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el texto a analizar: ");
        String inputUsuario = entrada.nextLine();

        System.out.print("Escriba el carácter que desea contabilizar: ");
        char simbolo = entrada.next().charAt(0);

        int total = contarCoincidencias(inputUsuario, simbolo);

        System.out.println("El carácter '" + simbolo + "' aparece " + total + " veces en el texto ingresado.");
    }
}

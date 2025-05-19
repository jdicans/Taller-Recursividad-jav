import java.util.Scanner;

public class CalculadoraFibonacci {

    // Método recursivo para obtener el valor en una posición de la secuencia
    public static int obtenerFibonacci(int indice) {
        if (indice == 0) return 0;     // Primer elemento
        if (indice == 1) return 1;     // Segundo elemento
        return obtenerFibonacci(indice - 1) + obtenerFibonacci(indice - 2); // Llamada recursiva
    }

    public static void main(String[] argumentos) {
        Scanner lectorEntrada = new Scanner(System.in);
        System.out.print("Digite el índice en la secuencia de Fibonacci: ");
        int posicionUsuario = lectorEntrada.nextInt();
        int resultado = obtenerFibonacci(posicionUsuario);

        System.out.println("El valor en la posición " + posicionUsuario + " de la serie de Fibonacci es: " + resultado);
    }
}

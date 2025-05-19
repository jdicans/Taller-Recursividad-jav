public class ContadorRegresivo {

    // Método recursivo para imprimir números en orden descendente
    public static void mostrarEnOrdenInverso(int numero) {
        if (numero <= 0) {
            return; // Punto de salida: al llegar a cero o menos
        }

        System.out.println(numero); // Salida actual
        mostrarEnOrdenInverso(numero - 1); // Progresión hacia el caso base
    }

    public static void main(String[] argumentos) {
        System.out.println("Cuenta regresiva desde 100 hasta 1:");
        mostrarEnOrdenInverso(100);
    }
}

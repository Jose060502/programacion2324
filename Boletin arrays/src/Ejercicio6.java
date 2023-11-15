import java.util.Random;
public class Ejercicio6 {
    public static void main(String[] args) {
        // Generar un array aleatorio
        int[] array = generarArrayAleatorio();

        // Mostrar el array generado
        System.out.println("Array generado:");
        mostrarArray(array);

        // Solicitar el elemento a buscar
        int elementoABuscar = MiEntradaSalida.leerEntero("Introduzca el elemento a buscar: ");

        // Comprobar si el array contiene el elemento
        boolean encontrado = contieneElemento(array, elementoABuscar);

        // Mostrar el resultado
        if (encontrado) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el array.");
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el array.");
        }
    }
    // Método para generar un array aleatorio
    public static int[] generarArrayAleatorio() {
        Random rand = new Random();
        int tamaño = rand.nextInt(10) + 1; // Tamaño aleatorio entre 1 y 10
        int[] array = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            array[i] = rand.nextInt(101); // Números aleatorios de 0 a 100
        }

        return array;
    }

    // Método para mostrar un array por pantalla
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para comprobar si un array contiene un determinado elemento
    public static boolean contieneElemento(int[] array, int elemento) {
        for (int num : array) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }
}


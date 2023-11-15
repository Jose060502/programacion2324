import java.util.Random;

public class Ejercicio5 {
        public static void main(String[] args) {
            // Pedir al usuario que introduzca el tamaño del array
            int tamaño = MiEntradaSalida.leerEnteroPositivo("Introduce el tamaño del array");

            // Llamar al método con el tamaño proporcionado por el usuario
            generarYMostrarArray(tamaño);
        }

        // Método para generar un array de tamaño posiciones de números aleatorios de 0 a 1000 y mostrarlo
        public static void generarYMostrarArray(int tamaño) {
            // Crear un array con el tamaño especificado
            int[] array = new int[tamaño];

            // Llenar el array con números aleatorios de 0 a 1000
            Random rand = new Random();
            for (int i = 0; i < tamaño; i++) {
                array[i] = rand.nextInt(1001); // El límite superior (1001) es exclusivo
            }

            // Mostrar el array por pantalla
            System.out.println("Array generado:");
            for (int i = 0; i < tamaño; i++) {
                System.out.println("Posición " + i + ": " + array[i]);
            }
        }
    }



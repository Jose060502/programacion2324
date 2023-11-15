import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño del array
        System.out.print("Introduzca las posiciones que tendrá el array: ");
        int tam = scanner.nextInt();

        // Crear el array con el tamaño proporcionado
        int[] array = new int[tam];

        // Pedir al usuario que ingrese los números
        for (int i = 0; i < tam; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calcular el mayor, el menor y la media
        int mayor = array[0];
        int menor = array[0];
        int suma = array[0];

        for (int i = 1; i < tam; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
            suma += array[i];
        }

        // Calcular la media
        double media = (double) suma / tam;

        // Contar repeticiones del mayor
        int repeticionesMayor = 0;
        for (int i = 0; i < tam; i++) {
            if (array[i] == mayor) {
                repeticionesMayor++;
            }
        }

        // Mostrar resultados
        System.out.println("El mayor número introducido es " + mayor +
                " (se repite " + repeticionesMayor + " veces)");
        System.out.println("El menor número introducido es " + menor);
        System.out.println("La media de los números introducidos es: " + media);

        // Cerrar el scanner
        scanner.close();
    }
}

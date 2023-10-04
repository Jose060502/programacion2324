import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double suma = 0;
        double media;

        do {
            System.out.print("Introduce la cantidad de números a solicitar: ");
            cantidad = sc.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que 0. Inténtalo de nuevo.");
            }
        } while (cantidad <= 0);

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double num = sc.nextDouble();
            suma += num;
        }

        media = suma / cantidad;

        System.out.println("La media de los números introducidos es: " + media);
    }
}

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String [] args){
        Random r = new Random();
        int aleatorio = r.nextInt(100) + 1;
        int intentos = 0;
        final int MAX_INTENTOS = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tienes " + MAX_INTENTOS + " intentos para adivinar el número secreto.");

        while (intentos < MAX_INTENTOS) {
            System.out.print("Ingresa tu conjetura: ");
            int numIntroducido = scanner.nextInt();

            if (numIntroducido < 1 || numIntroducido > 100) {
                System.out.println("El número debe estar entre 1 y 100. Intenta de nuevo.");
                intentos++;
                continue;
            }

            if (numIntroducido == aleatorio) {
                System.out.println("Has adivinado el número secreto: " + aleatorio);
                break;
            } else if (numIntroducido < aleatorio) {
                System.out.println("El número secreto es mayor. Intentalo de nuevo.");
            } else {
                System.out.println("El número secreto es menor. Intentalo de nuevo.");
            }
            intentos++;

            int intentosRestantes = MAX_INTENTOS - intentos;
            if (intentosRestantes > 0) {
                System.out.println("Te quedan " + intentosRestantes + " intentos.");
            } else {
                System.out.println("El número secreto era: " + aleatorio);
            }
        }

        scanner.close();

    }
}

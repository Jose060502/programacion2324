import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres:");
        String cadena = scanner.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        scanner.close();
    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();

        int longitud = cadena.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

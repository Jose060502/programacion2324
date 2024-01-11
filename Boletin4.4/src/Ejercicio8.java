import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String cadena = scanner.nextLine();

        int numeroPalabras = contarPalabras(cadena);

        System.out.println("El número de palabras es: " + numeroPalabras);

        scanner.close();
    }

    public static int contarPalabras(String cadena) {
       // cadena = cadena.trim();
        // String[] palabras = cadena.split("\\s+");
        // return palabras.length;
        return cadena.isBlank() ? 0 : cadena.trim().split("\\s+").length;
    }
}

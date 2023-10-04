import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);
            int numero;

            do {
                System.out.print("Introduce un número positivo: ");
                numero = scanner.nextInt();
            } while (numero <= 0);

            int suma = 0;

            for (int i = 1; i <= numero; i++) {
                suma += i;
            }

            System.out.println("La suma de los " + numero + " primeros números es: " + suma);
    }
}

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numA , numB , producto;

        System.out.println("Introduce el primer número");
        numA = sc.nextInt();

        System.out.println("Introduce el segundo número");
        numB = sc.nextInt();

        producto = 0;

        for (int i = 1; i <= numB; i++) {
            producto += numA;
        }

        System.out.println("El producto de " + numA + " y " + numB + " es: " + producto);
    }
}

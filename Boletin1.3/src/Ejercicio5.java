import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double suma = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int contarNum = 0;
        double num;

        System.out.println("Introduce número , para calcular la media introduzca el -1");


        do {
            System.out.println("Introduce un número: ");
            num = sc.nextDouble();

            if (num >=  0) {
                suma += num;
                contarNum += 1;

                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }


        } while (num != -1);

        sc.close();

        double media = suma / contarNum;

        System.out.println("La media de los números es: " + media);
        System.out.println("El mayor número introducido es: " + max);
        System.out.println("El menor número introducido es: " + min);

    }
}

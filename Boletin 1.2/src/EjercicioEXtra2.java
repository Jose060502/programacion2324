import java.util.Scanner;

public class EjercicioEXtra2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo número");
        int num2 = Integer.parseInt(sc.nextLine());

        boolean primosEntreSi = true;

        for (int i = 2 ; i < num1 && i < num2 && primosEntreSi ; i++){
            if (num1 % i == 0 && num2 % i == 0){
                System.out.println("No son primos entre si porque el " + i + " divide a " + num1 + " y " + num2);
                primosEntreSi = false;

            }
        }
        if (primosEntreSi){
            System.out.println("Los números " + num1 + " y " + num2 + " son primos");
        }
    }
}

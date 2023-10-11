import java.util.Scanner;

public class EjercicioExtra {

    static Scanner sc = new Scanner(System.in);

    public static void main (String [] args){

        System.out.println("Introduce el primer número");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo número");
        int num2 = Integer.parseInt(sc.nextLine());

        int maxComDiv = calcularMaxComDiv(num1, num2);

        if(maxComDiv == 1){
            System.out.println("Los números " + num1 + " y " + num2 + " son primos entre si");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son primos entre si ya que su máximo común divisor es " + maxComDiv);
        }

        sc.close();
    }

    public static int calcularMaxComDiv (int a, int b){
        while (b != 0){
            int num3 = b;
            b = a % b;
            a = num3;
        }

        return a;
    }
}

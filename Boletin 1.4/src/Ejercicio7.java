import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número mayor que 0");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número mayor que 0");
        int num2 = sc.nextInt();

        if(num1 <= 0 || num2 <= 0){
            System.out.println("Los número deben de ser mayores que 0");
        } else{
            int mcd = calcularMCD(num1 , num2);
            System.out.println("El máximo común divisor (MCD) de " + num1 + " y " + num2 + " es: " + mcd);
        }
    }

    public static int calcularMCD(int numero1 , int numero2){
        while (numero2 != 0){
            int t = numero2;
            numero2 = numero1 % numero2;
            numero1 = t;
        }

        return numero1;
    }
}

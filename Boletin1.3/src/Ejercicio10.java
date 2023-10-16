import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        char operador;
        int num1;
        int num2;
        int resultado = 0;

        do {
            System.out.println("Introduce un operador aritmético( + , - , * , /)");
            operador = sc.nextLine().charAt(0);
        } while(operador!='+' && operador!='-' && operador!='*' && operador!='/');

        System.out.println("Introduce el primer número");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        num2 = sc.nextInt();

        if (operador == '+'){
            resultado = num1 + num2;
        } else if (operador == '-') {
            resultado = num1 - num2;
        } else if (operador == '*') {
            resultado = num1 * num2;
        } else if (operador == '/') {
            if (num2 != 0){
                resultado = num1 / num2;
            }else{
                System.out.println("ERROR: No se puede dividir entre cero");
                return;
            }
        } else{
            System.out.println();
        }

        System.out.println("El resultado es: " + resultado);
    }
}

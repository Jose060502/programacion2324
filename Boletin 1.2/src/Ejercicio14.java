import java.util.Scanner;

public class Ejercicio14 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el segundo número");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce la operación que quiere realizar ( + , - , / , *)");
        String operador = sc.nextLine();

        int resultado = 0;

        switch (operador) {

            case "suma":
            case "+":
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case "resta":
            case "-":
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case"multipicar":
            case "*":
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case"dividir":
            case "/":
                resultado = num1 / num2;
                System.out.println(resultado);
                break;
        }
    }
}

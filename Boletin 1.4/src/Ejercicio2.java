import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBase;
        int numExponente;
        int resultado = 1;

        do {
            System.out.println("Introduce un número el cual va a ser la base");
            numBase = sc.nextInt();
            System.out.println("Introduce un número el cual va a ser el exponente");
            numExponente = sc.nextInt();
        } while (numBase < 0 || numExponente < 0);

        if (numBase == 0){
            if (numExponente == 0){
                resultado = 1;
            }
            resultado = 0;
        }else {
            for (int i = 0 ; i < numExponente ; i++){
                resultado *= numBase;
            }
        }

        System.out.println("El resutado es: " + resultado);
    }
}
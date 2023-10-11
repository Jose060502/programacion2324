import java.util.Scanner;

public class EjercicioExtra3 {

    static Scanner sc = new Scanner(System.in);

    public static void main (String [] args){

        System.out.println("Introduce un número entero positivo");
        int num = Integer.parseInt(sc.nextLine());

        sc.close();

        int suma = 0, num1 = 1, num2 = 1;

        for (int i = 3; i <= num ; i++){
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        System.out.printf("El número de Fibonacci que ocupa la posición %d es %d", num , suma);
    }
}

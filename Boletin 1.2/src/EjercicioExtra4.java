import java.util.Scanner;

public class EjercicioExtra4 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero positivo");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("La suceción de Fibonnaci de forma recursiva es " + fibonacci(num));
    }

    public static int fibonacci(int numero){
        if((numero == 0 ) || (numero ==1)){
            return numero;
        }
        else{
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }
}

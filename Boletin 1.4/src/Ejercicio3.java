import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        do{
            System.out.println("Introduce un número entero positivo mayoe que cero");
            numero = sc.nextInt();
        }while(numero < 0);

        int numB = Math.abs(numero);
        int i;

        for(i = 0 ; numB >= 10; i++){
            numB /= 10;
        }
        System.out.printf("El número %d tiene %d cifras", numero, i);
    }
}

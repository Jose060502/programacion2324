import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int numero , cuentaPositivos;

        cuentaPositivos = 0 ;

        do {
            System.out.println("Introduce un numero(negativo para terminar)");
            numero = sc.nextInt();

            if(numero >= 0){
                cuentaPositivos++;
            }

        }while(numero > 0);

        System.out.println("Has introducido "+ cuentaPositivos +" números positivos");
    }
}

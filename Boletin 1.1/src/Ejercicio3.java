import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadNumeros;

        do {
            System.out.println("Ingrese la cantidad de numeros para verificar (que sean positivos)");
            cantidadNumeros = sc.nextInt();
        } while(cantidadNumeros <= 0);

        for(int i = 0 ; i < cantidadNumeros ; i++){
            System.out.println("Ingrese un número: ");
            int numero = sc.nextInt();

            if(numero % 2 == 0){
                System.out.println(numero + " es par");
            } else {
                System.out.println(numero + " es impar");
            }
        }

        sc.close();

    }
}

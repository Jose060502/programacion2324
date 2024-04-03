import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño por teclado");
        int tamaño = sc.nextInt();
        int[] numerosAleatorios = generarNumeros(tamaño);

        System.out.println("Números aleatorios generados: ");
        for (int i = 0; i < tamaño ; i++){
            System.out.println(numerosAleatorios[i]);
        }
    }

    public static int[] generarNumeros (int tamaño){
        int [] numerosAleatorios = new int[tamaño];

        Random rnd = new Random();

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numeroAletorio = rnd.nextInt(1001);
            numerosAleatorios[i]=numeroAletorio;
        }
        return numerosAleatorios;
    }
}

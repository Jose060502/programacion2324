import java.util.Random;

public class Ejercicio4 {
    private static final int NUM_REPETICIONES = 6000;
    private static final int MIN_RAMDOM = 0;

    private static final int MAX_RAMDOM = 100;
    public static void main (String [] args){
        Random rnd = new Random();
        double suma = 0;
        int[] terminaciones = new int[10];

        //En este for voy a mostra el número de veces que se ha repetido el digito final
        for(int i = 0; i < terminaciones.length; i++){
            System.out.printf("El nº %d se ha repetido %d veces. Esto equivale a un %.2f%% \n", i, terminaciones[i], (double) terminaciones[i]/NUM_REPETICIONES * 100);
        }

        for (int i = 0; i < NUM_REPETICIONES; i++){
            int aleatorio = rnd.nextInt(MAX_RAMDOM);
            suma += aleatorio;

            terminaciones[aleatorio % 10]++;
        }
        int posMax = 0;
        int maxValue = Integer.MIN_VALUE;
        //En este for busco el digito en que han terminado más números
        for(int i = 0; i < terminaciones.length; i++){
            if(terminaciones[i] > maxValue){
                maxValue = terminaciones[i];
                posMax = i;
            }
        }
        for(int i = 0; i < terminaciones.length; i++){
            if (terminaciones[i] == 0){
                System.out.printf("No ha habido níngun número que terminase en %d\n", i);
            }
        }

        System.out.printf("El dígito %d es en el que más números han terminado (%d veces)\n" , posMax, maxValue);
        System.out.printf("La media de los números es %.2f", suma / NUM_REPETICIONES);
    }
}

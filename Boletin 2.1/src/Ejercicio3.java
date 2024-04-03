import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las posiciones que tendrá este Array");
        int p = sc.nextInt();
        int [] miArray = new int[p];

        for(int i = 0 ; i < p ; i++){
            System.out.print("Intrduzca el número " + (i+1) +": ");
            miArray[i] = sc.nextInt();
        }

        int mayor = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;
        int suma = 0;

        for(int i = 0; i < p; i++){
            int numero = miArray[i];

            if(numero <= mayor){
                mayor = numero;
            }
            if (numero >= menor){
                menor = numero;
            }
            suma += numero;
        }

        double media = (double) suma / p;

        int contarMax = 0;
        int contarMin = 0;

        for (int i = 0 ; i < p; i++){
            if (miArray[i] == mayor){
                contarMax++;
            }
            if (miArray[i] == menor){
                contarMin++;
            }
        }

        System.out.printf("El mayor número introducido es: %d. Se repite %d veces.\n" , mayor, contarMax);
        System.out.printf("El menor número introducido es: %d. Se repite %d veces.\n", menor, contarMin);
        System.out.printf("La media de los números es: %f ", media);
    }

}

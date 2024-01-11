import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase con numeros");
        String cadena = scanner.nextLine();

        System.out.println("El total de la suma es " + sumarNumerosDeUnaFrase(cadena));
    }
    public static int sumarNumerosDeUnaFrase(String cadena){
        int acumulador = 0;
        int numeroActual = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (Character.isDigit(cadena.charAt(i))){
                numeroActual = numeroActual * 10  + Integer.parseInt(cadena.charAt(i) + "");
            } else {
                if (numeroActual > 0){
                    acumulador += numeroActual;
                    numeroActual = 0;
                }
            }
        }
        return acumulador + numeroActual;
    }
}

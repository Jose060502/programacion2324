// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio1 {
    public static void main (String [] args){
        int[][] matriz = {
                {1, 2, 3},
                {4, -5, 6},
                {7, 8, 9}
        };
        boolean hayNegativo = hayValorNegativo(matriz);

        System.out.println("¿Hay algún valor negativo en la matriz? " + hayNegativo);
    }

    public static boolean hayValorNegativo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
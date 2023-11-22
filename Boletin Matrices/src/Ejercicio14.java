public class Ejercicio14 {
    public static void main (String [] args){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        imprimirMatriz(obtenerMatrizTranspuesta(matriz));
    }
    public static int[][] obtenerMatrizTranspuesta(int [][]matriz) {

        int [][] matrizTranspuesta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++ ){
            for (int j = 0; j < matriz[0].length; j++){
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

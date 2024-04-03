public class Ejercicio16 {
    public static void main(String[] args) {
        int[][] miMatriz ={{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {3, 2, 1, 4, 5}, {9, 5, 8, 6, 7}, {0, 9, 8, 5, 4}};
        imprimirMatriz(miMatriz);

        int[][] posPares = casillasPares(miMatriz);
        imprimirMatriz(posPares);
    }

    public static int[][] casillasPares(int[][] matriz) {
        int[][] matrizPares = new int[matriz.length][matriz[0].length];
        int contandoPares = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz[0].length; colum++) {

                for (int fila2 = fila - 1; fila2 < fila + 2; fila2++) {
                    for (int colum2 = colum - 1; colum2 < colum + 2; colum2++) {

                        if (fila2 >= 0 && colum2 >= 0 && fila2 < matriz.length && colum2 < matriz[0].length) {

                            if (matriz[fila2][colum2] % 2 == 0) {
                                contandoPares++;
                            }

                        }
                    }
                }
                if (matriz[fila][colum] % 2 == 0) {
                    contandoPares--;
                }

                matrizPares[fila][colum] = contandoPares;
                contandoPares = 0;
            }
        }

        return matrizPares;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.print("\nLa salida es:\n");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz[0].length; colum++) {

                System.out.printf(" %2d", matriz[fila][colum]);
            }
            System.out.println();
        }
    }
}

public class Ejercicio6 {
    public static void main (String [] args){
        int [][] matriz = {
                {1,1,3},
                {4,5,7}
        };
        leerMatrizPorFilasInversa(matriz);
    }
    public static void leerMatrizPorFilasInversa(int [][] a){
        for (int j = a[0].length -1; j>= 0; j-- ) {
            for (int i = a.length -1; i >= 0; i--) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}

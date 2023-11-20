public class Ejercicio4 {
    public static void main (String [] args){
        int [][] matriz = {
                {1,1,3},
                {4,5,7}
        };
        leerMatrizInversa(matriz);
    }
    public static void leerMatrizInversa(int [][] a){
        for (int i = a.length -1; i>= 0; i-- ) {
            for (int j = a[i].length -1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}

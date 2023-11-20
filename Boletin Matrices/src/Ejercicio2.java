public class Ejercicio2 {
    public static void main (String [] args){
        int [][] matriz = {
                {1,1,3},
                {4,5,7}
        };
        System.out.println(sumaDeMatriz(matriz));
    }

    public static int sumaDeMatriz(int [][] matriz){
        int suma = 0;
        for(int i = 0 ; i < matriz.length; i++){
            for (int j = 0 ; j < matriz[0].length; j++){
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}

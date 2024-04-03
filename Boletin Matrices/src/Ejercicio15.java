import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30}
        };

        int fila;
        do {
            System.out.printf("Introduce la fila empezando en 0 (la matriz tiene %d filas): ", matriz.length);
            fila = teclado.nextInt();
        } while (fila < -1 || fila >= matriz.length);

        int columna;
        do {
            System.out.printf("Introduce la columna empezando en 0 (la matriz tiene %d columnas): ", matriz[0].length);
            columna = teclado.nextInt();
        } while (columna < -1 || columna >= matriz[0].length);

        int posicion = obtenerPosicion(matriz, fila, columna);
        System.out.printf("Esta entre las casillas %d y %d. La posición que ocupa es: %d", fila, columna, posicion);
    }

    public static int obtenerPosicion(int[][] matriz, int fila, int columna) {
        return (fila * matriz[0].length) + columna + 1;
    }
}


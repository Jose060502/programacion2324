import java.util.Scanner;

public class Laberinto {
    private static final String MENSAJE_MOVIMIENTO_PROHIBIDO = "No puedes moverte ahí";

    private static char[][] LABERINTO = {
            {'X','X','X','X',' ','X','X','X','X','X','X'},
            {'X',' ',' ','X',' ',' ','X',' ',' ',' ','X'},
            {'X',' ','X',' ','X',' ',' ',' ','X',' ','X'},
            {'X',' ',' ',' ','X','X','X','X',' ',' ','X'},
            {'X',' ','X',' ',' ',' ','X',' ',' ','X','X'},
            {'X','X',' ','X','X',' ',' ',' ','X',' ','X'},
            {'X','X',' ','X',' ',' ','X',' ',' ','X','X'},
            {'X',' ',' ',' ','X','X',' ','X',' ','X','X'},
            {'X',' ','X',' ','X',' ',' ',' ',' ',' ','X'},
            {'X',' ','X',' ',' ',' ',' ',' ',' ',' ','X'},
            {'X','X','X','X','X',' ','X','X','X','X','X'}

    };
    private static Scanner sc;
    private static final char IZQUIERDA = 'A';
    private static final char DERECHA = 'D';
    private static final char ARRIBA = 'W';
    private static final char ABAJO = 'S';
    private static final char OBSTACULO = 'X';
    private static final int COLUMNA_INICIAL = 5;
    private static final int FILA_INICIAL = 10;
    private static final int COLUMNA_SALIDA = 4;
    private static final int FILA_SALIDA = 0;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        // Inicializamos a la posición inicial
        int fila = FILA_INICIAL;
        int col = COLUMNA_INICIAL;

        // La variable salida marcará cuándo el jugador llega a la casilla de salida
        boolean salida = false;

        // Mientras el juego no se termine
        while (!salida) {
            // Pintamos la matriz
            Laberinto.dibujaMatriz(LABERINTO, fila, col);

            // Solicitamos al usuario dónde moverse
            char opcion = solicitaMovimiento();

            switch (opcion) {
                /*
                 * En todos los siguientes casos hay que asegurarse de dos cosas:
                 * - No podemos salirnos de los límites de la matriz
                 * - No podemos movernos sobre un obstáculo
                 */
                case IZQUIERDA: {
                    // Moverse a la izquierda es desplazarse una columna hacia la izquierda
                    if ((col - 1) >= 0 && LABERINTO[fila][col - 1] != OBSTACULO) {
                        col--;
                    }
                    else {
                        System.out.println(MENSAJE_MOVIMIENTO_PROHIBIDO);
                    }
                    break;
                }
                case DERECHA: {
                    // Moverse hacia la derecha es desplazarse una columna hacia la derecha
                    if ((col + 1) < LABERINTO[0].length && LABERINTO[fila][col + 1] != OBSTACULO) {
                        col++;
                    }
                    else {
                        System.out.println(MENSAJE_MOVIMIENTO_PROHIBIDO);
                    }
                    break;
                }
                case ARRIBA: {
                    // Moverse hacia arriba es decrementar una fila
                    if ((fila - 1) >= 0 && LABERINTO[fila - 1][col] != OBSTACULO) {
                        fila--;
                    }
                    else {
                        System.out.println(MENSAJE_MOVIMIENTO_PROHIBIDO);
                    }
                    break;
                }
                case ABAJO: {
                    // Moverse hacia abajo es incrementar una fila
                    if ((fila + 1) < LABERINTO.length && LABERINTO[fila + 1][col] != OBSTACULO) {
                        fila++;
                    }
                    else {
                        System.out.println(MENSAJE_MOVIMIENTO_PROHIBIDO);
                    }
                    break;
                }
            } // fin switch

            /*
             * Ahora ya sabemos la nueva posición (si es que se ha podido mover)
             * Vamos a comprobar ahora si está en la salida
             */
            if (col == COLUMNA_SALIDA && fila == FILA_SALIDA) {
                // Hemos llegado a la salida. Pintamos por última vez el laberinto, felicitamos y salimos
                salida = true;
                Laberinto.dibujaMatriz(LABERINTO, fila, col);
                System.out.println("Felicidades, conseguiste salir del laberinto");

            }

        }

        // Por último cerramos el teclado
        sc.close();

    }

    /**
     * Pide al usuario dónde moverse. Si la respuesta no es válida, vuelve a repetir
     * @return char con la letra introducida
     */
    public static char solicitaMovimiento() {
        // Como valor por defecto ponemos un carácter inválido
        char opcion = '-';

        do {
            System.out.println("¿Hacia dónde quieres moverte?");
            System.out.print(IZQUIERDA + ": Izquierda, " + DERECHA +": Derecha, " + ARRIBA + ": Arriba, " + ABAJO + ": Abajo: ");
            String entrada = sc.nextLine();
            if (entrada.length() > 0) {
                opcion = entrada.toUpperCase().charAt(0);
            }
            else {
                continue;
            }
        } while (opcion != IZQUIERDA && opcion != DERECHA && opcion != ARRIBA && opcion != ABAJO);

        return opcion;
    }

    /**
     *
     * @param matriz que representa el laberinto
     * @param y fila donde se encuentra el usuario
     * @param x columna donde se encuentra el usuario
     */
    public static void dibujaMatriz(char[][] matriz, int y, int x) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == y && j == x) {
                    System.out.print(" " + 'O');
                }
                else {
                    System.out.print(" " + matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

}

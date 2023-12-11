package Cartas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Juego de Cartas");

        // Crear el juego
        Juego juego = new Juego();

        int opcion;
        do {
            // Mostrar el menú
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar Baraja");
            System.out.println("2. Barajar la Baraja");
            System.out.println("3. Repartir Cartas");
            System.out.println("4. Mostrar Cartas Restantes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar Baraja
                    System.out.println("\nBaraja:");
                    juego.mostrarBaraja();
                    break;

                case 2:
                    // Barajar la Baraja
                    System.out.println("\nBarajando la Baraja...");
                    juego.barajar();
                    break;

                case 3:
                    // Repartir Cartas
                    System.out.print("\nNúmero de jugadores: ");
                    int numJugadores = scanner.nextInt();
                    System.out.print("Número de cartas por jugador: ");
                    int numCartas = scanner.nextInt();

                    System.out.println("\nRepartiendo Cartas...");
                    juego.repartir(numJugadores, numCartas);
                    break;

                case 4:
                    // Mostrar Cartas Restantes
                    System.out.println("\nCartas Restantes en la Baraja: " + juego.cartasRestantes());
                    break;

                case 0:
                    // Salir
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}

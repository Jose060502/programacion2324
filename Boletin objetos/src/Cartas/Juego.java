package Cartas;

import java.util.Random;

public class Juego {
    private Carta[] baraja;
    private int cartasRestantes;

    public Juego() {
        inicializarBaraja();
        cartasRestantes = baraja.length;
    }

    private void inicializarBaraja() {
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] numeros = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int totalCartas = palos.length * numeros.length;
        baraja = new Carta[totalCartas];

        int index = 0;
        for (String palo : palos) {
            for (String numero : numeros) {
                baraja[index++] = new Carta(palo, numero);
            }
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }

    public void barajar() {
        Random random = new Random();

        for (int i = baraja.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            Carta temp = baraja[i];
            baraja[i] = baraja[j];
            baraja[j] = temp;
        }
    }

    public void repartir(int numJugadores, int numCartas) {
        int totalCartasRepartir = numJugadores * numCartas;

        if (totalCartasRepartir > cartasRestantes) {
            System.out.println("Error: No hay cartas suficientes para repartir a todos los jugadores.");
            return;
        }

        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Jugador " + (i + 1) + ":");
            for (int j = 0; j < numCartas; j++) {
                Carta carta = baraja[baraja.length - cartasRestantes];
                System.out.println("  " + carta);
                cartasRestantes--;
            }
            System.out.println();
        }
    }

    public int cartasRestantes() {
        return cartasRestantes;
    }
}

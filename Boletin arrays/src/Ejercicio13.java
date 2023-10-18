import java.util.Scanner;

public class Ejercicio13 {
    public static int[] pila;
    public static int numElem = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opciones;
        int numUsuario;

        pila = new int[10];
        System.out.println("Introduzca el primer número");
        pila[0] = sc.nextInt();
        sc.nextLine();

        do {
            System.out.println("Quieres apilar un número 'apilar'");
            System.out.println("Quieres desapilar el último introducido 'desapilar'");
            System.out.println("Introduce 'salir' para finalizar el programa.");
            opciones = sc.nextLine();

            if (numElem < 10 && opciones.equals("apilar")) {
                System.out.println("\nIntroduzca el número a añadir");
                numUsuario = sc.nextInt();
                sc.nextLine();
                apilado(numUsuario);
                mostrarPila();
            } else if (numElem > 0 && opciones.equals("desapilar")) {
                desapilado();
                mostrarPila();
            } else if (numElem == 10 && opciones.equals("apilar")) {
                System.out.println("La pila está completa, no puedes apilar más.");
            } else if (numElem == 0 && opciones.equals("desapilar")) {
                System.out.println("La pila está vacia, no puedes desapilar más.");
            }
        } while (!opciones.equals("salir"));
        sc.close();

    }

    public static void desapilado() {
        System.out.println("El último elemento de la pila se ha eliminado.");
        numElem--;

        if (numElem == 0) {
            System.out.println("No hay elementos en la pila.");
        } else {
            System.out.print("Pila -> [" + pila[0]);
            for (int elem = 1; elem < numElem; elem++) {
                System.out.print(", " + pila[elem]);
            }
            System.out.println("]");
        }
    }

    public static void apilado(int num) {
        pila[numElem] = num;
        numElem++;

        System.out.print("Pila -> [" + pila[0]);
        for (int elem = 1; elem < numElem; elem++) {
            System.out.print(", " + pila[elem]);
        }
        System.out.println("]");
    }

    public static void mostrarPila() {
        if (numElem == 0) {
            System.out.println("No hay elementos en la pila.");
        } else {
            System.out.print("Pila -> [");
            for (int elem = 1; elem < numElem; elem++) {
                System.out.print(pila[elem]);
                if (elem < numElem - 1){
                    System.out.println(", ");
                }
            }
            System.out.println("]");
        }
    }
}

package MaquinaCafe;

import java.util.Scanner;

public class MiEntradaSalida {
    public static Scanner sc = new Scanner(System.in);

    /**
     * Lee un entero comprendido entre el mínimo y el máximo (incluidos)
     *
     * @param min
     * @param max
     * @return El número leido
     */
    public static int leerEnteroDeRango(String mensaje, int min, int max) {
        if (min >= max) {
            // TODO: Hacer cuando conozcamos las excepciones
        }

        System.out.println(mensaje + ": ");

        int numeroLeido;
        do {
            numeroLeido = Integer.parseInt(sc.nextLine());
            if (numeroLeido < min || numeroLeido > max) {
                System.out.printf("Por favor, introduce un valor entre %d y %d: ", min, max);
            }
        } while (numeroLeido < min || numeroLeido > max);

        return numeroLeido;
    }

    public static int leerEntero(String mensaje) {
        System.out.println(mensaje + ": ");

        // TODO: Controlar excepciones

        return Integer.parseInt(sc.nextLine());
    }

    public static void cerrarScanner() {
        sc.close();
    }

    public static int leerEnteroPositivo(String mensaje) {
        System.out.printf(mensaje + ": ");
        int num;

        //TODO: Controlar excepción
        do {
            num = Integer.parseInt(sc.nextLine());
            if (num <= 0) {
                System.out.println("Introduce un número entero mayor que 0");
            }
        } while (num <= 0);

        return num;

    }
    public static double leerDoublePositivo(String mensaje) {
        System.out.printf(mensaje + ": ");
        double num;

        //TODO: Controlar excepción
        do {
            num = Double.parseDouble(sc.nextLine());
            if (num <= 0) {
                System.out.println("Introduce un número entero mayor que 0");
            }
        } while (num <= 0);

        return num;

    }

    public static String leerString(String mensaje) {
        System.out.printf(mensaje + ": ");
        return sc.nextLine();
    }
}


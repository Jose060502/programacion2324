package Ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salidaEj3.txt", true))) {
            System.out.println("Ingrese líneas para agregar al archivo (escriba 'fin' para terminar):");
            String linea;
            while (!(linea = scanner.nextLine()).equals("fin")) {
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Se han agregado las líneas al archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}

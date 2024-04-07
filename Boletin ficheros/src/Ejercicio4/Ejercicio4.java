package Ejercicio4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener la ruta del archivo
        Path archivo = Paths.get("salidaEj3.txt");

        try {
            // Crear el archivo si no existe
            if (!Files.exists(archivo)) {
                Files.createFile(archivo);
            }

            // Abrir el archivo en modo de escritura, sin sobrescribir el contenido existente
            // Se utiliza StandardOpenOption.APPEND para agregar al final del archivo
            try {
                while (true) {
                    System.out.println("Ingrese una línea para agregar al archivo ('fin' para terminar):");
                    String linea = scanner.nextLine();

                    if (linea.equals("fin")) {
                        break;
                    }

                    // Agregar la línea al archivo
                    Files.write(archivo, (linea + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

                    System.out.println("Línea agregada al archivo.");
                }
            } finally {
                scanner.close();
            }

            System.out.println("Se han agregado todas las líneas al archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

package Ejercicio5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear directorio");
            System.out.println("2. Crear fichero de texto");
            System.out.println("3. Borrar fichero de texto");
            System.out.println("4. Mostrar los ficheros que contiene una carpeta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    crearDirectorio(scanner);
                    break;
                case 2:
                    crearFicheroTexto(scanner);
                    break;
                case 3:
                    borrarFicheroTexto(scanner);
                    break;
                case 4:
                    mostrarFicherosEnCarpeta(scanner);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void crearDirectorio(Scanner scanner) {
        System.out.print("Ingrese el nombre del directorio a crear: ");
        String nombreDirectorio = scanner.nextLine();
        File directorio = new File(nombreDirectorio);

        if (directorio.exists()) {
            System.out.println("El directorio ya existe.");
        } else {
            if (directorio.mkdir()) {
                System.out.println("Directorio creado correctamente.");
            } else {
                System.out.println("No se pudo crear el directorio.");
            }
        }
    }

    private static void crearFicheroTexto(Scanner scanner) {
        System.out.print("Ingrese el nombre del fichero de texto a crear: ");
        String nombreFichero = scanner.nextLine();
        File fichero = new File(nombreFichero);

        if (fichero.exists()) {
            System.out.println("El fichero ya existe.");
        } else {
            try {
                System.out.print("Ingrese el contenido del fichero: ");
                String contenido = scanner.nextLine();
                FileWriter writer = new FileWriter(fichero);
                writer.write(contenido);
                writer.close();
                System.out.println("Fichero de texto creado correctamente.");
            } catch (IOException e) {
                System.out.println("Error al crear el fichero de texto: " + e.getMessage());
            }
        }
    }

    private static void borrarFicheroTexto(Scanner scanner) {
        System.out.print("Ingrese el nombre del fichero de texto a borrar: ");
        String nombreFichero = scanner.nextLine();
        File fichero = new File(nombreFichero);

        if (fichero.exists()) {
            if (fichero.delete()) {
                System.out.println("Fichero de texto borrado correctamente.");
            } else {
                System.out.println("No se pudo borrar el fichero de texto.");
            }
        } else {
            System.out.println("El fichero de texto no existe.");
        }
    }

    private static void mostrarFicherosEnCarpeta(Scanner scanner) {
        System.out.print("Ingrese el nombre de la carpeta: ");
        String nombreCarpeta = scanner.nextLine();
        File carpeta = new File(nombreCarpeta);

        if (carpeta.exists() && carpeta.isDirectory()) {
            File[] ficheros = carpeta.listFiles();
            if (ficheros != null && ficheros.length > 0) {
                Arrays.sort(ficheros);
                System.out.println("Ficheros en la carpeta " + carpeta.getName() + ":");
                for (File fichero : ficheros) {
                    if (fichero.isFile()) {
                        System.out.println(fichero.getName());
                    }
                }
            } else {
                System.out.println("La carpeta está vacía.");
            }
        } else {
            System.out.println("La carpeta no existe o no es válida.");
        }
    }
}

package Ejercicio7;

import java.io.File;
import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Listar directorio");
            System.out.println("2. Listar directorio y buscar ficheros que comiencen por una palabra");
            System.out.println("3. Listar archivos con cierta extensión de un directorio");
            System.out.println("4. Buscar un archivo en un directorio");
            System.out.println("5. Buscar recursivamente un archivo en un directorio");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    listarDirectorio(scanner);
                    break;
                case 2:
                    listarDirectorioConPrefijo(scanner);
                    break;
                case 3:
                    listarArchivosPorExtension(scanner);
                    break;
                case 4:
                    buscarArchivoEnDirectorio(scanner, false);
                    break;
                case 5:
                    buscarArchivoEnDirectorio(scanner, true);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void listarDirectorio(Scanner scanner) {
        System.out.print("Ingrese el nombre del directorio: ");
        String nombreDirectorio = scanner.nextLine();
        File directorio = new File(nombreDirectorio);

        if (directorio.exists() && directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isDirectory()) {
                        System.out.println(archivo.getName() + " (Directorio)");
                    } else {
                        System.out.println(archivo.getName() + " (" + archivo.length() / 1024 + " KB)");
                    }
                }
            }
        } else {
            System.out.println("El directorio no existe o no es válido.");
        }
    }

    private static void listarDirectorioConPrefijo(Scanner scanner) {
        System.out.print("Ingrese el nombre del directorio: ");
        String nombreDirectorio = scanner.nextLine();
        System.out.print("Ingrese el prefijo para la búsqueda: ");
        String prefijo = scanner.nextLine();
        File directorio = new File(nombreDirectorio);

        if (directorio.exists() && directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.getName().startsWith(prefijo)) {
                        if (archivo.isDirectory()) {
                            System.out.println(archivo.getName() + " (Directorio)");
                        } else {
                            System.out.println(archivo.getName() + " (" + archivo.length() / 1024 + " KB)");
                        }
                    }
                }
            }
        } else {
            System.out.println("El directorio no existe o no es válido.");
        }
    }

    private static void listarArchivosPorExtension(Scanner scanner) {
        System.out.print("Ingrese el nombre del directorio: ");
        String nombreDirectorio = scanner.nextLine();
        System.out.print("Ingrese la extensión de archivo a buscar (sin el punto): ");
        String extension = scanner.nextLine();
        File directorio = new File(nombreDirectorio);

        if (directorio.exists() && directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile() && archivo.getName().endsWith("." + extension)) {
                        System.out.println(archivo.getName() + " (" + archivo.length() / 1024 + " KB)");
                    }
                }
            }
        } else {
            System.out.println("El directorio no existe o no es válido.");
        }
    }

    private static void buscarArchivoEnDirectorio(Scanner scanner, boolean recursivo) {
        System.out.print("Ingrese el nombre del directorio: ");
        String nombreDirectorio = scanner.nextLine();
        System.out.print("Ingrese el nombre del archivo a buscar: ");
        String nombreArchivo = scanner.nextLine();
        File directorio = new File(nombreDirectorio);

        if (directorio.exists() && directorio.isDirectory()) {
            buscarArchivo(directorio, nombreArchivo, recursivo);
        } else {
            System.out.println("El directorio no existe o no es válido.");
        }
    }

    private static void buscarArchivo(File directorio, String nombreArchivo, boolean recursivo) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().equals(nombreArchivo)) {
                    System.out.println("Ruta del archivo encontrado: " + archivo.getAbsolutePath() +
                            " (" + archivo.length() / 1024 + " KB)");
                } else if (archivo.isDirectory() && recursivo) {
                    buscarArchivo(archivo, nombreArchivo, true);
                }
            }
        }
    }
}


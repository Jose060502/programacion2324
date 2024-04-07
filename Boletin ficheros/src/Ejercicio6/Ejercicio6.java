package Ejercicio6;

import java.io.File;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Verificar que se proporcione un argumento (nombre del directorio)
        if (args.length != 1) {
            System.out.println("Uso: java MostrarArchivosDirectorio <nombre_directorio>");
            return;
        }

        // Obtener el nombre del directorio de los argumentos de la línea de comandos
        String nombreDirectorio = args[0];

        // Crear un objeto File para representar el directorio
        File directorio = new File(nombreDirectorio);

        // Verificar que el directorio exista y sea un directorio válido
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("El directorio especificado no existe o no es válido.");
            return;
        }

        // Obtener la lista de archivos en el directorio
        File[] archivos = directorio.listFiles();

        // Mostrar los archivos y su tamaño en KB
        System.out.println("Archivos en el directorio " + nombreDirectorio + ":");
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    long tamanoKB = archivo.length() / 1024;
                    System.out.println(archivo.getName() + " - Tamaño: " + tamanoKB + " KB");
                }
            }
        }
    }
}

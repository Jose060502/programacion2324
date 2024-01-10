// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Hola como estas";
        char caracterBuscado = 'o';

        int resultado = contarCaracteres(cadena, caracterBuscado);

        System.out.println("El carácter '" + caracterBuscado + "' aparece " + resultado + " veces en la cadena.");
    }

    public static int contarCaracteres(String cadena, char caracter) {
        int contador = 0;

        // Iterar sobre la cadena y contar las ocurrencias del carácter
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.toLowerCase().charAt(i) == Character.toLowerCase(caracter)) {
                contador++;
            }
        }

        return contador;
    }
}

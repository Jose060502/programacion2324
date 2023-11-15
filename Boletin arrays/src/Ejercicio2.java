public class Ejercicio2 {
    public static void main(String[] args) {
        // Ejemplo de un array de enteros
        int[] array = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10};

        // Llamada a la función para contar números negativos
        int cantidadNegativos = contarNegativos(array);

        // Mostrar el resultado
        System.out.println("La cantidad de números negativos en el array es: " + cantidadNegativos);
    }

    // Función para contar números negativos en un array
    public static int contarNegativos(int[] array) {
        int count = 0;

        // Iterar a través del array y contar los números negativos
        for (int numero : array) {
            if (numero < 0) {
                count++;
            }
        }

        return count;
    }
}

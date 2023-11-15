public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejemplo de un array de enteros
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Llamada a la función para sumar posiciones pares
        int resultado = sumarPosicionesPares(array);

        // Mostrar el resultado
        System.out.println("La suma de las posiciones pares es: " + resultado);
    }

    // Función para sumar posiciones pares de un array
    public static int sumarPosicionesPares(int[] array) {
        int suma = 0;

        // Iterar a través de las posiciones pares del array
        for (int i = 0; i < array.length; i += 2) {
            suma += array[i];
        }

        return suma;
    }
}

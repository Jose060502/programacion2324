public class Ejercicio8 {
    public static void main(String[] args) {
        // Ejemplo de uso del método buscarPosicion
        int[] array = {1, 2, 3, 4, 5};
        int valorABuscar = 3;

        // Llamada al método y muestra del resultado
        int posicion = buscarPosicion(array, valorABuscar);
        if (posicion != -1) {
            System.out.println("El valor " + valorABuscar + " se encuentra en la posición " + posicion + " del array.");
        } else {
            System.out.println("El valor " + valorABuscar + " no se encuentra en el array.");
        }
    }

    // Método para buscar la posición de un valor en un array
    // Devuelve -1 si el valor no se encuentra en el array
    public static int buscarPosicion(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i; // Devuelve la posición si encuentra el valor
            }
        }
        return -1; // Devuelve -1 si el valor no se encuentra en el array
    }
}

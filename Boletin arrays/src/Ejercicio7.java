public class Ejercicio7 {
    public static void main(String[] args) {
        // Ejemplo de uso del método contieneElemento
        int[] array = {1, 2, 3, 4, 5};
        int elementoABuscar = 3;

        // Llamada al método y muestra del resultado
        if (contieneElemento(array, elementoABuscar)) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el array.");
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el array.");
        }
    }

    // Método para comprobar si un array contiene un determinado elemento
    public static boolean contieneElemento(int[] array, int elemento) {
        for (int num : array) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }
}

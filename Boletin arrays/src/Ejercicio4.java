import java.util.Random;

public class Ejercicio4 {
        public static final int CANTIDAD_NUMEROS = 6000;
        public static void main(String[] args) {
            // Constante para fijar la cantidad de números aleatorios


            // Crear un array para almacenar los números aleatorios
            int[] numerosAleatorios = new int[CANTIDAD_NUMEROS];

            // Llenar el array con números aleatorios de 0 a 100
            Random rand = new Random();
            for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
                numerosAleatorios[i] = rand.nextInt(101);
            }

            // Calcular la media de los números leídos
            double media = calcularMedia(numerosAleatorios);

            // Calcular estadísticas de los dígitos
            calcularEstadisticasDigitos(numerosAleatorios);

            // Mostrar la media
            System.out.println("La media de los números leídos es: " + media);

        }

        // Función para calcular la media de un array de enteros
        private static double calcularMedia(int[] array) {
            int suma = 0;
            for (int num : array) {
                suma += num;
            }
            return (double) suma / array.length;
        }

        // Función para calcular estadísticas de los dígitos en un array de enteros
        private static void calcularEstadisticasDigitos(int[] array) {
            int[] contadorDigitos = new int[10];

            // Contar la cantidad de veces que termina cada número en un dígito
            for (int num : array) {
                int ultimoDigito = num % 10;
                contadorDigitos[ultimoDigito]++;
            }

            // Calcular y mostrar los porcentajes
            double sumaPorcentajes = 0;

            for (int i = 0; i < contadorDigitos.length; i++) {
                double porcentaje = (double) contadorDigitos[i] / array.length * 100;
                sumaPorcentajes += porcentaje;

                System.out.println("El nº " + i + " se ha repetido " + contadorDigitos[i] +
                        " veces. Esto equivale a un " + String.format("%.2f", porcentaje) + "%");
            }

            // Calcular y mostrar la suma de los porcentajes y el % medio
            System.out.println("La suma de todos los porcentajes es equivalente al 100.00%. El % medio para cada contador es de " +
                    String.format("%.2f", sumaPorcentajes / 10) + "%.");
        }
}



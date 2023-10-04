public class Ejercicio1 {
    public static void main(String[] args) {

        for (int numero = 1 ; numero <= 100 ; numero++){
            if (numero % 7 == 0){
                System.out.println("El número "+ numero +" es múltiplo de 7");
            }

            if (numero % 13 == 0){
                System.out.println("El número "+ numero +" es múltiplo de 13");
            }
        }

    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] miArray = {2,56,3,1,78,94, 85,33,15,25};

        int suma = 0;

        for(int i = 0; i < miArray.length; i++){
            if (i % 2 == 0){
                suma += miArray[i];
            }
        }

        System.out.printf("La suma de las posiciones pares es %d" , suma);
    }
}
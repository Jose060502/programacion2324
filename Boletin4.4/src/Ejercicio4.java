import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la frase:");
        String texto = scanner.nextLine();

        System.out.println("Palabra escondida:");
        String palabraBuscada = scanner.nextLine();

        if (buscarPalabra(texto, palabraBuscada)) {
            System.out.println("Palabra encontrada");
        } else {
            System.out.println("No se encuentra");
        }

        scanner.close();
    }

    public static boolean buscarPalabra(String texto, String palabraBuscada) {
        int indicePalabraEncontrada = 0;
        texto = texto.toLowerCase();
        palabraBuscada = palabraBuscada.toLowerCase();
        for(int i = 0; i < texto.length(); i++){
           if(texto.charAt(i) == palabraBuscada.charAt(indicePalabraEncontrada)){
               indicePalabraEncontrada++;
           }
           if (indicePalabraEncontrada == palabraBuscada.length()){
               break;
           }
        }
        return indicePalabraEncontrada == palabraBuscada.length();
    }
}

import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu comida rápida favorita");
        String comida = sc.nextLine();

        switch (comida){
            case "Hamburguesa" :
                System.out.println("Amante de la carne");
                break;
            case "Pizza":
                System.out.println("Amante del queso");
                break;
            case "Ensalada":
                System.out.println("Amante de la comida saludable");
                break;
            case "Tacos":
                System.out.println("Amante de la comida mexicana");
                break;
        }
    }
}

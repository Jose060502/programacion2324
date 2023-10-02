import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nivel");
        int nivel = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce las misiones completadas");
        int misiones = Integer.parseInt(sc.nextLine());
        if (nivel > 10 && misiones < 25) {
            System.out.println("Tienes el nivel y las misiones necesarias");
        } else {
            System.out.println("No tienes los requisitos necesarios para completar la misión");
        }
    }

}

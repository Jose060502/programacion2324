import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce la primera nota del examen");
        double examen1 = Double.parseDouble(sc.nextLine());
        System.out.println("introduce la segunda nota del examen");
        double examen2 = Double.parseDouble(sc.nextLine());
        System.out.println("introduce la tercera nota del examen");
        double examen3 = Double.parseDouble(sc.nextLine());

        double promedio = (examen1 + examen2 + examen3) / 3;
        System.out.println("Tu promedio es: " + promedio);
    }
}

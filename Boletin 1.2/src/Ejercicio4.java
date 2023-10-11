import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        double km, vel;
        int horas, min , seg;

        System.out.println("Dime a que distancia estas de tu destino: ");
        km = Double.parseDouble(scanner.nextLine());
        System.out.println("\nDime a la velocidad que vas: ");
        vel = Double.parseDouble(scanner.nextLine());
        double tiempo = km/vel;

        System.out.println(tiempo);
        horas = (int)tiempo;
        min = (int)((tiempo-horas)*60);
        seg=(int)(((tiempo*60) - (horas*60) - min)*60);
        System.out.printf("%d:%d:%d", horas , min , seg);

        scanner.close();
    }
}

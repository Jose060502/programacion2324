import java.util.Scanner;

public class Ejercicio2{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los grados Celcius");
        double gradosCelcius = Double.parseDouble(sc.nextLine());

        sc.close();

        double gradosFahrenheit = (gradosCelcius * 9/5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + gradosFahrenheit);
    }
}

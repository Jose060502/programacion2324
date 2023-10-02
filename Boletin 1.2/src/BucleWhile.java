import java.util.Scanner;

public class BucleWhile {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para averiguar su primer divisor");
        int num = Integer.parseInt(sc.nextLine());
        int i = 2;
        while (i <= num) {

            if(num % i == 0){
                System.out.printf("El primer divisor de " + num + " es el número " + i);
                break;
            }
            i++;
        }
    }
}

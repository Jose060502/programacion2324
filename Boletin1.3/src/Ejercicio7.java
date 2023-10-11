import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        char estadoCivil;
        int edad;

        do {
            System.out.println("Introduce el estado civil de la persona");
            estadoCivil = sc.nextLine().charAt(0);
        } while (estadoCivil != 'S' && estadoCivil != 'D' && estadoCivil != 'C' && estadoCivil != 'V');
        do {
            System.out.println("Introduce la edad de la persona");
            edad = sc.nextInt();
        } while(edad < 18 || edad > 120);


        double porcentajeRetención;

        if ((estadoCivil == 'S' || estadoCivil == 'D') && edad < 35){
            porcentajeRetención = 12;
        } else if ((estadoCivil == 'C' || estadoCivil == 'V') && edad < 35) {
            porcentajeRetención = 11.3;
        }  else if(edad > 50){
            porcentajeRetención = 8.5;
        }else {
            porcentajeRetención = 10.5;
        }

        System.out.println("El porcenta de retención de impuestos es: " + porcentajeRetención + "%");
    }
}

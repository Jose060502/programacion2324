import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tipo de producto (A, B o C): ");
        String tipoProducto = sc.nextLine().toUpperCase();

        if (tipoProducto.equals("A") || tipoProducto.equals("B") || tipoProducto.equals("C")) {
            System.out.print("Introduce el precio original del producto: ");
            double precioOriginal = sc.nextDouble();

            double descuento;

            if (tipoProducto.equals("A")) {
                descuento = 0.07;
            } else if (tipoProducto.equals("C") || precioOriginal < 500) {
                descuento = 0.12;
            } else {
                descuento = 0.09;
            }

            double precioRebajado = precioOriginal * (1 - descuento);

            System.out.println("El precio rebajado es: " + precioRebajado + "€");
        } else {
            System.out.println("Tipo de producto no válido. Debe ser A, B o C.");
        }

        sc.close();
    }
}

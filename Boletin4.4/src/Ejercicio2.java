import java.util.Scanner;

public class Ejercicio2 {
    private String cadena;
    private int mayusculas;
    private int minusculas;
    private int numeros;

    public Ejercicio2(String cadena) {
        this.cadena = cadena;
        contarCaracteres();
    }

    public int getMayusculas() {
        return mayusculas;
    }

    public int getMinusculas() {
        return minusculas;
    }

    public int getNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        String cadena = "Voy a sacar un 10 en el examen de Sistemas Informaticos";
        Ejercicio2 caracteres = new Ejercicio2(cadena);
        System.out.println("En la frase hay " + caracteres.getMinusculas()+ " minusculas, "+ caracteres.getMayusculas() +" mayusuclas, " + caracteres.getNumeros() +" numeros."
        );
    }
    private void contarCaracteres() {

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                mayusculas++;
            } else if (Character.isLowerCase(cadena.charAt(i))) {
                minusculas++;
            } else if (Character.isDigit(cadena.charAt(i))) {
                numeros++;
            }
        }
    }

}

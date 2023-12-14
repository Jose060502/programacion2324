public class Abuela {
    //dada una frase "voy a ver a mi abuela" dime cuantas palabras de la
    //misma empiezan por "a".
    public static void main(String[] args) {
       String frase = "voy a ver a mi abuela";

        int indiceA = frase.indexOf('a');

        int contador = 0;

        while (indiceA != -1) {
            if (indiceA == 0 || frase.charAt(indiceA - 1) == ' ') {
                contador++;
            }
            indiceA = frase.indexOf('a', indiceA + 1);
        }

        System.out.println("Palabras que comienzan con la letra a son " + contador);
    }
}


